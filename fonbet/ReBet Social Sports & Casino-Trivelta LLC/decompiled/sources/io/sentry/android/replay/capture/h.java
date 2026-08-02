package io.sentry.android.replay.capture;

import ai.verisoul.sdk.Core;
import android.graphics.Bitmap;
import android.view.MotionEvent;
import io.sentry.AbstractC4779m;
import io.sentry.C4744f;
import io.sentry.F3;
import io.sentry.G3;
import io.sentry.H1;
import io.sentry.InterfaceC4730c0;
import io.sentry.InterfaceC4740e0;
import io.sentry.J;
import io.sentry.N1;
import io.sentry.android.replay.capture.h;
import io.sentry.android.replay.s;
import io.sentry.protocol.u;
import java.io.File;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.comparisons.ComparisonsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlin.jvm.internal.Ref;

/* loaded from: classes3.dex */
public interface h {

    /* renamed from: a, reason: collision with root package name */
    public static final a f51567a = a.f51568a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ a f51568a = new a();

        /* renamed from: io.sentry.android.replay.capture.h$a$a, reason: collision with other inner class name */
        public static final class C0757a extends Lambda implements Function1 {

            /* renamed from: d, reason: collision with root package name */
            public final /* synthetic */ Date f51569d;

            /* renamed from: e, reason: collision with root package name */
            public final /* synthetic */ List f51570e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C0757a(Date date, List list) {
                super(1);
                this.f51569d = date;
                this.f51570e = list;
            }

