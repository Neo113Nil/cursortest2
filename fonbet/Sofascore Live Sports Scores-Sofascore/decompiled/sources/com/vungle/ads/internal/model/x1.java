package com.vungle.ads.internal.model;

import defpackage.gz1;
import defpackage.lkb;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class x1 {

    @NotNull
    public static final w1 Companion = new w1();
    public final Boolean a;
    public final Long b;

    public /* synthetic */ x1(int i, Boolean bool, Long l) {
        this.a = (i & 1) == 0 ? Boolean.FALSE : bool;
        if ((i & 2) == 0) {
            this.b = Long.MAX_VALUE;
        } else {
            this.b = l;
        }
    }

    public static final void a(x1 x1Var, wf3 wf3Var, uye uyeVar) {
        Long l;
        x1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || !Intrinsics.c(x1Var.a, Boolean.FALSE)) {
            wf3Var.h(uyeVar, 0, gz1.a, x1Var.a);
        }
        if (wf3Var.o(uyeVar) || (l = x1Var.b) == null || l.longValue() != Long.MAX_VALUE) {
            wf3Var.h(uyeVar, 1, lkb.a, x1Var.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x1)) {
            return false;
        }
        x1 x1Var = (x1) obj;
        return Intrinsics.c(this.a, x1Var.a) && Intrinsics.c(this.b, x1Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Long l = this.b;
        return hashCode + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AutoRedirect(allowAutoRedirect=");
        a.append(this.a);
        a.append(", afterClickDuration=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }
}
