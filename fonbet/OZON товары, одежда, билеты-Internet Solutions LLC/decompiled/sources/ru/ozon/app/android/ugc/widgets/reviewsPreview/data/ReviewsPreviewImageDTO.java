package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import Nh.a;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b,\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001B§\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\u0004\b\u001b\u0010\u001cJ\t\u00105\u001a\u00020\u0003HÆ\u0003J\t\u00106\u001a\u00020\u0005HÆ\u0003J\u000b\u00107\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u00108\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010;\u001a\u0004\u0018\u00010\u000eHÆ\u0003J\u0017\u0010<\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u0017\u0010=\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010HÆ\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0016HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010A\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\u0011HÆ\u0003JÅ\u0001\u0010C\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00102\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0011HÆ\u0001J\u0013\u0010D\u001a\u00020E2\b\u0010F\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010G\u001a\u00020\u0003HÖ\u0001J\t\u0010H\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b%\u0010$R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u001f\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b-\u0010 R\u0013\u0010\u0015\u001a\u0004\u0018\u00010\u0016¢\u0006\b\n\u0000\u001a\u0004\b.\u0010/R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b0\u00101R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b2\u00101R\u0013\u0010\u001a\u001a\u0004\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00104¨\u0006I"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewImageDTO;", "", "index", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "playIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "viewedItemAction", "tile", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "fullVideoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "itemTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "cornerImage", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "itemSpacing", "widgetBackgroundColor", "<init>", "(ILru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;)V", "getIndex", "()I", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getViewedItemAction", "getTile", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "getFullVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getItemTrackingInfo", "()Ljava/util/Map;", "getTrackingInfo", "getCornerImage", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getItemSpacing", "getWidgetBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewImageDTO {
    public static final int $stable = 8;
    private final AtomActionDTO clickAction;
    private final ImageDTO cornerImage;
    private final CornerRadius cornerRadius;
    private final PreloadVideoInfo fullVideoInfo;
    private final Paddings horizontalPadding;

    @NotNull
    private final ImageDTO image;
    private final int index;
    private final Paddings itemSpacing;
    private final Map<String, TokenizedTrackingInfo> itemTrackingInfo;
    private final IconDTO playIcon;
    private final ReviewsPreviewTileDTO tile;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final AtomActionDTO viewedItemAction;
    private final String widgetBackgroundColor;

    public ReviewsPreviewImageDTO(int i11, @NotNull ImageDTO image, IconDTO iconDTO, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReviewsPreviewTileDTO reviewsPreviewTileDTO, PreloadVideoInfo preloadVideoInfo, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, ImageDTO imageDTO, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, String str) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.index = i11;
        this.image = image;
        this.playIcon = iconDTO;
        this.clickAction = atomActionDTO;
        this.viewedItemAction = atomActionDTO2;
        this.tile = reviewsPreviewTileDTO;
        this.fullVideoInfo = preloadVideoInfo;
        this.itemTrackingInfo = map;
        this.trackingInfo = map2;
        this.cornerImage = imageDTO;
        this.cornerRadius = cornerRadius;
        this.horizontalPadding = paddings;
        this.itemSpacing = paddings2;
        this.widgetBackgroundColor = str;
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    /* renamed from: component10, reason: from getter */
    public final ImageDTO getCornerImage() {
        return this.cornerImage;
    }

    /* renamed from: component11, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component12, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component13, reason: from getter */
    public final Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    /* renamed from: component14, reason: from getter */
    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getPlayIcon() {
        return this.playIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    /* renamed from: component5, reason: from getter */
    public final AtomActionDTO getViewedItemAction() {
        return this.viewedItemAction;
    }

    /* renamed from: component6, reason: from getter */
    public final ReviewsPreviewTileDTO getTile() {
        return this.tile;
    }

    /* renamed from: component7, reason: from getter */
    public final PreloadVideoInfo getFullVideoInfo() {
        return this.fullVideoInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component8() {
        return this.itemTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.trackingInfo;
    }

    @NotNull
    public final ReviewsPreviewImageDTO copy(int index, @NotNull ImageDTO image, IconDTO playIcon, AtomActionDTO clickAction, AtomActionDTO viewedItemAction, ReviewsPreviewTileDTO tile, PreloadVideoInfo fullVideoInfo, Map<String, TokenizedTrackingInfo> itemTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo, ImageDTO cornerImage, CornerRadius cornerRadius, Paddings horizontalPadding, Paddings itemSpacing, String widgetBackgroundColor) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ReviewsPreviewImageDTO(index, image, playIcon, clickAction, viewedItemAction, tile, fullVideoInfo, itemTrackingInfo, trackingInfo, cornerImage, cornerRadius, horizontalPadding, itemSpacing, widgetBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewImageDTO)) {
            return false;
        }
        ReviewsPreviewImageDTO reviewsPreviewImageDTO = (ReviewsPreviewImageDTO) other;
        return this.index == reviewsPreviewImageDTO.index && Intrinsics.d(this.image, reviewsPreviewImageDTO.image) && Intrinsics.d(this.playIcon, reviewsPreviewImageDTO.playIcon) && Intrinsics.d(this.clickAction, reviewsPreviewImageDTO.clickAction) && Intrinsics.d(this.viewedItemAction, reviewsPreviewImageDTO.viewedItemAction) && Intrinsics.d(this.tile, reviewsPreviewImageDTO.tile) && Intrinsics.d(this.fullVideoInfo, reviewsPreviewImageDTO.fullVideoInfo) && Intrinsics.d(this.itemTrackingInfo, reviewsPreviewImageDTO.itemTrackingInfo) && Intrinsics.d(this.trackingInfo, reviewsPreviewImageDTO.trackingInfo) && Intrinsics.d(this.cornerImage, reviewsPreviewImageDTO.cornerImage) && this.cornerRadius == reviewsPreviewImageDTO.cornerRadius && this.horizontalPadding == reviewsPreviewImageDTO.horizontalPadding && this.itemSpacing == reviewsPreviewImageDTO.itemSpacing && Intrinsics.d(this.widgetBackgroundColor, reviewsPreviewImageDTO.widgetBackgroundColor);
    }

    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    public final ImageDTO getCornerImage() {
        return this.cornerImage;
    }

    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final PreloadVideoInfo getFullVideoInfo() {
        return this.fullVideoInfo;
    }

    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final int getIndex() {
        return this.index;
    }

    public final Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    public final Map<String, TokenizedTrackingInfo> getItemTrackingInfo() {
        return this.itemTrackingInfo;
    }

    public final IconDTO getPlayIcon() {
        return this.playIcon;
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

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        int b11 = a.b(this.image, Integer.hashCode(this.index) * 31, 31);
        IconDTO iconDTO = this.playIcon;
        int hashCode = (b11 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.viewedItemAction;
        int hashCode3 = (hashCode2 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        ReviewsPreviewTileDTO reviewsPreviewTileDTO = this.tile;
        int hashCode4 = (hashCode3 + (reviewsPreviewTileDTO == null ? 0 : reviewsPreviewTileDTO.hashCode())) * 31;
        PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
        int hashCode5 = (hashCode4 + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.itemTrackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.trackingInfo;
        int hashCode7 = (hashCode6 + (map2 == null ? 0 : map2.hashCode())) * 31;
        ImageDTO imageDTO = this.cornerImage;
        int hashCode8 = (hashCode7 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode9 = (hashCode8 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode10 = (hashCode9 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.itemSpacing;
        int hashCode11 = (hashCode10 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        String str = this.widgetBackgroundColor;
        return hashCode11 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewsPreviewImageDTO(index=" + this.index + ", image=" + this.image + ", playIcon=" + this.playIcon + ", clickAction=" + this.clickAction + ", viewedItemAction=" + this.viewedItemAction + ", tile=" + this.tile + ", fullVideoInfo=" + this.fullVideoInfo + ", itemTrackingInfo=" + this.itemTrackingInfo + ", trackingInfo=" + this.trackingInfo + ", cornerImage=" + this.cornerImage + ", cornerRadius=" + this.cornerRadius + ", horizontalPadding=" + this.horizontalPadding + ", itemSpacing=" + this.itemSpacing + ", widgetBackgroundColor=" + this.widgetBackgroundColor + ")";
    }
}
