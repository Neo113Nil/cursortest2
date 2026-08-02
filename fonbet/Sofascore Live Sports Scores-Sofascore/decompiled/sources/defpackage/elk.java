package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class elk {
    public final String a;
    public final String b;

    public elk(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof elk)) {
            return false;
        }
        elk elkVar = (elk) obj;
        return Intrinsics.c(this.a, elkVar.a) && Intrinsics.c(this.b, elkVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Impression(value=");
        sb.append(this.a);
        sb.append(", id=");
        return lnb.q(sb, this.b, ')');
    }
}
