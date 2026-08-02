package xe;

import De.C2857A;
import Sc.C4001c;
import Sc.InterfaceC3999a;
import com.google.android.gms.location.GeofenceStatusCodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.sequences.Sequence;
import org.jetbrains.annotations.NotNull;
import xe.B0;

@InterfaceC3999a
/* loaded from: classes.dex */
public class H0 implements B0, Q0 {

    /* renamed from: a, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105381a = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f105382b = AtomicReferenceFieldUpdater.newUpdater(H0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    private static final class a<T> extends C10737n<T> {

        /* renamed from: i, reason: collision with root package name */
        @NotNull
        private final H0 f105383i;

        public a(@NotNull kotlin.coroutines.d<? super T> dVar, @NotNull H0 h02) {
            super(1, dVar);
            this.f105383i = h02;
        }

        @Override // xe.C10737n
        @NotNull
        public final Throwable m(@NotNull H0 h02) {
            Throwable c11;
            Object U10 = this.f105383i.U();
            return (!(U10 instanceof c) || (c11 = ((c) U10).c()) == null) ? U10 instanceof C10760z ? ((C10760z) U10).f105510a : h02.Z() : c11;
        }

        @Override // xe.C10737n
        @NotNull
        protected final String x() {
            return "AwaitContinuation";
        }
    }

    private static final class b extends G0 {

        /* renamed from: e, reason: collision with root package name */
        @NotNull
        private final H0 f105384e;

        /* renamed from: f, reason: collision with root package name */
        @NotNull
        private final c f105385f;

        /* renamed from: g, reason: collision with root package name */
        @NotNull
        private final C10748t f105386g;

        /* renamed from: h, reason: collision with root package name */
        private final Object f105387h;

        public b(@NotNull H0 h02, @NotNull c cVar, @NotNull C10748t c10748t, Object obj) {
            this.f105384e = h02;
            this.f105385f = cVar;
            this.f105386g = c10748t;
            this.f105387h = obj;
        }

        @Override // xe.G0
        public final boolean n() {
            return false;
        }

        @Override // xe.G0
        public final void o(Throwable th2) {
            H0.q(this.f105384e, this.f105385f, this.f105386g, this.f105387h);
        }
    }

    private static final class c implements InterfaceC10753v0 {

        /* renamed from: b, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f105388b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f105389c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        private static final /* synthetic */ AtomicReferenceFieldUpdater f105390d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile = 0;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final M0 f105391a;

        public c(@NotNull M0 m02, Throwable th2) {
            this.f105391a = m02;
            this._rootCause$volatile = th2;
        }

        public final void a(@NotNull Throwable th2) {
            Throwable c11 = c();
            if (c11 == null) {
                f105389c.set(this, th2);
                return;
            }
            if (th2 == c11) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105390d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                atomicReferenceFieldUpdater.set(this, th2);
                return;
            }
            if (!(obj instanceof Throwable)) {
                if (obj instanceof ArrayList) {
                    ((ArrayList) obj).add(th2);
                    return;
                } else {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
            }
            if (th2 == obj) {
                return;
            }
            ArrayList arrayList = new ArrayList(4);
            arrayList.add(obj);
            arrayList.add(th2);
            atomicReferenceFieldUpdater.set(this, arrayList);
        }

        @Override // xe.InterfaceC10753v0
        @NotNull
        public final M0 b() {
            return this.f105391a;
        }

        public final Throwable c() {
            return (Throwable) f105389c.get(this);
        }

        public final boolean d() {
            return c() != null;
        }

        public final boolean e() {
            return f105388b.get(this) != 0;
        }

        public final boolean f() {
            C2857A c2857a;
            Object obj = f105390d.get(this);
            c2857a = I0.f105402e;
            return obj == c2857a;
        }

        @NotNull
        public final ArrayList g(Throwable th2) {
            ArrayList arrayList;
            C2857A c2857a;
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105390d;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                arrayList = new ArrayList(4);
            } else if (obj instanceof Throwable) {
                ArrayList arrayList2 = new ArrayList(4);
                arrayList2.add(obj);
                arrayList = arrayList2;
            } else {
                if (!(obj instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + obj).toString());
                }
                arrayList = (ArrayList) obj;
            }
            Throwable c11 = c();
            if (c11 != null) {
                arrayList.add(0, c11);
            }
            if (th2 != null && !th2.equals(c11)) {
                arrayList.add(th2);
            }
            c2857a = I0.f105402e;
            atomicReferenceFieldUpdater.set(this, c2857a);
            return arrayList;
        }

        public final void h() {
            f105388b.set(this, 1);
        }

        @Override // xe.InterfaceC10753v0
        public final boolean isActive() {
            return c() == null;
        }

        @NotNull
        public final String toString() {
            return "Finishing[cancelling=" + d() + ", completing=" + e() + ", rootCause=" + c() + ", exceptions=" + f105390d.get(this) + ", list=" + this.f105391a + ']';
        }
    }

    @kotlin.coroutines.jvm.internal.e(c = "kotlinx.coroutines.JobSupport$children$1", f = "JobSupport.kt", l = {1003, GeofenceStatusCodes.GEOFENCE_REQUEST_TOO_FREQUENT}, m = "invokeSuspend")
    static final class d extends kotlin.coroutines.jvm.internal.i implements Function2<kotlin.sequences.k<? super B0>, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        De.n f105392d;

        /* renamed from: e, reason: collision with root package name */
        De.o f105393e;

        /* renamed from: f, reason: collision with root package name */
        int f105394f;

        /* renamed from: g, reason: collision with root package name */
        private /* synthetic */ Object f105395g;

        /* renamed from: h, reason: collision with root package name */
        final /* synthetic */ H0 f105396h;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(kotlin.coroutines.d dVar, H0 h02) {
            super(2, dVar);
            this.f105396h = h02;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = new d(dVar, this.f105396h);
            dVar2.f105395g = obj;
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlin.sequences.k<? super B0> kVar, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(kVar, dVar)).invokeSuspend(Unit.f71690a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x0078, code lost:
        
            if (r4.b(((xe.C10748t) r1).f105498e, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x007a, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x003f, code lost:
        
            if (r6.b(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0063  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x0065 -> B:6:0x007b). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x0078 -> B:6:0x007b). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            M0 b11;
            De.n nVar;
            De.o oVar;
            kotlin.sequences.k kVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f105394f;
            if (i11 == 0) {
                Sc.s.b(obj);
                kotlin.sequences.k kVar2 = (kotlin.sequences.k) this.f105395g;
                Object U10 = this.f105396h.U();
                if (U10 instanceof C10748t) {
                    H0 h02 = ((C10748t) U10).f105498e;
                    this.f105394f = 1;
                } else if ((U10 instanceof InterfaceC10753v0) && (b11 = ((InterfaceC10753v0) U10).b()) != null) {
                    Object h11 = b11.h();
                    Intrinsics.g(h11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    De.o oVar2 = (De.o) h11;
                    nVar = b11;
                    oVar = oVar2;
                    kVar = kVar2;
                    if (!oVar.equals(nVar)) {
                    }
                }
            } else if (i11 == 1) {
                Sc.s.b(obj);
            } else {
                if (i11 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                oVar = this.f105393e;
                nVar = this.f105392d;
                kVar = (kotlin.sequences.k) this.f105395g;
                Sc.s.b(obj);
                oVar = oVar.i();
                if (!oVar.equals(nVar)) {
                    if (oVar instanceof C10748t) {
                        this.f105395g = kVar;
                        this.f105392d = nVar;
                        this.f105393e = oVar;
                        this.f105394f = 2;
                    }
                    oVar = oVar.i();
                    if (!oVar.equals(nVar)) {
                    }
                }
            }
            return Unit.f71690a;
        }
    }

    public H0(boolean z11) {
        this._state$volatile = z11 ? I0.f105404g : I0.f105403f;
    }

    private final boolean C(Throwable th2) {
        if (!c0()) {
            boolean z11 = th2 instanceof CancellationException;
            InterfaceC10746s T11 = T();
            return (T11 == null || T11 == O0.f105413a) ? z11 : T11.a(th2) || z11;
        }
        return true;
    }

    private final void I(InterfaceC10753v0 interfaceC10753v0, Object obj) {
        InterfaceC10746s T11 = T();
        if (T11 != null) {
            T11.dispose();
            f105382b.set(this, O0.f105413a);
        }
        C10709A c10709a = null;
        C10760z c10760z = obj instanceof C10760z ? (C10760z) obj : null;
        Throwable th2 = c10760z != null ? c10760z.f105510a : null;
        if (interfaceC10753v0 instanceof G0) {
            try {
                ((G0) interfaceC10753v0).o(th2);
                return;
            } catch (Throwable th3) {
                W(new C10709A("Exception in completion handler " + interfaceC10753v0 + " for " + this, th3));
                return;
            }
        }
        M0 b11 = interfaceC10753v0.b();
        if (b11 != null) {
            b11.e(1);
            Object h11 = b11.h();
            Intrinsics.g(h11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
            for (De.o oVar = (De.o) h11; !oVar.equals(b11); oVar = oVar.i()) {
                if (oVar instanceof G0) {
                    try {
                        ((G0) oVar).o(th2);
                    } catch (Throwable th4) {
                        if (c10709a != null) {
                            C4001c.a(c10709a, th4);
                        } else {
                            c10709a = new C10709A("Exception in completion handler " + oVar + " for " + this, th4);
                            Unit unit = Unit.f71690a;
                        }
                    }
                }
            }
            if (c10709a != null) {
                W(c10709a);
            }
        }
    }

    private final Throwable J(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new C0(F(), null, this) : th2;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((Q0) obj).d0();
    }

    private final Object K(c cVar, Object obj) {
        Throwable M11;
        C10760z c10760z = obj instanceof C10760z ? (C10760z) obj : null;
        Throwable th2 = c10760z != null ? c10760z.f105510a : null;
        synchronized (cVar) {
            cVar.d();
            ArrayList<Throwable> g10 = cVar.g(th2);
            M11 = M(cVar, g10);
            if (M11 != null && g10.size() > 1) {
                Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(g10.size()));
                for (Throwable th3 : g10) {
                    if (th3 != M11 && th3 != M11 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                        C4001c.a(M11, th3);
                    }
                }
            }
        }
        if (M11 != null && M11 != th2) {
            obj = new C10760z(false, M11);
        }
        if (M11 != null && (C(M11) || V(M11))) {
            Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C10760z) obj).b();
        }
        j0(obj);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105381a;
        Object c10755w0 = obj instanceof InterfaceC10753v0 ? new C10755w0((InterfaceC10753v0) obj) : obj;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, cVar, c10755w0) && atomicReferenceFieldUpdater.get(this) == cVar) {
        }
        I(cVar, obj);
        return obj;
    }

    private final Throwable M(c cVar, ArrayList arrayList) {
        Object obj;
        Object obj2 = null;
        if (arrayList.isEmpty()) {
            if (cVar.d()) {
                return new C0(F(), null, this);
            }
            return null;
        }
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (!(((Throwable) obj) instanceof CancellationException)) {
                break;
            }
        }
        Throwable th2 = (Throwable) obj;
        if (th2 != null) {
            return th2;
        }
        Throwable th3 = (Throwable) arrayList.get(0);
        if (th3 instanceof d1) {
            Iterator it2 = arrayList.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof d1)) {
                    obj2 = next;
                    break;
                }
            }
            Throwable th5 = (Throwable) obj2;
            if (th5 != null) {
                return th5;
            }
        }
        return th3;
    }

    private final M0 S(InterfaceC10753v0 interfaceC10753v0) {
        M0 b11 = interfaceC10753v0.b();
        if (b11 != null) {
            return b11;
        }
        if (interfaceC10753v0 instanceof C10730j0) {
            return new M0();
        }
        if (interfaceC10753v0 instanceof G0) {
            m0((G0) interfaceC10753v0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC10753v0).toString());
    }

    private static C10748t h0(De.o oVar) {
        while (oVar.k()) {
            oVar = oVar.j();
        }
        while (true) {
            oVar = oVar.i();
            if (!oVar.k()) {
                if (oVar instanceof C10748t) {
                    return (C10748t) oVar;
                }
                if (oVar instanceof M0) {
                    return null;
                }
            }
        }
    }

    private final void i0(M0 m02, Throwable th2) {
        m02.e(4);
        Object h11 = m02.h();
        Intrinsics.g(h11, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        C10709A c10709a = null;
        for (De.o oVar = (De.o) h11; !oVar.equals(m02); oVar = oVar.i()) {
            if ((oVar instanceof G0) && ((G0) oVar).n()) {
                try {
                    ((G0) oVar).o(th2);
                } catch (Throwable th3) {
                    if (c10709a != null) {
                        C4001c.a(c10709a, th3);
                    } else {
                        c10709a = new C10709A("Exception in completion handler " + oVar + " for " + this, th3);
                        Unit unit = Unit.f71690a;
                    }
                }
            }
        }
        if (c10709a != null) {
            W(c10709a);
        }
        C(th2);
    }

    private final void m0(G0 g02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        g02.d(new M0());
        De.o i11 = g02.i();
        do {
            atomicReferenceFieldUpdater = f105381a;
            if (atomicReferenceFieldUpdater.compareAndSet(this, g02, i11)) {
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == g02);
    }

    private final int p0(Object obj) {
        C10730j0 c10730j0;
        boolean z11 = obj instanceof C10730j0;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105381a;
        if (z11) {
            if (((C10730j0) obj).isActive()) {
                return 0;
            }
            c10730j0 = I0.f105404g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10730j0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    return -1;
                }
            }
            k0();
            return 1;
        }
        if (!(obj instanceof C10751u0)) {
            return 0;
        }
        M0 b11 = ((C10751u0) obj).b();
        while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, b11)) {
            if (atomicReferenceFieldUpdater.get(this) != obj) {
                return -1;
            }
        }
        k0();
        return 1;
    }

    public static final void q(H0 h02, c cVar, C10748t c10748t, Object obj) {
        h02.getClass();
        C10748t h03 = h0(c10748t);
        if (h03 == null || !h02.v0(cVar, h03, obj)) {
            cVar.b().e(2);
            C10748t h04 = h0(c10748t);
            if (h04 == null || !h02.v0(cVar, h04, obj)) {
                h02.r(h02.K(cVar, obj));
            }
        }
    }

    private static String q0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC10753v0 ? ((InterfaceC10753v0) obj).isActive() ? "Active" : "New" : obj instanceof C10760z ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.d() ? "Cancelling" : cVar.e() ? "Completing" : "Active";
    }

    public static CancellationException t0(H0 h02, Throwable th2) {
        h02.getClass();
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        return cancellationException == null ? new C0(h02.F(), th2, h02) : cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v2, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v3 */
    private final Object u0(Object obj, Object obj2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        C2857A c2857a5;
        if (!(obj instanceof InterfaceC10753v0)) {
            c2857a5 = I0.f105398a;
            return c2857a5;
        }
        if (((obj instanceof C10730j0) || (obj instanceof G0)) && !(obj instanceof C10748t) && !(obj2 instanceof C10760z)) {
            InterfaceC10753v0 interfaceC10753v0 = (InterfaceC10753v0) obj;
            Object c10755w0 = obj2 instanceof InterfaceC10753v0 ? new C10755w0((InterfaceC10753v0) obj2) : obj2;
            do {
                atomicReferenceFieldUpdater = f105381a;
                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC10753v0, c10755w0)) {
                    j0(obj2);
                    I(interfaceC10753v0, obj2);
                    return obj2;
                }
            } while (atomicReferenceFieldUpdater.get(this) == interfaceC10753v0);
            c2857a = I0.f105400c;
            return c2857a;
        }
        InterfaceC10753v0 interfaceC10753v02 = (InterfaceC10753v0) obj;
        M0 S11 = S(interfaceC10753v02);
        if (S11 == null) {
            c2857a4 = I0.f105400c;
            return c2857a4;
        }
        c cVar = interfaceC10753v02 instanceof c ? (c) interfaceC10753v02 : null;
        if (cVar == null) {
            cVar = new c(S11, null);
        }
        kotlin.jvm.internal.M m11 = new kotlin.jvm.internal.M();
        synchronized (cVar) {
            if (cVar.e()) {
                c2857a3 = I0.f105398a;
                return c2857a3;
            }
            cVar.h();
            if (cVar != interfaceC10753v02) {
                AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f105381a;
                while (!atomicReferenceFieldUpdater2.compareAndSet(this, interfaceC10753v02, cVar)) {
                    if (atomicReferenceFieldUpdater2.get(this) != interfaceC10753v02) {
                        c2857a2 = I0.f105400c;
                        return c2857a2;
                    }
                }
            }
            boolean d11 = cVar.d();
            C10760z c10760z = obj2 instanceof C10760z ? (C10760z) obj2 : null;
            if (c10760z != null) {
                cVar.a(c10760z.f105510a);
            }
            ?? c11 = d11 ? 0 : cVar.c();
            m11.f71787a = c11;
            Unit unit = Unit.f71690a;
            if (c11 != 0) {
                i0(S11, c11);
            }
            C10748t h02 = h0(S11);
            if (h02 != null && v0(cVar, h02, obj2)) {
                return I0.f105399b;
            }
            S11.e(2);
            C10748t h03 = h0(S11);
            return (h03 == null || !v0(cVar, h03, obj2)) ? K(cVar, obj2) : I0.f105399b;
        }
    }

    private final boolean v0(c cVar, C10748t c10748t, Object obj) {
        do {
            b bVar = new b(this, cVar, c10748t, obj);
            H0 h02 = c10748t.f105498e;
            if ((h02 != null ? h02.a0(false, bVar) : h02.X(false, false, new F0(1, bVar, G0.class, "invoke", "invoke(Ljava/lang/Throwable;)V", 0))) != O0.f105413a) {
                return true;
            }
            c10748t = h0(c10748t);
        } while (c10748t != null);
        return false;
    }

    @NotNull
    protected String F() {
        return "Job was cancelled";
    }

    public boolean H(@NotNull Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return x(th2) && N();
    }

    public boolean N() {
        return true;
    }

    public boolean P() {
        return this instanceof C10752v;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xe.u0] */
    @Override // xe.B0
    @NotNull
    public final InterfaceC10746s Q(@NotNull H0 h02) {
        C10748t c10748t = new C10748t(h02);
        c10748t.f105380d = this;
        loop0: while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105381a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj instanceof C10730j0) {
                C10730j0 c10730j0 = (C10730j0) obj;
                if (c10730j0.isActive()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10748t)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                M0 m02 = new M0();
                if (!c10730j0.isActive()) {
                    m02 = new C10751u0(m02);
                }
                CU.a.b(atomicReferenceFieldUpdater, this, c10730j0, m02);
            } else {
                boolean z11 = obj instanceof InterfaceC10753v0;
                O0 o02 = O0.f105413a;
                if (!z11) {
                    Object obj2 = atomicReferenceFieldUpdater.get(this);
                    C10760z c10760z = obj2 instanceof C10760z ? (C10760z) obj2 : null;
                    c10748t.o(c10760z != null ? c10760z.f105510a : null);
                    return o02;
                }
                M0 b11 = ((InterfaceC10753v0) obj).b();
                if (b11 == null) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m0((G0) obj);
                } else if (!b11.c(c10748t, 7)) {
                    boolean c11 = b11.c(c10748t, 3);
                    Object obj3 = atomicReferenceFieldUpdater.get(this);
                    if (obj3 instanceof c) {
                        r4 = ((c) obj3).c();
                    } else {
                        C10760z c10760z2 = obj3 instanceof C10760z ? (C10760z) obj3 : null;
                        if (c10760z2 != null) {
                            r4 = c10760z2.f105510a;
                        }
                    }
                    c10748t.o(r4);
                    if (c11) {
                        break loop0;
                    }
                    return o02;
                }
            }
        }
        return c10748t;
    }

    public final InterfaceC10746s T() {
        return (InterfaceC10746s) f105382b.get(this);
    }

    public final Object U() {
        return f105381a.get(this);
    }

    protected boolean V(@NotNull Throwable th2) {
        return false;
    }

    public void W(@NotNull C10709A c10709a) {
        throw c10709a;
    }

    @Override // xe.B0
    @NotNull
    public final InterfaceC10724g0 X(boolean z11, boolean z12, @NotNull Function1<? super Throwable, Unit> function1) {
        return a0(z12, z11 ? new C10761z0(function1) : new A0(function1));
    }

    protected final void Y(B0 b02) {
        O0 o02 = O0.f105413a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105382b;
        if (b02 == null) {
            atomicReferenceFieldUpdater.set(this, o02);
            return;
        }
        b02.start();
        InterfaceC10746s Q11 = b02.Q(this);
        atomicReferenceFieldUpdater.set(this, Q11);
        if (l0()) {
            Q11.dispose();
            atomicReferenceFieldUpdater.set(this, o02);
        }
    }

    @Override // xe.B0
    @NotNull
    public final CancellationException Z() {
        Object obj = f105381a.get(this);
        if (!(obj instanceof c)) {
            if (!(obj instanceof InterfaceC10753v0)) {
                return obj instanceof C10760z ? t0(this, ((C10760z) obj).f105510a) : new C0(getClass().getSimpleName().concat(" has completed normally"), null, this);
            }
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        Throwable c11 = ((c) obj).c();
        if (c11 == null) {
            throw new IllegalStateException(("Job is still new or active: " + this).toString());
        }
        String concat = getClass().getSimpleName().concat(" is cancelling");
        CancellationException cancellationException = c11 instanceof CancellationException ? (CancellationException) c11 : null;
        if (cancellationException == null) {
            if (concat == null) {
                concat = F();
            }
            cancellationException = new C0(concat, c11, this);
        }
        return cancellationException;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v2, types: [xe.u0] */
    @NotNull
    public final InterfaceC10724g0 a0(boolean z11, @NotNull G0 g02) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        O0 o02;
        boolean z12;
        boolean c11;
        g02.f105380d = this;
        loop0: while (true) {
            atomicReferenceFieldUpdater = f105381a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            boolean z13 = obj instanceof C10730j0;
            o02 = O0.f105413a;
            z12 = true;
            if (!z13) {
                if (!(obj instanceof InterfaceC10753v0)) {
                    z12 = false;
                    break;
                }
                InterfaceC10753v0 interfaceC10753v0 = (InterfaceC10753v0) obj;
                M0 b11 = interfaceC10753v0.b();
                if (b11 == null) {
                    Intrinsics.g(obj, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    m0((G0) obj);
                } else {
                    if (g02.n()) {
                        c cVar = interfaceC10753v0 instanceof c ? (c) interfaceC10753v0 : null;
                        Throwable c12 = cVar != null ? cVar.c() : null;
                        if (c12 == null) {
                            c11 = b11.c(g02, 5);
                        } else if (z11) {
                            g02.o(c12);
                            return o02;
                        }
                    } else {
                        c11 = b11.c(g02, 1);
                    }
                    if (c11) {
                        break;
                    }
                }
            } else {
                C10730j0 c10730j0 = (C10730j0) obj;
                if (c10730j0.isActive()) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, g02)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj) {
                            break;
                        }
                    }
                    break loop0;
                }
                M0 m02 = new M0();
                if (!c10730j0.isActive()) {
                    m02 = new C10751u0(m02);
                }
                CU.a.b(atomicReferenceFieldUpdater, this, c10730j0, m02);
            }
        }
        if (z12) {
            return g02;
        }
        if (z11) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C10760z c10760z = obj2 instanceof C10760z ? (C10760z) obj2 : null;
            g02.o(c10760z != null ? c10760z.f105510a : null);
        }
        return o02;
    }

    protected boolean c0() {
        return this instanceof C10723g;
    }

    public boolean complete(Object obj) {
        return e0(obj);
    }

    @Override // xe.B0
    @NotNull
    public final Sequence<B0> d() {
        d block = new d(null, this);
        Intrinsics.checkNotNullParameter(block, "block");
        return new kotlin.sequences.m(block);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // xe.Q0
    @NotNull
    public final CancellationException d0() {
        CancellationException cancellationException;
        Object obj = f105381a.get(this);
        if (obj instanceof c) {
            cancellationException = ((c) obj).c();
        } else if (obj instanceof C10760z) {
            cancellationException = ((C10760z) obj).f105510a;
        } else {
            if (obj instanceof InterfaceC10753v0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + obj).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        return cancellationException2 == null ? new C0("Parent job is ".concat(q0(obj)), cancellationException, this) : cancellationException2;
    }

    public final boolean e0(Object obj) {
        Object u02;
        C2857A c2857a;
        C2857A c2857a2;
        do {
            u02 = u0(f105381a.get(this), obj);
            c2857a = I0.f105398a;
            if (u02 == c2857a) {
                return false;
            }
            if (u02 == I0.f105399b) {
                return true;
            }
            c2857a2 = I0.f105400c;
        } while (u02 == c2857a2);
        r(u02);
        return true;
    }

    public final Object f0(Object obj) {
        Object u02;
        C2857A c2857a;
        C2857A c2857a2;
        do {
            u02 = u0(f105381a.get(this), obj);
            c2857a = I0.f105398a;
            if (u02 == c2857a) {
                String str = "Job " + this + " is already complete or completing, but is being completed with " + obj;
                C10760z c10760z = obj instanceof C10760z ? (C10760z) obj : null;
                throw new IllegalStateException(str, c10760z != null ? c10760z.f105510a : null);
            }
            c2857a2 = I0.f105400c;
        } while (u02 == c2857a2);
        return u02;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <R> R fold(R r11, @NotNull Function2<? super R, ? super CoroutineContext.Element, ? extends R> function2) {
        return (R) CoroutineContext.Element.a.a(this, r11, function2);
    }

    @NotNull
    public String g0() {
        return getClass().getSimpleName();
    }

    @Override // kotlin.coroutines.CoroutineContext
    public final <E extends CoroutineContext.Element> E get(@NotNull CoroutineContext.a<E> aVar) {
        return (E) CoroutineContext.Element.a.b(this, aVar);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    @NotNull
    public final CoroutineContext.a<?> getKey() {
        return B0.a.f105375a;
    }

    @Override // xe.B0
    public boolean isActive() {
        Object obj = f105381a.get(this);
        return (obj instanceof InterfaceC10753v0) && ((InterfaceC10753v0) obj).isActive();
    }

    @Override // xe.B0
    public final boolean isCancelled() {
        Object obj = f105381a.get(this);
        if (obj instanceof C10760z) {
            return true;
        }
        return (obj instanceof c) && ((c) obj).d();
    }

    @Override // xe.B0
    public void j(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new C0(F(), null, this);
        }
        z(cancellationException);
    }

    protected void j0(Object obj) {
    }

    protected void k0() {
    }

    @Override // xe.B0
    public final boolean l0() {
        return !(f105381a.get(this) instanceof InterfaceC10753v0);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext minusKey(@NotNull CoroutineContext.a<?> aVar) {
        return CoroutineContext.Element.a.c(this, aVar);
    }

    public final void n0(@NotNull G0 g02) {
        C10730j0 c10730j0;
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f105381a;
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof G0)) {
                if (!(obj instanceof InterfaceC10753v0) || ((InterfaceC10753v0) obj).b() == null) {
                    return;
                }
                g02.l();
                return;
            }
            if (obj != g02) {
                return;
            }
            c10730j0 = I0.f105404g;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c10730j0)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return;
        }
    }

    public Object p() {
        Object obj = f105381a.get(this);
        if (obj instanceof InterfaceC10753v0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (obj instanceof C10760z) {
            throw ((C10760z) obj).f105510a;
        }
        return I0.g(obj);
    }

    @Override // kotlin.coroutines.CoroutineContext
    @NotNull
    public final CoroutineContext plus(@NotNull CoroutineContext coroutineContext) {
        return CoroutineContext.Element.a.d(coroutineContext, this);
    }

    protected void r(Object obj) {
    }

    @Override // xe.B0
    public final Object r0(@NotNull kotlin.coroutines.d<? super Unit> frame) {
        Object obj;
        do {
            obj = f105381a.get(this);
            if (!(obj instanceof InterfaceC10753v0)) {
                E0.f(frame.getContext());
                return Unit.f71690a;
            }
        } while (p0(obj) < 0);
        C10737n c10737n = new C10737n(1, Wc.b.b(frame));
        c10737n.o();
        C10741p.a(c10737n, E0.h(this, new S0(c10737n)));
        Object n11 = c10737n.n();
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        if (n11 == aVar) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        if (n11 != aVar) {
            n11 = Unit.f71690a;
        }
        return n11 == aVar ? n11 : Unit.f71690a;
    }

    @Override // xe.B0
    public final boolean start() {
        int p02;
        do {
            p02 = p0(f105381a.get(this));
            if (p02 == 0) {
                return false;
            }
        } while (p02 != 1);
        return true;
    }

    protected void t(Object obj) {
        r(obj);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        sb2.append(g0() + '{' + q0(f105381a.get(this)) + '}');
        sb2.append('@');
        sb2.append(Q.a(this));
        return sb2.toString();
    }

    protected final Object w(@NotNull kotlin.coroutines.d<Object> frame) {
        Object obj;
        do {
            obj = f105381a.get(this);
            if (!(obj instanceof InterfaceC10753v0)) {
                if (obj instanceof C10760z) {
                    throw ((C10760z) obj).f105510a;
                }
                return I0.g(obj);
            }
        } while (p0(obj) < 0);
        a aVar = new a(Wc.b.b(frame), this);
        aVar.o();
        C10741p.a(aVar, E0.h(this, new R0(aVar)));
        Object n11 = aVar.n();
        if (n11 == Wc.a.COROUTINE_SUSPENDED) {
            Intrinsics.checkNotNullParameter(frame, "frame");
        }
        return n11;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x003e, code lost:
    
        if (r0 == xe.I0.f105399b) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0063, code lost:
    
        r0 = r10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean x(Object obj) {
        Object obj2;
        C2857A c2857a;
        C2857A c2857a2;
        C2857A c2857a3;
        C2857A c2857a4;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C2857A c2857a5;
        C2857A c2857a6;
        C2857A c2857a7;
        obj2 = I0.f105398a;
        if (P()) {
            do {
                Object obj3 = f105381a.get(this);
                if (!(obj3 instanceof InterfaceC10753v0) || ((obj3 instanceof c) && ((c) obj3).e())) {
                    obj2 = I0.f105398a;
                    break;
                }
                obj2 = u0(obj3, new C10760z(false, J(obj)));
                c2857a7 = I0.f105400c;
            } while (obj2 == c2857a7);
        }
        c2857a = I0.f105398a;
        if (obj2 == c2857a) {
            Throwable th2 = null;
            loop1: while (true) {
                Object obj4 = f105381a.get(this);
                if (!(obj4 instanceof c)) {
                    if (!(obj4 instanceof InterfaceC10753v0)) {
                        c2857a4 = I0.f105401d;
                        break;
                    }
                    if (th2 == null) {
                        th2 = J(obj);
                    }
                    InterfaceC10753v0 interfaceC10753v0 = (InterfaceC10753v0) obj4;
                    if (interfaceC10753v0.isActive()) {
                        M0 S11 = S(interfaceC10753v0);
                        if (S11 == null) {
                            continue;
                        } else {
                            c cVar = new c(S11, th2);
                            do {
                                atomicReferenceFieldUpdater = f105381a;
                                if (atomicReferenceFieldUpdater.compareAndSet(this, interfaceC10753v0, cVar)) {
                                    i0(S11, th2);
                                    c2857a4 = I0.f105398a;
                                    break loop1;
                                }
                            } while (atomicReferenceFieldUpdater.get(this) == interfaceC10753v0);
                        }
                    } else {
                        Object u02 = u0(obj4, new C10760z(false, th2));
                        c2857a5 = I0.f105398a;
                        if (u02 == c2857a5) {
                            throw new IllegalStateException(("Cannot happen in " + obj4).toString());
                        }
                        c2857a6 = I0.f105400c;
                        if (u02 != c2857a6) {
                            obj2 = u02;
                            break;
                        }
                    }
                } else {
                    synchronized (obj4) {
                        if (((c) obj4).f()) {
                            c2857a4 = I0.f105401d;
                        } else {
                            boolean d11 = ((c) obj4).d();
                            if (obj != null || !d11) {
                                if (th2 == null) {
                                    th2 = J(obj);
                                }
                                ((c) obj4).a(th2);
                            }
                            Throwable c11 = d11 ? null : ((c) obj4).c();
                            if (c11 != null) {
                                i0(((c) obj4).b(), c11);
                            }
                            c2857a4 = I0.f105398a;
                        }
                    }
                }
            }
        }
        c2857a2 = I0.f105398a;
        if (obj2 != c2857a2 && obj2 != I0.f105399b) {
            c2857a3 = I0.f105401d;
            if (obj2 == c2857a3) {
                return false;
            }
            r(obj2);
            return true;
        }
        return true;
    }

    @Override // xe.B0
    @NotNull
    public final InterfaceC10724g0 y(@NotNull Function1<? super Throwable, Unit> function1) {
        return a0(true, new A0(function1));
    }

    public void z(@NotNull CancellationException cancellationException) {
        x(cancellationException);
    }
}
