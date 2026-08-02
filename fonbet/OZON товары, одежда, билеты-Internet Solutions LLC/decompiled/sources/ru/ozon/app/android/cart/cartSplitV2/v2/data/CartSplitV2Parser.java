package ru.ozon.app.android.cart.cartSplitV2.v2.data;

import Tc.b;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.cart.cartSplitV2.v2.data.CartSplitV2DTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.dynamicElementV2.DynamicElementDTOV2;
import ru.ozon.app.android.cart.cartSplitV2.v2.subwidgets.presentation.product.productView.ProductDTOV2;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0090\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010 \n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 =2.\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00030\u0001j\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u0003`\u0005:\u0001=B\u001d\b\u0007\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ1\u0010\u0013\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J1\u0010\u0015\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00040\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0015\u0010\u0014J3\u0010\u0019\u001a\u00020\u0012*\b\u0012\u0004\u0012\u00020\u00040\r2\u0006\u0010\u0016\u001a\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ%\u0010!\u001a\u00020 *\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b!\u0010\"J\u001d\u0010$\u001a\u0004\u0018\u00010#*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b$\u0010%J\u001d\u0010'\u001a\u0004\u0018\u00010&*\u00020\u000e2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b'\u0010(J\u001d\u0010+\u001a\u0004\u0018\u00010**\u00020\u000e2\u0006\u0010)\u001a\u00020\u0017H\u0002¢\u0006\u0004\b+\u0010,J\u001b\u0010/\u001a\u00020.*\u00020-2\u0006\u0010\u0018\u001a\u00020\u0017H\u0002¢\u0006\u0004\b/\u00100J%\u00105\u001a\u0004\u0018\u0001012\b\u00102\u001a\u0004\u0018\u0001012\b\u00104\u001a\u0004\u0018\u000103H\u0002¢\u0006\u0004\b5\u00106J*\u00109\u001a\b\u0012\u0004\u0012\u00020\u00040\u00032\b\u00107\u001a\u0004\u0018\u00010\u00022\b\u00108\u001a\u0004\u0018\u00010\u0002H\u0096\u0002¢\u0006\u0004\b9\u0010:R\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010;R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010<¨\u0006>"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2Parser;", "Lkotlin/Function2;", "", "", "", "Lru/ozon/app/android/composer/widgets/base/WidgetParser;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "<init>", "(Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;", "items", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;", "separator", "", "addCartItems", "(Ljava/util/List;Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;)V", "addCartItemsOneOf", "item", "", "index", "addCartItem", "(Ljava/util/List;Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;ILru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;)V", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2HeaderDTOV2;", "toHeaderSubDTO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2HeaderDTOV2;", "cartItemsSeparator", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "toProductSubDTO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;ILru/ozon/app/android/cart/cartSplitV2/v2/data/SeparatorConfig;)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ProductDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ControlsDTOV2;", "toControlsSubDTO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;I)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2ControlsDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "toDynamicElementsSubDTO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;I)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DynamicElementsDTOV2;", "productId", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2AccessoriesDTOV2;", "toAccessoriesSubDTO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$Item;I)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2AccessoriesDTOV2;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CellCartItem;", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "toCartCellItemSubDTO", "(Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2DTOV2$CellCartItem;I)Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2CellItemDTOV2;", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "action", "Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;", "swipeInfoDTO", "parseSwipeRemoveAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cart/cartSplitV2/v2/data/SwipeInfoDTO;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "params", "state", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Companion", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CartSplitV2Parser implements Function2<String, String, List<? extends Object>> {

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @NotNull
    private static final IslandSeparatorDTO topIslandSeparatorDTO = new IslandSeparatorDTO(4, null, IslandSeparatorDTO.Configuration.SECTION_BEGIN, null, null, null);

    @NotNull
    private static final IslandSeparatorDTO bottomIslandSeparatorDTO = new IslandSeparatorDTO(0, null, IslandSeparatorDTO.Configuration.SECTION_END, null, null, null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/cart/cartSplitV2/v2/data/CartSplitV2Parser$Companion;", "", "<init>", "()V", "", "SWIPE_REMOVE_ACTION_ID", "Ljava/lang/String;", "SWIPE_TRACKING_INFO_KEY", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public CartSplitV2Parser(@NotNull JsonParser jsonDeserializer, @NotNull JsonSerializer jsonSerializer) {
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.jsonDeserializer = jsonDeserializer;
        this.jsonSerializer = jsonSerializer;
    }

    private final void addCartItem(List<Object> list, CartSplitV2DTOV2.Item item, int i11, SeparatorConfig separatorConfig) {
        list.add(toProductSubDTO(item, i11, separatorConfig));
        CartSplitV2ControlsDTOV2 controlsSubDTO = toControlsSubDTO(item, i11);
        if (controlsSubDTO != null) {
            list.add(controlsSubDTO);
        }
        CartSplitV2AccessoriesDTOV2 accessoriesSubDTO = toAccessoriesSubDTO(item, item.getProduct().getId().hashCode());
        if (accessoriesSubDTO != null) {
            list.add(accessoriesSubDTO);
        }
    }

    private final void addCartItems(List<Object> list, List<CartSplitV2DTOV2.Item> list2, SeparatorConfig separatorConfig) {
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            addCartItem(list, (CartSplitV2DTOV2.Item) obj, i11, separatorConfig);
            i11 = i12;
        }
    }

    private final void addCartItemsOneOf(List<Object> list, List<? extends Object> list2, SeparatorConfig separatorConfig) {
        int i11 = 0;
        for (Object obj : list2) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            if (obj instanceof CartSplitV2DTOV2.Item) {
                addCartItem(list, (CartSplitV2DTOV2.Item) obj, i11, separatorConfig);
            } else if (obj instanceof CartSplitV2DTOV2.CellCartItem) {
                list.add(toCartCellItemSubDTO((CartSplitV2DTOV2.CellCartItem) obj, i11));
            }
            i11 = i12;
        }
    }

    private final AtomActionDTO parseSwipeRemoveAction(AtomActionDTO action, SwipeInfoDTO swipeInfoDTO) {
        LinkedHashMap linkedHashMap;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        if (swipeInfoDTO == null || (trackingInfo = swipeInfoDTO.getTrackingInfo()) == null) {
            linkedHashMap = null;
        } else {
            linkedHashMap = new LinkedHashMap();
            for (Map.Entry<String, TokenizedTrackingInfo> entry : trackingInfo.entrySet()) {
                String key = entry.getKey();
                if (Intrinsics.d(key, "swipe_pre_remove") || Intrinsics.d(key, "swipe_remove")) {
                    linkedHashMap.put(entry.getKey(), entry.getValue());
                }
            }
        }
        if (action == null) {
            return null;
        }
        Map<String, String> params = action.getParams();
        return AtomActionDTO.copy$default(action, null, null, "removeCartSplitSwipe", params != null ? U.n(params, new Pair("swipeTrackingInfo", this.jsonSerializer.toJson((JsonSerializer) linkedHashMap, (Class<JsonSerializer>) Map.class))) : null, null, 19, null);
    }

    private final CartSplitV2AccessoriesDTOV2 toAccessoriesSubDTO(CartSplitV2DTOV2.Item item, int i11) {
        AtomActionDTO getAccessoriesAction = item.getGetAccessoriesAction();
        if (getAccessoriesAction != null) {
            return new CartSplitV2AccessoriesDTOV2(i11, getAccessoriesAction);
        }
        return null;
    }

    private final CartSplitV2CellItemDTOV2 toCartCellItemSubDTO(CartSplitV2DTOV2.CellCartItem cellCartItem, int i11) {
        return new CartSplitV2CellItemDTOV2(i11, cellCartItem.getId(), cellCartItem.getCell(), cellCartItem.getHidingTimeMls(), cellCartItem.getStrokeColor(), cellCartItem.isLast(), cellCartItem.getExternalPaddings());
    }

    private final CartSplitV2ControlsDTOV2 toControlsSubDTO(CartSplitV2DTOV2.Item item, int i11) {
        ControlsDTO controls = item.getControls();
        if (controls == null) {
            return null;
        }
        AtomActionDTO atomActionDTO = null;
        SwipeInfoDTO swipeInfo = item.getSwipeInfo();
        FavoriteProductMolecule favoriteProduct = item.getControls().getFavoriteProduct();
        CommonControlSettings common = item.getControls().getRemoveButton().getCommon();
        if (common != null) {
            atomActionDTO = common.getAction();
        }
        return new CartSplitV2ControlsDTOV2(i11, controls, swipeInfo, favoriteProduct, parseSwipeRemoveAction(atomActionDTO, item.getSwipeInfo()));
    }

    private final CartSplitV2DynamicElementsDTOV2 toDynamicElementsSubDTO(CartSplitV2DTOV2.Item item, int i11) {
        List<DynamicElementDTOV2> dynamicElements = item.getDynamicElements();
        if (dynamicElements != null) {
            return new CartSplitV2DynamicElementsDTOV2(i11, dynamicElements);
        }
        return null;
    }

    private final CartSplitV2HeaderDTOV2 toHeaderSubDTO(CartSplitV2DTOV2 cartSplitV2DTOV2) {
        HeaderDTO header = cartSplitV2DTOV2.getHeader();
        if (header != null) {
            return new CartSplitV2HeaderDTOV2(header);
        }
        return null;
    }

    private final CartSplitV2ProductDTOV2 toProductSubDTO(CartSplitV2DTOV2.Item item, int i11, SeparatorConfig separatorConfig) {
        IconButtonV3DTO removeButton;
        CommonControlSettings common;
        CheckboxDTO checkbox = item.getCheckbox();
        ProductDTOV2 product = item.getProduct();
        SwipeInfoDTO swipeInfo = item.getSwipeInfo();
        ControlsDTO controls = item.getControls();
        AtomActionDTO atomActionDTO = null;
        FavoriteProductMolecule favoriteProduct = controls != null ? controls.getFavoriteProduct() : null;
        ControlsDTO controls2 = item.getControls();
        if (controls2 != null && (removeButton = controls2.getRemoveButton()) != null && (common = removeButton.getCommon()) != null) {
            atomActionDTO = common.getAction();
        }
        return new CartSplitV2ProductDTOV2(i11, checkbox, product, separatorConfig, swipeInfo, favoriteProduct, parseSwipeRemoveAction(atomActionDTO, item.getSwipeInfo()), toDynamicElementsSubDTO(item, i11));
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<Object> invoke(String params, String state) {
        JsonParser jsonParser = this.jsonDeserializer;
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        CartSplitV2DTOV2 cartSplitV2DTOV2 = (CartSplitV2DTOV2) jsonParser.fromJson(state, CartSplitV2DTOV2.class);
        b builder = C7714v.B();
        CartSplitV2HeaderDTOV2 headerSubDTO = toHeaderSubDTO(cartSplitV2DTOV2);
        if (headerSubDTO != null) {
            builder.add(topIslandSeparatorDTO);
            builder.add(headerSubDTO);
        }
        List<CartSplitV2DTOV2.Item> cartItems = cartSplitV2DTOV2.getCartItems();
        if (cartItems != null) {
            addCartItems(builder, cartItems, cartSplitV2DTOV2.getCartItemsSeparator());
        }
        List<CartSplitV2DTOV2.CartItemWrapper> cartItemsOneOf = cartSplitV2DTOV2.getCartItemsOneOf();
        if (cartItemsOneOf != null) {
            addCartItemsOneOf(builder, cartItemsOneOf, cartSplitV2DTOV2.getCartItemsSeparator());
        }
        Footer footer = cartSplitV2DTOV2.getFooter();
        if (footer != null ? Intrinsics.d(footer.isRounded(), Boolean.TRUE) : false) {
            builder.add(bottomIslandSeparatorDTO);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
