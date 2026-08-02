package Ph;

import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Ref;

/* loaded from: classes5.dex */
public abstract class h1 {

    public static final class a extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public long f9094n;

        /* renamed from: o, reason: collision with root package name */
        public Object f9095o;

        /* renamed from: p, reason: collision with root package name */
        public Object f9096p;

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f9097q;

        /* renamed from: r, reason: collision with root package name */
        public int f9098r;

        public a(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f9097q = obj;
            this.f9098r |= Integer.MIN_VALUE;
            return h1.d(0L, null, this);
        }
    }

    public static final f1 a(long j10, Z z10, C0 c02) {
        return new f1("Timed out waiting for " + j10 + " ms", c02);
    }

    public static final Object b(g1 g1Var, Function2 function2) {
        F0.k(g1Var, AbstractC1440a0.b(g1Var.f10761d.get$context()).J(g1Var.f9091e, g1Var, g1Var.get$context()));
        return Th.b.e(g1Var, g1Var, function2);
    }

    public static final Object c(long j10, Function2 function2, Continuation continuation) {
        if (j10 <= 0) {
            throw new f1("Timed out immediately");
        }
        Object b10 = b(new g1(j10, continuation), function2);
        if (b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return b10;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0075 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r2v1, types: [Ph.g1, T] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(long j10, Function2 function2, Continuation continuation) {
        a aVar;
        int i10;
        Ref.ObjectRef objectRef;
        if (continuation instanceof a) {
            aVar = (a) continuation;
            int i11 = aVar.f9098r;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                aVar.f9098r = i11 - Integer.MIN_VALUE;
                Object obj = aVar.f9097q;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = aVar.f9098r;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    if (j10 <= 0) {
                        return null;
                    }
                    Ref.ObjectRef objectRef2 = new Ref.ObjectRef();
                    try {
                        aVar.f9095o = function2;
                        aVar.f9096p = objectRef2;
                        aVar.f9094n = j10;
                        aVar.f9098r = 1;
                        ?? g1Var = new g1(j10, aVar);
                        objectRef2.element = g1Var;
                        Object b10 = b(g1Var, function2);
                        if (b10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(aVar);
                        }
                        return b10 == coroutine_suspended ? coroutine_suspended : b10;
                    } catch (f1 e10) {
                        e = e10;
                        objectRef = objectRef2;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    objectRef = (Ref.ObjectRef) aVar.f9096p;
                    try {
                        ResultKt.throwOnFailure(obj);
                        return obj;
                    } catch (f1 e11) {
                        e = e11;
                    }
                }
                if (e.f9085a != objectRef.element) {
                    return null;
                }
                throw e;
            }
        }
        aVar = new a(continuation);
        Object obj2 = aVar.f9097q;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = aVar.f9098r;
        if (i10 != 0) {
        }
        if (e.f9085a != objectRef.element) {
        }
    }
}
