package com.vungle.ads.internal.model;

import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z {

    @NotNull
    public static final y Companion = new y();
    public final c0 a;

    public /* synthetic */ z(int i, c0 c0Var) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = c0Var;
        }
    }

    public static final void a(z zVar, wf3 wf3Var, uye uyeVar) {
        zVar.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (!wf3Var.o(uyeVar) && zVar.a == null) {
            return;
        }
        wf3Var.h(uyeVar, 0, a0.a, zVar.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z) && Intrinsics.c(this.a, ((z) obj).a);
    }

    public final int hashCode() {
        c0 c0Var = this.a;
        if (c0Var == null) {
            return 0;
        }
        return c0Var.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ViewAbility(om=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }
}
