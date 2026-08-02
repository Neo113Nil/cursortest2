package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class iej {
    public final pwh a;
    public final pwh b;
    public final pwh c;
    public final pwh d;

    public iej(pwh pwhVar, pwh pwhVar2, pwh pwhVar3, pwh pwhVar4) {
        this.a = pwhVar;
        this.b = pwhVar2;
        this.c = pwhVar3;
        this.d = pwhVar4;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof iej)) {
            return false;
        }
        iej iejVar = (iej) obj;
        return Intrinsics.c(this.a, iejVar.a) && Intrinsics.c(this.b, iejVar.b) && Intrinsics.c(this.c, iejVar.c) && Intrinsics.c(this.d, iejVar.d);
    }

    public final int hashCode() {
        pwh pwhVar = this.a;
        int hashCode = (pwhVar != null ? pwhVar.hashCode() : 0) * 31;
        pwh pwhVar2 = this.b;
        int hashCode2 = (hashCode + (pwhVar2 != null ? pwhVar2.hashCode() : 0)) * 31;
        pwh pwhVar3 = this.c;
        int hashCode3 = (hashCode2 + (pwhVar3 != null ? pwhVar3.hashCode() : 0)) * 31;
        pwh pwhVar4 = this.d;
        return hashCode3 + (pwhVar4 != null ? pwhVar4.hashCode() : 0);
    }
}
