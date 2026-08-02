package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class ebb extends gbb {
    public final String a;
    public final iej b;

    public ebb(String str, iej iejVar) {
        this.a = str;
        this.b = iejVar;
    }

    @Override // defpackage.gbb
    public final iej a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebb)) {
            return false;
        }
        ebb ebbVar = (ebb) obj;
        return Intrinsics.c(this.a, ebbVar.a) && Intrinsics.c(this.b, ebbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        iej iejVar = this.b;
        return (hashCode + (iejVar != null ? iejVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return lnb.q(new StringBuilder("LinkAnnotation.Clickable(tag="), this.a, ')');
    }
}
