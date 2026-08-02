package com.vungle.ads.internal.model;

import defpackage.dmi;
import defpackage.ljg;
import defpackage.lnb;
import defpackage.me4;
import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class g1 {

    @NotNull
    public static final f1 Companion = new f1();
    public final String a;
    public final String b;
    public final long c;
    public final String d;

    public /* synthetic */ g1(int i, String str, String str2, long j, String str3) {
        if (15 != (i & 15)) {
            oea.z(i, 15, e1.a.getDescriptor());
            throw null;
        }
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }

    public static final void a(g1 g1Var, wf3 wf3Var, uye uyeVar) {
        g1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.y(uyeVar, 0, g1Var.a);
        wf3Var.y(uyeVar, 1, g1Var.b);
        wf3Var.E(uyeVar, 2, g1Var.c);
        wf3Var.y(uyeVar, 3, g1Var.d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g1)) {
            return false;
        }
        g1 g1Var = (g1) obj;
        return Intrinsics.c(this.a, g1Var.a) && Intrinsics.c(this.b, g1Var.b) && this.c == g1Var.c && Intrinsics.c(this.d, g1Var.d);
    }

    public final int hashCode() {
        return this.d.hashCode() + ljg.c(dmi.c(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("GDPR(consentStatus=");
        a.append(this.a);
        a.append(", consentSource=");
        a.append(this.b);
        a.append(", consentTimestamp=");
        a.append(this.c);
        a.append(", consentMessageVersion=");
        return lnb.q(a, this.d, ')');
    }

    public g1(long j, String str, String str2, String str3) {
        me4.p(str, str2, str3);
        this.a = str;
        this.b = str2;
        this.c = j;
        this.d = str3;
    }
}
