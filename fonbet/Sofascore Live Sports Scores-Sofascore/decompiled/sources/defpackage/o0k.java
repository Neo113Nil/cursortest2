package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class o0k {
    public final String a;
    public final Integer b;
    public final int c;
    public final String d;

    public o0k(int i, String str, String str2, Integer num) {
        this.a = str;
        this.b = num;
        this.c = i;
        this.d = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o0k)) {
            return false;
        }
        o0k o0kVar = (o0k) obj;
        return Intrinsics.c(this.a, o0kVar.a) && Intrinsics.c(this.b, o0kVar.b) && this.c == o0kVar.c && this.d.equals(o0kVar.d);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        Integer num = this.b;
        return this.d.hashCode() + wv8.a(this.c, (hashCode + (num != null ? num.hashCode() : 0)) * 31, 31);
    }

    public final String toString() {
        return "TrendingTileAnalytics(action=" + this.a + ", id=" + this.b + ", listPosition=" + this.c + ", type=" + this.d + ")";
    }
}
