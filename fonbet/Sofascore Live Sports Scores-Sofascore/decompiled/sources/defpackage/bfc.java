package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bfc {
    public final String a;
    public final Object b;
    public final String c;
    public final tc3 d;

    public bfc(String str, Object obj, String str2, tc3 tc3Var) {
        str.getClass();
        str2.getClass();
        this.a = str;
        this.b = obj;
        this.c = str2;
        this.d = tc3Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bfc)) {
            return false;
        }
        bfc bfcVar = (bfc) obj;
        return Intrinsics.c(this.a, bfcVar.a) && this.b.equals(bfcVar.b) && Intrinsics.c(this.c, bfcVar.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
