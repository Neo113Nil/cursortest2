package kotlinx.coroutines.flow;

import Ph.C0;
import Ph.C1469p;
import Ph.InterfaceC1456i0;
import java.util.Arrays;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.internal.AbstractC5326b;
import kotlinx.coroutines.flow.internal.AbstractC5327c;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes5.dex */
public class D extends AbstractC5326b implements x, InterfaceC5321f, kotlinx.coroutines.flow.internal.q {

    @Nullable
    private Object[] buffer;

    /* renamed from: d, reason: collision with root package name */
    public final int f54612d;

    /* renamed from: e, reason: collision with root package name */
    public final int f54613e;

    /* renamed from: f, reason: collision with root package name */
    public final Rh.d f54614f;

    /* renamed from: g, reason: collision with root package name */
    public long f54615g;

    /* renamed from: h, reason: collision with root package name */
    public long f54616h;

    /* renamed from: i, reason: collision with root package name */
    public int f54617i;

    /* renamed from: j, reason: collision with root package name */
    public int f54618j;

    public static final class a implements InterfaceC1456i0 {

        /* renamed from: a, reason: collision with root package name */
        public final D f54619a;

        /* renamed from: b, reason: collision with root package name */
        public long f54620b;

        /* renamed from: c, reason: collision with root package name */
        public final Object f54621c;

        /* renamed from: d, reason: collision with root package name */
        public final Continuation f54622d;

        public a(D d10, long j10, Object obj, Continuation continuation) {
            this.f54619a = d10;
            this.f54620b = j10;
            this.f54621c = obj;
            this.f54622d = continuation;
        }

