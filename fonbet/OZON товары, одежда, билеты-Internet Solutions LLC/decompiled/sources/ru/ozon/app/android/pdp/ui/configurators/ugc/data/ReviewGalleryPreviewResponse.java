package ru.ozon.app.android.pdp.ui.configurators.ugc.data;

import Ih.a;
import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.video.preload.data.PreloadVideoInfo;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0019B!\u0012\u000e\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0011\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\u0010\b\u0002\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001R$\u0010\u0002\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\t\u0010\n\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse;", "", "items", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse$ItemDTO;", "nextItemsAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getNextItemsAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ItemDTO", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ReviewGalleryPreviewResponse {
    public static final int $stable = 8;
    private final List<ItemDTO> items;
    private final AtomActionDTO nextItemsAction;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JA\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/ui/configurators/ugc/data/ReviewGalleryPreviewResponse$ItemDTO;", "", "image", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "icon", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "videoInfo", "Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;)V", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getIcon", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getVideoInfo", "()Lru/ozon/app/android/video/preload/data/PreloadVideoInfo;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "configurators_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes6.dex */
    public static final /* data */ class ItemDTO {
        public static final int $stable = PreloadVideoInfo.$stable | IconButtonV3DTO.$stable;

        @NotNull
        private final AtomActionDTO action;
        private final IconButtonV3DTO icon;

        @NotNull
        private final ImageDTO image;
        private final TextDTO text;
        private final PreloadVideoInfo videoInfo;

        public ItemDTO(@NotNull ImageDTO image, @NotNull AtomActionDTO action, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, PreloadVideoInfo preloadVideoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            this.image = image;
            this.action = action;
            this.icon = iconButtonV3DTO;
            this.text = textDTO;
            this.videoInfo = preloadVideoInfo;
        }

        public static /* synthetic */ ItemDTO copy$default(ItemDTO itemDTO, ImageDTO imageDTO, AtomActionDTO atomActionDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, PreloadVideoInfo preloadVideoInfo, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = itemDTO.image;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = itemDTO.action;
            }
            if ((i11 & 4) != 0) {
                iconButtonV3DTO = itemDTO.icon;
            }
            if ((i11 & 8) != 0) {
                textDTO = itemDTO.text;
            }
            if ((i11 & 16) != 0) {
                preloadVideoInfo = itemDTO.videoInfo;
            }
            PreloadVideoInfo preloadVideoInfo2 = preloadVideoInfo;
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            return itemDTO.copy(imageDTO, atomActionDTO, iconButtonV3DTO2, textDTO, preloadVideoInfo2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getImage() {
            return this.image;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final IconButtonV3DTO getIcon() {
            return this.icon;
        }

        /* renamed from: component4, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component5, reason: from getter */
        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        @NotNull
        public final ItemDTO copy(@NotNull ImageDTO image, @NotNull AtomActionDTO action, IconButtonV3DTO icon, TextDTO text, PreloadVideoInfo videoInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(action, "action");
            return new ItemDTO(image, action, icon, text, videoInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ItemDTO)) {
                return false;
            }
            ItemDTO itemDTO = (ItemDTO) other;
            return Intrinsics.d(this.image, itemDTO.image) && Intrinsics.d(this.action, itemDTO.action) && Intrinsics.d(this.icon, itemDTO.icon) && Intrinsics.d(this.text, itemDTO.text) && Intrinsics.d(this.videoInfo, itemDTO.videoInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final IconButtonV3DTO getIcon() {
            return this.icon;
        }

        @NotNull
        public final ImageDTO getImage() {
            return this.image;
        }

        public final TextDTO getText() {
            return this.text;
        }

        public final PreloadVideoInfo getVideoInfo() {
            return this.videoInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.image.hashCode() * 31, 31);
            IconButtonV3DTO iconButtonV3DTO = this.icon;
            int hashCode = (b11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
            TextDTO textDTO = this.text;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            PreloadVideoInfo preloadVideoInfo = this.videoInfo;
            return hashCode2 + (preloadVideoInfo != null ? preloadVideoInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "ItemDTO(image=" + this.image + ", action=" + this.action + ", icon=" + this.icon + ", text=" + this.text + ", videoInfo=" + this.videoInfo + ")";
        }
    }

    public ReviewGalleryPreviewResponse(List<ItemDTO> list, AtomActionDTO atomActionDTO) {
        this.items = list;
        this.nextItemsAction = atomActionDTO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReviewGalleryPreviewResponse copy$default(ReviewGalleryPreviewResponse reviewGalleryPreviewResponse, List list, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = reviewGalleryPreviewResponse.items;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = reviewGalleryPreviewResponse.nextItemsAction;
        }
        return reviewGalleryPreviewResponse.copy(list, atomActionDTO);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    public final List<ItemDTO> component1() {
        return this.items;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getNextItemsAction() {
        return this.nextItemsAction;
    }

    @NotNull
    public final ReviewGalleryPreviewResponse copy(List<ItemDTO> items, AtomActionDTO nextItemsAction) {
        return new ReviewGalleryPreviewResponse(items, nextItemsAction);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReviewGalleryPreviewResponse)) {
            return false;
        }
        ReviewGalleryPreviewResponse reviewGalleryPreviewResponse = (ReviewGalleryPreviewResponse) other;
        return Intrinsics.d(this.items, reviewGalleryPreviewResponse.items) && Intrinsics.d(this.nextItemsAction, reviewGalleryPreviewResponse.nextItemsAction);
    }

    public final List<ItemDTO> getItems() {
        return this.items;
    }

    public final AtomActionDTO getNextItemsAction() {
        return this.nextItemsAction;
    }

    public int hashCode() {
        List<ItemDTO> list = this.items;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.nextItemsAction;
        return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ReviewGalleryPreviewResponse(items=" + this.items + ", nextItemsAction=" + this.nextItemsAction + ")";
    }
}