            public final void a(io.sentry.rrweb.b event) {
                Intrinsics.checkNotNullParameter(event, "event");
                if (event.e() >= this.f51569d.getTime()) {
                    this.f51570e.add(event);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Object invoke(Object obj) {
                a((io.sentry.rrweb.b) obj);
                return Unit.INSTANCE;
            }
        }

        public static final class b implements Comparator {
            @Override // java.util.Comparator
            public final int compare(Object obj, Object obj2) {
                return ComparisonsKt.compareValues(Long.valueOf(((io.sentry.rrweb.b) obj).e()), Long.valueOf(((io.sentry.rrweb.b) obj2).e()));
            }
        }

        /* JADX WARN: Type inference failed for: r0v1, types: [T, java.util.ArrayList] */
        public static final void e(Ref.ObjectRef objectRef, InterfaceC4730c0 scope) {
            Intrinsics.checkNotNullParameter(scope, "scope");
            objectRef.element = new ArrayList(scope.w());
        }

        public static /* synthetic */ void i(a aVar, Deque deque, long j10, Function1 function1, int i10, Object obj) {
            if ((i10 & 4) != 0) {
                function1 = null;
            }
            aVar.h(deque, j10, function1);
        }

        /* JADX WARN: Code restructure failed: missing block: B:11:0x00ca, code lost:
        
            if ((r11.q().getTime() + 5000) >= r22.getTime()) goto L15;
         */
        /* JADX WARN: Code restructure failed: missing block: B:31:0x012b, code lost:
        
            if (r12 == null) goto L35;
         */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final c b(F3 f32, File file, u uVar, Date date, int i10, int i11, int i12, int i13, int i14, long j10, G3.b bVar, String str, List list, Deque deque, List list2) {
            boolean z10;
            io.sentry.rrweb.b a10;
            Object obj;
            Date d10 = AbstractC4779m.d(date.getTime() + j10);
            Intrinsics.checkNotNullExpressionValue(d10, "getDateTime(...)");
            G3 g32 = new G3();
            g32.W(uVar);
            g32.j0(uVar);
            g32.m0(i10);
            g32.n0(d10);
            g32.k0(date);
            g32.l0(bVar);
            g32.s0(file);
            g32.o0(list2);
            ArrayList arrayList = new ArrayList();
            io.sentry.rrweb.g gVar = new io.sentry.rrweb.g();
            gVar.f(date.getTime());
            gVar.l(i11);
            gVar.n(i12);
            arrayList.add(gVar);
            io.sentry.rrweb.j jVar = new io.sentry.rrweb.j();
            jVar.f(date.getTime());
            jVar.C(i10);
            jVar.w(j10);
            jVar.x(i13);
            jVar.D(file.length());
            jVar.y(i14);
            jVar.z(i11);
            jVar.G(i12);
            jVar.A(0);
            jVar.E(0);
            arrayList.add(jVar);
            LinkedList linkedList = new LinkedList();
            Iterator it = list.iterator();
            C4744f c4744f = null;
            while (it.hasNext()) {
                C4744f c4744f2 = (C4744f) it.next();
                if (c4744f != null) {
                    a aVar = f51568a;
                    z10 = true;
                    if (aVar.f(c4744f)) {
                        if (aVar.g(c4744f2)) {
                        }
                    }
                }
                z10 = false;
                if ((c4744f2.q().getTime() >= date.getTime() || z10) && c4744f2.q().getTime() < d10.getTime() && (a10 = f32.getReplayController().n1().a(c4744f2)) != null) {
                    arrayList.add(a10);
                    io.sentry.rrweb.a aVar2 = a10 instanceof io.sentry.rrweb.a ? (io.sentry.rrweb.a) a10 : null;
                    if (Intrinsics.areEqual(aVar2 != null ? aVar2.n() : null, "navigation")) {
                        io.sentry.rrweb.a aVar3 = (io.sentry.rrweb.a) a10;
                        Map o10 = aVar3.o();
                        if (o10 != null) {
                            Intrinsics.checkNotNull(o10);
                            obj = o10.get("to");
                        }
                        obj = null;
                        if (obj instanceof String) {
                            Map o11 = aVar3.o();
                            Intrinsics.checkNotNull(o11);
                            Object obj2 = o11.get("to");
                            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.String");
                            linkedList.add((String) obj2);
                        }
                    }
                }
                c4744f = c4744f2;
            }
            if (str != null && !Intrinsics.areEqual(CollectionsKt.firstOrNull((List) linkedList), str)) {
                linkedList.addFirst(str);
            }
            h(deque, d10.getTime(), new C0757a(date, arrayList));
            if (i10 == 0) {
                arrayList.add(new io.sentry.rrweb.h(f32));
            }
            H1 h12 = new H1();
            h12.c(Integer.valueOf(i10));
            h12.b(CollectionsKt.sortedWith(arrayList, new b()));
            g32.r0(linkedList);
            return new c.a(g32, h12);
        }

        /* JADX WARN: Type inference failed for: r7v2, types: [T, java.util.List] */
        public final c c(InterfaceC4740e0 interfaceC4740e0, F3 options, long j10, Date currentSegmentTimestamp, u replayId, int i10, int i11, int i12, G3.b replayType, io.sentry.android.replay.i iVar, int i13, int i14, String str, List list, Deque events, List traceIds) {
            io.sentry.android.replay.c z02;
            List list2;
            Intrinsics.checkNotNullParameter(options, "options");
            Intrinsics.checkNotNullParameter(currentSegmentTimestamp, "currentSegmentTimestamp");
            Intrinsics.checkNotNullParameter(replayId, "replayId");
            Intrinsics.checkNotNullParameter(replayType, "replayType");
            Intrinsics.checkNotNullParameter(events, "events");
            Intrinsics.checkNotNullParameter(traceIds, "traceIds");
            if (iVar == null || (z02 = io.sentry.android.replay.i.z0(iVar, Math.min(j10, Core.sensorDataTimeout), currentSegmentTimestamp.getTime(), i10, i11, i12, i13, i14, null, 128, null)) == null) {
                return c.b.f51573a;
            }
            File a10 = z02.a();
            int b10 = z02.b();
            long c10 = z02.c();
            if (list == null) {
                final Ref.ObjectRef objectRef = new Ref.ObjectRef();
                objectRef.element = CollectionsKt.emptyList();
                if (interfaceC4740e0 != null) {
                    interfaceC4740e0.l(new N1() { // from class: io.sentry.android.replay.capture.g
                        @Override // io.sentry.N1
                        public final void a(InterfaceC4730c0 interfaceC4730c0) {
                            h.a.e(Ref.ObjectRef.this, interfaceC4730c0);
                        }
                    });
                }
                list2 = (List) objectRef.element;
            } else {
                list2 = list;
            }
            return b(options, a10, replayId, currentSegmentTimestamp, i10, i11, i12, b10, i13, c10, replayType, str, list2, events, traceIds);
        }

        public final boolean f(C4744f c4744f) {
            if (c4744f == null || !Intrinsics.areEqual(c4744f.j(), "network.event")) {
                return false;
            }
            Map l10 = c4744f.l();
            Intrinsics.checkNotNullExpressionValue(l10, "getData(...)");
            Object obj = l10.get("action");
            if (obj == null) {
                obj = null;
            }
            return Intrinsics.areEqual(obj, "NETWORK_AVAILABLE");
        }

        public final boolean g(C4744f c4744f) {
            return Intrinsics.areEqual(c4744f.j(), "network.event") && c4744f.l().containsKey("network_type");
        }

        public final void h(Deque events, long j10, Function1 function1) {
            Intrinsics.checkNotNullParameter(events, "events");
            Iterator it = events.iterator();
            Intrinsics.checkNotNullExpressionValue(it, "iterator(...)");
            while (it.hasNext()) {
                io.sentry.rrweb.b bVar = (io.sentry.rrweb.b) it.next();
                if (bVar.e() < j10) {
                    if (function1 != null) {
                        Intrinsics.checkNotNull(bVar);
                        function1.invoke(bVar);
                    }
                    it.remove();
                }
            }
        }
    }

