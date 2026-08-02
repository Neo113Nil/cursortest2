package com.vungle.ads.internal.model;

import defpackage.lnb;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f3 {

    @NotNull
    public static final e3 Companion = new e3();
    public final String a;
    public final String b;
    public final String c;

    public /* synthetic */ f3(int i, String str, String str2, String str3) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str3;
        }
    }

    public static final void a(f3 f3Var, wf3 wf3Var, uye uyeVar) {
        f3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || f3Var.a != null) {
            wf3Var.h(uyeVar, 0, uhi.a, f3Var.a);
        }
        if (wf3Var.o(uyeVar) || f3Var.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, f3Var.b);
        }
        if (!wf3Var.o(uyeVar) && f3Var.c == null) {
            return;
        }
        wf3Var.h(uyeVar, 2, uhi.a, f3Var.c);
    }

    public final String b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f3)) {
            return false;
        }
        f3 f3Var = (f3) obj;
        return Intrinsics.c(this.a, f3Var.a) && Intrinsics.c(this.b, f3Var.b) && Intrinsics.c(this.c, f3Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("OmSdkData(params=");
        a.append(this.a);
        a.append(", vendorKey=");
        a.append(this.b);
        a.append(", vendorURL=");
        return lnb.q(a, this.c, ')');
    }

    public final String a() {
        return this.a;
    }
}
