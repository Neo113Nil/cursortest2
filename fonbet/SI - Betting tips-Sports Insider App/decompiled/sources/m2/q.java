package m2;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.FunctionReferenceImpl;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q implements k2.c0, e0 {

    /* renamed from: a, reason: collision with root package name */
    public final FunctionReferenceImpl f20261a;

    /* renamed from: b, reason: collision with root package name */
    public final s2.a f20262b;

    /* renamed from: c, reason: collision with root package name */
    public final AtomicInteger f20263c;

    /* renamed from: d, reason: collision with root package name */
    public k2.b0 f20264d;

    /* JADX WARN: Multi-variable type inference failed */
    public q(Function2 function2, s2.a delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.f20261a = (FunctionReferenceImpl) function2;
        this.f20262b = delegate;
        this.f20263c = new AtomicInteger(0);
    }

    @Override // k2.c0
    public final Boolean a(Continuation continuation) {
        return Boolean.valueOf(this.f20264d != null || this.f20262b.j());
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // k2.c0
    public final Object b(k2.b0 b0Var, Function2 function2, mf.i iVar) {
        Object invoke = this.f20261a.invoke(new p(this, b0Var, function2, null), iVar);
        lf.a aVar = lf.a.f20034a;
        return invoke;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x0047, code lost:
    
        if (r8 == r1) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r6v3, types: [kotlin.jvm.functions.Function2, kotlin.jvm.internal.FunctionReferenceImpl] */
    @Override // k2.p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function1 function1, mf.c cVar) {
        n nVar;
        Object obj;
        int i5;
        if (cVar instanceof n) {
            nVar = (n) cVar;
            int i10 = nVar.f20253e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                nVar.f20253e = i10 - Integer.MIN_VALUE;
                obj = nVar.f20251c;
                Object obj2 = lf.a.f20034a;
                i5 = nVar.f20253e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    nVar.f20249a = str;
                    nVar.f20250b = function1;
                    nVar.f20253e = 1;
                    obj = a(nVar);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        return obj;
                    }
                    function1 = nVar.f20250b;
                    str = nVar.f20249a;
                    h8.b.B(obj);
                }
                if (!((Boolean) obj).booleanValue()) {
                    o oVar = new o(this, str, function1, null);
                    nVar.f20249a = null;
                    nVar.f20250b = null;
                    nVar.f20253e = 2;
                    Object invoke = this.f20261a.invoke(oVar, nVar);
                    return invoke == obj2 ? obj2 : invoke;
                }
                s2.c r02 = this.f20262b.r0(str);
                try {
                    Object invoke2 = function1.invoke(r02);
                    u6.h.g(r02, null);
                    return invoke2;
                } finally {
                }
            }
        }
        nVar = new n(this, cVar);
        obj = nVar.f20251c;
        Object obj22 = lf.a.f20034a;
        i5 = nVar.f20253e;
        if (i5 != 0) {
        }
        if (!((Boolean) obj).booleanValue()) {
        }
    }

    @Override // m2.e0
    public final s2.a d() {
        return this.f20262b;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(k2.b0 b0Var, Function2 function2, mf.c cVar) {
        m mVar;
        int i5;
        AtomicInteger atomicInteger;
        int i10;
        try {
            if (cVar instanceof m) {
                mVar = (m) cVar;
                int i11 = mVar.f20248d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    mVar.f20248d = i11 - Integer.MIN_VALUE;
                    Object obj = mVar.f20246b;
                    Object obj2 = lf.a.f20034a;
                    i5 = mVar.f20248d;
                    atomicInteger = this.f20263c;
                    i10 = 1;
                    s2.a aVar = this.f20262b;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        int ordinal = b0Var.ordinal();
                        if (ordinal == 0) {
                            h8.b.l(aVar, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            h8.b.l(aVar, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new gf.m();
                            }
                            h8.b.l(aVar, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                        if (atomicInteger.incrementAndGet() > 0) {
                            this.f20264d = b0Var;
                        }
                        Object lVar = new l(0, this);
                        mVar.f20245a = 1;
                        mVar.f20248d = 1;
                        obj = function2.invoke(lVar, mVar);
                        if (obj == obj2) {
                            return obj2;
                        }
                    } else {
                        if (i5 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        i10 = mVar.f20245a;
                        h8.b.B(obj);
                    }
                    if (atomicInteger.decrementAndGet() == 0) {
                        this.f20264d = null;
                    }
                    if (i10 == 0) {
                        h8.b.l(aVar, "END TRANSACTION");
                        return obj;
                    }
                    h8.b.l(aVar, "ROLLBACK TRANSACTION");
                    return obj;
                }
            }
            if (i5 != 0) {
            }
            if (atomicInteger.decrementAndGet() == 0) {
            }
            if (i10 == 0) {
            }
        } finally {
        }
        mVar = new m(this, cVar);
        Object obj3 = mVar.f20246b;
        Object obj22 = lf.a.f20034a;
        i5 = mVar.f20248d;
        atomicInteger = this.f20263c;
        i10 = 1;
        s2.a aVar2 = this.f20262b;
    }
}
