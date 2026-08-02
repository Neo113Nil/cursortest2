package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class tje {
    public final mje a;
    public final aje b;

    public tje() {
        this(null, new aje());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tje)) {
            return false;
        }
        tje tjeVar = (tje) obj;
        return Intrinsics.c(this.b, tjeVar.b) && Intrinsics.c(this.a, tjeVar.a);
    }

    public final int hashCode() {
        mje mjeVar = this.a;
        int hashCode = (mjeVar != null ? mjeVar.hashCode() : 0) * 31;
        aje ajeVar = this.b;
        return hashCode + (ajeVar != null ? ajeVar.hashCode() : 0);
    }

    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.a + ", paragraphSyle=" + this.b + ')';
    }

    public tje(mje mjeVar, aje ajeVar) {
        this.a = mjeVar;
        this.b = ajeVar;
    }
}
