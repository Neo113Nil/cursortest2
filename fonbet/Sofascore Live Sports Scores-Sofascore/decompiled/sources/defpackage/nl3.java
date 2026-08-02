package defpackage;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nl3 {
    public int b;
    public boolean c;
    public final wm3 d;
    public final int e;
    public nl3 f;
    public rvh i;
    public HashSet a = null;
    public int g = 0;
    public int h = Integer.MIN_VALUE;

    public nl3(wm3 wm3Var, int i) {
        this.d = wm3Var;
        this.e = i;
    }

    public final void a(nl3 nl3Var, int i) {
        b(nl3Var, i, Integer.MIN_VALUE, false);
    }

    public final boolean b(nl3 nl3Var, int i, int i2, boolean z) {
        if (nl3Var == null) {
            j();
            return true;
        }
        if (!z && !i(nl3Var)) {
            return false;
        }
        this.f = nl3Var;
        if (nl3Var.a == null) {
            nl3Var.a = new HashSet();
        }
        HashSet hashSet = this.f.a;
        if (hashSet != null) {
            hashSet.add(this);
        }
        this.g = i;
        this.h = i2;
        return true;
    }

    public final void c(int i, k7l k7lVar, ArrayList arrayList) {
        HashSet hashSet = this.a;
        if (hashSet != null) {
            Iterator it = hashSet.iterator();
            while (it.hasNext()) {
                n9e.v(((nl3) it.next()).d, i, arrayList, k7lVar);
            }
        }
    }

    public final int d() {
        if (this.c) {
            return this.b;
        }
        return 0;
    }

    public final int e() {
        nl3 nl3Var;
        if (this.d.h0 == 8) {
            return 0;
        }
        int i = this.h;
        return (i == Integer.MIN_VALUE || (nl3Var = this.f) == null || nl3Var.d.h0 != 8) ? this.g : i;
    }

    public final nl3 f() {
        int i = this.e;
        int C = wt3.C(i);
        wm3 wm3Var = this.d;
        switch (C) {
            case 0:
            case 5:
            case 6:
            case 7:
            case 8:
                return null;
            case 1:
                return wm3Var.L;
            case 2:
                return wm3Var.M;
            case 3:
                return wm3Var.J;
            case 4:
                return wm3Var.K;
            default:
                a70.j(bf3.x(i));
                return null;
        }
    }

    public final boolean g() {
        HashSet hashSet = this.a;
        if (hashSet == null) {
            return false;
        }
        Iterator it = hashSet.iterator();
        while (it.hasNext()) {
            if (((nl3) it.next()).f().h()) {
                return true;
            }
        }
        return false;
    }

    public final boolean h() {
        return this.f != null;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0061 A[RETURN] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean i(nl3 nl3Var) {
        if (nl3Var != null) {
            wm3 wm3Var = nl3Var.d;
            int i = nl3Var.e;
            int i2 = this.e;
            if (i != i2) {
                switch (wt3.C(i2)) {
                    case 0:
                    case 7:
                    case 8:
                        break;
                    case 1:
                    case 3:
                        boolean z = i == 2 || i == 4;
                        if (!(wm3Var instanceof s49)) {
                            return z;
                        }
                        if (z || i == 8) {
                        }
                        break;
                    case 2:
                    case 4:
                        boolean z2 = i == 3 || i == 5;
                        if (!(wm3Var instanceof s49)) {
                            return z2;
                        }
                        if (z2 || i == 9) {
                        }
                        break;
                    case 5:
                        if (i == 2 || i == 4) {
                        }
                        break;
                    case 6:
                        if (i == 6 || i == 8 || i == 9) {
                        }
                        break;
                    default:
                        a70.j(bf3.x(i2));
                        return false;
                }
            } else if (i2 != 6 || (wm3Var.F && this.d.F)) {
                return true;
            }
        }
        return false;
    }

    public final void j() {
        HashSet hashSet;
        nl3 nl3Var = this.f;
        if (nl3Var != null && (hashSet = nl3Var.a) != null) {
            hashSet.remove(this);
            if (this.f.a.size() == 0) {
                this.f.a = null;
            }
        }
        this.a = null;
        this.f = null;
        this.g = 0;
        this.h = Integer.MIN_VALUE;
        this.c = false;
        this.b = 0;
    }

    public final void k() {
        rvh rvhVar = this.i;
        if (rvhVar == null) {
            this.i = new rvh(1);
        } else {
            rvhVar.c();
        }
    }

    public final void l(int i) {
        this.b = i;
        this.c = true;
    }

    public final String toString() {
        return this.d.i0 + ":" + bf3.x(this.e);
    }
}
