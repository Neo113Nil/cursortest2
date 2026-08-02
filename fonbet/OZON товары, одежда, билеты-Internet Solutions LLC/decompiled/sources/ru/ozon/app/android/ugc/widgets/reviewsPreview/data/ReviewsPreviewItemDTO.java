package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewMediaItemDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001Bc\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u000b\u0010%\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010&\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003Js\u0010,\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u000bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001dR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u001fR\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b \u0010!R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#¨\u00063"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewItemDTO;", "", "mediaItem", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "viewedItemAction", "tile", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "bottomText", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getMediaItem", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getViewedItemAction", "getTile", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getBottomText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewItemDTO {
    public static final int $stable = 8;
    private final TextDTO bottomText;
    private final AtomActionDTO clickAction;
    private final CornerRadius cornerRadius;
    private final ImageDTO image;

    @NotNull
    private final ReviewsPreviewMediaItemDTO mediaItem;
    private final ReviewsPreviewTileDTO tile;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AtomActionDTO viewedItemAction;

    public ReviewsPreviewItemDTO(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ReviewsPreviewMediaItemDTO.Image.class), @ProtoOneOfSignature(name = "video", type = ReviewsPreviewMediaItemDTO.Video.class)}) @NotNull @ProtoOneOf(label = "type") ReviewsPreviewMediaItemDTO mediaItem, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReviewsPreviewTileDTO reviewsPreviewTileDTO, Map<String, TokenizedTrackingInfo> map, ImageDTO imageDTO, CornerRadius cornerRadius, TextDTO textDTO) {
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        this.mediaItem = mediaItem;
        this.clickAction = atomActionDTO;
        this.viewedItemAction = atomActionDTO2;
        this.tile = reviewsPreviewTileDTO;
        this.trackingInfo = map;
        this.image = imageDTO;
        this.cornerRadius = cornerRadius;
        this.bottomText = textDTO;
    }

    public static /* synthetic */ ReviewsPreviewItemDTO copy$default(ReviewsPreviewItemDTO reviewsPreviewItemDTO, ReviewsPreviewMediaItemDTO reviewsPreviewMediaItemDTO, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReviewsPreviewTileDTO reviewsPreviewTileDTO, Map map, ImageDTO imageDTO, CornerRadius cornerRadius, TextDTO textDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            reviewsPreviewMediaItemDTO = reviewsPreviewItemDTO.mediaItem;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = reviewsPreviewItemDTO.clickAction;
        }
        if ((i11 & 4) != 0) {
            atomActionDTO2 = reviewsPreviewItemDTO.viewedItemAction;
        }
        if ((i11 & 8) != 0) {
            reviewsPreviewTileDTO = reviewsPreviewItemDTO.tile;
        }
        if ((i11 & 16) != 0) {
            map = reviewsPreviewItemDTO.trackingInfo;
        }
        if ((i11 & 32) != 0) {
            imageDTO = reviewsPreviewItemDTO.image;
        }
        if ((i11 & 64) != 0) {
            cornerRadius = reviewsPreviewItemDTO.cornerRadius;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            textDTO = reviewsPreviewItemDTO.bottomText;
        }
        CornerRadius cornerRadius2 = cornerRadius;
        TextDTO textDTO2 = textDTO;
        Map map2 = map;
        ImageDTO imageDTO2 = imageDTO;
        return reviewsPreviewItemDTO.copy(reviewsPreviewMediaItemDTO, atomActionDTO, atomActionDTO2, reviewsPreviewTileDTO, map2, imageDTO2, cornerRadius2, textDTO2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ReviewsPreviewMediaItemDTO getMediaItem() {
        return this.mediaItem;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    /* renamed from: component3, reason: from getter */
    public final AtomActionDTO getViewedItemAction() {
        return this.viewedItemAction;
    }

    /* renamed from: component4, reason: from getter */
    public final ReviewsPreviewTileDTO getTile() {
        return this.tile;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.trackingInfo;
    }

    /* renamed from: component6, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component7, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component8, reason: from getter */
    public final TextDTO getBottomText() {
        return this.bottomText;
    }

    @NotNull
    public final ReviewsPreviewItemDTO copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = ReviewsPreviewMediaItemDTO.Image.class), @ProtoOneOfSignature(name = "video", type = ReviewsPreviewMediaItemDTO.Video.class)}) @NotNull @ProtoOneOf(label = "type") ReviewsPreviewMediaItemDTO mediaItem, AtomActionDTO clickAction, AtomActionDTO viewedItemAction, ReviewsPreviewTileDTO tile, Map<String, TokenizedTrackingInfo> trackingInfo, ImageDTO image, CornerRadius cornerRadius, TextDTO bottomText) {
        Intrinsics.checkNotNullParameter(mediaItem, "mediaItem");
        return new ReviewsPreviewItemDTO(mediaItem, clickAction, viewedItemAction, tile, trackingInfo, image, cornerRadius, bottomText);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewItemDTO)) {
            return false;
        }
        ReviewsPreviewItemDTO reviewsPreviewItemDTO = (ReviewsPreviewItemDTO) other;
        return Intrinsics.d(this.mediaItem, reviewsPreviewItemDTO.mediaItem) && Intrinsics.d(this.clickAction, reviewsPreviewItemDTO.clickAction) && Intrinsics.d(this.viewedItemAction, reviewsPreviewItemDTO.viewedItemAction) && Intrinsics.d(this.tile, reviewsPreviewItemDTO.tile) && Intrinsics.d(this.trackingInfo, reviewsPreviewItemDTO.trackingInfo) && Intrinsics.d(this.image, reviewsPreviewItemDTO.image) && this.cornerRadius == reviewsPreviewItemDTO.cornerRadius && Intrinsics.d(this.bottomText, reviewsPreviewItemDTO.bottomText);
    }

    public final TextDTO getBottomText() {
        return this.bottomText;
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final ImageDTO getImage() {
        return this.image;
    }

    @NotNull
    public final ReviewsPreviewMediaItemDTO getMediaItem() {
        return this.mediaItem;
    }

    public final ReviewsPreviewTileDTO getTile() {
        return this.tile;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final AtomActionDTO getViewedItemAction() {
        return this.viewedItemAction;
    }

    public int hashCode() {
        int hashCode = this.mediaItem.hashCode() * 31;
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.viewedItemAction;
        int hashCode3 = (hashCode2 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        ReviewsPreviewTileDTO reviewsPreviewTileDTO = this.tile;
        int hashCode4 = (hashCode3 + (reviewsPreviewTileDTO == null ? 0 : reviewsPreviewTileDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        ImageDTO imageDTO = this.image;
        int hashCode6 = (hashCode5 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode7 = (hashCode6 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        TextDTO textDTO = this.bottomText;
        return hashCode7 + (textDTO != null ? textDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewsPreviewItemDTO(mediaItem=" + this.mediaItem + ", clickAction=" + this.clickAction + ", viewedItemAction=" + this.viewedItemAction + ", tile=" + this.tile + ", trackingInfo=" + this.trackingInfo + ", image=" + this.image + ", cornerRadius=" + this.cornerRadius + ", bottomText=" + this.bottomText + ")";
    }
}
