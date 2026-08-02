package defpackage;

import android.graphics.drawable.Drawable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class e8l {
    public final Drawable a;
    public int b;

    public e8l(Drawable drawable, int i) {
        this.a = drawable;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e8l)) {
            return false;
        }
        e8l e8lVar = (e8l) obj;
        return this.a.equals(e8lVar.a) && this.b == e8lVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "IncidentItem(drawable=" + this.a + ", marginStart=" + this.b + ")";
    }
}
