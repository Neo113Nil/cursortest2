package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import B3.p;
import G.g;
import Kk.C3532b;
import Lh.b;
import N3.C3660k;
import Ve.C4598rp;
import WZ.t;
import Xc.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteState;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;
import ru.ozon.uni.atoms.data.selectionControls.checkbox.CheckBoxDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001\u001dB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ*\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "tiles", "<init>", "(JLjava/util/List;)V", "copy", "(JLjava/util/List;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTiles", "()Ljava/util/List;", "TileItem", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CartTileVO implements c {
    private final long id;

    @NotNull
    private final List<TileItem> tiles;

    public CartTileVO(long j11, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        this.id = j11;
        this.tiles = tiles;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ CartTileVO copy$default(CartTileVO cartTileVO, long j11, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = cartTileVO.id;
        }
        if ((i11 & 2) != 0) {
            list = cartTileVO.tiles;
        }
        return cartTileVO.copy(j11, list);
    }

    @NotNull
    public final CartTileVO copy(long id2, @NotNull List<TileItem> tiles) {
        Intrinsics.checkNotNullParameter(tiles, "tiles");
        return new CartTileVO(id2, tiles);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CartTileVO)) {
            return false;
        }
        CartTileVO cartTileVO = (CartTileVO) other;
        return this.id == cartTileVO.id && Intrinsics.d(this.tiles, cartTileVO.tiles);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<TileItem> getTiles() {
        return this.tiles;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.tiles.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = b.b(this.id, "CartTileVO(id=", ", tiles=", this.tiles);
        b11.append(")");
        return b11.toString();
    }

    @Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bH\b\u0087\b\u0018\u00002\u00020\u0001:\u0005hijklBý\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\n\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u000e\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u000e\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u000e\u0010\u001e\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\u000e\u0010\u001f\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b\u0012\b\u0010!\u001a\u0004\u0018\u00010 \u0012\u0006\u0010#\u001a\u00020\"\u0012\b\u0010$\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010&\u001a\u00020%\u0012\b\u0010'\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010(\u001a\u00020\"¢\u0006\u0004\b)\u0010*J´\u0002\u0010+\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0012\u001a\u00020\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\u0010\b\u0002\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u0010\b\u0002\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u0010\b\u0002\u0010\u001e\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\u0010\b\u0002\u0010\u001f\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010 2\b\b\u0002\u0010#\u001a\u00020\"2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010&\u001a\u00020%2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010(\u001a\u00020\"HÆ\u0001¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b/\u00100J\u001a\u00102\u001a\u00020\"2\b\u00101\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b2\u00103R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00107\u001a\u0004\b8\u0010.R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00109\u001a\u0004\b:\u0010;R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010?\u001a\u0004\b@\u0010AR\u0019\u0010\f\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\f\u0010?\u001a\u0004\bB\u0010AR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010C\u001a\u0004\bD\u0010ER\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010F\u001a\u0004\bG\u00100R\u0017\u0010\u0012\u001a\u00020\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010H\u001a\u0004\bI\u0010JR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\bK\u0010;R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0014\u00109\u001a\u0004\bL\u0010;R\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010M\u001a\u0004\bN\u0010OR\u0019\u0010\u0017\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0017\u00107\u001a\u0004\bP\u0010.R\u0019\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u0019\u0010Q\u001a\u0004\bR\u0010SR\u001f\u0010\u001c\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010T\u001a\u0004\bU\u0010VR\u001f\u0010\u001d\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001d\u0010T\u001a\u0004\bW\u0010VR\u001f\u0010\u001e\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001e\u0010T\u001a\u0004\bX\u0010VR\u001f\u0010\u001f\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001b8\u0006¢\u0006\f\n\u0004\b\u001f\u0010T\u001a\u0004\bY\u0010VR\u0019\u0010!\u001a\u0004\u0018\u00010 8\u0006¢\u0006\f\n\u0004\b!\u0010Z\u001a\u0004\b[\u0010\\R\u0017\u0010#\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b#\u0010]\u001a\u0004\b^\u0010_R\u0019\u0010$\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b$\u00107\u001a\u0004\b`\u0010.R\u0017\u0010&\u001a\u00020%8\u0006¢\u0006\f\n\u0004\b&\u0010a\u001a\u0004\bb\u0010cR\u0019\u0010'\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b'\u0010d\u001a\u0004\be\u0010fR\u0017\u0010(\u001a\u00020\"8\u0006¢\u0006\f\n\u0004\b(\u0010]\u001a\u0004\bg\u0010_¨\u0006m"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "", "", "widgetId", "", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "tileControl", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "deleteAction", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "price", "", "radius", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "spacers", "weightText", "description", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "separator", "backgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;", "checkboxWrapper", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "deleteTokenizedEvent", "tapTokenizedEvent", "swipeTokenizedEvent", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;", "favoriteButton", "", "hasParanja", "swipeBackgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "swipeState", DynamicElementDTO.TIMER, "delayedRefresh", "<init>", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/price/PriceDTO;ILru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;LWZ/t;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;ZLjava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;Ljava/lang/Long;Z)V", "copy", "(JLjava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/price/PriceDTO;ILru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;Ljava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;LWZ/t;LWZ/t;LWZ/t;LWZ/t;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;ZLjava/lang/String;Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;Ljava/lang/Long;Z)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getWidgetId", "()J", "Ljava/lang/String;", "getImage", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "getTileControl", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "getDeleteAction", "Lru/ozon/uni/atoms/data/price/PriceDTO;", "getPrice", "()Lru/ozon/uni/atoms/data/price/PriceDTO;", "I", "getRadius", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "getSpacers", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "getWeightText", "getDescription", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "getSeparator", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/data/CartTileDTO$TileItem$Separator;", "getBackgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;", "getCheckboxWrapper", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "getDeleteTokenizedEvent", "getTapTokenizedEvent", "getSwipeTokenizedEvent", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;", "getFavoriteButton", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;", "Z", "getHasParanja", "()Z", "getSwipeBackgroundColor", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "getSwipeState", "()Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "Ljava/lang/Long;", "getTimer", "()Ljava/lang/Long;", "getDelayedRefresh", "SwipeTileState", "TileControl", "Spacers", "CheckboxWrapper", "FavoriteButton", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TileItem {

        @NotNull
        private final AtomAction action;
        private final String backgroundColor;
        private final CheckboxWrapper checkboxWrapper;
        private final boolean delayedRefresh;
        private final AtomAction deleteAction;
        private final t deleteTokenizedEvent;
        private final TextDTO description;
        private final FavoriteButton favoriteButton;
        private final boolean hasParanja;

        @NotNull
        private final String image;
        private final PriceDTO price;
        private final int radius;
        private final CartTileDTO.TileItem.Separator separator;

        @NotNull
        private final Spacers spacers;
        private final String swipeBackgroundColor;

        @NotNull
        private final SwipeTileState swipeState;
        private final t swipeTokenizedEvent;
        private final t tapTokenizedEvent;

        @NotNull
        private final TileControl tileControl;
        private final Long timer;

        @NotNull
        private final TextDTO title;
        private final t tokenizedEvent;
        private final TextDTO weightText;
        private final long widgetId;

        @Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\u0006\u001a\n\u0018\u00010\u0004j\u0004\u0018\u0001`\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$CheckboxWrapper;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "trackingEvent", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "checkbox", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTrackingEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "getCheckbox", "()Lru/ozon/uni/atoms/data/selectionControls/checkbox/CheckBoxDTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class CheckboxWrapper {

            @NotNull
            private final AtomAction action;

            @NotNull
            private final CheckBoxDTO checkbox;
            private final t trackingEvent;

            public CheckboxWrapper(@NotNull AtomAction action, t tVar, @NotNull CheckBoxDTO checkbox) {
                Intrinsics.checkNotNullParameter(action, "action");
                Intrinsics.checkNotNullParameter(checkbox, "checkbox");
                this.action = action;
                this.trackingEvent = tVar;
                this.checkbox = checkbox;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof CheckboxWrapper)) {
                    return false;
                }
                CheckboxWrapper checkboxWrapper = (CheckboxWrapper) other;
                return Intrinsics.d(this.action, checkboxWrapper.action) && Intrinsics.d(this.trackingEvent, checkboxWrapper.trackingEvent) && Intrinsics.d(this.checkbox, checkboxWrapper.checkbox);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            @NotNull
            public final CheckBoxDTO getCheckbox() {
                return this.checkbox;
            }

            public final t getTrackingEvent() {
                return this.trackingEvent;
            }

            public int hashCode() {
                int hashCode = this.action.hashCode() * 31;
                t tVar = this.trackingEvent;
                return this.checkbox.hashCode() + ((hashCode + (tVar == null ? 0 : tVar.hashCode())) * 31);
            }

            @NotNull
            public String toString() {
                return "CheckboxWrapper(action=" + this.action + ", trackingEvent=" + this.trackingEvent + ", checkbox=" + this.checkbox + ")";
            }
        }

        @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$FavoriteButton;", "", "", "icon", "selectedIconColor", "unselectedIconColor", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "favoriteState", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getIcon", "getSelectedIconColor", "getUnselectedIconColor", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "getFavoriteState", "()Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteState;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FavoriteButton {

            @NotNull
            private final FreshFavoriteState favoriteState;

            @NotNull
            private final String icon;

            @NotNull
            private final String selectedIconColor;

            @NotNull
            private final String unselectedIconColor;

            public FavoriteButton(@NotNull String icon, @NotNull String selectedIconColor, @NotNull String unselectedIconColor, @NotNull FreshFavoriteState favoriteState) {
                Intrinsics.checkNotNullParameter(icon, "icon");
                Intrinsics.checkNotNullParameter(selectedIconColor, "selectedIconColor");
                Intrinsics.checkNotNullParameter(unselectedIconColor, "unselectedIconColor");
                Intrinsics.checkNotNullParameter(favoriteState, "favoriteState");
                this.icon = icon;
                this.selectedIconColor = selectedIconColor;
                this.unselectedIconColor = unselectedIconColor;
                this.favoriteState = favoriteState;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FavoriteButton)) {
                    return false;
                }
                FavoriteButton favoriteButton = (FavoriteButton) other;
                return Intrinsics.d(this.icon, favoriteButton.icon) && Intrinsics.d(this.selectedIconColor, favoriteButton.selectedIconColor) && Intrinsics.d(this.unselectedIconColor, favoriteButton.unselectedIconColor) && Intrinsics.d(this.favoriteState, favoriteButton.favoriteState);
            }

            @NotNull
            public final FreshFavoriteState getFavoriteState() {
                return this.favoriteState;
            }

            @NotNull
            public final String getIcon() {
                return this.icon;
            }

            @NotNull
            public final String getSelectedIconColor() {
                return this.selectedIconColor;
            }

            @NotNull
            public final String getUnselectedIconColor() {
                return this.unselectedIconColor;
            }

            public int hashCode() {
                return this.favoriteState.hashCode() + g.a(g.a(this.icon.hashCode() * 31, 31, this.selectedIconColor), 31, this.unselectedIconColor);
            }

            @NotNull
            public String toString() {
                String str = this.icon;
                String str2 = this.selectedIconColor;
                String str3 = this.unselectedIconColor;
                FreshFavoriteState freshFavoriteState = this.favoriteState;
                StringBuilder d11 = C3660k.d("FavoriteButton(icon=", str, ", selectedIconColor=", str2, ", unselectedIconColor=");
                d11.append(str3);
                d11.append(", favoriteState=");
                d11.append(freshFavoriteState);
                d11.append(")");
                return d11.toString();
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0014\u0010\f¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$Spacers;", "", "", "vertical", "horizontal", "between", "<init>", "(III)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getVertical", "getHorizontal", "getBetween", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Spacers {
            private final int between;
            private final int horizontal;
            private final int vertical;

            public Spacers(int i11, int i12, int i13) {
                this.vertical = i11;
                this.horizontal = i12;
                this.between = i13;
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

            public final int getBetween() {
                return this.between;
            }

            public final int getHorizontal() {
                return this.horizontal;
            }

            public final int getVertical() {
                return this.vertical;
            }

            public int hashCode() {
                return Integer.hashCode(this.between) + C2454a.a(this.horizontal, Integer.hashCode(this.vertical) * 31, 31);
            }

            @NotNull
            public String toString() {
                return K00.b.e(this.between, ")", C2438a.a("Spacers(vertical=", this.vertical, ", horizontal=", ", between=", this.horizontal));
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$SwipeTileState;", "", "<init>", "(Ljava/lang/String;I)V", "Closed", "Revealed", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class SwipeTileState {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ SwipeTileState[] $VALUES;
            public static final SwipeTileState Closed = new SwipeTileState("Closed", 0);
            public static final SwipeTileState Revealed = new SwipeTileState("Revealed", 1);

            private static final /* synthetic */ SwipeTileState[] $values() {
                return new SwipeTileState[]{Closed, Revealed};
            }

            static {
                SwipeTileState[] $values = $values();
                $VALUES = $values;
                $ENTRIES = Xc.b.a($values);
            }

            private SwipeTileState(String str, int i11) {
            }

            public static SwipeTileState valueOf(String str) {
                return (SwipeTileState) Enum.valueOf(SwipeTileState.class, str);
            }

            public static SwipeTileState[] values() {
                return (SwipeTileState[]) $VALUES.clone();
            }
        }

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "", "AvailableControl", "UnavailableControl", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl$UnavailableControl;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface TileControl {

            @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001a\u0010\u0006\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u0002HÆ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl$AvailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "cartPicker", "<init>", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;)V", "copy", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl$AvailableControl;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "getCartPicker", "()Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class AvailableControl implements TileControl {

                @NotNull
                private final CartPickerVO cartPicker;

                public AvailableControl(@NotNull CartPickerVO cartPicker) {
                    Intrinsics.checkNotNullParameter(cartPicker, "cartPicker");
                    this.cartPicker = cartPicker;
                }

                @NotNull
                public final AvailableControl copy(@NotNull CartPickerVO cartPicker) {
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
                public final CartPickerVO getCartPicker() {
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

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl$UnavailableControl;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO$TileItem$TileControl;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "button", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "binButton", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getBinButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class UnavailableControl implements TileControl {
                public static final int $stable = IconButtonV3DTO.$stable;
                private final IconButtonV3DTO binButton;
                private final ButtonV3DTO button;

                public UnavailableControl(ButtonV3DTO buttonV3DTO, IconButtonV3DTO iconButtonV3DTO) {
                    this.button = buttonV3DTO;
                    this.binButton = iconButtonV3DTO;
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

        public TileItem(long j11, @NotNull String image, @NotNull TextDTO title, @NotNull TileControl tileControl, @NotNull AtomAction action, AtomAction atomAction, PriceDTO priceDTO, int i11, @NotNull Spacers spacers, TextDTO textDTO, TextDTO textDTO2, CartTileDTO.TileItem.Separator separator, String str, CheckboxWrapper checkboxWrapper, t tVar, t tVar2, t tVar3, t tVar4, FavoriteButton favoriteButton, boolean z11, String str2, @NotNull SwipeTileState swipeState, Long l11, boolean z12) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            Intrinsics.checkNotNullParameter(swipeState, "swipeState");
            this.widgetId = j11;
            this.image = image;
            this.title = title;
            this.tileControl = tileControl;
            this.action = action;
            this.deleteAction = atomAction;
            this.price = priceDTO;
            this.radius = i11;
            this.spacers = spacers;
            this.weightText = textDTO;
            this.description = textDTO2;
            this.separator = separator;
            this.backgroundColor = str;
            this.checkboxWrapper = checkboxWrapper;
            this.tokenizedEvent = tVar;
            this.deleteTokenizedEvent = tVar2;
            this.tapTokenizedEvent = tVar3;
            this.swipeTokenizedEvent = tVar4;
            this.favoriteButton = favoriteButton;
            this.hasParanja = z11;
            this.swipeBackgroundColor = str2;
            this.swipeState = swipeState;
            this.timer = l11;
            this.delayedRefresh = z12;
        }

        public static /* synthetic */ TileItem copy$default(TileItem tileItem, long j11, String str, TextDTO textDTO, TileControl tileControl, AtomAction atomAction, AtomAction atomAction2, PriceDTO priceDTO, int i11, Spacers spacers, TextDTO textDTO2, TextDTO textDTO3, CartTileDTO.TileItem.Separator separator, String str2, CheckboxWrapper checkboxWrapper, t tVar, t tVar2, t tVar3, t tVar4, FavoriteButton favoriteButton, boolean z11, String str3, SwipeTileState swipeTileState, Long l11, boolean z12, int i12, Object obj) {
            boolean z13;
            Long l12;
            long j12 = (i12 & 1) != 0 ? tileItem.widgetId : j11;
            String str4 = (i12 & 2) != 0 ? tileItem.image : str;
            TextDTO textDTO4 = (i12 & 4) != 0 ? tileItem.title : textDTO;
            TileControl tileControl2 = (i12 & 8) != 0 ? tileItem.tileControl : tileControl;
            AtomAction atomAction3 = (i12 & 16) != 0 ? tileItem.action : atomAction;
            AtomAction atomAction4 = (i12 & 32) != 0 ? tileItem.deleteAction : atomAction2;
            PriceDTO priceDTO2 = (i12 & 64) != 0 ? tileItem.price : priceDTO;
            int i13 = (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tileItem.radius : i11;
            Spacers spacers2 = (i12 & 256) != 0 ? tileItem.spacers : spacers;
            TextDTO textDTO5 = (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tileItem.weightText : textDTO2;
            TextDTO textDTO6 = (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tileItem.description : textDTO3;
            CartTileDTO.TileItem.Separator separator2 = (i12 & 2048) != 0 ? tileItem.separator : separator;
            String str5 = (i12 & 4096) != 0 ? tileItem.backgroundColor : str2;
            long j13 = j12;
            CheckboxWrapper checkboxWrapper2 = (i12 & 8192) != 0 ? tileItem.checkboxWrapper : checkboxWrapper;
            t tVar5 = (i12 & 16384) != 0 ? tileItem.tokenizedEvent : tVar;
            t tVar6 = (i12 & 32768) != 0 ? tileItem.deleteTokenizedEvent : tVar2;
            t tVar7 = (i12 & 65536) != 0 ? tileItem.tapTokenizedEvent : tVar3;
            t tVar8 = (i12 & 131072) != 0 ? tileItem.swipeTokenizedEvent : tVar4;
            FavoriteButton favoriteButton2 = (i12 & 262144) != 0 ? tileItem.favoriteButton : favoriteButton;
            boolean z14 = (i12 & 524288) != 0 ? tileItem.hasParanja : z11;
            String str6 = (i12 & 1048576) != 0 ? tileItem.swipeBackgroundColor : str3;
            SwipeTileState swipeTileState2 = (i12 & 2097152) != 0 ? tileItem.swipeState : swipeTileState;
            Long l13 = (i12 & 4194304) != 0 ? tileItem.timer : l11;
            if ((i12 & 8388608) != 0) {
                l12 = l13;
                z13 = tileItem.delayedRefresh;
            } else {
                z13 = z12;
                l12 = l13;
            }
            return tileItem.copy(j13, str4, textDTO4, tileControl2, atomAction3, atomAction4, priceDTO2, i13, spacers2, textDTO5, textDTO6, separator2, str5, checkboxWrapper2, tVar5, tVar6, tVar7, tVar8, favoriteButton2, z14, str6, swipeTileState2, l12, z13);
        }

        @NotNull
        public final TileItem copy(long widgetId, @NotNull String image, @NotNull TextDTO title, @NotNull TileControl tileControl, @NotNull AtomAction action, AtomAction deleteAction, PriceDTO price, int radius, @NotNull Spacers spacers, TextDTO weightText, TextDTO description, CartTileDTO.TileItem.Separator separator, String backgroundColor, CheckboxWrapper checkboxWrapper, t tokenizedEvent, t deleteTokenizedEvent, t tapTokenizedEvent, t swipeTokenizedEvent, FavoriteButton favoriteButton, boolean hasParanja, String swipeBackgroundColor, @NotNull SwipeTileState swipeState, Long timer, boolean delayedRefresh) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(tileControl, "tileControl");
            Intrinsics.checkNotNullParameter(action, "action");
            Intrinsics.checkNotNullParameter(spacers, "spacers");
            Intrinsics.checkNotNullParameter(swipeState, "swipeState");
            return new TileItem(widgetId, image, title, tileControl, action, deleteAction, price, radius, spacers, weightText, description, separator, backgroundColor, checkboxWrapper, tokenizedEvent, deleteTokenizedEvent, tapTokenizedEvent, swipeTokenizedEvent, favoriteButton, hasParanja, swipeBackgroundColor, swipeState, timer, delayedRefresh);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TileItem)) {
                return false;
            }
            TileItem tileItem = (TileItem) other;
            return this.widgetId == tileItem.widgetId && Intrinsics.d(this.image, tileItem.image) && Intrinsics.d(this.title, tileItem.title) && Intrinsics.d(this.tileControl, tileItem.tileControl) && Intrinsics.d(this.action, tileItem.action) && Intrinsics.d(this.deleteAction, tileItem.deleteAction) && Intrinsics.d(this.price, tileItem.price) && this.radius == tileItem.radius && Intrinsics.d(this.spacers, tileItem.spacers) && Intrinsics.d(this.weightText, tileItem.weightText) && Intrinsics.d(this.description, tileItem.description) && Intrinsics.d(this.separator, tileItem.separator) && Intrinsics.d(this.backgroundColor, tileItem.backgroundColor) && Intrinsics.d(this.checkboxWrapper, tileItem.checkboxWrapper) && Intrinsics.d(this.tokenizedEvent, tileItem.tokenizedEvent) && Intrinsics.d(this.deleteTokenizedEvent, tileItem.deleteTokenizedEvent) && Intrinsics.d(this.tapTokenizedEvent, tileItem.tapTokenizedEvent) && Intrinsics.d(this.swipeTokenizedEvent, tileItem.swipeTokenizedEvent) && Intrinsics.d(this.favoriteButton, tileItem.favoriteButton) && this.hasParanja == tileItem.hasParanja && Intrinsics.d(this.swipeBackgroundColor, tileItem.swipeBackgroundColor) && this.swipeState == tileItem.swipeState && Intrinsics.d(this.timer, tileItem.timer) && this.delayedRefresh == tileItem.delayedRefresh;
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final CheckboxWrapper getCheckboxWrapper() {
            return this.checkboxWrapper;
        }

        public final boolean getDelayedRefresh() {
            return this.delayedRefresh;
        }

        public final AtomAction getDeleteAction() {
            return this.deleteAction;
        }

        public final t getDeleteTokenizedEvent() {
            return this.deleteTokenizedEvent;
        }

        public final TextDTO getDescription() {
            return this.description;
        }

        public final FavoriteButton getFavoriteButton() {
            return this.favoriteButton;
        }

        public final boolean getHasParanja() {
            return this.hasParanja;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final PriceDTO getPrice() {
            return this.price;
        }

        public final int getRadius() {
            return this.radius;
        }

        public final CartTileDTO.TileItem.Separator getSeparator() {
            return this.separator;
        }

        @NotNull
        public final Spacers getSpacers() {
            return this.spacers;
        }

        public final String getSwipeBackgroundColor() {
            return this.swipeBackgroundColor;
        }

        @NotNull
        public final SwipeTileState getSwipeState() {
            return this.swipeState;
        }

        public final t getSwipeTokenizedEvent() {
            return this.swipeTokenizedEvent;
        }

        public final t getTapTokenizedEvent() {
            return this.tapTokenizedEvent;
        }

        @NotNull
        public final TileControl getTileControl() {
            return this.tileControl;
        }

        public final Long getTimer() {
            return this.timer;
        }

        @NotNull
        public final TextDTO getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final TextDTO getWeightText() {
            return this.weightText;
        }

        public final long getWidgetId() {
            return this.widgetId;
        }

        public int hashCode() {
            int a11 = C4598rp.a(this.action, (this.tileControl.hashCode() + Ns.b.a(this.title, g.a(Long.hashCode(this.widgetId) * 31, 31, this.image), 31)) * 31, 31);
            AtomAction atomAction = this.deleteAction;
            int hashCode = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            PriceDTO priceDTO = this.price;
            int hashCode2 = (this.spacers.hashCode() + C2454a.a(this.radius, (hashCode + (priceDTO == null ? 0 : priceDTO.hashCode())) * 31, 31)) * 31;
            TextDTO textDTO = this.weightText;
            int hashCode3 = (hashCode2 + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.description;
            int hashCode4 = (hashCode3 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            CartTileDTO.TileItem.Separator separator = this.separator;
            int hashCode5 = (hashCode4 + (separator == null ? 0 : separator.hashCode())) * 31;
            String str = this.backgroundColor;
            int hashCode6 = (hashCode5 + (str == null ? 0 : str.hashCode())) * 31;
            CheckboxWrapper checkboxWrapper = this.checkboxWrapper;
            int hashCode7 = (hashCode6 + (checkboxWrapper == null ? 0 : checkboxWrapper.hashCode())) * 31;
            t tVar = this.tokenizedEvent;
            int hashCode8 = (hashCode7 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            t tVar2 = this.deleteTokenizedEvent;
            int hashCode9 = (hashCode8 + (tVar2 == null ? 0 : tVar2.hashCode())) * 31;
            t tVar3 = this.tapTokenizedEvent;
            int hashCode10 = (hashCode9 + (tVar3 == null ? 0 : tVar3.hashCode())) * 31;
            t tVar4 = this.swipeTokenizedEvent;
            int hashCode11 = (hashCode10 + (tVar4 == null ? 0 : tVar4.hashCode())) * 31;
            FavoriteButton favoriteButton = this.favoriteButton;
            int a12 = C3532b.a((hashCode11 + (favoriteButton == null ? 0 : favoriteButton.hashCode())) * 31, 31, this.hasParanja);
            String str2 = this.swipeBackgroundColor;
            int hashCode12 = (this.swipeState.hashCode() + ((a12 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
            Long l11 = this.timer;
            return Boolean.hashCode(this.delayedRefresh) + ((hashCode12 + (l11 != null ? l11.hashCode() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            long j11 = this.widgetId;
            String str = this.image;
            TextDTO textDTO = this.title;
            TileControl tileControl = this.tileControl;
            AtomAction atomAction = this.action;
            AtomAction atomAction2 = this.deleteAction;
            PriceDTO priceDTO = this.price;
            int i11 = this.radius;
            Spacers spacers = this.spacers;
            TextDTO textDTO2 = this.weightText;
            TextDTO textDTO3 = this.description;
            CartTileDTO.TileItem.Separator separator = this.separator;
            String str2 = this.backgroundColor;
            CheckboxWrapper checkboxWrapper = this.checkboxWrapper;
            t tVar = this.tokenizedEvent;
            t tVar2 = this.deleteTokenizedEvent;
            t tVar3 = this.tapTokenizedEvent;
            t tVar4 = this.swipeTokenizedEvent;
            FavoriteButton favoriteButton = this.favoriteButton;
            boolean z11 = this.hasParanja;
            String str3 = this.swipeBackgroundColor;
            SwipeTileState swipeTileState = this.swipeState;
            Long l11 = this.timer;
            boolean z12 = this.delayedRefresh;
            StringBuilder c11 = C2436a.c(j11, "TileItem(widgetId=", ", image=", str);
            c11.append(", title=");
            c11.append(textDTO);
            c11.append(", tileControl=");
            c11.append(tileControl);
            c11.append(", action=");
            c11.append(atomAction);
            c11.append(", deleteAction=");
            c11.append(atomAction2);
            c11.append(", price=");
            c11.append(priceDTO);
            c11.append(", radius=");
            c11.append(i11);
            c11.append(", spacers=");
            c11.append(spacers);
            c11.append(", weightText=");
            c11.append(textDTO2);
            c11.append(", description=");
            c11.append(textDTO3);
            c11.append(", separator=");
            c11.append(separator);
            c11.append(", backgroundColor=");
            c11.append(str2);
            c11.append(", checkboxWrapper=");
            c11.append(checkboxWrapper);
            p.d(c11, ", tokenizedEvent=", tVar, ", deleteTokenizedEvent=", tVar2);
            p.d(c11, ", tapTokenizedEvent=", tVar3, ", swipeTokenizedEvent=", tVar4);
            c11.append(", favoriteButton=");
            c11.append(favoriteButton);
            c11.append(", hasParanja=");
            c11.append(z11);
            c11.append(", swipeBackgroundColor=");
            c11.append(str3);
            c11.append(", swipeState=");
            c11.append(swipeTileState);
            c11.append(", timer=");
            c11.append(l11);
            c11.append(", delayedRefresh=");
            c11.append(z12);
            c11.append(")");
            return c11.toString();
        }

        public /* synthetic */ TileItem(long j11, String str, TextDTO textDTO, TileControl tileControl, AtomAction atomAction, AtomAction atomAction2, PriceDTO priceDTO, int i11, Spacers spacers, TextDTO textDTO2, TextDTO textDTO3, CartTileDTO.TileItem.Separator separator, String str2, CheckboxWrapper checkboxWrapper, t tVar, t tVar2, t tVar3, t tVar4, FavoriteButton favoriteButton, boolean z11, String str3, SwipeTileState swipeTileState, Long l11, boolean z12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(j11, str, textDTO, tileControl, atomAction, atomAction2, priceDTO, i11, spacers, textDTO2, textDTO3, separator, str2, checkboxWrapper, tVar, tVar2, tVar3, tVar4, favoriteButton, z11, str3, (i12 & 2097152) != 0 ? SwipeTileState.Closed : swipeTileState, l11, z12);
        }
    }
}
