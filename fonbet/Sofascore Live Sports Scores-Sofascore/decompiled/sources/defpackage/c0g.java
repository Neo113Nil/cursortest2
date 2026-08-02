package defpackage;

import android.content.Context;
import com.bumptech.glide.a;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class c0g extends r51 {
    public boolean A;
    public boolean B;
    public final Context q;
    public final n0g r;
    public final Class s;
    public final jz8 t;
    public rw8 u;
    public Object v;
    public ArrayList w;
    public c0g x;
    public c0g y;
    public final boolean z = true;

    static {
    }

    public c0g(a aVar, n0g n0gVar, Class cls, Context context) {
        r0g r0gVar;
        this.r = n0gVar;
        this.s = cls;
        this.q = context;
        dh0 dh0Var = n0gVar.a.c.d;
        rw8 rw8Var = (rw8) dh0Var.get(cls);
        if (rw8Var == null) {
            Iterator it = ((yg0) dh0Var.entrySet()).iterator();
            while (it.hasNext()) {
                Map.Entry entry = (Map.Entry) it.next();
                if (((Class) entry.getKey()).isAssignableFrom(cls)) {
                    rw8Var = (rw8) entry.getValue();
                }
            }
        }
        this.u = rw8Var == null ? jz8.h : rw8Var;
        this.t = aVar.c;
        Iterator it2 = n0gVar.i.iterator();
        while (it2.hasNext()) {
            r((kz8) it2.next());
        }
        synchronized (n0gVar) {
            r0gVar = n0gVar.j;
        }
        a(r0gVar);
    }

    @Override // defpackage.r51
    public final boolean equals(Object obj) {
        if (!(obj instanceof c0g)) {
            return false;
        }
        c0g c0gVar = (c0g) obj;
        return super.equals(c0gVar) && Objects.equals(this.s, c0gVar.s) && this.u.equals(c0gVar.u) && Objects.equals(this.v, c0gVar.v) && Objects.equals(this.w, c0gVar.w) && Objects.equals(this.x, c0gVar.x) && Objects.equals(this.y, c0gVar.y) && this.z == c0gVar.z && this.A == c0gVar.A;
    }

    @Override // defpackage.r51
    public final int hashCode() {
        return kik.D(this.A ? 1 : 0, kik.D(this.z ? 1 : 0, kik.E(kik.E(kik.E(kik.E(kik.E(kik.E(kik.E(super.hashCode(), this.s), this.u), this.v), this.w), this.x), this.y), null)));
    }

    public final c0g r(kz8 kz8Var) {
        if (this.n) {
            return clone().r(kz8Var);
        }
        if (kz8Var != null) {
            ArrayList arrayList = this.w;
            if (arrayList == null) {
                arrayList = new ArrayList();
                this.w = arrayList;
            }
            arrayList.add(kz8Var);
        }
        k();
        return this;
    }

    @Override // defpackage.r51
    /* renamed from: s, reason: merged with bridge method [inline-methods] */
    public final c0g a(r51 r51Var) {
        w1a.l(r51Var);
        return (c0g) super.a(r51Var);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final rzf t(Object obj, ka4 ka4Var, d0g d0gVar, rw8 rw8Var, k7f k7fVar, int i, int i2, r51 r51Var) {
        d0g d0gVar2;
        d0g d0gVar3;
        d0g d0gVar4;
        r51 r51Var2;
        hih hihVar;
        k7f k7fVar2;
        if (this.y != null) {
            d0gVar3 = new eq5(obj, d0gVar);
            d0gVar2 = d0gVar3;
        } else {
            d0gVar2 = null;
            d0gVar3 = d0gVar;
        }
        c0g c0gVar = this.x;
        if (c0gVar == null) {
            d0gVar4 = d0gVar2;
            Context context = this.q;
            jz8 jz8Var = this.t;
            Object obj2 = this.v;
            Class cls = this.s;
            ArrayList arrayList = this.w;
            sn5 sn5Var = jz8Var.e;
            rw8Var.getClass();
            r51Var2 = r51Var;
            hihVar = new hih(context, jz8Var, obj, obj2, cls, r51Var2, i, i2, k7fVar, ka4Var, arrayList, d0gVar3, sn5Var);
        } else {
            if (this.B) {
                a70.r("You cannot use a request as both the main request and a thumbnail, consider using clone() on the request(s) passed to thumbnail()");
                return null;
            }
            rw8 rw8Var2 = c0gVar.z ? rw8Var : c0gVar.u;
            if (r51.f(c0gVar.a, 8)) {
                k7fVar2 = this.x.c;
            } else {
                int ordinal = k7fVar.ordinal();
                if (ordinal == 0 || ordinal == 1) {
                    k7fVar2 = k7f.a;
                } else if (ordinal == 2) {
                    k7fVar2 = k7f.b;
                } else {
                    if (ordinal != 3) {
                        zzl.i(this.c, "unknown priority: ");
                        return null;
                    }
                    k7fVar2 = k7f.c;
                }
            }
            k7f k7fVar3 = k7fVar2;
            c0g c0gVar2 = this.x;
            int i3 = c0gVar2.g;
            int i4 = c0gVar2.f;
            if (kik.I(i, i2)) {
                c0g c0gVar3 = this.x;
                if (!kik.I(c0gVar3.g, c0gVar3.f)) {
                    i3 = r51Var.g;
                    i4 = r51Var.f;
                }
            }
            int i5 = i4;
            int i6 = i3;
            sgj sgjVar = new sgj(obj, d0gVar3);
            Context context2 = this.q;
            jz8 jz8Var2 = this.t;
            Object obj3 = this.v;
            Class cls2 = this.s;
            ArrayList arrayList2 = this.w;
            sn5 sn5Var2 = jz8Var2.e;
            rw8Var.getClass();
            sgj sgjVar2 = sgjVar;
            d0gVar4 = d0gVar2;
            hih hihVar2 = new hih(context2, jz8Var2, obj, obj3, cls2, r51Var, i, i2, k7fVar, ka4Var, arrayList2, sgjVar2, sn5Var2);
            this.B = true;
            c0g c0gVar4 = this.x;
            rzf t = c0gVar4.t(obj, ka4Var, sgjVar2, rw8Var2, k7fVar3, i6, i5, c0gVar4);
            this.B = false;
            sgjVar2.c = hihVar2;
            sgjVar2.d = t;
            r51Var2 = r51Var;
            hihVar = sgjVar2;
        }
        if (d0gVar4 == null) {
            return hihVar;
        }
        c0g c0gVar5 = this.y;
        int i7 = c0gVar5.g;
        int i8 = c0gVar5.f;
        if (kik.I(i, i2)) {
            c0g c0gVar6 = this.y;
            if (!kik.I(c0gVar6.g, c0gVar6.f)) {
                i7 = r51Var2.g;
                i8 = r51Var2.f;
            }
        }
        c0g c0gVar7 = this.y;
        eq5 eq5Var = d0gVar4;
        rzf t2 = c0gVar7.t(obj, ka4Var, eq5Var, c0gVar7.u, c0gVar7.c, i7, i8, c0gVar7);
        eq5Var.c = hihVar;
        eq5Var.d = t2;
        return eq5Var;
    }

    @Override // defpackage.r51
    /* renamed from: u, reason: merged with bridge method [inline-methods] */
    public final c0g clone() {
        c0g c0gVar = (c0g) super.clone();
        c0gVar.u = c0gVar.u.clone();
        if (c0gVar.w != null) {
            c0gVar.w = new ArrayList(c0gVar.w);
        }
        c0g c0gVar2 = c0gVar.x;
        if (c0gVar2 != null) {
            c0gVar.x = c0gVar2.clone();
        }
        c0g c0gVar3 = c0gVar.y;
        if (c0gVar3 != null) {
            c0gVar.y = c0gVar3.clone();
        }
        return c0gVar;
    }

    public final void v(ka4 ka4Var) {
        w1a.l(ka4Var);
        if (!this.A) {
            a70.p("You must call #load() before calling #into()");
            return;
        }
        rzf t = t(new Object(), ka4Var, null, this.u, this.c, this.g, this.f, this);
        rzf rzfVar = ka4Var.a;
        if (t.e(rzfVar) && (this.e || !rzfVar.d())) {
            w1a.m(rzfVar, "Argument must not be null");
            if (rzfVar.isRunning()) {
                return;
            }
            rzfVar.j();
            return;
        }
        this.r.a(ka4Var);
        ka4Var.a = t;
        n0g n0gVar = this.r;
        synchronized (n0gVar) {
            n0gVar.f.a.add(ka4Var);
            yih yihVar = n0gVar.d;
            ((Set) yihVar.c).add(t);
            if (yihVar.b) {
                t.clear();
                ((HashSet) yihVar.d).add(t);
            } else {
                t.j();
            }
        }
    }

    public final c0g w(Object obj) {
        if (this.n) {
            return clone().w(obj);
        }
        this.v = obj;
        this.A = true;
        k();
        return this;
    }
}
