package defpackage;

import java.io.File;
import java.util.ArrayList;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class uae implements Comparable {
    public static final String b;
    public final gc2 a;

    static {
        String str = File.separator;
        str.getClass();
        b = str;
    }

    public uae(gc2 gc2Var) {
        gc2Var.getClass();
        this.a = gc2Var;
    }

    public final ArrayList a() {
        ArrayList arrayList = new ArrayList();
        int c = i.c(this);
        gc2 gc2Var = this.a;
        if (c == -1) {
            c = 0;
        } else if (c < gc2Var.h() && gc2Var.m(c) == 92) {
            c++;
        }
        int h = gc2Var.h();
        int i = c;
        while (c < h) {
            if (gc2Var.m(c) == 47 || gc2Var.m(c) == 92) {
                arrayList.add(gc2Var.s(i, c));
                i = c + 1;
            }
            c++;
        }
        if (i < gc2Var.h()) {
            arrayList.add(gc2Var.s(i, gc2Var.h()));
        }
        return arrayList;
    }

    public final String b() {
        gc2 gc2Var = i.a;
        gc2 gc2Var2 = this.a;
        int o = gc2.o(gc2Var2, gc2Var);
        if (o == -1) {
            o = gc2.o(gc2Var2, i.b);
        }
        if (o != -1) {
            gc2Var2 = gc2.t(gc2Var2, o + 1, 0, 2);
        } else if (f() != null && gc2Var2.h() == 2) {
            gc2Var2 = gc2.d;
        }
        return gc2Var2.w();
    }

    public final uae c() {
        gc2 gc2Var = i.d;
        gc2 gc2Var2 = this.a;
        if (Intrinsics.c(gc2Var2, gc2Var)) {
            return null;
        }
        gc2 gc2Var3 = i.a;
        if (Intrinsics.c(gc2Var2, gc2Var3)) {
            return null;
        }
        gc2 gc2Var4 = i.b;
        if (Intrinsics.c(gc2Var2, gc2Var4)) {
            return null;
        }
        gc2 gc2Var5 = i.e;
        gc2Var2.getClass();
        gc2Var5.getClass();
        int h = gc2Var2.h();
        byte[] bArr = gc2Var5.a;
        if (gc2Var2.q(gc2Var5, h - bArr.length, bArr.length) && (gc2Var2.h() == 2 || gc2Var2.q(gc2Var3, gc2Var2.h() - 3, 1) || gc2Var2.q(gc2Var4, gc2Var2.h() - 3, 1))) {
            return null;
        }
        int o = gc2.o(gc2Var2, gc2Var3);
        if (o == -1) {
            o = gc2.o(gc2Var2, gc2Var4);
        }
        if (o == 2 && f() != null) {
            if (gc2Var2.h() == 3) {
                return null;
            }
            return new uae(gc2.t(gc2Var2, 0, 3, 1));
        }
        if (o == 1) {
            gc2Var4.getClass();
            if (gc2Var2.q(gc2Var4, 0, gc2Var4.h())) {
                return null;
            }
        }
        if (o != -1 || f() == null) {
            return o == -1 ? new uae(gc2Var) : o == 0 ? new uae(gc2.t(gc2Var2, 0, 1, 1)) : new uae(gc2.t(gc2Var2, 0, o, 1));
        }
        if (gc2Var2.h() == 2) {
            return null;
        }
        return new uae(gc2.t(gc2Var2, 0, 2, 1));
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        uae uaeVar = (uae) obj;
        uaeVar.getClass();
        return this.a.compareTo(uaeVar.a);
    }

    public final uae d(uae uaeVar) {
        uaeVar.getClass();
        gc2 gc2Var = uaeVar.a;
        int c = i.c(this);
        gc2 gc2Var2 = this.a;
        uae uaeVar2 = c == -1 ? null : new uae(gc2Var2.s(0, c));
        int c2 = i.c(uaeVar);
        if (!Intrinsics.c(uaeVar2, c2 == -1 ? null : new uae(gc2Var.s(0, c2)))) {
            pvd.s("Paths of different roots cannot be relative to each other: ", this, " and ", uaeVar);
            return null;
        }
        ArrayList a = a();
        ArrayList a2 = uaeVar.a();
        int min = Math.min(a.size(), a2.size());
        int i = 0;
        while (i < min && Intrinsics.c(a.get(i), a2.get(i))) {
            i++;
        }
        if (i == min && gc2Var2.h() == gc2Var.h()) {
            return tnf.j(".", false);
        }
        if (a2.subList(i, a2.size()).indexOf(i.e) != -1) {
            pvd.s("Impossible relative path to resolve: ", this, " and ", uaeVar);
            return null;
        }
        if (Intrinsics.c(gc2Var, i.d)) {
            return this;
        }
        x52 x52Var = new x52();
        gc2 b2 = i.b(uaeVar);
        if (b2 == null && (b2 = i.b(this)) == null) {
            b2 = i.f(b);
        }
        int size = a2.size();
        for (int i2 = i; i2 < size; i2++) {
            x52Var.X0(i.e);
            x52Var.X0(b2);
        }
        int size2 = a.size();
        while (i < size2) {
            x52Var.X0((gc2) a.get(i));
            x52Var.X0(b2);
            i++;
        }
        return i.d(x52Var, false);
    }

    public final uae e(String str) {
        str.getClass();
        x52 x52Var = new x52();
        x52Var.g1(str);
        return i.a(this, i.d(x52Var, false), false);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof uae) && Intrinsics.c(((uae) obj).a, this.a);
    }

    public final Character f() {
        gc2 gc2Var = i.a;
        gc2 gc2Var2 = this.a;
        if (gc2.k(gc2Var2, gc2Var) != -1 || gc2Var2.h() < 2 || gc2Var2.m(1) != 58) {
            return null;
        }
        char m = (char) gc2Var2.m(0);
        if (('a' > m || m >= '{') && ('A' > m || m >= '[')) {
            return null;
        }
        return Character.valueOf(m);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final File toFile() {
        return new File(this.a.w());
    }

    public final String toString() {
        return this.a.w();
    }
}
