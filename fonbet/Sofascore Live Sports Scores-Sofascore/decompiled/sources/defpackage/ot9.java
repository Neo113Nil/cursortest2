package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ot9 {
    public final int A;
    public final int B;
    public final int C;
    public final Context a;
    public final Object b;
    public final sti c;
    public final mt9 d;
    public final Bitmap.Config e;
    public final List f;
    public final rwj g;
    public final q89 h;
    public final gti i;
    public final boolean j;
    public final boolean k;
    public final au3 l;
    public final au3 m;
    public final au3 n;
    public final au3 o;
    public final g6b p;
    public final hkh q;
    public final u8e r;
    public final Integer s;
    public final Drawable t;
    public final Integer u;
    public final Drawable v;
    public final gv4 w;
    public final ds4 x;
    public final int y;
    public final int z;

    public ot9(Context context, Object obj, sti stiVar, mt9 mt9Var, Bitmap.Config config, int i, List list, rwj rwjVar, q89 q89Var, gti gtiVar, boolean z, boolean z2, int i2, int i3, int i4, au3 au3Var, au3 au3Var2, au3 au3Var3, au3 au3Var4, g6b g6bVar, hkh hkhVar, int i5, u8e u8eVar, Integer num, Drawable drawable, Integer num2, Drawable drawable2, gv4 gv4Var, ds4 ds4Var) {
        this.a = context;
        this.b = obj;
        this.c = stiVar;
        this.d = mt9Var;
        this.e = config;
        this.y = i;
        this.f = list;
        this.g = rwjVar;
        this.h = q89Var;
        this.i = gtiVar;
        this.j = z;
        this.k = z2;
        this.z = i2;
        this.A = i3;
        this.B = i4;
        this.l = au3Var;
        this.m = au3Var2;
        this.n = au3Var3;
        this.o = au3Var4;
        this.p = g6bVar;
        this.q = hkhVar;
        this.C = i5;
        this.r = u8eVar;
        this.s = num;
        this.t = drawable;
        this.u = num2;
        this.v = drawable2;
        this.w = gv4Var;
        this.x = ds4Var;
    }

    public static it9 a(ot9 ot9Var) {
        Context context = ot9Var.a;
        ot9Var.getClass();
        return new it9(ot9Var, context);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ot9)) {
            return false;
        }
        ot9 ot9Var = (ot9) obj;
        return Intrinsics.c(this.a, ot9Var.a) && this.b.equals(ot9Var.b) && Intrinsics.c(this.c, ot9Var.c) && Intrinsics.c(this.d, ot9Var.d) && this.e == ot9Var.e && this.y == ot9Var.y && Intrinsics.c(this.f, ot9Var.f) && Intrinsics.c(this.g, ot9Var.g) && Intrinsics.c(this.h, ot9Var.h) && this.i.equals(ot9Var.i) && this.j == ot9Var.j && this.k == ot9Var.k && this.z == ot9Var.z && this.A == ot9Var.A && this.B == ot9Var.B && Intrinsics.c(this.l, ot9Var.l) && Intrinsics.c(this.m, ot9Var.m) && Intrinsics.c(this.n, ot9Var.n) && Intrinsics.c(this.o, ot9Var.o) && Intrinsics.c(this.s, ot9Var.s) && Intrinsics.c(this.t, ot9Var.t) && Intrinsics.c(this.u, ot9Var.u) && Intrinsics.c(this.v, ot9Var.v) && Intrinsics.c(this.p, ot9Var.p) && this.q.equals(ot9Var.q) && this.C == ot9Var.C && this.r.equals(ot9Var.r) && this.w.equals(ot9Var.w) && Intrinsics.c(this.x, ot9Var.x);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        sti stiVar = this.c;
        int hashCode2 = (hashCode + (stiVar != null ? stiVar.hashCode() : 0)) * 31;
        mt9 mt9Var = this.d;
        int g = dmi.g(this.r.a, (wt3.C(this.C) + ((this.q.hashCode() + ((this.p.hashCode() + ((this.o.hashCode() + ((this.n.hashCode() + ((this.m.hashCode() + ((this.l.hashCode() + ((wt3.C(this.B) + ((wt3.C(this.A) + ((wt3.C(this.z) + dmi.e(dmi.e(dmi.e(dmi.e(dmi.g(this.i.a, (((this.g.hashCode() + dmi.d((wt3.C(this.y) + ((this.e.hashCode() + ((hashCode2 + (mt9Var != null ? mt9Var.hashCode() : 0)) * 29791)) * 961)) * 29791, 31, this.f)) * 31) + Arrays.hashCode(this.h.a)) * 31, 31), 31, true), 31, this.j), 31, this.k), 31, true)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 961);
        Integer num = this.s;
        int hashCode3 = (g + (num != null ? num.hashCode() : 0)) * 31;
        Drawable drawable = this.t;
        int hashCode4 = (hashCode3 + (drawable != null ? drawable.hashCode() : 0)) * 31;
        Integer num2 = this.u;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Drawable drawable2 = this.v;
        return this.x.hashCode() + ((this.w.hashCode() + ((hashCode5 + (drawable2 != null ? drawable2.hashCode() : 0)) * 29791)) * 31);
    }
}
