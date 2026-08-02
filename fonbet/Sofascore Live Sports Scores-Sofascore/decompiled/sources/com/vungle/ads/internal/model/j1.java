package com.vungle.ads.internal.model;

import defpackage.lnb;
import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class j1 {

    @NotNull
    public static final i1 Companion = new i1();
    public final String a;

    public /* synthetic */ j1(int i, String str) {
        if (1 == (i & 1)) {
            this.a = str;
        } else {
            oea.z(i, 1, h1.a.getDescriptor());
            throw null;
        }
    }

    public static final void a(j1 j1Var, wf3 wf3Var, uye uyeVar) {
        j1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.y(uyeVar, 0, j1Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof j1) && Intrinsics.c(this.a, ((j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return lnb.q(com.iab.omid.library.vungle.internal.l.a("IAB(tcf="), this.a, ')');
    }

    public j1(String str) {
        str.getClass();
        this.a = str;
    }
}
