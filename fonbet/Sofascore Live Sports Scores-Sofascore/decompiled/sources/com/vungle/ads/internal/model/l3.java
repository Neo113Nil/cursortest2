package com.vungle.ads.internal.model;

import defpackage.lnb;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l3 {

    @NotNull
    public static final k3 Companion = new k3();
    public final String a;

    public /* synthetic */ l3(int i, String str) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
    }

    public static final void a(l3 l3Var, wf3 wf3Var, uye uyeVar) {
        l3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (!wf3Var.o(uyeVar) && l3Var.a == null) {
            return;
        }
        wf3Var.h(uyeVar, 0, uhi.a, l3Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof l3) && Intrinsics.c(this.a, ((l3) obj).a);
    }

    public final int hashCode() {
        String str = this.a;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return lnb.q(com.iab.omid.library.vungle.internal.l.a("RtbRequest(sdkUserAgent="), this.a, ')');
    }

    public l3(String str) {
        this.a = str;
    }
}
