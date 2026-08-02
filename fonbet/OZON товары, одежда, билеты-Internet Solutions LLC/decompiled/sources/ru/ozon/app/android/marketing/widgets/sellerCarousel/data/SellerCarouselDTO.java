package ru.ozon.app.android.marketing.widgets.sellerCarousel.data;

import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.marketing.widgets.sellerCarousel.data.SellerListDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003Jc\u0010\u001b\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001c\u001a\u00020\u001d2\b\u0010\u001e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerCarouselDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "titleDeepLink", "items", "", "Lru/ozon/app/android/marketing/widgets/sellerCarousel/data/SellerListDTO$SellerDTO;", "titleDeepLinkTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/Map;Ljava/util/Map;)V", "getTitle", "()Ljava/lang/String;", "getTitleDeepLink", "getItems", "()Ljava/util/List;", "getTitleDeepLinkTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SellerCarouselDTO {
    public static final int $stable = 8;
    private final List<SellerListDTO.SellerDTO> items;
    private final String title;
    private final String titleDeepLink;
    private final Map<String, TokenizedTrackingInfo> titleDeepLinkTrackingInfo;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public SellerCarouselDTO(String str, String str2, List<SellerListDTO.SellerDTO> list, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
        this.title = str;
        this.titleDeepLink = str2;
        this.items = list;
        this.titleDeepLinkTrackingInfo = map;
        this.trackingInfo = map2;
    }

    public static /* synthetic */ SellerCarouselDTO copy$default(SellerCarouselDTO sellerCarouselDTO, String str, String str2, List list, Map map, Map map2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = sellerCarouselDTO.title;
        }
        if ((i11 & 2) != 0) {
            str2 = sellerCarouselDTO.titleDeepLink;
        }
        if ((i11 & 4) != 0) {
            list = sellerCarouselDTO.items;
        }
        if ((i11 & 8) != 0) {
            map = sellerCarouselDTO.titleDeepLinkTrackingInfo;
        }
        if ((i11 & 16) != 0) {
            map2 = sellerCarouselDTO.trackingInfo;
        }
        Map map3 = map2;
        List list2 = list;
        return sellerCarouselDTO.copy(str, str2, list2, map, map3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component2, reason: from getter */
    public final String getTitleDeepLink() {
        return this.titleDeepLink;
    }

    public final List<SellerListDTO.SellerDTO> component3() {
        return this.items;
    }

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.titleDeepLinkTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    @NotNull
    public final SellerCarouselDTO copy(String title, String titleDeepLink, List<SellerListDTO.SellerDTO> items, Map<String, TokenizedTrackingInfo> titleDeepLinkTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo) {
        return new SellerCarouselDTO(title, titleDeepLink, items, titleDeepLinkTrackingInfo, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SellerCarouselDTO)) {
            return false;
        }
        SellerCarouselDTO sellerCarouselDTO = (SellerCarouselDTO) other;
        return Intrinsics.d(this.title, sellerCarouselDTO.title) && Intrinsics.d(this.titleDeepLink, sellerCarouselDTO.titleDeepLink) && Intrinsics.d(this.items, sellerCarouselDTO.items) && Intrinsics.d(this.titleDeepLinkTrackingInfo, sellerCarouselDTO.titleDeepLinkTrackingInfo) && Intrinsics.d(this.trackingInfo, sellerCarouselDTO.trackingInfo);
    }

    public final List<SellerListDTO.SellerDTO> getItems() {
        return this.items;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTitleDeepLink() {
        return this.titleDeepLink;
    }

    public final Map<String, TokenizedTrackingInfo> getTitleDeepLinkTrackingInfo() {
        return this.titleDeepLinkTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        String str = this.title;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.titleDeepLink;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<SellerListDTO.SellerDTO> list = this.items;
        int hashCode3 = (hashCode2 + (list == null ? 0 : list.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.titleDeepLinkTrackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        return hashCode4 + (map2 != null ? map2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.title;
        String str2 = this.titleDeepLink;
        List<SellerListDTO.SellerDTO> list = this.items;
        Map<String, TokenizedTrackingInfo> map = this.titleDeepLinkTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        StringBuilder d11 = C3660k.d("SellerCarouselDTO(title=", str, ", titleDeepLink=", str2, ", items=");
        d11.append(list);
        d11.append(", titleDeepLinkTrackingInfo=");
        d11.append(map);
        d11.append(", trackingInfo=");
        return P.f(d11, map2, ")");
    }
}
