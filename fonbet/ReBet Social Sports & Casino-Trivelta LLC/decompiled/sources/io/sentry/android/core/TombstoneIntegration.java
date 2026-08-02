package io.sentry.android.core;

import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.AbstractC4779m;
import io.sentry.C4665a3;
import io.sentry.C4724b;
import io.sentry.C4733c3;
import io.sentry.EnumC4783m3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4839u0;
import io.sentry.android.core.N0;
import io.sentry.android.core.RunnableC4681h0;
import io.sentry.protocol.C4803e;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.time.Instant;
import java.time.format.DateTimeFormatter;
import java.util.List;
import org.jetbrains.annotations.ApiStatus;

@ApiStatus.Internal
/* loaded from: classes3.dex */
public class TombstoneIntegration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50841a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.o f50842b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50843c;

    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.j {

        /* renamed from: d, reason: collision with root package name */
        public final long f50844d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f50845e;

        public a(long j10, ILogger iLogger, long j11, boolean z10) {
            super(j10, iLogger);
            this.f50844d = j11;
            this.f50845e = z10;
        }

        @Override // io.sentry.hints.j
        public Long a() {
            return Long.valueOf(this.f50844d);
        }

        @Override // io.sentry.hints.c
        public boolean b() {
            return this.f50845e;
        }

        @Override // io.sentry.hints.f
        public boolean c(io.sentry.protocol.u uVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void d(io.sentry.protocol.u uVar) {
        }
    }

    public static class b implements RunnableC4681h0.a {

        /* renamed from: a, reason: collision with root package name */
        public final SentryAndroidOptions f50846a;

        /* renamed from: b, reason: collision with root package name */
        public final N0 f50847b;

        /* renamed from: c, reason: collision with root package name */
        public final Context f50848c;

        public b(SentryAndroidOptions sentryAndroidOptions, Context context) {
            this.f50846a = sentryAndroidOptions;
            this.f50847b = new N0(sentryAndroidOptions);
            this.f50848c = context;
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public Long a() {
            return io.sentry.android.core.cache.d.L(this.f50846a);
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public String b() {
            return "Tombstone";
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public boolean c() {
            return this.f50846a.isReportHistoricalTombstones();
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public RunnableC4681h0.b d(ApplicationExitInfo applicationExitInfo, boolean z10) {
            DateTimeFormatter dateTimeFormatter;
            long timestamp;
            Instant ofEpochMilli;
            String format;
            InputStream traceInputStream;
            long timestamp2;
            DateTimeFormatter dateTimeFormatter2;
            long timestamp3;
            Instant ofEpochMilli2;
            String format2;
            try {
                boolean isAttachRawTombstone = this.f50846a.isAttachRawTombstone();
                traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        ILogger logger = this.f50846a.getLogger();
                        EnumC4788n3 enumC4788n3 = EnumC4788n3.WARNING;
                        dateTimeFormatter2 = DateTimeFormatter.ISO_INSTANT;
                        timestamp3 = applicationExitInfo.getTimestamp();
                        ofEpochMilli2 = Instant.ofEpochMilli(timestamp3);
                        format2 = dateTimeFormatter2.format(ofEpochMilli2);
                        logger.c(enumC4788n3, "No tombstone InputStream available for ApplicationExitInfo from %s", format2);
                        if (traceInputStream == null) {
                            return null;
                        }
                        traceInputStream.close();
                        return null;
                    }
                    byte[] b10 = isAttachRawTombstone ? io.sentry.android.core.internal.util.s.b(traceInputStream) : null;
                    io.sentry.android.core.internal.tombstone.b bVar = new io.sentry.android.core.internal.tombstone.b(isAttachRawTombstone ? new ByteArrayInputStream(b10) : traceInputStream, this.f50846a.getInAppIncludes(), this.f50846a.getInAppExcludes(), this.f50848c.getApplicationInfo().nativeLibraryDir);
                    try {
                        C4733c3 A02 = bVar.A0();
                        bVar.close();
                        traceInputStream.close();
                        timestamp2 = applicationExitInfo.getTimestamp();
                        A02.G0(AbstractC4779m.d(timestamp2));
                        a aVar = new a(this.f50846a.getFlushTimeoutMillis(), this.f50846a.getLogger(), timestamp2, z10);
                        io.sentry.J c10 = io.sentry.util.l.c(aVar);
                        if (b10 != null) {
                            c10.q(C4724b.c(b10));
                        }
                        try {
                            C4733c3 h10 = h(timestamp2, A02, c10);
                            if (h10 != null) {
                                A02 = h10;
                            }
                        } catch (Throwable th2) {
                            this.f50846a.getLogger().c(EnumC4788n3.WARNING, "Failed to merge native event with tombstone, continuing without merge: %s", th2.getMessage());
                        }
                        return new RunnableC4681h0.b(A02, c10, aVar);
                    } finally {
                    }
                } finally {
                }
            } catch (Throwable th3) {
                ILogger logger2 = this.f50846a.getLogger();
                EnumC4788n3 enumC4788n32 = EnumC4788n3.WARNING;
                dateTimeFormatter = DateTimeFormatter.ISO_INSTANT;
                timestamp = applicationExitInfo.getTimestamp();
                ofEpochMilli = Instant.ofEpochMilli(timestamp);
                format = dateTimeFormatter.format(ofEpochMilli);
                logger2.c(enumC4788n32, "Failed to parse tombstone from %s: %s", format, th3.getMessage());
                return null;
            }
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public int e() {
            return 5;
        }

        public final void f(N0.d dVar, io.sentry.J j10) {
            for (C4665a3 c4665a3 : dVar.a().c()) {
                try {
                    String c10 = c4665a3.O().c();
                    if (c4665a3.O().e() == EnumC4783m3.Attachment && c10 != null) {
                        j10.a(new C4724b(c4665a3.M(), c10, c4665a3.O().b(), c4665a3.O().a(), false));
                    }
                } catch (Throwable th2) {
                    this.f50846a.getLogger().c(EnumC4788n3.DEBUG, "Failed to process envelope item: %s", th2.getMessage());
                }
            }
        }

        public final void g(C4733c3 c4733c3, C4733c3 c4733c32) {
            List p02 = c4733c32.p0();
            C4803e D10 = c4733c32.D();
            List u02 = c4733c32.u0();
            if (p02 == null || p02.isEmpty() || D10 == null || u02 == null) {
                return;
            }
            io.sentry.protocol.m g10 = ((io.sentry.protocol.t) p02.get(0)).g();
            if (g10 != null) {
                g10.r(io.sentry.android.core.internal.tombstone.a.TOMBSTONE_MERGED.getValue());
            }
            if (c4733c3.s0() == null || c4733c3.s0().e() == null || c4733c3.s0().e().isEmpty()) {
                c4733c3.D0(c4733c32.s0());
            }
            c4733c3.A0(p02);
            c4733c3.T(D10);
            c4733c3.F0(u02);
        }

        public final C4733c3 h(long j10, C4733c3 c4733c3, io.sentry.J j11) {
            N0.d f10 = this.f50847b.f(j10);
            if (f10 == null) {
                this.f50846a.getLogger().c(EnumC4788n3.DEBUG, "No matching native event found for tombstone.", new Object[0]);
                return null;
            }
            this.f50846a.getLogger().c(EnumC4788n3.DEBUG, "Found matching native event for tombstone, removing from outbox: %s", f10.c().getName());
            if (!this.f50847b.c(f10)) {
                return null;
            }
            C4733c3 b10 = f10.b();
            g(b10, c4733c3);
            f(f10, j11);
            return b10;
        }
    }

    public TombstoneIntegration(Context context) {
        this(context, io.sentry.transport.m.b());
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50843c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "TombstoneIntegration enabled: %s", Boolean.valueOf(this.f50843c.isTombstoneEnabled()));
        if (this.f50843c.isTombstoneEnabled()) {
            if (this.f50843c.getCacheDirPath() == null) {
                this.f50843c.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, unable to process Tombstones", new Object[0]);
                return;
            }
            try {
                InterfaceC4760i0 executorService = f32.getExecutorService();
                Context context = this.f50841a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f50843c;
                executorService.submit(new RunnableC4681h0(context, interfaceC4740e0, sentryAndroidOptions2, this.f50842b, new b(sentryAndroidOptions2, context)));
            } catch (Throwable th2) {
                f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to start tombstone processor.", th2);
            }
            f32.getLogger().c(EnumC4788n3.DEBUG, "TombstoneIntegration installed.", new Object[0]);
            io.sentry.util.n.a("Tombstone");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f50843c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "TombstoneIntegration removed.", new Object[0]);
        }
    }

    public TombstoneIntegration(Context context, io.sentry.transport.o oVar) {
        this.f50841a = AbstractC4704q0.g(context);
        this.f50842b = oVar;
    }
}
