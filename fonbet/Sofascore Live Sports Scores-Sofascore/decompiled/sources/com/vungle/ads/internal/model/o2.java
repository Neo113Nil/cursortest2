package com.vungle.ads.internal.model;

import defpackage.a7a;
import defpackage.bf3;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o2 {

    @NotNull
    public static final m2 Companion = new m2();
    public final Integer a;

    public /* synthetic */ o2(int i, Integer num) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = num;
        }
    }

    public static final void a(o2 o2Var, wf3 wf3Var, uye uyeVar) {
        o2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (!wf3Var.o(uyeVar) && o2Var.a == null) {
            return;
        }
        wf3Var.h(uyeVar, 0, a7a.a, o2Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof o2) && Intrinsics.c(this.a, ((o2) obj).a);
    }

    public final int hashCode() {
        Integer num = this.a;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return bf3.n(com.iab.omid.library.vungle.internal.l.a("IABSettings(tcfStatus="), this.a, ')');
    }
}
