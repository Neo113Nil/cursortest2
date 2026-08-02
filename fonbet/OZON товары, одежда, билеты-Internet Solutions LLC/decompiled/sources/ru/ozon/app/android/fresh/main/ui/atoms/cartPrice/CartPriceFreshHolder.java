package ru.ozon.app.android.fresh.main.ui.atoms.cartPrice;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;
import androidx.core.content.a;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.express.CartPriceFreshAtom;
import ru.ozon.app.android.fresh.main.R$drawable;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.v3.AtomV3;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\bB\u001b\b\u0016\u0012\u0006\u0010\t\u001a\u00020\n\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\u0007\u0010\u000bJ\b\u0010\f\u001a\u00020\rH\u0016J\u0010\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\u0002H\u0014J\u0018\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00022\u0006\u0010\u0013\u001a\u00020\u0006H\u0002J\"\u0010\u0014\u001a\u00020\r2\u0006\u0010\u0015\u001a\u00020\u00162\b\b\u0001\u0010\u0017\u001a\u00020\u00182\u0006\u0010\u0019\u001a\u00020\u0006H\u0002¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceFreshHolder;", "Lru/ozon/uni/atoms/v3/AtomV3;", "Lru/ozon/app/android/atoms/data/express/CartPriceFreshAtom;", "Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceFreshView;", "view", "atomContext", "", "<init>", "(Lru/ozon/app/android/fresh/main/ui/atoms/cartPrice/CartPriceFreshView;Ljava/lang/String;)V", "context", "Landroid/content/Context;", "(Landroid/content/Context;Ljava/lang/String;)V", "onRecycle", "", "onBind", "item", "getClickAction", "Lru/ozon/uni/atoms/af/AtomAction;", "data", "actionId", "bindButton", "button", "Landroid/widget/ImageView;", "iconRes", "", "color", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartPriceFreshHolder extends AtomV3<CartPriceFreshAtom, CartPriceFreshView> {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CartPriceFreshHolder(@NotNull CartPriceFreshView view, String str) {
        super(view, str);
        Intrinsics.checkNotNullParameter(view, "view");
    }

    private final void bindButton(ImageView button, int iconRes, String color) {
        Drawable drawable = a.getDrawable(button.getContext(), iconRes);
        if (drawable != null) {
            Intrinsics.checkNotNullExpressionValue(drawable, "wrap(...)");
            StyleParser styleParser = StyleParser.INSTANCE;
            Context context = button.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            androidx.core.graphics.drawable.a.i(drawable, styleParser.parseColor(context, color, StyleParser.OzColor.OZ_COLOR_BLUE));
        } else {
            drawable = null;
        }
        button.setImageDrawable(drawable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomAction getClickAction(CartPriceFreshAtom data, String actionId) {
        String str;
        AtomActionDTO.Behavior behavior = AtomActionDTO.Behavior.CUSTOM;
        ButtonV3Atom.AddToCartAtom.Action action = data.getAction();
        if (action == null || (str = action.getId()) == null) {
            str = "";
        }
        return AtomActionMapperKt.toAtomAction(new AtomActionDTO(behavior, null, actionId, U.j(new Pair("product_id", str), new Pair("count", String.valueOf(getContainerView().getCount())), new Pair("minCount", String.valueOf(getContainerView().getMinCount()))), 2, null), U.c());
    }

    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onRecycle() {
        super.onRecycle();
        getContainerView().setOnMinusClick(null);
        getContainerView().setOnPlusClick(null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CartPriceFreshHolder(@NotNull Context context, String str) {
        this(new CartPriceFreshView(context, null, 0, 6, null), str);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.uni.atoms.v3.AtomV3, ru.ozon.uni.atoms.af.Atom
    public void onBind(@NotNull CartPriceFreshAtom item) {
        Integer quantity;
        Intrinsics.checkNotNullParameter(item, "item");
        super.onBind((CartPriceFreshHolder) item);
        CartPriceFreshView containerView = getContainerView();
        containerView.setOnPlusClick(new CartPriceFreshHolder$onBind$1$1(this));
        containerView.setOnMinusClick(new CartPriceFreshHolder$onBind$1$2(this));
        ButtonV3Atom.AddToCartAtom.Action action = item.getAction();
        containerView.setMinCount((action == null || (quantity = action.getQuantity()) == null) ? 1 : quantity.intValue());
        containerView.setAvailableCount(item.getMaxQuantity());
        containerView.setRoundedBgColor(item.getBackgroundButtonsColor());
        containerView.setEnabledPlusColor(item.getPlusButton().getColor());
        containerView.setDisabledPlusColor(item.getPlusButton().getDisabledColor());
        containerView.setUnitOfMeasure(item.getUnitOfMeasure());
        containerView.setCount(item.getCurrentItems());
        containerView.initClickListeners();
        ImageView minusButtonIv = getContainerView().getBinding().minusButtonIv;
        Intrinsics.checkNotNullExpressionValue(minusButtonIv, "minusButtonIv");
        bindButton(minusButtonIv, R$drawable.ic_minus_express, item.getMinusButton().getColor());
        ImageView plusButtonIv = getContainerView().getBinding().plusButtonIv;
        Intrinsics.checkNotNullExpressionValue(plusButtonIv, "plusButtonIv");
        bindButton(plusButtonIv, R$drawable.ic_plus_express, item.getPlusButton().getColor());
        containerView.bindPrices(item.getPrice(), item.getPriceColor(), item.getOriginalPrice(), item.getOriginalPriceColor(), item.getPriceWithUnit());
        CartPriceFreshAtom.CartPriceStyleType theme = item.getTheme();
        if (theme == null) {
            theme = CartPriceFreshAtom.CartPriceStyleType.STYLE_TYPE_PRIMARY_EXPRESS;
        }
        containerView.bindToCartBtnTheme(theme);
        containerView.onBindComplete();
    }
}
