package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vfi {
    public final q50 a;
    public final q50 b;
    public final q50 c;
    public final q50 d;
    public final q50 e;
    public final q50 f;
    public final q50 g;
    public final q50 h;
    public final q50 i;
    public final q50 j;

    public vfi(q50 q50Var, q50 q50Var2, q50 q50Var3, q50 q50Var4, q50 q50Var5, q50 q50Var6, q50 q50Var7, q50 q50Var8, q50 q50Var9, q50 q50Var10) {
        q50Var.getClass();
        q50Var2.getClass();
        q50Var3.getClass();
        q50Var4.getClass();
        q50Var5.getClass();
        q50Var6.getClass();
        q50Var7.getClass();
        q50Var8.getClass();
        q50Var9.getClass();
        q50Var10.getClass();
        this.a = q50Var;
        this.b = q50Var2;
        this.c = q50Var3;
        this.d = q50Var4;
        this.e = q50Var5;
        this.f = q50Var6;
        this.g = q50Var7;
        this.h = q50Var8;
        this.i = q50Var9;
        this.j = q50Var10;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vfi)) {
            return false;
        }
        vfi vfiVar = (vfi) obj;
        return Intrinsics.c(this.a, vfiVar.a) && Intrinsics.c(this.b, vfiVar.b) && Intrinsics.c(this.c, vfiVar.c) && Intrinsics.c(this.d, vfiVar.d) && Intrinsics.c(this.e, vfiVar.e) && Intrinsics.c(this.f, vfiVar.f) && Intrinsics.c(this.g, vfiVar.g) && Intrinsics.c(this.h, vfiVar.h) && Intrinsics.c(this.i, vfiVar.i) && Intrinsics.c(this.j, vfiVar.j);
    }

    public final int hashCode() {
        return this.j.hashCode() + ((this.i.hashCode() + ((this.h.hashCode() + ((this.g.hashCode() + ((this.f.hashCode() + ((this.e.hashCode() + ((this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "StoryTransitionState(introZoomScale=" + this.a + ", monthlyTargetScale=" + this.b + ", monthlyTargetAlpha=" + this.c + ", outgoingScale=" + this.d + ", outgoingScaleX=" + this.e + ", outgoingScaleY=" + this.f + ", outgoingAlpha=" + this.g + ", incomingScaleX=" + this.h + ", incomingScaleY=" + this.i + ", incomingAlpha=" + this.j + ")";
    }
}
