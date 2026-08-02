package ru.ozon.app.android.universalwidgets.widgets.uw.sku.tilegrid3.data.dto;

import G.g;
import HY.b;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.header.data.HeaderDTO;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.storefront.data.tiles.blur.BlurMoleculeContentDTO;
import ru.ozon.app.android.storefront.data.tiles.common.TileTheme;
import ru.ozon.app.android.storefront.data.tiles.smalltile.SmallTileMoleculeDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.collection.JsonCollectionDecoding;
import ru.ozon.uni.atoms.data.TestInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0081\b\u0018\u00002\u00020\u0001:\u0002)*BI\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u000f\u0010\u0010J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\u000b\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003J\u000b\u0010!\u001a\u0004\u0018\u00010\u000eHÆ\u0003JU\u0010\"\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u000eHÆ\u0001J\u0013\u0010#\u001a\u00020$2\b\u0010%\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010&\u001a\u00020'HÖ\u0001J\t\u0010(\u001a\u00020\u000bHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0000\u0012\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u001f\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001c¨\u0006+"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "items", "", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO;", "options", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "sharedData", "Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;", "<init>", "(Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;Ljava/util/List;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;Ljava/util/Map;Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;)V", "getHeader", "()Lru/ozon/android/composerCommonViewKit/header/data/HeaderDTO;", "getItems$annotations", "()V", "getItems", "()Ljava/util/List;", "getOptions", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;", "getTrackingInfo", "()Ljava/util/Map;", "getSharedData", "()Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "Options", "SharedData", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TileGrid3DTO {
    private final HeaderDTO header;

    @NotNull
    private final List<SmallTileMoleculeDTO> items;
    private final Options options;
    private final SharedData sharedData;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\tHÆ\u0003J9\u0010\u0018\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$Options;", "", "backgroundColor", "", "smallTileOptions", "Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;", "testInfo", "Lru/ozon/uni/atoms/data/TestInfo;", "theme", "Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "<init>", "(Ljava/lang/String;Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;Lru/ozon/uni/atoms/data/TestInfo;Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;)V", "getBackgroundColor", "()Ljava/lang/String;", "getSmallTileOptions", "()Lru/ozon/app/android/storefront/data/tiles/smalltile/SmallTileMoleculeDTO$SmallTileOptions;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "getTheme", "()Lru/ozon/app/android/storefront/data/tiles/common/TileTheme;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Options {
        private final String backgroundColor;
        private final SmallTileMoleculeDTO.SmallTileOptions smallTileOptions;
        private final TestInfo testInfo;
        private final TileTheme theme;

        public Options(String str, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme tileTheme) {
            this.backgroundColor = str;
            this.smallTileOptions = smallTileOptions;
            this.testInfo = testInfo;
            this.theme = tileTheme;
        }

        public static /* synthetic */ Options copy$default(Options options, String str, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme tileTheme, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = options.backgroundColor;
            }
            if ((i11 & 2) != 0) {
                smallTileOptions = options.smallTileOptions;
            }
            if ((i11 & 4) != 0) {
                testInfo = options.testInfo;
            }
            if ((i11 & 8) != 0) {
                tileTheme = options.theme;
            }
            return options.copy(str, smallTileOptions, testInfo, tileTheme);
        }

        /* renamed from: component1, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component2, reason: from getter */
        public final SmallTileMoleculeDTO.SmallTileOptions getSmallTileOptions() {
            return this.smallTileOptions;
        }

        /* renamed from: component3, reason: from getter */
        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        /* renamed from: component4, reason: from getter */
        public final TileTheme getTheme() {
            return this.theme;
        }

        @NotNull
        public final Options copy(String backgroundColor, SmallTileMoleculeDTO.SmallTileOptions smallTileOptions, TestInfo testInfo, TileTheme theme) {
            return new Options(backgroundColor, smallTileOptions, testInfo, theme);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Options)) {
                return false;
            }
            Options options = (Options) other;
            return Intrinsics.d(this.backgroundColor, options.backgroundColor) && Intrinsics.d(this.smallTileOptions, options.smallTileOptions) && Intrinsics.d(this.testInfo, options.testInfo) && this.theme == options.theme;
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

        public int hashCode() {
            String str = this.backgroundColor;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            SmallTileMoleculeDTO.SmallTileOptions smallTileOptions = this.smallTileOptions;
            int hashCode2 = (hashCode + (smallTileOptions == null ? 0 : smallTileOptions.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            int hashCode3 = (hashCode2 + (testInfo == null ? 0 : testInfo.hashCode())) * 31;
            TileTheme tileTheme = this.theme;
            return hashCode3 + (tileTheme != null ? tileTheme.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Options(backgroundColor=" + this.backgroundColor + ", smallTileOptions=" + this.smallTileOptions + ", testInfo=" + this.testInfo + ", theme=" + this.theme + ")";
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\u0017\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0003J!\u0010\u000b\u001a\u00020\u00002\u0016\b\u0002\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0004HÖ\u0001R\u001f\u0010\u0002\u001a\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/sku/tilegrid3/data/dto/TileGrid3DTO$SharedData;", "", "blurItemInfo", "", "", "Lru/ozon/app/android/storefront/data/tiles/blur/BlurMoleculeContentDTO;", "<init>", "(Ljava/util/Map;)V", "getBlurItemInfo", "()Ljava/util/Map;", "component1", "copy", "equals", "", "other", "hashCode", "", "toString", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public TileGrid3DTO(HeaderDTO headerDTO, @NotNull List<SmallTileMoleculeDTO> items, Options options, Map<String, TokenizedTrackingInfo> map, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.header = headerDTO;
        this.items = items;
        this.options = options;
        this.trackingInfo = map;
        this.sharedData = sharedData;
    }

    public static /* synthetic */ TileGrid3DTO copy$default(TileGrid3DTO tileGrid3DTO, HeaderDTO headerDTO, List list, Options options, Map map, SharedData sharedData, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            headerDTO = tileGrid3DTO.header;
        }
        if ((i11 & 2) != 0) {
            list = tileGrid3DTO.items;
        }
        if ((i11 & 4) != 0) {
            options = tileGrid3DTO.options;
        }
        if ((i11 & 8) != 0) {
            map = tileGrid3DTO.trackingInfo;
        }
        if ((i11 & 16) != 0) {
            sharedData = tileGrid3DTO.sharedData;
        }
        SharedData sharedData2 = sharedData;
        Options options2 = options;
        return tileGrid3DTO.copy(headerDTO, list, options2, map, sharedData2);
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

    public final Map<String, TokenizedTrackingInfo> component4() {
        return this.trackingInfo;
    }

    /* renamed from: component5, reason: from getter */
    public final SharedData getSharedData() {
        return this.sharedData;
    }

    @NotNull
    public final TileGrid3DTO copy(HeaderDTO header, @NotNull List<SmallTileMoleculeDTO> items, Options options, Map<String, TokenizedTrackingInfo> trackingInfo, SharedData sharedData) {
        Intrinsics.checkNotNullParameter(items, "items");
        return new TileGrid3DTO(header, items, options, trackingInfo, sharedData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TileGrid3DTO)) {
            return false;
        }
        TileGrid3DTO tileGrid3DTO = (TileGrid3DTO) other;
        return Intrinsics.d(this.header, tileGrid3DTO.header) && Intrinsics.d(this.items, tileGrid3DTO.items) && Intrinsics.d(this.options, tileGrid3DTO.options) && Intrinsics.d(this.trackingInfo, tileGrid3DTO.trackingInfo) && Intrinsics.d(this.sharedData, tileGrid3DTO.sharedData);
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
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
        SharedData sharedData = this.sharedData;
        return hashCode2 + (sharedData != null ? sharedData.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TileGrid3DTO(header=" + this.header + ", items=" + this.items + ", options=" + this.options + ", trackingInfo=" + this.trackingInfo + ", sharedData=" + this.sharedData + ")";
    }
}
