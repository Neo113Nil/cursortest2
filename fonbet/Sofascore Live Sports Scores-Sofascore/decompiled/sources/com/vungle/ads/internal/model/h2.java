package com.vungle.ads.internal.model;

import defpackage.lnb;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class h2 {

    @NotNull
    public static final g2 Companion = new g2();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final String e;

    public /* synthetic */ h2(int i, String str, String str2, String str3, String str4, String str5) {
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
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = str4;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = str5;
        }
    }

    public static final void a(h2 h2Var, wf3 wf3Var, uye uyeVar) {
        h2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || h2Var.a != null) {
            wf3Var.h(uyeVar, 0, uhi.a, h2Var.a);
        }
        if (wf3Var.o(uyeVar) || h2Var.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, h2Var.b);
        }
        if (wf3Var.o(uyeVar) || h2Var.c != null) {
            wf3Var.h(uyeVar, 2, uhi.a, h2Var.c);
        }
        if (wf3Var.o(uyeVar) || h2Var.d != null) {
            wf3Var.h(uyeVar, 3, uhi.a, h2Var.d);
        }
        if (!wf3Var.o(uyeVar) && h2Var.e == null) {
            return;
        }
        wf3Var.h(uyeVar, 4, uhi.a, h2Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h2)) {
            return false;
        }
        h2 h2Var = (h2) obj;
        return Intrinsics.c(this.a, h2Var.a) && Intrinsics.c(this.b, h2Var.b) && Intrinsics.c(this.c, h2Var.c) && Intrinsics.c(this.d, h2Var.d) && Intrinsics.c(this.e, h2Var.e);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.c;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.d;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.e;
        return hashCode4 + (str5 != null ? str5.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Endpoints(adsEndpoint=");
        a.append(this.a);
        a.append(", riEndpoint=");
        a.append(this.b);
        a.append(", errorLogsEndpoint=");
        a.append(this.c);
        a.append(", metricsEndpoint=");
        a.append(this.d);
        a.append(", csbEndpoint=");
        return lnb.q(a, this.e, ')');
    }
}
