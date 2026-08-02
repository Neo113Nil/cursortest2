package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.lkb;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a2 {

    @NotNull
    public static final z1 Companion = new z1();
    public final Long a;
    public final Integer b;

    public /* synthetic */ a2(int i, Long l, Integer num) {
        this.a = (i & 1) == 0 ? 1000L : l;
        if ((i & 2) == 0) {
            this.b = 3;
        } else {
            this.b = num;
        }
    }

    public static final void a(a2 a2Var, wf3 wf3Var, uye uyeVar) {
        Integer num;
        Long l;
        a2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || (l = a2Var.a) == null || l.longValue() != 1000) {
            wf3Var.h(uyeVar, 0, lkb.a, a2Var.a);
        }
        if (wf3Var.o(uyeVar) || (num = a2Var.b) == null || num.intValue() != 3) {
            wf3Var.h(uyeVar, 1, a7a.a, a2Var.b);
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a2)) {
            return false;
        }
        a2 a2Var = (a2) obj;
        return Intrinsics.c(this.a, a2Var.a) && Intrinsics.c(this.b, a2Var.b);
    }

    public final int hashCode() {
        Long l = this.a;
        int hashCode = (l == null ? 0 : l.hashCode()) * 31;
        Integer num = this.b;
        return hashCode + (num != null ? num.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CleverCache(diskSize=");
        a.append(this.a);
        a.append(", diskPercentage=");
        return bf3.n(a, this.b, ')');
    }
}
