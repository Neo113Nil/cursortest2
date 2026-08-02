package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import G.g;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeDTO;
import ru.ozon.app.android.storefront.data.tiles.tilegrid2.TileImageItemDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001BA\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u000e\b\u0001\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\t0\bHÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u000bHÆ\u0003JI\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u000e\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u001e2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0017\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageDTO;", "", "imageRatio", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "leftBottomBadgeV2", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "secondLeftBottomBadgeV2", "items", "", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO;", "blurItem", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "<init>", "(Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;)V", "getImageRatio", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/ImageRatio;", "getLeftBottomBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getSecondLeftBottomBadgeV2", "getItems", "()Ljava/util/List;", "getBlurItem", "()Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileImageDTO {
    private final BlurMoleculeDTO blurItem;
    private final ImageRatio imageRatio;

    @NotNull
    private final List<TileImageItemDTO> items;
    private final BadgeDTO leftBottomBadgeV2;
    private final BadgeDTO secondLeftBottomBadgeV2;

    /* JADX WARN: Multi-variable type inference failed */
    public TileImageDTO(ImageRatio imageRatio, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = TileImageItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = TileImageItemDTO.VideoDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TileImageItemDTO> items, BlurMoleculeDTO blurMoleculeDTO) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.imageRatio = imageRatio;
        this.leftBottomBadgeV2 = badgeDTO;
        this.secondLeftBottomBadgeV2 = badgeDTO2;
        this.items = items;
        this.blurItem = blurMoleculeDTO;
    }

    public static /* synthetic */ TileImageDTO copy$default(TileImageDTO tileImageDTO, ImageRatio imageRatio, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, List list, BlurMoleculeDTO blurMoleculeDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageRatio = tileImageDTO.imageRatio;
        }
        if ((i11 & 2) != 0) {
            badgeDTO = tileImageDTO.leftBottomBadgeV2;
        }
        if ((i11 & 4) != 0) {
            badgeDTO2 = tileImageDTO.secondLeftBottomBadgeV2;
        }
        if ((i11 & 8) != 0) {
            list = tileImageDTO.items;
        }
        if ((i11 & 16) != 0) {
            blurMoleculeDTO = tileImageDTO.blurItem;
        }
        BlurMoleculeDTO blurMoleculeDTO2 = blurMoleculeDTO;
        BadgeDTO badgeDTO3 = badgeDTO2;
        return tileImageDTO.copy(imageRatio, badgeDTO, badgeDTO3, list, blurMoleculeDTO2);
    }

    /* renamed from: component1, reason: from getter */
    public final ImageRatio getImageRatio() {
        return this.imageRatio;
    }

    /* renamed from: component2, reason: from getter */
    public final BadgeDTO getLeftBottomBadgeV2() {
        return this.leftBottomBadgeV2;
    }

    /* renamed from: component3, reason: from getter */
    public final BadgeDTO getSecondLeftBottomBadgeV2() {
        return this.secondLeftBottomBadgeV2;
    }

    @NotNull
    public final List<TileImageItemDTO> component4() {
        return this.items;
    }

    /* renamed from: component5, reason: from getter */
    public final BlurMoleculeDTO getBlurItem() {
        return this.blurItem;
    }

    @NotNull
    public final TileImageDTO copy(ImageRatio imageRatio, BadgeDTO leftBottomBadgeV2, BadgeDTO secondLeftBottomBadgeV2, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = TileImageItemDTO.ImageDTO.class), @ProtoOneOfSignature(name = "video", type = TileImageItemDTO.VideoDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends TileImageItemDTO> items, BlurMoleculeDTO blurItem) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TileImageDTO(imageRatio, leftBottomBadgeV2, secondLeftBottomBadgeV2, items, blurItem);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileImageDTO)) {
            return false;
        }
        TileImageDTO tileImageDTO = (TileImageDTO) other;
        return this.imageRatio == tileImageDTO.imageRatio && Intrinsics.d(this.leftBottomBadgeV2, tileImageDTO.leftBottomBadgeV2) && Intrinsics.d(this.secondLeftBottomBadgeV2, tileImageDTO.secondLeftBottomBadgeV2) && Intrinsics.d(this.items, tileImageDTO.items) && Intrinsics.d(this.blurItem, tileImageDTO.blurItem);
    }

    public final BlurMoleculeDTO getBlurItem() {
        return this.blurItem;
    }

    public final ImageRatio getImageRatio() {
        return this.imageRatio;
    }

    @NotNull
    public final List<TileImageItemDTO> getItems() {
        return this.items;
    }

    public final BadgeDTO getLeftBottomBadgeV2() {
        return this.leftBottomBadgeV2;
    }

    public final BadgeDTO getSecondLeftBottomBadgeV2() {
        return this.secondLeftBottomBadgeV2;
    }

    public int hashCode() {
        ImageRatio imageRatio = this.imageRatio;
        int hashCode = (imageRatio == null ? 0 : imageRatio.hashCode()) * 31;
        BadgeDTO badgeDTO = this.leftBottomBadgeV2;
        int hashCode2 = (hashCode + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
        BadgeDTO badgeDTO2 = this.secondLeftBottomBadgeV2;
        int b11 = g.b((hashCode2 + (badgeDTO2 == null ? 0 : badgeDTO2.hashCode())) * 31, 31, this.items);
        BlurMoleculeDTO blurMoleculeDTO = this.blurItem;
        return b11 + (blurMoleculeDTO != null ? blurMoleculeDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TileImageDTO(imageRatio=" + this.imageRatio + ", leftBottomBadgeV2=" + this.leftBottomBadgeV2 + ", secondLeftBottomBadgeV2=" + this.secondLeftBottomBadgeV2 + ", items=" + this.items + ", blurItem=" + this.blurItem + ")";
    }

    public /* synthetic */ TileImageDTO(ImageRatio imageRatio, BadgeDTO badgeDTO, BadgeDTO badgeDTO2, List list, BlurMoleculeDTO blurMoleculeDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? ImageRatio.IMAGE_RATIO_1_1 : imageRatio, badgeDTO, badgeDTO2, list, blurMoleculeDTO);
    }
}
