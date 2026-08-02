package com.vungle.ads.internal.model;

import defpackage.oea;
import defpackage.uye;
import defpackage.wf3;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t1 {

    @NotNull
    public static final d1 Companion = new d1();
    public final b3 a;
    public final l0 b;
    public final s1 c;
    public m1 d;
    public p1 e;

    public /* synthetic */ t1(int i, b3 b3Var, l0 l0Var, s1 s1Var, m1 m1Var, p1 p1Var) {
        if (1 != (i & 1)) {
            oea.z(i, 1, q0.a.getDescriptor());
            throw null;
        }
        this.a = b3Var;
        if ((i & 2) == 0) {
            this.b = null;
        } else {
            this.b = l0Var;
        }
        if ((i & 4) == 0) {
            this.c = null;
        } else {
            this.c = s1Var;
        }
        if ((i & 8) == 0) {
            this.d = null;
        } else {
            this.d = m1Var;
        }
        if ((i & 16) == 0) {
            this.e = null;
        } else {
            this.e = p1Var;
        }
    }

    public static final void a(t1 t1Var, wf3 wf3Var, uye uyeVar) {
        t1Var.getClass();
        wf3Var.getClass();
        uyeVar.getClass();
        wf3Var.f(uyeVar, 0, w2.a, t1Var.a);
        if (wf3Var.o(uyeVar) || t1Var.b != null) {
            wf3Var.h(uyeVar, 1, j0.a, t1Var.b);
        }
        if (wf3Var.o(uyeVar) || t1Var.c != null) {
            wf3Var.h(uyeVar, 2, q1.a, t1Var.c);
        }
        if (wf3Var.o(uyeVar) || t1Var.d != null) {
            wf3Var.h(uyeVar, 3, k1.a, t1Var.d);
        }
        if (!wf3Var.o(uyeVar) && t1Var.e == null) {
            return;
        }
        wf3Var.h(uyeVar, 4, n1.a, t1Var.e);
    }

    public final m1 b() {
        return this.d;
    }

    public final p1 c() {
        return this.e;
    }

    public final s1 d() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof t1)) {
            return false;
        }
        t1 t1Var = (t1) obj;
        return Intrinsics.c(this.a, t1Var.a) && Intrinsics.c(this.b, t1Var.b) && Intrinsics.c(this.c, t1Var.c) && Intrinsics.c(this.d, t1Var.d) && Intrinsics.c(this.e, t1Var.e);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        l0 l0Var = this.b;
        int hashCode2 = (hashCode + (l0Var == null ? 0 : l0Var.hashCode())) * 31;
        s1 s1Var = this.c;
        int hashCode3 = (hashCode2 + (s1Var == null ? 0 : s1Var.hashCode())) * 31;
        m1 m1Var = this.d;
        int hashCode4 = (hashCode3 + (m1Var == null ? 0 : m1Var.hashCode())) * 31;
        p1 p1Var = this.e;
        return hashCode4 + (p1Var != null ? p1Var.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("CommonRequestBody(device=");
        a.append(this.a);
        a.append(", app=");
        a.append(this.b);
        a.append(", user=");
        a.append(this.c);
        a.append(", ext=");
        a.append(this.d);
        a.append(", request=");
        a.append(this.e);
        a.append(')');
        return a.toString();
    }

    public t1(b3 b3Var, l0 l0Var, s1 s1Var, m1 m1Var, p1 p1Var) {
        b3Var.getClass();
        this.a = b3Var;
        this.b = l0Var;
        this.c = s1Var;
        this.d = m1Var;
        this.e = p1Var;
    }

    public /* synthetic */ t1(b3 b3Var, l0 l0Var, s1 s1Var) {
        this(b3Var, l0Var, s1Var, null, null);
    }

    public final b3 a() {
        return this.a;
    }

    public final void a(m1 m1Var) {
        this.d = m1Var;
    }

    public final void a(p1 p1Var) {
        this.e = p1Var;
    }
}
