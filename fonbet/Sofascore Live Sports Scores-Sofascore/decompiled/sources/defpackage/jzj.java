package defpackage;

import com.sofascore.model.newNetwork.TrendingGridTileType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class jzj implements mzj {
    public final o0k a;
    public final TrendingGridTileType b;
    public final String c;

    public jzj(o0k o0kVar, TrendingGridTileType trendingGridTileType, String str) {
        trendingGridTileType.getClass();
        this.a = o0kVar;
        this.b = trendingGridTileType;
        this.c = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jzj)) {
            return false;
        }
        jzj jzjVar = (jzj) obj;
        return this.a.equals(jzjVar.a) && this.b == jzjVar.b && Intrinsics.c(this.c, jzjVar.c);
    }

    public final int hashCode() {
        int hashCode = (this.b.hashCode() + (this.a.hashCode() * 31)) * 31;
        String str = this.c;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GridTileClicked(analytics=");
        sb.append(this.a);
        sb.append(", tileType=");
        sb.append(this.b);
        sb.append(", actionValue=");
        return mz1.o(sb, this.c, ")");
    }
}
