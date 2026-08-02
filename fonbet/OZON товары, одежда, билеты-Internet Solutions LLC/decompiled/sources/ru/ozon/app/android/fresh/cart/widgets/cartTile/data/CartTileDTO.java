package ru.ozon.app.android.fresh.cart.widgets.cartTile.data;

import B3.p;
import Bi.b;
import D40.d;
import G.g;
import Ih.a;
import K1.G;
import T7.P;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.data.CartPickerDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.common.Paddings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001f\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u000b\u0010\u000e\u001a\u0004\u0018\u00010\u0006HÆ\u0003J%\u0010\u000f\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0006HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0006HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO;", "", "tiles", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;", "swipeBackgroundColor", "", "<init>", "(Ljava/util/List;Ljava/lang/String;)V", "getTiles", "()Ljava/util/List;", "getSwipeBackgroundColor", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "TileItem", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartTileDTO {
    public static final int $stable = 8;
    private final String swipeBackgroundColor;

    @NotNull
    private final List<TileItem> tiles;

    public CartTileDTO(@NotNull List<TileItem> tiles, String str) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.tiles = tiles;
        this.swipeBackgroundColor = str;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartTileDTO copy$default(CartTileDTO cartTileDTO, List list, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            list = cartTileDTO.tiles;
        }
        if ((i11 & 2) != 0) {
            str = cartTileDTO.swipeBackgroundColor;
        }
        return cartTileDTO.copy(list, str);
    }

    @NotNull
    public final List<TileItem> component1() {
        return this.tiles;
    }

    /* renamed from: component2, reason: from getter */
    public final String getSwipeBackgroundColor() {
        return this.swipeBackgroundColor;
    }

    @NotNull
    public final CartTileDTO copy(@NotNull List<TileItem> tiles, String swipeBackgroundColor) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new CartTileDTO(tiles, swipeBackgroundColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTileDTO)) {
            return false;
        }
        CartTileDTO cartTileDTO = (CartTileDTO) other;
        return Intrinsics.d(this.tiles, cartTileDTO.tiles) && Intrinsics.d(this.swipeBackgroundColor, cartTileDTO.swipeBackgroundColor);
    }

    public final String getSwipeBackgroundColor() {
        return this.swipeBackgroundColor;
    }

    @NotNull
    public final List<TileItem> getTiles() {
        return this.tiles;
    }

    public int hashCode() {
        int hashCode = this.tiles.hashCode() * 31;
        String str = this.swipeBackgroundColor;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        return b.e("CartTileDTO(tiles=", ", swipeBackgroundColor=", this.swipeBackgroundColor, ")", this.tiles);
    }

    @Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\bD\b\u0087\b\u0018\u00002\u00020\u0001:\u0005bcdefBû\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\b\u001a\u00020\t\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\f\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0013\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0017\u0012\u0014\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0014\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0014\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\u0014\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010 \u001a\u0004\u0018\u00010!\u0012\b\b\u0002\u0010\"\u001a\u00020#¢\u0006\u0004\b$\u0010%J\t\u0010H\u001a\u00020\u0003HÆ\u0003J\t\u0010I\u001a\u00020\u0005HÆ\u0003J\t\u0010J\u001a\u00020\u0007HÆ\u0003J\t\u0010K\u001a\u00020\tHÆ\u0003J\u000b\u0010L\u001a\u0004\u0018\u00010\tHÆ\u0003J\u000b\u0010M\u001a\u0004\u0018\u00010\fHÆ\u0003J\u000b\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0010HÆ\u0003J\u000b\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010R\u001a\u0004\u0018\u00010\u0013HÆ\u0003J\t\u0010S\u001a\u00020\u0015HÆ\u0003J\t\u0010T\u001a\u00020\u0017HÆ\u0003J\u0017\u0010U\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u0017\u0010V\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u0017\u0010W\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u0017\u0010X\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019HÆ\u0003J\u000b\u0010Y\u001a\u0004\u0018\u00010\u001fHÆ\u0003J\u0010\u0010Z\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0002\u0010DJ\t\u0010[\u001a\u00020#HÆ\u0003J \u0002\u0010\\\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00132\b\b\u0002\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\u0016\b\u0002\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0016\b\u0002\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\u0016\b\u0002\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u00192\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010!2\b\b\u0002\u0010\"\u001a\u00020#HÆ\u0001¢\u0006\u0002\u0010]J\u0013\u0010^\u001a\u00020#2\b\u0010_\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010`\u001a\u00020!HÖ\u0001J\t\u0010a\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b&\u0010'R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b(\u0010)R\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b*\u0010+R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b,\u0010-R\u0013\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b.\u0010-R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b/\u00100R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b1\u0010)R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b2\u0010)R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010¢\u0006\b\n\u0000\u001a\u0004\b3\u00104R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b5\u0010'R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0013¢\u0006\b\n\u0000\u001a\u0004\b6\u00107R\u0011\u0010\u0014\u001a\u00020\u0015¢\u0006\b\n\u0000\u001a\u0004\b8\u00109R\u0011\u0010\u0016\u001a\u00020\u0017¢\u0006\b\n\u0000\u001a\u0004\b:\u0010;R\u001f\u0010\u0018\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b<\u0010=R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b>\u0010=R\u001f\u0010\u001c\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b?\u0010=R\u001f\u0010\u001d\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u001a\u0018\u00010\u0019¢\u0006\b\n\u0000\u001a\u0004\b@\u0010=R\u0013\u0010\u001e\u001a\u0004\u0018\u00010\u001f¢\u0006\b\n\u0000\u001a\u0004\bA\u0010BR\u0015\u0010 \u001a\u0004\u0018\u00010!¢\u0006\n\n\u0002\u0010E\u001a\u0004\bC\u0010DR\u0011\u0010\"\u001a\u00020#¢\u0006\b\n\u0000\u001a\u0004\bF\u0010G¨\u0006g"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;", "", "image", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/text/TextDTO;", "tileControl", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "deleteAction", "price", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "weightText", "description", "separator", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "backgroundColor", "checkbox", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;", "radius", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "spacers", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "deleteTrackingInfo", "tapDeleteTrackingInfo", "swipeTrackingInfo", "favoriteButton", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;", DynamicElementDTO.TIMER, "", "delayedRefresh", "", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;Ljava/lang/Integer;Z)V", "getImage", "()Ljava/lang/String;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getTileControl", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getDeleteAction", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "getWeightText", "getDescription", "getSeparator", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "getBackgroundColor", "getCheckbox", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;", "getRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;", "getTrackingInfo", "()Ljava/util/Map;", "getDeleteTrackingInfo", "getTapDeleteTrackingInfo", "getSwipeTrackingInfo", "getFavoriteButton", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;", "getTimer", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getDelayedRefresh", "()Z", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/price/PriceDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;Lru/ozon/uni/atoms/data/common/CornerRadius;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;Ljava/lang/Integer;Z)Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem;", "equals", "other", "hashCode", "toString", "Separator", "Checkbox", "Spacers", "TileControl", "FavoriteButton", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class TileItem {
        public static final int $stable = 8;

        @NotNull
        private final AtomActionDTO action;
        private final String backgroundColor;
        private final Checkbox checkbox;
        private final boolean delayedRefresh;
        private final AtomActionDTO deleteAction;
        private final Map<String, TokenizedTrackingInfo> deleteTrackingInfo;
        private final TextDTO description;
        private final FavoriteButton favoriteButton;

        @NotNull
        private final String image;
        private final PriceDTO price;

        @NotNull
        private final CornerRadius radius;
        private final Separator separator;

        @NotNull
        private final Spacers spacers;
        private final Map<String, TokenizedTrackingInfo> swipeTrackingInfo;
        private final Map<String, TokenizedTrackingInfo> tapDeleteTrackingInfo;

        @NotNull
        private final TileControl tileControl;
        private final Integer timer;

        @NotNull
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> trackingInfo;
        private final TextDTO weightText;

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\t\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0014\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\u0004\b\u000e\u0010\u000fJ\t\u0010\u001a\u001a\u00020\u0003HÆ\u0003J\t\u0010\u001b\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001c\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001d\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001e\u001a\u00020\tHÆ\u0003J\t\u0010\u001f\u001a\u00020\tHÆ\u0003J\u0017\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0003J]\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\t2\u0016\b\u0002\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\fHÆ\u0001J\u0013\u0010\"\u001a\u00020\u00032\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010$\u001a\u00020%HÖ\u0001J\t\u0010&\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0010R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\u0006\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0012R\u0011\u0010\u0007\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\n\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0016R\u001f\u0010\u000b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\r\u0018\u00010\f¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006'"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$FavoriteButton;", "", "isFavorite", "", "icon", "", "selectedIconColor", "unselectedIconColor", "favoriteAction", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "unfavoriteAction", "trackingInfo", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;)V", "()Z", "getIcon", "()Ljava/lang/String;", "getSelectedIconColor", "getUnselectedIconColor", "getFavoriteAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getUnfavoriteAction", "getTrackingInfo", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "equals", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FavoriteButton {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO favoriteAction;

            @NotNull
            private final String icon;
            private final boolean isFavorite;

            @NotNull
            private final String selectedIconColor;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            @NotNull
            private final AtomActionDTO unfavoriteAction;

            @NotNull
            private final String unselectedIconColor;

            public FavoriteButton(boolean z11, @NotNull String icon, @NotNull String selectedIconColor, @NotNull String unselectedIconColor, @NotNull AtomActionDTO favoriteAction, @NotNull AtomActionDTO unfavoriteAction, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(selectedIconColor, "selectedIconColor");
                Intrinsics.checkNotNullParameter(unselectedIconColor, "unselectedIconColor");
                Intrinsics.checkNotNullParameter(favoriteAction, "favoriteAction");
                Intrinsics.checkNotNullParameter(unfavoriteAction, "unfavoriteAction");
                this.isFavorite = z11;
                this.icon = icon;
                this.selectedIconColor = selectedIconColor;
                this.unselectedIconColor = unselectedIconColor;
                this.favoriteAction = favoriteAction;
                this.unfavoriteAction = unfavoriteAction;
                this.trackingInfo = map;
            }

            public static /* synthetic */ FavoriteButton copy$default(FavoriteButton favoriteButton, boolean z11, String str, String str2, String str3, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, Map map, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    z11 = favoriteButton.isFavorite;
                }
                if ((i11 & 2) != 0) {
                    str = favoriteButton.icon;
                }
                if ((i11 & 4) != 0) {
                    str2 = favoriteButton.selectedIconColor;
                }
                if ((i11 & 8) != 0) {
                    str3 = favoriteButton.unselectedIconColor;
                }
                if ((i11 & 16) != 0) {
                    atomActionDTO = favoriteButton.favoriteAction;
                }
                if ((i11 & 32) != 0) {
                    atomActionDTO2 = favoriteButton.unfavoriteAction;
                }
                if ((i11 & 64) != 0) {
                    map = favoriteButton.trackingInfo;
                }
                AtomActionDTO atomActionDTO3 = atomActionDTO2;
                Map map2 = map;
                AtomActionDTO atomActionDTO4 = atomActionDTO;
                String str4 = str2;
                return favoriteButton.copy(z11, str, str4, str3, atomActionDTO4, atomActionDTO3, map2);
            }

            /* renamed from: component1, reason: from getter */
            public final boolean getIsFavorite() {
                return this.isFavorite;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final String getSelectedIconColor() {
                return this.selectedIconColor;
            }

            @NotNull
            /* renamed from: component4, reason: from getter */
            public final String getUnselectedIconColor() {
                return this.unselectedIconColor;
            }

            @NotNull
            /* renamed from: component5, reason: from getter */
            public final AtomActionDTO getFavoriteAction() {
                return this.favoriteAction;
            }

            @NotNull
            /* renamed from: component6, reason: from getter */
            public final AtomActionDTO getUnfavoriteAction() {
                return this.unfavoriteAction;
            }

            public final Map<String, TokenizedTrackingInfo> component7() {
                return this.trackingInfo;
            }

            @NotNull
            public final FavoriteButton copy(boolean isFavorite, @NotNull String icon, @NotNull String selectedIconColor, @NotNull String unselectedIconColor, @NotNull AtomActionDTO favoriteAction, @NotNull AtomActionDTO unfavoriteAction, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(selectedIconColor, "selectedIconColor");
                Intrinsics.checkNotNullParameter(unselectedIconColor, "unselectedIconColor");
                Intrinsics.checkNotNullParameter(favoriteAction, "favoriteAction");
                Intrinsics.checkNotNullParameter(unfavoriteAction, "unfavoriteAction");
                return new FavoriteButton(isFavorite, icon, selectedIconColor, unselectedIconColor, favoriteAction, unfavoriteAction, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FavoriteButton)) {
                    return false;
                }
                FavoriteButton favoriteButton = (FavoriteButton) other;
                return this.isFavorite == favoriteButton.isFavorite && Intrinsics.d(this.icon, favoriteButton.icon) && Intrinsics.d(this.selectedIconColor, favoriteButton.selectedIconColor) && Intrinsics.d(this.unselectedIconColor, favoriteButton.unselectedIconColor) && Intrinsics.d(this.favoriteAction, favoriteButton.favoriteAction) && Intrinsics.d(this.unfavoriteAction, favoriteButton.unfavoriteAction) && Intrinsics.d(this.trackingInfo, favoriteButton.trackingInfo);
            }

            @NotNull
            public final AtomActionDTO getFavoriteAction() {
                return this.favoriteAction;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getSelectedIconColor() {
                return this.selectedIconColor;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            @NotNull
            public final AtomActionDTO getUnfavoriteAction() {
                return this.unfavoriteAction;
            }

            @NotNull
            public final String getUnselectedIconColor() {
                return this.unselectedIconColor;
            }

            public int hashCode() {
                int b11 = a.b(this.unfavoriteAction, a.b(this.favoriteAction, g.a(g.a(g.a(Boolean.hashCode(this.isFavorite) * 31, 31, this.icon), 31, this.selectedIconColor), 31, this.unselectedIconColor), 31), 31);
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return b11 + (map == null ? 0 : map.hashCode());
            }

            public final boolean isFavorite() {
                return this.isFavorite;
            }

            @NotNull
            public String toString() {
                boolean z11 = this.isFavorite;
                String str = this.icon;
                String str2 = this.selectedIconColor;
                String str3 = this.unselectedIconColor;
                AtomActionDTO atomActionDTO = this.favoriteAction;
                AtomActionDTO atomActionDTO2 = this.unfavoriteAction;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder d11 = G.d("FavoriteButton(isFavorite=", ", icon=", str, ", selectedIconColor=", z11);
                Nh.a.h(d11, str2, ", unselectedIconColor=", str3, ", favoriteAction=");
                d11.append(atomActionDTO);
                d11.append(", unfavoriteAction=");
                d11.append(atomActionDTO2);
                d11.append(", trackingInfo=");
                return P.f(d11, map, ")");
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0007\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u000e\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\u000bJ&\u0010\u000f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u0010J\u0013\u0010\u0011\u001a\u00020\u00122\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001J\t\u0010\u0016\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\f\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "", "color", "", "height", "", "<init>", "(Ljava/lang/String;Ljava/lang/Float;)V", "getColor", "()Ljava/lang/String;", "getHeight", "()Ljava/lang/Float;", "Ljava/lang/Float;", "component1", "component2", "copy", "(Ljava/lang/String;Ljava/lang/Float;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0003¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J'\u0010\u000f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\tR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\t¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Spacers;", "", "vertical", "Lru/ozon/uni/atoms/data/common/Paddings;", "horizontal", "between", "<init>", "(Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;Lru/ozon/uni/atoms/data/common/Paddings;)V", "getVertical", "()Lru/ozon/uni/atoms/data/common/Paddings;", "getHorizontal", "getBetween", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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
                return this.between.hashCode() + GR.b.b(this.horizontal, this.vertical.hashCode() * 31, 31);
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
                this((i11 & 1) != 0 ? Paddings.PADDING_300 : paddings, (i11 & 2) != 0 ? Paddings.PADDING_500 : paddings2, (i11 & 4) != 0 ? Paddings.PADDING_350 : paddings3);
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "", "AvailableControl", "UnavailableControl", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl$UnavailableControl;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface TileControl {

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\t\u0010\b\u001a\u00020\u0003HÆ\u0003J\u0013\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\n\u001a\u00020\u000b2\b\u0010\f\u001a\u0004\u0018\u00010\rHÖ\u0003J\t\u0010\u000e\u001a\u00020\u000fHÖ\u0001J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "cartPicker", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "<init>", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;)V", "getCartPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/data/CartPickerDTO;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AvailableControl implements TileControl {
                public static final int $stable = 8;

                @NotNull
                private final CartPickerDTO cartPicker;

                public AvailableControl(@NotNull CartPickerDTO cartPicker) {
                    Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                    this.cartPicker = cartPicker;
                }

                public static /* synthetic */ AvailableControl copy$default(AvailableControl availableControl, CartPickerDTO cartPickerDTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        cartPickerDTO = availableControl.cartPicker;
                    }
                    return availableControl.copy(cartPickerDTO);
                }

                @NotNull
                /* renamed from: component1, reason: from getter */
                public final CartPickerDTO getCartPicker() {
                    return this.cartPicker;
                }

                @NotNull
                public final AvailableControl copy(@NotNull CartPickerDTO cartPicker) {
                    Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                    return new AvailableControl(cartPicker);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof AvailableControl) && Intrinsics.d(this.cartPicker, ((AvailableControl) other).cartPicker);
                }

                @NotNull
                public final CartPickerDTO getCartPicker() {
                    return this.cartPicker;
                }

                public int hashCode() {
                    return this.cartPicker.hashCode();
                }

                @NotNull
                public String toString() {
                    return "AvailableControl(cartPicker=" + this.cartPicker + ")";
                }
            }

            @j(generateAdapter = true)
            @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl$UnavailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$TileControl;", "button", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "binButton", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getBinButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "component1", "component2", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UnavailableControl implements TileControl {
                public static final int $stable = IconButtonV3DTO.$stable;
                private final IconButtonV3DTO binButton;
                private final ButtonV3DTO button;

                public UnavailableControl(ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO) {
                    this.button = buttonV3DTO;
                    this.binButton = iconButtonV3DTO;
                }

                public static /* synthetic */ UnavailableControl copy$default(UnavailableControl unavailableControl, ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO, int i11, Object obj) {
                    if ((i11 & 1) != 0) {
                        buttonV3DTO = unavailableControl.button;
                    }
                    if ((i11 & 2) != 0) {
                        iconButtonV3DTO = unavailableControl.binButton;
                    }
                    return unavailableControl.copy(buttonV3DTO, iconButtonV3DTO);
                }

                /* renamed from: component1, reason: from getter */
                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                /* renamed from: component2, reason: from getter */
                public final IconButtonV3DTO getBinButton() {
                    return this.binButton;
                }

                @NotNull
                public final UnavailableControl copy(ButtonV3DTO button, IconButtonV3DTO binButton) {
                    return new UnavailableControl(button, binButton);
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof UnavailableControl)) {
                        return false;
                    }
                    UnavailableControl unavailableControl = (UnavailableControl) other;
                    return Intrinsics.d(this.button, unavailableControl.button) && Intrinsics.d(this.binButton, unavailableControl.binButton);
                }

                public final IconButtonV3DTO getBinButton() {
                    return this.binButton;
                }

                public final ButtonV3DTO getButton() {
                    return this.button;
                }

                public int hashCode() {
                    ButtonV3DTO buttonV3DTO = this.button;
                    int hashCode = (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode()) * 31;
                    IconButtonV3DTO iconButtonV3DTO = this.binButton;
                    return hashCode + (iconButtonV3DTO != null ? iconButtonV3DTO.hashCode() : 0);
                }

                @NotNull
                public String toString() {
                    return "UnavailableControl(button=" + this.button + ", binButton=" + this.binButton + ")";
                }
            }
        }

        public TileItem(@NotNull String image, @NotNull TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "availableControl", type = TileControl.AvailableControl.class), @ProtoOneOfSignature(name = "unavailableControl", type = TileControl.UnavailableControl.class)}) @NotNull @ProtoOneOf TileControl tileControl, @NotNull AtomActionDTO action, AtomActionDTO atomActionDTO, PriceDTO priceDTO, TextDTO textDTO, TextDTO textDTO2, Separator separator, String str, Checkbox checkbox, @NotNull CornerRadius radius, @NotNull Spacers spacers, Map<String, TokenizedTrackingInfo> map, Map<String, TokenizedTrackingInfo> map2, Map<String, TokenizedTrackingInfo> map3, Map<String, TokenizedTrackingInfo> map4, FavoriteButton favoriteButton, Integer num, boolean z11) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            this.image = image;
            this.title = title;
            this.tileControl = tileControl;
            this.action = action;
            this.deleteAction = atomActionDTO;
            this.price = priceDTO;
            this.weightText = textDTO;
            this.description = textDTO2;
            this.separator = separator;
            this.backgroundColor = str;
            this.checkbox = checkbox;
            this.radius = radius;
            this.spacers = spacers;
            this.trackingInfo = map;
            this.deleteTrackingInfo = map2;
            this.tapDeleteTrackingInfo = map3;
            this.swipeTrackingInfo = map4;
            this.favoriteButton = favoriteButton;
            this.timer = num;
            this.delayedRefresh = z11;
        }

        public static /* synthetic */ TileItem copy$default(TileItem tileItem, String str, TextDTO textDTO, TileControl tileControl, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, PriceDTO priceDTO, TextDTO textDTO2, TextDTO textDTO3, Separator separator, String str2, Checkbox checkbox, CornerRadius cornerRadius, Spacers spacers, Map map, Map map2, Map map3, Map map4, FavoriteButton favoriteButton, Integer num, boolean z11, int i11, Object obj) {
            boolean z12;
            Integer num2;
            String str3 = (i11 & 1) != 0 ? tileItem.image : str;
            TextDTO textDTO4 = (i11 & 2) != 0 ? tileItem.title : textDTO;
            TileControl tileControl2 = (i11 & 4) != 0 ? tileItem.tileControl : tileControl;
            AtomActionDTO atomActionDTO3 = (i11 & 8) != 0 ? tileItem.action : atomActionDTO;
            AtomActionDTO atomActionDTO4 = (i11 & 16) != 0 ? tileItem.deleteAction : atomActionDTO2;
            PriceDTO priceDTO2 = (i11 & 32) != 0 ? tileItem.price : priceDTO;
            TextDTO textDTO5 = (i11 & 64) != 0 ? tileItem.weightText : textDTO2;
            TextDTO textDTO6 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tileItem.description : textDTO3;
            Separator separator2 = (i11 & 256) != 0 ? tileItem.separator : separator;
            String str4 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tileItem.backgroundColor : str2;
            Checkbox checkbox2 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tileItem.checkbox : checkbox;
            CornerRadius cornerRadius2 = (i11 & 2048) != 0 ? tileItem.radius : cornerRadius;
            Spacers spacers2 = (i11 & 4096) != 0 ? tileItem.spacers : spacers;
            Map map5 = (i11 & 8192) != 0 ? tileItem.trackingInfo : map;
            String str5 = str3;
            Map map6 = (i11 & 16384) != 0 ? tileItem.deleteTrackingInfo : map2;
            Map map7 = (i11 & 32768) != 0 ? tileItem.tapDeleteTrackingInfo : map3;
            Map map8 = (i11 & 65536) != 0 ? tileItem.swipeTrackingInfo : map4;
            FavoriteButton favoriteButton2 = (i11 & 131072) != 0 ? tileItem.favoriteButton : favoriteButton;
            Integer num3 = (i11 & 262144) != 0 ? tileItem.timer : num;
            if ((i11 & 524288) != 0) {
                num2 = num3;
                z12 = tileItem.delayedRefresh;
            } else {
                z12 = z11;
                num2 = num3;
            }
            return tileItem.copy(str5, textDTO4, tileControl2, atomActionDTO3, atomActionDTO4, priceDTO2, textDTO5, textDTO6, separator2, str4, checkbox2, cornerRadius2, spacers2, map5, map6, map7, map8, favoriteButton2, num2, z12);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final String getImage() {
            return this.image;
        }

        /* renamed from: component10, reason: from getter */
        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        /* renamed from: component11, reason: from getter */
        public final Checkbox getCheckbox() {
            return this.checkbox;
        }

        @NotNull
        /* renamed from: component12, reason: from getter */
        public final CornerRadius getRadius() {
            return this.radius;
        }

        @NotNull
        /* renamed from: component13, reason: from getter */
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final Map<String, TokenizedTrackingInfo> component14() {
            return this.trackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component15() {
            return this.deleteTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component16() {
            return this.tapDeleteTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> component17() {
            return this.swipeTrackingInfo;
        }

        /* renamed from: component18, reason: from getter */
        public final FavoriteButton getFavoriteButton() {
            return this.favoriteButton;
        }

        /* renamed from: component19, reason: from getter */
        public final Integer getTimer() {
            return this.timer;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        /* renamed from: component20, reason: from getter */
        public final boolean getDelayedRefresh() {
            return this.delayedRefresh;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final TileControl getTileControl() {
            return this.tileControl;
        }

        @NotNull
        /* renamed from: component4, reason: from getter */
        public final AtomActionDTO getAction() {
            return this.action;
        }

        /* renamed from: component5, reason: from getter */
        public final AtomActionDTO getDeleteAction() {
            return this.deleteAction;
        }

        /* renamed from: component6, reason: from getter */
        public final PriceDTO getPrice() {
            return this.price;
        }

        /* renamed from: component7, reason: from getter */
        public final TextDTO getWeightText() {
            return this.weightText;
        }

        /* renamed from: component8, reason: from getter */
        public final TextDTO getDescription() {
            return this.description;
        }

        /* renamed from: component9, reason: from getter */
        public final Separator getSeparator() {
            return this.separator;
        }

        @NotNull
        public final TileItem copy(@NotNull String image, @NotNull TextDTO title, @ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "availableControl", type = TileControl.AvailableControl.class), @ProtoOneOfSignature(name = "unavailableControl", type = TileControl.UnavailableControl.class)}) @NotNull @ProtoOneOf TileControl tileControl, @NotNull AtomActionDTO action, AtomActionDTO deleteAction, PriceDTO price, TextDTO weightText, TextDTO description, Separator separator, String backgroundColor, Checkbox checkbox, @NotNull CornerRadius radius, @NotNull Spacers spacers, Map<String, TokenizedTrackingInfo> trackingInfo, Map<String, TokenizedTrackingInfo> deleteTrackingInfo, Map<String, TokenizedTrackingInfo> tapDeleteTrackingInfo, Map<String, TokenizedTrackingInfo> swipeTrackingInfo, FavoriteButton favoriteButton, Integer timer, boolean delayedRefresh) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(radius, "radius");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            return new TileItem(image, title, tileControl, action, deleteAction, price, weightText, description, separator, backgroundColor, checkbox, radius, spacers, trackingInfo, deleteTrackingInfo, tapDeleteTrackingInfo, swipeTrackingInfo, favoriteButton, timer, delayedRefresh);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.title, tileItem.title) && Intrinsics.d(this.tileControl, tileItem.tileControl) && Intrinsics.d(this.action, tileItem.action) && Intrinsics.d(this.deleteAction, tileItem.deleteAction) && Intrinsics.d(this.price, tileItem.price) && Intrinsics.d(this.weightText, tileItem.weightText) && Intrinsics.d(this.description, tileItem.description) && Intrinsics.d(this.separator, tileItem.separator) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && Intrinsics.d(this.checkbox, tileItem.checkbox) && this.radius == tileItem.radius && Intrinsics.d(this.spacers, tileItem.spacers) && Intrinsics.d(this.trackingInfo, tileItem.trackingInfo) && Intrinsics.d(this.deleteTrackingInfo, tileItem.deleteTrackingInfo) && Intrinsics.d(this.tapDeleteTrackingInfo, tileItem.tapDeleteTrackingInfo) && Intrinsics.d(this.swipeTrackingInfo, tileItem.swipeTrackingInfo) && Intrinsics.d(this.favoriteButton, tileItem.favoriteButton) && Intrinsics.d(this.timer, tileItem.timer) && this.delayedRefresh == tileItem.delayedRefresh;
        }

        @NotNull
        public final AtomActionDTO getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final Checkbox getCheckbox() {
            return this.checkbox;
        }

        public final boolean getDelayedRefresh() {
            return this.delayedRefresh;
        }

        public final AtomActionDTO getDeleteAction() {
            return this.deleteAction;
        }

        public final Map<String, TokenizedTrackingInfo> getDeleteTrackingInfo() {
            return this.deleteTrackingInfo;
        }

        public final TextDTO getDescription() {
            return this.description;
        }

        public final FavoriteButton getFavoriteButton() {
            return this.favoriteButton;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final PriceDTO getPrice() {
            return this.price;
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

        public final Map<String, TokenizedTrackingInfo> getSwipeTrackingInfo() {
            return this.swipeTrackingInfo;
        }

        public final Map<String, TokenizedTrackingInfo> getTapDeleteTrackingInfo() {
            return this.tapDeleteTrackingInfo;
        }

        @NotNull
        public final TileControl getTileControl() {
            return this.tileControl;
        }

        public final Integer getTimer() {
            return this.timer;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public final TextDTO getWeightText() {
            return this.weightText;
        }

        public int hashCode() {
            int b11 = a.b(this.action, (this.tileControl.hashCode() + Ns.b.a(this.title, this.image.hashCode() * 31, 31)) * 31, 31);
            AtomActionDTO atomActionDTO = this.deleteAction;
            int hashCode = (b11 + (atomActionDTO == null ? 0 : atomActionDTO.hashCode())) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31;
            TextDTO textDTO = this.weightText;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.description;
            int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            Separator separator = this.separator;
            int hashCode5 = (hashCode4 + (separator == null ? 0 : separator.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            Checkbox checkbox = this.checkbox;
            int hashCode7 = (this.spacers.hashCode() + Tl.b.b(this.radius, (hashCode6 + (checkbox == null ? 0 : checkbox.hashCode())) * 31, 31)) * 31;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            int hashCode8 = (hashCode7 + (map == null ? 0 : map.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map2 = this.deleteTrackingInfo;
            int hashCode9 = (hashCode8 + (map2 == null ? 0 : map2.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map3 = this.tapDeleteTrackingInfo;
            int hashCode10 = (hashCode9 + (map3 == null ? 0 : map3.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map4 = this.swipeTrackingInfo;
            int hashCode11 = (hashCode10 + (map4 == null ? 0 : map4.hashCode())) * 31;
            FavoriteButton favoriteButton = this.favoriteButton;
            int hashCode12 = (hashCode11 + (favoriteButton == null ? 0 : favoriteButton.hashCode())) * 31;
            Integer num = this.timer;
            return Boolean.hashCode(this.delayedRefresh) + ((hashCode12 + (num != null ? num.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            String str = this.image;
            TextDTO textDTO = this.title;
            TileControl tileControl = this.tileControl;
            AtomActionDTO atomActionDTO = this.action;
            AtomActionDTO atomActionDTO2 = this.deleteAction;
            PriceDTO priceDTO = this.price;
            TextDTO textDTO2 = this.weightText;
            TextDTO textDTO3 = this.description;
            Separator separator = this.separator;
            String str2 = this.backgroundColor;
            Checkbox checkbox = this.checkbox;
            CornerRadius cornerRadius = this.radius;
            Spacers spacers = this.spacers;
            Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
            Map<String, TokenizedTrackingInfo> map2 = this.deleteTrackingInfo;
            Map<String, TokenizedTrackingInfo> map3 = this.tapDeleteTrackingInfo;
            Map<String, TokenizedTrackingInfo> map4 = this.swipeTrackingInfo;
            FavoriteButton favoriteButton = this.favoriteButton;
            Integer num = this.timer;
            boolean z11 = this.delayedRefresh;
            StringBuilder b11 = Co.a.b("TileItem(image=", textDTO, str, ", title=", ", tileControl=");
            b11.append(tileControl);
            b11.append(", action=");
            b11.append(atomActionDTO);
            b11.append(", deleteAction=");
            b11.append(atomActionDTO2);
            b11.append(", price=");
            b11.append(priceDTO);
            b11.append(", weightText=");
            d.e(", description=", ", separator=", b11, textDTO2, textDTO3);
            b11.append(separator);
            b11.append(", backgroundColor=");
            b11.append(str2);
            b11.append(", checkbox=");
            b11.append(checkbox);
            b11.append(", radius=");
            b11.append(cornerRadius);
            b11.append(", spacers=");
            b11.append(spacers);
            b11.append(", trackingInfo=");
            b11.append(map);
            b11.append(", deleteTrackingInfo=");
            Tl.b.g(b11, map2, ", tapDeleteTrackingInfo=", map3, ", swipeTrackingInfo=");
            b11.append(map4);
            b11.append(", favoriteButton=");
            b11.append(favoriteButton);
            b11.append(", timer=");
            b11.append(num);
            b11.append(", delayedRefresh=");
            b11.append(z11);
            b11.append(")");
            return b11.toString();
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u0017\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0014\u001a\u00020\tHÆ\u0003J5\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\u0016\b\u0002\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00052\b\b\u0002\u0010\b\u001a\u00020\tHÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\u0006HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u001f\u0010\u0004\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Checkbox;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "trackingInfo", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "checkbox", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Ljava/util/Map;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getTrackingInfo", "()Ljava/util/Map;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Checkbox {
            public static final int $stable = 8;

            @NotNull
            private final AtomActionDTO action;

            @NotNull
            private final CheckBoxDTO checkbox;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public Checkbox(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> map, @NotNull CheckBoxDTO checkbox) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(checkbox, "checkbox");
                this.action = action;
                this.trackingInfo = map;
                this.checkbox = checkbox;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Checkbox copy$default(Checkbox checkbox, AtomActionDTO atomActionDTO, Map map, CheckBoxDTO checkBoxDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    atomActionDTO = checkbox.action;
                }
                if ((i11 & 2) != 0) {
                    map = checkbox.trackingInfo;
                }
                if ((i11 & 4) != 0) {
                    checkBoxDTO = checkbox.checkbox;
                }
                return checkbox.copy(atomActionDTO, map, checkBoxDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final AtomActionDTO getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> component2() {
                return this.trackingInfo;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final CheckBoxDTO getCheckbox() {
                return this.checkbox;
            }

            @NotNull
            public final Checkbox copy(@NotNull AtomActionDTO action, Map<String, TokenizedTrackingInfo> trackingInfo, @NotNull CheckBoxDTO checkbox) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(checkbox, "checkbox");
                return new Checkbox(action, trackingInfo, checkbox);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Checkbox)) {
                    return false;
                }
                Checkbox checkbox = (Checkbox) other;
                return Intrinsics.d(this.action, checkbox.action) && Intrinsics.d(this.trackingInfo, checkbox.trackingInfo) && Intrinsics.d(this.checkbox, checkbox.checkbox);
            }

            @NotNull
            public final AtomActionDTO getAction() {
                return this.action;
            }

            @NotNull
            public final CheckBoxDTO getCheckbox() {
                return this.checkbox;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.action.hashCode() * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return this.checkbox.hashCode() + ((hashCode + (map == null ? 0 : map.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                return "Checkbox(action=" + this.action + ", trackingInfo=" + this.trackingInfo + ", checkbox=" + this.checkbox + ")";
            }

            public /* synthetic */ Checkbox(AtomActionDTO atomActionDTO, Map map, CheckBoxDTO checkBoxDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(atomActionDTO, (i11 & 2) != 0 ? null : map, checkBoxDTO);
            }
        }

        public /* synthetic */ TileItem(String str, TextDTO textDTO, TileControl tileControl, AtomActionDTO atomActionDTO, AtomActionDTO atomActionDTO2, PriceDTO priceDTO, TextDTO textDTO2, TextDTO textDTO3, Separator separator, String str2, Checkbox checkbox, CornerRadius cornerRadius, Spacers spacers, Map map, Map map2, Map map3, Map map4, FavoriteButton favoriteButton, Integer num, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textDTO, tileControl, atomActionDTO, atomActionDTO2, priceDTO, textDTO2, textDTO3, separator, str2, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : checkbox, (i11 & 2048) != 0 ? CornerRadius.NO_RADIUS : cornerRadius, (i11 & 4096) != 0 ? new Spacers(null, null, null, 7, null) : spacers, map, map2, map3, map4, favoriteButton, num, (i11 & 524288) != 0 ? false : z11);
        }
    }
}
