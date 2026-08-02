package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nlk {
    public final String a;
    public final String b;

    public nlk(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nlk)) {
            return false;
        }
        nlk nlkVar = (nlk) obj;
        return Intrinsics.c(this.a, nlkVar.a) && Intrinsics.c(this.b, nlkVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoClicks(clickThrough=");
        sb.append(this.a);
        sb.append(", clickTracking=");
        return lnb.q(sb, this.b, ')');
    }
}
