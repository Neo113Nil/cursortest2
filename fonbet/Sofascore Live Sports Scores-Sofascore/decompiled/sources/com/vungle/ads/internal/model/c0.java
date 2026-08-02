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
public final class c0 {

    @NotNull
    public static final b0 Companion = new b0();
    public final Boolean a;
    public final String b;

    public /* synthetic */ c0(int i, Boolean bool, String str) {
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
    }

    public static final void a(c0 c0Var, wf3 wf3Var, uye uyeVar) {
        c0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || c0Var.a != null) {
            wf3Var.h(uyeVar, 0, gz1.a, c0Var.a);
        }
        if (!wf3Var.o(uyeVar) && c0Var.b == null) {
            return;
        }
        wf3Var.h(uyeVar, 1, uhi.a, c0Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c0)) {
            return false;
        }
        c0 c0Var = (c0) obj;
        return Intrinsics.c(this.a, c0Var.a) && Intrinsics.c(this.b, c0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        String str = this.b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ViewAbilityInfo(isEnabled=");
        a.append(this.a);
        a.append(", extraVast=");
        return lnb.q(a, this.b, ')');
    }
}
