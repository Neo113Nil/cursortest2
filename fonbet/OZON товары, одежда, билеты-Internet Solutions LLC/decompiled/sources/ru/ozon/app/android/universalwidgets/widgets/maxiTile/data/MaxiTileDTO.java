package ru.ozon.app.android.universalwidgets.widgets.maxiTile.data;

import T7.P;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.addtocart.AddToCartButtonDTO;
import ru.ozon.app.android.storefront.data.tiles.common.ContentMode;
import ru.ozon.app.android.storefront.data.tiles.labellist.LabelListDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0004%&'(B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0019\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0007HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003J?\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020$HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006)"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO;", "", "gallery", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "mainState", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;", "multiButton", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;", "options", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Options;", "<init>", "(Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Options;)V", "getGallery", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "getMainState", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;", "getMultiButton", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;", "getOptions", "()Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Options;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "", "Gallery", "MainState", "MultiButton", "Options", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MaxiTileDTO {
    private final CommonControlSettings common;

    @NotNull
    private final Gallery gallery;

    @NotNull
    private final MainState mainState;

    @NotNull
    private final MultiButton multiButton;
    private final Options options;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0017B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;", "", "imageItems", "", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery$ImageItem;", "common", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "<init>", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/CommonControlSettings;)V", "getImageItems", "()Ljava/util/List;", "getCommon", "()Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "ImageItem", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Gallery {
        private final CommonControlSettings common;

        @NotNull
        private final List<ImageItem> imageItems;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0011\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\b\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery$ImageItem;", "", "link", "", "contentMode", "Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;Ljava/util/Map;)V", "getLink", "()Ljava/lang/String;", "getContentMode", "()Lru/ozon/app/android/storefront/data/tiles/common/ContentMode;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class ImageItem {
            private final ContentMode contentMode;

            @NotNull
            private final String link;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public ImageItem(@NotNull String link, ContentMode contentMode, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(link, "link");
                this.link = link;
                this.contentMode = contentMode;
                this.trackingInfo = map;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ ImageItem copy$default(ImageItem imageItem, String str, ContentMode contentMode, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = imageItem.link;
                }
                if ((i11 & 2) != 0) {
                    contentMode = imageItem.contentMode;
                }
                if ((i11 & 4) != 0) {
                    map = imageItem.trackingInfo;
                }
                return imageItem.copy(str, contentMode, map);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLink() {
                return this.link;
            }

            /* renamed from: component2, reason: from getter */
            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            public final Map<String, TokenizedTrackingInfo> component3() {
                return this.trackingInfo;
            }

            @NotNull
            public final ImageItem copy(@NotNull String link, ContentMode contentMode, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(link, "link");
                return new ImageItem(link, contentMode, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof ImageItem)) {
                    return false;
                }
                ImageItem imageItem = (ImageItem) other;
                return Intrinsics.d(this.link, imageItem.link) && this.contentMode == imageItem.contentMode && Intrinsics.d(this.trackingInfo, imageItem.trackingInfo);
            }

            public final ContentMode getContentMode() {
                return this.contentMode;
            }

            @NotNull
            public final String getLink() {
                return this.link;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.link.hashCode() * 31;
                ContentMode contentMode = this.contentMode;
                int hashCode2 = (hashCode + (contentMode == null ? 0 : contentMode.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.link;
                ContentMode contentMode = this.contentMode;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder sb2 = new StringBuilder("ImageItem(link=");
                sb2.append(str);
                sb2.append(", contentMode=");
                sb2.append(contentMode);
                sb2.append(", trackingInfo=");
                return P.f(sb2, map, ")");
            }
        }

        public Gallery(@NotNull List<ImageItem> imageItems, CommonControlSettings commonControlSettings) {
            Intrinsics.checkNotNullParameter(imageItems, "imageItems");
            this.imageItems = imageItems;
            this.common = commonControlSettings;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Gallery copy$default(Gallery gallery, List list, CommonControlSettings commonControlSettings, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                list = gallery.imageItems;
            }
            if ((i11 & 2) != 0) {
                commonControlSettings = gallery.common;
            }
            return gallery.copy(list, commonControlSettings);
        }

        @NotNull
        public final List<ImageItem> component1() {
            return this.imageItems;
        }

        /* renamed from: component2, reason: from getter */
        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final Gallery copy(@NotNull List<ImageItem> imageItems, CommonControlSettings common) {
            Intrinsics.checkNotNullParameter(imageItems, "imageItems");
            return new Gallery(imageItems, common);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Gallery)) {
                return false;
            }
            Gallery gallery = (Gallery) other;
            return Intrinsics.d(this.imageItems, gallery.imageItems) && Intrinsics.d(this.common, gallery.common);
        }

        public final CommonControlSettings getCommon() {
            return this.common;
        }

        @NotNull
        public final List<ImageItem> getImageItems() {
            return this.imageItems;
        }

        public int hashCode() {
            int hashCode = this.imageItems.hashCode() * 31;
            CommonControlSettings commonControlSettings = this.common;
            return hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode());
        }

        @NotNull
        public String toString() {
            return "Gallery(imageItems=" + this.imageItems + ", common=" + this.common + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\t\u0010\u0010\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J+\u0010\u0013\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;", "", "text", "Lru/ozon/uni/atoms/data/text/TextDTO;", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "labelList", "Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO;", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO;)V", "getText", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getLabelList", "()Lru/ozon/app/android/storefront/data/tiles/labellist/LabelListDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MainState {
        private final LabelListDTO labelList;
        private final PriceDTO price;

        @NotNull
        private final TextDTO text;

        public MainState(@NotNull TextDTO text, PriceDTO priceDTO, LabelListDTO labelListDTO) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.text = text;
            this.price = priceDTO;
            this.labelList = labelListDTO;
        }

        public static /* synthetic */ MainState copy$default(MainState mainState, TextDTO textDTO, PriceDTO priceDTO, LabelListDTO labelListDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = mainState.text;
            }
            if ((i11 & 2) != 0) {
                priceDTO = mainState.price;
            }
            if ((i11 & 4) != 0) {
                labelListDTO = mainState.labelList;
            }
            return mainState.copy(textDTO, priceDTO, labelListDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final TextDTO getText() {
            return this.text;
        }

        /* renamed from: component2, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component3, reason: from getter */
        public final LabelListDTO getLabelList() {
            return this.labelList;
        }

        @NotNull
        public final MainState copy(@NotNull TextDTO text, PriceDTO price, LabelListDTO labelList) {
            Intrinsics.checkNotNullParameter(text, "text");
            return new MainState(text, price, labelList);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MainState)) {
                return false;
            }
            MainState mainState = (MainState) other;
            return Intrinsics.d(this.text, mainState.text) && Intrinsics.d(this.price, mainState.price) && Intrinsics.d(this.labelList, mainState.labelList);
        }

        public final LabelListDTO getLabelList() {
            return this.labelList;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        @NotNull
        public final TextDTO getText() {
            return this.text;
        }

        public int hashCode() {
            int hashCode = this.text.hashCode() * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            LabelListDTO labelListDTO = this.labelList;
            return hashCode2 + (labelListDTO != null ? labelListDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "MainState(text=" + this.text + ", price=" + this.price + ", labelList=" + this.labelList + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001f\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;", "", "detailsButton", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "addToCartButton", "Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;)V", "getDetailsButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getAddToCartButton", "()Lru/ozon/app/android/storefront/data/tiles/addtocart/AddToCartButtonDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class MultiButton {

        @NotNull
        private final AddToCartButtonDTO addToCartButton;
        private final ButtonV3DTO detailsButton;

        public MultiButton(ButtonV3DTO buttonV3DTO, @NotNull AddToCartButtonDTO addToCartButton) {
            Intrinsics.checkNotNullParameter(addToCartButton, "addToCartButton");
            this.detailsButton = buttonV3DTO;
            this.addToCartButton = addToCartButton;
        }

        public static /* synthetic */ MultiButton copy$default(MultiButton multiButton, ButtonV3DTO buttonV3DTO, AddToCartButtonDTO addToCartButtonDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                buttonV3DTO = multiButton.detailsButton;
            }
            if ((i11 & 2) != 0) {
                addToCartButtonDTO = multiButton.addToCartButton;
            }
            return multiButton.copy(buttonV3DTO, addToCartButtonDTO);
        }

        /* renamed from: component1, reason: from getter */
        public final ButtonV3DTO getDetailsButton() {
            return this.detailsButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AddToCartButtonDTO getAddToCartButton() {
            return this.addToCartButton;
        }

        @NotNull
        public final MultiButton copy(ButtonV3DTO detailsButton, @NotNull AddToCartButtonDTO addToCartButton) {
            Intrinsics.checkNotNullParameter(addToCartButton, "addToCartButton");
            return new MultiButton(detailsButton, addToCartButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MultiButton)) {
                return false;
            }
            MultiButton multiButton = (MultiButton) other;
            return Intrinsics.d(this.detailsButton, multiButton.detailsButton) && Intrinsics.d(this.addToCartButton, multiButton.addToCartButton);
        }

        @NotNull
        public final AddToCartButtonDTO getAddToCartButton() {
            return this.addToCartButton;
        }

        public final ButtonV3DTO getDetailsButton() {
            return this.detailsButton;
        }

        public int hashCode() {
            ButtonV3DTO buttonV3DTO = this.detailsButton;
            return this.addToCartButton.hashCode() + ((buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31);
        }

        @NotNull
        public String toString() {
            return "MultiButton(detailsButton=" + this.detailsButton + ", addToCartButton=" + this.addToCartButton + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\t\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\u0007J\u001a\u0010\n\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u000bJ\u0013\u0010\f\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\n\n\u0002\u0010\b\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Options;", "", "enableParanja", "", "<init>", "(Ljava/lang/Boolean;)V", "getEnableParanja", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "copy", "(Ljava/lang/Boolean;)Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Options;", "equals", "other", "hashCode", "", "toString", "", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final Boolean enableParanja;

        public Options(Boolean bool) {
            this.enableParanja = bool;
        }

        public static /* synthetic */ Options copy$default(Options options, Boolean bool, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                bool = options.enableParanja;
            }
            return options.copy(bool);
        }

        /* renamed from: component1, reason: from getter */
        public final Boolean getEnableParanja() {
            return this.enableParanja;
        }

        @NotNull
        public final Options copy(Boolean enableParanja) {
            return new Options(enableParanja);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof Options) && Intrinsics.d(this.enableParanja, ((Options) other).enableParanja);
        }

        public final Boolean getEnableParanja() {
            return this.enableParanja;
        }

        public int hashCode() {
            Boolean bool = this.enableParanja;
            if (bool == null) {
                return 0;
            }
            return bool.hashCode();
        }

        @NotNull
        public String toString() {
            return "Options(enableParanja=" + this.enableParanja + ")";
        }
    }

    public MaxiTileDTO(@NotNull Gallery gallery, CommonControlSettings commonControlSettings, @NotNull MainState mainState, @NotNull MultiButton multiButton, Options options) {
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(mainState, "mainState");
        Intrinsics.checkNotNullParameter(multiButton, "multiButton");
        this.gallery = gallery;
        this.common = commonControlSettings;
        this.mainState = mainState;
        this.multiButton = multiButton;
        this.options = options;
    }

    public static /* synthetic */ MaxiTileDTO copy$default(MaxiTileDTO maxiTileDTO, Gallery gallery, CommonControlSettings commonControlSettings, MainState mainState, MultiButton multiButton, Options options, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            gallery = maxiTileDTO.gallery;
        }
        if ((i11 & 2) != 0) {
            commonControlSettings = maxiTileDTO.common;
        }
        if ((i11 & 4) != 0) {
            mainState = maxiTileDTO.mainState;
        }
        if ((i11 & 8) != 0) {
            multiButton = maxiTileDTO.multiButton;
        }
        if ((i11 & 16) != 0) {
            options = maxiTileDTO.options;
        }
        Options options2 = options;
        MainState mainState2 = mainState;
        return maxiTileDTO.copy(gallery, commonControlSettings, mainState2, multiButton, options2);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final Gallery getGallery() {
        return this.gallery;
    }

    /* renamed from: component2, reason: from getter */
    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final MainState getMainState() {
        return this.mainState;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final MultiButton getMultiButton() {
        return this.multiButton;
    }

    /* renamed from: component5, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @NotNull
    public final MaxiTileDTO copy(@NotNull Gallery gallery, CommonControlSettings common, @NotNull MainState mainState, @NotNull MultiButton multiButton, Options options) {
        Intrinsics.checkNotNullParameter(gallery, "gallery");
        Intrinsics.checkNotNullParameter(mainState, "mainState");
        Intrinsics.checkNotNullParameter(multiButton, "multiButton");
        return new MaxiTileDTO(gallery, common, mainState, multiButton, options);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MaxiTileDTO)) {
            return false;
        }
        MaxiTileDTO maxiTileDTO = (MaxiTileDTO) other;
        return Intrinsics.d(this.gallery, maxiTileDTO.gallery) && Intrinsics.d(this.common, maxiTileDTO.common) && Intrinsics.d(this.mainState, maxiTileDTO.mainState) && Intrinsics.d(this.multiButton, maxiTileDTO.multiButton) && Intrinsics.d(this.options, maxiTileDTO.options);
    }

    public final CommonControlSettings getCommon() {
        return this.common;
    }

    @NotNull
    public final Gallery getGallery() {
        return this.gallery;
    }

    @NotNull
    public final MainState getMainState() {
        return this.mainState;
    }

    @NotNull
    public final MultiButton getMultiButton() {
        return this.multiButton;
    }

    public final Options getOptions() {
        return this.options;
    }

    public int hashCode() {
        int hashCode = this.gallery.hashCode() * 31;
        CommonControlSettings commonControlSettings = this.common;
        int hashCode2 = (this.multiButton.hashCode() + ((this.mainState.hashCode() + ((hashCode + (commonControlSettings == null ? 0 : commonControlSettings.hashCode())) * 31)) * 31)) * 31;
        Options options = this.options;
        return hashCode2 + (options != null ? options.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "MaxiTileDTO(gallery=" + this.gallery + ", common=" + this.common + ", mainState=" + this.mainState + ", multiButton=" + this.multiButton + ", options=" + this.options + ")";
    }
}
