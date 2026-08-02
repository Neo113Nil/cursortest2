package ru.ozon.app.android.storefront.widgets.placementSlider.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u001f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J*\u0010\u0010\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0002\u0010\u0011J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;", "", "scrollInterval", "", "items", "", "Lru/ozon/app/android/storefront/widgets/placementSlider/data/BannerDTO;", "<init>", "(Ljava/lang/Long;Ljava/util/List;)V", "getScrollInterval", "()Ljava/lang/Long;", "Ljava/lang/Long;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/util/List;)Lru/ozon/app/android/storefront/widgets/placementSlider/data/PromoPlacementDTO;", "equals", "", "other", "hashCode", "", "toString", "", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class PromoPlacementDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<BannerDTO> items;
    private final Long scrollInterval;

    public PromoPlacementDTO(Long l11, @NotNull List<BannerDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.scrollInterval = l11;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ PromoPlacementDTO copy$default(PromoPlacementDTO promoPlacementDTO, Long l11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            l11 = promoPlacementDTO.scrollInterval;
        }
        if ((i11 & 2) != 0) {
            list = promoPlacementDTO.items;
        }
        return promoPlacementDTO.copy(l11, list);
    }

    /* renamed from: component1, reason: from getter */
    public final Long getScrollInterval() {
        return this.scrollInterval;
    }

    @NotNull
    public final List<BannerDTO> component2() {
        return this.items;
    }

    @NotNull
    public final PromoPlacementDTO copy(Long scrollInterval, @NotNull List<BannerDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new PromoPlacementDTO(scrollInterval, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoPlacementDTO)) {
            return false;
        }
        PromoPlacementDTO promoPlacementDTO = (PromoPlacementDTO) other;
        return Intrinsics.d(this.scrollInterval, promoPlacementDTO.scrollInterval) && Intrinsics.d(this.items, promoPlacementDTO.items);
    }

    @NotNull
    public final List<BannerDTO> getItems() {
        return this.items;
    }

    public final Long getScrollInterval() {
        return this.scrollInterval;
    }

    public int hashCode() {
        Long l11 = this.scrollInterval;
        return this.items.hashCode() + ((l11 == null ? 0 : l11.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "PromoPlacementDTO(scrollInterval=" + this.scrollInterval + ", items=" + this.items + ")";
    }
}
