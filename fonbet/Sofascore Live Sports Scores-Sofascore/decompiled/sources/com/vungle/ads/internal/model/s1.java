package com.vungle.ads.internal.model;

import com.vungle.ads.fpd.FirstPartyData;
import com.vungle.ads.fpd.FirstPartyData$$serializer;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class s1 {

    @NotNull
    public static final r1 Companion = new r1();
    public g1 a;
    public w0 b;
    public z0 c;
    public FirstPartyData d;
    public j1 e;

    public /* synthetic */ s1(int i, g1 g1Var, w0 w0Var, z0 z0Var, FirstPartyData firstPartyData, j1 j1Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = g1Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = w0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = z0Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = firstPartyData;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = j1Var;
        }
    }

    public static final void a(s1 s1Var, wf3 wf3Var, uye uyeVar) {
        s1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || s1Var.a != null) {
            wf3Var.h(uyeVar, 0, e1.a, s1Var.a);
        }
        if (wf3Var.o(uyeVar) || s1Var.b != null) {
            wf3Var.h(uyeVar, 1, u0.a, s1Var.b);
        }
        if (wf3Var.o(uyeVar) || s1Var.c != null) {
            wf3Var.h(uyeVar, 2, x0.a, s1Var.c);
        }
        if (wf3Var.o(uyeVar) || s1Var.d != null) {
            wf3Var.h(uyeVar, 3, FirstPartyData$$serializer.INSTANCE, s1Var.d);
        }
        if (!wf3Var.o(uyeVar) && s1Var.e == null) {
            return;
        }
        wf3Var.h(uyeVar, 4, h1.a, s1Var.e);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof s1)) {
            return false;
        }
        s1 s1Var = (s1) obj;
        return Intrinsics.c(this.a, s1Var.a) && Intrinsics.c(this.b, s1Var.b) && Intrinsics.c(this.c, s1Var.c) && Intrinsics.c(this.d, s1Var.d) && Intrinsics.c(this.e, s1Var.e);
    }

    public final int hashCode() {
        g1 g1Var = this.a;
        int hashCode = (g1Var == null ? 0 : g1Var.hashCode()) * 31;
        w0 w0Var = this.b;
        int hashCode2 = (hashCode + (w0Var == null ? 0 : w0Var.a.hashCode())) * 31;
        z0 z0Var = this.c;
        int hashCode3 = (hashCode2 + (z0Var == null ? 0 : z0Var.hashCode())) * 31;
        FirstPartyData firstPartyData = this.d;
        int hashCode4 = (hashCode3 + (firstPartyData == null ? 0 : firstPartyData.hashCode())) * 31;
        j1 j1Var = this.e;
        return hashCode4 + (j1Var != null ? j1Var.a.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("User(gdpr=");
        a.append(this.a);
        a.append(", ccpa=");
        a.append(this.b);
        a.append(", coppa=");
        a.append(this.c);
        a.append(", fpd=");
        a.append(this.d);
        a.append(", iab=");
        a.append(this.e);
        a.append(')');
        return a.toString();
    }

    public s1(g1 g1Var, w0 w0Var, z0 z0Var, FirstPartyData firstPartyData, j1 j1Var) {
        this.a = g1Var;
        this.b = w0Var;
        this.c = z0Var;
        this.d = firstPartyData;
        this.e = j1Var;
    }
}
