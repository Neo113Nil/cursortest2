package com.vungle.ads.internal.model;

import defpackage.dmi;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l0 {

    @NotNull
    public static final k0 Companion = new k0();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ l0(int i, String str, String str2, String str3) {
        if (7 != (i & 7)) {
            oea.z(i, 7, j0.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    public static final void a(l0 l0Var, wf3 wf3Var, uye uyeVar) {
        l0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.y(uyeVar, 0, l0Var.a);
        wf3Var.y(uyeVar, 1, l0Var.b);
        wf3Var.y(uyeVar, 2, l0Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.c(this.a, l0Var.a) && Intrinsics.c(this.b, l0Var.b) && Intrinsics.c(this.c, l0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + dmi.c(this.a.hashCode() * 31, 31, this.b);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AppNode(bundle=");
        a.append(this.a);
        a.append(", ver=");
        a.append(this.b);
        a.append(", appId=");
        return lnb.q(a, this.c, ')');
    }

    public l0(String str, String str2, String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = str3;
    }
}
