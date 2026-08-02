package io.sentry.android.replay.capture;

import io.sentry.A1;
import io.sentry.E;
import io.sentry.I2;
import io.sentry.InterfaceC7217w1;
import io.sentry.U;
import io.sentry.W2;
import io.sentry.X2;
import io.sentry.android.replay.capture.u;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class y extends io.sentry.android.replay.capture.a {

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final W2 f67545r;

    /* renamed from: s, reason: collision with root package name */
    private final A1 f67546s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f67547t;

    static final class a extends AbstractC7737t implements Function1<u.c, Unit> {
        a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u.c cVar) {
            u.c segment = cVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof u.c.a) {
                u.c.a aVar = (u.c.a) segment;
                y yVar = y.this;
                aVar.a(yVar.f67546s, new E());
                yVar.b(yVar.d() + 1);
                yVar.i(aVar.c().e0());
            }
            return Unit.f71690a;
        }
    }

    static final class b extends AbstractC7737t implements Function1<u.c, Unit> {
        b() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u.c cVar) {
            u.c segment = cVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof u.c.a) {
                y yVar = y.this;
                ((u.c.a) segment).a(yVar.f67546s, new E());
                yVar.b(yVar.d() + 1);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<u.c, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ File f67551c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(File file) {
            super(1);
            this.f67551c = file;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u.c cVar) {
            u.c segment = cVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            boolean z11 = segment instanceof u.c.a;
            y yVar = y.this;
            if (z11) {
                ((u.c.a) segment).a(yVar.f67546s, new E());
            }
            yVar.b(-1);
            io.sentry.util.g.a(this.f67551c);
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y(@NotNull W2 options, A1 a12, @NotNull io.sentry.transport.c dateProvider, @NotNull ScheduledExecutorService executor) {
        super(options, a12, dateProvider, executor);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f67545r = options;
        this.f67546s = a12;
        this.f67547t = dateProvider;
    }

    public static void w(y yVar, Function2 function2, long j11, io.sentry.android.replay.t tVar) {
        io.sentry.android.replay.j n11 = yVar.n();
        if (n11 != null) {
            function2.invoke(n11, Long.valueOf(j11));
        }
        Date s11 = yVar.s();
        W2 w22 = yVar.f67545r;
        if (s11 == null) {
            w22.getLogger().c(I2.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (yVar.t().get()) {
            w22.getLogger().c(I2.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (tVar == null) {
            w22.getLogger().c(I2.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        yVar.f67547t.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        if (currentTimeMillis - s11.getTime() >= w22.getSessionReplay().t()) {
            u.c m11 = io.sentry.android.replay.capture.a.m(yVar, w22.getSessionReplay().t(), s11, yVar.g(), yVar.d(), tVar.c(), tVar.d(), tVar.b(), tVar.a());
            if (m11 instanceof u.c.a) {
                u.c.a aVar = (u.c.a) m11;
                aVar.a(yVar.f67546s, new E());
                yVar.b(yVar.d() + 1);
                yVar.i(aVar.c().e0());
            }
        }
        if (currentTimeMillis - yVar.r().get() >= w22.getSessionReplay().r()) {
            w22.getReplayController().stop();
            w22.getLogger().c(I2.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    private final void y(String str, final Function1<? super u.c, Unit> function1) {
        final io.sentry.android.replay.t p11 = p();
        if (p11 == null) {
            this.f67545r.getLogger().c(I2.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        this.f67547t.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        final Date s11 = s();
        if (s11 == null) {
            return;
        }
        final long time = currentTimeMillis - s11.getTime();
        final io.sentry.protocol.t g10 = g();
        q().submit(new io.sentry.android.replay.util.i(new Runnable(time, s11, g10, p11, function1) { // from class: io.sentry.android.replay.capture.v

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f67535b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Date f67536c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ io.sentry.protocol.t f67537d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ io.sentry.android.replay.t f67538e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f67539f;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f67539f = (AbstractC7737t) function1;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            @Override // java.lang.Runnable
            public final void run() {
                y yVar = y.this;
                int d11 = yVar.d();
                io.sentry.android.replay.t tVar = this.f67538e;
                int c11 = tVar.c();
                int d12 = tVar.d();
                int b11 = tVar.b();
                int a11 = tVar.a();
                this.f67539f.invoke(a.m(yVar, this.f67535b, this.f67536c, this.f67537d, d11, c11, d12, b11, a11));
            }
        }, "SessionCaptureStrategy.".concat(str)));
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void a(@NotNull io.sentry.android.replay.t recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        y("onConfigurationChanged", new a());
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        u(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.u
    public final void c(@NotNull Function1 onSegmentSent, boolean z11) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        W2 w22 = this.f67545r;
        if (w22.getSessionReplay().u()) {
            w22.getLogger().c(I2.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        t().set(z11);
    }

    @Override // io.sentry.android.replay.capture.u
    @NotNull
    public final u e() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void f(int i11, @NotNull io.sentry.protocol.t replayId, X2.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.f(i11, replayId, bVar);
        A1 a12 = this.f67546s;
        if (a12 != null) {
            a12.m(new InterfaceC7217w1() { // from class: io.sentry.android.replay.capture.w
                @Override // io.sentry.InterfaceC7217w1
                public final void e(U it) {
                    Intrinsics.checkNotNullParameter(it, "it");
                    y yVar = y.this;
                    it.o(yVar.g());
                    String a11 = it.a();
                    yVar.v(a11 != null ? kotlin.text.h.j0('.', a11, a11) : null);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.u
    public final void j(@NotNull final Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final io.sentry.android.replay.t p11 = p();
        this.f67547t.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        q().submit(new io.sentry.android.replay.util.i(new Runnable() { // from class: io.sentry.android.replay.capture.x
            @Override // java.lang.Runnable
            public final void run() {
                y.w(y.this, store, currentTimeMillis, p11);
            }
        }, "SessionCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void pause() {
        y("pause", new b());
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void stop() {
        io.sentry.android.replay.j n11 = n();
        y("stop", new c(n11 != null ? n11.s() : null));
        A1 a12 = this.f67546s;
        if (a12 != null) {
            a12.m(new Lh.b());
        }
        super.stop();
    }
}
