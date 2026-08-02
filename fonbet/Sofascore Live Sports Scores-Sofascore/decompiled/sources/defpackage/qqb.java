package defpackage;

import com.sofascore.model.database.DisplayType;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class qqb {
    public final boolean a;
    public final oqb b;
    public final DisplayType c;
    public final boolean d;

    public qqb(boolean z, oqb oqbVar, DisplayType displayType, boolean z2) {
        displayType.getClass();
        this.a = z;
        this.b = oqbVar;
        this.c = displayType;
        this.d = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqb)) {
            return false;
        }
        qqb qqbVar = (qqb) obj;
        return this.a == qqbVar.a && this.b.equals(qqbVar.b) && this.c == qqbVar.c && this.d == qqbVar.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ((this.c.hashCode() + ((this.b.hashCode() + (Boolean.hashCode(this.a) * 31)) * 31)) * 31);
    }

    public final String toString() {
        return "FilterState(filterEnabled=" + this.a + ", appliedFilterValue=" + this.b + ", displayType=" + this.c + ", chronologicalViewAvailable=" + this.d + ")";
    }
}
