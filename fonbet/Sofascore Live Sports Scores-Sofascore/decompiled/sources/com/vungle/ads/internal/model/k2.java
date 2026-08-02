package com.vungle.ads.internal.model;

import defpackage.gz1;
import defpackage.lnb;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class k2 {

    @NotNull
    public static final j2 Companion = new j2();
    public final Boolean a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;
    public final String f;

    public /* synthetic */ k2(int i, Boolean bool, String str, String str2, String str3, String str4, String str5) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = str2;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str3;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str4;
        }
        if ((i & 32) == 0) {
            this.f = null;
        } else {
            this.f = str5;
        }
    }

    public static final void a(k2 k2Var, wf3 wf3Var, uye uyeVar) {
        k2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || k2Var.a != null) {
            wf3Var.h(uyeVar, 0, gz1.a, k2Var.a);
        }
        if (wf3Var.o(uyeVar) || k2Var.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, k2Var.b);
        }
        if (wf3Var.o(uyeVar) || k2Var.c != null) {
            wf3Var.h(uyeVar, 2, uhi.a, k2Var.c);
        }
        if (wf3Var.o(uyeVar) || k2Var.d != null) {
            wf3Var.h(uyeVar, 3, uhi.a, k2Var.d);
        }
        if (wf3Var.o(uyeVar) || k2Var.e != null) {
            wf3Var.h(uyeVar, 4, uhi.a, k2Var.e);
        }
        if (!wf3Var.o(uyeVar) && k2Var.f == null) {
            return;
        }
        wf3Var.h(uyeVar, 5, uhi.a, k2Var.f);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k2)) {
            return false;
        }
        k2 k2Var = (k2) obj;
        return Intrinsics.c(this.a, k2Var.a) && Intrinsics.c(this.b, k2Var.b) && Intrinsics.c(this.c, k2Var.c) && Intrinsics.c(this.d, k2Var.d) && Intrinsics.c(this.e, k2Var.e) && Intrinsics.c(this.f, k2Var.f);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.c;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.d;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.e;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f;
        return hashCode5 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("GDPRSettings(isCountryDataProtected=");
        a.append(this.a);
        a.append(", consentTitle=");
        a.append(this.b);
        a.append(", consentMessage=");
        a.append(this.c);
        a.append(", consentMessageVersion=");
        a.append(this.d);
        a.append(", buttonAccept=");
        a.append(this.e);
        a.append(", buttonDeny=");
        return lnb.q(a, this.f, ')');
    }
}
