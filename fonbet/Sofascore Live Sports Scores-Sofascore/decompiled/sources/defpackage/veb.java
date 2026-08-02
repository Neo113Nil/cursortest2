package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class veb {
    public final List a;
    public final List b;
    public final List c;
    public final boolean d;

    public veb(List list, List list2, List list3, boolean z) {
        list.getClass();
        list2.getClass();
        list3.getClass();
        this.a = list;
        this.b = list2;
        this.c = list3;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof veb)) {
            return false;
        }
        veb vebVar = (veb) obj;
        return Intrinsics.c(this.a, vebVar.a) && Intrinsics.c(this.b, vebVar.b) && Intrinsics.c(this.c, vebVar.c) && this.d == vebVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + dmi.d(dmi.d(this.a.hashCode() * 31, 31, this.b), 31, this.c);
    }

    public final String toString() {
        StringBuilder s = fc6.s("EventsResult(liveEvents=", ", finishedEvents=", ", upcomingEvents=", this.a, this.b);
        s.append(this.c);
        s.append(", selectLivePosition=");
        s.append(this.d);
        s.append(")");
        return s.toString();
    }
}
