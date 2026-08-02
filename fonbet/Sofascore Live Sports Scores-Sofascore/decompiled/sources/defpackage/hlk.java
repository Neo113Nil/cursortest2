package defpackage;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class hlk {
    public final blk a;
    public final mlk b;
    public final nlk c;
    public final jlk d;

    public hlk(blk blkVar, mlk mlkVar, nlk nlkVar, jlk jlkVar) {
        this.a = blkVar;
        this.b = mlkVar;
        this.c = nlkVar;
        this.d = jlkVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hlk)) {
            return false;
        }
        hlk hlkVar = (hlk) obj;
        return Intrinsics.c(this.a, hlkVar.a) && this.b.equals(hlkVar.b) && Intrinsics.c(this.c, hlkVar.c) && this.d.equals(hlkVar.d);
    }

    public final int hashCode() {
        blk blkVar = this.a;
        int d = dmi.d((blkVar == null ? 0 : blkVar.a.hashCode()) * 31, 31, this.b.a);
        nlk nlkVar = this.c;
        return this.d.a.hashCode() + ((d + (nlkVar != null ? nlkVar.hashCode() : 0)) * 31);
    }

    public final String toString() {
        return "Linear(duration=" + this.a + ", trackingEvents=" + this.b + ", tracker=" + this.c + ", mediaFiles=" + this.d + ')';
    }
}
