package com.vungle.ads.internal;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class l0 {
    public m0 a;
    public m0 b;

    public l0(m0 m0Var, m0 m0Var2) {
        m0Var.getClass();
        m0Var2.getClass();
        this.a = m0Var;
        this.b = m0Var2;
    }

    public final void a(m0 m0Var) {
        m0Var.getClass();
        this.a = m0Var;
    }

    public final void b(m0 m0Var) {
        m0Var.getClass();
        this.b = m0Var;
    }

    public final boolean c() {
        m0 m0Var = this.a;
        if (m0Var.a == Integer.MIN_VALUE || m0Var.b == Integer.MIN_VALUE) {
            return false;
        }
        m0 m0Var2 = this.b;
        return (m0Var2.a == Integer.MIN_VALUE || m0Var2.b == Integer.MIN_VALUE) ? false : true;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l0)) {
            return false;
        }
        l0 l0Var = (l0) obj;
        return Intrinsics.c(this.a, l0Var.a) && Intrinsics.c(this.b, l0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("ClickCoordinate(downCoordinate=");
        a.append(this.a);
        a.append(", upCoordinate=");
        a.append(this.b);
        a.append(')');
        return a.toString();
    }

    public final m0 a() {
        return this.a;
    }

    public final m0 b() {
        return this.b;
    }
}
