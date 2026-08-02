package defpackage;

import android.database.SQLException;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p0f implements avj, enf {
    public final k03 a;
    public final kk3 b;
    public final boolean c;
    public final vg0 d;
    public volatile boolean e;

    public p0f(k03 k03Var, kk3 kk3Var, boolean z) {
        k03Var.getClass();
        this.a = k03Var;
        this.b = kk3Var;
        this.c = z;
        this.d = new vg0();
    }

    @Override // defpackage.avj
    public final Object a(zuj zujVar, Function2 function2, hoi hoiVar) {
        if (this.e) {
            b0a.R(21, "Connection is recycled");
            throw null;
        }
        yj3 yj3Var = (yj3) hoiVar.getContext().get(this.a);
        if (yj3Var != null && yj3Var.b == this) {
            return g(zujVar, function2, hoiVar);
        }
        b0a.R(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    @Override // defpackage.avj
    public final Boolean b(rq3 rq3Var) {
        if (this.e) {
            b0a.R(21, "Connection is recycled");
            throw null;
        }
        yj3 yj3Var = (yj3) rq3Var.getContext().get(this.a);
        if (yj3Var != null && yj3Var.b == this) {
            return Boolean.valueOf(!this.d.isEmpty() || this.b.a.y());
        }
        b0a.R(21, "Attempted to use connection on a different coroutine");
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // defpackage.i0f
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, Function1 function1, sq3 sq3Var) {
        o0f o0fVar;
        int i;
        kk3 kk3Var;
        try {
            try {
                if (sq3Var instanceof o0f) {
                    o0fVar = (o0f) sq3Var;
                    int i2 = o0fVar.w;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        o0fVar.w = i2 - Integer.MIN_VALUE;
                        Object obj = o0fVar.u;
                        lu3 lu3Var = lu3.a;
                        i = o0fVar.w;
                        if (i != 0) {
                            y6a.M(obj);
                            if (this.e) {
                                b0a.R(21, "Connection is recycled");
                                throw null;
                            }
                            yj3 yj3Var = (yj3) o0fVar.getContext().get(this.a);
                            if (yj3Var == null || yj3Var.b != this) {
                                b0a.R(21, "Attempted to use connection on a different coroutine");
                                throw null;
                            }
                            kk3Var = this.b;
                            o0fVar.r = str;
                            o0fVar.s = function1;
                            o0fVar.t = kk3Var;
                            o0fVar.w = 1;
                            if (kk3Var.b.e(o0fVar) == lu3Var) {
                                return lu3Var;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            kk3 kk3Var2 = o0fVar.t;
                            function1 = o0fVar.s;
                            String str2 = o0fVar.r;
                            y6a.M(obj);
                            kk3Var = kk3Var2;
                            str = str2;
                        }
                        j0f j0fVar = new j0f(this, this.b.V0(str));
                        Object invoke = function1.invoke(j0fVar);
                        o1j.t(j0fVar, null);
                        return invoke;
                    }
                }
                Object invoke2 = function1.invoke(j0fVar);
                o1j.t(j0fVar, null);
                return invoke2;
            } finally {
            }
            j0f j0fVar2 = new j0f(this, this.b.V0(str));
        } finally {
            kk3Var.f(null);
        }
        o0fVar = new o0f(this, sq3Var);
        Object obj2 = o0fVar.u;
        lu3 lu3Var2 = lu3.a;
        i = o0fVar.w;
        if (i != 0) {
        }
    }

    @Override // defpackage.enf
    public final glg d() {
        return this.b;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0057 A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x004d, B:13:0x0057, B:18:0x0062, B:19:0x0090, B:23:0x006a, B:24:0x006f, B:25:0x0070, B:26:0x0076, B:27:0x007c), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x007c A[Catch: all -> 0x0068, TryCatch #0 {all -> 0x0068, blocks: (B:11:0x004d, B:13:0x0057, B:18:0x0062, B:19:0x0090, B:23:0x006a, B:24:0x006f, B:25:0x0070, B:26:0x0076, B:27:0x007c), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0028  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(zuj zujVar, sq3 sq3Var) {
        l0f l0fVar;
        int i;
        kk3 kk3Var;
        vg0 vg0Var = this.d;
        try {
            if (sq3Var instanceof l0f) {
                l0fVar = (l0f) sq3Var;
                int i2 = l0fVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    l0fVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = l0fVar.t;
                    lu3 lu3Var = lu3.a;
                    i = l0fVar.v;
                    kk3 kk3Var2 = this.b;
                    if (i != 0) {
                        y6a.M(obj);
                        l0fVar.r = zujVar;
                        l0fVar.s = kk3Var2;
                        l0fVar.v = 1;
                        if (kk3Var2.b.e(l0fVar) == lu3Var) {
                            return lu3Var;
                        }
                        kk3Var = kk3Var2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        kk3 kk3Var3 = l0fVar.s;
                        zuj zujVar2 = l0fVar.r;
                        y6a.M(obj);
                        kk3Var = kk3Var3;
                        zujVar = zujVar2;
                    }
                    int size = vg0Var.size();
                    if (vg0Var.isEmpty()) {
                        b0a.F(kk3Var2, "SAVEPOINT '" + size + '\'');
                    } else {
                        int ordinal = zujVar.ordinal();
                        if (ordinal == 0) {
                            b0a.F(kk3Var2, "BEGIN DEFERRED TRANSACTION");
                        } else if (ordinal == 1) {
                            b0a.F(kk3Var2, "BEGIN IMMEDIATE TRANSACTION");
                        } else {
                            if (ordinal != 2) {
                                throw new ndd();
                            }
                            b0a.F(kk3Var2, "BEGIN EXCLUSIVE TRANSACTION");
                        }
                    }
                    vg0Var.addLast(new k0f(size));
                    Unit unit = Unit.a;
                    kk3Var.f(null);
                    return unit;
                }
            }
            int size2 = vg0Var.size();
            if (vg0Var.isEmpty()) {
            }
            vg0Var.addLast(new k0f(size2));
            Unit unit2 = Unit.a;
            kk3Var.f(null);
            return unit2;
        } catch (Throwable th) {
            kk3Var.f(null);
            throw th;
        }
        l0fVar = new l0f(this, sq3Var);
        Object obj2 = l0fVar.t;
        lu3 lu3Var2 = lu3.a;
        i = l0fVar.v;
        kk3 kk3Var22 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: all -> 0x006c, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00a9 A[Catch: all -> 0x006c, TRY_ENTER, TryCatch #0 {all -> 0x006c, blocks: (B:11:0x004d, B:13:0x0053, B:15:0x005d, B:17:0x0066, B:18:0x00a3, B:22:0x006e, B:23:0x0083, B:25:0x0089, B:26:0x008f, B:27:0x00a9, B:28:0x00b0), top: B:10:0x004d }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(boolean z, sq3 sq3Var) {
        m0f m0fVar;
        int i;
        kk3 kk3Var;
        vg0 vg0Var = this.d;
        try {
            if (sq3Var instanceof m0f) {
                m0fVar = (m0f) sq3Var;
                int i2 = m0fVar.v;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    m0fVar.v = i2 - Integer.MIN_VALUE;
                    Object obj = m0fVar.t;
                    lu3 lu3Var = lu3.a;
                    i = m0fVar.v;
                    kk3 kk3Var2 = this.b;
                    if (i != 0) {
                        y6a.M(obj);
                        m0fVar.s = kk3Var2;
                        m0fVar.r = z;
                        m0fVar.v = 1;
                        if (kk3Var2.b.e(m0fVar) == lu3Var) {
                            return lu3Var;
                        }
                        kk3Var = kk3Var2;
                    } else {
                        if (i != 1) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        z = m0fVar.r;
                        kk3Var = m0fVar.s;
                        y6a.M(obj);
                    }
                    if (!vg0Var.isEmpty()) {
                        throw new IllegalStateException("Not in a transaction");
                    }
                    k0f k0fVar = (k0f) o13.D(vg0Var);
                    if (z) {
                        k0fVar.getClass();
                        if (vg0Var.isEmpty()) {
                            b0a.F(kk3Var2, "END TRANSACTION");
                        } else {
                            b0a.F(kk3Var2, "RELEASE SAVEPOINT '" + k0fVar.a + '\'');
                        }
                    } else if (vg0Var.isEmpty()) {
                        b0a.F(kk3Var2, "ROLLBACK TRANSACTION");
                    } else {
                        b0a.F(kk3Var2, "ROLLBACK TRANSACTION TO SAVEPOINT '" + k0fVar.a + '\'');
                    }
                    Unit unit = Unit.a;
                    kk3Var.f(null);
                    return unit;
                }
            }
            if (!vg0Var.isEmpty()) {
            }
        } catch (Throwable th) {
            kk3Var.f(null);
            throw th;
        }
        m0fVar = new m0f(this, sq3Var);
        Object obj2 = m0fVar.t;
        lu3 lu3Var2 = lu3.a;
        i = m0fVar.v;
        kk3 kk3Var22 = this.b;
        if (i != 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:47:0x006b, code lost:
    
        if (e(r11, r0) == r1) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00a7  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x008f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(zuj zujVar, Function2 function2, sq3 sq3Var) {
        n0f n0fVar;
        Object obj;
        Object obj2;
        int i;
        SQLException e;
        Throwable th;
        int i2;
        try {
            if (sq3Var instanceof n0f) {
                n0fVar = (n0f) sq3Var;
                int i3 = n0fVar.w;
                if ((i3 & Integer.MIN_VALUE) != 0) {
                    n0fVar.w = i3 - Integer.MIN_VALUE;
                    obj = n0fVar.u;
                    obj2 = lu3.a;
                    i = n0fVar.w;
                    if (i != 0) {
                        y6a.M(obj);
                        if (zujVar == null) {
                            zujVar = zuj.a;
                        }
                        n0fVar.r = function2;
                        n0fVar.w = 1;
                    } else if (i == 1) {
                        function2 = (Function2) n0fVar.r;
                        y6a.M(obj);
                    } else {
                        if (i == 2) {
                            i2 = n0fVar.t;
                            y6a.M(obj);
                            boolean z = i2 != 0;
                            n0fVar.r = obj;
                            n0fVar.w = 3;
                            return f(z, n0fVar) != obj2 ? obj2 : obj;
                        }
                        if (i == 3 || i == 4) {
                            Object obj3 = n0fVar.r;
                            y6a.M(obj);
                            return obj3;
                        }
                        if (i != 5) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        th = n0fVar.s;
                        th = (Throwable) n0fVar.r;
                        try {
                            y6a.M(obj);
                            throw th;
                        } catch (SQLException e2) {
                            e = e2;
                            if (th != null) {
                            }
                        }
                    }
                    mae maeVar = new mae(this, 1);
                    n0fVar.r = null;
                    n0fVar.t = 1;
                    n0fVar.w = 2;
                    obj = function2.invoke(maeVar, n0fVar);
                    if (obj != obj2) {
                        i2 = 1;
                        if (i2 != 0) {
                        }
                        n0fVar.r = obj;
                        n0fVar.w = 3;
                        if (f(z, n0fVar) != obj2) {
                        }
                    }
                }
            }
            if (i != 0) {
            }
            mae maeVar2 = new mae(this, 1);
            n0fVar.r = null;
            n0fVar.t = 1;
            n0fVar.w = 2;
            obj = function2.invoke(maeVar2, n0fVar);
            if (obj != obj2) {
            }
        } catch (Throwable th2) {
            th = th2;
            try {
                throw th;
            } catch (Throwable th3) {
                try {
                    n0fVar.r = th;
                    n0fVar.s = th3;
                    n0fVar.w = 5;
                    if (f(false, n0fVar) != obj2) {
                        throw th3;
                    }
                } catch (SQLException e3) {
                    e = e3;
                    th = th3;
                    if (th != null) {
                        throw e;
                    }
                    de6.a(th, e);
                    throw th;
                }
            }
        }
        n0fVar = new n0f(this, sq3Var);
        obj = n0fVar.u;
        obj2 = lu3.a;
        i = n0fVar.w;
    }
}
