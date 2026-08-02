package io.sentry.android.core;

import android.annotation.SuppressLint;
import android.app.ApplicationExitInfo;
import android.content.Context;
import io.sentry.AbstractC4779m;
import io.sentry.C4724b;
import io.sentry.C4733c3;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.ILogger;
import io.sentry.InterfaceC4740e0;
import io.sentry.InterfaceC4760i0;
import io.sentry.InterfaceC4839u0;
import io.sentry.android.core.RunnableC4681h0;
import io.sentry.protocol.C4800b;
import io.sentry.protocol.C4803e;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.Closeable;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.List;
import org.jetbrains.annotations.Nullable;

@SuppressLint({"NewApi"})
/* loaded from: classes3.dex */
public class AnrV2Integration implements InterfaceC4839u0, Closeable {

    /* renamed from: a, reason: collision with root package name */
    public final Context f50644a;

    /* renamed from: b, reason: collision with root package name */
    public final io.sentry.transport.o f50645b;

    /* renamed from: c, reason: collision with root package name */
    public SentryAndroidOptions f50646c;

    public static final class a extends io.sentry.hints.d implements io.sentry.hints.c, io.sentry.hints.a {

        /* renamed from: d, reason: collision with root package name */
        public final long f50647d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f50648e;

        /* renamed from: f, reason: collision with root package name */
        public final boolean f50649f;

        public a(long j10, ILogger iLogger, long j11, boolean z10, boolean z11) {
            super(j10, iLogger);
            this.f50647d = j11;
            this.f50648e = z10;
            this.f50649f = z11;
        }

        @Override // io.sentry.hints.a
        public Long a() {
            return Long.valueOf(this.f50647d);
        }

        @Override // io.sentry.hints.c
        public boolean b() {
            return this.f50648e;
        }

        @Override // io.sentry.hints.f
        public boolean c(io.sentry.protocol.u uVar) {
            return true;
        }

        @Override // io.sentry.hints.f
        public void d(io.sentry.protocol.u uVar) {
        }

        @Override // io.sentry.hints.a
        public boolean f() {
            return false;
        }

        @Override // io.sentry.hints.a
        public String h() {
            return this.f50649f ? "anr_background" : "anr_foreground";
        }
    }

    public static final class b implements RunnableC4681h0.a {

        /* renamed from: a, reason: collision with root package name */
        public final SentryAndroidOptions f50650a;

