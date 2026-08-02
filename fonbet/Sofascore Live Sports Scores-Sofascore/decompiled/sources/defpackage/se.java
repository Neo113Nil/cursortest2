package defpackage;

import java.util.Set;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class se extends lk5 {
    public final Set a;

    public se(Set set) {
        this.a = set;
    }

    @Override // defpackage.lk5
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof se) && super.equals(obj)) {
            return this.a.equals(((se) obj).a);
        }
        return false;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "ActivityRule:{tag={" + a() + "},filters={" + this.a + "}, alwaysExpand={true}}";
    }
}
