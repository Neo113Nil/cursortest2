package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class bze implements cze {
    public final boolean a;
    public final String b;
    public final String c;
    public final gv9 d;
    public final boolean e;

    public bze(gv9 gv9Var, String str, String str2, boolean z, boolean z2) {
        gv9Var.getClass();
        this.a = z;
        this.b = str;
        this.c = str2;
        this.d = gv9Var;
        this.e = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bze)) {
            return false;
        }
        bze bzeVar = (bze) obj;
        return this.a == bzeVar.a && this.b.equals(bzeVar.b) && this.c.equals(bzeVar.c) && Intrinsics.c(this.d, bzeVar.d) && this.e == bzeVar.e;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.e) + ljg.d(dmi.c(dmi.c(Boolean.hashCode(this.a) * 31, 31, this.b), 31, this.c), 31, this.d);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SetPoints(isLive=");
        sb.append(this.a);
        sb.append(", homeScore=");
        sb.append(this.b);
        sb.append(", awayScore=");
        sb.append(this.c);
        sb.append(", points=");
        sb.append(this.d);
        sb.append(", isLastItem=");
        return wt3.p(sb, this.e, ")");
    }
}
