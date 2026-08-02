package com.vungle.ads.internal.model;

import defpackage.lkb;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class e2 {

    @NotNull
    public static final d2 Companion = new d2();
    public final Long a;

    public /* synthetic */ e2(int i, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = l;
        }
    }

    public static final void a(e2 e2Var, wf3 wf3Var, uye uyeVar) {
        e2Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (!wf3Var.o(uyeVar) && e2Var.a == null) {
            return;
        }
        wf3Var.h(uyeVar, 0, lkb.a, e2Var.a);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e2) && Intrinsics.c(this.a, ((e2) obj).a);
    }

    public final int hashCode() {
        Long l = this.a;
        if (l == null) {
            return 0;
        }
        return l.hashCode();
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ConfigSettings(refreshTime=");
        a.append(this.a);
        a.append(')');
        return a.toString();
    }

    public final Long a() {
        return this.a;
    }
}
