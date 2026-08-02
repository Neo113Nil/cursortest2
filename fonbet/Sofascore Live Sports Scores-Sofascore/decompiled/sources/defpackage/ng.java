package defpackage;

import com.sofascore.model.firebase.AdType;
import com.sofascore.model.firebase.BannerSize;
import com.sofascore.model.firebase.BaseAdUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ng {
    public final int a;
    public final BannerSize b;
    public final BaseAdUnit c;
    public final AdType.Banner d;

    public ng(int i, BannerSize bannerSize, BaseAdUnit baseAdUnit, AdType.Banner banner) {
        bannerSize.getClass();
        banner.getClass();
        this.a = i;
        this.b = bannerSize;
        this.c = baseAdUnit;
        this.d = banner;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ng)) {
            return false;
        }
        ng ngVar = (ng) obj;
        return this.a == ngVar.a && this.b == ngVar.b && this.c.equals(ngVar.c) && this.d == ngVar.d;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + ((this.b.hashCode() + wv8.a(this.a, Integer.hashCode(-1) * 31, 31)) * 31)) * 31);
    }

    public final String toString() {
        return "AdRequestConfig(widthDp=-1, heightDp=" + this.a + ", size=" + this.b + ", adUnit=" + this.c + ", type=" + this.d + ")";
    }
}