    public static final class b {
        public static /* synthetic */ void a(h hVar, int i10, u uVar, G3.b bVar, int i11, Object obj) {
            if (obj != null) {
                throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: start");
            }
            if ((i11 & 1) != 0) {
                i10 = 0;
            }
            if ((i11 & 2) != 0) {
                uVar = new u();
            }
            if ((i11 & 4) != 0) {
                bVar = null;
            }
            hVar.i(i10, uVar, bVar);
        }
    }

    public static abstract class c {

        public static final class a extends c {

            /* renamed from: a, reason: collision with root package name */
            public final G3 f51571a;

            /* renamed from: b, reason: collision with root package name */
            public final H1 f51572b;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(G3 replay, H1 recording) {
                super(null);
                Intrinsics.checkNotNullParameter(replay, "replay");
                Intrinsics.checkNotNullParameter(recording, "recording");
                this.f51571a = replay;
                this.f51572b = recording;
            }

            public static /* synthetic */ void b(a aVar, InterfaceC4740e0 interfaceC4740e0, J j10, int i10, Object obj) {
                if ((i10 & 2) != 0) {
                    j10 = new J();
                }
                aVar.a(interfaceC4740e0, j10);
            }

            public final void a(InterfaceC4740e0 interfaceC4740e0, J hint) {
                Intrinsics.checkNotNullParameter(hint, "hint");
                if (interfaceC4740e0 != null) {
                    G3 g32 = this.f51571a;
                    hint.n(this.f51572b);
                    Unit unit = Unit.INSTANCE;
                    interfaceC4740e0.o(g32, hint);
                }
            }

            public final G3 c() {
                return this.f51571a;
            }

            public final void d(int i10) {
                this.f51571a.m0(i10);
                List<io.sentry.rrweb.b> a10 = this.f51572b.a();
                if (a10 != null) {
                    for (io.sentry.rrweb.b bVar : a10) {
                        if (bVar instanceof io.sentry.rrweb.j) {
                            ((io.sentry.rrweb.j) bVar).C(i10);
                        }
                    }
                }
            }

            public boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof a)) {
                    return false;
                }
                a aVar = (a) obj;
                return Intrinsics.areEqual(this.f51571a, aVar.f51571a) && Intrinsics.areEqual(this.f51572b, aVar.f51572b);
            }

            public int hashCode() {
                return (this.f51571a.hashCode() * 31) + this.f51572b.hashCode();
            }

            public String toString() {
                return "Created(replay=" + this.f51571a + ", recording=" + this.f51572b + ')';
            }
        }

        public static final class b extends c {

            /* renamed from: a, reason: collision with root package name */
            public static final b f51573a = new b();

            public b() {
                super(null);
            }
        }

        public /* synthetic */ c(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public c() {
        }
    }

    u a();

    void b(int i10);

    int c();

    void d(MotionEvent motionEvent);

    void e(boolean z10, Function1 function1);

    void f(Bitmap bitmap, Function2 function2);

    void g(s sVar);

    h h();

    void i(int i10, u uVar, G3.b bVar);

    void j(Date date);

    void k(u uVar);

    void pause();

    void resume();

    void stop();
}
