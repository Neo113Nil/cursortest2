package ru.ozon.app.android.fresh.main.widgets.bannerList.data;

import B0.C2454a;
import J0.P;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.widgets.bannerList.data.BannerListDTO;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B)\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000f¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerRow;", "", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "roundedCorners", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$BannerListItem;", "banner", "", "indexOfList", "lastIndex", "<init>", "(Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$BannerListItem;II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "getRoundedCorners", "()Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$RoundedCorners;", "Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$BannerListItem;", "getBanner", "()Lru/ozon/app/android/fresh/main/widgets/bannerList/data/BannerListDTO$BannerListItem;", "I", "getIndexOfList", "getLastIndex", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BannerRow {

    @NotNull
    private final BannerListDTO.BannerListItem banner;
    private final int indexOfList;
    private final int lastIndex;
    private final BannerListDTO.RoundedCorners roundedCorners;

    public BannerRow(BannerListDTO.RoundedCorners roundedCorners, @NotNull BannerListDTO.BannerListItem banner, int i11, int i12) {
        Intrinsics.checkNotNullParameter(banner, "banner");
        this.roundedCorners = roundedCorners;
        this.banner = banner;
        this.indexOfList = i11;
        this.lastIndex = i12;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerRow)) {
            return false;
        }
        BannerRow bannerRow = (BannerRow) other;
        return this.roundedCorners == bannerRow.roundedCorners && Intrinsics.d(this.banner, bannerRow.banner) && this.indexOfList == bannerRow.indexOfList && this.lastIndex == bannerRow.lastIndex;
    }

    @NotNull
    public final BannerListDTO.BannerListItem getBanner() {
        return this.banner;
    }

    public final int getIndexOfList() {
        return this.indexOfList;
    }

    public final int getLastIndex() {
        return this.lastIndex;
    }

    public final BannerListDTO.RoundedCorners getRoundedCorners() {
        return this.roundedCorners;
    }

    public int hashCode() {
        BannerListDTO.RoundedCorners roundedCorners = this.roundedCorners;
        return Integer.hashCode(this.lastIndex) + C2454a.a(this.indexOfList, (this.banner.hashCode() + ((roundedCorners == null ? 0 : roundedCorners.hashCode()) * 31)) * 31, 31);
    }

    @NotNull
    public String toString() {
        BannerListDTO.RoundedCorners roundedCorners = this.roundedCorners;
        BannerListDTO.BannerListItem bannerListItem = this.banner;
        int i11 = this.indexOfList;
        int i12 = this.lastIndex;
        StringBuilder sb2 = new StringBuilder("BannerRow(roundedCorners=");
        sb2.append(roundedCorners);
        sb2.append(", banner=");
        sb2.append(bannerListItem);
        sb2.append(", indexOfList=");
        return P.a(i11, i12, ", lastIndex=", ")", sb2);
    }
}
