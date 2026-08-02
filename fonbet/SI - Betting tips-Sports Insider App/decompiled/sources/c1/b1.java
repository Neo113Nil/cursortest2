package c1;

import java.util.concurrent.atomic.AtomicInteger;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b1 {

    /* renamed from: a, reason: collision with root package name */
    public final ng.c f3339a;

    /* renamed from: b, reason: collision with root package name */
    public final h9.c f3340b;

    /* renamed from: c, reason: collision with root package name */
    public final u f3341c;

    public b1(String filePath) {
        Intrinsics.checkNotNullParameter(filePath, "filePath");
        this.f3339a = new ng.c();
        this.f3340b = new h9.c(14);
        this.f3341c = new u(new a1(2, null, 0));
    }

    public final Integer a() {
        return new Integer(((AtomicInteger) this.f3340b.f10430b).get());
    }

    /* JADX WARN: Code restructure failed: missing block: B:32:0x0054, code lost:
    
        if (r9.c(r0) == r1) goto L25;
     */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Function1 function1, mf.c cVar) {
        y0 y0Var;
        lf.a aVar;
        int i5;
        ng.c cVar2;
        Throwable th2;
        ng.a aVar2;
        Object invoke;
        try {
            if (cVar instanceof y0) {
                y0Var = (y0) cVar;
                int i10 = y0Var.f3508e;
                if ((i10 & Integer.MIN_VALUE) != 0) {
                    y0Var.f3508e = i10 - Integer.MIN_VALUE;
                    Object obj = y0Var.f3506c;
                    aVar = lf.a.f20034a;
                    i5 = y0Var.f3508e;
                    if (i5 != 0) {
                        h8.b.B(obj);
                        y0Var.f3504a = function1;
                        cVar2 = this.f3339a;
                        y0Var.f3505b = cVar2;
                        y0Var.f3508e = 1;
                    } else {
                        if (i5 != 1) {
                            if (i5 != 2) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            aVar2 = (ng.a) y0Var.f3504a;
                            try {
                                h8.b.B(obj);
                                aVar2.k(null);
                                return obj;
                            } catch (Throwable th3) {
                                th2 = th3;
                                aVar2.k(null);
                                throw th2;
                            }
                        }
                        ng.c cVar3 = y0Var.f3505b;
                        Function1 function12 = (Function1) y0Var.f3504a;
                        h8.b.B(obj);
                        cVar2 = cVar3;
                        function1 = function12;
                    }
                    y0Var.f3504a = cVar2;
                    y0Var.f3505b = null;
                    y0Var.f3508e = 2;
                    invoke = function1.invoke(y0Var);
                    if (invoke != aVar) {
                        ng.c cVar4 = cVar2;
                        obj = invoke;
                        aVar2 = cVar4;
                        aVar2.k(null);
                        return obj;
                    }
                    return aVar;
                }
            }
            y0Var.f3504a = cVar2;
            y0Var.f3505b = null;
            y0Var.f3508e = 2;
            invoke = function1.invoke(y0Var);
            if (invoke != aVar) {
            }
            return aVar;
        } catch (Throwable th4) {
            ng.c cVar5 = cVar2;
            th2 = th4;
            aVar2 = cVar5;
            aVar2.k(null);
            throw th2;
        }
        y0Var = new y0(this, cVar);
        Object obj2 = y0Var.f3506c;
        aVar = lf.a.f20034a;
        i5 = y0Var.f3508e;
        if (i5 != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(Function2 function2, mf.c cVar) {
        z0 z0Var;
        int i5;
        ng.c cVar2;
        Throwable th2;
        boolean z5;
        if (cVar instanceof z0) {
            z0Var = (z0) cVar;
            int i10 = z0Var.f3517e;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                z0Var.f3517e = i10 - Integer.MIN_VALUE;
                Object obj = z0Var.f3515c;
                Object obj2 = lf.a.f20034a;
                i5 = z0Var.f3517e;
                if (i5 != 0) {
                    h8.b.B(obj);
                    ng.c cVar3 = this.f3339a;
                    boolean e7 = cVar3.e();
                    try {
                        Object valueOf = Boolean.valueOf(e7);
                        z0Var.f3513a = cVar3;
                        z0Var.f3514b = e7;
                        z0Var.f3517e = 1;
                        Object invoke = function2.invoke(valueOf, z0Var);
                        if (invoke == obj2) {
                            return obj2;
                        }
                        cVar2 = cVar3;
                        obj = invoke;
                        z5 = e7;
                    } catch (Throwable th3) {
                        cVar2 = cVar3;
                        th2 = th3;
                        z5 = e7;
                        if (z5) {
                            cVar2.k(null);
                        }
                        throw th2;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    z5 = z0Var.f3514b;
                    cVar2 = z0Var.f3513a;
                    try {
                        h8.b.B(obj);
                    } catch (Throwable th4) {
                        th2 = th4;
                        if (z5) {
                        }
                        throw th2;
                    }
                }
                if (z5) {
                    cVar2.k(null);
                }
                return obj;
            }
        }
        z0Var = new z0(this, cVar);
        Object obj3 = z0Var.f3515c;
        Object obj22 = lf.a.f20034a;
        i5 = z0Var.f3517e;
        if (i5 != 0) {
        }
        if (z5) {
        }
        return obj3;
    }
}
