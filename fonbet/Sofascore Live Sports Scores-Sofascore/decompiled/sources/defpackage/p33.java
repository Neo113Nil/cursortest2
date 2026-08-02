package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class p33 {
    public final qfb a;
    public final qfb b;
    public final qfb c;
    public final rfb d;
    public final rfb e;

    public p33(qfb qfbVar, qfb qfbVar2, qfb qfbVar3, rfb rfbVar, rfb rfbVar2) {
        qfbVar.getClass();
        qfbVar2.getClass();
        qfbVar3.getClass();
        rfbVar.getClass();
        this.a = qfbVar;
        this.b = qfbVar2;
        this.c = qfbVar3;
        this.d = rfbVar;
        this.e = rfbVar2;
        if (rfbVar.e && rfbVar2 != null) {
            boolean z = rfbVar2.e;
        }
        boolean z2 = rfbVar.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || p33.class != obj.getClass()) {
            return false;
        }
        p33 p33Var = (p33) obj;
        return Intrinsics.c(this.a, p33Var.a) && Intrinsics.c(this.b, p33Var.b) && Intrinsics.c(this.c, p33Var.c) && Intrinsics.c(this.d, p33Var.d) && Intrinsics.c(this.e, p33Var.e);
    }

    public final int hashCode() {
        int hashCode = (this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31)) * 31;
        rfb rfbVar = this.e;
        return hashCode + (rfbVar != null ? rfbVar.hashCode() : 0);
    }

    public final String toString() {
        return "CombinedLoadStates(refresh=" + this.a + ", prepend=" + this.b + ", append=" + this.c + ", source=" + this.d + ", mediator=" + this.e + ')';
    }
}
