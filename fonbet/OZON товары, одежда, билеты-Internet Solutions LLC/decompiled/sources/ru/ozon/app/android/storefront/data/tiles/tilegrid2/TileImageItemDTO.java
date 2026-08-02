package ru.ozon.app.android.storefront.data.tiles.tilegrid2;

import G.g;
import N3.C3660k;
import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;

@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO;", "", "<init>", "()V", "ImageDTO", "VideoDTO", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$ImageDTO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$VideoDTO;", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class TileImageItemDTO {
    public /* synthetic */ TileImageItemDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BE\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u0017\u0010\u0019\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003JO\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001b\u001a\u00020\u001c2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001eHÖ\u0003J\t\u0010\u001f\u001a\u00020 HÖ\u0001J\t\u0010!\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000eR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000eR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\n\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014¨\u0006\""}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$ImageDTO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO;", "link", "", "topBgColor", "bottomBgColor", "contentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;Ljava/util/Map;)V", "getLink", "()Ljava/lang/String;", "getTopBgColor", "getBottomBgColor", "getContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ImageDTO extends TileImageItemDTO {
        private final String bottomBgColor;
        private final ContentMode contentMode;

        @NotNull
        private final String link;
        private final String topBgColor;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public /* synthetic */ ImageDTO(String str, String str2, String str3, ContentMode contentMode, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, str3, (i11 & 8) != 0 ? ContentMode.SCALE_ASPECT_FIT : contentMode, map);
        }

        public static /* synthetic */ ImageDTO copy$default(ImageDTO imageDTO, String str, String str2, String str3, ContentMode contentMode, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = imageDTO.link;
            }
            if ((i11 & 2) != 0) {
                str2 = imageDTO.topBgColor;
            }
            if ((i11 & 4) != 0) {
                str3 = imageDTO.bottomBgColor;
            }
            if ((i11 & 8) != 0) {
                contentMode = imageDTO.contentMode;
            }
            if ((i11 & 16) != 0) {
                map = imageDTO.trackingInfo;
            }
            Map map2 = map;
            String str4 = str3;
            return imageDTO.copy(str, str2, str4, contentMode, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component2, reason: from getter */
        public final String getTopBgColor() {
            return this.topBgColor;
        }

        /* renamed from: component3, reason: from getter */
        public final String getBottomBgColor() {
            return this.bottomBgColor;
        }

        /* renamed from: component4, reason: from getter */
        public final ContentMode getContentMode() {
            return this.contentMode;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final ImageDTO copy(@NotNull String link, String topBgColor, String bottomBgColor, ContentMode contentMode, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(link, "link");
            return new ImageDTO(link, topBgColor, bottomBgColor, contentMode, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ImageDTO)) {
                return false;
            }
            ImageDTO imageDTO = (ImageDTO) other;
            return Intrinsics.d(this.link, imageDTO.link) && Intrinsics.d(this.topBgColor, imageDTO.topBgColor) && Intrinsics.d(this.bottomBgColor, imageDTO.bottomBgColor) && this.contentMode == imageDTO.contentMode && Intrinsics.d(this.trackingInfo, imageDTO.trackingInfo);
        }

        public final String getBottomBgColor() {
            return this.bottomBgColor;
        }

        public final ContentMode getContentMode() {
            return this.contentMode;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        public final String getTopBgColor() {
            return this.topBgColor;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.link.hashCode() * 31;
            String str = this.topBgColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.bottomBgColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            ContentMode contentMode = this.contentMode;
            int hashCode4 = (hashCode3 + (contentMode == null ? 0 : contentMode.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.link;
            String str2 = this.topBgColor;
            String str3 = this.bottomBgColor;
            ContentMode contentMode = this.contentMode;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder d11 = C3660k.d("ImageDTO(link=", str, ", topBgColor=", str2, ", bottomBgColor=");
            d11.append(str3);
            d11.append(", contentMode=");
            d11.append(contentMode);
            d11.append(", trackingInfo=");
            return P.f(d11, map, ")");
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public ImageDTO(@NotNull String link, String str, String str2, ContentMode contentMode, Map<String, TokenizedTrackingInfo> map) {
            super(null);
            Intrinsics.checkNotNullParameter(link, "link");
            this.link = link;
            this.topBgColor = str;
            this.bottomBgColor = str2;
            this.contentMode = contentMode;
            this.trackingInfo = map;
        }
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001eB-\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0006HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J5\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$VideoDTO;", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO;", "preview", "", "link", "tracking", "Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$VideoDTO$VideoTracking;", "previewContentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$VideoDTO$VideoTracking;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;)V", "getPreview", "()Ljava/lang/String;", "getLink", "getTracking", "()Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$VideoDTO$VideoTracking;", "getPreviewContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "VideoTracking", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class VideoDTO extends TileImageItemDTO {

        @NotNull
        private final String link;

        @NotNull
        private final String preview;
        private final ContentMode previewContentMode;
        private final VideoTracking tracking;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\u0010\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003JQ\u0010\u0011\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u001f\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilegrid2/TileImageItemDTO$VideoDTO$VideoTracking;", "", "startedTrackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "finishedTrackingInfo", "interruptedTrackingInfo", "<init>", "(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V", "getStartedTrackingInfo", "()Ljava/util/Map;", "getFinishedTrackingInfo", "getInterruptedTrackingInfo", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes2.dex */
        public static final /* data */ class VideoTracking {
            private final Map<String, TokenizedTrackingInfo> finishedTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> interruptedTrackingInfo;
            private final Map<String, TokenizedTrackingInfo> startedTrackingInfo;

            public VideoTracking(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3) {
                this.startedTrackingInfo = map;
                this.finishedTrackingInfo = map2;
                this.interruptedTrackingInfo = map3;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ VideoTracking copy$default(VideoTracking videoTracking, Map map, Map map2, Map map3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    map = videoTracking.startedTrackingInfo;
                }
                if ((i11 & 2) != 0) {
                    map2 = videoTracking.finishedTrackingInfo;
                }
                if ((i11 & 4) != 0) {
                    map3 = videoTracking.interruptedTrackingInfo;
                }
                return videoTracking.copy(map, map2, map3);
            }

            public final Map<String, TokenizedTrackingInfo> component1() {
                return this.startedTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component2() {
                return this.finishedTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.interruptedTrackingInfo;
            }

            @NotNull
            public final VideoTracking copy(Map<String, TokenizedTrackingInfo> startedTrackingInfo, Map<String, TokenizedTrackingInfo> finishedTrackingInfo, Map<String, TokenizedTrackingInfo> interruptedTrackingInfo) {
                return new VideoTracking(startedTrackingInfo, finishedTrackingInfo, interruptedTrackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof VideoTracking)) {
                    return false;
                }
                VideoTracking videoTracking = (VideoTracking) other;
                return Intrinsics.d(this.startedTrackingInfo, videoTracking.startedTrackingInfo) && Intrinsics.d(this.finishedTrackingInfo, videoTracking.finishedTrackingInfo) && Intrinsics.d(this.interruptedTrackingInfo, videoTracking.interruptedTrackingInfo);
            }

            public final Map<String, TokenizedTrackingInfo> getFinishedTrackingInfo() {
                return this.finishedTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getInterruptedTrackingInfo() {
                return this.interruptedTrackingInfo;
            }

            public final Map<String, TokenizedTrackingInfo> getStartedTrackingInfo() {
                return this.startedTrackingInfo;
            }

            public int hashCode() {
                Map<String, TokenizedTrackingInfo> map = this.startedTrackingInfo;
                int hashCode = (map == null ? 0 : map.hashCode()) * 31;
                Map<String, TokenizedTrackingInfo> map2 = this.finishedTrackingInfo;
                int hashCode2 = (hashCode + (map2 == null ? 0 : map2.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map3 = this.interruptedTrackingInfo;
                return hashCode2 + (map3 != null ? map3.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                Map<String, TokenizedTrackingInfo> map = this.startedTrackingInfo;
                Map<String, TokenizedTrackingInfo> map2 = this.finishedTrackingInfo;
                Map<String, TokenizedTrackingInfo> map3 = this.interruptedTrackingInfo;
                StringBuilder sb2 = new StringBuilder("VideoTracking(startedTrackingInfo=");
                sb2.append(map);
                sb2.append(", finishedTrackingInfo=");
                sb2.append(map2);
                sb2.append(", interruptedTrackingInfo=");
                return P.f(sb2, map3, ")");
            }
        }

        public /* synthetic */ VideoDTO(String str, String str2, VideoTracking videoTracking, ContentMode contentMode, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, str2, videoTracking, (i11 & 8) != 0 ? ContentMode.SCALE_ASPECT_FILL : contentMode);
        }

        public static /* synthetic */ VideoDTO copy$default(VideoDTO videoDTO, String str, String str2, VideoTracking videoTracking, ContentMode contentMode, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = videoDTO.preview;
            }
            if ((i11 & 2) != 0) {
                str2 = videoDTO.link;
            }
            if ((i11 & 4) != 0) {
                videoTracking = videoDTO.tracking;
            }
            if ((i11 & 8) != 0) {
                contentMode = videoDTO.previewContentMode;
            }
            return videoDTO.copy(str, str2, videoTracking, contentMode);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getPreview() {
            return this.preview;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getLink() {
            return this.link;
        }

        /* renamed from: component3, reason: from getter */
        public final VideoTracking getTracking() {
            return this.tracking;
        }

        /* renamed from: component4, reason: from getter */
        public final ContentMode getPreviewContentMode() {
            return this.previewContentMode;
        }

        @NotNull
        public final VideoDTO copy(@NotNull String preview, @NotNull String link, VideoTracking tracking, ContentMode previewContentMode) {
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(link, "link");
            return new VideoDTO(preview, link, tracking, previewContentMode);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoDTO)) {
                return false;
            }
            VideoDTO videoDTO = (VideoDTO) other;
            return Intrinsics.d(this.preview, videoDTO.preview) && Intrinsics.d(this.link, videoDTO.link) && Intrinsics.d(this.tracking, videoDTO.tracking) && this.previewContentMode == videoDTO.previewContentMode;
        }

        @NotNull
        public final String getLink() {
            return this.link;
        }

        @NotNull
        public final String getPreview() {
            return this.preview;
        }

        public final ContentMode getPreviewContentMode() {
            return this.previewContentMode;
        }

        public final VideoTracking getTracking() {
            return this.tracking;
        }

        public int hashCode() {
            int a11 = g.a(this.preview.hashCode() * 31, 31, this.link);
            VideoTracking videoTracking = this.tracking;
            int hashCode = (a11 + (videoTracking == null ? 0 : videoTracking.hashCode())) * 31;
            ContentMode contentMode = this.previewContentMode;
            return hashCode + (contentMode != null ? contentMode.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.preview;
            String str2 = this.link;
            VideoTracking videoTracking = this.tracking;
            ContentMode contentMode = this.previewContentMode;
            StringBuilder d11 = C3660k.d("VideoDTO(preview=", str, ", link=", str2, ", tracking=");
            d11.append(videoTracking);
            d11.append(", previewContentMode=");
            d11.append(contentMode);
            d11.append(")");
            return d11.toString();
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public VideoDTO(@NotNull String preview, @NotNull String link, VideoTracking videoTracking, ContentMode contentMode) {
            super(null);
            Intrinsics.checkNotNullParameter(preview, "preview");
            Intrinsics.checkNotNullParameter(link, "link");
            this.preview = preview;
            this.link = link;
            this.tracking = videoTracking;
            this.previewContentMode = contentMode;
        }
    }

    private TileImageItemDTO() {
    }
}
