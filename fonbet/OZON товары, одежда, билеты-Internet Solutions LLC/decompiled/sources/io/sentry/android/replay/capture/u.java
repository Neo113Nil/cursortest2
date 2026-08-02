package io.sentry.android.replay.capture;

import B90.C2600b;
import android.view.MotionEvent;
import io.sentry.A1;
import io.sentry.C7141f;
import io.sentry.C7165l;
import io.sentry.C7194q1;
import io.sentry.E;
import io.sentry.W;
import io.sentry.W2;
import io.sentry.X2;
import java.io.File;
import java.util.ArrayList;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.M;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface u {

    public static final class a {
        /* JADX WARN: Removed duplicated region for block: B:41:0x0191  */
        /* JADX WARN: Removed duplicated region for block: B:43:0x0198  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:56:0x01d0 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:57:0x019d  */
        /* JADX WARN: Removed duplicated region for block: B:58:0x0195  */
        /* JADX WARN: Type inference failed for: r12v5, types: [T, kotlin.collections.K] */
        @NotNull
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public static c a(A1 a12, @NotNull W2 options, long j11, @NotNull Date currentSegmentTimestamp, @NotNull io.sentry.protocol.t replayId, int i11, int i12, int i13, @NotNull X2.b replayType, io.sentry.android.replay.j jVar, int i14, int i15, String str, List list, @NotNull Deque events) {
            io.sentry.android.replay.d o11;
            List<C7141f> list2;
            boolean z11;
            io.sentry.rrweb.b a11;
            io.sentry.rrweb.a aVar;
            Object obj;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            if (jVar == null || (o11 = io.sentry.android.replay.j.o(jVar, Math.min(j11, 300000L), currentSegmentTimestamp.getTime(), i11, i12, i13, i14, i15)) == null) {
                return c.b.f67533a;
            }
            File a13 = o11.a();
            int b11 = o11.b();
            long c11 = o11.c();
            if (list == null) {
                M m11 = new M();
                m11.f71787a = K.f71697a;
                if (a12 != null) {
                    a12.m(new C2600b(m11));
                }
                list2 = (List) m11.f71787a;
            } else {
                list2 = list;
            }
            Date c12 = C7165l.c(currentSegmentTimestamp.getTime() + c11);
            Intrinsics.checkNotNullExpressionValue(c12, "getDateTime(...)");
            X2 x22 = new X2();
            x22.U(replayId);
            x22.h0(replayId);
            x22.k0(i11);
            x22.l0(c12);
            x22.i0(currentSegmentTimestamp);
            x22.j0(replayType);
            x22.q0(a13);
            ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
            gVar.f(currentSegmentTimestamp.getTime());
            gVar.j(i12);
            gVar.l(i13);
            arrayList.add(gVar);
            io.sentry.rrweb.j jVar2 = new io.sentry.rrweb.j();
            jVar2.f(currentSegmentTimestamp.getTime());
            jVar2.A(i11);
            jVar2.u(c11);
            jVar2.v(b11);
            jVar2.B(a13.length());
            jVar2.w(i14);
            jVar2.x(i12);
            jVar2.E(i13);
            jVar2.y();
            jVar2.C();
            arrayList.add(jVar2);
            LinkedList linkedList = new LinkedList();
            C7141f c7141f = null;
            for (C7141f c7141f2 : list2) {
                if (c7141f != null && Intrinsics.d(c7141f.h(), "network.event")) {
                    Map<String, Object> i16 = c7141f.i();
                    Intrinsics.checkNotNullExpressionValue(i16, "getData(...)");
                    Object obj2 = i16.get("action");
                    if (obj2 == null) {
                        obj2 = null;
                    }
                    if (Intrinsics.d(obj2, "NETWORK_AVAILABLE") && Intrinsics.d(c7141f2.h(), "network.event") && c7141f2.i().containsKey("network_type") && c7141f2.l().getTime() + 5000 >= currentSegmentTimestamp.getTime()) {
                        z11 = true;
                        if ((c7141f2.l().getTime() < currentSegmentTimestamp.getTime() || z11) && c7141f2.l().getTime() < c12.getTime() && (a11 = options.getReplayController().getF67431n().a(c7141f2)) != null) {
                            arrayList.add(a11);
                            aVar = !(a11 instanceof io.sentry.rrweb.a) ? (io.sentry.rrweb.a) a11 : null;
                            if (Intrinsics.d(aVar == null ? aVar.n() : null, "navigation")) {
                                io.sentry.rrweb.a aVar2 = (io.sentry.rrweb.a) a11;
                                Map<String, Object> o12 = aVar2.o();
                                if (o12 == null || (obj = o12.get("to")) == null) {
                                    obj = null;
                                }
                                if (obj instanceof String) {
                                    Map<String, Object> o13 = aVar2.o();
                                    Intrinsics.f(o13);
                                    Object obj3 = o13.get("to");
                                    Intrinsics.g(obj3, "null cannot be cast to non-null type kotlin.String");
                                    linkedList.add((String) obj3);
                                }
                            }
                        }
                        c7141f = c7141f2;
                    }
                }
                z11 = false;
                if (c7141f2.l().getTime() < currentSegmentTimestamp.getTime()) {
                }
                arrayList.add(a11);
                if (!(a11 instanceof io.sentry.rrweb.a)) {
                }
                if (Intrinsics.d(aVar == null ? aVar.n() : null, "navigation")) {
                }
                c7141f = c7141f2;
            }
            if (str != null && !Intrinsics.d(C7714v.M(linkedList), str)) {
                linkedList.addFirst(str);
            }
            long time = c12.getTime();
            s sVar = new s(currentSegmentTimestamp, arrayList);
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) it.next();
                if (bVar.e() < time) {
                    sVar.invoke(bVar);
                    it.remove();
                }
            }
            if (i11 == 0) {
                arrayList.add(new io.sentry.rrweb.h(options));
            }
            C7194q1 c7194q1 = new C7194q1();
            c7194q1.c(Integer.valueOf(i11));
            c7194q1.b(C7714v.I0(new t(), arrayList));
            x22.p0(linkedList);
            return new c.a(x22, c7194q1);
        }
    }

    public static final class b {
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            private final X2 f67531a;

            /* renamed from: b, reason: collision with root package name */
            @NotNull
            private final C7194q1 f67532b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(@NotNull X2 replay, @NotNull C7194q1 recording) {
                super(0);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.f67531a = replay;
                this.f67532b = recording;
            }

            public final void a(W w11, @NotNull E hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (w11 != null) {
                    hint.l(this.f67532b);
                    Unit unit = Unit.f71690a;
                    w11.o(this.f67531a, hint);
                }
            }

            @NotNull
            public final X2 c() {
                return this.f67531a;
            }

            public final void d(int i11) {
                this.f67531a.k0(i11);
                List<? extends io.sentry.rrweb.b> a11 = this.f67532b.a();
                if (a11 != null) {
                    for (io.sentry.rrweb.b bVar : a11) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).A(i11);
                        }
                    }
                }
            }

            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.d(this.f67531a, aVar.f67531a) && Intrinsics.d(this.f67532b, aVar.f67532b);
            }

            public final int hashCode() {
                return this.f67532b.hashCode() + (this.f67531a.hashCode() * 31);
            }

            @NotNull
            public final String toString() {
                return "Created(replay=" + this.f67531a + ", recording=" + this.f67532b + ')';
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            @NotNull
            public static final b f67533a = new b(0);
        }

        public /* synthetic */ c(int i11) {
            this();
        }

        private c() {
        }
    }

    void a(@NotNull io.sentry.android.replay.t tVar);

    void b(int i11);

    void c(@NotNull Function1 function1, boolean z11);

    int d();

    @NotNull
    u e();

    void f(int i11, @NotNull io.sentry.protocol.t tVar, X2.b bVar);

    @NotNull
    io.sentry.protocol.t g();

    void h(@NotNull MotionEvent motionEvent);

    void i(Date date);

    void j(@NotNull Function2 function2);

    void pause();

    void resume();

    void stop();
}
