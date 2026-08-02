package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.G3;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.N1;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.protocol.u;
import io.sentry.transport.o;
import io.sentry.util.AbstractC4851i;
import java.io.File;
import java.util.Date;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.text.StringsKt;

/* loaded from: classes3.dex */
public final class m extends io.sentry.android.replay.capture.a {

    /* renamed from: w, reason: collision with root package name */
    public final F3 f51587w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC4740e0 f51588x;

    /* renamed from: y, reason: collision with root package name */
    public final o f51589y;

    /* renamed from: z, reason: collision with root package name */
    public static final a f51586z = new a(null);

    /* renamed from: A, reason: collision with root package name */
    public static final int f51585A = 8;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function1 {
        public b() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, m.this.f51588x, null, 2, null);
                m mVar = m.this;
                mVar.b(mVar.c() + 1);
                m.this.j(aVar.c().g0());
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class c extends Lambda implements Function1 {
        public c() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f51588x, null, 2, null);
                m mVar = m.this;
                mVar.b(mVar.c() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ File f51593e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(File file) {
            super(1);
            this.f51593e = file;
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                h.c.a.b((h.c.a) segment, m.this.f51588x, null, 2, null);
            }
            m.this.b(-1);
            AbstractC4851i.a(this.f51593e);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ m(F3 f32, InterfaceC4740e0 interfaceC4740e0, o oVar, ScheduledExecutorService scheduledExecutorService, ScheduledExecutorService scheduledExecutorService2, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(f32, interfaceC4740e0, oVar, scheduledExecutorService, scheduledExecutorService2, (i10 & 32) != 0 ? null : function1);
    }

    private final void H(String str, final Function1 function1) {
        final s r10 = r();
        if (r10 == null) {
            this.f51587w.getLogger().c(EnumC4788n3.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long a10 = this.f51589y.a();
        final Date w10 = w();
        if (w10 == null) {
            return;
        }
        final long time = a10 - w10.getTime();
        final u a11 = a();
        s().submit(new io.sentry.android.replay.util.m("SessionCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.i
            @Override // java.lang.Runnable
            public final void run() {
                m.I(m.this, time, w10, a11, r10, function1);
            }
        }));
    }

    public static final void I(m mVar, long j10, Date date, u uVar, s sVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.n(mVar, j10, date, uVar, mVar.c(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null));
    }

    public static final void J(m mVar, Function2 function2, long j10, s sVar) {
        io.sentry.android.replay.i o10 = mVar.o();
        if (o10 != null) {
            function2.invoke(o10, Long.valueOf(j10));
        }
        Date w10 = mVar.w();
        if (w10 == null) {
            mVar.f51587w.getLogger().c(EnumC4788n3.DEBUG, "Segment timestamp is not set, not recording frame", new Object[0]);
            return;
        }
        if (mVar.x().get()) {
            mVar.f51587w.getLogger().c(EnumC4788n3.DEBUG, "Not capturing segment, because the app is terminating, will be captured on next launch", new Object[0]);
            return;
        }
        if (sVar == null) {
            mVar.f51587w.getLogger().c(EnumC4788n3.DEBUG, "Recorder config is not set, not capturing a segment", new Object[0]);
            return;
        }
        long a10 = mVar.f51589y.a();
        if (a10 - w10.getTime() >= mVar.f51587w.getSessionReplay().A()) {
            h.c n10 = io.sentry.android.replay.capture.a.n(mVar, mVar.f51587w.getSessionReplay().A(), w10, mVar.a(), mVar.c(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null);
            if (n10 instanceof h.c.a) {
                h.c.a aVar = (h.c.a) n10;
                h.c.a.b(aVar, mVar.f51588x, null, 2, null);
                mVar.b(mVar.c() + 1);
                mVar.j(aVar.c().g0());
            }
        }
        if (a10 - mVar.t().get() >= mVar.f51587w.getSessionReplay().y()) {
            mVar.f51587w.getReplayController().stop();
            mVar.f51587w.getLogger().c(EnumC4788n3.INFO, "Session replay deadline exceeded (1h), stopping recording", new Object[0]);
        }
    }

    public static final void K(m mVar, InterfaceC4730c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.s(mVar.a());
        String b10 = it.b();
        mVar.B(b10 != null ? StringsKt.substringAfterLast$default(b10, '.', (String) null, 2, (Object) null) : null);
    }

    public static final void L(InterfaceC4730c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.s(u.f52477c);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(boolean z10, Function1 onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (this.f51587w.getSessionReplay().C()) {
            this.f51587w.getLogger().c(EnumC4788n3.DEBUG, "Replay is already running in 'session' mode, not capturing for event", new Object[0]);
        }
        x().set(z10);
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, final Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final s r10 = r();
        final long a10 = this.f51589y.a();
        s().submit(new io.sentry.android.replay.util.m("SessionCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.l
            @Override // java.lang.Runnable
            public final void run() {
                m.J(m.this, store, a10, r10);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void g(s recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        H("onConfigurationChanged", new b());
        super.g(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public h h() {
        return this;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void i(int i10, u replayId, G3.b bVar) {
        Intrinsics.checkNotNullParameter(replayId, "replayId");
        super.i(i10, replayId, bVar);
        InterfaceC4740e0 interfaceC4740e0 = this.f51588x;
        if (interfaceC4740e0 != null) {
            interfaceC4740e0.l(new N1() { // from class: io.sentry.android.replay.capture.j
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    m.K(m.this, interfaceC4730c0);
                }
            });
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        H("pause", new c());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() {
        io.sentry.android.replay.i o10 = o();
        H("stop", new d(o10 != null ? o10.T1() : null));
        InterfaceC4740e0 interfaceC4740e0 = this.f51588x;
        if (interfaceC4740e0 != null) {
            interfaceC4740e0.l(new N1() { // from class: io.sentry.android.replay.capture.k
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    m.L(interfaceC4730c0);
                }
            });
        }
        super.stop();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(F3 options, InterfaceC4740e0 interfaceC4740e0, o dateProvider, ScheduledExecutorService executor, ScheduledExecutorService persistingExecutor, Function1 function1) {
        super(options, interfaceC4740e0, dateProvider, executor, persistingExecutor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        this.f51587w = options;
        this.f51588x = interfaceC4740e0;
        this.f51589y = dateProvider;
    }
}
