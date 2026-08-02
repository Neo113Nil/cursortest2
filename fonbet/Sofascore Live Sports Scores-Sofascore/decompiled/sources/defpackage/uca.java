package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class uca {
    public final String a;
    public final String b;

    public uca(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof uca)) {
            return false;
        }
        uca ucaVar = (uca) obj;
        return Intrinsics.c(this.a, ucaVar.a) && Intrinsics.c(this.b, ucaVar.b);
    }

    public final int hashCode() {
        String str = this.a;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.b;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ItunesOwner(name=");
        sb.append(this.a);
        sb.append(", email=");
        return lnb.q(sb, this.b, ')');
    }
}
