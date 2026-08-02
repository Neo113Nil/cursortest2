package ru.ozon.app.android.marketing.widgets.sisbrandfavorite.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.seller.molecule.sisbrandfavorite.data.SisBrandFavoriteButton;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/SisBrandFavoriteDTO;", "", "favoriteButton", "Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "options", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "dynamicOnScrollColors", "Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;", "dynamicOnScrollFavoriteColors", "<init>", "(Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;)V", "getFavoriteButton", "()Lru/ozon/app/android/seller/molecule/sisbrandfavorite/data/SisBrandFavoriteButton;", "getOptions", "()Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/Options;", "getDynamicOnScrollColors", "()Lru/ozon/app/android/marketing/widgets/sisbrandfavorite/data/DynamicOnScrollColors;", "getDynamicOnScrollFavoriteColors", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class SisBrandFavoriteDTO {
    public static final int $stable = 8;
    private final DynamicOnScrollColors dynamicOnScrollColors;
    private final DynamicOnScrollColors dynamicOnScrollFavoriteColors;

    @NotNull
    private final SisBrandFavoriteButton favoriteButton;
    private final Options options;

    public SisBrandFavoriteDTO(@NotNull SisBrandFavoriteButton favoriteButton, Options options, DynamicOnScrollColors dynamicOnScrollColors, DynamicOnScrollColors dynamicOnScrollColors2) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        this.favoriteButton = favoriteButton;
        this.options = options;
        this.dynamicOnScrollColors = dynamicOnScrollColors;
        this.dynamicOnScrollFavoriteColors = dynamicOnScrollColors2;
    }

    public static /* synthetic */ SisBrandFavoriteDTO copy$default(SisBrandFavoriteDTO sisBrandFavoriteDTO, SisBrandFavoriteButton sisBrandFavoriteButton, Options options, DynamicOnScrollColors dynamicOnScrollColors, DynamicOnScrollColors dynamicOnScrollColors2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            sisBrandFavoriteButton = sisBrandFavoriteDTO.favoriteButton;
        }
        if ((i11 & 2) != 0) {
            options = sisBrandFavoriteDTO.options;
        }
        if ((i11 & 4) != 0) {
            dynamicOnScrollColors = sisBrandFavoriteDTO.dynamicOnScrollColors;
        }
        if ((i11 & 8) != 0) {
            dynamicOnScrollColors2 = sisBrandFavoriteDTO.dynamicOnScrollFavoriteColors;
        }
        return sisBrandFavoriteDTO.copy(sisBrandFavoriteButton, options, dynamicOnScrollColors, dynamicOnScrollColors2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    /* renamed from: component2, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component3, reason: from getter */
    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    /* renamed from: component4, reason: from getter */
    public final DynamicOnScrollColors getDynamicOnScrollFavoriteColors() {
        return this.dynamicOnScrollFavoriteColors;
    }

    @NotNull
    public final SisBrandFavoriteDTO copy(@NotNull SisBrandFavoriteButton favoriteButton, Options options, DynamicOnScrollColors dynamicOnScrollColors, DynamicOnScrollColors dynamicOnScrollFavoriteColors) {
        Intrinsics.checkNotNullParameter(favoriteButton, "favoriteButton");
        return new SisBrandFavoriteDTO(favoriteButton, options, dynamicOnScrollColors, dynamicOnScrollFavoriteColors);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SisBrandFavoriteDTO)) {
            return false;
        }
        SisBrandFavoriteDTO sisBrandFavoriteDTO = (SisBrandFavoriteDTO) other;
        return Intrinsics.d(this.favoriteButton, sisBrandFavoriteDTO.favoriteButton) && Intrinsics.d(this.options, sisBrandFavoriteDTO.options) && Intrinsics.d(this.dynamicOnScrollColors, sisBrandFavoriteDTO.dynamicOnScrollColors) && Intrinsics.d(this.dynamicOnScrollFavoriteColors, sisBrandFavoriteDTO.dynamicOnScrollFavoriteColors);
    }

    public final DynamicOnScrollColors getDynamicOnScrollColors() {
        return this.dynamicOnScrollColors;
    }

    public final DynamicOnScrollColors getDynamicOnScrollFavoriteColors() {
        return this.dynamicOnScrollFavoriteColors;
    }

    @NotNull
    public final SisBrandFavoriteButton getFavoriteButton() {
        return this.favoriteButton;
    }

    public final Options getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.favoriteButton.hashCode() * 31;
        Options options = this.options;
        int hashCode2 = (hashCode + (options == null ? 0 : options.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors = this.dynamicOnScrollColors;
        int hashCode3 = (hashCode2 + (dynamicOnScrollColors == null ? 0 : dynamicOnScrollColors.hashCode())) * 31;
        DynamicOnScrollColors dynamicOnScrollColors2 = this.dynamicOnScrollFavoriteColors;
        return hashCode3 + (dynamicOnScrollColors2 != null ? dynamicOnScrollColors2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SisBrandFavoriteDTO(favoriteButton=" + this.favoriteButton + ", options=" + this.options + ", dynamicOnScrollColors=" + this.dynamicOnScrollColors + ", dynamicOnScrollFavoriteColors=" + this.dynamicOnScrollFavoriteColors + ")";
    }
}
