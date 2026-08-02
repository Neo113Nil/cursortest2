package ru.ozon.app.android.returns.creation.widgets.activeDeliveries.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u0010\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u0010J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001c\u001a\u00020\u000bHÆ\u0003JF\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020\u00052\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\tHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u0004\u0010\u0010R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006$"}, d2 = {"Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ElementDTO;", "", "cell", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "isActive", "", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "backgroundColor", "", "itemImages", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "<init>", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;)V", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBackgroundColor", "()Ljava/lang/String;", "getItemImages", "()Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/Boolean;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/lang/String;Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;)Lru/ozon/app/android/returns/creation/widgets/activeDeliveries/data/ElementDTO;", "equals", "other", "hashCode", "", "toString", "creation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ElementDTO {
    public static final int $stable = ImagesDTO.$stable | CellDTO.$stable;
    private final String backgroundColor;
    private final BadgeDTO badge;

    @NotNull
    private final CellDTO cell;
    private final Boolean isActive;

    @NotNull
    private final ImagesDTO itemImages;

    public ElementDTO(@NotNull CellDTO cell, Boolean bool, BadgeDTO badgeDTO, String str, @NotNull ImagesDTO itemImages) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(itemImages, "itemImages");
        this.cell = cell;
        this.isActive = bool;
        this.badge = badgeDTO;
        this.backgroundColor = str;
        this.itemImages = itemImages;
    }

    public static /* synthetic */ ElementDTO copy$default(ElementDTO elementDTO, CellDTO cellDTO, Boolean bool, BadgeDTO badgeDTO, String str, ImagesDTO imagesDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            cellDTO = elementDTO.cell;
        }
        if ((i11 & 2) != 0) {
            bool = elementDTO.isActive;
        }
        if ((i11 & 4) != 0) {
            badgeDTO = elementDTO.badge;
        }
        if ((i11 & 8) != 0) {
            str = elementDTO.backgroundColor;
        }
        if ((i11 & 16) != 0) {
            imagesDTO = elementDTO.itemImages;
        }
        ImagesDTO imagesDTO2 = imagesDTO;
        BadgeDTO badgeDTO2 = badgeDTO;
        return elementDTO.copy(cellDTO, bool, badgeDTO2, str, imagesDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final CellDTO getCell() {
        return this.cell;
    }

    /* renamed from: component2, reason: from getter */
    public final Boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getBadge() {
        return this.badge;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final ImagesDTO getItemImages() {
        return this.itemImages;
    }

    @NotNull
    public final ElementDTO copy(@NotNull CellDTO cell, Boolean isActive, BadgeDTO badge, String backgroundColor, @NotNull ImagesDTO itemImages) {
        Intrinsics.checkNotNullParameter(cell, "cell");
        Intrinsics.checkNotNullParameter(itemImages, "itemImages");
        return new ElementDTO(cell, isActive, badge, backgroundColor, itemImages);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ElementDTO)) {
            return false;
        }
        ElementDTO elementDTO = (ElementDTO) other;
        return Intrinsics.d(this.cell, elementDTO.cell) && Intrinsics.d(this.isActive, elementDTO.isActive) && Intrinsics.d(this.badge, elementDTO.badge) && Intrinsics.d(this.backgroundColor, elementDTO.backgroundColor) && Intrinsics.d(this.itemImages, elementDTO.itemImages);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final BadgeDTO getBadge() {
        return this.badge;
    }

    @NotNull
    public final CellDTO getCell() {
        return this.cell;
    }

    @NotNull
    public final ImagesDTO getItemImages() {
        return this.itemImages;
    }

    public int hashCode() {
        int hashCode = this.cell.hashCode() * 31;
        Boolean bool = this.isActive;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        BadgeDTO badgeDTO = this.badge;
        int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        String str = this.backgroundColor;
        return this.itemImages.hashCode() + ((hashCode3 + (str != null ? str.hashCode() : 0)) * 31);
    }

    public final Boolean isActive() {
        return this.isActive;
    }

    @NotNull
    public String toString() {
        return "ElementDTO(cell=" + this.cell + ", isActive=" + this.isActive + ", badge=" + this.badge + ", backgroundColor=" + this.backgroundColor + ", itemImages=" + this.itemImages + ")";
    }
}
