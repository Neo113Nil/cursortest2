package defpackage;

import com.sofascore.model.mvvm.model.Point2D;
import com.sofascore.model.newNetwork.FootballShotmapItem;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dl8 {
    public final FootballShotmapItem a;
    public Point2D b;
    public boolean c;
    public int d;

    public dl8(FootballShotmapItem footballShotmapItem, Point2D point2D, boolean z, int i) {
        this.a = footballShotmapItem;
        this.b = point2D;
        this.c = z;
        this.d = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof dl8)) {
            return false;
        }
        dl8 dl8Var = (dl8) obj;
        return this.a.equals(dl8Var.a) && this.b.equals(dl8Var.b) && this.c == dl8Var.c && this.d == dl8Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + dmi.e((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c);
    }

    public final String toString() {
        return "ShotmapDataWrapper(data=" + this.a + ", scaledPoint=" + this.b + ", isSelected=" + this.c + ", alpha=" + this.d + ")";
    }
}
