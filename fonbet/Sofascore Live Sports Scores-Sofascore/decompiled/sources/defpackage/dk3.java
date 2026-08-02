package defpackage;

import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.e;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class dk3 implements ak3 {
    public final g0f a;
    public final g0f b;
    public final k03 c;
    public final ThreadLocal d;
    public volatile boolean e;
    public final long f;

    public dk3(final z41 z41Var, final String str, int i) {
        str.getClass();
        this.c = new k03();
        this.d = new ThreadLocal();
        wd5 wd5Var = xd5.b;
        this.f = wkn.R(30, be5.SECONDS);
        if (i <= 0) {
            a70.p("Maximum number of readers must be greater than 0");
            throw null;
        }
        final int i2 = 0;
        this.a = new g0f(i, new Function0() { // from class: bk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                String str2 = str;
                z41 z41Var2 = z41Var;
                switch (i3) {
                    case 0:
                        glg open = z41Var2.open(str2);
                        b0a.F(open, "PRAGMA query_only = 1");
                        return open;
                    default:
                        return z41Var2.open(str2);
                }
            }
        });
        final int i3 = 1;
        this.b = new g0f(1, new Function0() { // from class: bk3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i32 = i3;
                String str2 = str;
                z41 z41Var2 = z41Var;
                switch (i32) {
                    case 0:
                        glg open = z41Var2.open(str2);
                        b0a.F(open, "PRAGMA query_only = 1");
                        return open;
                    default:
                        return z41Var2.open(str2);
                }
            }
        });
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:17:0x017d  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x0145 A[Catch: all -> 0x019d, TRY_LEAVE, TryCatch #3 {all -> 0x019d, blocks: (B:55:0x011e, B:59:0x013a, B:61:0x0145, B:65:0x01a1, B:66:0x01a8), top: B:54:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x01a1 A[Catch: all -> 0x019d, TRY_ENTER, TryCatch #3 {all -> 0x019d, blocks: (B:55:0x011e, B:59:0x013a, B:61:0x0145, B:65:0x01a1, B:66:0x01a8), top: B:54:0x011e }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    @Override // defpackage.ak3
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object T0(boolean z, Function2 function2, rq3 rq3Var) {
        ck3 ck3Var;
        int i;
        fsf fsfVar;
        Throwable th;
        g0f g0fVar;
        CoroutineContext context;
        Function2 function22;
        k03 k03Var;
        g0f g0fVar2;
        fsf fsfVar2;
        Object obj;
        fsf fsfVar3;
        p0f p0fVar;
        boolean z2 = z;
        try {
            if (rq3Var instanceof ck3) {
                ck3Var = (ck3) rq3Var;
                int i2 = ck3Var.A;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    ck3Var.A = i2 - Integer.MIN_VALUE;
                    Object obj2 = ck3Var.y;
                    lu3 lu3Var = lu3.a;
                    i = ck3Var.A;
                    CoroutineContext coroutineContext = null;
                    Object[] objArr = 0;
                    Object[] objArr2 = 0;
                    Object[] objArr3 = 0;
                    if (i != 0) {
                        y6a.M(obj2);
                        if (this.e) {
                            b0a.R(21, "Connection pool is closed");
                            throw null;
                        }
                        p0f p0fVar2 = (p0f) this.d.get();
                        if (p0fVar2 == null) {
                            yj3 yj3Var = (yj3) ck3Var.getContext().get(this.c);
                            p0fVar2 = yj3Var != null ? yj3Var.b : null;
                        }
                        if (p0fVar2 == null) {
                            g0f g0fVar3 = z2 ? this.a : this.b;
                            fsfVar = new fsf();
                            try {
                                context = ck3Var.getContext();
                                k03 k03Var2 = this.c;
                                long j = this.f;
                                m1 m1Var = new m1(this, z2, 3);
                                ck3Var.s = function2;
                                ck3Var.t = g0fVar3;
                                ck3Var.u = fsfVar;
                                ck3Var.v = context;
                                ck3Var.w = fsfVar;
                                ck3Var.x = k03Var2;
                                ck3Var.r = z2;
                                ck3Var.A = 3;
                                Object b = g0fVar3.b(j, m1Var, ck3Var);
                                if (b != lu3Var) {
                                    function22 = function2;
                                    k03Var = k03Var2;
                                    g0fVar2 = g0fVar3;
                                    obj2 = b;
                                    fsfVar2 = fsfVar;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                g0fVar = g0fVar3;
                                throw th;
                            }
                        } else {
                            if (!z2 && p0fVar2.c) {
                                b0a.R(1, "Cannot upgrade connection from reader to writer");
                                throw null;
                            }
                            if (ck3Var.getContext().get(this.c) == null) {
                                CoroutineContext d = e.d(new yj3(this.c, p0fVar2), new bgj(p0fVar2, this.d));
                                hy1 hy1Var = new hy1(function2, p0fVar2, objArr == true ? 1 : 0, 17);
                                ck3Var.A = 1;
                                Object R = xw3.R(d, hy1Var, ck3Var);
                                if (R != lu3Var) {
                                    return R;
                                }
                            } else {
                                ck3Var.A = 2;
                                Object invoke = function2.invoke(p0fVar2, ck3Var);
                                if (invoke != lu3Var) {
                                    return invoke;
                                }
                            }
                        }
                        return lu3Var;
                    }
                    if (i == 1) {
                        y6a.M(obj2);
                        return obj2;
                    }
                    if (i == 2) {
                        y6a.M(obj2);
                        return obj2;
                    }
                    if (i == 3) {
                        z2 = ck3Var.r;
                        k03Var = ck3Var.x;
                        fsf fsfVar4 = ck3Var.w;
                        CoroutineContext coroutineContext2 = ck3Var.v;
                        fsf fsfVar5 = ck3Var.u;
                        g0fVar2 = (g0f) ck3Var.t;
                        function22 = (Function2) ck3Var.s;
                        try {
                            y6a.M(obj2);
                            fsfVar2 = fsfVar4;
                            fsfVar = fsfVar5;
                            context = coroutineContext2;
                        } catch (Throwable th3) {
                            th = th3;
                            fsfVar = fsfVar5;
                            g0fVar = g0fVar2;
                            throw th;
                        }
                    } else {
                        if (i != 4) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        fsfVar3 = (fsf) ck3Var.t;
                        g0fVar = (g0f) ck3Var.s;
                        try {
                            y6a.M(obj2);
                            p0fVar = (p0f) fsfVar3.a;
                            if (p0fVar != null) {
                                if (!p0fVar.e) {
                                    p0fVar.e = true;
                                    if (p0fVar.b.a.y()) {
                                        b0a.F(p0fVar.b, "ROLLBACK TRANSACTION");
                                    }
                                }
                                kk3 kk3Var = p0fVar.b;
                                kk3Var.c = null;
                                kk3Var.d = null;
                                g0fVar.e(kk3Var);
                            }
                            return obj2;
                        } catch (Throwable th4) {
                            fsfVar = fsfVar3;
                            th = th4;
                            try {
                                throw th;
                            } finally {
                            }
                        }
                    }
                    kk3 kk3Var2 = (kk3) obj2;
                    kk3Var2.getClass();
                    context.getClass();
                    kk3Var2.c = context;
                    kk3Var2.d = new Throwable();
                    fsfVar2.a = new p0f(k03Var, kk3Var2, this.a == this.b && z2);
                    obj = fsfVar.a;
                    if (obj != null) {
                        throw new IllegalArgumentException("Required value was null.");
                    }
                    p0f p0fVar3 = (p0f) obj;
                    CoroutineContext d2 = e.d(new yj3(this.c, p0fVar3), new bgj(p0fVar3, this.d));
                    hy1 hy1Var2 = new hy1(function22, fsfVar, objArr2 == true ? 1 : 0, 18);
                    ck3Var.s = g0fVar2;
                    ck3Var.t = fsfVar;
                    ck3Var.u = null;
                    ck3Var.v = null;
                    ck3Var.w = null;
                    ck3Var.x = null;
                    ck3Var.A = 4;
                    obj2 = xw3.R(d2, hy1Var2, ck3Var);
                    if (obj2 != lu3Var) {
                        fsfVar3 = fsfVar;
                        g0fVar = g0fVar2;
                        p0fVar = (p0f) fsfVar3.a;
                        if (p0fVar != null) {
                        }
                        return obj2;
                    }
                    return lu3Var;
                }
            }
            kk3 kk3Var22 = (kk3) obj2;
            kk3Var22.getClass();
            context.getClass();
            kk3Var22.c = context;
            kk3Var22.d = new Throwable();
            fsfVar2.a = new p0f(k03Var, kk3Var22, this.a == this.b && z2);
            obj = fsfVar.a;
            if (obj != null) {
            }
        } catch (Throwable th5) {
            th = th5;
            g0fVar = g0fVar2;
            throw th;
        }
        ck3Var = new ck3(this, rq3Var);
        Object obj22 = ck3Var.y;
        lu3 lu3Var2 = lu3.a;
        i = ck3Var.A;
        CoroutineContext coroutineContext3 = null;
        Object[] objArr4 = 0;
        Object[] objArr22 = 0;
        Object[] objArr32 = 0;
        if (i != 0) {
        }
    }

    @Override // java.lang.AutoCloseable
    public final void close() {
        if (this.e) {
            return;
        }
        this.e = true;
        this.a.c();
        this.b.c();
    }

    public dk3(z41 z41Var) {
        this.c = new k03();
        this.d = new ThreadLocal();
        wd5 wd5Var = xd5.b;
        this.f = wkn.R(30, be5.SECONDS);
        g0f g0fVar = new g0f(1, new h63(z41Var, 3));
        this.a = g0fVar;
        this.b = g0fVar;
    }
}
