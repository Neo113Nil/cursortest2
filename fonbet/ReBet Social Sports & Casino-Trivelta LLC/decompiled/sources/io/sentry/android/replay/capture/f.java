package io.sentry.android.replay.capture;

import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.AbstractC4779m;
import io.sentry.EnumC4788n3;
import io.sentry.F3;
import io.sentry.G3;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.N1;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.android.replay.util.n;
import io.sentry.protocol.u;
import io.sentry.transport.o;
import io.sentry.util.AbstractC4851i;
import io.sentry.util.z;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.concurrent.ScheduledExecutorService;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public final class f extends io.sentry.android.replay.capture.a {

    /* renamed from: B, reason: collision with root package name */
    public static final a f51552B = new a(null);

    /* renamed from: C, reason: collision with root package name */
    public static final int f51553C = 8;

    /* renamed from: A, reason: collision with root package name */
    public final List f51554A;

    /* renamed from: w, reason: collision with root package name */
    public final F3 f51555w;

    /* renamed from: x, reason: collision with root package name */
    public final InterfaceC4740e0 f51556x;

    /* renamed from: y, reason: collision with root package name */
    public final o f51557y;

    /* renamed from: z, reason: collision with root package name */
    public final z f51558z;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public static final class b extends Lambda implements Function1 {

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Function1 f51560e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Function1 function1) {
            super(1);
            this.f51560e = function1;
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            f fVar = f.this;
            fVar.K(fVar.f51554A);
            if (segment instanceof h.c.a) {
                h.c.a aVar = (h.c.a) segment;
                h.c.a.b(aVar, f.this.f51556x, null, 2, null);
                Function1 function1 = this.f51560e;
                Date g02 = aVar.c().g0();
                Intrinsics.checkNotNullExpressionValue(g02, "getTimestamp(...)");
                function1.invoke(g02);
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
                f.this.f51554A.add(segment);
                f fVar = f.this;
                fVar.b(fVar.c() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class d extends Lambda implements Function1 {
        public d() {
            super(1);
        }

        public final void a(h.c segment) {
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof h.c.a) {
                f.this.f51554A.add(segment);
                f fVar = f.this;
                fVar.b(fVar.c() + 1);
            }
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Object invoke(Object obj) {
            a((h.c) obj);
            return Unit.INSTANCE;
        }
    }

    public static final class e extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ long f51563d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ f f51564e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Ref.BooleanRef f51565f;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(long j10, f fVar, Ref.BooleanRef booleanRef) {
            super(1);
            this.f51563d = j10;
            this.f51564e = fVar;
            this.f51565f = booleanRef;
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Boolean invoke(h.c.a it) {
            Intrinsics.checkNotNullParameter(it, "it");
            if (it.c().g0().getTime() >= this.f51563d) {
                return Boolean.FALSE;
            }
            this.f51564e.b(r0.c() - 1);
            this.f51564e.O(it.c().h0());
            this.f51565f.element = true;
            return Boolean.TRUE;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public f(F3 options, InterfaceC4740e0 interfaceC4740e0, o dateProvider, z random, ScheduledExecutorService executor, ScheduledExecutorService persistingExecutor, Function1 function1) {
        super(options, interfaceC4740e0, dateProvider, executor, persistingExecutor, function1);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        Intrinsics.checkNotNullParameter(persistingExecutor, "persistingExecutor");
        this.f51555w = options;
        this.f51556x = interfaceC4740e0;
        this.f51557y = dateProvider;
        this.f51558z = random;
        this.f51554A = new ArrayList();
    }

    public static final void L(f fVar, InterfaceC4730c0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        it.s(fVar.a());
    }

    public static final void N(f fVar, long j10, Date date, u uVar, s sVar, Function1 function1) {
        function1.invoke(io.sentry.android.replay.capture.a.n(fVar, j10, date, uVar, fVar.c(), sVar.c(), sVar.d(), sVar.b(), sVar.a(), null, null, null, null, null, 7936, null));
    }

    public static final void P(f fVar, Function2 function2, long j10) {
        io.sentry.android.replay.i o10 = fVar.o();
        if (o10 != null) {
            function2.invoke(o10, Long.valueOf(j10));
        }
        long a10 = fVar.f51557y.a() - fVar.f51555w.getSessionReplay().m();
        io.sentry.android.replay.i o11 = fVar.o();
        fVar.B(o11 != null ? o11.Z1(a10) : null);
        fVar.Q(fVar.f51554A, a10);
    }

    public static final void R(File file, f fVar) {
        AbstractC4851i.a(file);
        fVar.b(-1);
    }

    public final void K(List list) {
        h.c.a aVar = (h.c.a) CollectionsKt.removeFirstOrNull(list);
        while (aVar != null) {
            h.c.a.b(aVar, this.f51556x, null, 2, null);
            aVar = (h.c.a) CollectionsKt.removeFirstOrNull(list);
            Thread.sleep(100L);
        }
    }

    public final void M(String str, final Function1 function1) {
        final Date d10;
        Long m12;
        final s r10 = r();
        if (r10 == null) {
            this.f51555w.getLogger().c(EnumC4788n3.DEBUG, "Recorder config is not set, not creating segment for task: " + str, new Object[0]);
            return;
        }
        long m10 = this.f51555w.getSessionReplay().m();
        long a10 = this.f51557y.a();
        io.sentry.android.replay.i o10 = o();
        if (o10 == null || (m12 = o10.m1()) == null || (d10 = AbstractC4779m.d(m12.longValue())) == null) {
            d10 = AbstractC4779m.d(a10 - m10);
        }
        Intrinsics.checkNotNull(d10);
        final long time = a10 - d10.getTime();
        final u a11 = a();
        s().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy." + str, new Runnable() { // from class: io.sentry.android.replay.capture.b
            @Override // java.lang.Runnable
            public final void run() {
                f.N(f.this, time, d10, a11, r10, function1);
            }
        }));
    }

    public final void O(File file) {
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            this.f51555w.getLogger().c(EnumC4788n3.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            this.f51555w.getLogger().a(EnumC4788n3.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    public final void Q(List list, long j10) {
        Ref.BooleanRef booleanRef = new Ref.BooleanRef();
        CollectionsKt.removeAll(list, (Function1) new e(j10, this, booleanRef));
        if (booleanRef.element) {
            int i10 = 0;
            for (Object obj : list) {
                int i11 = i10 + 1;
                if (i10 < 0) {
                    CollectionsKt.throwIndexOverflow();
                }
                ((h.c.a) obj).d(i10);
                i10 = i11;
            }
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void d(MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.d(event);
        h.a.i(h.f51567a, p(), this.f51557y.a() - this.f51555w.getSessionReplay().m(), null, 4, null);
    }

    @Override // io.sentry.android.replay.capture.h
    public void e(boolean z10, Function1 onSegmentSent) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        if (!n.a(this.f51558z, this.f51555w.getSessionReplay().u())) {
            this.f51555w.getLogger().c(EnumC4788n3.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        InterfaceC4740e0 interfaceC4740e0 = this.f51556x;
        if (interfaceC4740e0 != null) {
            interfaceC4740e0.l(new N1() { // from class: io.sentry.android.replay.capture.c
                @Override // io.sentry.N1
                public final void a(InterfaceC4730c0 interfaceC4730c0) {
                    f.L(f.this, interfaceC4730c0);
                }
            });
        }
        if (!z10) {
            M("capture_replay", new b(onSegmentSent));
        } else {
            x().set(true);
            this.f51555w.getLogger().c(EnumC4788n3.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.h
    public void f(Bitmap bitmap, final Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        final long a10 = this.f51557y.a();
        s().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy.add_frame", new Runnable() { // from class: io.sentry.android.replay.capture.e
            @Override // java.lang.Runnable
            public final void run() {
                f.P(f.this, store, a10);
            }
        }));
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void g(s recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        M("configuration_changed", new c());
        super.g(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.h
    public h h() {
        if (x().get()) {
            this.f51555w.getLogger().c(EnumC4788n3.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        m mVar = new m(this.f51555w, this.f51556x, this.f51557y, s(), q(), null, 32, null);
        mVar.z(r());
        mVar.i(c(), a(), G3.b.BUFFER);
        return mVar;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void pause() {
        M("pause", new d());
        super.pause();
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.h
    public void stop() {
        io.sentry.android.replay.i o10 = o();
        final File T12 = o10 != null ? o10.T1() : null;
        s().submit(new io.sentry.android.replay.util.m("BufferCaptureStrategy.stop", new Runnable() { // from class: io.sentry.android.replay.capture.d
            @Override // java.lang.Runnable
            public final void run() {
                f.R(T12, this);
            }
        }));
        super.stop();
    }
}
