package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class z7l {
    public final ArrayList a;
    public final boolean b;

    public z7l(ArrayList arrayList, boolean z) {
        this.a = arrayList;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7l)) {
            return false;
        }
        z7l z7lVar = (z7l) obj;
        return this.a.equals(z7lVar.a) && this.b == z7lVar.b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "WidgetWindow(items=" + this.a + ", hasMoreAfter=" + this.b + ")";
    }
}
