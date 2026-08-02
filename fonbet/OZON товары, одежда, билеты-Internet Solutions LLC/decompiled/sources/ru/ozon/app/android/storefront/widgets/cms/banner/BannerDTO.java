package ru.ozon.app.android.storefront.widgets.cms.banner;

import Am.C2438a;
import B0.C2454a;
import Kk.C3532b;
import Pk0.a;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.cms.bannercarousel.BannerCarouselItemDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0016\u001a\u00020\bHÆ\u0003J\t\u0010\u0017\u001a\u00020\bHÆ\u0003J;\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\bHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001b\u001a\u00020\u0003HÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\u0011R\u0011\u0010\t\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/storefront/widgets/cms/banner/BannerDTO;", "", "width", "", "height", "item", "Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItemDTO;", "isRounded", "", "disableVerticalMargins", "<init>", "(IILru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItemDTO;ZZ)V", "getWidth", "()I", "getHeight", "getItem", "()Lru/ozon/app/android/storefront/widgets/cms/bannercarousel/BannerCarouselItemDTO;", "()Z", "getDisableVerticalMargins", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "hashCode", "toString", "", "cms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class BannerDTO {
    public static final int $stable = 8;
    private final boolean disableVerticalMargins;
    private final int height;
    private final boolean isRounded;

    @NotNull
    private final BannerCarouselItemDTO item;
    private final int width;

    public BannerDTO(int i11, int i12, @NotNull BannerCarouselItemDTO item, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.width = i11;
        this.height = i12;
        this.item = item;
        this.isRounded = z11;
        this.disableVerticalMargins = z12;
    }

    public static /* synthetic */ BannerDTO copy$default(BannerDTO bannerDTO, int i11, int i12, BannerCarouselItemDTO bannerCarouselItemDTO, boolean z11, boolean z12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = bannerDTO.width;
        }
        if ((i13 & 2) != 0) {
            i12 = bannerDTO.height;
        }
        if ((i13 & 4) != 0) {
            bannerCarouselItemDTO = bannerDTO.item;
        }
        if ((i13 & 8) != 0) {
            z11 = bannerDTO.isRounded;
        }
        if ((i13 & 16) != 0) {
            z12 = bannerDTO.disableVerticalMargins;
        }
        boolean z13 = z12;
        BannerCarouselItemDTO bannerCarouselItemDTO2 = bannerCarouselItemDTO;
        return bannerDTO.copy(i11, i12, bannerCarouselItemDTO2, z11, z13);
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
    /* renamed from: component3, reason: from getter */
    public final BannerCarouselItemDTO getItem() {
        return this.item;
    }

    /* renamed from: component4, reason: from getter */
    public final boolean getIsRounded() {
        return this.isRounded;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getDisableVerticalMargins() {
        return this.disableVerticalMargins;
    }

    @NotNull
    public final BannerDTO copy(int width, int height, @NotNull BannerCarouselItemDTO item, boolean isRounded, boolean disableVerticalMargins) {
        Intrinsics.checkNotNullParameter(item, "item");
        return new BannerDTO(width, height, item, isRounded, disableVerticalMargins);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BannerDTO)) {
            return false;
        }
        BannerDTO bannerDTO = (BannerDTO) other;
        return this.width == bannerDTO.width && this.height == bannerDTO.height && Intrinsics.d(this.item, bannerDTO.item) && this.isRounded == bannerDTO.isRounded && this.disableVerticalMargins == bannerDTO.disableVerticalMargins;
    }

    public final boolean getDisableVerticalMargins() {
        return this.disableVerticalMargins;
    }

    public final int getHeight() {
        return this.height;
    }

    @NotNull
    public final BannerCarouselItemDTO getItem() {
        return this.item;
    }

    public final int getWidth() {
        return this.width;
    }

    public int hashCode() {
        return Boolean.hashCode(this.disableVerticalMargins) + C3532b.a((this.item.hashCode() + C2454a.a(this.height, Integer.hashCode(this.width) * 31, 31)) * 31, 31, this.isRounded);
    }

    public final boolean isRounded() {
        return this.isRounded;
    }

    @NotNull
    public String toString() {
        int i11 = this.width;
        int i12 = this.height;
        BannerCarouselItemDTO bannerCarouselItemDTO = this.item;
        boolean z11 = this.isRounded;
        boolean z12 = this.disableVerticalMargins;
        StringBuilder a11 = C2438a.a("BannerDTO(width=", i11, ", height=", ", item=", i12);
        a11.append(bannerCarouselItemDTO);
        a11.append(", isRounded=");
        a11.append(z11);
        a11.append(", disableVerticalMargins=");
        return a.a(")", a11, z12);
    }

    public /* synthetic */ BannerDTO(int i11, int i12, BannerCarouselItemDTO bannerCarouselItemDTO, boolean z11, boolean z12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(i11, i12, bannerCarouselItemDTO, (i13 & 8) != 0 ? false : z11, (i13 & 16) != 0 ? false : z12);
    }
}
