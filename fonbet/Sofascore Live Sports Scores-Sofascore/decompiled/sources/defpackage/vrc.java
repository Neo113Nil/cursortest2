package defpackage;

import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vrc {
    public final String a;
    public final ArrayList b;
    public final urc c;

    public vrc(String str, ArrayList arrayList) {
        urc urcVar = urc.a;
        this.a = str;
        this.b = arrayList;
        this.c = urcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof vrc)) {
            return false;
        }
        vrc vrcVar = (vrc) obj;
        return this.a.equals(vrcVar.a) && this.b.equals(vrcVar.b) && this.c == vrcVar.c;
    }

    public final int hashCode() {
        return this.c.hashCode() + vxd.d(this.b, this.a.hashCode() * 31, 31);
    }

    public final String toString() {
        return "MmaStatsGroupWrapper(tag=" + this.a + ", statList=" + this.b + ", type=" + this.c + ")";
    }
}
