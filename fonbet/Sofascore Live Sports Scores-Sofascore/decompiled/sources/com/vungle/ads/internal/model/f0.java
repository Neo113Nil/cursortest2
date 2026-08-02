package com.vungle.ads.internal.model;

import defpackage.gz1;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class f0 {

    @NotNull
    public static final e0 Companion = new e0();
    public final Boolean a;
    public final Boolean b;

    public /* synthetic */ f0(int i, Boolean bool, Boolean bool2) {
        if ((i & 1) == 0) {
            this.a = null;
        } else {
            this.a = bool;
        }
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = bool2;
        }
    }

    public static final void a(f0 f0Var, wf3 wf3Var, uye uyeVar) {
        f0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        if (wf3Var.o(uyeVar) || f0Var.a != null) {
            wf3Var.h(uyeVar, 0, gz1.a, f0Var.a);
        }
        if (!wf3Var.o(uyeVar) && f0Var.b == null) {
            return;
        }
        wf3Var.h(uyeVar, 1, gz1.a, f0Var.b);
    }

    public final Boolean b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f0)) {
            return false;
        }
        f0 f0Var = (f0) obj;
        return Intrinsics.c(this.a, f0Var.a) && Intrinsics.c(this.b, f0Var.b);
    }

    public final int hashCode() {
        Boolean bool = this.a;
        int hashCode = (bool == null ? 0 : bool.hashCode()) * 31;
        Boolean bool2 = this.b;
        return hashCode + (bool2 != null ? bool2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("WebViewSettings(allowFileAccessFromFileUrls=");
        a.append(this.a);
        a.append(", allowUniversalAccessFromFileUrls=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public final Boolean a() {
        return this.a;
    }
}
