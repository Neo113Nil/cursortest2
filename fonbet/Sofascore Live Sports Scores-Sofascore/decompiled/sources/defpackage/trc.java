package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class trc {
    public final String a;
    public final ArrayList b;

    public trc(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof trc)) {
            return false;
        }
        trc trcVar = (trc) obj;
        return this.a.equals(trcVar.a) && this.b.equals(trcVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MmaStatsDualSectionWrapper(tag=" + this.a + ", groupList=" + this.b + ")";
    }
}
