package defpackage;

import android.os.Process;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.function.Supplier;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tl4 implements yd4, Runnable, Comparable, tm6 {
    public static final ivd G = new ivd("glide_thread_priority_override", null, ivd.e);
    public volatile boolean A;
    public volatile boolean B;
    public boolean C;
    public int D;
    public int E;
    public int F;
    public final ggf d;
    public final r0f e;
    public jz8 h;
    public pia i;
    public k7f j;
    public ko5 k;
    public int l;
    public int m;
    public t35 n;
    public uvd o;
    public jo5 p;
    public int q;
    public Object r;
    public t9d s;
    public Supplier t;
    public Thread u;
    public pia v;
    public pia w;
    public Object x;
    public xd4 y;
    public volatile zd4 z;
    public final sl4 a = new sl4();
    public final ArrayList b = new ArrayList();
    public final tdi c = new tdi();
    public final l2a f = new l2a(6);
    public final vn0 g = new vn0();

    public tl4(ggf ggfVar, sx2 sx2Var) {
        this.d = ggfVar;
        this.e = sx2Var;
    }

    @Override // defpackage.yd4
    public final void a(pia piaVar, Object obj, xd4 xd4Var, int i, pia piaVar2) {
        this.v = piaVar;
        this.x = obj;
        this.y = xd4Var;
        this.F = i;
        this.w = piaVar2;
        this.C = piaVar != this.a.a().get(0);
        if (Thread.currentThread() == this.u) {
            f();
            return;
        }
        this.E = 3;
        jo5 jo5Var = this.p;
        (jo5Var.l ? jo5Var.h : jo5Var.g).execute(this);
    }

    @Override // defpackage.tm6
    public final tdi b() {
        return this.c;
    }

    @Override // defpackage.yd4
    public final void c(pia piaVar, Exception exc, xd4 xd4Var, int i) {
        xd4Var.a();
        mz8 mz8Var = new mz8("Fetching data failed", Collections.singletonList(exc));
        Class c = xd4Var.c();
        mz8Var.b = piaVar;
        mz8Var.c = i;
        mz8Var.d = c;
        this.b.add(mz8Var);
        if (Thread.currentThread() == this.u) {
            l();
            return;
        }
        this.E = 2;
        jo5 jo5Var = this.p;
        (jo5Var.l ? jo5Var.h : jo5Var.g).execute(this);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        tl4 tl4Var = (tl4) obj;
        int ordinal = this.j.ordinal() - tl4Var.j.ordinal();
        return ordinal == 0 ? this.q - tl4Var.q : ordinal;
    }

    public final e1g d(xd4 xd4Var, Object obj, int i) {
        if (obj == null) {
            xd4Var.a();
            return null;
        }
        try {
            int i2 = vib.a;
            SystemClock.elapsedRealtimeNanos();
            e1g e = e(i, obj);
            if (Log.isLoggable("DecodeJob", 2)) {
                e.toString();
                SystemClock.elapsedRealtimeNanos();
                Objects.toString(this.k);
                Thread.currentThread().getName();
            }
            return e;
        } finally {
            xd4Var.a();
        }
    }

    public final e1g e(int i, Object obj) {
        Class<?> cls = obj.getClass();
        sl4 sl4Var = this.a;
        mfb c = sl4Var.c(cls);
        uvd uvdVar = this.o;
        boolean z = i == 4 || sl4Var.r;
        ivd ivdVar = n75.i;
        Boolean bool = (Boolean) uvdVar.c(ivdVar);
        if (bool == null || (bool.booleanValue() && !z)) {
            uvdVar = new uvd();
            pf2 pf2Var = this.o.b;
            pf2 pf2Var2 = uvdVar.b;
            pf2Var2.h(pf2Var);
            pf2Var2.put(ivdVar, Boolean.valueOf(z));
        }
        uvd uvdVar2 = uvdVar;
        ie4 g = this.h.a().g(obj);
        try {
            return c.a(this.l, this.m, new yz1(this, i, 2), g, uvdVar2);
        } finally {
            g.a();
        }
    }

    public final void f() {
        e1g e1gVar;
        boolean b;
        Supplier supplier;
        if (Log.isLoggable("DecodeJob", 2)) {
            String str = "data: " + this.x + ", cache key: " + this.v + ", fetcher: " + this.y;
            int i = vib.a;
            SystemClock.elapsedRealtimeNanos();
            Objects.toString(this.k);
            ", ".concat(str);
            Thread.currentThread().getName();
        }
        mib mibVar = null;
        if (((Map) this.s.a).containsKey(hz8.class) && (supplier = this.t) != null && supplier.get() != null) {
            try {
                Process.setThreadPriority(Process.myTid(), ((Integer) this.t.get()).intValue());
            } catch (IllegalArgumentException | SecurityException unused) {
                this.t = null;
            }
        }
        try {
            e1gVar = d(this.y, this.x, this.F);
        } catch (mz8 e) {
            pia piaVar = this.w;
            int i2 = this.F;
            e.b = piaVar;
            e.c = i2;
            e.d = null;
            this.b.add(e);
            e1gVar = null;
        }
        if (e1gVar == null) {
            l();
            return;
        }
        int i3 = this.F;
        if (e1gVar instanceof d3a) {
            ((d3a) e1gVar).b();
        }
        if (((mib) this.f.d) != null) {
            mibVar = (mib) mib.e.c();
            mibVar.d = false;
            mibVar.c = true;
            mibVar.b = e1gVar;
            e1gVar = mibVar;
        }
        if (((Map) this.s.a).containsKey(hz8.class)) {
            k();
        }
        n();
        jo5 jo5Var = this.p;
        synchronized (jo5Var) {
            jo5Var.m = e1gVar;
            jo5Var.n = i3;
        }
        synchronized (jo5Var) {
            try {
                jo5Var.b.a();
                if (jo5Var.t) {
                    jo5Var.m.c();
                    jo5Var.f();
                } else {
                    if (jo5Var.a.a.isEmpty()) {
                        throw new IllegalStateException("Received a resource without any callbacks to notify");
                    }
                    if (jo5Var.o) {
                        throw new IllegalStateException("Already have resource");
                    }
                    jo5Var.r = new lo5(jo5Var.m, jo5Var.k, true, jo5Var.j, jo5Var.c);
                    jo5Var.o = true;
                    ArrayList arrayList = new ArrayList(jo5Var.a.a);
                    jo5Var.d(arrayList.size() + 1);
                    jo5Var.e.c(jo5Var, jo5Var.j, jo5Var.r);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ho5 ho5Var = (ho5) it.next();
                        ho5Var.b.execute(new pyn(jo5Var, ho5Var.a, r4, 10));
                    }
                    jo5Var.c();
                }
            } finally {
            }
        }
        this.D = 5;
        try {
            l2a l2aVar = this.f;
            if (((mib) l2aVar.d) != null) {
                try {
                    this.d.d().d((pia) l2aVar.b, new sx2((m1g) l2aVar.c, (mib) l2aVar.d, this.o));
                    ((mib) l2aVar.d).e();
                } catch (Throwable th) {
                    ((mib) l2aVar.d).e();
                    throw th;
                }
            }
            if (mibVar != null) {
                mibVar.e();
            }
            vn0 vn0Var = this.g;
            synchronized (vn0Var) {
                vn0Var.b = true;
                b = vn0Var.b();
            }
            if (b) {
                j();
            }
        } finally {
        }
    }

    public final zd4 g() {
        int C = wt3.C(this.D);
        sl4 sl4Var = this.a;
        if (C == 1) {
            return new f1g(sl4Var, this);
        }
        if (C == 2) {
            return new pd4(sl4Var.a(), sl4Var, this);
        }
        if (C == 3) {
            return new gwh(sl4Var, this);
        }
        if (C == 5) {
            return null;
        }
        a70.r("Unrecognized stage: ".concat(me4.v(this.D)));
        return null;
    }

    public final int h(int i) {
        int C = wt3.C(i);
        boolean z = false;
        if (C == 0) {
            switch (this.n.a) {
                case 0:
                case 1:
                    break;
                default:
                    z = true;
                    break;
            }
            if (z) {
                return 2;
            }
            return h(2);
        }
        if (C != 1) {
            if (C == 2) {
                return 4;
            }
            if (C == 3 || C == 5) {
                return 6;
            }
            a70.p("Unrecognized stage: ".concat(me4.v(i)));
            return 0;
        }
        switch (this.n.a) {
            case 0:
                break;
            case 1:
            default:
                z = true;
                break;
        }
        if (z) {
            return 3;
        }
        return h(3);
    }

    public final void i() {
        boolean b;
        if (((Map) this.s.a).containsKey(hz8.class)) {
            k();
        }
        n();
        mz8 mz8Var = new mz8("Failed to load resource", new ArrayList(this.b));
        jo5 jo5Var = this.p;
        synchronized (jo5Var) {
            jo5Var.p = mz8Var;
        }
        synchronized (jo5Var) {
            try {
                jo5Var.b.a();
                if (jo5Var.t) {
                    jo5Var.f();
                } else {
                    if (jo5Var.a.a.isEmpty()) {
                        throw new IllegalStateException("Received an exception without any callbacks to notify");
                    }
                    if (jo5Var.q) {
                        throw new IllegalStateException("Already failed once");
                    }
                    jo5Var.q = true;
                    ko5 ko5Var = jo5Var.j;
                    ArrayList arrayList = new ArrayList(jo5Var.a.a);
                    jo5Var.d(arrayList.size() + 1);
                    jo5Var.e.c(jo5Var, ko5Var, null);
                    Iterator it = arrayList.iterator();
                    while (it.hasNext()) {
                        ho5 ho5Var = (ho5) it.next();
                        ho5Var.b.execute(new a8p(jo5Var, ho5Var.a, false, 11));
                    }
                    jo5Var.c();
                }
            } finally {
            }
        }
        vn0 vn0Var = this.g;
        synchronized (vn0Var) {
            vn0Var.c = true;
            b = vn0Var.b();
        }
        if (b) {
            j();
        }
    }

    public final void j() {
        vn0 vn0Var = this.g;
        synchronized (vn0Var) {
            vn0Var.b = false;
            vn0Var.a = false;
            vn0Var.c = false;
        }
        l2a l2aVar = this.f;
        l2aVar.b = null;
        l2aVar.c = null;
        l2aVar.d = null;
        sl4 sl4Var = this.a;
        sl4Var.c = null;
        sl4Var.d = null;
        sl4Var.n = null;
        sl4Var.g = null;
        sl4Var.k = null;
        sl4Var.i = null;
        sl4Var.o = null;
        sl4Var.j = null;
        sl4Var.p = null;
        sl4Var.a.clear();
        sl4Var.l = false;
        sl4Var.b.clear();
        sl4Var.m = false;
        this.A = false;
        this.h = null;
        this.i = null;
        this.o = null;
        this.j = null;
        this.k = null;
        this.p = null;
        this.D = 0;
        this.z = null;
        this.u = null;
        this.v = null;
        this.x = null;
        this.F = 0;
        this.y = null;
        this.B = false;
        this.r = null;
        this.b.clear();
        this.e.b(this);
    }

    public final void k() {
        if (!((Map) this.s.a).containsKey(hz8.class)) {
            a70.r("OverrideGlideThreadPriority experiment is not enabled.");
            return;
        }
        Supplier supplier = this.t;
        if (supplier == null || supplier.get() == null) {
            return;
        }
        try {
            Process.setThreadPriority(Process.myTid(), 9);
        } catch (IllegalArgumentException | SecurityException unused) {
            this.t = null;
        }
    }

    public final void l() {
        this.u = Thread.currentThread();
        int i = vib.a;
        SystemClock.elapsedRealtimeNanos();
        boolean z = false;
        while (!this.B && this.z != null && !(z = this.z.b())) {
            this.D = h(this.D);
            this.z = g();
            if (this.D == 4) {
                this.E = 2;
                jo5 jo5Var = this.p;
                (jo5Var.l ? jo5Var.h : jo5Var.g).execute(this);
                return;
            }
        }
        if ((this.D == 6 || this.B) && !z) {
            i();
        }
    }

    public final void m() {
        int C = wt3.C(this.E);
        if (C == 0) {
            this.D = h(1);
            this.z = g();
            l();
        } else if (C == 1) {
            l();
        } else if (C == 2) {
            f();
        } else {
            int i = this.E;
            a70.r("Unrecognized run reason: ".concat(i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE"));
        }
    }

    public final void n() {
        this.c.a();
        if (this.A) {
            sw9.m("Already notified", this.b.isEmpty() ? null : (Throwable) mz1.h(this.b, 1));
        } else {
            this.A = true;
        }
    }

    @Override // java.lang.Runnable
    public final void run() {
        xd4 xd4Var = this.y;
        try {
            try {
                if (this.B) {
                    i();
                    if (xd4Var != null) {
                        xd4Var.a();
                        return;
                    }
                    return;
                }
                m();
                if (xd4Var != null) {
                    xd4Var.a();
                }
            } catch (Throwable th) {
                if (xd4Var != null) {
                    xd4Var.a();
                }
                throw th;
            }
        } catch (rh2 e) {
            throw e;
        } catch (Throwable th2) {
            if (this.D != 5) {
                this.b.add(th2);
                i();
            }
            if (!this.B) {
                throw th2;
            }
            throw th2;
        }
    }
}
