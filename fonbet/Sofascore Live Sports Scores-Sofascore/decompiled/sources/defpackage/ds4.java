package defpackage;

import android.graphics.Bitmap;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ds4 {
    public final au3 a;
    public final au3 b;
    public final au3 c;
    public final au3 d;
    public final rwj e;
    public final int f;
    public final Bitmap.Config g;
    public final int h;
    public final int i;
    public final int j;

    public ds4(au3 au3Var, au3 au3Var2, au3 au3Var3, au3 au3Var4, rwj rwjVar, int i, Bitmap.Config config, int i2, int i3, int i4) {
        this.a = au3Var;
        this.b = au3Var2;
        this.c = au3Var3;
        this.d = au3Var4;
        this.e = rwjVar;
        this.f = i;
        this.g = config;
        this.h = i2;
        this.i = i3;
        this.j = i4;
    }

    public static ds4 a(ds4 ds4Var, int i, int i2, int i3) {
        au3 au3Var = ds4Var.a;
        au3 au3Var2 = ds4Var.b;
        au3 au3Var3 = ds4Var.c;
        au3 au3Var4 = ds4Var.d;
        rwj rwjVar = ds4Var.e;
        int i4 = ds4Var.f;
        Bitmap.Config config = ds4Var.g;
        ds4Var.getClass();
        ds4Var.getClass();
        ds4Var.getClass();
        ds4Var.getClass();
        ds4Var.getClass();
        if ((i3 & 4096) != 0) {
            i = ds4Var.h;
        }
        int i5 = i;
        if ((i3 & 8192) != 0) {
            i2 = ds4Var.i;
        }
        int i6 = ds4Var.j;
        ds4Var.getClass();
        return new ds4(au3Var, au3Var2, au3Var3, au3Var4, rwjVar, i4, config, i5, i2, i6);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ds4)) {
            return false;
        }
        ds4 ds4Var = (ds4) obj;
        return Intrinsics.c(this.a, ds4Var.a) && Intrinsics.c(this.b, ds4Var.b) && Intrinsics.c(this.c, ds4Var.c) && Intrinsics.c(this.d, ds4Var.d) && Intrinsics.c(this.e, ds4Var.e) && this.f == ds4Var.f && this.g == ds4Var.g && this.h == ds4Var.h && this.i == ds4Var.i && this.j == ds4Var.j;
    }

    public final int hashCode() {
        return wt3.C(this.j) + ((wt3.C(this.i) + ((wt3.C(this.h) + dmi.e(dmi.e((this.g.hashCode() + ((wt3.C(this.f) + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31, 31, true), 923521, false)) * 31)) * 31);
    }
}
