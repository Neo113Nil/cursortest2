package defpackage;

import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class cxe {
    public final List a;
    public final List b;

    public cxe(List list, List list2) {
        list.getClass();
        list2.getClass();
        this.a = list;
        this.b = list2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cxe)) {
            return false;
        }
        cxe cxeVar = (cxe) obj;
        return Intrinsics.c(this.a, cxeVar.a) && Intrinsics.c(this.b, cxeVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "PlayerTransferHistoryData(transferHistory=" + this.a + ", bitmapList=" + this.b + ")";
    }
}
