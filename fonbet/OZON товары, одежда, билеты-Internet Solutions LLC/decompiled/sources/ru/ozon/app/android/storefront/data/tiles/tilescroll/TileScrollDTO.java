package ru.ozon.app.android.storefront.data.tiles.tilescroll;

import G.g;
import HY.b;
import Ih.a;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.common.TileTheme;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\b\u0087\b\u0018\u0000 32\u00020\u0001:\u000534567B_\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0013\u0010\u0014J\u000b\u0010%\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010'\u001a\u0004\u0018\u00010\bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003J\u0017\u0010*\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000eHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\u0012HÆ\u0003Jm\u0010,\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÆ\u0001J\u0013\u0010-\u001a\u00020.2\b\u0010/\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00100\u001a\u000201HÖ\u0001J\t\u00102\u001a\u00020\u000fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0017\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u001f\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\"R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0012¢\u0006\b\n\u0000\u001a\u0004\b#\u0010$¨\u00068"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "items", "", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "options", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options;", "banner", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;", "allProductsButton", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "sharedData", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/util/List;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;Ljava/util/Map;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;)V", "getHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getOptions", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options;", "getBanner", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;", "getAllProductsButton", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;", "getTrackingInfo", "()Ljava/util/Map;", "getSharedData", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "", "other", "hashCode", "", "toString", "Companion", "Options", "Banner", "AllProductsButton", "SharedData", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class TileScrollDTO {

    @Deprecated
    @NotNull
    public static final String BUTTON = "button";

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Deprecated
    @NotNull
    public static final String IMAGE = "image";
    private final AllProductsButton allProductsButton;
    private final Banner banner;
    private final HeaderDTO header;

    @NotNull
    private final List<SmallTileMoleculeDTO> items;
    private final Options options;
    private final SharedData sharedData;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$AllProductsButton;", "", "iconButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "textAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getIconButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTextAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AllProductsButton {

        @NotNull
        private final IconButtonV3DTO iconButton;

        @NotNull
        private final TextDTO textAtom;

        public AllProductsButton(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO textAtom) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(textAtom, "textAtom");
            this.iconButton = iconButton;
            this.textAtom = textAtom;
        }

        public static /* synthetic */ AllProductsButton copy$default(AllProductsButton allProductsButton, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                iconButtonV3DTO = allProductsButton.iconButton;
            }
            if ((i11 & 2) != 0) {
                textDTO = allProductsButton.textAtom;
            }
            return allProductsButton.copy(iconButtonV3DTO, textDTO);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTextAtom() {
            return this.textAtom;
        }

        @NotNull
        public final AllProductsButton copy(@NotNull IconButtonV3DTO iconButton, @NotNull TextDTO textAtom) {
            Intrinsics.checkNotNullParameter(iconButton, "iconButton");
            Intrinsics.checkNotNullParameter(textAtom, "textAtom");
            return new AllProductsButton(iconButton, textAtom);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AllProductsButton)) {
                return false;
            }
            AllProductsButton allProductsButton = (AllProductsButton) other;
            return Intrinsics.d(this.iconButton, allProductsButton.iconButton) && Intrinsics.d(this.textAtom, allProductsButton.textAtom);
        }

        @NotNull
        public final IconButtonV3DTO getIconButton() {
            return this.iconButton;
        }

        @NotNull
        public final TextDTO getTextAtom() {
            return this.textAtom;
        }

        public int hashCode() {
            return this.textAtom.hashCode() + (this.iconButton.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "AllProductsButton(iconButton=" + this.iconButton + ", textAtom=" + this.textAtom + ")";
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Companion;", "", "<init>", "()V", "BUTTON", "", "IMAGE", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes2.dex */
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$SharedData;", "", "blurItemInfo", "", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "<init>", "(Ljava/util/Map;)V", "getBlurItemInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SharedData {
        private final Map<String, BlurMoleculeContentDTO> blurItemInfo;

        public SharedData(Map<String, BlurMoleculeContentDTO> map) {
            this.blurItemInfo = map;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ SharedData copy$default(SharedData sharedData, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                map = sharedData.blurItemInfo;
            }
            return sharedData.copy(map);
        }

        public final Map<String, BlurMoleculeContentDTO> component1() {
            return this.blurItemInfo;
        }

        @NotNull
        public final SharedData copy(Map<String, BlurMoleculeContentDTO> blurItemInfo) {
            return new SharedData(blurItemInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            return (other instanceof SharedData) && Intrinsics.d(this.blurItemInfo, ((SharedData) other).blurItemInfo);
        }

        public final Map<String, BlurMoleculeContentDTO> getBlurItemInfo() {
            return this.blurItemInfo;
        }

        public int hashCode() {
            Map<String, BlurMoleculeContentDTO> map = this.blurItemInfo;
            if (map == null) {
                return 0;
            }
            return map.hashCode();
        }

        @NotNull
        public String toString() {
            return b.b("SharedData(blurItemInfo=", ")", this.blurItemInfo);
        }
    }

    public TileScrollDTO(HeaderDTO headerDTO, @NotNull List<SmallTileMoleculeDTO> items, Options options, Banner banner, AllProductsButton allProductsButton, Map<String, TokenizedTrackingInfo> map, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = headerDTO;
        this.items = items;
        this.options = options;
        this.banner = banner;
        this.allProductsButton = allProductsButton;
        this.trackingInfo = map;
        this.sharedData = sharedData;
    }

    public static /* synthetic */ TileScrollDTO copy$default(TileScrollDTO tileScrollDTO, HeaderDTO headerDTO, List list, Options options, Banner banner, AllProductsButton allProductsButton, Map map, SharedData sharedData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = tileScrollDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = tileScrollDTO.items;
        }
        if ((i11 & 4) != 0) {
            options = tileScrollDTO.options;
        }
        if ((i11 & 8) != 0) {
            banner = tileScrollDTO.banner;
        }
        if ((i11 & 16) != 0) {
            allProductsButton = tileScrollDTO.allProductsButton;
        }
        if ((i11 & 32) != 0) {
            map = tileScrollDTO.trackingInfo;
        }
        if ((i11 & 64) != 0) {
            sharedData = tileScrollDTO.sharedData;
        }
        Map map2 = map;
        SharedData sharedData2 = sharedData;
        AllProductsButton allProductsButton2 = allProductsButton;
        Options options2 = options;
        return tileScrollDTO.copy(headerDTO, list, options2, banner, allProductsButton2, map2, sharedData2);
    }

    @JsonCollectionDecoding
    public static /* synthetic */ void getItems$annotations() {
    }

    /* renamed from: component1, reason: from getter */
    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SmallTileMoleculeDTO> component2() {
        return this.items;
    }

    /* renamed from: component3, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    /* renamed from: component4, reason: from getter */
    public final Banner getBanner() {
        return this.banner;
    }

    /* renamed from: component5, reason: from getter */
    public final AllProductsButton getAllProductsButton() {
        return this.allProductsButton;
    }

    public final Map<String, TokenizedTrackingInfo> component6() {
        return this.trackingInfo;
    }

    /* renamed from: component7, reason: from getter */
    public final SharedData getSharedData() {
        return this.sharedData;
    }

    @NotNull
    public final TileScrollDTO copy(HeaderDTO header, @NotNull List<SmallTileMoleculeDTO> items, Options options, Banner banner, AllProductsButton allProductsButton, Map<String, TokenizedTrackingInfo> trackingInfo, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TileScrollDTO(header, items, options, banner, allProductsButton, trackingInfo, sharedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileScrollDTO)) {
            return false;
        }
        TileScrollDTO tileScrollDTO = (TileScrollDTO) other;
        return Intrinsics.d(this.header, tileScrollDTO.header) && Intrinsics.d(this.items, tileScrollDTO.items) && Intrinsics.d(this.options, tileScrollDTO.options) && Intrinsics.d(this.banner, tileScrollDTO.banner) && Intrinsics.d(this.allProductsButton, tileScrollDTO.allProductsButton) && Intrinsics.d(this.trackingInfo, tileScrollDTO.trackingInfo) && Intrinsics.d(this.sharedData, tileScrollDTO.sharedData);
    }

    public final AllProductsButton getAllProductsButton() {
        return this.allProductsButton;
    }

    public final Banner getBanner() {
        return this.banner;
    }

    public final HeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<SmallTileMoleculeDTO> getItems() {
        return this.items;
    }

    public final Options getOptions() {
        return this.options;
    }

    public final SharedData getSharedData() {
        return this.sharedData;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        HeaderDTO headerDTO = this.header;
        int b11 = g.b((headerDTO == null ? 0 : headerDTO.hashCode()) * 31, 31, this.items);
        Options options = this.options;
        int hashCode = (b11 + (options == null ? 0 : options.hashCode())) * 31;
        Banner banner = this.banner;
        int hashCode2 = (hashCode + (banner == null ? 0 : banner.hashCode())) * 31;
        AllProductsButton allProductsButton = this.allProductsButton;
        int hashCode3 = (hashCode2 + (allProductsButton == null ? 0 : allProductsButton.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode4 = (hashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        SharedData sharedData = this.sharedData;
        return hashCode4 + (sharedData != null ? sharedData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TileScrollDTO(header=" + this.header + ", items=" + this.items + ", options=" + this.options + ", banner=" + this.banner + ", allProductsButton=" + this.allProductsButton + ", trackingInfo=" + this.trackingInfo + ", sharedData=" + this.sharedData + ")";
    }

    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001+BK\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0001\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\u0004\b\u0010\u0010\u0011J\t\u0010\u001e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003J\t\u0010!\u001a\u00020\tHÆ\u0003J\u000b\u0010\"\u001a\u0004\u0018\u00010\u000bHÆ\u0003J\u0017\u0010#\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0003JW\u0010$\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\b\b\u0003\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b2\u0016\b\u0002\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\rHÆ\u0001J\u0013\u0010%\u001a\u00020&2\b\u0010'\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010(\u001a\u00020)HÖ\u0001J\t\u0010*\u001a\u00020\u000eHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u001f\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0018\u00010\r¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001d¨\u0006,"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner;", "", "bannerImage", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "topTextAtom", "Lru/ozon/uni/atoms/data/text/TextDTO;", "bottomBannerItem", "Lru/ozon/uni/atoms/data/AtomDTO;", "gradient", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/AtomDTO;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient;Ljava/util/Map;)V", "getBannerImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTopTextAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getBottomBannerItem", "()Lru/ozon/uni/atoms/data/AtomDTO;", "getGradient", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "copy", "equals", "", "other", "hashCode", "", "toString", "Gradient", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Banner {

        @NotNull
        private final AtomActionDTO action;

        @NotNull
        private final ImageDTO bannerImage;

        @NotNull
        private final AtomDTO bottomBannerItem;
        private final Gradient gradient;
        private final TextDTO topTextAtom;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        public Banner(@NotNull ImageDTO bannerImage, @NotNull AtomActionDTO action, TextDTO textDTO, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO bottomBannerItem, Gradient gradient, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(bannerImage, "bannerImage");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(bottomBannerItem, "bottomBannerItem");
            this.bannerImage = bannerImage;
            this.action = action;
            this.topTextAtom = textDTO;
            this.bottomBannerItem = bottomBannerItem;
            this.gradient = gradient;
            this.trackingInfo = map;
        }

        public static /* synthetic */ Banner copy$default(Banner banner, ImageDTO imageDTO, AtomActionDTO atomActionDTO, TextDTO textDTO, AtomDTO atomDTO, Gradient gradient, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                imageDTO = banner.bannerImage;
            }
            if ((i11 & 2) != 0) {
                atomActionDTO = banner.action;
            }
            if ((i11 & 4) != 0) {
                textDTO = banner.topTextAtom;
            }
            if ((i11 & 8) != 0) {
                atomDTO = banner.bottomBannerItem;
            }
            if ((i11 & 16) != 0) {
                gradient = banner.gradient;
            }
            if ((i11 & 32) != 0) {
                map = banner.trackingInfo;
            }
            Gradient gradient2 = gradient;
            Map map2 = map;
            return banner.copy(imageDTO, atomActionDTO, textDTO, atomDTO, gradient2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final ImageDTO getBannerImage() {
            return this.bannerImage;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component3, reason: from getter */
        public final TextDTO getTopTextAtom() {
            return this.topTextAtom;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomDTO getBottomBannerItem() {
            return this.bottomBannerItem;
        }

        /* renamed from: component5, reason: from getter */
        public final Gradient getGradient() {
            return this.gradient;
        }

        public final Map<String, TokenizedTrackingInfo> component6() {
            return this.trackingInfo;
        }

        @NotNull
        public final Banner copy(@NotNull ImageDTO bannerImage, @NotNull AtomActionDTO action, TextDTO topTextAtom, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "button", type = ButtonV3DTO.class), @ProtoOneOfSignature(name = "image", type = ImageDTO.class)}) @NotNull @ProtoOneOf(label = "type") AtomDTO bottomBannerItem, Gradient gradient, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(bannerImage, "bannerImage");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(bottomBannerItem, "bottomBannerItem");
            return new Banner(bannerImage, action, topTextAtom, bottomBannerItem, gradient, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Banner)) {
                return false;
            }
            Banner banner = (Banner) other;
            return Intrinsics.d(this.bannerImage, banner.bannerImage) && Intrinsics.d(this.action, banner.action) && Intrinsics.d(this.topTextAtom, banner.topTextAtom) && Intrinsics.d(this.bottomBannerItem, banner.bottomBannerItem) && Intrinsics.d(this.gradient, banner.gradient) && Intrinsics.d(this.trackingInfo, banner.trackingInfo);
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        @NotNull
        public final ImageDTO getBannerImage() {
            return this.bannerImage;
        }

        @NotNull
        public final AtomDTO getBottomBannerItem() {
            return this.bottomBannerItem;
        }

        public final Gradient getGradient() {
            return this.gradient;
        }

        public final TextDTO getTopTextAtom() {
            return this.topTextAtom;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int b11 = a.b(this.action, this.bannerImage.hashCode() * 31, 31);
            TextDTO textDTO = this.topTextAtom;
            int hashCode = (this.bottomBannerItem.hashCode() + ((b11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31)) * 31;
            Gradient gradient = this.gradient;
            int hashCode2 = (hashCode + (gradient == null ? 0 : gradient.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode2 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Banner(bannerImage=" + this.bannerImage + ", action=" + this.action + ", topTextAtom=" + this.topTextAtom + ", bottomBannerItem=" + this.bottomBannerItem + ", gradient=" + this.gradient + ", trackingInfo=" + this.trackingInfo + ")";
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient;", "", "gradientToken", "", "direction", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient$GradientDirection;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient$GradientDirection;)V", "getGradientToken", "()Ljava/lang/String;", "getDirection", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient$GradientDirection;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "GradientDirection", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Gradient {

            @NotNull
            private final GradientDirection direction;

            @NotNull
            private final String gradientToken;

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Banner$Gradient$GradientDirection;", "", "<init>", "(Ljava/lang/String;I)V", "TOP_BOTTOM", "BOTTOM_TOP", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final class GradientDirection {
                private static final /* synthetic */ Xc.a $ENTRIES;
                private static final /* synthetic */ GradientDirection[] $VALUES;
                public static final GradientDirection TOP_BOTTOM = new GradientDirection("TOP_BOTTOM", 0);
                public static final GradientDirection BOTTOM_TOP = new GradientDirection("BOTTOM_TOP", 1);

                private static final /* synthetic */ GradientDirection[] $values() {
                    return new GradientDirection[]{TOP_BOTTOM, BOTTOM_TOP};
                }

                static {
                    GradientDirection[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = Xc.b.a($values);
                }

                private GradientDirection(String str, int i11) {
                }

                public static GradientDirection valueOf(String str) {
                    return (GradientDirection) Enum.valueOf(GradientDirection.class, str);
                }

                public static GradientDirection[] values() {
                    return (GradientDirection[]) $VALUES.clone();
                }
            }

            public Gradient(@NotNull String gradientToken, @NotNull GradientDirection direction) {
                Intrinsics.checkNotNullParameter(gradientToken, "gradientToken");
                Intrinsics.checkNotNullParameter(direction, "direction");
                this.gradientToken = gradientToken;
                this.direction = direction;
            }

            public static /* synthetic */ Gradient copy$default(Gradient gradient, String str, GradientDirection gradientDirection, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = gradient.gradientToken;
                }
                if ((i11 & 2) != 0) {
                    gradientDirection = gradient.direction;
                }
                return gradient.copy(str, gradientDirection);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getGradientToken() {
                return this.gradientToken;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final GradientDirection getDirection() {
                return this.direction;
            }

            @NotNull
            public final Gradient copy(@NotNull String gradientToken, @NotNull GradientDirection direction) {
                Intrinsics.checkNotNullParameter(gradientToken, "gradientToken");
                Intrinsics.checkNotNullParameter(direction, "direction");
                return new Gradient(gradientToken, direction);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Gradient)) {
                    return false;
                }
                Gradient gradient = (Gradient) other;
                return Intrinsics.d(this.gradientToken, gradient.gradientToken) && this.direction == gradient.direction;
            }

            @NotNull
            public final GradientDirection getDirection() {
                return this.direction;
            }

            @NotNull
            public final String getGradientToken() {
                return this.gradientToken;
            }

            public int hashCode() {
                return this.direction.hashCode() + (this.gradientToken.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "Gradient(gradientToken=" + this.gradientToken + ", direction=" + this.direction + ")";
            }

            public /* synthetic */ Gradient(String str, GradientDirection gradientDirection, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? GradientDirection.TOP_BOTTOM : gradientDirection);
            }
        }
    }

    @Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001$B9\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\u000b\u0010\u0018\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003JC\u0010\u001d\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001J\u0013\u0010\u001e\u001a\u00020\u001f2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010!\u001a\u00020\"HÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017¨\u0006%"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options;", "", "backgroundColor", "", "visibleCellsCount", "Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options$VisibleCellsCount;", "smallTileOptions", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "theme", "Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options$VisibleCellsCount;Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;)V", "getBackgroundColor", "()Ljava/lang/String;", "getVisibleCellsCount", "()Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options$VisibleCellsCount;", "getSmallTileOptions", "()Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTheme", "()Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "VisibleCellsCount", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Options {
        private final String backgroundColor;
        private final SmallTileMoleculeDTO.SmallTileOptions smallTileOptions;
        private final TestInfo testInfo;
        private final TileTheme theme;

        @NotNull
        private final VisibleCellsCount visibleCellsCount;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/storefront/data/tiles/tilescroll/TileScrollDTO$Options$VisibleCellsCount;", "", "<init>", "(Ljava/lang/String;I)V", "COUNT_3_5", "COUNT_2_4", "tiles_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class VisibleCellsCount {
            private static final /* synthetic */ Xc.a $ENTRIES;
            private static final /* synthetic */ VisibleCellsCount[] $VALUES;
            public static final VisibleCellsCount COUNT_3_5 = new VisibleCellsCount("COUNT_3_5", 0);
            public static final VisibleCellsCount COUNT_2_4 = new VisibleCellsCount("COUNT_2_4", 1);

            private static final /* synthetic */ VisibleCellsCount[] $values() {
                return new VisibleCellsCount[]{COUNT_3_5, COUNT_2_4};
            }

            static {
                VisibleCellsCount[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private VisibleCellsCount(String str, int i11) {
            }

            public static VisibleCellsCount valueOf(String str) {
                return (VisibleCellsCount) Enum.valueOf(VisibleCellsCount.class, str);
            }

            public static VisibleCellsCount[] values() {
                return (VisibleCellsCount[]) $VALUES.clone();
            }
        }

        public Options(String str, @NotNull VisibleCellsCount visibleCellsCount, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme tileTheme) {
            Intrinsics.checkNotNullParameter(visibleCellsCount, "visibleCellsCount");
            this.backgroundColor = str;
            this.visibleCellsCount = visibleCellsCount;
            this.smallTileOptions = smallTileOptions;
            this.testInfo = testInfo;
            this.theme = tileTheme;
        }

        public static /* synthetic */ Options copy$default(Options options, String str, VisibleCellsCount visibleCellsCount, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme tileTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = options.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                visibleCellsCount = options.visibleCellsCount;
            }
            if ((i11 & 4) != 0) {
                smallTileOptions = options.smallTileOptions;
            }
            if ((i11 & 8) != 0) {
                testInfo = options.testInfo;
            }
            if ((i11 & 16) != 0) {
                tileTheme = options.theme;
            }
            TileTheme tileTheme2 = tileTheme;
            SmallTileMoleculeDTO.SmallTileOptions smallTileOptions2 = smallTileOptions;
            return options.copy(str, visibleCellsCount, smallTileOptions2, testInfo, tileTheme2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final VisibleCellsCount getVisibleCellsCount() {
            return this.visibleCellsCount;
        }

        /* renamed from: component3, reason: from getter */
        public final SmallTileMoleculeDTO.SmallTileOptions getSmallTileOptions() {
            return this.smallTileOptions;
        }

        /* renamed from: component4, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component5, reason: from getter */
        public final TileTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final Options copy(String backgroundColor, @NotNull VisibleCellsCount visibleCellsCount, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme theme) {
            Intrinsics.checkNotNullParameter(visibleCellsCount, "visibleCellsCount");
            return new Options(backgroundColor, visibleCellsCount, smallTileOptions, testInfo, theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.d(this.backgroundColor, options.backgroundColor) && this.visibleCellsCount == options.visibleCellsCount && Intrinsics.d(this.smallTileOptions, options.smallTileOptions) && Intrinsics.d(this.testInfo, options.testInfo) && this.theme == options.theme;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final SmallTileMoleculeDTO.SmallTileOptions getSmallTileOptions() {
            return this.smallTileOptions;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        public final TileTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final VisibleCellsCount getVisibleCellsCount() {
            return this.visibleCellsCount;
        }

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (this.visibleCellsCount.hashCode() + ((str == null ? 0 : str.hashCode()) * 31)) * 31;
            SmallTileMoleculeDTO.SmallTileOptions smallTileOptions = this.smallTileOptions;
            int hashCode2 = (hashCode + (smallTileOptions == null ? 0 : smallTileOptions.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            TileTheme tileTheme = this.theme;
            return hashCode3 + (tileTheme != null ? tileTheme.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Options(backgroundColor=" + this.backgroundColor + ", visibleCellsCount=" + this.visibleCellsCount + ", smallTileOptions=" + this.smallTileOptions + ", testInfo=" + this.testInfo + ", theme=" + this.theme + ")";
        }

        public /* synthetic */ Options(String str, VisibleCellsCount visibleCellsCount, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme tileTheme, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? VisibleCellsCount.COUNT_3_5 : visibleCellsCount, smallTileOptions, testInfo, tileTheme);
        }
    }

    public /* synthetic */ TileScrollDTO(HeaderDTO headerDTO, List list, Options options, Banner banner, AllProductsButton allProductsButton, Map map, SharedData sharedData, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(headerDTO, list, options, banner, allProductsButton, (i11 & 32) != 0 ? null : map, sharedData);
    }
}
