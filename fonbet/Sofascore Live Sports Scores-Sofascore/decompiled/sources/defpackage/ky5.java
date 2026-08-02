package defpackage;

import com.sofascore.model.newNetwork.FeaturedPlayer;
import java.io.Serializable;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class ky5 implements Serializable {
    public final FeaturedPlayer a;
    public final FeaturedPlayer b;

    public ky5(FeaturedPlayer featuredPlayer, FeaturedPlayer featuredPlayer2) {
        this.a = featuredPlayer;
        this.b = featuredPlayer2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ky5)) {
            return false;
        }
        ky5 ky5Var = (ky5) obj;
        return Intrinsics.c(this.a, ky5Var.a) && Intrinsics.c(this.b, ky5Var.b);
    }

    public final int hashCode() {
        FeaturedPlayer featuredPlayer = this.a;
        int hashCode = (featuredPlayer == null ? 0 : featuredPlayer.hashCode()) * 31;
        FeaturedPlayer featuredPlayer2 = this.b;
        return hashCode + (featuredPlayer2 != null ? featuredPlayer2.hashCode() : 0);
    }

    public final String toString() {
        return "FeaturedPlayersWrapper(homePlayer=" + this.a + ", awayPlayer=" + this.b + ")";
    }
}
