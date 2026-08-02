package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.A1;
import io.sentry.C7125b;
import io.sentry.C7165l;
import io.sentry.C7222x2;
import io.sentry.C7230z2;
import io.sentry.H2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import io.sentry.android.core.H;
import io.sentry.android.core.b0;
import io.sentry.protocol.C7188d;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public class TombstoneIntegration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f67013a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f67014b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f67015c;

    /* loaded from: classes.dex */
    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.j {

        /* renamed from: d, reason: collision with root package name */
        private final long f67016d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f67017e;

        public a(long j11, @NotNull ILogger iLogger, long j12, boolean z11) {
            super(j11, iLogger);
            this.f67016d = j12;
            this.f67017e = z11;
        }

        @Override // io.sentry.hints.j
        @NotNull
        public final Long a() {
            return Long.valueOf(this.f67016d);
        }

        @Override // io.sentry.hints.c
        public final boolean e() {
            return this.f67017e;
        }

        @Override // io.sentry.hints.f
        public final boolean f(io.sentry.protocol.t tVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public final void g(@NotNull io.sentry.protocol.t tVar) {
        }
    }

    public static class b implements H.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final SentryAndroidOptions f67018a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final b0 f67019b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final Context f67020c;

        public b(@NotNull Context context, @NotNull SentryAndroidOptions sentryAndroidOptions) {
            this.f67018a = sentryAndroidOptions;
            this.f67019b = new b0(sentryAndroidOptions);
            this.f67020c = context;
        }

        private C7230z2 e(long j11, C7230z2 c7230z2, io.sentry.E e11) {
            b0 b0Var = this.f67019b;
            b0.d d11 = b0Var.d(j11);
            C7230z2 c7230z22 = null;
            SentryAndroidOptions sentryAndroidOptions = this.f67018a;
            if (d11 == null) {
                sentryAndroidOptions.getLogger().c(I2.DEBUG, "No matching native event found for tombstone.", new Object[0]);
                return null;
            }
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "Found matching native event for tombstone, removing from outbox: %s", d11.c().getName());
            if (b0Var.b(d11)) {
                c7230z22 = d11.b();
                ArrayList n02 = c7230z2.n0();
                C7188d D11 = c7230z2.D();
                ArrayList s02 = c7230z2.s0();
                if (n02 != null && !n02.isEmpty() && D11 != null && s02 != null) {
                    io.sentry.protocol.l g10 = ((io.sentry.protocol.s) n02.get(0)).g();
                    if (g10 != null) {
                        g10.r(io.sentry.android.core.internal.tombstone.a.TOMBSTONE_MERGED.getValue());
                    }
                    if (c7230z22.q0() == null || c7230z22.q0().e() == null || c7230z22.q0().e().isEmpty()) {
                        c7230z22.B0(c7230z2.q0());
                    }
                    c7230z22.x0(n02);
                    c7230z22.R(D11);
                    c7230z22.D0(s02);
                }
                for (C7222x2 c7222x2 : d11.a().b()) {
                    try {
                        String c11 = c7222x2.p().c();
                        if (c7222x2.p().e() == H2.Attachment && c11 != null) {
                            e11.a(new C7125b(c7222x2.o(), c11, c7222x2.p().b(), c7222x2.p().a()));
                        }
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().c(I2.DEBUG, "Failed to process envelope item: %s", th2.getMessage());
                    }
                }
            }
            return c7230z22;
        }

        @Override // io.sentry.android.core.H.a
        public final int a() {
            return 5;
        }

        @Override // io.sentry.android.core.H.a
        public final Long b() {
            return io.sentry.android.core.cache.c.q(this.f67018a);
        }

        @Override // io.sentry.android.core.H.a
        public final boolean c() {
            return this.f67018a.isReportHistoricalTombstones();
        }

        @Override // io.sentry.android.core.H.a
        public final H.b d(@NotNull ApplicationExitInfo applicationExitInfo, boolean z11) {
            long timestamp;
            InputStream traceInputStream;
            long timestamp2;
            long timestamp3;
            SentryAndroidOptions sentryAndroidOptions = this.f67018a;
            try {
                traceInputStream = applicationExitInfo.getTraceInputStream();
                if (traceInputStream == null) {
                    ILogger logger = sentryAndroidOptions.getLogger();
                    I2 i22 = I2.WARNING;
                    DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
                    timestamp3 = applicationExitInfo.getTimestamp();
                    logger.c(i22, "No tombstone InputStream available for ApplicationExitInfo from %s", dateTimeFormatter.format(Instant.ofEpochMilli(timestamp3)));
                    return null;
                }
                io.sentry.android.core.internal.tombstone.b bVar = new io.sentry.android.core.internal.tombstone.b(traceInputStream, sentryAndroidOptions.getInAppIncludes(), sentryAndroidOptions.getInAppExcludes(), this.f67020c.getApplicationInfo().nativeLibraryDir);
                try {
                    C7230z2 c11 = bVar.c();
                    bVar.close();
                    timestamp2 = applicationExitInfo.getTimestamp();
                    c11.E0(C7165l.c(timestamp2));
                    a aVar = new a(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp2, z11);
                    io.sentry.E a11 = io.sentry.util.h.a(aVar);
                    try {
                        C7230z2 e11 = e(timestamp2, c11, a11);
                        if (e11 != null) {
                            c11 = e11;
                        }
                    } catch (Throwable th2) {
                        sentryAndroidOptions.getLogger().c(I2.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th2.getMessage());
                    }
                    return new H.b(c11, a11, aVar);
                } finally {
                }
            } catch (Throwable th3) {
                ILogger logger2 = sentryAndroidOptions.getLogger();
                I2 i23 = I2.WARNING;
                DateTimeFormatter dateTimeFormatter2 = DateTimeFormatter.ISO_INSTANT;
                timestamp = applicationExitInfo.getTimestamp();
                logger2.c(i23, "Failed to parse tombstone from %s: %s", dateTimeFormatter2.format(Instant.ofEpochMilli(timestamp)), th3.getMessage());
                return null;
            }
        }

        @Override // io.sentry.android.core.H.a
        @NotNull
        public final String getLabel() {
            return "Tombstone";
        }
    }

    public TombstoneIntegration(@NotNull Context context) {
        io.sentry.transport.c a11 = io.sentry.transport.c.a();
        Context applicationContext = context.getApplicationContext();
        this.f67013a = applicationContext != null ? applicationContext : context;
        this.f67014b = a11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f67015c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f67015c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(I2.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.f67015c.isTombstoneEnabled()));
        if (this.f67015c.isTombstoneEnabled()) {
            if (this.f67015c.getCacheDirPath() == null) {
                this.f67015c.getLogger().c(I2.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                io.sentry.Z executorService = w22.getExecutorService();
                Context context = this.f67013a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f67015c;
                executorService.submit(new H(context, a12, sentryAndroidOptions2, this.f67014b, new b(context, sentryAndroidOptions2)));
            } catch (Throwable th2) {
                w22.getLogger().a(I2.DEBUG, "Failed to start tombstone processor.", th2);
            }
            w22.getLogger().c(I2.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.j.a("Tombstone");
        }
    }
}
