package ru.ozon.app.android.pdp.widgets.cartButtonV4;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.cart.CartVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R$\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR4\u0010\u0014\u001a\u001a\u0012\u0006\u0012\u0004\u0018\u00010\u000e\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\r8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R$\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0015\u0010\t\"\u0004\b\u0016\u0010\u000bR$\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0018\u0010\t\"\u0004\b\u0019\u0010\u000bR\u001e\u0010 \u001a\u0004\u0018\u00010\u001b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR*\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0004\u0018\u00010!8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%¨\u0006'"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/CartView;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;", "vo", "", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonV4/cart/CartVO;)V", "Lkotlin/Function0;", "getOnAddToCartClickRelatedProducts", "()Lkotlin/jvm/functions/Function0;", "setOnAddToCartClickRelatedProducts", "(Lkotlin/jvm/functions/Function0;)V", "onAddToCartClickRelatedProducts", "Lkotlin/Function2;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function2;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function2;)V", "onAddToCartClick", "getOnMinusCartClick", "setOnMinusCartClick", "onMinusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "onPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "actionHandlerBuilder", "Lkotlin/Function1;", "getShowinfoDigitalModal", "()Lkotlin/jvm/functions/Function1;", "setShowinfoDigitalModal", "(Lkotlin/jvm/functions/Function1;)V", "showinfoDigitalModal", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface CartView {
    void bind(@NotNull CartVO vo);

    ActionHandler.Builder getActionHandlerBuilder();

    Function2<String, AtomAction, Unit> getOnAddToCartClick();

    Function0<Unit> getOnAddToCartClickRelatedProducts();

    Function1<String, Unit> getShowinfoDigitalModal();

    void setActionHandlerBuilder(ActionHandler.Builder builder);

    void setOnAddToCartClick(Function2<? super String, ? super AtomAction, Unit> function2);

    void setOnMinusCartClick(Function0<Unit> function0);

    void setOnPlusCartClick(Function0<Unit> function0);

    void setShowinfoDigitalModal(Function1<? super String, Unit> function1);
}
