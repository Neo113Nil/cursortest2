package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.util.Arrays;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xvd {
    public final Context a;
    public final Bitmap.Config b;
    public final jjh c;
    public final int d;
    public final boolean e;
    public final boolean f;
    public final q89 g;
    public final gti h;
    public final u8e i;
    public final int j;
    public final int k;
    public final int l;

    public xvd(Context context, Bitmap.Config config, jjh jjhVar, int i, boolean z, boolean z2, q89 q89Var, gti gtiVar, u8e u8eVar, int i2, int i3, int i4) {
        this.a = context;
        this.b = config;
        this.c = jjhVar;
        this.d = i;
        this.e = z;
        this.f = z2;
        this.g = q89Var;
        this.h = gtiVar;
        this.i = u8eVar;
        this.j = i2;
        this.k = i3;
        this.l = i4;
    }

    public static xvd a(xvd xvdVar) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        Context context = xvdVar.a;
        xvdVar.getClass();
        jjh jjhVar = xvdVar.c;
        int i = xvdVar.d;
        boolean z = xvdVar.e;
        boolean z2 = xvdVar.f;
        xvdVar.getClass();
        xvdVar.getClass();
        q89 q89Var = xvdVar.g;
        gti gtiVar = xvdVar.h;
        u8e u8eVar = xvdVar.i;
        int i2 = xvdVar.j;
        int i3 = xvdVar.k;
        int i4 = xvdVar.l;
        xvdVar.getClass();
        return new xvd(context, config, jjhVar, i, z, z2, q89Var, gtiVar, u8eVar, i2, i3, i4);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xvd)) {
            return false;
        }
        xvd xvdVar = (xvd) obj;
        return Intrinsics.c(this.a, xvdVar.a) && this.b == xvdVar.b && Intrinsics.c(this.c, xvdVar.c) && this.d == xvdVar.d && this.e == xvdVar.e && this.f == xvdVar.f && Intrinsics.c(this.g, xvdVar.g) && this.h.equals(xvdVar.h) && this.i.equals(xvdVar.i) && this.j == xvdVar.j && this.k == xvdVar.k && this.l == xvdVar.l;
    }

    public final int hashCode() {
        return wt3.C(this.l) + ((wt3.C(this.k) + ((wt3.C(this.j) + dmi.g(this.i.a, dmi.g(this.h.a, (dmi.e(dmi.e(dmi.e((wt3.C(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 961)) * 31)) * 31, 31, this.e), 31, this.f), 961, true) + Arrays.hashCode(this.g.a)) * 31, 31), 31)) * 31)) * 31);
    }
}
