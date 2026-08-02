package com.vungle.ads.internal.model;

import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import defpackage.wv8;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o3 {

    @NotNull
    public static final n3 Companion = new n3();
    public final b3 a;
    public final s1 b;
    public final m1 c;
    public final l3 d;
    public final int e;

    public /* synthetic */ o3(int i, b3 b3Var, s1 s1Var, m1 m1Var, l3 l3Var, int i2) {
        if (17 != (i & 17)) {
            oea.z(i, 17, m3.a.getDescriptor());
            throw null;
        }
        this.a = b3Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = s1Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = m1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = l3Var;
        }
        this.e = i2;
    }

    public static final void a(o3 o3Var, wf3 wf3Var, uye uyeVar) {
        o3Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.f(uyeVar, 0, w2.a, o3Var.a);
        if (wf3Var.o(uyeVar) || o3Var.b != null) {
            wf3Var.h(uyeVar, 1, q1.a, o3Var.b);
        }
        if (wf3Var.o(uyeVar) || o3Var.c != null) {
            wf3Var.h(uyeVar, 2, k1.a, o3Var.c);
        }
        if (wf3Var.o(uyeVar) || o3Var.d != null) {
            wf3Var.h(uyeVar, 3, j3.a, o3Var.d);
        }
        wf3Var.u(4, o3Var.e, uyeVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o3)) {
            return false;
        }
        o3 o3Var = (o3) obj;
        return Intrinsics.c(this.a, o3Var.a) && Intrinsics.c(this.b, o3Var.b) && Intrinsics.c(this.c, o3Var.c) && Intrinsics.c(this.d, o3Var.d) && this.e == o3Var.e;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        s1 s1Var = this.b;
        int hashCode2 = (hashCode + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m1 m1Var = this.c;
        int hashCode3 = (hashCode2 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        l3 l3Var = this.d;
        return Integer.hashCode(this.e) + ((hashCode3 + (l3Var != null ? l3Var.hashCode() : 0)) * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("RtbToken(device=");
        a.append(this.a);
        a.append(", user=");
        a.append(this.b);
        a.append(", ext=");
        a.append(this.c);
        a.append(", request=");
        a.append(this.d);
        a.append(", ordinalView=");
        return wv8.j(a, this.e, ')');
    }

    public o3(b3 b3Var, s1 s1Var, m1 m1Var, l3 l3Var, int i) {
        b3Var.getClass();
        this.a = b3Var;
        this.b = s1Var;
        this.c = m1Var;
        this.d = l3Var;
        this.e = i;
    }
}
