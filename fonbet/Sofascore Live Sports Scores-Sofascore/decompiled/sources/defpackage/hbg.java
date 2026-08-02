package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class hbg {
    public final long a;
    public final long b;
    public final String c;

    public hbg(long j, long j2, String str) {
        this.a = j;
        this.b = j2;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hbg)) {
            return false;
        }
        hbg hbgVar = (hbg) obj;
        return this.a == hbgVar.a && this.b == hbgVar.b && Intrinsics.c(this.c, hbgVar.c);
    }

    public final int hashCode() {
        int c = ljg.c(ljg.c(Long.hashCode(415167L) * 31, 31, this.a), 31, this.b);
        String str = this.c;
        return c + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder o = ljg.o("SASAdPlacement(siteId=415167, pageId=", this.a, ", formatId=");
        o.append(this.b);
        o.append(", keywordTargeting=");
        o.append(this.c);
        o.append(")");
        return o.toString();
    }
}