        @Override // Ph.InterfaceC1456i0
        public void dispose() {
            this.f54619a.y(this);
        }
    }

    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Rh.d.values().length];
            try {
                iArr[Rh.d.f10307a.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Rh.d.f10309c.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Rh.d.f10308b.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public static final class c extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f54623n;

        /* renamed from: o, reason: collision with root package name */
        public Object f54624o;

        /* renamed from: p, reason: collision with root package name */
        public Object f54625p;

        /* renamed from: q, reason: collision with root package name */
        public Object f54626q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f54627r;

        /* renamed from: t, reason: collision with root package name */
        public int f54629t;

        public c(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f54627r = obj;
            this.f54629t |= Integer.MIN_VALUE;
            return D.A(D.this, null, this);
        }
    }

    public D(int i10, int i11, Rh.d dVar) {
        this.f54612d = i10;
        this.f54613e = i11;
        this.f54614f = dVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x00ab, code lost:
    
        if (r8 == null) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00ad, code lost:
    
        Ph.F0.l(r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00b0, code lost:
    
        r0.f54623n = r5;
        r0.f54624o = r2;
        r0.f54625p = r9;
        r0.f54626q = r8;
        r0.f54629t = 3;
        r5 = r5;
        r9 = r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00be, code lost:
    
        if (r2.emit(r10, r0) != r1) goto L16;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009a A[Catch: all -> 0x0042, TryCatch #1 {all -> 0x0042, blocks: (B:14:0x003b, B:18:0x0092, B:20:0x009a, B:29:0x00ad, B:30:0x00b0, B:36:0x005d), top: B:7:0x0022 }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab A[EDGE_INSN: B:27:0x00ab->B:28:0x00ab BREAK  A[LOOP:0: B:18:0x0092->B:26:?], SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0077  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r5v1, types: [kotlinx.coroutines.flow.internal.b] */
    /* JADX WARN: Type inference failed for: r5v14 */
    /* JADX WARN: Type inference failed for: r5v2 */
    /* JADX WARN: Type inference failed for: r5v4, types: [java.lang.Object, kotlinx.coroutines.flow.D] */
    /* JADX WARN: Type inference failed for: r5v5 */
    /* JADX WARN: Type inference failed for: r5v7 */
    /* JADX WARN: Type inference failed for: r9v0, types: [kotlinx.coroutines.flow.g] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v2, types: [kotlinx.coroutines.flow.internal.d] */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v4 */
    /* JADX WARN: Type inference failed for: r9v5, types: [java.lang.Object, kotlinx.coroutines.flow.F] */
    /* JADX WARN: Type inference failed for: r9v9, types: [kotlinx.coroutines.flow.F] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:27:0x00be -> B:15:0x003e). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static /* synthetic */ Object A(D d10, InterfaceC5322g interfaceC5322g, Continuation continuation) {
        c cVar;
        int i10;
        ?? r52;
        InterfaceC5322g interfaceC5322g2;
        C0 c02;
        C0 c03;
        InterfaceC5322g interfaceC5322g3;
        Object U10;
        F f10;
        try {
            try {
                if (continuation instanceof c) {
                    cVar = (c) continuation;
                    int i11 = cVar.f54629t;
                    if ((i11 & Integer.MIN_VALUE) != 0) {
                        cVar.f54629t = i11 - Integer.MIN_VALUE;
                        Object obj = cVar.f54627r;
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        i10 = cVar.f54629t;
                        if (i10 != 0) {
                            ResultKt.throwOnFailure(obj);
                            interfaceC5322g2 = interfaceC5322g;
                            interfaceC5322g = (F) d10.f();
                        } else {
                            if (i10 != 1) {
                                if (i10 == 2) {
                                    c03 = (C0) cVar.f54626q;
                                    F f11 = (F) cVar.f54625p;
                                    interfaceC5322g3 = (InterfaceC5322g) cVar.f54624o;
                                    D d11 = (D) cVar.f54623n;
                                    ResultKt.throwOnFailure(obj);
                                    r52 = d11;
                                    interfaceC5322g = f11;
                                    while (true) {
                                        U10 = r52.U(interfaceC5322g);
                                        if (U10 != E.f54630a) {
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                if (i10 != 3) {
                                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                                }
                                c03 = (C0) cVar.f54626q;
                                F f12 = (F) cVar.f54625p;
                                interfaceC5322g3 = (InterfaceC5322g) cVar.f54624o;
                                D d12 = (D) cVar.f54623n;
                                ResultKt.throwOnFailure(obj);
                                D d13 = d12;
                                F f13 = f12;
                                interfaceC5322g2 = interfaceC5322g3;
                                c02 = c03;
                                d10 = d13;
                                f10 = f13;
                                r52 = d10;
                                c03 = c02;
                                interfaceC5322g3 = interfaceC5322g2;
                                interfaceC5322g = f10;
                                while (true) {
                                    U10 = r52.U(interfaceC5322g);
                                    if (U10 != E.f54630a) {
                                        break;
                                    }
                                    cVar.f54623n = r52;
                                    cVar.f54624o = interfaceC5322g3;
                                    cVar.f54625p = interfaceC5322g;
                                    cVar.f54626q = c03;
                                    cVar.f54629t = 2;
                                    if (r52.x(interfaceC5322g, cVar) == coroutine_suspended) {
                                        break;
                                    }
                                }
                                return coroutine_suspended;
                            }
                            interfaceC5322g = (F) cVar.f54625p;
                            InterfaceC5322g interfaceC5322g4 = (InterfaceC5322g) cVar.f54624o;
                            D d14 = (D) cVar.f54623n;
                            try {
                                ResultKt.throwOnFailure(obj);
                                interfaceC5322g2 = interfaceC5322g4;
                                d10 = d14;
                                interfaceC5322g = interfaceC5322g;
                            } catch (Throwable th2) {
                                th = th2;
                                r52 = d14;
                                r52.k(interfaceC5322g);
                                throw th;
                            }
                        }
                        c02 = (C0) cVar.get$context().get(C0.f9001U2);
                        f10 = interfaceC5322g;
                        r52 = d10;
                        c03 = c02;
                        interfaceC5322g3 = interfaceC5322g2;
                        interfaceC5322g = f10;
                        while (true) {
                            U10 = r52.U(interfaceC5322g);
                            if (U10 != E.f54630a) {
                            }
                        }
                        return coroutine_suspended;
                    }
                }
                c02 = (C0) cVar.get$context().get(C0.f9001U2);
                f10 = interfaceC5322g;
                r52 = d10;
                c03 = c02;
                interfaceC5322g3 = interfaceC5322g2;
                interfaceC5322g = f10;
                while (true) {
                    U10 = r52.U(interfaceC5322g);
                    if (U10 != E.f54630a) {
                    }
                }
                return coroutine_suspended;
            } catch (Throwable th3) {
                r52 = d10;
                th = th3;
                r52.k(interfaceC5322g);
                throw th;
            }
            if (i10 != 0) {
            }
        } catch (Throwable th4) {
            th = th4;
        }
        cVar = d10.new c(continuation);
        Object obj2 = cVar.f54627r;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = cVar.f54629t;
    }

    public static /* synthetic */ Object F(D d10, Object obj, Continuation continuation) {
        if (d10.a(obj)) {
            return Unit.INSTANCE;
        }
        Object G10 = d10.G(obj, continuation);
        return G10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? G10 : Unit.INSTANCE;
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = ((kotlinx.coroutines.flow.internal.AbstractC5326b) r8).slots;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void B(long j10) {
        int i10;
        kotlinx.coroutines.flow.internal.d[] dVarArr;
        i10 = this.f54706a;
        if (i10 != 0 && dVarArr != null) {
            for (kotlinx.coroutines.flow.internal.d dVar : dVarArr) {
                if (dVar != null) {
                    F f10 = (F) dVar;
                    long j11 = f10.f54631a;
                    if (j11 >= 0 && j11 < j10) {
                        f10.f54631a = j10;
                    }
                }
            }
        }
        this.f54616h = j10;
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5326b
    /* renamed from: C, reason: merged with bridge method [inline-methods] */
    public F i() {
        return new F();
    }

    @Override // kotlinx.coroutines.flow.internal.AbstractC5326b
    /* renamed from: D, reason: merged with bridge method [inline-methods] */
    public F[] j(int i10) {
        return new F[i10];
    }

    public final void E() {
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        E.g(objArr, K(), null);
        this.f54617i--;
        long K10 = K() + 1;
        if (this.f54615g < K10) {
            this.f54615g = K10;
        }
        if (this.f54616h < K10) {
            B(K10);
        }
    }

    public final Object G(Object obj, Continuation continuation) {
        Throwable th2;
        Continuation<Unit>[] I10;
        a aVar;
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        Continuation<Unit>[] continuationArr = AbstractC5327c.EMPTY_RESUMES;
        synchronized (this) {
            try {
                if (R(obj)) {
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        c1469p.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                        I10 = I(continuationArr);
                        aVar = null;
                    } catch (Throwable th3) {
                        th2 = th3;
                        throw th2;
                    }
                } else {
                    try {
                        aVar = new a(this, K() + P(), obj, c1469p);
                        H(aVar);
                        this.f54618j++;
                        if (this.f54613e == 0) {
                            continuationArr = I(continuationArr);
                        }
                        I10 = continuationArr;
                    } catch (Throwable th4) {
                        th = th4;
                        th2 = th;
                        throw th2;
                    }
                }
                if (aVar != null) {
                    Ph.r.a(c1469p, aVar);
                }
                for (Continuation<Unit> continuation2 : I10) {
                    if (continuation2 != null) {
                        Result.Companion companion2 = Result.INSTANCE;
                        continuation2.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                    }
                }
                Object z10 = c1469p.z();
                if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    DebugProbesKt.probeCoroutineSuspended(continuation);
                }
                return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
            } catch (Throwable th5) {
                th = th5;
            }
        }
    }

    public final void H(Object obj) {
        int P10 = P();
        Object[] objArr = this.buffer;
        if (objArr == null) {
            objArr = Q(null, 0, 2);
        } else if (P10 >= objArr.length) {
            objArr = Q(objArr, P10, objArr.length * 2);
        }
        E.g(objArr, K() + P10, obj);
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0007, code lost:
    
        r1 = ((kotlinx.coroutines.flow.internal.AbstractC5326b) r10).slots;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [java.lang.Object, java.lang.Object[]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Continuation[] I(Continuation[] continuationArr) {
        int i10;
        kotlinx.coroutines.flow.internal.d[] dVarArr;
        F f10;
        Continuation continuation;
        int length = continuationArr.length;
        i10 = this.f54706a;
        if (i10 != 0 && dVarArr != null) {
            int length2 = dVarArr.length;
            int i11 = 0;
            continuationArr = continuationArr;
            while (i11 < length2) {
                kotlinx.coroutines.flow.internal.d dVar = dVarArr[i11];
                if (dVar != null && (continuation = (f10 = (F) dVar).f54632b) != null && T(f10) >= 0) {
                    int length3 = continuationArr.length;
                    continuationArr = continuationArr;
                    if (length >= length3) {
                        ?? copyOf = Arrays.copyOf(continuationArr, Math.max(2, continuationArr.length * 2));
                        Intrinsics.checkNotNullExpressionValue(copyOf, "copyOf(...)");
                        continuationArr = copyOf;
                    }
                    continuationArr[length] = continuation;
                    f10.f54632b = null;
                    length++;
                }
                i11++;
                continuationArr = continuationArr;
            }
        }
        return continuationArr;
    }

    public final long J() {
        return K() + this.f54617i;
    }

    public final long K() {
        return Math.min(this.f54616h, this.f54615g);
    }

    public final Object L() {
        Object f10;
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        f10 = E.f(objArr, (this.f54615g + O()) - 1);
        return f10;
    }

    public final Object M(long j10) {
        Object f10;
        Object[] objArr = this.buffer;
        Intrinsics.checkNotNull(objArr);
        f10 = E.f(objArr, j10);
        return f10 instanceof a ? ((a) f10).f54621c : f10;
    }

    public final long N() {
        return K() + this.f54617i + this.f54618j;
    }

    public final int O() {
        return (int) ((K() + this.f54617i) - this.f54615g);
    }

    public final int P() {
        return this.f54617i + this.f54618j;
    }

    public final Object[] Q(Object[] objArr, int i10, int i11) {
        Object f10;
        if (i11 <= 0) {
            throw new IllegalStateException("Buffer size overflow");
        }
        Object[] objArr2 = new Object[i11];
        this.buffer = objArr2;
        if (objArr != null) {
            long K10 = K();
            for (int i12 = 0; i12 < i10; i12++) {
                long j10 = i12 + K10;
                f10 = E.f(objArr, j10);
                E.g(objArr2, j10, f10);
            }
        }
        return objArr2;
    }

    public final boolean R(Object obj) {
        if (l() == 0) {
            return S(obj);
        }
        if (this.f54617i >= this.f54613e && this.f54616h <= this.f54615g) {
            int i10 = b.$EnumSwitchMapping$0[this.f54614f.ordinal()];
            if (i10 == 1) {
                return false;
            }
            if (i10 == 2) {
                return true;
            }
            if (i10 != 3) {
                throw new NoWhenBranchMatchedException();
            }
        }
        H(obj);
        int i11 = this.f54617i + 1;
        this.f54617i = i11;
        if (i11 > this.f54613e) {
            E();
        }
        if (O() > this.f54612d) {
            V(this.f54615g + 1, this.f54616h, J(), N());
        }
        return true;
    }

    public final boolean S(Object obj) {
        if (this.f54612d == 0) {
            return true;
        }
        H(obj);
        int i10 = this.f54617i + 1;
        this.f54617i = i10;
        if (i10 > this.f54612d) {
            E();
        }
        this.f54616h = K() + this.f54617i;
        return true;
    }

    public final long T(F f10) {
        long j10 = f10.f54631a;
        if (j10 >= J() && (this.f54613e > 0 || j10 > K() || this.f54618j == 0)) {
            return -1L;
        }
        return j10;
    }

    public final Object U(F f10) {
        Object obj;
        Continuation<Unit>[] continuationArr = AbstractC5327c.EMPTY_RESUMES;
        synchronized (this) {
            try {
                long T10 = T(f10);
                if (T10 < 0) {
                    obj = E.f54630a;
                } else {
                    long j10 = f10.f54631a;
                    Object M10 = M(T10);
                    f10.f54631a = T10 + 1;
                    continuationArr = W(j10);
                    obj = M10;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
            }
        }
        return obj;
    }

    public final void V(long j10, long j11, long j12, long j13) {
        long min = Math.min(j11, j10);
        for (long K10 = K(); K10 < min; K10++) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            E.g(objArr, K10, null);
        }
        this.f54615g = j10;
        this.f54616h = j11;
        this.f54617i = (int) (j12 - min);
        this.f54618j = (int) (j13 - j12);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0024, code lost:
    
        r5 = ((kotlinx.coroutines.flow.internal.AbstractC5326b) r21).slots;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Continuation[] W(long j10) {
        int i10;
        long j11;
        long j12;
        long j13;
        Object f10;
        Object f11;
        kotlinx.coroutines.flow.internal.d[] dVarArr;
        if (j10 > this.f54616h) {
            return AbstractC5327c.EMPTY_RESUMES;
        }
        long K10 = K();
        long j14 = this.f54617i + K10;
        if (this.f54613e == 0 && this.f54618j > 0) {
            j14++;
        }
        i10 = this.f54706a;
        if (i10 != 0 && dVarArr != null) {
            for (kotlinx.coroutines.flow.internal.d dVar : dVarArr) {
                if (dVar != null) {
                    long j15 = ((F) dVar).f54631a;
                    if (j15 >= 0 && j15 < j14) {
                        j14 = j15;
                    }
                }
            }
        }
        if (j14 <= this.f54616h) {
            return AbstractC5327c.EMPTY_RESUMES;
        }
        long J10 = J();
        int min = l() > 0 ? Math.min(this.f54618j, this.f54613e - ((int) (J10 - j14))) : this.f54618j;
        Continuation<Unit>[] continuationArr = AbstractC5327c.EMPTY_RESUMES;
        long j16 = this.f54618j + J10;
        if (min > 0) {
            continuationArr = new Continuation[min];
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            j13 = 1;
            long j17 = J10;
            int i11 = 0;
            while (true) {
                if (J10 >= j16) {
                    j11 = K10;
                    j12 = j14;
                    J10 = j17;
                    break;
                }
                f11 = E.f(objArr, J10);
                j11 = K10;
                Sh.G g10 = E.f54630a;
                if (f11 != g10) {
                    Intrinsics.checkNotNull(f11, "null cannot be cast to non-null type kotlinx.coroutines.flow.SharedFlowImpl.Emitter");
                    a aVar = (a) f11;
                    int i12 = i11 + 1;
                    j12 = j14;
                    continuationArr[i11] = aVar.f54622d;
                    E.g(objArr, J10, g10);
                    E.g(objArr, j17, aVar.f54621c);
                    long j18 = j17 + 1;
                    if (i12 >= min) {
                        J10 = j18;
                        break;
                    }
                    i11 = i12;
                    j17 = j18;
                } else {
                    j12 = j14;
                }
                J10++;
                K10 = j11;
                j14 = j12;
            }
        } else {
            j11 = K10;
            j12 = j14;
            j13 = 1;
        }
        Continuation<Unit>[] continuationArr2 = continuationArr;
        int i13 = (int) (J10 - j11);
        long j19 = l() == 0 ? J10 : j12;
        long max = Math.max(this.f54615g, J10 - Math.min(this.f54612d, i13));
        if (this.f54613e == 0 && max < j16) {
            Object[] objArr2 = this.buffer;
            Intrinsics.checkNotNull(objArr2);
            f10 = E.f(objArr2, max);
            if (Intrinsics.areEqual(f10, E.f54630a)) {
                J10 += j13;
                max += j13;
            }
        }
        V(max, j19, J10, j16);
        z();
        return !(continuationArr2.length == 0) ? I(continuationArr2) : continuationArr2;
    }

    public final long X() {
        long j10 = this.f54615g;
        if (j10 < this.f54616h) {
            this.f54616h = j10;
        }
        return j10;
    }

    @Override // kotlinx.coroutines.flow.x
    public boolean a(Object obj) {
        int i10;
        boolean z10;
        Continuation<Unit>[] continuationArr = AbstractC5327c.EMPTY_RESUMES;
        synchronized (this) {
            if (R(obj)) {
                continuationArr = I(continuationArr);
                z10 = true;
            } else {
                z10 = false;
            }
        }
        for (Continuation<Unit> continuation : continuationArr) {
            if (continuation != null) {
                Result.Companion companion = Result.INSTANCE;
                continuation.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
            }
        }
        return z10;
    }

    @Override // kotlinx.coroutines.flow.internal.q
    public InterfaceC5321f b(CoroutineContext coroutineContext, int i10, Rh.d dVar) {
        return E.e(this, coroutineContext, i10, dVar);
    }

    @Override // kotlinx.coroutines.flow.C, kotlinx.coroutines.flow.InterfaceC5321f
    public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
        return A(this, interfaceC5322g, continuation);
    }

    @Override // kotlinx.coroutines.flow.x, kotlinx.coroutines.flow.InterfaceC5322g
    public Object emit(Object obj, Continuation continuation) {
        return F(this, obj, continuation);
    }

    @Override // kotlinx.coroutines.flow.x
    public void h() {
        synchronized (this) {
            try {
                try {
                    V(J(), this.f54616h, J(), N());
                    Unit unit = Unit.INSTANCE;
                } catch (Throwable th2) {
                    th = th2;
                    throw th;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    public final Object x(F f10, Continuation continuation) {
        C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        synchronized (this) {
            try {
                if (T(f10) < 0) {
                    f10.f54632b = c1469p;
                } else {
                    Result.Companion companion = Result.INSTANCE;
                    c1469p.resumeWith(Result.m147constructorimpl(Unit.INSTANCE));
                }
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? z10 : Unit.INSTANCE;
    }

    public final void y(a aVar) {
        Object f10;
        synchronized (this) {
            if (aVar.f54620b < K()) {
                return;
            }
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            f10 = E.f(objArr, aVar.f54620b);
            if (f10 != aVar) {
                return;
            }
            E.g(objArr, aVar.f54620b, E.f54630a);
            z();
            Unit unit = Unit.INSTANCE;
        }
    }

    public final void z() {
        Object f10;
        if (this.f54613e != 0 || this.f54618j > 1) {
            Object[] objArr = this.buffer;
            Intrinsics.checkNotNull(objArr);
            while (this.f54618j > 0) {
                f10 = E.f(objArr, (K() + P()) - 1);
                if (f10 != E.f54630a) {
                    return;
                }
                this.f54618j--;
                E.g(objArr, K() + P(), null);
            }
        }
    }
}
