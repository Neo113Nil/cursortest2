package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class i3k {
    public final int a;
    public final String b;
    public final String c;
    public final int d;
    public final int e;
    public final o3k f;

    public i3k(int i, String str, String str2, int i2, int i3, o3k o3kVar) {
        str.getClass();
        this.a = i;
        this.b = str;
        this.c = str2;
        this.d = i2;
        this.e = i3;
        this.f = o3kVar;
    }

    public static i3k a(i3k i3kVar, int i, int i2, o3k o3kVar, int i3) {
        int i4 = i3kVar.a;
        String str = i3kVar.b;
        String str2 = i3kVar.c;
        if ((i3 & 8) != 0) {
            i = i3kVar.d;
        }
        int i5 = i;
        if ((i3 & 16) != 0) {
            i2 = i3kVar.e;
        }
        str.getClass();
        return new i3k(i4, str, str2, i5, i2, o3kVar);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i3k)) {
            return false;
        }
        i3k i3kVar = (i3k) obj;
        return this.a == i3kVar.a && Intrinsics.c(this.b, i3kVar.b) && Intrinsics.c(this.c, i3kVar.c) && this.d == i3kVar.d && this.e == i3kVar.e && this.f == i3kVar.f;
    }

    public final int hashCode() {
        int c = dmi.c(Integer.hashCode(this.a) * 31, 31, this.b);
        String str = this.c;
        int a = wv8.a(this.e, wv8.a(this.d, (c + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        o3k o3kVar = this.f;
        return a + (o3kVar != null ? o3kVar.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder t = dmi.t(this.a, "TvChannelUiModel(id=", ", name=", this.b, ", link=");
        w1l.q(this.d, this.c, ", upVote=", ", downVote=", t);
        t.append(this.e);
        t.append(", voteType=");
        t.append(this.f);
        t.append(")");
        return t.toString();
    }
}
