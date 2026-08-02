package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class w2h {
    public final v2h a;
    public final v2h b;
    public final boolean c;

    public w2h(v2h v2hVar, v2h v2hVar2, boolean z) {
        this.a = v2hVar;
        this.b = v2hVar2;
        this.c = z;
    }

    public static w2h a(w2h w2hVar, v2h v2hVar, v2h v2hVar2, boolean z, int i) {
        if ((i & 1) != 0) {
            v2hVar = w2hVar.a;
        }
        if ((i & 2) != 0) {
            v2hVar2 = w2hVar.b;
        }
        w2hVar.getClass();
        return new w2h(v2hVar, v2hVar2, z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof w2h)) {
            return false;
        }
        w2h w2hVar = (w2h) obj;
        return Intrinsics.c(this.a, w2hVar.a) && Intrinsics.c(this.b, w2hVar.b) && this.c == w2hVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Selection(start=");
        sb.append(this.a);
        sb.append(", end=");
        sb.append(this.b);
        sb.append(", handlesCrossed=");
        return lnb.r(sb, this.c, ')');
    }
}
