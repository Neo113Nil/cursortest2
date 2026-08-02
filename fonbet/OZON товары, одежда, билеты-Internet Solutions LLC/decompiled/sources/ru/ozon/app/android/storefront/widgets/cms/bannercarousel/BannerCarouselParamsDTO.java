package ru.ozon.app.android.storefront.widgets.cms.bannercarousel;

import Am.C2438a;
import B0.C2454a;
import B90.C2618u;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J-\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0001J\u0013\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0017\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselParamsDTO;", "", "width", "", "height", "items", "", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItemDTO;", "<init>", "(IILjava/util/List;)V", "getWidth", "()I", "getHeight", "getItems", "()Ljava/util/List;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "toString", "", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class BannerCarouselParamsDTO {
    public static final int $stable = 8;
    private final int height;

    @NotNull
    private final List<BannerCarouselItemDTO> items;
    private final int width;

    public BannerCarouselParamsDTO(int i11, int i12, @NotNull List<BannerCarouselItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.width = i11;
        this.height = i12;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ BannerCarouselParamsDTO copy$default(BannerCarouselParamsDTO bannerCarouselParamsDTO, int i11, int i12, List list, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bannerCarouselParamsDTO.width;
        }
        if ((i13 & 2) != 0) {
            i12 = bannerCarouselParamsDTO.height;
        }
        if ((i13 & 4) != 0) {
            list = bannerCarouselParamsDTO.items;
        }
        return bannerCarouselParamsDTO.copy(i11, i12, list);
    }

    /* renamed from: component1, reason: from getter */
    public final int getWidth() {
        return this.width;
    }

    /* renamed from: component2, reason: from getter */
    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final List<BannerCarouselItemDTO> component3() {
        return this.items;
    }

    @NotNull
    public final BannerCarouselParamsDTO copy(int width, int height, @NotNull List<BannerCarouselItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new BannerCarouselParamsDTO(width, height, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerCarouselParamsDTO)) {
            return false;
        }
        BannerCarouselParamsDTO bannerCarouselParamsDTO = (BannerCarouselParamsDTO) other;
        return this.width == bannerCarouselParamsDTO.width && this.height == bannerCarouselParamsDTO.height && Intrinsics.d(this.items, bannerCarouselParamsDTO.items);
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final List<BannerCarouselItemDTO> getItems() {
        return this.items;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return this.items.hashCode() + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        return C2618u.h(C2438a.a("BannerCarouselParamsDTO(width=", i11, ", height=", ", items=", i12), this.items, ")");
    }
}
