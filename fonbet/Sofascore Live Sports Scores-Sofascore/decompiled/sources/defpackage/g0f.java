package defpackage;

import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class g0f {
    public final int a;
    public final Function0 b;
    public final ReentrantLock c = new ReentrantLock();
    public int d;
    public boolean e;
    public final kk3[] f;
    public final g4h g;
    public final vg0 h;

    public g0f(int i, Function0 function0) {
        this.a = i;
        this.b = function0;
        this.f = new kk3[i];
        int i2 = h4h.a;
        this.g = new g4h(i);
        this.h = new vg0(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0047 A[Catch: all -> 0x007a, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0083), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x007c A[Catch: all -> 0x007a, TRY_ENTER, TryCatch #1 {all -> 0x007a, blocks: (B:13:0x0043, B:15:0x0047, B:17:0x004d, B:20:0x0054, B:21:0x006e, B:25:0x007c, B:26:0x0083), top: B:12:0x0043, outer: #0 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        e0f e0fVar;
        int i;
        g4h g4hVar;
        ReentrantLock reentrantLock;
        vg0 vg0Var = this.h;
        try {
            try {
                if (sq3Var instanceof e0f) {
                    e0fVar = (e0f) sq3Var;
                    int i2 = e0fVar.t;
                    if ((i2 & Integer.MIN_VALUE) != 0) {
                        e0fVar.t = i2 - Integer.MIN_VALUE;
                        Object obj = e0fVar.r;
                        lu3 lu3Var = lu3.a;
                        i = e0fVar.t;
                        g4hVar = this.g;
                        if (i != 0) {
                            y6a.M(obj);
                            e0fVar.t = 1;
                            if (g4hVar.a(e0fVar) == lu3Var) {
                                return lu3Var;
                            }
                        } else {
                            if (i != 1) {
                                a70.r("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            y6a.M(obj);
                        }
                        reentrantLock = this.c;
                        reentrantLock.lock();
                        if (!this.e) {
                            b0a.R(21, "Connection pool is closed");
                            throw null;
                        }
                        if (vg0Var.isEmpty() && this.d < this.a) {
                            kk3 kk3Var = new kk3((glg) this.b.invoke());
                            kk3[] kk3VarArr = this.f;
                            int i3 = this.d;
                            this.d = i3 + 1;
                            kk3VarArr[i3] = kk3Var;
                            vg0Var.addLast(kk3Var);
                        }
                        return (kk3) vg0Var.removeLast();
                    }
                }
                if (!this.e) {
                }
            } finally {
                reentrantLock.unlock();
            }
            reentrantLock = this.c;
            reentrantLock.lock();
        } catch (Throwable th) {
            g4hVar.c();
            throw th;
        }
        e0fVar = new e0f(this, sq3Var);
        Object obj2 = e0fVar.r;
        lu3 lu3Var2 = lu3.a;
        i = e0fVar.t;
        g4hVar = this.g;
        if (i != 0) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:9|(2:10|11)|12|13|14|(1:(1:33)(2:30|(1:32)))(1:16)|17|18|19|20|(1:22)(10:24|12|13|14|(0)(0)|17|18|19|20|(0)(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0064, code lost:
    
        r2 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0066, code lost:
    
        r12 = r12;
        r11 = r11;
        r2 = r0;
        r0 = r2;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x006f A[Catch: all -> 0x0073, TryCatch #0 {all -> 0x0073, blocks: (B:14:0x006b, B:16:0x006f, B:30:0x0077, B:33:0x007e), top: B:13:0x006b }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0058  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v10, types: [kotlin.jvm.functions.Function0] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:24:0x0058 -> B:12:0x005a). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(long j, m1 m1Var, sq3 sq3Var) {
        f0f f0fVar;
        int i;
        fsf fsfVar;
        f0f f0fVar2;
        Throwable th;
        j8c j8cVar;
        m1 m1Var2;
        if (sq3Var instanceof f0f) {
            f0fVar = (f0f) sq3Var;
            int i2 = f0fVar.w;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                f0fVar.w = i2 - Integer.MIN_VALUE;
                Object obj = f0fVar.u;
                lu3 lu3Var = lu3.a;
                i = f0fVar.w;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    fsf fsfVar2 = new fsf();
                    j8cVar = new j8c(fsfVar2, this, rq3Var, 27);
                    f0fVar.s = m1Var;
                    f0fVar.t = fsfVar2;
                    f0fVar.r = j;
                    f0fVar.w = 1;
                    if (wba.U(n4o.R(j), j8cVar, f0fVar) == lu3Var) {
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    j = f0fVar.r;
                    fsf fsfVar3 = f0fVar.t;
                    ?? r2 = f0fVar.s;
                    try {
                        y6a.M(obj);
                        m1Var2 = r2;
                    } catch (Throwable th2) {
                        fsfVar = fsfVar3;
                        m1Var = r2;
                        f0fVar2 = f0fVar;
                        th = th2;
                    }
                    fsfVar = fsfVar3;
                    m1Var = m1Var2;
                    f0fVar2 = f0fVar;
                    th = null;
                    try {
                        if (th instanceof qij) {
                            m1Var.invoke();
                        } else {
                            if (th != null) {
                                throw th;
                            }
                            Object obj2 = fsfVar.a;
                            if (obj2 != null) {
                                return obj2;
                            }
                        }
                        f0fVar = f0fVar2;
                        fsf fsfVar22 = new fsf();
                        j8cVar = new j8c(fsfVar22, this, rq3Var, 27);
                        f0fVar.s = m1Var;
                        f0fVar.t = fsfVar22;
                        f0fVar.r = j;
                        f0fVar.w = 1;
                        if (wba.U(n4o.R(j), j8cVar, f0fVar) == lu3Var) {
                            return lu3Var;
                        }
                        m1Var2 = m1Var;
                        fsfVar3 = fsfVar22;
                        fsfVar = fsfVar3;
                        m1Var = m1Var2;
                        f0fVar2 = f0fVar;
                        th = null;
                        if (th instanceof qij) {
                        }
                        f0fVar = f0fVar2;
                        fsf fsfVar222 = new fsf();
                        j8cVar = new j8c(fsfVar222, this, rq3Var, 27);
                        f0fVar.s = m1Var;
                        f0fVar.t = fsfVar222;
                        f0fVar.r = j;
                        f0fVar.w = 1;
                        if (wba.U(n4o.R(j), j8cVar, f0fVar) == lu3Var) {
                        }
                    } catch (Throwable th3) {
                        kk3 kk3Var = (kk3) fsfVar.a;
                        if (kk3Var != null) {
                            e(kk3Var);
                        }
                        throw th3;
                    }
                }
            }
        }
        f0fVar = new f0f(this, sq3Var);
        Object obj3 = f0fVar.u;
        lu3 lu3Var2 = lu3.a;
        i = f0fVar.w;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
    }

    public final void c() {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.e = true;
            for (kk3 kk3Var : this.f) {
                if (kk3Var != null) {
                    kk3Var.close();
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void d(StringBuilder sb) {
        vg0 vg0Var = this.h;
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            xbb b = a.b();
            int size = vg0Var.size();
            for (int i = 0; i < size; i++) {
                b.add(vg0Var.get(i));
            }
            xbb a = a.a(b);
            sb.append('\t' + toString() + " (");
            sb.append("capacity=" + this.a + ", ");
            sb.append("permits=" + Math.max(rh0.a.getIntVolatile(this.g, f4h.f), 0) + ", ");
            sb.append("queue=(size=" + a.size() + ")[" + CollectionsKt.f0(a, null, null, null, null, 63) + ']');
            sb.append(")");
            sb.append('\n');
            kk3[] kk3VarArr = this.f;
            int length = kk3VarArr.length;
            int i2 = 0;
            for (int i3 = 0; i3 < length; i3++) {
                kk3 kk3Var = kk3VarArr[i3];
                i2++;
                StringBuilder sb2 = new StringBuilder();
                sb2.append("\t\t[");
                sb2.append(i2);
                sb2.append("] - ");
                sb2.append(kk3Var != null ? kk3Var.a.toString() : null);
                sb.append(sb2.toString());
                sb.append('\n');
                if (kk3Var != null) {
                    kk3Var.g(sb);
                }
            }
            Unit unit = Unit.a;
            reentrantLock.unlock();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void e(kk3 kk3Var) {
        ReentrantLock reentrantLock = this.c;
        reentrantLock.lock();
        try {
            this.h.addLast(kk3Var);
            Unit unit = Unit.a;
            reentrantLock.unlock();
            this.g.c();
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }
}
