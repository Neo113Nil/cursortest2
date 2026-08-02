package Ph;

import Ph.C0;
import Sh.AbstractC1578p;
import Sh.C1579q;
import f0.AbstractC4221b;
import java.util.ArrayList;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.ExceptionsKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.coroutines.jvm.internal.RestrictedSuspendLambda;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import kotlin.jvm.internal.TypeIntrinsics;
import kotlin.sequences.Sequence;
import kotlin.sequences.SequenceScope;
import kotlin.sequences.SequencesKt;

/* loaded from: classes5.dex */
public class I0 implements C0, InterfaceC1482w, R0 {

    /* renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9008a = AtomicReferenceFieldUpdater.newUpdater(I0.class, Object.class, "_state$volatile");

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f9009b = AtomicReferenceFieldUpdater.newUpdater(I0.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    public static final class a extends C1469p {

        /* renamed from: i, reason: collision with root package name */
        public final I0 f9010i;

        public a(Continuation continuation, I0 i02) {
            super(continuation, 1);
            this.f9010i = i02;
        }

        @Override // Ph.C1469p
        public String L() {
            return "AwaitContinuation";
        }

        @Override // Ph.C1469p
        public Throwable x(C0 c02) {
            Throwable e10;
            Object V10 = this.f9010i.V();
            return (!(V10 instanceof c) || (e10 = ((c) V10).e()) == null) ? V10 instanceof C ? ((C) V10).f9000a : c02.getCancellationException() : e10;
        }
    }

    public static final class b extends H0 {

        /* renamed from: e, reason: collision with root package name */
        public final I0 f9011e;

        /* renamed from: f, reason: collision with root package name */
        public final c f9012f;

        /* renamed from: g, reason: collision with root package name */
        public final C1480v f9013g;

        /* renamed from: h, reason: collision with root package name */
        public final Object f9014h;

        public b(I0 i02, c cVar, C1480v c1480v, Object obj) {
            this.f9011e = i02;
            this.f9012f = cVar;
            this.f9013g = c1480v;
            this.f9014h = obj;
        }

        @Override // Ph.H0
        public boolean u() {
            return false;
        }

        @Override // Ph.H0
        public void v(Throwable th2) {
            this.f9011e.J(this.f9012f, this.f9013g, this.f9014h);
        }
    }

    public static final class c implements InterfaceC1487y0 {

        /* renamed from: b, reason: collision with root package name */
        public static final /* synthetic */ AtomicIntegerFieldUpdater f9015b = AtomicIntegerFieldUpdater.newUpdater(c.class, "_isCompleting$volatile");

        /* renamed from: c, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f9016c = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_rootCause$volatile");

        /* renamed from: d, reason: collision with root package name */
        public static final /* synthetic */ AtomicReferenceFieldUpdater f9017d = AtomicReferenceFieldUpdater.newUpdater(c.class, Object.class, "_exceptionsHolder$volatile");
        private volatile /* synthetic */ Object _exceptionsHolder$volatile;
        private volatile /* synthetic */ int _isCompleting$volatile;
        private volatile /* synthetic */ Object _rootCause$volatile;

        /* renamed from: a, reason: collision with root package name */
        public final N0 f9018a;

        public c(N0 n02, boolean z10, Throwable th2) {
            this.f9018a = n02;
            this._isCompleting$volatile = z10 ? 1 : 0;
            this._rootCause$volatile = th2;
        }

        public final void a(Throwable th2) {
            Throwable e10 = e();
            if (e10 == null) {
                o(th2);
                return;
            }
            if (th2 == e10) {
                return;
            }
            Object d10 = d();
            if (d10 == null) {
                n(th2);
                return;
            }
            if (d10 instanceof Throwable) {
                if (th2 == d10) {
                    return;
                }
                ArrayList c10 = c();
                c10.add(d10);
                c10.add(th2);
                n(c10);
                return;
            }
            if (d10 instanceof ArrayList) {
                ((ArrayList) d10).add(th2);
                return;
            }
            throw new IllegalStateException(("State is " + d10).toString());
        }

        @Override // Ph.InterfaceC1487y0
        public N0 b() {
            return this.f9018a;
        }

        public final ArrayList c() {
            return new ArrayList(4);
        }

        public final Object d() {
            return f9017d.get(this);
        }

        public final Throwable e() {
            return (Throwable) f9016c.get(this);
        }

        public final boolean i() {
            return e() != null;
        }

        @Override // Ph.InterfaceC1487y0
        public boolean isActive() {
            return e() == null;
        }

        public final boolean j() {
            return f9015b.get(this) == 1;
        }

        public final boolean k() {
            Sh.G g10;
            Object d10 = d();
            g10 = J0.f9035e;
            return d10 == g10;
        }

        public final List l(Throwable th2) {
            ArrayList arrayList;
            Sh.G g10;
            Object d10 = d();
            if (d10 == null) {
                arrayList = c();
            } else if (d10 instanceof Throwable) {
                ArrayList c10 = c();
                c10.add(d10);
                arrayList = c10;
            } else {
                if (!(d10 instanceof ArrayList)) {
                    throw new IllegalStateException(("State is " + d10).toString());
                }
                arrayList = (ArrayList) d10;
            }
            Throwable e10 = e();
            if (e10 != null) {
                arrayList.add(0, e10);
            }
            if (th2 != null && !Intrinsics.areEqual(th2, e10)) {
                arrayList.add(th2);
            }
            g10 = J0.f9035e;
            n(g10);
            return arrayList;
        }

        public final void m(boolean z10) {
            f9015b.set(this, z10 ? 1 : 0);
        }

        public final void n(Object obj) {
            f9017d.set(this, obj);
        }

        public final void o(Throwable th2) {
            f9016c.set(this, th2);
        }

        public String toString() {
            return "Finishing[cancelling=" + i() + ", completing=" + j() + ", rootCause=" + e() + ", exceptions=" + d() + ", list=" + b() + ']';
        }
    }

    public final class d extends H0 {

        /* renamed from: e, reason: collision with root package name */
        public final Vh.f f9019e;

        public d(Vh.f fVar) {
            this.f9019e = fVar;
        }

        @Override // Ph.H0
        public boolean u() {
            return false;
        }

        @Override // Ph.H0
        public void v(Throwable th2) {
            Object V10 = I0.this.V();
            if (!(V10 instanceof C)) {
                V10 = J0.h(V10);
            }
            this.f9019e.e(I0.this, V10);
        }
    }

    public final class e extends H0 {

        /* renamed from: e, reason: collision with root package name */
        public final Vh.f f9021e;

        public e(Vh.f fVar) {
            this.f9021e = fVar;
        }

        @Override // Ph.H0
        public boolean u() {
            return false;
        }

        @Override // Ph.H0
        public void v(Throwable th2) {
            this.f9021e.e(I0.this, Unit.INSTANCE);
        }
    }

    public static final class f extends RestrictedSuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public Object f9023n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9024o;

        /* renamed from: p, reason: collision with root package name */
        public int f9025p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f9026q;

        public f(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            f fVar = I0.this.new f(continuation);
            fVar.f9026q = obj;
            return fVar;
        }

        /* JADX WARN: Code restructure failed: missing block: B:12:0x007e, code lost:
        
            if (r4.yield(r6, r5) == r0) goto L26;
         */
        /* JADX WARN: Code restructure failed: missing block: B:13:0x0080, code lost:
        
            return r0;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0045, code lost:
        
            if (r6.yield(r1, r5) == r0) goto L26;
         */
        /* JADX WARN: Removed duplicated region for block: B:9:0x0069  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x006b -> B:6:0x0081). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:12:0x007e -> B:6:0x0081). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object invokeSuspend(Object obj) {
            N0 b10;
            AbstractC1578p abstractC1578p;
            C1579q c1579q;
            SequenceScope sequenceScope;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f9025p;
            if (i10 == 0) {
                ResultKt.throwOnFailure(obj);
                SequenceScope sequenceScope2 = (SequenceScope) this.f9026q;
                Object V10 = I0.this.V();
                if (V10 instanceof C1480v) {
                    InterfaceC1482w interfaceC1482w = ((C1480v) V10).f9134e;
                    this.f9025p = 1;
                } else if ((V10 instanceof InterfaceC1487y0) && (b10 = ((InterfaceC1487y0) V10).b()) != null) {
                    Object j10 = b10.j();
                    Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
                    C1579q c1579q2 = (C1579q) j10;
                    abstractC1578p = b10;
                    c1579q = c1579q2;
                    sequenceScope = sequenceScope2;
                    if (!Intrinsics.areEqual(c1579q, abstractC1578p)) {
                    }
                }
            } else if (i10 == 1) {
                ResultKt.throwOnFailure(obj);
            } else {
                if (i10 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                c1579q = (C1579q) this.f9024o;
                abstractC1578p = (AbstractC1578p) this.f9023n;
                sequenceScope = (SequenceScope) this.f9026q;
                ResultKt.throwOnFailure(obj);
                c1579q = c1579q.k();
                if (!Intrinsics.areEqual(c1579q, abstractC1578p)) {
                    if (c1579q instanceof C1480v) {
                        InterfaceC1482w interfaceC1482w2 = ((C1480v) c1579q).f9134e;
                        this.f9026q = sequenceScope;
                        this.f9023n = abstractC1578p;
                        this.f9024o = c1579q;
                        this.f9025p = 2;
                    }
                    c1579q = c1579q.k();
                    if (!Intrinsics.areEqual(c1579q, abstractC1578p)) {
                    }
                }
            }
            return Unit.INSTANCE;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(SequenceScope sequenceScope, Continuation continuation) {
            return ((f) create(sequenceScope, continuation)).invokeSuspend(Unit.INSTANCE);
        }
    }

    public /* synthetic */ class g extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a, reason: collision with root package name */
        public static final g f9028a = new g();

        public g() {
            super(3, I0.class, "onAwaitInternalRegFunc", "onAwaitInternalRegFunc(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(I0 i02, Vh.f fVar, Object obj) {
            i02.o0(fVar, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((I0) obj, (Vh.f) obj2, obj3);
            return Unit.INSTANCE;
        }
    }

    public /* synthetic */ class h extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a, reason: collision with root package name */
        public static final h f9029a = new h();

        public h() {
            super(3, I0.class, "onAwaitInternalProcessResFunc", "onAwaitInternalProcessResFunc(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", 0);
        }

        @Override // kotlin.jvm.functions.Function3
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Object invoke(I0 i02, Object obj, Object obj2) {
            return i02.n0(obj, obj2);
        }
    }

    public /* synthetic */ class i extends FunctionReferenceImpl implements Function3 {

        /* renamed from: a, reason: collision with root package name */
        public static final i f9030a = new i();

        public i() {
            super(3, I0.class, "registerSelectForOnJoin", "registerSelectForOnJoin(Lkotlinx/coroutines/selects/SelectInstance;Ljava/lang/Object;)V", 0);
        }

        public final void a(I0 i02, Vh.f fVar, Object obj) {
            i02.u0(fVar, obj);
        }

        @Override // kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            a((I0) obj, (Vh.f) obj2, obj3);
            return Unit.INSTANCE;
        }
    }

    public I0(boolean z10) {
        this._state$volatile = z10 ? J0.f9037g : J0.f9036f;
    }

    public static /* synthetic */ CancellationException C0(I0 i02, Throwable th2, String str, int i10, Object obj) {
        if (obj != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: toCancellationException");
        }
        if ((i10 & 1) != 0) {
            str = null;
        }
        return i02.B0(th2, str);
    }

    public final Object A(Continuation continuation) {
        a aVar = new a(IntrinsicsKt.intercepted(continuation), this);
        aVar.F();
        r.a(aVar, G0.p(this, false, new S0(aVar), 1, null));
        Object z10 = aVar.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10;
    }

    public final boolean B(Throwable th2) {
        return C(th2);
    }

    public final CancellationException B0(Throwable th2, String str) {
        CancellationException cancellationException = th2 instanceof CancellationException ? (CancellationException) th2 : null;
        if (cancellationException == null) {
            if (str == null) {
                str = G();
            }
            cancellationException = new D0(str, th2, this);
        }
        return cancellationException;
    }

    public final boolean C(Object obj) {
        Object obj2;
        Sh.G g10;
        Sh.G g11;
        Sh.G g12;
        obj2 = J0.f9031a;
        if (S() && (obj2 = E(obj)) == J0.f9032b) {
            return true;
        }
        g10 = J0.f9031a;
        if (obj2 == g10) {
            obj2 = f0(obj);
        }
        g11 = J0.f9031a;
        if (obj2 == g11 || obj2 == J0.f9032b) {
            return true;
        }
        g12 = J0.f9034d;
        if (obj2 == g12) {
            return false;
        }
        y(obj2);
        return true;
    }

    public void D(Throwable th2) {
        C(th2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v11, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v7, types: [java.lang.Throwable] */
    @Override // Ph.R0
    public CancellationException D0() {
        CancellationException cancellationException;
        Object V10 = V();
        if (V10 instanceof c) {
            cancellationException = ((c) V10).e();
        } else if (V10 instanceof C) {
            cancellationException = ((C) V10).f9000a;
        } else {
            if (V10 instanceof InterfaceC1487y0) {
                throw new IllegalStateException(("Cannot be cancelling child in this state: " + V10).toString());
            }
            cancellationException = null;
        }
        CancellationException cancellationException2 = cancellationException instanceof CancellationException ? cancellationException : null;
        if (cancellationException2 != null) {
            return cancellationException2;
        }
        return new D0("Parent job is " + y0(V10), cancellationException, this);
    }

    public final Object E(Object obj) {
        Sh.G g10;
        Object H02;
        Sh.G g11;
        do {
            Object V10 = V();
            if (!(V10 instanceof InterfaceC1487y0) || ((V10 instanceof c) && ((c) V10).j())) {
                g10 = J0.f9031a;
                return g10;
            }
            H02 = H0(V10, new C(K(obj), false, 2, null));
            g11 = J0.f9033c;
        } while (H02 == g11);
        return H02;
    }

    public final String E0() {
        return i0() + '{' + y0(V()) + '}';
    }

    public final boolean F(Throwable th2) {
        if (c0()) {
            return true;
        }
        boolean z10 = th2 instanceof CancellationException;
        InterfaceC1478u U10 = U();
        return (U10 == null || U10 == P0.f9046a) ? z10 : U10.a(th2) || z10;
    }

    public final boolean F0(InterfaceC1487y0 interfaceC1487y0, Object obj) {
        if (!AbstractC4221b.a(f9008a, this, interfaceC1487y0, J0.g(obj))) {
            return false;
        }
        p0(null);
        q0(obj);
        I(interfaceC1487y0, obj);
        return true;
    }

    public String G() {
        return "Job was cancelled";
    }

    public final boolean G0(InterfaceC1487y0 interfaceC1487y0, Throwable th2) {
        N0 T10 = T(interfaceC1487y0);
        if (T10 == null) {
            return false;
        }
        if (!AbstractC4221b.a(f9008a, this, interfaceC1487y0, new c(T10, false, th2))) {
            return false;
        }
        l0(T10, th2);
        return true;
    }

    public boolean H(Throwable th2) {
        if (th2 instanceof CancellationException) {
            return true;
        }
        return C(th2) && Q();
    }

    public final Object H0(Object obj, Object obj2) {
        Sh.G g10;
        Sh.G g11;
        if (!(obj instanceof InterfaceC1487y0)) {
            g11 = J0.f9031a;
            return g11;
        }
        if ((!(obj instanceof C1462l0) && !(obj instanceof H0)) || (obj instanceof C1480v) || (obj2 instanceof C)) {
            return I0((InterfaceC1487y0) obj, obj2);
        }
        if (F0((InterfaceC1487y0) obj, obj2)) {
            return obj2;
        }
        g10 = J0.f9033c;
        return g10;
    }

    public final void I(InterfaceC1487y0 interfaceC1487y0, Object obj) {
        InterfaceC1478u U10 = U();
        if (U10 != null) {
            U10.dispose();
            w0(P0.f9046a);
        }
        C c10 = obj instanceof C ? (C) obj : null;
        Throwable th2 = c10 != null ? c10.f9000a : null;
        if (!(interfaceC1487y0 instanceof H0)) {
            N0 b10 = interfaceC1487y0.b();
            if (b10 != null) {
                m0(b10, th2);
                return;
            }
            return;
        }
        try {
            ((H0) interfaceC1487y0).v(th2);
        } catch (Throwable th3) {
            Z(new D("Exception in completion handler " + interfaceC1487y0 + " for " + this, th3));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0 */
    /* JADX WARN: Type inference failed for: r2v1, types: [T, java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r2v2 */
    public final Object I0(InterfaceC1487y0 interfaceC1487y0, Object obj) {
        Sh.G g10;
        Sh.G g11;
        Sh.G g12;
        N0 T10 = T(interfaceC1487y0);
        if (T10 == null) {
            g12 = J0.f9033c;
            return g12;
        }
        c cVar = interfaceC1487y0 instanceof c ? (c) interfaceC1487y0 : null;
        if (cVar == null) {
            cVar = new c(T10, false, null);
        }
        Ref.ObjectRef objectRef = new Ref.ObjectRef();
        synchronized (cVar) {
            if (cVar.j()) {
                g11 = J0.f9031a;
                return g11;
            }
            cVar.m(true);
            if (cVar != interfaceC1487y0 && !AbstractC4221b.a(f9008a, this, interfaceC1487y0, cVar)) {
                g10 = J0.f9033c;
                return g10;
            }
            boolean i10 = cVar.i();
            C c10 = obj instanceof C ? (C) obj : null;
            if (c10 != null) {
                cVar.a(c10.f9000a);
            }
            ?? e10 = i10 ? 0 : cVar.e();
            objectRef.element = e10;
            Unit unit = Unit.INSTANCE;
            if (e10 != 0) {
                l0(T10, e10);
            }
            C1480v j02 = j0(T10);
            if (j02 != null && J0(cVar, j02, obj)) {
                return J0.f9032b;
            }
            T10.f(2);
            C1480v j03 = j0(T10);
            return (j03 == null || !J0(cVar, j03, obj)) ? L(cVar, obj) : J0.f9032b;
        }
    }

    public final void J(c cVar, C1480v c1480v, Object obj) {
        C1480v j02 = j0(c1480v);
        if (j02 == null || !J0(cVar, j02, obj)) {
            cVar.b().f(2);
            C1480v j03 = j0(c1480v);
            if (j03 == null || !J0(cVar, j03, obj)) {
                y(L(cVar, obj));
            }
        }
    }

    public final boolean J0(c cVar, C1480v c1480v, Object obj) {
        while (F0.o(c1480v.f9134e, false, new b(this, cVar, c1480v, obj)) == P0.f9046a) {
            c1480v = j0(c1480v);
            if (c1480v == null) {
                return false;
            }
        }
        return true;
    }

    public final Throwable K(Object obj) {
        if (obj == null ? true : obj instanceof Throwable) {
            Throwable th2 = (Throwable) obj;
            return th2 == null ? new D0(G(), null, this) : th2;
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.ParentJob");
        return ((R0) obj).D0();
    }

    public final Object L(c cVar, Object obj) {
        boolean i10;
        Throwable P10;
        C c10 = obj instanceof C ? (C) obj : null;
        Throwable th2 = c10 != null ? c10.f9000a : null;
        synchronized (cVar) {
            i10 = cVar.i();
            List l10 = cVar.l(th2);
            P10 = P(cVar, l10);
            if (P10 != null) {
                x(P10, l10);
            }
        }
        if (P10 != null && P10 != th2) {
            obj = new C(P10, false, 2, null);
        }
        if (P10 != null && (F(P10) || Y(P10))) {
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CompletedExceptionally");
            ((C) obj).c();
        }
        if (!i10) {
            p0(P10);
        }
        q0(obj);
        AbstractC4221b.a(f9008a, this, cVar, J0.g(obj));
        I(cVar, obj);
        return obj;
    }

    public final Object M() {
        Object V10 = V();
        if (V10 instanceof InterfaceC1487y0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        if (V10 instanceof C) {
            throw ((C) V10).f9000a;
        }
        return J0.h(V10);
    }

    public final Throwable O(Object obj) {
        C c10 = obj instanceof C ? (C) obj : null;
        if (c10 != null) {
            return c10.f9000a;
        }
        return null;
    }

    public final Throwable P(c cVar, List list) {
        Object obj;
        Object obj2 = null;
        if (list.isEmpty()) {
            if (cVar.i()) {
                return new D0(G(), null, this);
            }
            return null;
        }
        List list2 = list;
        Iterator it = list2.iterator();
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
        Throwable th3 = (Throwable) list.get(0);
        if (th3 instanceof f1) {
            Iterator it2 = list2.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    break;
                }
                Object next = it2.next();
                Throwable th4 = (Throwable) next;
                if (th4 != th3 && (th4 instanceof f1)) {
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

    public boolean Q() {
        return true;
    }

    public final Vh.c R() {
        g gVar = g.f9028a;
        Intrinsics.checkNotNull(gVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        Function3 function3 = (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(gVar, 3);
        h hVar = h.f9029a;
        Intrinsics.checkNotNull(hVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"param\")] kotlin.Any?, @[ParameterName(name = \"clauseResult\")] kotlin.Any?, kotlin.Any?>");
        return new Vh.d(this, function3, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(hVar, 3), null, 8, null);
    }

    public boolean S() {
        return false;
    }

    public final N0 T(InterfaceC1487y0 interfaceC1487y0) {
        N0 b10 = interfaceC1487y0.b();
        if (b10 != null) {
            return b10;
        }
        if (interfaceC1487y0 instanceof C1462l0) {
            return new N0();
        }
        if (interfaceC1487y0 instanceof H0) {
            t0((H0) interfaceC1487y0);
            return null;
        }
        throw new IllegalStateException(("State should have list: " + interfaceC1487y0).toString());
    }

    public final InterfaceC1478u U() {
        return (InterfaceC1478u) f9009b.get(this);
    }

    public final Object V() {
        return f9008a.get(this);
    }

    public boolean Y(Throwable th2) {
        return false;
    }

    public final void a0(C0 c02) {
        if (c02 == null) {
            w0(P0.f9046a);
            return;
        }
        c02.start();
        InterfaceC1478u attachChild = c02.attachChild(this);
        w0(attachChild);
        if (isCompleted()) {
            attachChild.dispose();
            w0(P0.f9046a);
        }
    }

    @Override // Ph.C0
    public final InterfaceC1478u attachChild(InterfaceC1482w interfaceC1482w) {
        C1480v c1480v = new C1480v(interfaceC1482w);
        c1480v.w(this);
        while (true) {
            Object V10 = V();
            if (V10 instanceof C1462l0) {
                C1462l0 c1462l0 = (C1462l0) V10;
                if (!c1462l0.isActive()) {
                    s0(c1462l0);
                } else if (AbstractC4221b.a(f9008a, this, V10, c1480v)) {
                    return c1480v;
                }
            } else {
                if (!(V10 instanceof InterfaceC1487y0)) {
                    Object V11 = V();
                    C c10 = V11 instanceof C ? (C) V11 : null;
                    c1480v.v(c10 != null ? c10.f9000a : null);
                    return P0.f9046a;
                }
                N0 b10 = ((InterfaceC1487y0) V10).b();
                if (b10 != null) {
                    if (!b10.c(c1480v, 7)) {
                        boolean c11 = b10.c(c1480v, 3);
                        Object V12 = V();
                        if (V12 instanceof c) {
                            r2 = ((c) V12).e();
                        } else {
                            C c12 = V12 instanceof C ? (C) V12 : null;
                            if (c12 != null) {
                                r2 = c12.f9000a;
                            }
                        }
                        c1480v.v(r2);
                        if (!c11) {
                            return P0.f9046a;
                        }
                    }
                    return c1480v;
                }
                Intrinsics.checkNotNull(V10, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                t0((H0) V10);
            }
        }
    }

    public final InterfaceC1456i0 b0(boolean z10, H0 h02) {
        boolean z11;
        boolean c10;
        h02.w(this);
        while (true) {
            Object V10 = V();
            z11 = true;
            if (!(V10 instanceof C1462l0)) {
                if (!(V10 instanceof InterfaceC1487y0)) {
                    z11 = false;
                    break;
                }
                InterfaceC1487y0 interfaceC1487y0 = (InterfaceC1487y0) V10;
                N0 b10 = interfaceC1487y0.b();
                if (b10 == null) {
                    Intrinsics.checkNotNull(V10, "null cannot be cast to non-null type kotlinx.coroutines.JobNode");
                    t0((H0) V10);
                } else {
                    if (h02.u()) {
                        c cVar = interfaceC1487y0 instanceof c ? (c) interfaceC1487y0 : null;
                        Throwable e10 = cVar != null ? cVar.e() : null;
                        if (e10 != null) {
                            if (z10) {
                                h02.v(e10);
                            }
                            return P0.f9046a;
                        }
                        c10 = b10.c(h02, 5);
                    } else {
                        c10 = b10.c(h02, 1);
                    }
                    if (c10) {
                        break;
                    }
                }
            } else {
                C1462l0 c1462l0 = (C1462l0) V10;
                if (!c1462l0.isActive()) {
                    s0(c1462l0);
                } else if (AbstractC4221b.a(f9008a, this, V10, h02)) {
                    break;
                }
            }
        }
        if (z11) {
            return h02;
        }
        if (z10) {
            Object V11 = V();
            C c11 = V11 instanceof C ? (C) V11 : null;
            h02.v(c11 != null ? c11.f9000a : null);
        }
        return P0.f9046a;
    }

    public boolean c0() {
        return false;
    }

    @Override // Ph.C0
    public /* synthetic */ void cancel() {
        cancel((CancellationException) null);
    }

    public final boolean d0() {
        Object V10;
        do {
            V10 = V();
            if (!(V10 instanceof InterfaceC1487y0)) {
                return false;
            }
        } while (x0(V10) < 0);
        return true;
    }

    public final Object e0(Continuation continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        r.a(c1469p, G0.p(this, false, new T0(c1469p), 1, null));
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    public final Object f0(Object obj) {
        Sh.G g10;
        Sh.G g11;
        Sh.G g12;
        Sh.G g13;
        Sh.G g14;
        Sh.G g15;
        Throwable th2 = null;
        while (true) {
            Object V10 = V();
            if (V10 instanceof c) {
                synchronized (V10) {
                    if (((c) V10).k()) {
                        g11 = J0.f9034d;
                        return g11;
                    }
                    boolean i10 = ((c) V10).i();
                    if (obj != null || !i10) {
                        if (th2 == null) {
                            th2 = K(obj);
                        }
                        ((c) V10).a(th2);
                    }
                    Throwable e10 = i10 ? null : ((c) V10).e();
                    if (e10 != null) {
                        l0(((c) V10).b(), e10);
                    }
                    g10 = J0.f9031a;
                    return g10;
                }
            }
            if (!(V10 instanceof InterfaceC1487y0)) {
                g12 = J0.f9034d;
                return g12;
            }
            if (th2 == null) {
                th2 = K(obj);
            }
            InterfaceC1487y0 interfaceC1487y0 = (InterfaceC1487y0) V10;
            if (!interfaceC1487y0.isActive()) {
                Object H02 = H0(V10, new C(th2, false, 2, null));
                g14 = J0.f9031a;
                if (H02 == g14) {
                    throw new IllegalStateException(("Cannot happen in " + V10).toString());
                }
                g15 = J0.f9033c;
                if (H02 != g15) {
                    return H02;
                }
            } else if (G0(interfaceC1487y0, th2)) {
                g13 = J0.f9031a;
                return g13;
            }
        }
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public Object fold(Object obj, Function2 function2) {
        return C0.a.c(this, obj, function2);
    }

    public final boolean g0(Object obj) {
        Object H02;
        Sh.G g10;
        Sh.G g11;
        do {
            H02 = H0(V(), obj);
            g10 = J0.f9031a;
            if (H02 == g10) {
                return false;
            }
            if (H02 == J0.f9032b) {
                return true;
            }
            g11 = J0.f9033c;
        } while (H02 == g11);
        y(H02);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext.Element get(CoroutineContext.Key key) {
        return C0.a.d(this, key);
    }

    @Override // Ph.C0
    public final CancellationException getCancellationException() {
        Object V10 = V();
        if (!(V10 instanceof c)) {
            if (V10 instanceof InterfaceC1487y0) {
                throw new IllegalStateException(("Job is still new or active: " + this).toString());
            }
            if (V10 instanceof C) {
                return C0(this, ((C) V10).f9000a, null, 1, null);
            }
            return new D0(U.a(this) + " has completed normally", null, this);
        }
        Throwable e10 = ((c) V10).e();
        if (e10 != null) {
            CancellationException B02 = B0(e10, U.a(this) + " is cancelling");
            if (B02 != null) {
                return B02;
            }
        }
        throw new IllegalStateException(("Job is still new or active: " + this).toString());
    }

    @Override // Ph.C0
    public final Sequence getChildren() {
        return SequencesKt.sequence(new f(null));
    }

    public final Throwable getCompletionExceptionOrNull() {
        Object V10 = V();
        if (V10 instanceof InterfaceC1487y0) {
            throw new IllegalStateException("This job has not completed yet");
        }
        return O(V10);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element
    public final CoroutineContext.Key getKey() {
        return C0.f9001U2;
    }

    @Override // Ph.C0
    public final Vh.a getOnJoin() {
        i iVar = i.f9030a;
        Intrinsics.checkNotNull(iVar, "null cannot be cast to non-null type kotlin.Function3<@[ParameterName(name = \"clauseObject\")] kotlin.Any, @[ParameterName(name = \"select\")] kotlinx.coroutines.selects.SelectInstance<*>, @[ParameterName(name = \"param\")] kotlin.Any?, kotlin.Unit>");
        return new Vh.b(this, (Function3) TypeIntrinsics.beforeCheckcastToFunctionOfArity(iVar, 3), null, 4, null);
    }

    @Override // Ph.C0
    public C0 getParent() {
        InterfaceC1478u U10 = U();
        if (U10 != null) {
            return U10.getParent();
        }
        return null;
    }

    public final Object h0(Object obj) {
        Object H02;
        Sh.G g10;
        Sh.G g11;
        do {
            H02 = H0(V(), obj);
            g10 = J0.f9031a;
            if (H02 == g10) {
                throw new IllegalStateException("Job " + this + " is already complete or completing, but is being completed with " + obj, O(obj));
            }
            g11 = J0.f9033c;
        } while (H02 == g11);
        return H02;
    }

    public String i0() {
        return U.a(this);
    }

    @Override // Ph.C0
    public final InterfaceC1456i0 invokeOnCompletion(Function1 function1) {
        return b0(true, new B0(function1));
    }

    @Override // Ph.C0
    public boolean isActive() {
        Object V10 = V();
        return (V10 instanceof InterfaceC1487y0) && ((InterfaceC1487y0) V10).isActive();
    }

    @Override // Ph.C0
    public final boolean isCancelled() {
        Object V10 = V();
        if (V10 instanceof C) {
            return true;
        }
        return (V10 instanceof c) && ((c) V10).i();
    }

    @Override // Ph.C0
    public final boolean isCompleted() {
        return !(V() instanceof InterfaceC1487y0);
    }

    public final C1480v j0(C1579q c1579q) {
        while (c1579q.p()) {
            c1579q = c1579q.l();
        }
        while (true) {
            c1579q = c1579q.k();
            if (!c1579q.p()) {
                if (c1579q instanceof C1480v) {
                    return (C1480v) c1579q;
                }
                if (c1579q instanceof N0) {
                    return null;
                }
            }
        }
    }

    @Override // Ph.C0
    public final Object join(Continuation continuation) {
        if (d0()) {
            Object e02 = e0(continuation);
            return e02 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? e02 : Unit.INSTANCE;
        }
        F0.m(continuation.get$context());
        return Unit.INSTANCE;
    }

    public final void l0(N0 n02, Throwable th2) {
        p0(th2);
        n02.f(4);
        Object j10 = n02.j();
        Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d10 = null;
        for (C1579q c1579q = (C1579q) j10; !Intrinsics.areEqual(c1579q, n02); c1579q = c1579q.k()) {
            if ((c1579q instanceof H0) && ((H0) c1579q).u()) {
                try {
                    ((H0) c1579q).v(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        ExceptionsKt.addSuppressed(d10, th3);
                    } else {
                        d10 = new D("Exception in completion handler " + c1579q + " for " + this, th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (d10 != null) {
            Z(d10);
        }
        F(th2);
    }

    public final void m0(N0 n02, Throwable th2) {
        n02.f(1);
        Object j10 = n02.j();
        Intrinsics.checkNotNull(j10, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeLinkedListNode");
        D d10 = null;
        for (C1579q c1579q = (C1579q) j10; !Intrinsics.areEqual(c1579q, n02); c1579q = c1579q.k()) {
            if (c1579q instanceof H0) {
                try {
                    ((H0) c1579q).v(th2);
                } catch (Throwable th3) {
                    if (d10 != null) {
                        ExceptionsKt.addSuppressed(d10, th3);
                    } else {
                        d10 = new D("Exception in completion handler " + c1579q + " for " + this, th3);
                        Unit unit = Unit.INSTANCE;
                    }
                }
            }
        }
        if (d10 != null) {
            Z(d10);
        }
    }

    @Override // Ph.InterfaceC1482w
    public final void m1(R0 r02) {
        C(r02);
    }

    @Override // kotlin.coroutines.CoroutineContext.Element, kotlin.coroutines.CoroutineContext
    public CoroutineContext minusKey(CoroutineContext.Key key) {
        return C0.a.f(this, key);
    }

    public final Object n0(Object obj, Object obj2) {
        if (obj2 instanceof C) {
            throw ((C) obj2).f9000a;
        }
        return obj2;
    }

    public final void o0(Vh.f fVar, Object obj) {
        Object V10;
        do {
            V10 = V();
            if (!(V10 instanceof InterfaceC1487y0)) {
                if (!(V10 instanceof C)) {
                    V10 = J0.h(V10);
                }
                fVar.c(V10);
                return;
            }
        } while (x0(V10) < 0);
        fVar.d(G0.p(this, false, new d(fVar), 1, null));
    }

    @Override // Ph.C0
    public C0 plus(C0 c02) {
        return C0.a.g(this, c02);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [Ph.x0] */
    public final void s0(C1462l0 c1462l0) {
        N0 n02 = new N0();
        if (!c1462l0.isActive()) {
            n02 = new C1485x0(n02);
        }
        AbstractC4221b.a(f9008a, this, c1462l0, n02);
    }

    @Override // Ph.C0
    public final boolean start() {
        int x02;
        do {
            x02 = x0(V());
            if (x02 == 0) {
                return false;
            }
        } while (x02 != 1);
        return true;
    }

    public final void t0(H0 h02) {
        h02.e(new N0());
        AbstractC4221b.a(f9008a, this, h02, h02.k());
    }

    public String toString() {
        return E0() + '@' + U.b(this);
    }

    public final void u0(Vh.f fVar, Object obj) {
        if (d0()) {
            fVar.d(G0.p(this, false, new e(fVar), 1, null));
        } else {
            fVar.c(Unit.INSTANCE);
        }
    }

    public final void v0(H0 h02) {
        Object V10;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        C1462l0 c1462l0;
        do {
            V10 = V();
            if (!(V10 instanceof H0)) {
                if (!(V10 instanceof InterfaceC1487y0) || ((InterfaceC1487y0) V10).b() == null) {
                    return;
                }
                h02.q();
                return;
            }
            if (V10 != h02) {
                return;
            }
            atomicReferenceFieldUpdater = f9008a;
            c1462l0 = J0.f9037g;
        } while (!AbstractC4221b.a(atomicReferenceFieldUpdater, this, V10, c1462l0));
    }

    public final void w0(InterfaceC1478u interfaceC1478u) {
        f9009b.set(this, interfaceC1478u);
    }

    public final void x(Throwable th2, List list) {
        if (list.size() <= 1) {
            return;
        }
        Set newSetFromMap = Collections.newSetFromMap(new IdentityHashMap(list.size()));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            Throwable th3 = (Throwable) it.next();
            if (th3 != th2 && th3 != th2 && !(th3 instanceof CancellationException) && newSetFromMap.add(th3)) {
                ExceptionsKt.addSuppressed(th2, th3);
            }
        }
    }

    public final int x0(Object obj) {
        C1462l0 c1462l0;
        if (!(obj instanceof C1462l0)) {
            if (!(obj instanceof C1485x0)) {
                return 0;
            }
            if (!AbstractC4221b.a(f9008a, this, obj, ((C1485x0) obj).b())) {
                return -1;
            }
            r0();
            return 1;
        }
        if (((C1462l0) obj).isActive()) {
            return 0;
        }
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f9008a;
        c1462l0 = J0.f9037g;
        if (!AbstractC4221b.a(atomicReferenceFieldUpdater, this, obj, c1462l0)) {
            return -1;
        }
        r0();
        return 1;
    }

    public final String y0(Object obj) {
        if (!(obj instanceof c)) {
            return obj instanceof InterfaceC1487y0 ? ((InterfaceC1487y0) obj).isActive() ? "Active" : "New" : obj instanceof C ? "Cancelled" : "Completed";
        }
        c cVar = (c) obj;
        return cVar.i() ? "Cancelling" : cVar.j() ? "Completing" : "Active";
    }

    public final Object z(Continuation continuation) {
        Object V10;
        do {
            V10 = V();
            if (!(V10 instanceof InterfaceC1487y0)) {
                if (V10 instanceof C) {
                    throw ((C) V10).f9000a;
                }
                return J0.h(V10);
            }
        } while (x0(V10) < 0);
        return A(continuation);
    }

    @Override // Ph.C0
    public /* synthetic */ boolean cancel(Throwable th2) {
        Throwable d02;
        if (th2 == null || (d02 = C0(this, th2, null, 1, null)) == null) {
            d02 = new D0(G(), null, this);
        }
        D(d02);
        return true;
    }

    @Override // kotlin.coroutines.CoroutineContext
    public CoroutineContext plus(CoroutineContext coroutineContext) {
        return C0.a.h(this, coroutineContext);
    }

    @Override // Ph.C0
    public final InterfaceC1456i0 invokeOnCompletion(boolean z10, boolean z11, Function1 function1) {
        H0 b02;
        if (z10) {
            b02 = new A0(function1);
        } else {
            b02 = new B0(function1);
        }
        return b0(z11, b02);
    }

    @Override // Ph.C0
    public void cancel(CancellationException cancellationException) {
        if (cancellationException == null) {
            cancellationException = new D0(G(), null, this);
        }
        D(cancellationException);
    }

    public void r0() {
    }

    public void Z(Throwable th2) {
        throw th2;
    }

    public void p0(Throwable th2) {
    }

    public void q0(Object obj) {
    }

    public void y(Object obj) {
    }
}
