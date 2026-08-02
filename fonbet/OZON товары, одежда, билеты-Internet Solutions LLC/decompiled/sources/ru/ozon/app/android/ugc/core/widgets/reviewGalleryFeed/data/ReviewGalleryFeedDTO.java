package ru.ozon.app.android.ugc.core.widgets.reviewGalleryFeed.data;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J#\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO;", "", "layoutType", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO$LayoutType;", "items", "", "Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO$ReviewGalleryFeedItem;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO$LayoutType;Ljava/util/List;)V", "getLayoutType", "()Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO$LayoutType;", "getItems", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ReviewGalleryFeedItem", "LayoutType", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ReviewGalleryFeedDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ReviewGalleryFeedItem> items;

    @NotNull
    private final LayoutType layoutType;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO$LayoutType;", "", "<init>", "(Ljava/lang/String;I)V", "LAYOUT_TYPE_GRID_2", "LAYOUT_TYPE_GRID_3", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LayoutType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ LayoutType[] $VALUES;
        public static final LayoutType LAYOUT_TYPE_GRID_2 = new LayoutType("LAYOUT_TYPE_GRID_2", 0);
        public static final LayoutType LAYOUT_TYPE_GRID_3 = new LayoutType("LAYOUT_TYPE_GRID_3", 1);

        private static final /* synthetic */ LayoutType[] $values() {
            return new LayoutType[]{LAYOUT_TYPE_GRID_2, LAYOUT_TYPE_GRID_3};
        }

        static {
            LayoutType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private LayoutType(String str, int i11) {
        }

        public static LayoutType valueOf(String str) {
            return (LayoutType) Enum.valueOf(LayoutType.class, str);
        }

        public static LayoutType[] values() {
            return (LayoutType[]) $VALUES.clone();
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003J\u000b\u0010#\u001a\u0004\u0018\u00010\u000fHÆ\u0003J[\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000fHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006+"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/reviewGalleryFeed/data/ReviewGalleryFeedDTO$ReviewGalleryFeedItem;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "icon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "badge", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class ReviewGalleryFeedItem {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final BadgeDTO badge;
        private final IconDTO icon;

        @NotNull
        private final ImageDTO image;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final PreloadVideoInfo videoInfo;

        public ReviewGalleryFeedItem(@NotNull ImageDTO image, IconDTO iconDTO, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map<String, TokenizedTrackingInfo> map, PreloadVideoInfo preloadVideoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.icon = iconDTO;
            this.badge = badgeDTO;
            this.action = atomActionDTO;
            this.trackingInfo = map;
            this.videoInfo = preloadVideoInfo;
        }

        public static /* synthetic */ ReviewGalleryFeedItem copy$default(ReviewGalleryFeedItem reviewGalleryFeedItem, ImageDTO imageDTO, IconDTO iconDTO, BadgeDTO badgeDTO, AtomActionDTO atomActionDTO, Map map, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = reviewGalleryFeedItem.image;
            }
            if ((i11 & 2) != 0) {
                iconDTO = reviewGalleryFeedItem.icon;
            }
            if ((i11 & 4) != 0) {
                badgeDTO = reviewGalleryFeedItem.badge;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = reviewGalleryFeedItem.action;
            }
            if ((i11 & 16) != 0) {
                map = reviewGalleryFeedItem.trackingInfo;
            }
            if ((i11 & 32) != 0) {
                preloadVideoInfo = reviewGalleryFeedItem.videoInfo;
            }
            Map map2 = map;
            PreloadVideoInfo preloadVideoInfo2 = preloadVideoInfo;
            return reviewGalleryFeedItem.copy(imageDTO, iconDTO, badgeDTO, atomActionDTO, map2, preloadVideoInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getIcon() {
            return this.icon;
        }

        /* renamed from: component3, reason: from getter */
        public final BadgeDTO getBadge() {
            return this.badge;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final Map<String, TokenizedTrackingInfo> component5() {
            return this.trackingInfo;
        }

        /* renamed from: component6, reason: from getter */
        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        @NotNull
        public final ReviewGalleryFeedItem copy(@NotNull ImageDTO image, IconDTO icon, BadgeDTO badge, AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, PreloadVideoInfo videoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new ReviewGalleryFeedItem(image, icon, badge, action, trackingInfo, videoInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ReviewGalleryFeedItem)) {
                return false;
            }
            ReviewGalleryFeedItem reviewGalleryFeedItem = (ReviewGalleryFeedItem) other;
            return Intrinsics.d(this.image, reviewGalleryFeedItem.image) && Intrinsics.d(this.icon, reviewGalleryFeedItem.icon) && Intrinsics.d(this.badge, reviewGalleryFeedItem.badge) && Intrinsics.d(this.action, reviewGalleryFeedItem.action) && Intrinsics.d(this.trackingInfo, reviewGalleryFeedItem.trackingInfo) && Intrinsics.d(this.videoInfo, reviewGalleryFeedItem.videoInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final BadgeDTO getBadge() {
            return this.badge;
        }

        public final IconDTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IconDTO iconDTO = this.icon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            BadgeDTO badgeDTO = this.badge;
            int hashCode3 = (hashCode2 + (badgeDTO == null ? 0 : badgeDTO.hashCode())) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode4 = (hashCode3 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode5 = (hashCode4 + (map == null ? 0 : map.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.videoInfo;
            return hashCode5 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ReviewGalleryFeedItem(image=" + this.image + ", icon=" + this.icon + ", badge=" + this.badge + ", action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", videoInfo=" + this.videoInfo + ")";
        }
    }

    public ReviewGalleryFeedDTO(@NotNull LayoutType layoutType, @NotNull List<ReviewGalleryFeedItem> items) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(items, "items");
        this.layoutType = layoutType;
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewGalleryFeedDTO copy$default(ReviewGalleryFeedDTO reviewGalleryFeedDTO, LayoutType layoutType, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            layoutType = reviewGalleryFeedDTO.layoutType;
        }
        if ((i11 & 2) != 0) {
            list = reviewGalleryFeedDTO.items;
        }
        return reviewGalleryFeedDTO.copy(layoutType, list);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    @NotNull
    public final List<ReviewGalleryFeedItem> component2() {
        return this.items;
    }

    @NotNull
    public final ReviewGalleryFeedDTO copy(@NotNull LayoutType layoutType, @NotNull List<ReviewGalleryFeedItem> items) {
        Intrinsics.checkNotNullParameter(layoutType, "layoutType");
        Intrinsics.checkNotNullParameter(items, "items");
        return new ReviewGalleryFeedDTO(layoutType, items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryFeedDTO)) {
            return false;
        }
        ReviewGalleryFeedDTO reviewGalleryFeedDTO = (ReviewGalleryFeedDTO) other;
        return this.layoutType == reviewGalleryFeedDTO.layoutType && Intrinsics.d(this.items, reviewGalleryFeedDTO.items);
    }

    @NotNull
    public final List<ReviewGalleryFeedItem> getItems() {
        return this.items;
    }

    @NotNull
    public final LayoutType getLayoutType() {
        return this.layoutType;
    }

    public int hashCode() {
        return this.items.hashCode() + (this.layoutType.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "ReviewGalleryFeedDTO(layoutType=" + this.layoutType + ", items=" + this.items + ")";
    }
}
