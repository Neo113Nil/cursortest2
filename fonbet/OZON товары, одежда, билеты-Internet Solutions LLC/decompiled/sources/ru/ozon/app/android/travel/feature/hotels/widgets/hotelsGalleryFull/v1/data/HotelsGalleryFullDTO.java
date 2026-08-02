package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsGalleryFull.v1.data;

import Ep.a;
import Kk.C3532b;
import Ns.b;
import Sc.InterfaceC3999a;
import com.squareup.moshi.j;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.pdpvideomolecule.data.VideoMolecule;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0003'()B;\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0018JL\u0010\u001f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\"2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020\u000bHÖ\u0001J\t\u0010%\u001a\u00020&HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001e\u0010\u0007\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0015R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0019\u001a\u0004\b\u0017\u0010\u0018¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO;", "", "items", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$GalleryItem;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "closeButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "backButton", "initialItemIndex", "", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Integer;)V", "getItems", "()Ljava/util/List;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getCloseButton$annotations", "()V", "getCloseButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBackButton", "getInitialItemIndex", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/util/List;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Ljava/lang/Integer;)Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO;", "equals", "", "other", "hashCode", "toString", "", "GalleryItem", "Item", "VideoTrackingInfo", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsGalleryFullDTO {
    public static final int $stable = 8;
    private final IconButtonV3DTO backButton;
    private final IconButtonV3DTO closeButton;
    private final Integer initialItemIndex;

    @NotNull
    private final List<GalleryItem> items;

    @NotNull
    private final TextDTO text;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\u0014\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J+\u0010\u0010\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$GalleryItem;", "", "item", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item;Ljava/util/Map;)V", "getItem", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GalleryItem {
        public static final int $stable = 8;

        @NotNull
        private final Item item;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public GalleryItem(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = Item.Image.class), @ProtoOneOfSignature(name = "video", type = Item.Video.class)}) @NotNull @ProtoOneOf(label = "type") Item item, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(item, "item");
            this.item = item;
            this.trackingInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ GalleryItem copy$default(GalleryItem galleryItem, Item item, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                item = galleryItem.item;
            }
            if ((i11 & 2) != 0) {
                map = galleryItem.trackingInfo;
            }
            return galleryItem.copy(item, map);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final Item getItem() {
            return this.item;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.trackingInfo;
        }

        @NotNull
        public final GalleryItem copy(@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "image", type = Item.Image.class), @ProtoOneOfSignature(name = "video", type = Item.Video.class)}) @NotNull @ProtoOneOf(label = "type") Item item, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(item, "item");
            return new GalleryItem(item, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GalleryItem)) {
                return false;
            }
            GalleryItem galleryItem = (GalleryItem) other;
            return Intrinsics.d(this.item, galleryItem.item) && Intrinsics.d(this.trackingInfo, galleryItem.trackingInfo);
        }

        @NotNull
        public final Item getItem() {
            return this.item;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = this.item.hashCode() * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode + (map == null ? 0 : map.hashCode());
        }

        @NotNull
        public String toString() {
            return "GalleryItem(item=" + this.item + ", trackingInfo=" + this.trackingInfo + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J\u0017\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J9\u0010\u000e\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00032\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\n¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$VideoTrackingInfo;", "", "startVideo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "endVideo", "<init>", "(Ljava/util/Map;Ljava/util/Map;)V", "getStartVideo", "()Ljava/util/Map;", "getEndVideo", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class VideoTrackingInfo {
        public static final int $stable = 8;
        private final Map<String, TokenizedTrackingInfo> endVideo;
        private final Map<String, TokenizedTrackingInfo> startVideo;

        public VideoTrackingInfo(Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2) {
            this.startVideo = map;
            this.endVideo = map2;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ VideoTrackingInfo copy$default(VideoTrackingInfo videoTrackingInfo, Map map, Map map2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = videoTrackingInfo.startVideo;
            }
            if ((i11 & 2) != 0) {
                map2 = videoTrackingInfo.endVideo;
            }
            return videoTrackingInfo.copy(map, map2);
        }

        public final Map<String, TokenizedTrackingInfo> component1() {
            return this.startVideo;
        }

        public final Map<String, TokenizedTrackingInfo> component2() {
            return this.endVideo;
        }

        @NotNull
        public final VideoTrackingInfo copy(Map<String, TokenizedTrackingInfo> startVideo, Map<String, TokenizedTrackingInfo> endVideo) {
            return new VideoTrackingInfo(startVideo, endVideo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof VideoTrackingInfo)) {
                return false;
            }
            VideoTrackingInfo videoTrackingInfo = (VideoTrackingInfo) other;
            return Intrinsics.d(this.startVideo, videoTrackingInfo.startVideo) && Intrinsics.d(this.endVideo, videoTrackingInfo.endVideo);
        }

        public final Map<String, TokenizedTrackingInfo> getEndVideo() {
            return this.endVideo;
        }

        public final Map<String, TokenizedTrackingInfo> getStartVideo() {
            return this.startVideo;
        }

        public int hashCode() {
            Map<String, TokenizedTrackingInfo> map = this.startVideo;
            int hashCode = (map == null ? 0 : map.hashCode()) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.endVideo;
            return hashCode + (map2 != null ? map2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "VideoTrackingInfo(startVideo=" + this.startVideo + ", endVideo=" + this.endVideo + ")";
        }
    }

    public HotelsGalleryFullDTO(@NotNull List<GalleryItem> items, @NotNull TextDTO text, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, Integer num) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(text, "text");
        this.items = items;
        this.text = text;
        this.closeButton = iconButtonV3DTO;
        this.backButton = iconButtonV3DTO2;
        this.initialItemIndex = num;
    }

    public static /* synthetic */ HotelsGalleryFullDTO copy$default(HotelsGalleryFullDTO hotelsGalleryFullDTO, List list, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, IconButtonV3DTO iconButtonV3DTO2, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = hotelsGalleryFullDTO.items;
        }
        if ((i11 & 2) != 0) {
            textDTO = hotelsGalleryFullDTO.text;
        }
        if ((i11 & 4) != 0) {
            iconButtonV3DTO = hotelsGalleryFullDTO.closeButton;
        }
        if ((i11 & 8) != 0) {
            iconButtonV3DTO2 = hotelsGalleryFullDTO.backButton;
        }
        if ((i11 & 16) != 0) {
            num = hotelsGalleryFullDTO.initialItemIndex;
        }
        Integer num2 = num;
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        return hotelsGalleryFullDTO.copy(list, textDTO, iconButtonV3DTO3, iconButtonV3DTO2, num2);
    }

    @InterfaceC3999a
    public static /* synthetic */ void getCloseButton$annotations() {
    }

    @NotNull
    public final List<GalleryItem> component1() {
        return this.items;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final TextDTO getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    /* renamed from: component4, reason: from getter */
    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getInitialItemIndex() {
        return this.initialItemIndex;
    }

    @NotNull
    public final HotelsGalleryFullDTO copy(@NotNull List<GalleryItem> items, @NotNull TextDTO text, IconButtonV3DTO closeButton, IconButtonV3DTO backButton, Integer initialItemIndex) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(text, "text");
        return new HotelsGalleryFullDTO(items, text, closeButton, backButton, initialItemIndex);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsGalleryFullDTO)) {
            return false;
        }
        HotelsGalleryFullDTO hotelsGalleryFullDTO = (HotelsGalleryFullDTO) other;
        return Intrinsics.d(this.items, hotelsGalleryFullDTO.items) && Intrinsics.d(this.text, hotelsGalleryFullDTO.text) && Intrinsics.d(this.closeButton, hotelsGalleryFullDTO.closeButton) && Intrinsics.d(this.backButton, hotelsGalleryFullDTO.backButton) && Intrinsics.d(this.initialItemIndex, hotelsGalleryFullDTO.initialItemIndex);
    }

    public final IconButtonV3DTO getBackButton() {
        return this.backButton;
    }

    public final IconButtonV3DTO getCloseButton() {
        return this.closeButton;
    }

    public final Integer getInitialItemIndex() {
        return this.initialItemIndex;
    }

    @NotNull
    public final List<GalleryItem> getItems() {
        return this.items;
    }

    @NotNull
    public final TextDTO getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = b.a(this.text, this.items.hashCode() * 31, 31);
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        IconButtonV3DTO iconButtonV3DTO2 = this.backButton;
        int hashCode2 = (hashCode + (iconButtonV3DTO2 == null ? 0 : iconButtonV3DTO2.hashCode())) * 31;
        Integer num = this.initialItemIndex;
        return hashCode2 + (num != null ? num.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        List<GalleryItem> list = this.items;
        TextDTO textDTO = this.text;
        IconButtonV3DTO iconButtonV3DTO = this.closeButton;
        IconButtonV3DTO iconButtonV3DTO2 = this.backButton;
        Integer num = this.initialItemIndex;
        StringBuilder sb2 = new StringBuilder("HotelsGalleryFullDTO(items=");
        sb2.append(list);
        sb2.append(", text=");
        sb2.append(textDTO);
        sb2.append(", closeButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", backButton=");
        sb2.append(iconButtonV3DTO2);
        sb2.append(", initialItemIndex=");
        return a.c(sb2, num, ")");
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item;", "", "Image", "Video", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item$Image;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item$Video;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Item {

        @InterfaceC6346b
        @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0087@\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\b\u001a\u00020\t2\b\u0010\n\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0088\u0001\u0002¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item$Image;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item;", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "constructor-impl", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "equals", "", "other", "", "equals-impl", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Ljava/lang/Object;)Z", "hashCode", "", "hashCode-impl", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)I", "toString", "", "toString-impl", "(Lru/ozon/uni/atoms/data/image/ImageDTO;)Ljava/lang/String;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final class Image implements Item {

            @NotNull
            private final ImageDTO image;

            private /* synthetic */ Image(ImageDTO imageDTO) {
                this.image = imageDTO;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ Image m1370boximpl(ImageDTO imageDTO) {
                return new Image(imageDTO);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static ImageDTO m1371constructorimpl(@NotNull ImageDTO image) {
                Intrinsics.checkNotNullParameter(image, "image");
                return image;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1372equalsimpl(ImageDTO imageDTO, Object obj) {
                return (obj instanceof Image) && Intrinsics.d(imageDTO, ((Image) obj).m1376unboximpl());
            }

            /* renamed from: equals-impl0, reason: not valid java name */
            public static final boolean m1373equalsimpl0(ImageDTO imageDTO, ImageDTO imageDTO2) {
                return Intrinsics.d(imageDTO, imageDTO2);
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1374hashCodeimpl(ImageDTO imageDTO) {
                return imageDTO.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1375toStringimpl(ImageDTO imageDTO) {
                return "Image(image=" + imageDTO + ")";
            }

            public boolean equals(Object obj) {
                return m1372equalsimpl(this.image, obj);
            }

            @NotNull
            public final ImageDTO getImage() {
                return this.image;
            }

            public int hashCode() {
                return m1374hashCodeimpl(this.image);
            }

            public String toString() {
                return m1375toStringimpl(this.image);
            }

            /* renamed from: unbox-impl, reason: not valid java name */
            public final /* synthetic */ ImageDTO m1376unboximpl() {
                return this.image;
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\n\u001a\u00020\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0018\u001a\u00020\u0005HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0007HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\tHÆ\u0003J\t\u0010\u001b\u001a\u00020\u000bHÆ\u0003J=\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000bHÆ\u0001J\u0013\u0010\u001d\u001a\u00020\u00072\b\u0010\u001e\u001a\u0004\u0018\u00010\u001fHÖ\u0003J\t\u0010 \u001a\u00020!HÖ\u0001J\t\u0010\"\u001a\u00020#HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0012R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016¨\u0006$"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item$Video;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$Item;", "video", "Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "previewImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "isAutoplay", "", "videoTrackingInfo", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$VideoTrackingInfo;", "videoControlIcon", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "<init>", "(Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;Lru/ozon/uni/atoms/data/image/ImageDTO;ZLru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$VideoTrackingInfo;Lru/ozon/uni/atoms/data/icon/IconDTO;)V", "getVideo", "()Lru/ozon/app/android/pdpvideomolecule/data/VideoMolecule;", "getPreviewImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "()Z", "getVideoTrackingInfo", "()Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsGalleryFull/v1/data/HotelsGalleryFullDTO$VideoTrackingInfo;", "getVideoControlIcon", "()Lru/ozon/uni/atoms/data/icon/IconDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "other", "", "hashCode", "", "toString", "", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Video implements Item {
            public static final int $stable = 8;
            private final boolean isAutoplay;

            @NotNull
            private final ImageDTO previewImage;

            @NotNull
            private final VideoMolecule video;

            @NotNull
            private final IconDTO videoControlIcon;
            private final VideoTrackingInfo videoTrackingInfo;

            public Video(@NotNull VideoMolecule video, @NotNull ImageDTO previewImage, boolean z11, VideoTrackingInfo videoTrackingInfo, @NotNull IconDTO videoControlIcon) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewImage, "previewImage");
                Intrinsics.checkNotNullParameter(videoControlIcon, "videoControlIcon");
                this.video = video;
                this.previewImage = previewImage;
                this.isAutoplay = z11;
                this.videoTrackingInfo = videoTrackingInfo;
                this.videoControlIcon = videoControlIcon;
            }

            public static /* synthetic */ Video copy$default(Video video, VideoMolecule videoMolecule, ImageDTO imageDTO, boolean z11, VideoTrackingInfo videoTrackingInfo, IconDTO iconDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    videoMolecule = video.video;
                }
                if ((i11 & 2) != 0) {
                    imageDTO = video.previewImage;
                }
                if ((i11 & 4) != 0) {
                    z11 = video.isAutoplay;
                }
                if ((i11 & 8) != 0) {
                    videoTrackingInfo = video.videoTrackingInfo;
                }
                if ((i11 & 16) != 0) {
                    iconDTO = video.videoControlIcon;
                }
                IconDTO iconDTO2 = iconDTO;
                boolean z12 = z11;
                return video.copy(videoMolecule, imageDTO, z12, videoTrackingInfo, iconDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final VideoMolecule getVideo() {
                return this.video;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final ImageDTO getPreviewImage() {
                return this.previewImage;
            }

            /* renamed from: component3, reason: from getter */
            public final boolean getIsAutoplay() {
                return this.isAutoplay;
            }

            /* renamed from: component4, reason: from getter */
            public final VideoTrackingInfo getVideoTrackingInfo() {
                return this.videoTrackingInfo;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final IconDTO getVideoControlIcon() {
                return this.videoControlIcon;
            }

            @NotNull
            public final Video copy(@NotNull VideoMolecule video, @NotNull ImageDTO previewImage, boolean isAutoplay, VideoTrackingInfo videoTrackingInfo, @NotNull IconDTO videoControlIcon) {
                Intrinsics.checkNotNullParameter(video, "video");
                Intrinsics.checkNotNullParameter(previewImage, "previewImage");
                Intrinsics.checkNotNullParameter(videoControlIcon, "videoControlIcon");
                return new Video(video, previewImage, isAutoplay, videoTrackingInfo, videoControlIcon);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Video)) {
                    return false;
                }
                Video video = (Video) other;
                return Intrinsics.d(this.video, video.video) && Intrinsics.d(this.previewImage, video.previewImage) && this.isAutoplay == video.isAutoplay && Intrinsics.d(this.videoTrackingInfo, video.videoTrackingInfo) && Intrinsics.d(this.videoControlIcon, video.videoControlIcon);
            }

            @NotNull
            public final ImageDTO getPreviewImage() {
                return this.previewImage;
            }

            @NotNull
            public final VideoMolecule getVideo() {
                return this.video;
            }

            @NotNull
            public final IconDTO getVideoControlIcon() {
                return this.videoControlIcon;
            }

            public final VideoTrackingInfo getVideoTrackingInfo() {
                return this.videoTrackingInfo;
            }

            public int hashCode() {
                int a11 = C3532b.a(Nh.a.b(this.previewImage, this.video.hashCode() * 31, 31), 31, this.isAutoplay);
                VideoTrackingInfo videoTrackingInfo = this.videoTrackingInfo;
                return this.videoControlIcon.hashCode() + ((a11 + (videoTrackingInfo == null ? 0 : videoTrackingInfo.hashCode())) * 31);
            }

            public final boolean isAutoplay() {
                return this.isAutoplay;
            }

            @NotNull
            public String toString() {
                return "Video(video=" + this.video + ", previewImage=" + this.previewImage + ", isAutoplay=" + this.isAutoplay + ", videoTrackingInfo=" + this.videoTrackingInfo + ", videoControlIcon=" + this.videoControlIcon + ")";
            }

            public /* synthetic */ Video(VideoMolecule videoMolecule, ImageDTO imageDTO, boolean z11, VideoTrackingInfo videoTrackingInfo, IconDTO iconDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(videoMolecule, imageDTO, (i11 & 4) != 0 ? true : z11, videoTrackingInfo, iconDTO);
            }
        }
    }
}
