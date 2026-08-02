package com.vungle.ads.internal.model;

import defpackage.gz1;
import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z0 {

    @NotNull
    public static final y0 Companion = new y0();
    public final Boolean a;

    public /* synthetic */ z0(int i, Boolean bool) {
        if (1 == (i & 1)) {
            this.a = bool;
        } else {
            oea.z(i, 1, x0.a.getDescriptor());
            throw null;
        }
    }

    public static final void a(z0 z0Var, wf3 wf3Var, uye uyeVar) {
        z0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.h(uyeVar, 0, gz1.a, z0Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof z0) && Intrinsics.c(this.a, ((z0) obj).a);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        if (bool == null) {
            return 0;
        }
        return bool.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("COPPA(isCoppa=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public z0(Boolean bool) {
        this.a = bool;
    }
}
