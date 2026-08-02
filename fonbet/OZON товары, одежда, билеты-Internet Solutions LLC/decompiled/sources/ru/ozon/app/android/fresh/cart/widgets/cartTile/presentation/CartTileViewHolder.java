package ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation;

import Pc.a;
import Vg.d;
import WZ.l;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.data.CartTileDTO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.CartTileVO;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileItemAdapter;
import ru.ozon.app.android.fresh.cart.widgets.cartTile.presentation.item.CartTileItemDecorator;
import ru.ozon.app.android.fresh.common.widgets.molecules.freshFavoriteButton.delegate.FreshFavoriteDelegate;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 .2\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003:\u0001.B=\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t\u0012\u0006\u0010\r\u001a\u00020\f\u0012\n\u0010\u0010\u001a\u00060\u000ej\u0002`\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J#\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0017H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u001f\u0010 \u001a\u00020\u001f2\u0006\u0010\u0013\u001a\u00020\u00022\u0006\u0010\u001e\u001a\u00020\u001dH\u0014¢\u0006\u0004\b \u0010!R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\"R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010#R\u001a\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010$R \u0010'\u001a\u000e\u0012\u0004\u0012\u00020&\u0012\u0004\u0012\u00020\u001f0%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "Landroidx/recyclerview/widget/RecyclerView;", "containerView", "LPc/a;", "Lru/ozon/app/android/fresh/common/widgets/molecules/freshFavoriteButton/delegate/FreshFavoriteDelegate;", "freshFavoriteDelegateProvider", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customHandlersStoreFactory", "<init>", "(LWZ/l;Landroidx/recyclerview/widget/RecyclerView;LPc/a;Lru/ozon/app/android/composer/ComposerReferences;LVg/d;)V", "item", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemDecorator;", "setupDecorator", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;)Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemDecorator;", "", "separatorColor", "tileColor", "", "getSeparatorColor", "(Ljava/lang/String;Ljava/lang/String;)I", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileVO;Ll20/d;)V", "LWZ/l;", "Landroidx/recyclerview/widget/RecyclerView;", "LPc/a;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemAdapter;", "adapter", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemAdapter;", "decorator", "Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/item/CartTileItemDecorator;", "Companion", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartTileViewHolder extends k<CartTileVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final CartTileItemAdapter adapter;

    @NotNull
    private final RecyclerView containerView;

    @NotNull
    private final CartTileItemDecorator decorator;

    @NotNull
    private final a<FreshFavoriteDelegate> freshFavoriteDelegateProvider;

    @NotNull
    private final l tokenizedAnalytics;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int imageWidth = UiExtKt.toPx(68);
    private static final int defaultTileBackground = UniColors.LAYER_FLOOR_1.getResId();

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/cart/widgets/cartTile/presentation/CartTileViewHolder$Companion;", "", "<init>", "()V", "", "DEFAULT_SEPARATOR_COLOR", "I", "DEFAULT_SEPARATOR_HEIGHT", "DEFAULT_SEPARATOR_PADDING", "widgets-cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartTileViewHolder(@NotNull l tokenizedAnalytics, @NotNull RecyclerView containerView, @NotNull a<FreshFavoriteDelegate> freshFavoriteDelegateProvider, @NotNull ComposerReferences refs, @NotNull d customHandlersStoreFactory) {
        super(containerView);
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(freshFavoriteDelegateProvider, "freshFavoriteDelegateProvider");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(customHandlersStoreFactory, "customHandlersStoreFactory");
        this.tokenizedAnalytics = tokenizedAnalytics;
        this.containerView = containerView;
        this.freshFavoriteDelegateProvider = freshFavoriteDelegateProvider;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).customActionHandlers(new CartTileViewHolder$actionHandler$1(customHandlersStoreFactory)).buildHandler();
        this.actionHandler = buildHandler;
        CartTileItemAdapter cartTileItemAdapter = new CartTileItemAdapter(new CartTileViewHolder$adapter$1(tokenizedAnalytics), new CartTileViewHolder$adapter$2(tokenizedAnalytics), buildHandler, new CartTileViewHolder$adapter$4(refs), new CartTileViewHolder$adapter$5(refs), new CartTileViewHolder$adapter$3(freshFavoriteDelegateProvider), refs, refs.getContainer().e());
        this.adapter = cartTileItemAdapter;
        CartTileItemDecorator cartTileItemDecorator = new CartTileItemDecorator(0, 0, 0);
        this.decorator = cartTileItemDecorator;
        containerView.setLayoutManager(new LinearLayoutManager(getContext(), 1, false));
        containerView.setAdapter(cartTileItemAdapter);
        containerView.addItemDecoration(cartTileItemDecorator);
    }

    private final int getSeparatorColor(String separatorColor, String tileColor) {
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), separatorColor);
        return parseColor != null ? parseColor.intValue() : styleParser.parseColor(getContext(), tileColor, defaultTileBackground);
    }

    private final CartTileItemDecorator setupDecorator(CartTileVO item) {
        CartTileDTO.TileItem.Separator separator;
        CartTileItemDecorator cartTileItemDecorator = this.decorator;
        CartTileVO.TileItem tileItem = (CartTileVO.TileItem) C7714v.M(item.getTiles());
        if (tileItem == null || (separator = tileItem.getSeparator()) == null) {
            return cartTileItemDecorator;
        }
        Float height = separator.getHeight();
        cartTileItemDecorator.setSeparatorHeight(height != null ? UiExtKt.toPx(height.floatValue()) : 0);
        cartTileItemDecorator.setSeparatorColor(getSeparatorColor(separator.getColor(), tileItem.getBackgroundColor()));
        cartTileItemDecorator.setSeparatorPadding(UiExtKt.toPx(tileItem.getSpacers().getBetween()) + UiExtKt.toPx(tileItem.getSpacers().getHorizontal()) + imageWidth);
        return cartTileItemDecorator;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull CartTileVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        setupDecorator(item);
        CartTileItemAdapter.submitList$default(this.adapter, item.getTiles(), null, 2, null);
        this.containerView.invalidateItemDecorations();
    }
}
