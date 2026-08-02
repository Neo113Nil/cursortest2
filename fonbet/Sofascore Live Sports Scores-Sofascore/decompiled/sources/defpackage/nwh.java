package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class nwh extends az7 {
    public final zt9 a;
    public final String b;
    public final int c;

    public nwh(zt9 zt9Var, String str, int i) {
        this.a = zt9Var;
        this.b = str;
        this.c = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nwh)) {
            return false;
        }
        nwh nwhVar = (nwh) obj;
        return this.a.equals(nwhVar.a) && Intrinsics.c(this.b, nwhVar.b) && this.c == nwhVar.c;
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        String str = this.b;
        return wt3.C(this.c) + ((hashCode + (str != null ? str.hashCode() : 0)) * 31);
    }
}
