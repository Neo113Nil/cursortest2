package com.vungle.ads.internal.model;

import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class u2 {

    @NotNull
    public static final t2 Companion = new t2();
    public final k2 a;
    public final o2 b;

    public /* synthetic */ u2(int i, k2 k2Var, o2 o2Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = k2Var;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = o2Var;
        }
    }

    public static final void a(u2 u2Var, wf3 wf3Var, uye uyeVar) {
        u2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || u2Var.a != null) {
            wf3Var.h(uyeVar, 0, i2.a, u2Var.a);
        }
        if (!wf3Var.o(uyeVar) && u2Var.b == null) {
            return;
        }
        wf3Var.h(uyeVar, 1, l2.a, u2Var.b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u2)) {
            return false;
        }
        u2 u2Var = (u2) obj;
        return Intrinsics.c(this.a, u2Var.a) && Intrinsics.c(this.b, u2Var.b);
    }

    public final int hashCode() {
        k2 k2Var = this.a;
        int hashCode = (k2Var == null ? 0 : k2Var.hashCode()) * 31;
        o2 o2Var = this.b;
        return hashCode + (o2Var != null ? o2Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("UserPrivacy(gdpr=");
        a.append(this.a);
        a.append(", iab=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
