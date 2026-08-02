package defpackage;

import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class j7l {
    public final wm3 a;
    public int b;
    public int c;
    public float d;
    public float e;
    public float f;
    public float g;
    public float h;
    public float i;
    public float j;
    public float k;
    public float l;
    public float m;
    public float n;
    public int o;
    public final HashMap p;

    public j7l(j7l j7lVar) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = 0;
        this.p = new HashMap();
        this.a = j7lVar.a;
        this.b = j7lVar.b;
        this.c = j7lVar.c;
        a(j7lVar);
    }

    public final void a(j7l j7lVar) {
        if (j7lVar == null) {
            return;
        }
        this.d = j7lVar.d;
        this.e = j7lVar.e;
        this.f = j7lVar.f;
        this.g = j7lVar.g;
        this.h = j7lVar.h;
        this.i = j7lVar.i;
        this.j = j7lVar.j;
        this.k = j7lVar.k;
        this.l = j7lVar.l;
        this.m = j7lVar.m;
        this.n = j7lVar.n;
        this.o = j7lVar.o;
        HashMap hashMap = this.p;
        hashMap.clear();
        for (na4 na4Var : j7lVar.p.values()) {
            String str = na4Var.a;
            na4 na4Var2 = new na4();
            na4Var2.c = Integer.MIN_VALUE;
            na4Var2.d = Float.NaN;
            na4Var2.a = str;
            na4Var2.b = na4Var.b;
            na4Var2.c = na4Var.c;
            na4Var2.d = na4Var.d;
            hashMap.put(str, na4Var2);
        }
    }

    public j7l(wm3 wm3Var) {
        this.a = null;
        this.b = 0;
        this.c = 0;
        this.d = Float.NaN;
        this.e = Float.NaN;
        this.f = Float.NaN;
        this.g = Float.NaN;
        this.h = Float.NaN;
        this.i = Float.NaN;
        this.j = Float.NaN;
        this.k = Float.NaN;
        this.l = Float.NaN;
        this.m = Float.NaN;
        this.n = Float.NaN;
        this.o = 0;
        this.p = new HashMap();
        this.a = wm3Var;
    }
}
