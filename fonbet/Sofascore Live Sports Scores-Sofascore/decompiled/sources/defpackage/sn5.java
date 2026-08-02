package defpackage;

import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.util.Log;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.function.Supplier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class sn5 {
    public static final boolean h = Log.isLoggable("Engine", 2);
    public final t9d a;
    public final zic b;
    public final anb c;
    public final nc3 d;
    public final fjg e;
    public final b10 f;
    public final ujg g;

    public sn5(anb anbVar, d4a d4aVar, oz8 oz8Var, oz8 oz8Var2, oz8 oz8Var3, oz8 oz8Var4) {
        this.c = anbVar;
        ggf ggfVar = new ggf(d4aVar);
        ujg ujgVar = new ujg(3);
        this.g = ujgVar;
        synchronized (this) {
            synchronized (ujgVar) {
                ujgVar.e = this;
            }
        }
        int i = 22;
        this.b = new zic(i);
        this.a = new t9d(28);
        nc3 nc3Var = new nc3();
        nc3Var.g = m6k.d0(150, new dad(nc3Var, i));
        nc3Var.a = oz8Var;
        nc3Var.b = oz8Var2;
        nc3Var.c = oz8Var3;
        nc3Var.d = oz8Var4;
        nc3Var.e = this;
        nc3Var.f = this;
        this.d = nc3Var;
        this.f = new b10(ggfVar);
        fjg fjgVar = new fjg();
        fjgVar.b = new Handler(Looper.getMainLooper(), new h71(1));
        this.e = fjgVar;
        anbVar.d = this;
    }

    public static void e(e1g e1gVar) {
        if (e1gVar instanceof lo5) {
            ((lo5) e1gVar).e();
        } else {
            a70.p("Cannot release anything but an EngineResource");
        }
    }

    public final hcc a(jz8 jz8Var, Object obj, pia piaVar, int i, int i2, Class cls, Class cls2, k7f k7fVar, t35 t35Var, pf2 pf2Var, boolean z, boolean z2, uvd uvdVar, boolean z3, boolean z4, hih hihVar, g35 g35Var) {
        long j;
        if (h) {
            int i3 = vib.a;
            j = SystemClock.elapsedRealtimeNanos();
        } else {
            j = 0;
        }
        this.b.getClass();
        ko5 ko5Var = new ko5(obj, piaVar, i, i2, pf2Var, cls, cls2, uvdVar);
        synchronized (this) {
            try {
                lo5 b = b(ko5Var, z3, j);
                if (b == null) {
                    return f(jz8Var, obj, piaVar, i, i2, cls, cls2, k7fVar, t35Var, pf2Var, z, z2, uvdVar, z3, z4, hihVar, g35Var, ko5Var, j);
                }
                hihVar.h(b, 5);
                return null;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final lo5 b(ko5 ko5Var, boolean z, long j) {
        lo5 lo5Var;
        Object obj;
        sn5 sn5Var;
        ko5 ko5Var2;
        lo5 lo5Var2;
        if (z) {
            ujg ujgVar = this.g;
            synchronized (ujgVar) {
                rc rcVar = (rc) ((HashMap) ujgVar.c).get(ko5Var);
                if (rcVar == null) {
                    lo5Var = null;
                } else {
                    lo5Var = (lo5) rcVar.get();
                    if (lo5Var == null) {
                        ujgVar.L(rcVar);
                    }
                }
            }
            if (lo5Var != null) {
                lo5Var.b();
            }
            if (lo5Var != null) {
                if (h) {
                    int i = vib.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(ko5Var);
                }
                return lo5Var;
            }
            anb anbVar = this.c;
            synchronized (anbVar) {
                ymb ymbVar = (ymb) ((LinkedHashMap) anbVar.c).remove(ko5Var);
                if (ymbVar == null) {
                    obj = null;
                } else {
                    anbVar.b -= ymbVar.b;
                    obj = ymbVar.a;
                }
            }
            e1g e1gVar = (e1g) obj;
            if (e1gVar == null) {
                sn5Var = this;
                ko5Var2 = ko5Var;
                lo5Var2 = null;
            } else if (e1gVar instanceof lo5) {
                lo5Var2 = (lo5) e1gVar;
                sn5Var = this;
                ko5Var2 = ko5Var;
            } else {
                sn5Var = this;
                ko5Var2 = ko5Var;
                lo5Var2 = new lo5(e1gVar, true, true, ko5Var2, sn5Var);
            }
            if (lo5Var2 != null) {
                lo5Var2.b();
                sn5Var.g.y(ko5Var2, lo5Var2);
            }
            if (lo5Var2 != null) {
                if (h) {
                    int i2 = vib.a;
                    SystemClock.elapsedRealtimeNanos();
                    Objects.toString(ko5Var2);
                }
                return lo5Var2;
            }
        }
        return null;
    }

    public final synchronized void c(jo5 jo5Var, ko5 ko5Var, lo5 lo5Var) {
        if (lo5Var != null) {
            try {
                if (lo5Var.a) {
                    this.g.y(ko5Var, lo5Var);
                }
            } finally {
            }
        }
        t9d t9dVar = this.a;
        t9dVar.getClass();
        jo5Var.getClass();
        HashMap hashMap = (HashMap) t9dVar.a;
        if (jo5Var == hashMap.get(ko5Var)) {
            hashMap.remove(ko5Var);
        }
    }

    public final void d(pia piaVar, lo5 lo5Var) {
        ujg ujgVar = this.g;
        synchronized (ujgVar) {
            rc rcVar = (rc) ((HashMap) ujgVar.c).remove(piaVar);
            if (rcVar != null) {
                rcVar.c = null;
                rcVar.clear();
            }
        }
        if (lo5Var.a) {
        } else {
            this.e.r(lo5Var, false);
        }
    }

    public final hcc f(jz8 jz8Var, Object obj, pia piaVar, int i, int i2, Class cls, Class cls2, k7f k7fVar, t35 t35Var, pf2 pf2Var, boolean z, boolean z2, uvd uvdVar, boolean z3, boolean z4, hih hihVar, Executor executor, ko5 ko5Var, long j) {
        oz8 oz8Var;
        jo5 jo5Var = (jo5) ((HashMap) this.a.a).get(ko5Var);
        if (jo5Var != null) {
            jo5Var.a(hihVar, executor);
            if (h) {
                int i3 = vib.a;
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(ko5Var);
            }
            return new hcc(this, hihVar, jo5Var);
        }
        jo5 jo5Var2 = (jo5) ((sx2) this.d.g).c();
        synchronized (jo5Var2) {
            jo5Var2.j = ko5Var;
            jo5Var2.k = z3;
            jo5Var2.l = z4;
        }
        b10 b10Var = this.f;
        tl4 tl4Var = (tl4) ((sx2) b10Var.d).c();
        int i4 = b10Var.b;
        b10Var.b = i4 + 1;
        sl4 sl4Var = tl4Var.a;
        ggf ggfVar = tl4Var.d;
        sl4Var.c = jz8Var;
        sl4Var.d = obj;
        sl4Var.n = piaVar;
        sl4Var.e = i;
        sl4Var.f = i2;
        sl4Var.p = t35Var;
        sl4Var.g = cls;
        sl4Var.h = ggfVar;
        sl4Var.k = cls2;
        sl4Var.o = k7fVar;
        sl4Var.i = uvdVar;
        sl4Var.j = pf2Var;
        sl4Var.q = z;
        sl4Var.r = z2;
        tl4Var.h = jz8Var;
        tl4Var.i = piaVar;
        tl4Var.j = k7fVar;
        tl4Var.k = ko5Var;
        tl4Var.l = i;
        tl4Var.m = i2;
        tl4Var.n = t35Var;
        tl4Var.o = uvdVar;
        tl4Var.p = jo5Var2;
        tl4Var.q = i4;
        tl4Var.E = 1;
        tl4Var.r = obj;
        tl4Var.s = jz8Var.f;
        tl4Var.t = (Supplier) uvdVar.c(tl4.G);
        t9d t9dVar = this.a;
        t9dVar.getClass();
        ((HashMap) t9dVar.a).put(ko5Var, jo5Var2);
        jo5Var2.a(hihVar, executor);
        synchronized (jo5Var2) {
            jo5Var2.s = tl4Var;
            int h2 = tl4Var.h(1);
            if (h2 != 2 && h2 != 3) {
                oz8Var = jo5Var2.l ? jo5Var2.h : jo5Var2.g;
                oz8Var.execute(tl4Var);
            }
            oz8Var = jo5Var2.f;
            oz8Var.execute(tl4Var);
        }
        if (h) {
            int i5 = vib.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(ko5Var);
        }
        return new hcc(this, hihVar, jo5Var2);
    }
}
