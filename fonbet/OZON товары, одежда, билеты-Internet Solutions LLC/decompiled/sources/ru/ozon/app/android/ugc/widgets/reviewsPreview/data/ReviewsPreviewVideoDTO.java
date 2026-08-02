package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import B3.p;
import G.g;
import Nh.a;
import Tl.b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.ugc.widgets.reviewsPreview.data.ReviewsPreviewDTO;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b2\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001Bá\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\u0014\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u001d\u001a\u00020\u001e¢\u0006\u0004\b\u001f\u0010 J\t\u0010=\u001a\u00020\u0003HÆ\u0003J\t\u0010>\u001a\u00020\u0005HÆ\u0003J\t\u0010?\u001a\u00020\u0007HÆ\u0003J\u000b\u0010@\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010A\u001a\u00020\nHÆ\u0003J\u000b\u0010B\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010C\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u000fHÆ\u0003J\u0017\u0010E\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u0010F\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u0010G\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u0017\u0010H\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003J\u000b\u0010I\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010J\u001a\u0004\u0018\u00010\u0018HÆ\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\u001aHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\nHÆ\u0003J\t\u0010N\u001a\u00020\u001eHÆ\u0003J\u0087\u0002\u0010O\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\u0016\b\u0002\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\n2\b\b\u0002\u0010\u001d\u001a\u00020\u001eHÆ\u0001J\u0013\u0010P\u001a\u00020Q2\b\u0010R\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010S\u001a\u00020\u0003HÖ\u0001J\t\u0010T\u001a\u00020\nHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b'\u0010&R\u0011\u0010\t\u001a\u00020\n¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0013\u0010\r\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b,\u0010+R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001f\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u001f\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b1\u00100R\u001f\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b2\u00100R\u001f\u0010\u0015\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\b\n\u0000\u001a\u0004\b3\u00100R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b4\u0010$R\u0013\u0010\u0017\u001a\u0004\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u0019\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b7\u00108R\u0013\u0010\u001b\u001a\u0004\u0018\u00010\u001a¢\u0006\b\n\u0000\u001a\u0004\b9\u00108R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b:\u0010)R\u0011\u0010\u001d\u001a\u00020\u001e¢\u0006\b\n\u0000\u001a\u0004\b;\u0010<¨\u0006U"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewVideoDTO;", "", "index", "", "preview", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "fullVideoInfo", "paranjaColor", "", "clickAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "viewedItemAction", "tile", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "videoStartTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoEndTrackingInfo", "itemTrackingInfo", "trackingInfo", "cornerImage", "cornerRadius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "horizontalPadding", "Lru/ozon/uni/atoms/data/common/Paddings;", "itemSpacing", "widgetBackgroundColor", "playbackType", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "<init>", "(ILru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Ljava/lang/String;Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;)V", "getIndex", "()I", "getPreview", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getFullVideoInfo", "getParanjaColor", "()Ljava/lang/String;", "getClickAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getViewedItemAction", "getTile", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewTileDTO;", "getVideoStartTrackingInfo", "()Ljava/util/Map;", "getVideoEndTrackingInfo", "getItemTrackingInfo", "getTrackingInfo", "getCornerImage", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getHorizontalPadding", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getItemSpacing", "getWidgetBackgroundColor", "getPlaybackType", "()Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewDTO$PlaybackType;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "copy", "equals", "", "other", "hashCode", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsPreviewVideoDTO {
    public static final int $stable = 8;
    private final AtomActionDTO clickAction;
    private final ImageDTO cornerImage;
    private final CornerRadius cornerRadius;
    private final PreloadVideoInfo fullVideoInfo;
    private final Paddings horizontalPadding;
    private final int index;
    private final Paddings itemSpacing;
    private final Map<String, TokenizedTrackingInfo> itemTrackingInfo;

    @NotNull
    private final String paranjaColor;

    @NotNull
    private final ReviewsPreviewDTO.PlaybackType playbackType;

    @NotNull
    private final ImageDTO preview;
    private final ReviewsPreviewTileDTO tile;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;
    private final Map<String, TokenizedTrackingInfo> videoEndTrackingInfo;

    @NotNull
    private final PreloadVideoInfo videoInfo;
    private final Map<String, TokenizedTrackingInfo> videoStartTrackingInfo;
    private final AtomActionDTO viewedItemAction;
    private final String widgetBackgroundColor;

    public ReviewsPreviewVideoDTO(int i11, @NotNull ImageDTO preview, @NotNull PreloadVideoInfo videoInfo, PreloadVideoInfo preloadVideoInfo, @NotNull String paranjaColor, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReviewsPreviewTileDTO reviewsPreviewTileDTO, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, ImageDTO imageDTO, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, String str, @NotNull ReviewsPreviewDTO.PlaybackType playbackType) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
        Intrinsics.checkNotNullParameter(paranjaColor, "paranjaColor");
        Intrinsics.checkNotNullParameter(playbackType, "playbackType");
        this.index = i11;
        this.preview = preview;
        this.videoInfo = videoInfo;
        this.fullVideoInfo = preloadVideoInfo;
        this.paranjaColor = paranjaColor;
        this.clickAction = atomActionDTO;
        this.viewedItemAction = atomActionDTO2;
        this.tile = reviewsPreviewTileDTO;
        this.videoStartTrackingInfo = map;
        this.videoEndTrackingInfo = map2;
        this.itemTrackingInfo = map3;
        this.trackingInfo = map4;
        this.cornerImage = imageDTO;
        this.cornerRadius = cornerRadius;
        this.horizontalPadding = paddings;
        this.itemSpacing = paddings2;
        this.widgetBackgroundColor = str;
        this.playbackType = playbackType;
    }

    public static /* synthetic */ ReviewsPreviewVideoDTO copy$default(ReviewsPreviewVideoDTO reviewsPreviewVideoDTO, int i11, ImageDTO imageDTO, PreloadVideoInfo preloadVideoInfo, PreloadVideoInfo preloadVideoInfo2, String str, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, ReviewsPreviewTileDTO reviewsPreviewTileDTO, Map map, Map map2, Map map3, Map map4, ImageDTO imageDTO2, CornerRadius cornerRadius, Paddings paddings, Paddings paddings2, String str2, ReviewsPreviewDTO.PlaybackType playbackType, int i12, Object obj) {
        ReviewsPreviewDTO.PlaybackType playbackType2;
        String str3;
        int i13 = (i12 & 1) != 0 ? reviewsPreviewVideoDTO.index : i11;
        ImageDTO imageDTO3 = (i12 & 2) != 0 ? reviewsPreviewVideoDTO.preview : imageDTO;
        PreloadVideoInfo preloadVideoInfo3 = (i12 & 4) != 0 ? reviewsPreviewVideoDTO.videoInfo : preloadVideoInfo;
        PreloadVideoInfo preloadVideoInfo4 = (i12 & 8) != 0 ? reviewsPreviewVideoDTO.fullVideoInfo : preloadVideoInfo2;
        String str4 = (i12 & 16) != 0 ? reviewsPreviewVideoDTO.paranjaColor : str;
        AtomActionDTO atomActionDTO3 = (i12 & 32) != 0 ? reviewsPreviewVideoDTO.clickAction : atomActionDTO;
        AtomActionDTO atomActionDTO4 = (i12 & 64) != 0 ? reviewsPreviewVideoDTO.viewedItemAction : atomActionDTO2;
        ReviewsPreviewTileDTO reviewsPreviewTileDTO2 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? reviewsPreviewVideoDTO.tile : reviewsPreviewTileDTO;
        Map map5 = (i12 & 256) != 0 ? reviewsPreviewVideoDTO.videoStartTrackingInfo : map;
        Map map6 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? reviewsPreviewVideoDTO.videoEndTrackingInfo : map2;
        Map map7 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? reviewsPreviewVideoDTO.itemTrackingInfo : map3;
        Map map8 = (i12 & 2048) != 0 ? reviewsPreviewVideoDTO.trackingInfo : map4;
        ImageDTO imageDTO4 = (i12 & 4096) != 0 ? reviewsPreviewVideoDTO.cornerImage : imageDTO2;
        CornerRadius cornerRadius2 = (i12 & 8192) != 0 ? reviewsPreviewVideoDTO.cornerRadius : cornerRadius;
        int i14 = i13;
        Paddings paddings3 = (i12 & 16384) != 0 ? reviewsPreviewVideoDTO.horizontalPadding : paddings;
        Paddings paddings4 = (i12 & 32768) != 0 ? reviewsPreviewVideoDTO.itemSpacing : paddings2;
        String str5 = (i12 & 65536) != 0 ? reviewsPreviewVideoDTO.widgetBackgroundColor : str2;
        if ((i12 & 131072) != 0) {
            str3 = str5;
            playbackType2 = reviewsPreviewVideoDTO.playbackType;
        } else {
            playbackType2 = playbackType;
            str3 = str5;
        }
        return reviewsPreviewVideoDTO.copy(i14, imageDTO3, preloadVideoInfo3, preloadVideoInfo4, str4, atomActionDTO3, atomActionDTO4, reviewsPreviewTileDTO2, map5, map6, map7, map8, imageDTO4, cornerRadius2, paddings3, paddings4, str3, playbackType2);
    }

    /* renamed from: component1, reason: from getter */
    public final int getIndex() {
        return this.index;
    }

    public final Map<String, TokenizedTrackingInfo> component10() {
        return this.videoEndTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component11() {
        return this.itemTrackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> component12() {
        return this.trackingInfo;
    }

    /* renamed from: component13, reason: from getter */
    public final ImageDTO getCornerImage() {
        return this.cornerImage;
    }

    /* renamed from: component14, reason: from getter */
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    /* renamed from: component15, reason: from getter */
    public final Paddings getHorizontalPadding() {
        return this.horizontalPadding;
    }

    /* renamed from: component16, reason: from getter */
    public final Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    /* renamed from: component17, reason: from getter */
    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    @NotNull
    /* renamed from: component18, reason: from getter */
    public final ReviewsPreviewDTO.PlaybackType getPlaybackType() {
        return this.playbackType;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ImageDTO getPreview() {
        return this.preview;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final PreloadVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    /* renamed from: component4, reason: from getter */
    public final PreloadVideoInfo getFullVideoInfo() {
        return this.fullVideoInfo;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final String getParanjaColor() {
        return this.paranjaColor;
    }

    /* renamed from: component6, reason: from getter */
    public final AtomActionDTO getClickAction() {
        return this.clickAction;
    }

    /* renamed from: component7, reason: from getter */
    public final AtomActionDTO getViewedItemAction() {
        return this.viewedItemAction;
    }

    /* renamed from: component8, reason: from getter */
    public final ReviewsPreviewTileDTO getTile() {
        return this.tile;
    }

    public final Map<String, TokenizedTrackingInfo> component9() {
        return this.videoStartTrackingInfo;
    }

    @NotNull
    public final ReviewsPreviewVideoDTO copy(int index, @NotNull ImageDTO preview, @NotNull PreloadVideoInfo videoInfo, PreloadVideoInfo fullVideoInfo, @NotNull String paranjaColor, AtomActionDTO clickAction, AtomActionDTO viewedItemAction, ReviewsPreviewTileDTO tile, Map<String, TokenizedTrackingInfo> videoStartTrackingInfo, Map<String, TokenizedTrackingInfo> videoEndTrackingInfo, Map<String, TokenizedTrackingInfo> itemTrackingInfo, Map<String, TokenizedTrackingInfo> trackingInfo, ImageDTO cornerImage, CornerRadius cornerRadius, Paddings horizontalPadding, Paddings itemSpacing, String widgetBackgroundColor, @NotNull ReviewsPreviewDTO.PlaybackType playbackType) {
        Intrinsics.checkNotNullParameter(preview, "preview");
        Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
        Intrinsics.checkNotNullParameter(paranjaColor, "paranjaColor");
        Intrinsics.checkNotNullParameter(playbackType, "playbackType");
        return new ReviewsPreviewVideoDTO(index, preview, videoInfo, fullVideoInfo, paranjaColor, clickAction, viewedItemAction, tile, videoStartTrackingInfo, videoEndTrackingInfo, itemTrackingInfo, trackingInfo, cornerImage, cornerRadius, horizontalPadding, itemSpacing, widgetBackgroundColor, playbackType);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsPreviewVideoDTO)) {
            return false;
        }
        ReviewsPreviewVideoDTO reviewsPreviewVideoDTO = (ReviewsPreviewVideoDTO) other;
        return this.index == reviewsPreviewVideoDTO.index && Intrinsics.d(this.preview, reviewsPreviewVideoDTO.preview) && Intrinsics.d(this.videoInfo, reviewsPreviewVideoDTO.videoInfo) && Intrinsics.d(this.fullVideoInfo, reviewsPreviewVideoDTO.fullVideoInfo) && Intrinsics.d(this.paranjaColor, reviewsPreviewVideoDTO.paranjaColor) && Intrinsics.d(this.clickAction, reviewsPreviewVideoDTO.clickAction) && Intrinsics.d(this.viewedItemAction, reviewsPreviewVideoDTO.viewedItemAction) && Intrinsics.d(this.tile, reviewsPreviewVideoDTO.tile) && Intrinsics.d(this.videoStartTrackingInfo, reviewsPreviewVideoDTO.videoStartTrackingInfo) && Intrinsics.d(this.videoEndTrackingInfo, reviewsPreviewVideoDTO.videoEndTrackingInfo) && Intrinsics.d(this.itemTrackingInfo, reviewsPreviewVideoDTO.itemTrackingInfo) && Intrinsics.d(this.trackingInfo, reviewsPreviewVideoDTO.trackingInfo) && Intrinsics.d(this.cornerImage, reviewsPreviewVideoDTO.cornerImage) && this.cornerRadius == reviewsPreviewVideoDTO.cornerRadius && this.horizontalPadding == reviewsPreviewVideoDTO.horizontalPadding && this.itemSpacing == reviewsPreviewVideoDTO.itemSpacing && Intrinsics.d(this.widgetBackgroundColor, reviewsPreviewVideoDTO.widgetBackgroundColor) && this.playbackType == reviewsPreviewVideoDTO.playbackType;
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

    public final int getIndex() {
        return this.index;
    }

    public final Paddings getItemSpacing() {
        return this.itemSpacing;
    }

    public final Map<String, TokenizedTrackingInfo> getItemTrackingInfo() {
        return this.itemTrackingInfo;
    }

    @NotNull
    public final String getParanjaColor() {
        return this.paranjaColor;
    }

    @NotNull
    public final ReviewsPreviewDTO.PlaybackType getPlaybackType() {
        return this.playbackType;
    }

    @NotNull
    public final ImageDTO getPreview() {
        return this.preview;
    }

    public final ReviewsPreviewTileDTO getTile() {
        return this.tile;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getVideoEndTrackingInfo() {
        return this.videoEndTrackingInfo;
    }

    @NotNull
    public final PreloadVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public final Map<String, TokenizedTrackingInfo> getVideoStartTrackingInfo() {
        return this.videoStartTrackingInfo;
    }

    public final AtomActionDTO getViewedItemAction() {
        return this.viewedItemAction;
    }

    public final String getWidgetBackgroundColor() {
        return this.widgetBackgroundColor;
    }

    public int hashCode() {
        int hashCode = (this.videoInfo.hashCode() + a.b(this.preview, Integer.hashCode(this.index) * 31, 31)) * 31;
        PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
        int a11 = g.a((hashCode + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31, 31, this.paranjaColor);
        AtomActionDTO atomActionDTO = this.clickAction;
        int hashCode2 = (a11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
        AtomActionDTO atomActionDTO2 = this.viewedItemAction;
        int hashCode3 = (hashCode2 + (atomActionDTO2 == null ? 0 : atomActionDTO2.hashCode())) * 31;
        ReviewsPreviewTileDTO reviewsPreviewTileDTO = this.tile;
        int hashCode4 = (hashCode3 + (reviewsPreviewTileDTO == null ? 0 : reviewsPreviewTileDTO.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.videoStartTrackingInfo;
        int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map2 = this.videoEndTrackingInfo;
        int hashCode6 = (hashCode5 + (map2 == null ? 0 : map2.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map3 = this.itemTrackingInfo;
        int hashCode7 = (hashCode6 + (map3 == null ? 0 : map3.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map4 = this.trackingInfo;
        int hashCode8 = (hashCode7 + (map4 == null ? 0 : map4.hashCode())) * 31;
        ImageDTO imageDTO = this.cornerImage;
        int hashCode9 = (hashCode8 + (imageDTO == null ? 0 : imageDTO.hashCode())) * 31;
        CornerRadius cornerRadius = this.cornerRadius;
        int hashCode10 = (hashCode9 + (cornerRadius == null ? 0 : cornerRadius.hashCode())) * 31;
        Paddings paddings = this.horizontalPadding;
        int hashCode11 = (hashCode10 + (paddings == null ? 0 : paddings.hashCode())) * 31;
        Paddings paddings2 = this.itemSpacing;
        int hashCode12 = (hashCode11 + (paddings2 == null ? 0 : paddings2.hashCode())) * 31;
        String str = this.widgetBackgroundColor;
        return this.playbackType.hashCode() + ((hashCode12 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @NotNull
    public String toString() {
        int i11 = this.index;
        ImageDTO imageDTO = this.preview;
        PreloadVideoInfo preloadVideoInfo = this.videoInfo;
        PreloadVideoInfo preloadVideoInfo2 = this.fullVideoInfo;
        String str = this.paranjaColor;
        AtomActionDTO atomActionDTO = this.clickAction;
        AtomActionDTO atomActionDTO2 = this.viewedItemAction;
        ReviewsPreviewTileDTO reviewsPreviewTileDTO = this.tile;
        Map<String, TokenizedTrackingInfo> map = this.videoStartTrackingInfo;
        Map<String, TokenizedTrackingInfo> map2 = this.videoEndTrackingInfo;
        Map<String, TokenizedTrackingInfo> map3 = this.itemTrackingInfo;
        Map<String, TokenizedTrackingInfo> map4 = this.trackingInfo;
        ImageDTO imageDTO2 = this.cornerImage;
        CornerRadius cornerRadius = this.cornerRadius;
        Paddings paddings = this.horizontalPadding;
        Paddings paddings2 = this.itemSpacing;
        String str2 = this.widgetBackgroundColor;
        ReviewsPreviewDTO.PlaybackType playbackType = this.playbackType;
        StringBuilder sb2 = new StringBuilder("ReviewsPreviewVideoDTO(index=");
        sb2.append(i11);
        sb2.append(", preview=");
        sb2.append(imageDTO);
        sb2.append(", videoInfo=");
        sb2.append(preloadVideoInfo);
        sb2.append(", fullVideoInfo=");
        sb2.append(preloadVideoInfo2);
        sb2.append(", paranjaColor=");
        p.c(str, ", clickAction=", ", viewedItemAction=", sb2, atomActionDTO);
        sb2.append(atomActionDTO2);
        sb2.append(", tile=");
        sb2.append(reviewsPreviewTileDTO);
        sb2.append(", videoStartTrackingInfo=");
        b.g(sb2, map, ", videoEndTrackingInfo=", map2, ", itemTrackingInfo=");
        b.g(sb2, map3, ", trackingInfo=", map4, ", cornerImage=");
        sb2.append(imageDTO2);
        sb2.append(", cornerRadius=");
        sb2.append(cornerRadius);
        sb2.append(", horizontalPadding=");
        Lh.a.e(sb2, paddings, ", itemSpacing=", paddings2, ", widgetBackgroundColor=");
        sb2.append(str2);
        sb2.append(", playbackType=");
        sb2.append(playbackType);
        sb2.append(")");
        return sb2.toString();
    }
}
