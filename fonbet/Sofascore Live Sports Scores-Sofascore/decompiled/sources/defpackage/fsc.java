package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class fsc {
    public final String a;
    public final ArrayList b;

    public fsc(String str, ArrayList arrayList) {
        this.a = str;
        this.b = arrayList;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fsc)) {
            return false;
        }
        fsc fscVar = (fsc) obj;
        return this.a.equals(fscVar.a) && this.b.equals(fscVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "MmaStatsSectionWrapper(tag=" + this.a + ", groupList=" + this.b + ")";
    }
}
