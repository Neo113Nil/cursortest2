package ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation;

import Vg.d;
import WZ.l;
import androidx.lifecycle.K;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.cart.common.domain.CartService;
import ru.ozon.app.android.cart.common.domain.CartState;
import ru.ozon.app.android.cart.common.models.CartItemInfo;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.cart.ui.molecules.cartPicker.presentation.CartPickerVO;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.data.ReorderTileDTO;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.ReorderTileVO;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item.ReorderTileItemAdapter;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item.ReorderTileItemDecorator;
import ru.ozon.app.android.fresh.cart.widgets.reorderTile.presentation.item.ReorderTileUpdate;
import ru.ozon.app.android.fresh.common.widgets.molecules.QuantCountStrategy;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.haptic.HapticToken;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u0000 ?2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001?B7\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\n\u0010\r\u001a\u00060\u000bj\u0002`\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J#\u0010\u001a\u001a\u00020\u00192\b\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\u0010\u0018\u001a\u0004\u0018\u00010\u0016H\u0002¢\u0006\u0004\b\u001a\u0010\u001bJ\u000f\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u001c2\u0006\u0010!\u001a\u00020 H\u0002¢\u0006\u0004\b\"\u0010#J#\u0010'\u001a\u0012\u0012\u0004\u0012\u00020&\u0012\u0006\u0012\u0004\u0018\u00010&\u0018\u00010%*\u00020$H\u0002¢\u0006\u0004\b'\u0010(J\u001f\u0010+\u001a\u00020\u001c2\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010*\u001a\u00020)H\u0014¢\u0006\u0004\b+\u0010,J\u000f\u0010-\u001a\u00020\u001cH\u0016¢\u0006\u0004\b-\u0010\u001eJ\u000f\u0010.\u001a\u00020\u001cH\u0016¢\u0006\u0004\b.\u0010\u001eR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010/R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u00100R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u00102R \u00105\u001a\u000e\u0012\u0004\u0012\u000204\u0012\u0004\u0012\u00020\u001c038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R\u0018\u0010=\u001a\u0004\u0018\u00010<8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b=\u0010>¨\u0006@"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customHandlersStoreFactory", "Lru/ozon/app/android/cart/common/domain/CartService;", "cartService", "<init>", "(LWZ/l;Landroidx/recyclerview/widget/RecyclerView;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;Lru/ozon/app/android/cart/common/domain/CartService;)V", "item", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemDecorator;", "setupDecorator", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;)Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemDecorator;", "", "separatorColor", "tileColor", "", "getSeparatorColor", "(Ljava/lang/String;Ljava/lang/String;)I", "", "subscribeToCartUpdates", "()V", "unsubscribeFromCartUpdates", "Lru/ozon/app/android/cart/common/domain/CartState;", "state", "applyCartState", "(Lru/ozon/app/android/cart/common/domain/CartState;)V", "Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;", "Lkotlin/Pair;", "", "getProductIdAndSchema", "(Lru/ozon/app/android/fresh/cart/ui/molecules/cartPicker/presentation/CartPickerVO;)Lkotlin/Pair;", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileVO;Ll20/d;)V", "onAttach", "onDetach", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/cart/common/domain/CartService;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemAdapter;", "adapter", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemAdapter;", "decorator", "Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/item/ReorderTileItemDecorator;", "Lxe/B0;", "cartUpdatesCollector", "Lxe/B0;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ReorderTileViewHolder extends k<ReorderTileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final ReorderTileItemAdapter adapter;

    @NotNull
    private final CartService cartService;
    private B0 cartUpdatesCollector;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final ReorderTileItemDecorator decorator;

    @NotNull
    private final ComposerReferences refs;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int imageWidth = UiExtKt.toPx(68);
    private static final int defaultTileBackground = UniColors.LAYER_FLOOR_1.getResId();

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\n\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\t8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\f\u0010\u000b¨\u0006\r"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/reorderTile/presentation/ReorderTileViewHolder$Companion;", "", "<init>", "()V", "", "DEFAULT_SEPARATOR_COLOR", "I", "DEFAULT_SEPARATOR_HEIGHT", "DEFAULT_SEPARATOR_PADDING", "", "PARAM_ID", "Ljava/lang/String;", "PARAM_DELIVERY_SCHEMA", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ReorderTileViewHolder(@NotNull l tokenizedAnalytics, @NotNull RecyclerView containerView, @NotNull ComposerReferences refs, @NotNull d customHandlersStoreFactory, @NotNull CartService cartService) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customHandlersStoreFactory, "customHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(cartService, "cartService");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.containerView = containerView;
        this.refs = refs;
        this.cartService = cartService;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new ReorderTileViewHolder$actionHandler$1(customHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        ReorderTileItemAdapter reorderTileItemAdapter = new ReorderTileItemAdapter(new ReorderTileViewHolder$adapter$1(tokenizedAnalytics), new ReorderTileViewHolder$adapter$2(tokenizedAnalytics), buildHandler);
        this.adapter = reorderTileItemAdapter;
        ReorderTileItemDecorator reorderTileItemDecorator = new ReorderTileItemDecorator(0, 0, 0);
        this.decorator = reorderTileItemDecorator;
        containerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        containerView.setAdapter(reorderTileItemAdapter);
        containerView.addItemDecoration(reorderTileItemDecorator);
        cartService.attach(tokenizedAnalytics);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void applyCartState(CartState state) {
        List<ReorderTileVO.TileItem> tiles;
        CartPickerVO cartPicker;
        Pair<Long, Long> productIdAndSchema;
        ReorderTileVO.TileItem copy;
        ReorderTileVO boundData = getBoundData();
        if (boundData == null || (tiles = boundData.getTiles()) == null) {
            return;
        }
        int i11 = 0;
        for (Object obj : tiles) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            ReorderTileVO.TileItem tileItem = (ReorderTileVO.TileItem) obj;
            ReorderTileVO.TileItem.TileControl tileControl = tileItem.getTileControl();
            ReorderTileVO.TileItem.TileControl.AvailableControl availableControl = tileControl instanceof ReorderTileVO.TileItem.TileControl.AvailableControl ? (ReorderTileVO.TileItem.TileControl.AvailableControl) tileControl : null;
            if (availableControl != null && (cartPicker = availableControl.getCartPicker()) != null && (productIdAndSchema = getProductIdAndSchema(cartPicker)) != null) {
                long longValue = productIdAndSchema.a().longValue();
                Long b11 = productIdAndSchema.b();
                CartItemInfo cartItemInfo = state.getItems().get(Long.valueOf(longValue));
                int quantity = (cartItemInfo == null || !Intrinsics.d(cartItemInfo.getSelectedDeliverySchema(), b11)) ? 0 : cartItemInfo.getQuantity();
                if (quantity != cartPicker.getQuantity().getValue()) {
                    copy = tileItem.copy((r29 & 1) != 0 ? tileItem.widgetId : 0L, (r29 & 2) != 0 ? tileItem.image : null, (r29 & 4) != 0 ? tileItem.innerAtoms : null, (r29 & 8) != 0 ? tileItem.tileControl : ReorderTileVO.TileItem.TileControl.AvailableControl.copy$default(availableControl, CartPickerVO.copy$default(cartPicker, null, null, CartPickerVO.QuantityControl.copy$default(cartPicker.getQuantity(), quantity, 0, 0, 0, 0, null, null, QuantCountStrategy.INSTANCE.isIncreaseEnabled(quantity, cartPicker.getQuantity().getMultiplicity(), cartPicker.getQuantity().getMaxValue()) ? HapticToken.SUCCESS : HapticToken.ERROR, null, 382, null), null, null, null, null, null, null, 507, null), null, 2, null), (r29 & 16) != 0 ? tileItem.action : null, (r29 & 32) != 0 ? tileItem.radius : 0, (r29 & 64) != 0 ? tileItem.spacers : null, (r29 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? tileItem.separator : null, (r29 & 256) != 0 ? tileItem.backgroundColor : null, (r29 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? tileItem.tokenizedEvent : null, (r29 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? tileItem.trackingInfo : null, (r29 & 2048) != 0 ? tileItem.hasParanja : false, (r29 & 4096) != 0 ? tileItem.shouldShowHint : false);
                    this.refs.getController().update(new ReorderTileUpdate(i11, copy));
                }
            }
            i11 = i12;
        }
    }

    private final Pair<Long, Long> getProductIdAndSchema(CartPickerVO cartPickerVO) {
        String str;
        Long y02;
        Map<String, String> params = cartPickerVO.getQuantity().getChangeQuantityAction().getChangeValueAction().getParams();
        if (params == null || (str = params.get("id")) == null || (y02 = h.y0(str)) == null) {
            return null;
        }
        String str2 = params.get("selectedDeliverySchema");
        return new Pair<>(y02, str2 != null ? h.y0(str2) : null);
    }

    private final int getSeparatorColor(String separatorColor, String tileColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), separatorColor);
        return parseColor != null ? parseColor.intValue() : styleParser.parseColor(getContext(), tileColor, defaultTileBackground);
    }

    private final ReorderTileItemDecorator setupDecorator(ReorderTileVO item) {
        ReorderTileDTO.TileItem.Separator separator;
        ReorderTileItemDecorator reorderTileItemDecorator = this.decorator;
        ReorderTileVO.TileItem tileItem = (ReorderTileVO.TileItem) C7714v.M(item.getTiles());
        if (tileItem == null || (separator = tileItem.getSeparator()) == null) {
            return reorderTileItemDecorator;
        }
        Float height = separator.getHeight();
        reorderTileItemDecorator.setSeparatorHeight(height != null ? UiExtKt.toPx(height.floatValue()) : 0);
        reorderTileItemDecorator.setSeparatorColor(getSeparatorColor(separator.getColor(), tileItem.getBackgroundColor()));
        reorderTileItemDecorator.setSeparatorPadding(UiExtKt.toPx(tileItem.getSpacers().getBetween()) + UiExtKt.toPx(tileItem.getSpacers().getHorizontal()) + imageWidth);
        return reorderTileItemDecorator;
    }

    private final void subscribeToCartUpdates() {
        B0 b02 = this.cartUpdatesCollector;
        if (b02 == null || !b02.isActive()) {
            this.cartUpdatesCollector = C10727i.c(K.a(this), null, null, new ReorderTileViewHolder$subscribeToCartUpdates$1(this, null), 3);
        }
    }

    private final void unsubscribeFromCartUpdates() {
        B0 b02 = this.cartUpdatesCollector;
        if (b02 != null) {
            b02.j(null);
        }
        this.cartUpdatesCollector = null;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        subscribeToCartUpdates();
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        unsubscribeFromCartUpdates();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull ReorderTileVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setupDecorator(item);
        this.adapter.submitList(item.getTiles());
        this.containerView.invalidateItemDecorations();
    }
}
