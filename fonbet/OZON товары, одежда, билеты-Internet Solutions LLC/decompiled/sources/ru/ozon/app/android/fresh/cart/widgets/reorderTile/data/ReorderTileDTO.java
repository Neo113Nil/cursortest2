package ru.ozon.app.android.fresh.cart.widgets.reorderTile.data;

import B3.p;
import G.g;
import GR.b;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.app.android.fresh.common.widgets.header.CommonHeaderDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshTextPair.data.FreshTextPairDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0017B!\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO;", "", CommentV3DTO.HEADER_FIELD_NAME, "Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", "tiles", "", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem;", "<init>", "(Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;Ljava/util/List;)V", "getHeader", "()Lru/ozon/app/android/fresh/common/widgets/header/CommonHeaderDTO;", "getTiles", "()Ljava/util/List;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "TileItem", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ReorderTileDTO {
    public static final int $stable = 8;
    private final CommonHeaderDTO header;

    @NotNull
    private final List<TileItem> tiles;

    public ReorderTileDTO(CommonHeaderDTO commonHeaderDTO, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.header = commonHeaderDTO;
        this.tiles = tiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ ReorderTileDTO copy$default(ReorderTileDTO reorderTileDTO, CommonHeaderDTO commonHeaderDTO, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            commonHeaderDTO = reorderTileDTO.header;
        }
        if ((i11 & 2) != 0) {
            list = reorderTileDTO.tiles;
        }
        return reorderTileDTO.copy(commonHeaderDTO, list);
    }

    /* renamed from: component1, reason: from getter */
    public final CommonHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<TileItem> component2() {
        return this.tiles;
    }

    @NotNull
    public final ReorderTileDTO copy(CommonHeaderDTO header, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new ReorderTileDTO(header, tiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ReorderTileDTO)) {
            return false;
        }
        ReorderTileDTO reorderTileDTO = (ReorderTileDTO) other;
        return Intrinsics.d(this.header, reorderTileDTO.header) && Intrinsics.d(this.tiles, reorderTileDTO.tiles);
    }

    public final CommonHeaderDTO getHeader() {
        return this.header;
    }

    @NotNull
    public final List<TileItem> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        CommonHeaderDTO commonHeaderDTO = this.header;
        return this.tiles.hashCode() + ((commonHeaderDTO == null ? 0 : commonHeaderDTO.hashCode()) * 31);
    }

    @NotNull
    public String toString() {
        return "ReorderTileDTO(header=" + this.header + ", tiles=" + this.tiles + ")";
    }

    public /* synthetic */ ReorderTileDTO(CommonHeaderDTO commonHeaderDTO, List list, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? null : commonHeaderDTO, list);
    }

    @Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u000389:Bq\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\b\b\u0001\u0010\u0007\u001a\u00020\b\u0012\b\u0010\t\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u0012\u0014\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\t\u0010(\u001a\u00020\u0003HÆ\u0003J\u000f\u0010)\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0003J\t\u0010*\u001a\u00020\bHÆ\u0003J\u000b\u0010+\u001a\u0004\u0018\u00010\nHÆ\u0003J\u000b\u0010,\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010-\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010.\u001a\u00020\u000fHÆ\u0003J\t\u0010/\u001a\u00020\u0011HÆ\u0003J\u0017\u00100\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003J}\u00101\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u000e\b\u0003\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0003\u0010\u0007\u001a\u00020\b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u000e\u001a\u00020\u000f2\b\b\u0002\u0010\u0010\u001a\u00020\u00112\u0016\b\u0002\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001J\u0013\u00102\u001a\u0002032\b\u00104\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u00105\u001a\u000206HÖ\u0001J\t\u00107\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u0011\u0010\u0007\u001a\u00020\b¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u0013\u0010\t\u001a\u0004\u0018\u00010\n¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u001eR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010 R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b!\u0010\u0018R\u0011\u0010\u000e\u001a\u00020\u000f¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0011\u0010\u0010\u001a\u00020\u0011¢\u0006\b\n\u0000\u001a\u0004\b$\u0010%R\u001f\u0010\u0012\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'¨\u0006;"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem;", "", "image", "", "innerAtoms", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "tileControl", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "separator", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "backgroundColor", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Spacers;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Ljava/lang/String;Ljava/util/List;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Spacers;Ljava/util/Map;)V", "getImage", "()Ljava/lang/String;", "getInnerAtoms", "()Ljava/util/List;", "getTileControl", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getSeparator", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "getBackgroundColor", "getRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "equals", "", "other", "hashCode", "", "toString", "Separator", "Spacers", "TileControl", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TileItem {
        public static final int $stable = 8;
        private final AtomActionDTO action;
        private final String backgroundColor;

        @NotNull
        private final String image;

        @NotNull
        private final List<AtomDTO> innerAtoms;

        @NotNull
        private final CornerRadius radius;
        private final Separator separator;

        @NotNull
        private final Spacers spacers;

        @NotNull
        private final TileControl tileControl;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "", "color", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Separator;", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Separator {
            public static final int $stable = 0;
            private final String color;
            private final Float height;

            public Separator(String str, Float f7) {
                this.color = str;
                this.height = f7;
            }

            public static /* synthetic */ Separator copy$default(Separator separator, String str, Float f7, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = separator.color;
                }
                if ((i11 & 2) != 0) {
                    f7 = separator.height;
                }
                return separator.copy(str, f7);
            }

            /* renamed from: component1, reason: from getter */
            public final String getColor() {
                return this.color;
            }

            /* renamed from: component2, reason: from getter */
            public final Float getHeight() {
                return this.height;
            }

            @NotNull
            public final Separator copy(String color, Float height) {
                return new Separator(color, height);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Separator)) {
                    return false;
                }
                Separator separator = (Separator) other;
                return Intrinsics.d(this.color, separator.color) && Intrinsics.d(this.height, separator.height);
            }

            public final String getColor() {
                return this.color;
            }

            public final Float getHeight() {
                return this.height;
            }

            public int hashCode() {
                String str = this.color;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Float f7 = this.height;
                return hashCode + (f7 != null ? f7.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Separator(color=" + this.color + ", height=" + this.height + ")";
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$Spacers;", "", "vertical", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontal", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getVertical", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontal", "getBetween", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            public static final int $stable = 0;

            @NotNull
            private final Paddings between;

            @NotNull
            private final Paddings horizontal;

            @NotNull
            private final Paddings vertical;

            public Spacers() {
                this(null, null, null, 7, null);
            }

            public static /* synthetic */ Spacers copy$default(Spacers spacers, Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    paddings = spacers.vertical;
                }
                if ((i11 & 2) != 0) {
                    paddings2 = spacers.horizontal;
                }
                if ((i11 & 4) != 0) {
                    paddings3 = spacers.between;
                }
                return spacers.copy(paddings, paddings2, paddings3);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final Paddings getVertical() {
                return this.vertical;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final Paddings getBetween() {
                return this.between;
            }

            @NotNull
            public final Spacers copy(@NotNull Paddings vertical, @NotNull Paddings horizontal, @NotNull Paddings between) {
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                Intrinsics.checkNotNullParameter(between, "between");
                return new Spacers(vertical, horizontal, between);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Spacers)) {
                    return false;
                }
                Spacers spacers = (Spacers) other;
                return this.vertical == spacers.vertical && this.horizontal == spacers.horizontal && this.between == spacers.between;
            }

            @NotNull
            public final Paddings getBetween() {
                return this.between;
            }

            @NotNull
            public final Paddings getHorizontal() {
                return this.horizontal;
            }

            @NotNull
            public final Paddings getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return this.between.hashCode() + b.b(this.horizontal, this.vertical.hashCode() * 31, 31);
            }

            @NotNull
            public String toString() {
                Paddings paddings = this.vertical;
                Paddings paddings2 = this.horizontal;
                return D40.b.b(p.b("Spacers(vertical=", paddings, ", horizontal=", paddings2, ", between="), this.between, ")");
            }

            public Spacers(@NotNull Paddings vertical, @NotNull Paddings horizontal, @NotNull Paddings between) {
                Intrinsics.checkNotNullParameter(vertical, "vertical");
                Intrinsics.checkNotNullParameter(horizontal, "horizontal");
                Intrinsics.checkNotNullParameter(between, "between");
                this.vertical = vertical;
                this.horizontal = horizontal;
                this.between = between;
            }

            public /* synthetic */ Spacers(Paddings paddings, Paddings paddings2, Paddings paddings3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this((i11 & 1) != 0 ? Paddings.PADDING_400 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_350 : paddings3);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;", "", "AvailableControl", "UnavailableControl", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl$UnavailableControl;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface TileControl {

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;", "cartPicker", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "quantity", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getCartPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AvailableControl implements TileControl {
                public static final int $stable = 8;
                private final CartPickerDTO cartPicker;
                private final TextDTO quantity;

                /* JADX WARN: Multi-variable type inference failed */
                public AvailableControl() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ AvailableControl copy$default(AvailableControl availableControl, CartPickerDTO cartPickerDTO, TextDTO textDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        cartPickerDTO = availableControl.cartPicker;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = availableControl.quantity;
                    }
                    return availableControl.copy(cartPickerDTO, textDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final CartPickerDTO getCartPicker() {
                    return this.cartPicker;
                }

                /* renamed from: component2, reason: from getter */
                public final TextDTO getQuantity() {
                    return this.quantity;
                }

                @NotNull
                public final AvailableControl copy(CartPickerDTO cartPicker, TextDTO quantity) {
                    return new AvailableControl(cartPicker, quantity);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof AvailableControl)) {
                        return false;
                    }
                    AvailableControl availableControl = (AvailableControl) other;
                    return Intrinsics.d(this.cartPicker, availableControl.cartPicker) && Intrinsics.d(this.quantity, availableControl.quantity);
                }

                public final CartPickerDTO getCartPicker() {
                    return this.cartPicker;
                }

                public final TextDTO getQuantity() {
                    return this.quantity;
                }

                public int hashCode() {
                    CartPickerDTO cartPickerDTO = this.cartPicker;
                    int hashCode = (cartPickerDTO == null ? 0 : cartPickerDTO.hashCode()) * 31;
                    TextDTO textDTO = this.quantity;
                    return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "AvailableControl(cartPicker=" + this.cartPicker + ", quantity=" + this.quantity + ")";
                }

                public AvailableControl(CartPickerDTO cartPickerDTO, TextDTO textDTO) {
                    this.cartPicker = cartPickerDTO;
                    this.quantity = textDTO;
                }

                public /* synthetic */ AvailableControl(CartPickerDTO cartPickerDTO, TextDTO textDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : cartPickerDTO, (i11 & 2) != 0 ? null : textDTO);
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl$UnavailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/data/ReorderTileDTO$TileItem$TileControl;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "quantity", "Lru/ozon/uni/atoms/data/text/TextDTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getQuantity", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UnavailableControl implements TileControl {
                public static final int $stable = 0;
                private final ButtonV3DTO button;
                private final TextDTO quantity;

                /* JADX WARN: Multi-variable type inference failed */
                public UnavailableControl() {
                    this(null, 0 == true ? 1 : 0, 3, 0 == true ? 1 : 0);
                }

                public static /* synthetic */ UnavailableControl copy$default(UnavailableControl unavailableControl, ButtonV3DTO buttonV3DTO, TextDTO textDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        buttonV3DTO = unavailableControl.button;
                    }
                    if ((i11 & 2) != 0) {
                        textDTO = unavailableControl.quantity;
                    }
                    return unavailableControl.copy(buttonV3DTO, textDTO);
                }

                /* renamed from: component1, reason: from getter */
                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                /* renamed from: component2, reason: from getter */
                public final TextDTO getQuantity() {
                    return this.quantity;
                }

                @NotNull
                public final UnavailableControl copy(ButtonV3DTO button, TextDTO quantity) {
                    return new UnavailableControl(button, quantity);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UnavailableControl)) {
                        return false;
                    }
                    UnavailableControl unavailableControl = (UnavailableControl) other;
                    return Intrinsics.d(this.button, unavailableControl.button) && Intrinsics.d(this.quantity, unavailableControl.quantity);
                }

                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                public final TextDTO getQuantity() {
                    return this.quantity;
                }

                public int hashCode() {
                    ButtonV3DTO buttonV3DTO = this.button;
                    int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
                    TextDTO textDTO = this.quantity;
                    return hashCode + (textDTO != null ? textDTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "UnavailableControl(button=" + this.button + ", quantity=" + this.quantity + ")";
                }

                public UnavailableControl(ButtonV3DTO buttonV3DTO, TextDTO textDTO) {
                    this.button = buttonV3DTO;
                    this.quantity = textDTO;
                }

                public /* synthetic */ UnavailableControl(ButtonV3DTO buttonV3DTO, TextDTO textDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                    this((i11 & 1) != 0 ? null : buttonV3DTO, (i11 & 2) != 0 ? null : textDTO);
                }
            }
        }

        /* JADX WARN: Multi-variable type inference failed */
        public TileItem(@NotNull String image, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "subtitle", type = TextDTO.class), @ProtoOneOfSignature(name = "textPair", type = FreshTextPairDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> innerAtoms, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "availableControl", type = TileControl.AvailableControl.class), @ProtoOneOfSignature(name = "unavailableControl", type = TileControl.UnavailableControl.class)}) @NotNull @ProtoOneOf TileControl tileControl, AtomActionDTO atomActionDTO, Separator separator, String str, @NotNull CornerRadius radius, @NotNull Spacers spacers, Map<String, TokenizedTrackingInfo> map) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(innerAtoms, "innerAtoms");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.image = image;
            this.innerAtoms = innerAtoms;
            this.tileControl = tileControl;
            this.action = atomActionDTO;
            this.separator = separator;
            this.backgroundColor = str;
            this.radius = radius;
            this.spacers = spacers;
            this.trackingInfo = map;
        }

        public static /* synthetic */ TileItem copy$default(TileItem tileItem, String str, List list, TileControl tileControl, AtomActionDTO atomActionDTO, Separator separator, String str2, CornerRadius cornerRadius, Spacers spacers, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = tileItem.image;
            }
            if ((i11 & 2) != 0) {
                list = tileItem.innerAtoms;
            }
            if ((i11 & 4) != 0) {
                tileControl = tileItem.tileControl;
            }
            if ((i11 & 8) != 0) {
                atomActionDTO = tileItem.action;
            }
            if ((i11 & 16) != 0) {
                separator = tileItem.separator;
            }
            if ((i11 & 32) != 0) {
                str2 = tileItem.backgroundColor;
            }
            if ((i11 & 64) != 0) {
                cornerRadius = tileItem.radius;
            }
            if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                spacers = tileItem.spacers;
            }
            if ((i11 & 256) != 0) {
                map = tileItem.trackingInfo;
            }
            Spacers spacers2 = spacers;
            Map map2 = map;
            String str3 = str2;
            CornerRadius cornerRadius2 = cornerRadius;
            Separator separator2 = separator;
            TileControl tileControl2 = tileControl;
            return tileItem.copy(str, list, tileControl2, atomActionDTO, separator2, str3, cornerRadius2, spacers2, map2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final List<AtomDTO> component2() {
            return this.innerAtoms;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TileControl getTileControl() {
            return this.tileControl;
        }

        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final Separator getSeparator() {
            return this.separator;
        }

        /* renamed from: component6, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        /* renamed from: component7, reason: from getter */
        public final CornerRadius getRadius() {
            return this.radius;
        }

        @NotNull
        /* renamed from: component8, reason: from getter */
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final Map<String, TokenizedTrackingInfo> component9() {
            return this.trackingInfo;
        }

        @NotNull
        public final TileItem copy(@NotNull String image, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "subtitle", type = TextDTO.class), @ProtoOneOfSignature(name = "textPair", type = FreshTextPairDTO.class), @ProtoOneOfSignature(name = "price", type = PriceDTO.class)}) @NotNull @ProtoOneOf(label = "type") List<? extends AtomDTO> innerAtoms, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "availableControl", type = TileControl.AvailableControl.class), @ProtoOneOfSignature(name = "unavailableControl", type = TileControl.UnavailableControl.class)}) @NotNull @ProtoOneOf TileControl tileControl, AtomActionDTO action, Separator separator, String backgroundColor, @NotNull CornerRadius radius, @NotNull Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(innerAtoms, "innerAtoms");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            return new TileItem(image, innerAtoms, tileControl, action, separator, backgroundColor, radius, spacers, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.innerAtoms, tileItem.innerAtoms) && Intrinsics.d(this.tileControl, tileItem.tileControl) && Intrinsics.d(this.action, tileItem.action) && Intrinsics.d(this.separator, tileItem.separator) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && this.radius == tileItem.radius && Intrinsics.d(this.spacers, tileItem.spacers) && Intrinsics.d(this.trackingInfo, tileItem.trackingInfo);
        }

        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        @NotNull
        public final List<AtomDTO> getInnerAtoms() {
            return this.innerAtoms;
        }

        @NotNull
        public final CornerRadius getRadius() {
            return this.radius;
        }

        public final Separator getSeparator() {
            return this.separator;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        @NotNull
        public final TileControl getTileControl() {
            return this.tileControl;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            int hashCode = (this.tileControl.hashCode() + g.b(this.image.hashCode() * 31, 31, this.innerAtoms)) * 31;
            AtomActionDTO atomActionDTO = this.action;
            int hashCode2 = (hashCode + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            Separator separator = this.separator;
            int hashCode3 = (hashCode2 + (separator == null ? 0 : separator.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode4 = (this.spacers.hashCode() + Tl.b.b(this.radius, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            List<AtomDTO> list = this.innerAtoms;
            TileControl tileControl = this.tileControl;
            AtomActionDTO atomActionDTO = this.action;
            Separator separator = this.separator;
            String str2 = this.backgroundColor;
            CornerRadius cornerRadius = this.radius;
            Spacers spacers = this.spacers;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            StringBuilder f7 = Tl.b.f("TileItem(image=", str, ", innerAtoms=", ", tileControl=", list);
            f7.append(tileControl);
            f7.append(", action=");
            f7.append(atomActionDTO);
            f7.append(", separator=");
            f7.append(separator);
            f7.append(", backgroundColor=");
            f7.append(str2);
            f7.append(", radius=");
            f7.append(cornerRadius);
            f7.append(", spacers=");
            f7.append(spacers);
            f7.append(", trackingInfo=");
            return P.f(f7, map, ")");
        }

        public TileItem(String str, List list, TileControl tileControl, AtomActionDTO atomActionDTO, Separator separator, String str2, CornerRadius cornerRadius, Spacers spacers, Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, (i11 & 2) != 0 ? K.f71697a : list, tileControl, atomActionDTO, separator, str2, (i11 & 64) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? new Spacers(null, null, null, 7, null) : spacers, map);
        }
    }
}
