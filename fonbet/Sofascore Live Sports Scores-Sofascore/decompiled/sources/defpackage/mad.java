package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class mad {
    public final String a;
    public final String b;
    public final fad c;
    public final tl6 d;

    public mad(String str, String str2, fad fadVar, tl6 tl6Var) {
        this.a = str;
        this.b = str2;
        this.c = fadVar;
        this.d = tl6Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mad)) {
            return false;
        }
        mad madVar = (mad) obj;
        return Intrinsics.c(this.a, madVar.a) && Intrinsics.c(this.b, madVar.b) && Intrinsics.c(this.c, madVar.c) && Intrinsics.c(this.d, madVar.d);
    }

    public final int hashCode() {
        return this.d.a.hashCode() + dmi.g(this.c.a, dmi.c(this.a.hashCode() * 31, 31, this.b), 961);
    }

    public final String toString() {
        StringBuilder s = mz1.s("NetworkRequest(url=", this.a, ", method=", this.b, ", headers=");
        s.append(this.c);
        s.append(", body=null, extras=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
