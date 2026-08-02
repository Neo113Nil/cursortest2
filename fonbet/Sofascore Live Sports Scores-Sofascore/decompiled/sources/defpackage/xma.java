package defpackage;

import java.util.HashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xma {
    public final po a;
    public boolean c;
    public boolean d;
    public boolean e;
    public boolean f;
    public boolean g;
    public po h;
    public final /* synthetic */ int j;
    public boolean b = true;
    public final HashMap i = new HashMap();

    public xma(po poVar, int i) {
        this.j = i;
        this.a = poVar;
    }

    public final void a(jo joVar, int i, wdd wddVar) {
        float f = i;
        long floatToRawIntBits = Float.floatToRawIntBits(f) << 32;
        long floatToRawIntBits2 = Float.floatToRawIntBits(f) & 4294967295L;
        while (true) {
            long j = floatToRawIntBits | floatToRawIntBits2;
            do {
                switch (this.j) {
                    case 0:
                        qyd qydVar = wddVar.L;
                        if (qydVar != null) {
                            q29 q29Var = (q29) qydVar;
                            float[] b = q29Var.b();
                            if (!q29Var.s) {
                                j = xzb.b(j, b);
                            }
                        }
                        j = s6a.H(j, wddVar.z);
                        break;
                    default:
                        vkb c1 = wddVar.c1();
                        c1.getClass();
                        long j2 = c1.p;
                        j = dnd.i((Float.floatToRawIntBits((int) (j2 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j2 >> 32)) << 32), j);
                        break;
                }
                wddVar = wddVar.q;
                wddVar.getClass();
                if (wddVar.equals(this.a.y())) {
                    int round = Math.round(joVar instanceof ye9 ? Float.intBitsToFloat((int) (j & 4294967295L)) : Float.intBitsToFloat((int) (j >> 32)));
                    HashMap hashMap = this.i;
                    if (hashMap.containsKey(joVar)) {
                        int intValue = ((Number) rub.a(joVar, hashMap)).intValue();
                        ye9 ye9Var = mo.a;
                        round = ((Number) joVar.a.invoke(Integer.valueOf(intValue), Integer.valueOf(round))).intValue();
                    }
                    hashMap.put(joVar, Integer.valueOf(round));
                    return;
                }
            } while (!b(wddVar).containsKey(joVar));
            float c = c(wddVar, joVar);
            long floatToRawIntBits3 = Float.floatToRawIntBits(c);
            long floatToRawIntBits4 = Float.floatToRawIntBits(c);
            floatToRawIntBits = floatToRawIntBits3 << 32;
            floatToRawIntBits2 = floatToRawIntBits4 & 4294967295L;
        }
    }

    public final Map b(wdd wddVar) {
        switch (this.j) {
            case 0:
                return wddVar.z0().a();
            default:
                vkb c1 = wddVar.c1();
                c1.getClass();
                return c1.z0().a();
        }
    }

    public final int c(wdd wddVar, jo joVar) {
        switch (this.j) {
            case 0:
                return wddVar.R(joVar);
            default:
                vkb c1 = wddVar.c1();
                c1.getClass();
                return c1.R(joVar);
        }
    }

    public final boolean d() {
        return this.c || this.e || this.f || this.g;
    }

    public final boolean e() {
        h();
        return this.h != null;
    }

    public final void f() {
        this.b = true;
        po poVar = this.a;
        po c = poVar.c();
        if (c == null) {
            return;
        }
        if (this.c) {
            c.Q();
        } else if (this.e || this.d) {
            c.requestLayout();
        }
        if (this.f) {
            poVar.Q();
        }
        if (this.g) {
            poVar.requestLayout();
        }
        c.a().f();
    }

    public final void g() {
        HashMap hashMap = this.i;
        hashMap.clear();
        oo ooVar = new oo(this, 0);
        po poVar = this.a;
        poVar.M(ooVar);
        hashMap.putAll(b(poVar.y()));
        this.b = false;
    }

    public final void h() {
        xma a;
        xma a2;
        boolean d = d();
        po poVar = this.a;
        if (!d) {
            po c = poVar.c();
            if (c == null) {
                return;
            }
            poVar = c.a().h;
            if (poVar == null || !poVar.a().d()) {
                po poVar2 = this.h;
                if (poVar2 == null || poVar2.a().d()) {
                    return;
                }
                po c2 = poVar2.c();
                if (c2 != null && (a2 = c2.a()) != null) {
                    a2.h();
                }
                po c3 = poVar2.c();
                poVar = (c3 == null || (a = c3.a()) == null) ? null : a.h;
            }
        }
        this.h = poVar;
    }
}
