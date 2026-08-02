package defpackage;

import com.sofascore.model.newNetwork.TrendingGridTile;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class syj implements uyj {
    public final int a;
    public final TrendingGridTile b;

    public syj(int i, TrendingGridTile trendingGridTile) {
        trendingGridTile.getClass();
        this.a = i;
        this.b = trendingGridTile;
    }

    @Override // defpackage.zyj
    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof syj)) {
            return false;
        }
        syj syjVar = (syj) obj;
        return this.a == syjVar.a && Intrinsics.c(this.b, syjVar.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Integer.hashCode(this.a) * 31);
    }

    public final String toString() {
        return "LargeTrendingGridTile(slotKey=" + this.a + ", data=" + this.b + ")";
    }
}
