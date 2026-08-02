package defpackage;

import java.util.ArrayList;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zci {
    public imf a;
    public boolean b = true;
    public final HashMap c;
    public final HashMap d;
    public final HashMap e;
    public final fm3 f;
    public int g;
    public final ArrayList h;
    public final ArrayList i;
    public boolean j;
    public final kx4 k;
    public long l;

    public zci(kx4 kx4Var) {
        HashMap hashMap = new HashMap();
        this.c = hashMap;
        this.d = new HashMap();
        this.e = new HashMap();
        fm3 fm3Var = new fm3(this);
        this.f = fm3Var;
        this.g = 0;
        this.h = new ArrayList();
        this.i = new ArrayList();
        this.j = true;
        fm3Var.a = 0;
        hashMap.put(0, fm3Var);
        this.k = kx4Var;
        this.l = cn3.b(0, 0, 0, 0, 15);
        ema emaVar = ema.a;
        this.a = new imf(this, 15);
    }

    public final void a(Object obj) {
        this.h.add(obj);
        this.j = true;
    }

    public final fm3 b(Object obj) {
        HashMap hashMap = this.c;
        gtf gtfVar = (gtf) hashMap.get(obj);
        gtf gtfVar2 = gtfVar;
        if (gtfVar == null) {
            fm3 fm3Var = new fm3(this);
            hashMap.put(obj, fm3Var);
            fm3Var.a = obj;
            gtfVar2 = fm3Var;
        }
        if (gtfVar2 instanceof fm3) {
            return (fm3) gtfVar2;
        }
        return null;
    }

    public final int c(Float f) {
        return Math.round(f.floatValue());
    }

    public final u49 d(int i, String str) {
        fm3 b = b(str);
        hm6 hm6Var = b.c;
        if (hm6Var == null || !(hm6Var instanceof u49)) {
            u49 u49Var = new u49(this);
            u49Var.b = i;
            u49Var.g = str;
            b.c = u49Var;
            b.b(u49Var.a());
        }
        return (u49) b.c;
    }

    public final r99 e(int i) {
        r99 r99Var;
        StringBuilder sb = new StringBuilder("__HELPER_KEY_");
        int i2 = this.g;
        this.g = i2 + 1;
        String h = fc6.h(i2, "__", sb);
        HashMap hashMap = this.d;
        r99 r99Var2 = (r99) hashMap.get(h);
        r99 r99Var3 = r99Var2;
        if (r99Var2 == null) {
            int i3 = 4;
            int i4 = 1;
            switch (wt3.C(i)) {
                case 0:
                    r99Var = new cf9(this, 1);
                    break;
                case 1:
                    r99Var = new qok(this, 2);
                    break;
                case 2:
                    co coVar = new co(this, i3, 0);
                    coVar.o0 = 0.5f;
                    r99Var = coVar;
                    break;
                case 3:
                    co coVar2 = new co(this, i3, i4);
                    coVar2.o0 = 0.5f;
                    r99Var = coVar2;
                    break;
                case 4:
                    r99Var = new c01(this, 5);
                    break;
                case 5:
                default:
                    r99Var = new r99(this, i);
                    break;
                case 6:
                case 7:
                    r99Var = new ib8(this, i);
                    break;
                case 8:
                case 9:
                case 10:
                    r99Var = new r39(this, i);
                    break;
            }
            r99Var.a = h;
            hashMap.put(h, r99Var);
            r99Var3 = r99Var;
        }
        return r99Var3;
    }
}
