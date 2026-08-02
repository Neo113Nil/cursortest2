package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ApplicationExitInfo;
import android.content.Context;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import io.sentry.A1;
import io.sentry.C7125b;
import io.sentry.C7165l;
import io.sentry.C7230z2;
import io.sentry.I2;
import io.sentry.ILogger;
import io.sentry.InterfaceC7166l0;
import io.sentry.W2;
import io.sentry.android.core.H;
import io.sentry.protocol.C7188d;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.ArrayList;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"NewApi"})
/* loaded from: classes.dex */
public class AnrV2Integration implements InterfaceC7166l0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f66860a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f66861b;

    /* renamed from: c, reason: collision with root package name */
    private SentryAndroidOptions f66862c;

    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* renamed from: d, reason: collision with root package name */
        private final long f66863d;

        /* renamed from: e, reason: collision with root package name */
        private final boolean f66864e;

        /* renamed from: f, reason: collision with root package name */
        private final boolean f66865f;

        public a(long j11, @NotNull ILogger iLogger, long j12, boolean z11, boolean z12) {
            super(j11, iLogger);
            this.f66863d = j12;
            this.f66864e = z11;
            this.f66865f = z12;
        }

        @Override // io.sentry.hints.a
        @NotNull
        public final Long a() {
            return Long.valueOf(this.f66863d);
        }

        @Override // io.sentry.hints.a
        public final boolean c() {
            return false;
        }

        @Override // io.sentry.hints.a
        public final String d() {
            return this.f66865f ? "anr_background" : "anr_foreground";
        }

        @Override // io.sentry.hints.c
        public final boolean e() {
            return this.f66864e;
        }

        @Override // io.sentry.hints.f
        public final boolean f(io.sentry.protocol.t tVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public final void g(@NotNull io.sentry.protocol.t tVar) {
        }
    }

    private static final class b implements H.a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final SentryAndroidOptions f66866a;

        b(@NotNull SentryAndroidOptions sentryAndroidOptions) {
            this.f66866a = sentryAndroidOptions;
        }

        @Override // io.sentry.android.core.H.a
        public final int a() {
            return 6;
        }

        @Override // io.sentry.android.core.H.a
        public final Long b() {
            return io.sentry.android.core.cache.c.n(this.f66866a);
        }

        @Override // io.sentry.android.core.H.a
        public final boolean c() {
            return this.f66866a.isReportHistoricalAnrs();
        }

        @Override // io.sentry.android.core.H.a
        public final H.b d(@NotNull ApplicationExitInfo applicationExitInfo, boolean z11) {
            long timestamp;
            int importance;
            c cVar;
            byte[] bArr;
            String applicationExitInfo2;
            InputStream traceInputStream;
            SentryAndroidOptions sentryAndroidOptions = this.f66866a;
            timestamp = applicationExitInfo.getTimestamp();
            importance = applicationExitInfo.getImportance();
            boolean z12 = importance != 100;
            try {
                traceInputStream = applicationExitInfo.getTraceInputStream();
            } catch (Throwable th2) {
                sentryAndroidOptions.getLogger().a(I2.WARNING, "Failed to read ANR thread dump", th2);
                cVar = new c(c.a.NO_DUMP);
            }
            try {
                if (traceInputStream == null) {
                    cVar = new c(c.a.NO_DUMP);
                    if (traceInputStream != null) {
                        traceInputStream.close();
                    }
                } else {
                    ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
                    try {
                        byte[] bArr2 = new byte[UserVerificationMethods.USER_VERIFY_ALL];
                        while (true) {
                            int read = traceInputStream.read(bArr2, 0, UserVerificationMethods.USER_VERIFY_ALL);
                            if (read == -1) {
                                break;
                            }
                            byteArrayOutputStream.write(bArr2, 0, read);
                        }
                        byte[] byteArray = byteArrayOutputStream.toByteArray();
                        byteArrayOutputStream.close();
                        traceInputStream.close();
                        try {
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(byteArray)));
                            try {
                                io.sentry.android.core.internal.threaddump.b c11 = io.sentry.android.core.internal.threaddump.b.c(bufferedReader);
                                io.sentry.android.core.internal.threaddump.c cVar2 = new io.sentry.android.core.internal.threaddump.c(sentryAndroidOptions, z12);
                                cVar2.f(c11);
                                ArrayList d11 = cVar2.d();
                                ArrayList b11 = cVar2.b();
                                if (d11.isEmpty()) {
                                    cVar = new c(c.a.NO_DUMP);
                                    bufferedReader.close();
                                } else {
                                    c cVar3 = new c(c.a.DUMP, byteArray, d11, b11);
                                    bufferedReader.close();
                                    cVar = cVar3;
                                }
                            } finally {
                            }
                        } catch (Throwable th3) {
                            sentryAndroidOptions.getLogger().a(I2.WARNING, "Failed to parse ANR thread dump", th3);
                            cVar = new c(c.a.ERROR, byteArray);
                        }
                    } finally {
                    }
                }
                c.a aVar = c.a.NO_DUMP;
                c.a aVar2 = cVar.f66867a;
                if (aVar2 == aVar) {
                    ILogger logger = sentryAndroidOptions.getLogger();
                    I2 i22 = I2.WARNING;
                    applicationExitInfo2 = applicationExitInfo.toString();
                    logger.c(i22, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo2);
                    return null;
                }
                a aVar3 = new a(sentryAndroidOptions.getFlushTimeoutMillis(), sentryAndroidOptions.getLogger(), timestamp, z11, z12);
                io.sentry.E a11 = io.sentry.util.h.a(aVar3);
                C7230z2 c7230z2 = new C7230z2();
                if (aVar2 == c.a.ERROR) {
                    io.sentry.protocol.m mVar = new io.sentry.protocol.m();
                    mVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                    c7230z2.B0(mVar);
                } else if (aVar2 == c.a.DUMP) {
                    c7230z2.D0(cVar.f66869c);
                    ArrayList arrayList = cVar.f66870d;
                    if (arrayList != null) {
                        C7188d c7188d = new C7188d();
                        c7188d.e(arrayList);
                        c7230z2.R(c7188d);
                    }
                }
                c7230z2.z0(I2.FATAL);
                c7230z2.E0(C7165l.c(timestamp));
                if (sentryAndroidOptions.isAttachAnrThreadDump() && (bArr = cVar.f66868b) != null) {
                    a11.n(C7125b.b(bArr));
                }
                return new H.b(c7230z2, a11, aVar3);
            } finally {
            }
        }

        @Override // io.sentry.android.core.H.a
        @NotNull
        public final String getLabel() {
            return "ANR";
        }
    }

    public AnrV2Integration(@NotNull Context context) {
        io.sentry.transport.c a11 = io.sentry.transport.c.a();
        Context applicationContext = context.getApplicationContext();
        this.f66860a = applicationContext != null ? applicationContext : context;
        this.f66861b = a11;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        SentryAndroidOptions sentryAndroidOptions = this.f66862c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(I2.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    @Override // io.sentry.InterfaceC7166l0
    @SuppressLint({"NewApi"})
    public final void d(@NotNull A1 a12, @NotNull W2 w22) {
        SentryAndroidOptions sentryAndroidOptions = w22 instanceof SentryAndroidOptions ? (SentryAndroidOptions) w22 : null;
        io.sentry.util.p.b(sentryAndroidOptions, "SentryAndroidOptions is required");
        this.f66862c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(I2.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f66862c.isAnrEnabled()));
        if (this.f66862c.getCacheDirPath() == null) {
            this.f66862c.getLogger().c(I2.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f66862c.isAnrEnabled()) {
            try {
                io.sentry.Z executorService = w22.getExecutorService();
                Context context = this.f66860a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f66862c;
                executorService.submit(new H(context, a12, sentryAndroidOptions2, this.f66861b, new b(sentryAndroidOptions2)));
            } catch (Throwable th2) {
                w22.getLogger().a(I2.DEBUG, "Failed to start ANR processor.", th2);
            }
            w22.getLogger().c(I2.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.j.a("AnrV2");
        }
    }

    /* loaded from: classes10.dex */
    static final class c {

        /* renamed from: a, reason: collision with root package name */
        final a f66867a;

        /* renamed from: b, reason: collision with root package name */
        final byte[] f66868b;

        /* renamed from: c, reason: collision with root package name */
        final ArrayList f66869c;

        /* renamed from: d, reason: collision with root package name */
        final ArrayList f66870d;

        enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        c(@NotNull a aVar) {
            this.f66867a = aVar;
            this.f66868b = null;
            this.f66869c = null;
            this.f66870d = null;
        }

        c(@NotNull a aVar, byte[] bArr) {
            this.f66867a = aVar;
            this.f66868b = bArr;
            this.f66869c = null;
            this.f66870d = null;
        }

        c(@NotNull a aVar, byte[] bArr, ArrayList arrayList, ArrayList arrayList2) {
            this.f66867a = aVar;
            this.f66868b = bArr;
            this.f66869c = arrayList;
            this.f66870d = arrayList2;
        }
    }
}
