package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.BaseHockeyShotmapItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class wd9 {
    public final BaseHockeyShotmapItem a;
    public Point2D b;

    public wd9(BaseHockeyShotmapItem baseHockeyShotmapItem, Point2D point2D) {
        this.a = baseHockeyShotmapItem;
        this.b = point2D;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof wd9)) {
            return false;
        }
        wd9 wd9Var = (wd9) obj;
        return this.a.equals(wd9Var.a) && this.b.equals(wd9Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "Incident(data=" + this.a + ", point=" + this.b + ")";
    }
}
