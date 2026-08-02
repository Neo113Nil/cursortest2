package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v1.data;

import Ak.b;
import H3.c;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0012B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO$GalleryItem;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GalleryItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFeedDTO {
    public static final int $stable = 8;

    @NotNull
    private final List<GalleryItem> items;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v1/data/HotelsGalleryFeedDTO$GalleryItem;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "videoControlIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getVideoControlIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryItem {
        public static final int $stable = IconDTO.$stable;
        private final CommonControlSettings common;

        @NotNull
        private final ImageDTO image;
        private final IconDTO videoControlIcon;

        public GalleryItem(@NotNull ImageDTO image, IconDTO iconDTO, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.image = image;
            this.videoControlIcon = iconDTO;
            this.common = commonControlSettings;
        }

        public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, ImageDTO imageDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = galleryItem.image;
            }
            if ((i11 & 2) != 0) {
                iconDTO = galleryItem.videoControlIcon;
            }
            if ((i11 & 4) != 0) {
                commonControlSettings = galleryItem.common;
            }
            return galleryItem.copy(imageDTO, iconDTO, commonControlSettings);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        /* renamed from: component2, reason: from getter */
        public final IconDTO getVideoControlIcon() {
            return this.videoControlIcon;
        }

        /* renamed from: component3, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final GalleryItem copy(@NotNull ImageDTO image, IconDTO videoControlIcon, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(image, "image");
            return new GalleryItem(image, videoControlIcon, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) other;
            return Intrinsics.d(this.image, galleryItem.image) && Intrinsics.d(this.videoControlIcon, galleryItem.videoControlIcon) && Intrinsics.d(this.common, galleryItem.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final IconDTO getVideoControlIcon() {
            return this.videoControlIcon;
        }

        public int hashCode() {
            int hashCode = this.image.hashCode() * 31;
            IconDTO iconDTO = this.videoControlIcon;
            int hashCode2 = (hashCode + (iconDTO == null ? 0 : iconDTO.hashCode())) * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            ImageDTO imageDTO = this.image;
            IconDTO iconDTO = this.videoControlIcon;
            CommonControlSettings commonControlSettings = this.common;
            StringBuilder sb2 = new StringBuilder("GalleryItem(image=");
            sb2.append(imageDTO);
            sb2.append(", videoControlIcon=");
            sb2.append(iconDTO);
            sb2.append(", common=");
            return b.g(sb2, commonControlSettings, ")");
        }
    }

    public HotelsGalleryFeedDTO(@NotNull List<GalleryItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsGalleryFeedDTO copy$default(HotelsGalleryFeedDTO hotelsGalleryFeedDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsGalleryFeedDTO.items;
        }
        return hotelsGalleryFeedDTO.copy(list);
    }

    @NotNull
    public final List<GalleryItem> component1() {
        return this.items;
    }

    @NotNull
    public final HotelsGalleryFeedDTO copy(@NotNull List<GalleryItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new HotelsGalleryFeedDTO(items);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof HotelsGalleryFeedDTO) && Intrinsics.d(this.items, ((HotelsGalleryFeedDTO) other).items);
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    public int hashCode() {
        return this.items.hashCode();
    }

    @NotNull
    public String toString() {
        return c.a("HotelsGalleryFeedDTO(items=", ")", this.items);
    }
}
