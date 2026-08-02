package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class klk {
    public final String a;
    public final String b;

    public klk(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klk)) {
            return false;
        }
        klk klkVar = (klk) obj;
        return Intrinsics.c(this.a, klkVar.a) && Intrinsics.c(this.b, klkVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StaticResource(value=");
        sb.append(this.a);
        sb.append(", creativeType=");
        return lnb.q(sb, this.b, ')');
    }
}
