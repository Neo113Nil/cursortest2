package io.sentry.android.replay.capture;

import B5.C2598b;
import aM.RunnableC4975a;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.view.MotionEvent;
import io.sentry.A1;
import io.sentry.C7165l;
import io.sentry.E;
import io.sentry.I2;
import io.sentry.W2;
import io.sentry.X2;
import io.sentry.android.core.internal.tombstone.TombstoneProtos$Tombstone;
import io.sentry.android.replay.capture.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedDeque;
import kotlin.Unit;
import kotlin.collections.C;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.I;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@SuppressLint({"UseRequiresApi"})
@TargetApi(TombstoneProtos$Tombstone.STACK_HISTORY_BUFFER_FIELD_NUMBER)
/* loaded from: classes10.dex */
public final class q extends io.sentry.android.replay.capture.a {

    /* renamed from: r, reason: collision with root package name */
    @NotNull
    private final W2 f67517r;

    /* renamed from: s, reason: collision with root package name */
    private final A1 f67518s;

    /* renamed from: t, reason: collision with root package name */
    @NotNull
    private final io.sentry.transport.c f67519t;

    /* renamed from: u, reason: collision with root package name */
    @NotNull
    private final io.sentry.util.s f67520u;

    /* renamed from: v, reason: collision with root package name */
    @NotNull
    private final ArrayList f67521v;

