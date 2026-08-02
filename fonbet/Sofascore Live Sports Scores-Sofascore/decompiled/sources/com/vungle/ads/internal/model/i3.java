package com.vungle.ads.internal.model;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.lnb;
import defpackage.oea;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i3 {

    @NotNull
    public static final h3 Companion = new h3();
    public final String a;
    public final boolean b;
    public final String c;

    public /* synthetic */ i3(int i, String str, boolean z, String str2) {
        if (1 != (i & 1)) {
            oea.z(i, 1, g3.a.getDescriptor());
            throw null;
        }
        this.a = str;
        if ((i & 2) == 0) {
            this.b = false;
        } else {
            this.b = z;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
    }

    public static final void a(i3 i3Var, wf3 wf3Var, uye uyeVar) {
        i3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.y(uyeVar, 0, i3Var.a);
        if (wf3Var.o(uyeVar) || i3Var.b) {
            wf3Var.x(uyeVar, 1, i3Var.b);
        }
        if (!wf3Var.o(uyeVar) && i3Var.c == null) {
            return;
        }
        wf3Var.h(uyeVar, 2, uhi.a, i3Var.c);
    }

    public final String b() {
        return this.a;
    }

    public final String c() {
        return this.c;
    }

    public final boolean d() {
        return Intrinsics.c(this.c, "appopen");
    }

    public final boolean e() {
        return Intrinsics.c(this.c, "banner");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3)) {
            return false;
        }
        i3 i3Var = (i3) obj;
        return Intrinsics.c(this.a, i3Var.a) && this.b == i3Var.b && Intrinsics.c(this.c, i3Var.c);
    }

    public final boolean f() {
        return Intrinsics.c(this.c, "in_line");
    }

    public final boolean g() {
        return Intrinsics.c(this.c, "interstitial");
    }

    public final boolean h() {
        return Intrinsics.c(this.c, "mrec");
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        boolean z = this.b;
        int i = z;
        if (z != 0) {
            i = 1;
        }
        int i2 = (hashCode + i) * 31;
        String str = this.c;
        return i2 + (str == null ? 0 : str.hashCode());
    }

    public final boolean i() {
        return Intrinsics.c(this.c, IronSourceConstants.EVENTS_NATIVE);
    }

    public final boolean j() {
        return Intrinsics.c(this.c, "rewarded");
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Placement(referenceId=");
        a.append(this.a);
        a.append(", headerBidding=");
        a.append(this.b);
        a.append(", type=");
        return lnb.q(a, this.c, ')');
    }

    public i3(String str, String str2, boolean z) {
        str.getClass();
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public /* synthetic */ i3(String str) {
        this(str, null, false);
    }

    public final boolean a() {
        return this.b;
    }
}
