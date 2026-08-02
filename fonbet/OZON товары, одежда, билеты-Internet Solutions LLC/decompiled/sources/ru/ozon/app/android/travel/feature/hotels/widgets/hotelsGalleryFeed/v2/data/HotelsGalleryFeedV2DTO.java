package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFeed.v2.data;

import C.C2702w;
import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001fB5\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\b¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0010\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0002\u0010\u0010J\u0017\u0010\u0016\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0003JB\u0010\u0017\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0016\b\u0002\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bHÆ\u0001¢\u0006\u0002\u0010\u0018J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u001cHÖ\u0003J\t\u0010\u001d\u001a\u00020\u0006HÖ\u0001J\t\u0010\u001e\u001a\u00020\tHÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\n\n\u0002\u0010\u0011\u001a\u0004\b\u000f\u0010\u0010R\"\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;", "Lru/ozon/app/android/travel/utils/listtracking/TrackingInfoHolder;", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO$GalleryItem;", "initialItemIndex", "", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)V", "getItems", "()Ljava/util/List;", "getInitialItemIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "(Ljava/util/List;Ljava/lang/Integer;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO;", "equals", "", "other", "", "hashCode", "toString", "GalleryItem", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFeedV2DTO implements TrackingInfoHolder {
    public static final int $stable = 8;
    private final Integer initialItemIndex;

    @NotNull
    private final List<GalleryItem> items;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    public HotelsGalleryFeedV2DTO(@NotNull List<GalleryItem> items, Integer num, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
        this.initialItemIndex = num;
        this.trackingInfo = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ HotelsGalleryFeedV2DTO copy$default(HotelsGalleryFeedV2DTO hotelsGalleryFeedV2DTO, List list, Integer num, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsGalleryFeedV2DTO.items;
        }
        if ((i11 & 2) != 0) {
            num = hotelsGalleryFeedV2DTO.initialItemIndex;
        }
        if ((i11 & 4) != 0) {
            map = hotelsGalleryFeedV2DTO.trackingInfo;
        }
        return hotelsGalleryFeedV2DTO.copy(list, num, map);
    }

    @NotNull
    public final List<GalleryItem> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final Integer getInitialItemIndex() {
        return this.initialItemIndex;
    }

    public final Map<String, TokenizedTrackingInfo> component3() {
        return this.trackingInfo;
    }

    @NotNull
    public final HotelsGalleryFeedV2DTO copy(@NotNull List<GalleryItem> items, Integer initialItemIndex, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new HotelsGalleryFeedV2DTO(items, initialItemIndex, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryFeedV2DTO)) {
            return false;
        }
        HotelsGalleryFeedV2DTO hotelsGalleryFeedV2DTO = (HotelsGalleryFeedV2DTO) other;
        return Intrinsics.d(this.items, hotelsGalleryFeedV2DTO.items) && Intrinsics.d(this.initialItemIndex, hotelsGalleryFeedV2DTO.initialItemIndex) && Intrinsics.d(this.trackingInfo, hotelsGalleryFeedV2DTO.trackingInfo);
    }

    public final Integer getInitialItemIndex() {
        return this.initialItemIndex;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    @Override // ru.ozon.app.android.travel.utils.listtracking.TrackingInfoHolder
    public Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int hashCode = this.items.hashCode() * 31;
        Integer num = this.initialItemIndex;
        int hashCode2 = (hashCode + (num == null ? 0 : num.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<GalleryItem> list = this.items;
        Integer num = this.initialItemIndex;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("HotelsGalleryFeedV2DTO(items=");
        sb2.append(list);
        sb2.append(", initialItemIndex=");
        sb2.append(num);
        sb2.append(", trackingInfo=");
        return P.f(sb2, map, ")");
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u0011\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004J\t\u0010\u0007\u001a\u00020\u0001HÆ\u0003J\u0013\u0010\b\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u0001HÆ\u0001J\u0013\u0010\t\u001a\u00020\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\f\u001a\u00020\rHÖ\u0001J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO$GalleryItem;", "", "item", "<init>", "(Ljava/lang/Object;)V", "getItem", "()Ljava/lang/Object;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "", "GalleryImage", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class GalleryItem {
        public static final int $stable = 8;

        @NotNull
        private final Object item;

        public GalleryItem(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "galleryImage", type = GalleryImage.class), @ProtoOneOfSignature(name = "tagText", type = TextDTO.class), @ProtoOneOfSignature(name = "moreButton", type = ButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
        }

        public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, Object obj, int i11, Object obj2) {
            if ((i11 & 1) != 0) {
                obj = galleryItem.item;
            }
            return galleryItem.copy(obj);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Object getItem() {
            return this.item;
        }

        @NotNull
        public final GalleryItem copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "galleryImage", type = GalleryImage.class), @ProtoOneOfSignature(name = "tagText", type = TextDTO.class), @ProtoOneOfSignature(name = "moreButton", type = ButtonV3DTO.class)}) @NotNull @ProtoOneOf(label = "type") Object item) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new GalleryItem(item);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof GalleryItem) && Intrinsics.d(this.item, ((GalleryItem) other).item);
        }

        @NotNull
        public final Object getItem() {
            return this.item;
        }

        public int hashCode() {
            return this.item.hashCode();
        }

        @NotNull
        public String toString() {
            return C2702w.c(this.item, "GalleryItem(item=", ")");
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010\u0016\u001a\u00020\tHÆ\u0003J5\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0018\u001a\u00020\t2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0012¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFeed/v2/data/HotelsGalleryFeedV2DTO$GalleryItem$GalleryImage;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "videoControlIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "isLarge", "", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/icon/IconDTO;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Z)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getVideoControlIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "()Z", "component1", "component2", "component3", "component4", "copy", "equals", "other", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class GalleryImage {
            public static final int $stable = IconDTO.$stable;
            private final CommonControlSettings common;

            @NotNull
            private final ImageDTO image;
            private final boolean isLarge;
            private final IconDTO videoControlIcon;

            public GalleryImage(@NotNull ImageDTO image, IconDTO iconDTO, CommonControlSettings commonControlSettings, boolean z11) {
                Intrinsics.checkNotNullParameter(image, "image");
                this.image = image;
                this.videoControlIcon = iconDTO;
                this.common = commonControlSettings;
                this.isLarge = z11;
            }

            public static /* synthetic */ GalleryImage copy$default(GalleryImage galleryImage, ImageDTO imageDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    imageDTO = galleryImage.image;
                }
                if ((i11 & 2) != 0) {
                    iconDTO = galleryImage.videoControlIcon;
                }
                if ((i11 & 4) != 0) {
                    commonControlSettings = galleryImage.common;
                }
                if ((i11 & 8) != 0) {
                    z11 = galleryImage.isLarge;
                }
                return galleryImage.copy(imageDTO, iconDTO, commonControlSettings, z11);
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

            /* renamed from: component4, reason: from getter */
            public final boolean getIsLarge() {
                return this.isLarge;
            }

            @NotNull
            public final GalleryImage copy(@NotNull ImageDTO image, IconDTO videoControlIcon, CommonControlSettings common, boolean isLarge) {
                Intrinsics.checkNotNullParameter(image, "image");
                return new GalleryImage(image, videoControlIcon, common, isLarge);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof GalleryImage)) {
                    return false;
                }
                GalleryImage galleryImage = (GalleryImage) other;
                return Intrinsics.d(this.image, galleryImage.image) && Intrinsics.d(this.videoControlIcon, galleryImage.videoControlIcon) && Intrinsics.d(this.common, galleryImage.common) && this.isLarge == galleryImage.isLarge;
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
                return Boolean.hashCode(this.isLarge) + ((hashCode2 + (commonControlSettings != null ? commonControlSettings.hashCode() : 0)) * 31);
            }

            public final boolean isLarge() {
                return this.isLarge;
            }

            @NotNull
            public String toString() {
                return "GalleryImage(image=" + this.image + ", videoControlIcon=" + this.videoControlIcon + ", common=" + this.common + ", isLarge=" + this.isLarge + ")";
            }

            public /* synthetic */ GalleryImage(ImageDTO imageDTO, IconDTO iconDTO, CommonControlSettings commonControlSettings, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(imageDTO, (i11 & 2) != 0 ? null : iconDTO, (i11 & 4) != 0 ? null : commonControlSettings, (i11 & 8) != 0 ? false : z11);
            }
        }
    }
}
