package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class tca {
    public String a = null;
    public String b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tca)) {
            return false;
        }
        tca tcaVar = (tca) obj;
        return Intrinsics.c(this.a, tcaVar.a) && Intrinsics.c(this.b, tcaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Builder(name=");
        sb.append(this.a);
        sb.append(", email=");
        return lnb.q(sb, this.b, ')');
    }
}