    static final class a extends AbstractC7737t implements Function1<u.c, Unit> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ Function1<Date, Unit> f67523c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(Function1<? super Date, Unit> function1) {
            super(1);
            this.f67523c = function1;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u.c cVar) {
            u.c segment = cVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            q qVar = q.this;
            q.x(qVar, qVar.f67521v);
            if (segment instanceof u.c.a) {
                u.c.a aVar = (u.c.a) segment;
                aVar.a(qVar.f67518s, new E());
                Date e02 = aVar.c().e0();
                Intrinsics.checkNotNullExpressionValue(e02, "getTimestamp(...)");
                this.f67523c.invoke(e02);
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
                q qVar = q.this;
                qVar.f67521v.add(segment);
                qVar.b(qVar.d() + 1);
            }
            return Unit.f71690a;
        }
    }

    static final class c extends AbstractC7737t implements Function1<u.c, Unit> {
        c() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public final Unit invoke(u.c cVar) {
            u.c segment = cVar;
            Intrinsics.checkNotNullParameter(segment, "segment");
            if (segment instanceof u.c.a) {
                q qVar = q.this;
                qVar.f67521v.add(segment);
                qVar.b(qVar.d() + 1);
            }
            return Unit.f71690a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public q(@NotNull W2 options, A1 a12, @NotNull io.sentry.transport.c dateProvider, @NotNull io.sentry.util.s random, @NotNull io.sentry.android.replay.util.h executor) {
        super(options, a12, dateProvider, executor);
        Intrinsics.checkNotNullParameter(options, "options");
        Intrinsics.checkNotNullParameter(dateProvider, "dateProvider");
        Intrinsics.checkNotNullParameter(random, "random");
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f67517r = options;
        this.f67518s = a12;
        this.f67519t = dateProvider;
        this.f67520u = random;
        this.f67521v = new ArrayList();
    }

    private final void B(String str, final Function1<? super u.c, Unit> function1) {
        final Date c11;
        Long q11;
        final io.sentry.android.replay.t p11 = p();
        W2 w22 = this.f67517r;
        if (p11 == null) {
            w22.getLogger().c(I2.DEBUG, "Recorder config is not set, not creating segment for task: ".concat(str), new Object[0]);
            return;
        }
        long g10 = w22.getSessionReplay().g();
        this.f67519t.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        io.sentry.android.replay.j n11 = n();
        if (n11 == null || (q11 = n11.q()) == null || (c11 = C7165l.c(q11.longValue())) == null) {
            c11 = C7165l.c(currentTimeMillis - g10);
        }
        Intrinsics.f(c11);
        final long time = currentTimeMillis - c11.getTime();
        final io.sentry.protocol.t g11 = g();
        q().submit(new io.sentry.android.replay.util.i(new Runnable(time, c11, g11, p11, function1) { // from class: io.sentry.android.replay.capture.o

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ long f67509b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ Date f67510c;

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ io.sentry.protocol.t f67511d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ io.sentry.android.replay.t f67512e;

            /* renamed from: f, reason: collision with root package name */
            public final /* synthetic */ AbstractC7737t f67513f;

            /* JADX WARN: Multi-variable type inference failed */
            {
                this.f67513f = (AbstractC7737t) function1;
            }

            /* JADX WARN: Type inference failed for: r1v2, types: [kotlin.jvm.functions.Function1, kotlin.jvm.internal.t] */
            @Override // java.lang.Runnable
            public final void run() {
                q qVar = q.this;
                int d11 = qVar.d();
                io.sentry.android.replay.t tVar = this.f67512e;
                int c12 = tVar.c();
                int d12 = tVar.d();
                int b11 = tVar.b();
                int a11 = tVar.a();
                this.f67513f.invoke(a.m(qVar, this.f67509b, this.f67510c, this.f67511d, d11, c12, d12, b11, a11));
            }
        }, "BufferCaptureStrategy.".concat(str)));
    }

    public static void w(q qVar, Function2 function2, long j11) {
        io.sentry.android.replay.j n11 = qVar.n();
        if (n11 != null) {
            function2.invoke(n11, Long.valueOf(j11));
        }
        qVar.f67519t.getClass();
        long currentTimeMillis = System.currentTimeMillis() - qVar.f67517r.getSessionReplay().g();
        io.sentry.android.replay.j n12 = qVar.n();
        qVar.v(n12 != null ? n12.v(currentTimeMillis) : null);
        ArrayList arrayList = qVar.f67521v;
        I i11 = new I();
        C.h(arrayList, new r(currentTimeMillis, qVar, i11));
        if (i11.f71783a) {
            Iterator it = arrayList.iterator();
            int i12 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i13 = i12 + 1;
                if (i12 < 0) {
                    C7714v.O0();
                    throw null;
                }
                ((u.c.a) next).d(i12);
                i12 = i13;
            }
        }
    }

    public static final void x(q qVar, ArrayList arrayList) {
        qVar.getClass();
        u.c.a aVar = (u.c.a) C7714v.v0(arrayList);
        while (aVar != null) {
            aVar.a(qVar.f67518s, new E());
            aVar = (u.c.a) C7714v.v0(arrayList);
            Thread.sleep(100L);
        }
    }

    public static final void y(q qVar, File file) {
        W2 w22 = qVar.f67517r;
        if (file == null) {
            return;
        }
        try {
            if (file.delete()) {
                return;
            }
            w22.getLogger().c(I2.ERROR, "Failed to delete replay segment: %s", file.getAbsolutePath());
        } catch (Throwable th2) {
            w22.getLogger().b(I2.ERROR, th2, "Failed to delete replay segment: %s", file.getAbsolutePath());
        }
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void a(@NotNull io.sentry.android.replay.t recorderConfig) {
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        B("configuration_changed", new b());
        Intrinsics.checkNotNullParameter(recorderConfig, "recorderConfig");
        u(recorderConfig);
    }

    @Override // io.sentry.android.replay.capture.u
    public final void c(@NotNull Function1 onSegmentSent, boolean z11) {
        Intrinsics.checkNotNullParameter(onSegmentSent, "onSegmentSent");
        W2 w22 = this.f67517r;
        if (!io.sentry.android.replay.util.j.a(this.f67520u, w22.getSessionReplay().n())) {
            w22.getLogger().c(I2.INFO, "Replay wasn't sampled by onErrorSampleRate, not capturing for event", new Object[0]);
            return;
        }
        A1 a12 = this.f67518s;
        if (a12 != null) {
            a12.m(new C2598b(this));
        }
        if (!z11) {
            B("capture_replay", new a(onSegmentSent));
        } else {
            t().set(true);
            w22.getLogger().c(I2.DEBUG, "Not capturing replay for crashed event, will be captured on next launch", new Object[0]);
        }
    }

    @Override // io.sentry.android.replay.capture.u
    @NotNull
    public final u e() {
        boolean z11 = t().get();
        W2 w22 = this.f67517r;
        if (z11) {
            w22.getLogger().c(I2.DEBUG, "Not converting to session mode, because the process is about to terminate", new Object[0]);
            return this;
        }
        y yVar = new y(w22, this.f67518s, this.f67519t, q());
        yVar.u(p());
        yVar.f(d(), g(), X2.b.BUFFER);
        return yVar;
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void h(@NotNull MotionEvent event) {
        Intrinsics.checkNotNullParameter(event, "event");
        super.h(event);
        this.f67519t.getClass();
        long currentTimeMillis = System.currentTimeMillis() - this.f67517r.getSessionReplay().g();
        ConcurrentLinkedDeque events = o();
        Intrinsics.checkNotNullParameter(events, "events");
        Iterator it = events.iterator();
        Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
        while (it.hasNext()) {
            if (((io.sentry.rrweb.b) it.next()).e() < currentTimeMillis) {
                it.remove();
            }
        }
    }

    @Override // io.sentry.android.replay.capture.u
    public final void j(@NotNull final Function2 store) {
        Intrinsics.checkNotNullParameter(store, "store");
        this.f67519t.getClass();
        final long currentTimeMillis = System.currentTimeMillis();
        q().submit(new io.sentry.android.replay.util.i(new Runnable() { // from class: io.sentry.android.replay.capture.p
            @Override // java.lang.Runnable
            public final void run() {
                q.w(q.this, store, currentTimeMillis);
            }
        }, "BufferCaptureStrategy.add_frame"));
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void pause() {
        B("pause", new c());
    }

    @Override // io.sentry.android.replay.capture.a, io.sentry.android.replay.capture.u
    public final void stop() {
        io.sentry.android.replay.j n11 = n();
        q().submit(new io.sentry.android.replay.util.i(new RunnableC4975a(2, n11 != null ? n11.s() : null, this), "BufferCaptureStrategy.stop"));
        super.stop();
    }
}
