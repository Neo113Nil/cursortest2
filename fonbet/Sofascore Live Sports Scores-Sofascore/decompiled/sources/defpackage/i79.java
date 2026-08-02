package defpackage;

import java.util.AbstractMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class i79 extends p5 {
    public final /* synthetic */ int a;
    public final AbstractMap b;
    public final Object c;
    public int d;

    public i79(o79 o79Var, int i, int i2) {
        this.a = i2;
        switch (i2) {
            case 1:
                this.b = o79Var;
                this.c = o79Var.b[i];
                this.d = i;
                break;
            default:
                this.b = o79Var;
                this.c = o79Var.a[i];
                this.d = i;
                break;
        }
    }

    public void d() {
        o79 o79Var = (o79) this.b;
        int i = this.d;
        Object obj = this.c;
        if (i == -1 || i > o79Var.c || !sha.r(o79Var.a[i], obj)) {
            this.d = o79Var.i(tol.B(obj), obj);
        }
    }

    public void g() {
        o79 o79Var = (o79) this.b;
        int i = this.d;
        Object obj = this.c;
        if (i == -1 || i > o79Var.c || !sha.r(obj, o79Var.b[i])) {
            this.d = o79Var.j(tol.B(obj), obj);
        }
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        switch (this.a) {
        }
        return this.c;
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        switch (i) {
            case 0:
                d();
                int i2 = this.d;
                if (i2 == -1) {
                    return null;
                }
                return ((o79) abstractMap).b[i2];
            case 1:
                g();
                int i3 = this.d;
                if (i3 == -1) {
                    return null;
                }
                return ((o79) abstractMap).a[i3];
            default:
                o53 o53Var = (o53) abstractMap;
                Map g = o53Var.g();
                if (g != null) {
                    return g.get(this.c);
                }
                h();
                int i4 = this.d;
                if (i4 == -1) {
                    return null;
                }
                return o53Var.p()[i4];
        }
    }

    public void h() {
        o53 o53Var = (o53) this.b;
        int i = this.d;
        Object obj = this.c;
        if (i != -1 && i < o53Var.size()) {
            if (sha.r(obj, o53Var.o()[this.d])) {
                return;
            }
        }
        Object obj2 = o53.j;
        this.d = o53Var.i(obj);
    }

    @Override // defpackage.p5, java.util.Map.Entry
    public final Object setValue(Object obj) {
        int i = this.a;
        AbstractMap abstractMap = this.b;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                d();
                int i2 = this.d;
                o79 o79Var = (o79) abstractMap;
                if (i2 == -1) {
                    o79Var.n(obj2, obj, false);
                    return null;
                }
                Object obj3 = o79Var.b[i2];
                if (sha.r(obj3, obj)) {
                    return obj;
                }
                o79Var.t(this.d, obj, false);
                return obj3;
            case 1:
                g();
                int i3 = this.d;
                o79 o79Var2 = (o79) abstractMap;
                if (i3 == -1) {
                    o79Var2.o(obj2, obj, false);
                    return null;
                }
                Object obj4 = o79Var2.a[i3];
                if (sha.r(obj4, obj)) {
                    return obj;
                }
                o79Var2.s(this.d, obj, false);
                return obj4;
            default:
                o53 o53Var = (o53) abstractMap;
                Map g = o53Var.g();
                if (g != null) {
                    return g.put(obj2, obj);
                }
                h();
                int i4 = this.d;
                if (i4 == -1) {
                    o53Var.put(obj2, obj);
                    return null;
                }
                Object obj5 = o53Var.p()[i4];
                o53Var.p()[this.d] = obj;
                return obj5;
        }
    }

    public i79(o53 o53Var, int i) {
        this.a = 2;
        this.b = o53Var;
        Object obj = o53.j;
        this.c = o53Var.o()[i];
        this.d = i;
    }
}
