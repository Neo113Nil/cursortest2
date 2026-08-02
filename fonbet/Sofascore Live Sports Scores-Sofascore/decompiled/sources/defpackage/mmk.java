package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mmk extends kmk {
    public final String a;
    public final List b;
    public final int c;
    public final n52 d;
    public final float e;
    public final n52 f;
    public final float g;
    public final float h;
    public final int i;
    public final int j;
    public final float k;
    public final float l;
    public final float m;
    public final float n;

    public mmk(String str, List list, int i, n52 n52Var, float f, n52 n52Var2, float f2, float f3, int i2, int i3, float f4, float f5, float f6, float f7) {
        this.a = str;
        this.b = list;
        this.c = i;
        this.d = n52Var;
        this.e = f;
        this.f = n52Var2;
        this.g = f2;
        this.h = f3;
        this.i = i2;
        this.j = i3;
        this.k = f4;
        this.l = f5;
        this.m = f6;
        this.n = f7;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || mmk.class != obj.getClass()) {
            return false;
        }
        mmk mmkVar = (mmk) obj;
        return this.a.equals(mmkVar.a) && Intrinsics.c(this.d, mmkVar.d) && this.e == mmkVar.e && Intrinsics.c(this.f, mmkVar.f) && this.g == mmkVar.g && this.h == mmkVar.h && this.i == mmkVar.i && this.j == mmkVar.j && this.k == mmkVar.k && this.l == mmkVar.l && this.m == mmkVar.m && this.n == mmkVar.n && this.c == mmkVar.c && Intrinsics.c(this.b, mmkVar.b);
    }

    public final int hashCode() {
        int d = dmi.d(this.a.hashCode() * 31, 31, this.b);
        n52 n52Var = this.d;
        int a = fc6.a(this.e, (d + (n52Var != null ? n52Var.hashCode() : 0)) * 31, 31);
        n52 n52Var2 = this.f;
        return Integer.hashCode(this.c) + fc6.a(this.n, fc6.a(this.m, fc6.a(this.l, fc6.a(this.k, wv8.a(this.j, wv8.a(this.i, fc6.a(this.h, fc6.a(this.g, (a + (n52Var2 != null ? n52Var2.hashCode() : 0)) * 31, 31), 31), 31), 31), 31), 31), 31), 31);
    }
}
