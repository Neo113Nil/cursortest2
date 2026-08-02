package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ugm {
    public final String a;
    public final String b;

    public ugm(String str, String str2) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = str2;
    }

    public static ugm copy$default(ugm ugmVar, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = ugmVar.a;
        }
        if ((i & 2) != 0) {
            str2 = ugmVar.b;
        }
        ugmVar.getClass();
        str.getClass();
        str2.getClass();
        return new ugm(str, str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ugm)) {
            return false;
        }
        ugm ugmVar = (ugm) obj;
        return Intrinsics.c(this.a, ugmVar.a) && Intrinsics.c(this.b, ugmVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticValueParam(key=");
        sb.append(this.a);
        sb.append(", value=");
        return lnb.q(sb, this.b, ')');
    }
}
