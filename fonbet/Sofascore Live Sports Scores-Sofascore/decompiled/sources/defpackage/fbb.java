package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class fbb extends gbb {
    public final String a;
    public final iej b;

    public /* synthetic */ fbb(String str, iej iejVar, int i) {
        this(str, (i & 2) != 0 ? null : iejVar);
    }

    @Override // defpackage.gbb
    public final iej a() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fbb)) {
            return false;
        }
        fbb fbbVar = (fbb) obj;
        return Intrinsics.c(this.a, fbbVar.a) && Intrinsics.c(this.b, fbbVar.b);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        iej iejVar = this.b;
        return (hashCode + (iejVar != null ? iejVar.hashCode() : 0)) * 31;
    }

    public final String toString() {
        return lnb.q(new StringBuilder("LinkAnnotation.Url(url="), this.a, ')');
    }

    public fbb(String str, iej iejVar) {
        this.a = str;
        this.b = iejVar;
    }
}
