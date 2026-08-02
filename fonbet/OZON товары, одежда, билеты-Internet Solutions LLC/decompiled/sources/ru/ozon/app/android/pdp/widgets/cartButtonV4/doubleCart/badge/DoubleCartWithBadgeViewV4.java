package ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.badge;

import android.annotation.SuppressLint;
import android.content.Context;
import android.view.LayoutInflater;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.databinding.WidgetCartbuttonDoublecartWithBadgeV4Binding;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.BaseDoubleCartView;
import ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartVO;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\rH\u0016R\u000e\u0010\b\u001a\u00020\tX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/badge/DoubleCartWithBadgeViewV4;", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/BaseDoubleCartView;", "context", "Landroid/content/Context;", "isVibration", "", "<init>", "(Landroid/content/Context;Z)V", "binding", "Lru/ozon/app/android/pdp/databinding/WidgetCartbuttonDoublecartWithBadgeV4Binding;", "bind", "", "vo", "Lru/ozon/app/android/pdp/widgets/cartButtonV4/doubleCart/DoubleCartVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class DoubleCartWithBadgeViewV4 extends BaseDoubleCartView {

    @NotNull
    private final WidgetCartbuttonDoublecartWithBadgeV4Binding binding;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DoubleCartWithBadgeViewV4(@NotNull Context context, boolean z11) {
        super(context, z11);
        Intrinsics.checkNotNullParameter(context, "context");
        WidgetCartbuttonDoublecartWithBadgeV4Binding inflate = WidgetCartbuttonDoublecartWithBadgeV4Binding.inflate(LayoutInflater.from(context), this);
        Intrinsics.checkNotNullExpressionValue(inflate, "inflate(...)");
        this.binding = inflate;
    }

    @Override // ru.ozon.app.android.pdp.widgets.cartButtonV4.doubleCart.DoubleCartView
    public void bind(@NotNull DoubleCartVO vo) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        WidgetCartbuttonDoublecartWithBadgeV4Binding widgetCartbuttonDoublecartWithBadgeV4Binding = this.binding;
        setVo(vo);
        bind(widgetCartbuttonDoublecartWithBadgeV4Binding.firstCb.getButton(), vo.getFirstCartData().getToCart().getButtonWithIcon(), DoubleCartVO.CartMode.FIRST, vo.getStyle(), vo.getFirstCartData().getIsInCart());
        widgetCartbuttonDoublecartWithBadgeV4Binding.firstCb.bindBadge(vo.getFirstCartData().getToCart().getButtonWithIcon().getBadge());
        widgetCartbuttonDoublecartWithBadgeV4Binding.firstCb.setEnabled(vo.getFirstCartData().getToCart().getButtonWithIcon().getButton().getAction() != null);
        bind(widgetCartbuttonDoublecartWithBadgeV4Binding.secondCb.getButton(), vo.getSecondCartData().getToCart().getButtonWithIcon(), DoubleCartVO.CartMode.SECOND, vo.getStyle(), vo.getFirstCartData().getIsInCart());
        widgetCartbuttonDoublecartWithBadgeV4Binding.secondCb.bindBadge(vo.getSecondCartData().getToCart().getButtonWithIcon().getBadge());
        widgetCartbuttonDoublecartWithBadgeV4Binding.secondCb.setEnabled(vo.getSecondCartData().getToCart().getButtonWithIcon().getButton().getAction() != null);
    }
}
