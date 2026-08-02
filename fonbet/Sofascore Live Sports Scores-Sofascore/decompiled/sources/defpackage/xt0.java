package defpackage;

import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class xt0 extends mx3 {
    public final List a;

    public xt0(List list) {
        this.a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof mx3)) {
            return false;
        }
        return this.a.equals(((xt0) ((mx3) obj)).a);
    }

    public final int hashCode() {
        return this.a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return mz1.p(new StringBuilder("RolloutsState{rolloutAssignments="), this.a, "}");
    }
}
