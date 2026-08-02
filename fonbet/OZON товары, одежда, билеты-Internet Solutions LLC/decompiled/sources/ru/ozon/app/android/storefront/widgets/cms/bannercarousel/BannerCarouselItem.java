package ru.ozon.app.android.storefront.widgets.cms.bannercarousel;

import N3.C3660k;
import WZ.t;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0017\u0010\rR\u001f\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItem;", "", "", "image", "deeplink", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadge", "<init>", "(Ljava/lang/String;Ljava/lang/String;LWZ/t;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "getDeeplink", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerCarouselItem {
    private final BadgeDTO advBadge;
    private final String deeplink;

    @NotNull
    private final String image;
    private final t tokenizedEvent;

    public BannerCarouselItem(@NotNull String image, String str, t tVar, BadgeDTO badgeDTO) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.deeplink = str;
        this.tokenizedEvent = tVar;
        this.advBadge = badgeDTO;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerCarouselItem)) {
            return false;
        }
        BannerCarouselItem bannerCarouselItem = (BannerCarouselItem) other;
        return Intrinsics.d(this.image, bannerCarouselItem.image) && Intrinsics.d(this.deeplink, bannerCarouselItem.deeplink) && Intrinsics.d(this.tokenizedEvent, bannerCarouselItem.tokenizedEvent) && Intrinsics.d(this.advBadge, bannerCarouselItem.advBadge);
    }

    public final BadgeDTO getAdvBadge() {
        return this.advBadge;
    }

    public final String getDeeplink() {
        return this.deeplink;
    }

    @NotNull
    public final String getImage() {
        return this.image;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        String str = this.deeplink;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        t tVar = this.tokenizedEvent;
        int hashCode3 = (hashCode2 + (tVar == null ? 0 : tVar.hashCode())) * 31;
        BadgeDTO badgeDTO = this.advBadge;
        return hashCode3 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.image;
        String str2 = this.deeplink;
        t tVar = this.tokenizedEvent;
        BadgeDTO badgeDTO = this.advBadge;
        StringBuilder d11 = C3660k.d("BannerCarouselItem(image=", str, ", deeplink=", str2, ", tokenizedEvent=");
        d11.append(tVar);
        d11.append(", advBadge=");
        d11.append(badgeDTO);
        d11.append(")");
        return d11.toString();
    }
}
