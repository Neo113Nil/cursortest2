package com.vungle.ads.internal.model;

import defpackage.dmi;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class c1 {

    @NotNull
    public static final b1 Companion = new b1();
    public final double a;
    public final int b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final String g;

    public /* synthetic */ c1(int i, double d, int i2, boolean z, String str, String str2, String str3, String str4) {
        if (63 != (i & 63)) {
            oea.z(i, 63, a1.a.getDescriptor());
            throw null;
        }
        this.a = d;
        this.b = i2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        if ((i & 64) == 0) {
            this.g = null;
        } else {
            this.g = str4;
        }
    }

    public static final void a(c1 c1Var, wf3 wf3Var, uye uyeVar) {
        c1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.D(uyeVar, 0, c1Var.a);
        wf3Var.u(1, c1Var.b, uyeVar);
        wf3Var.x(uyeVar, 2, c1Var.c);
        wf3Var.y(uyeVar, 3, c1Var.d);
        wf3Var.y(uyeVar, 4, c1Var.e);
        wf3Var.y(uyeVar, 5, c1Var.f);
        if (!wf3Var.o(uyeVar) && c1Var.g == null) {
            return;
        }
        wf3Var.h(uyeVar, 6, uhi.a, c1Var.g);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c1)) {
            return false;
        }
        c1 c1Var = (c1) obj;
        return Double.valueOf(this.a).equals(Double.valueOf(c1Var.a)) && this.b == c1Var.b && this.c == c1Var.c && Intrinsics.c(this.d, c1Var.d) && Intrinsics.c(this.e, c1Var.e) && Intrinsics.c(this.f, c1Var.f) && Intrinsics.c(this.g, c1Var.g);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int a = wv8.a(this.b, Double.hashCode(this.a) * 31, 31);
        boolean z = this.c;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int c = dmi.c(dmi.c(dmi.c((a + i) * 31, 31, this.d), 31, this.e), 31, this.f);
        String str = this.g;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CSBParam(bidfloor=");
        a.append(this.a);
        a.append(", phase=");
        a.append(this.b);
        a.append(", isVXWinner=");
        a.append(this.c);
        a.append(", parentAuctionId=");
        a.append(this.d);
        a.append(", creativeId=");
        a.append(this.e);
        a.append(", adUnitId=");
        a.append(this.f);
        a.append(", ext=");
        return lnb.q(a, this.g, ')');
    }

    public c1(double d, int i, boolean z, String str, String str2, String str3, String str4) {
        me4.p(str, str2, str3);
        this.a = d;
        this.b = i;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = str4;
    }
}
