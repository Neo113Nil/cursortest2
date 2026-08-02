package defpackage;

import com.sofascore.model.firebase.AdType;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class sz0 {
    public final AdType.Banner a;
    public final tee b;

    public sz0(AdType.Banner banner, tee teeVar) {
        teeVar.getClass();
        this.a = banner;
        this.b = teeVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sz0)) {
            return false;
        }
        sz0 sz0Var = (sz0) obj;
        return this.a == sz0Var.a && Intrinsics.c(this.b, sz0Var.b);
    }

    public final int hashCode() {
        AdType.Banner banner = this.a;
        return this.b.hashCode() + ((banner == null ? 0 : banner.hashCode()) * 31);
    }

    public final String toString() {
        return "BannerAdsConfig(adType=" + this.a + ", adParams=" + this.b + ")";
    }
}
