package ru.ozon.app.android.ugc.widgets.reviewsPreview.data;

import B4.V;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO;", "", "Image", "Video", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO$Image;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO$Video;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface ReviewsPreviewMediaItemDTO {

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO$Image;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "playIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "fullVideoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getPlayIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getFullVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "component1", "component2", "component3", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Image implements ReviewsPreviewMediaItemDTO {
        public static final int $stable = PreloadVideoInfo.$stable | IconDTO.$stable;
        private final PreloadVideoInfo fullVideoInfo;

        @NotNull
        private final ImageDTO image;
        private final IconDTO playIcon;

        public Image(@NotNull ImageDTO image, IconDTO iconDTO, PreloadVideoInfo preloadVideoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.playIcon = iconDTO;
            this.fullVideoInfo = preloadVideoInfo;
        }

        public static /* synthetic */ Image copy$default(Image image, ImageDTO imageDTO, IconDTO iconDTO, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = image.image;
            }
            if ((i11 & 2) != 0) {
                iconDTO = image.playIcon;
            }
            if ((i11 & 4) != 0) {
                preloadVideoInfo = image.fullVideoInfo;
            }
            return image.copy(imageDTO, iconDTO, preloadVideoInfo);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getPlayIcon() {
            return this.playIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final PreloadVideoInfo getFullVideoInfo() {
            return this.fullVideoInfo;
        }

        @NotNull
        public final Image copy(@NotNull ImageDTO image, IconDTO playIcon, PreloadVideoInfo fullVideoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new Image(image, playIcon, fullVideoInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Image)) {
                return false;
            }
            Image image = (Image) other;
            return Intrinsics.d(this.image, image.image) && Intrinsics.d(this.playIcon, image.playIcon) && Intrinsics.d(this.fullVideoInfo, image.fullVideoInfo);
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

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IconDTO iconDTO = this.playIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
            return hashCode2 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Image(image=" + this.image + ", playIcon=" + this.playIcon + ", fullVideoInfo=" + this.fullVideoInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BW\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\u0004\b\r\u0010\u000eJ\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0003Je\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\nHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010#HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000b\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0017¨\u0006'"}, d2 = {"Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO$Video;", "Lru/ozon/app/android/ugc/widgets/reviewsPreview/data/ReviewsPreviewMediaItemDTO;", "preview", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "fullVideoInfo", "paranjaColor", "", "videoStartTrackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoEndTrackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;)V", "getPreview", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "getFullVideoInfo", "getParanjaColor", "()Ljava/lang/String;", "getVideoStartTrackingInfo", "()Ljava/util/Map;", "getVideoEndTrackingInfo", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Video implements ReviewsPreviewMediaItemDTO {
        public static final int $stable = 8;
        private final PreloadVideoInfo fullVideoInfo;
        private final String paranjaColor;

        @NotNull
        private final ImageDTO preview;
        private final Map<String, TokenizedTrackingInfo> videoEndTrackingInfo;

        @NotNull
        private final PreloadVideoInfo videoInfo;
        private final Map<String, TokenizedTrackingInfo> videoStartTrackingInfo;

        public Video(@NotNull ImageDTO preview, @NotNull PreloadVideoInfo videoInfo, PreloadVideoInfo preloadVideoInfo, String str, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
            this.preview = preview;
            this.videoInfo = videoInfo;
            this.fullVideoInfo = preloadVideoInfo;
            this.paranjaColor = str;
            this.videoStartTrackingInfo = map;
            this.videoEndTrackingInfo = map2;
        }

        public static /* synthetic */ Video copy$default(Video video, ImageDTO imageDTO, PreloadVideoInfo preloadVideoInfo, PreloadVideoInfo preloadVideoInfo2, String str, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = video.preview;
            }
            if ((i11 & 2) != 0) {
                preloadVideoInfo = video.videoInfo;
            }
            if ((i11 & 4) != 0) {
                preloadVideoInfo2 = video.fullVideoInfo;
            }
            if ((i11 & 8) != 0) {
                str = video.paranjaColor;
            }
            if ((i11 & 16) != 0) {
                map = video.videoStartTrackingInfo;
            }
            if ((i11 & 32) != 0) {
                map2 = video.videoEndTrackingInfo;
            }
            Map map3 = map;
            Map map4 = map2;
            return video.copy(imageDTO, preloadVideoInfo, preloadVideoInfo2, str, map3, map4);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getPreview() {
            return this.preview;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        /* renamed from: component3, reason: from getter */
        public final PreloadVideoInfo getFullVideoInfo() {
            return this.fullVideoInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final String getParanjaColor() {
            return this.paranjaColor;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.videoStartTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.videoEndTrackingInfo;
        }

        @NotNull
        public final Video copy(@NotNull ImageDTO preview, @NotNull PreloadVideoInfo videoInfo, PreloadVideoInfo fullVideoInfo, String paranjaColor, Map<String, TokenizedTrackingInfo> videoStartTrackingInfo, Map<String, TokenizedTrackingInfo> videoEndTrackingInfo) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(videoInfo, "videoInfo");
            return new Video(preview, videoInfo, fullVideoInfo, paranjaColor, videoStartTrackingInfo, videoEndTrackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Video)) {
                return false;
            }
            Video video = (Video) other;
            return Intrinsics.d(this.preview, video.preview) && Intrinsics.d(this.videoInfo, video.videoInfo) && Intrinsics.d(this.fullVideoInfo, video.fullVideoInfo) && Intrinsics.d(this.paranjaColor, video.paranjaColor) && Intrinsics.d(this.videoStartTrackingInfo, video.videoStartTrackingInfo) && Intrinsics.d(this.videoEndTrackingInfo, video.videoEndTrackingInfo);
        }

        public final PreloadVideoInfo getFullVideoInfo() {
            return this.fullVideoInfo;
        }

        public final String getParanjaColor() {
            return this.paranjaColor;
        }

        @NotNull
        public final ImageDTO getPreview() {
            return this.preview;
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

        public int hashCode() {
            int hashCode = (this.videoInfo.hashCode() + (this.preview.hashCode() * 31)) * 31;
            PreloadVideoInfo preloadVideoInfo = this.fullVideoInfo;
            int hashCode2 = (hashCode + (preloadVideoInfo == null ? 0 : preloadVideoInfo.hashCode())) * 31;
            String str = this.paranjaColor;
            int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.videoStartTrackingInfo;
            int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.videoEndTrackingInfo;
            return hashCode4 + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.preview;
            PreloadVideoInfo preloadVideoInfo = this.videoInfo;
            PreloadVideoInfo preloadVideoInfo2 = this.fullVideoInfo;
            String str = this.paranjaColor;
            Map<String, TokenizedTrackingInfo> map = this.videoStartTrackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.videoEndTrackingInfo;
            StringBuilder sb2 = new StringBuilder("Video(preview=");
            sb2.append(imageDTO);
            sb2.append(", videoInfo=");
            sb2.append(preloadVideoInfo);
            sb2.append(", fullVideoInfo=");
            sb2.append(preloadVideoInfo2);
            sb2.append(", paranjaColor=");
            sb2.append(str);
            sb2.append(", videoStartTrackingInfo=");
            return V.c(sb2, map, ", videoEndTrackingInfo=", map2, ")");
        }
    }
}
