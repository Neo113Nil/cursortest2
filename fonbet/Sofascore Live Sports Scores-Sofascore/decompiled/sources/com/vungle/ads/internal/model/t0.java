package com.vungle.ads.internal.model;

import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wv8;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t0 {

    @NotNull
    public static final s0 Companion = new s0();
    public final int a;
    public final int b;

    public /* synthetic */ t0(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            oea.z(i, 3, r0.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public static final void a(t0 t0Var, wf3 wf3Var, uye uyeVar) {
        t0Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.u(0, t0Var.a, uyeVar);
        wf3Var.u(1, t0Var.b, uyeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t0)) {
            return false;
        }
        t0 t0Var = (t0) obj;
        return this.a == t0Var.a && this.b == t0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("AdSizeParam(width=");
        a.append(this.a);
        a.append(", height=");
        return wv8.j(a, this.b, ')');
    }

    public t0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
