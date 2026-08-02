package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class glk {
    public final String a;
    public final boolean b;
    public final String c;

    public glk(String str, boolean z, String str2) {
        this.a = str;
        this.b = z;
        this.c = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof glk)) {
            return false;
        }
        glk glkVar = (glk) obj;
        return Intrinsics.c(this.a, glkVar.a) && this.b == glkVar.b && Intrinsics.c(this.c, glkVar.c);
    }

    public final int hashCode() {
        String str = this.a;
        int e = dmi.e((str == null ? 0 : str.hashCode()) * 31, 31, this.b);
        String str2 = this.c;
        return e + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("JavascriptResource(apiFramework=");
        sb.append(this.a);
        sb.append(", browserOptional=");
        sb.append(this.b);
        sb.append(", value=");
        return lnb.q(sb, this.c, ')');
    }
}
