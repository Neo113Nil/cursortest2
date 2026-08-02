package defpackage;

import com.sofascore.model.newNetwork.TrendingGridTileSize;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class yzj {
    public final int a;
    public final TrendingGridTileSize b;
    public final int c;

    public yzj(int i, TrendingGridTileSize trendingGridTileSize, int i2) {
        trendingGridTileSize.getClass();
        this.a = i;
        this.b = trendingGridTileSize;
        this.c = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yzj)) {
            return false;
        }
        yzj yzjVar = (yzj) obj;
        return this.a == yzjVar.a && this.b == yzjVar.b && this.c == yzjVar.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + ((this.b.hashCode() + (Integer.hashCode(this.a) * 31)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Slot(index=");
        sb.append(this.a);
        sb.append(", size=");
        sb.append(this.b);
        sb.append(", position=");
        return fc6.h(this.c, ")", sb);
    }
}
