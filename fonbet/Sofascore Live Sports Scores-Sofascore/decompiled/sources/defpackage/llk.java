package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class llk {
    public final String a;
    public final String b;
    public final int c;

    public llk(String str, String str2) {
        str.getClass();
        this.a = str;
        this.b = str2;
        int[] D = wt3.D(15);
        int length = D.length;
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i2 >= length) {
                break;
            }
            int i3 = D[i2];
            if (dmi.A(i3).equalsIgnoreCase(this.b)) {
                i = i3;
                break;
            }
            i2++;
        }
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof llk)) {
            return false;
        }
        llk llkVar = (llk) obj;
        return Intrinsics.c(this.a, llkVar.a) && Intrinsics.c(this.b, llkVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tracking(url=");
        sb.append(this.a);
        sb.append(", eventString=");
        return lnb.q(sb, this.b, ')');
    }
}
