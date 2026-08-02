package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sgh {
    public final rgh a;
    public final bfk b;

    public sgh(rgh rghVar, bfk bfkVar) {
        rghVar.getClass();
        bfkVar.getClass();
        this.a = rghVar;
        this.b = bfkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sgh)) {
            return false;
        }
        sgh sghVar = (sgh) obj;
        return Intrinsics.c(this.a, sghVar.a) && Intrinsics.c(this.b, sghVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "SignInProvider(signInManager=" + this.a + ", userAccountManager=" + this.b + ")";
    }
}
