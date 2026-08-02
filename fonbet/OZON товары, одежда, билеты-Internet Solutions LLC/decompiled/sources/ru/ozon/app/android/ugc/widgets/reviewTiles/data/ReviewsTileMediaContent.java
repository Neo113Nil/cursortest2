package ru.ozon.app.android.ugc.widgets.reviewTiles.data;

import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0013\u0010\b\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000e¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewTiles/data/ReviewsTileMediaContent;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "playIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "fullVideoInfo", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getFullVideoInfo", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewsTileMediaContent {
    public static final int $stable;
    private final PreloadVideoInfo fullVideoInfo;

    @NotNull
    private final ImageDTO image;
    private final IconDTO playIcon;
    private final PreloadVideoInfo videoInfo;

    static {
        int i11 = PreloadVideoInfo.$stable;
        $stable = i11 | IconDTO.$stable | i11;
    }

    public ReviewsTileMediaContent(@NotNull ImageDTO image, PreloadVideoInfo preloadVideoInfo, IconDTO iconDTO, PreloadVideoInfo preloadVideoInfo2) {
        Intrinsics.checkNotNullParameter(image, "image");
        this.image = image;
        this.videoInfo = preloadVideoInfo;
        this.playIcon = iconDTO;
        this.fullVideoInfo = preloadVideoInfo2;
    }

    public static /* synthetic */ ReviewsTileMediaContent copy$default(ReviewsTileMediaContent reviewsTileMediaContent, ImageDTO imageDTO, PreloadVideoInfo preloadVideoInfo, IconDTO iconDTO, PreloadVideoInfo preloadVideoInfo2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            imageDTO = reviewsTileMediaContent.image;
        }
        if ((i11 & 2) != 0) {
            preloadVideoInfo = reviewsTileMediaContent.videoInfo;
        }
        if ((i11 & 4) != 0) {
            iconDTO = reviewsTileMediaContent.playIcon;
        }
        if ((i11 & 8) != 0) {
            preloadVideoInfo2 = reviewsTileMediaContent.fullVideoInfo;
        }
        return reviewsTileMediaContent.copy(imageDTO, preloadVideoInfo, iconDTO, preloadVideoInfo2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ImageDTO getImage() {
        return this.image;
    }

    /* renamed from: component2, reason: from getter */
    public final PreloadVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    /* renamed from: component3, reason: from getter */
    public final IconDTO getPlayIcon() {
        return this.playIcon;
    }

    /* renamed from: component4, reason: from getter */
    public final PreloadVideoInfo getFullVideoInfo() {
        return this.fullVideoInfo;
    }

    @NotNull
    public final ReviewsTileMediaContent copy(@NotNull ImageDTO image, PreloadVideoInfo videoInfo, IconDTO playIcon, PreloadVideoInfo fullVideoInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        return new ReviewsTileMediaContent(image, videoInfo, playIcon, fullVideoInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewsTileMediaContent)) {
            return false;
        }
        ReviewsTileMediaContent reviewsTileMediaContent = (ReviewsTileMediaContent) other;
        return Intrinsics.d(this.image, reviewsTileMediaContent.image) && Intrinsics.d(this.videoInfo, reviewsTileMediaContent.videoInfo) && Intrinsics.d(this.playIcon, reviewsTileMediaContent.playIcon) && Intrinsics.d(this.fullVideoInfo, reviewsTileMediaContent.fullVideoInfo);
    }

    public final PreloadVideoInfo getFullVideoInfo() {
        return this.fullVideoInfo;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final IconDTO getPlayIcon() {
        return this.playIcon;
    }

    public final PreloadVideoInfo getVideoInfo() {
        return this.videoInfo;
    }

    public int hashCode() {
        int hashCode = this.image.hashCode() * 31;
        PreloadVideoInfo preloadVideoInfo = this.videoInfo;
        int hashCode2 = (hashCode + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
        IconDTO iconDTO = this.playIcon;
        int hashCode3 = (hashCode2 + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
        PreloadVideoInfo preloadVideoInfo2 = this.fullVideoInfo;
        return hashCode3 + (preloadVideoInfo2 != null ? preloadVideoInfo2.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewsTileMediaContent(image=" + this.image + ", videoInfo=" + this.videoInfo + ", playIcon=" + this.playIcon + ", fullVideoInfo=" + this.fullVideoInfo + ")";
    }
}