        public b(SentryAndroidOptions sentryAndroidOptions) {
            this.f50650a = sentryAndroidOptions;
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public Long a() {
            return io.sentry.android.core.cache.d.I(this.f50650a);
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public String b() {
            return "ANR";
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public boolean c() {
            return this.f50650a.isReportHistoricalAnrs();
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public RunnableC4681h0.b d(ApplicationExitInfo applicationExitInfo, boolean z10) {
            long timestamp;
            int importance;
            byte[] bArr;
            String applicationExitInfo2;
            timestamp = applicationExitInfo.getTimestamp();
            importance = applicationExitInfo.getImportance();
            boolean z11 = importance != 100;
            c f10 = f(applicationExitInfo, z11);
            if (f10.f50651a == c.a.NO_DUMP) {
                ILogger logger = this.f50650a.getLogger();
                EnumC4788n3 enumC4788n3 = EnumC4788n3.WARNING;
                applicationExitInfo2 = applicationExitInfo.toString();
                logger.c(enumC4788n3, "Not reporting ANR event as there was no thread dump for the ANR %s", applicationExitInfo2);
                return null;
            }
            a aVar = new a(this.f50650a.getFlushTimeoutMillis(), this.f50650a.getLogger(), timestamp, z10, z11);
            io.sentry.J c10 = io.sentry.util.l.c(aVar);
            C4733c3 c4733c3 = new C4733c3();
            c.a aVar2 = f10.f50651a;
            if (aVar2 == c.a.ERROR) {
                io.sentry.protocol.n nVar = new io.sentry.protocol.n();
                nVar.f("Sentry Android SDK failed to parse system thread dump for this ANR. We recommend enabling [SentryOptions.isAttachAnrThreadDump] option to attach the thread dump as plain text and report this issue on GitHub.");
                c4733c3.D0(nVar);
            } else if (aVar2 == c.a.DUMP) {
                c4733c3.F0(f10.f50652b);
                if (f10.f50653c != null) {
                    C4803e c4803e = new C4803e();
                    c4803e.e(f10.f50653c);
                    c4733c3.T(c4803e);
                }
                if (f10.f50654d != null) {
                    c4733c3.C().p(f10.f50654d);
                }
            }
            c4733c3.C0(EnumC4788n3.FATAL);
            c4733c3.G0(AbstractC4779m.d(timestamp));
            if (this.f50650a.isAttachAnrThreadDump() && (bArr = f10.dump) != null) {
                c10.p(C4724b.b(bArr));
            }
            return new RunnableC4681h0.b(c4733c3, c10, aVar);
        }

        @Override // io.sentry.android.core.RunnableC4681h0.a
        public int e() {
            return 6;
        }

        public final c f(ApplicationExitInfo applicationExitInfo, boolean z10) {
            InputStream traceInputStream;
            try {
                traceInputStream = applicationExitInfo.getTraceInputStream();
                try {
                    if (traceInputStream == null) {
                        c cVar = new c(c.a.NO_DUMP);
                        if (traceInputStream == null) {
                            return cVar;
                        }
                        traceInputStream.close();
                        return cVar;
                    }
                    byte[] b10 = io.sentry.android.core.internal.util.s.b(traceInputStream);
                    traceInputStream.close();
                    try {
                        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new ByteArrayInputStream(b10)));
                        try {
                            io.sentry.android.core.internal.threaddump.c c10 = io.sentry.android.core.internal.threaddump.c.c(bufferedReader);
                            io.sentry.android.core.internal.threaddump.d dVar = new io.sentry.android.core.internal.threaddump.d(this.f50650a, z10);
                            dVar.j(c10);
                            List f10 = dVar.f();
                            List c11 = dVar.c();
                            C4800b b11 = dVar.b();
                            if (f10.isEmpty()) {
                                c cVar2 = new c(c.a.NO_DUMP);
                                bufferedReader.close();
                                return cVar2;
                            }
                            c cVar3 = new c(c.a.DUMP, b10, f10, c11, b11);
                            bufferedReader.close();
                            return cVar3;
                        } finally {
                        }
                    } catch (Throwable th2) {
                        this.f50650a.getLogger().b(EnumC4788n3.WARNING, "Failed to parse ANR thread dump", th2);
                        return new c(c.a.ERROR, b10);
                    }
                } finally {
                }
            } catch (Throwable th3) {
                this.f50650a.getLogger().b(EnumC4788n3.WARNING, "Failed to read ANR thread dump", th3);
                return new c(c.a.NO_DUMP);
            }
        }
    }

    public AnrV2Integration(Context context) {
        this(context, io.sentry.transport.m.b());
    }

    @Override // io.sentry.InterfaceC4839u0
    public void J(InterfaceC4740e0 interfaceC4740e0, F3 f32) {
        SentryAndroidOptions sentryAndroidOptions = (SentryAndroidOptions) io.sentry.util.w.c(f32 instanceof SentryAndroidOptions ? (SentryAndroidOptions) f32 : null, "SentryAndroidOptions is required");
        this.f50646c = sentryAndroidOptions;
        sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "AnrIntegration enabled: %s", Boolean.valueOf(this.f50646c.isAnrEnabled()));
        if (this.f50646c.getCacheDirPath() == null) {
            this.f50646c.getLogger().c(EnumC4788n3.INFO, "Cache dir is not set, unable to process ANRs", new Object[0]);
            return;
        }
        if (this.f50646c.isAnrEnabled()) {
            try {
                InterfaceC4760i0 executorService = f32.getExecutorService();
                Context context = this.f50644a;
                SentryAndroidOptions sentryAndroidOptions2 = this.f50646c;
                executorService.submit(new RunnableC4681h0(context, interfaceC4740e0, sentryAndroidOptions2, this.f50645b, new b(sentryAndroidOptions2)));
            } catch (Throwable th2) {
                f32.getLogger().b(EnumC4788n3.DEBUG, "Failed to start ANR processor.", th2);
            }
            f32.getLogger().c(EnumC4788n3.DEBUG, "AnrV2Integration installed.", new Object[0]);
            io.sentry.util.n.a("AnrV2");
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        SentryAndroidOptions sentryAndroidOptions = this.f50646c;
        if (sentryAndroidOptions != null) {
            sentryAndroidOptions.getLogger().c(EnumC4788n3.DEBUG, "AnrV2Integration removed.", new Object[0]);
        }
    }

    public AnrV2Integration(Context context, io.sentry.transport.o oVar) {
        this.f50644a = AbstractC4704q0.g(context);
        this.f50645b = oVar;
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public final a f50651a;

        /* renamed from: b, reason: collision with root package name */
        public final List f50652b;

        /* renamed from: c, reason: collision with root package name */
        public final List f50653c;

        /* renamed from: d, reason: collision with root package name */
        public final C4800b f50654d;

        @Nullable
        final byte[] dump;

        public enum a {
            DUMP,
            NO_DUMP,
            ERROR
        }

        public c(a aVar) {
            this.f50651a = aVar;
            this.dump = null;
            this.f50652b = null;
            this.f50653c = null;
            this.f50654d = null;
        }

        public c(a aVar, byte[] bArr) {
            this.f50651a = aVar;
            this.dump = bArr;
            this.f50652b = null;
            this.f50653c = null;
            this.f50654d = null;
        }

        public c(a aVar, byte[] bArr, List list, List list2, C4800b c4800b) {
            this.f50651a = aVar;
            this.dump = bArr;
            this.f50652b = list;
            this.f50653c = list2;
            this.f50654d = c4800b;
        }
    }
}
