package com.vungle.ads.internal.model;

import defpackage.lkb;
import defpackage.uhi;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m1 {

    @NotNull
    public static final l1 Companion = new l1();
    public final String a;
    public String b;
    public final Long c;

    public /* synthetic */ m1(int i, String str, String str2, Long l) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = str;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = str2;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = l;
        }
    }

    public static final void a(m1 m1Var, wf3 wf3Var, uye uyeVar) {
        m1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || m1Var.a != null) {
            wf3Var.h(uyeVar, 0, uhi.a, m1Var.a);
        }
        if (wf3Var.o(uyeVar) || m1Var.b != null) {
            wf3Var.h(uyeVar, 1, uhi.a, m1Var.b);
        }
        if (!wf3Var.o(uyeVar) && m1Var.c == null) {
            return;
        }
        wf3Var.h(uyeVar, 2, lkb.a, m1Var.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m1)) {
            return false;
        }
        m1 m1Var = (m1) obj;
        return Intrinsics.c(this.a, m1Var.a) && Intrinsics.c(this.b, m1Var.b) && Intrinsics.c(this.c, m1Var.c);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l = this.c;
        return hashCode2 + (l != null ? l.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RequestExt(configExtension=");
        a.append(this.a);
        a.append(", signals=");
        a.append(this.b);
        a.append(", configLastValidatedTimestamp=");
        a.append(this.c);
        a.append(')');
        return a.toString();
    }

    public m1(String str, String str2, Long l) {
        this.a = str;
        this.b = str2;
        this.c = l;
    }
}
