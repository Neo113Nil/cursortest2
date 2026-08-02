package ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.doubleCart.DoubleCartQuantVO;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\t\b`\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002H&¢\u0006\u0004\b\u0005\u0010\u0006R,\u0010\r\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR<\u0010\u0015\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0006\u0012\u0004\u0018\u00010\u000f\u0012\u0006\u0012\u0004\u0018\u00010\u0010\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u000e8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R,\u0010\u0018\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0016\u0010\n\"\u0004\b\u0017\u0010\fR,\u0010\u001b\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\b\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0019\u0010\n\"\u0004\b\u001a\u0010\fR\u001e\u0010!\u001a\u0004\u0018\u00010\u001c8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R*\u0010$\u001a\u0010\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00078&@&X¦\u000e¢\u0006\f\u001a\u0004\b\"\u0010\n\"\u0004\b#\u0010\f¨\u0006%"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantView;", "", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;", "vo", "", "bind", "(Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO;)V", "Lkotlin/Function1;", "Lru/ozon/app/android/pdp/widgets/cartButtonQuant/doubleCart/DoubleCartQuantVO$CartMode;", "getOnAddToCartClick", "()Lkotlin/jvm/functions/Function1;", "setOnAddToCartClick", "(Lkotlin/jvm/functions/Function1;)V", "onAddToCartClick", "Lkotlin/Function3;", "", "Lru/ozon/uni/atoms/af/AtomAction;", "getOnAddToCartClickRecommendation", "()Lfd/n;", "setOnAddToCartClickRecommendation", "(Lfd/n;)V", "onAddToCartClickRecommendation", "getOnMinusCartClick", "setOnMinusCartClick", "onMinusCartClick", "getOnPlusCartClick", "setOnPlusCartClick", "onPlusCartClick", "Lru/ozon/app/android/action/ActionHandler$Builder;", "getActionHandlerBuilder", "()Lru/ozon/app/android/action/ActionHandler$Builder;", "setActionHandlerBuilder", "(Lru/ozon/app/android/action/ActionHandler$Builder;)V", "actionHandlerBuilder", "getShowinfoDigitalModal", "setShowinfoDigitalModal", "showinfoDigitalModal", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public interface DoubleCartQuantView {
    void bind(@NotNull DoubleCartQuantVO vo);

    ActionHandler.Builder getActionHandlerBuilder();

    void setActionHandlerBuilder(ActionHandler.Builder builder);

    void setOnAddToCartClick(Function1<? super DoubleCartQuantVO.CartMode, Unit> function1);

    void setOnAddToCartClickRecommendation(InterfaceC6511n<? super DoubleCartQuantVO.CartMode, ? super String, ? super AtomAction, Unit> interfaceC6511n);

    void setOnMinusCartClick(Function1<? super DoubleCartQuantVO.CartMode, Unit> function1);

    void setOnPlusCartClick(Function1<? super DoubleCartQuantVO.CartMode, Unit> function1);

    void setShowinfoDigitalModal(Function1<? super String, Unit> function1);
}
