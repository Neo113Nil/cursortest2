package defpackage;

import android.content.res.Resources;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class y1g {
    public final Resources a;
    public final Resources.Theme b;

    public y1g(Resources resources, Resources.Theme theme) {
        this.a = resources;
        this.b = theme;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && y1g.class == obj.getClass()) {
            y1g y1gVar = (y1g) obj;
            if (this.a.equals(y1gVar.a) && Objects.equals(this.b, y1gVar.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(this.a, this.b);
    }
}
