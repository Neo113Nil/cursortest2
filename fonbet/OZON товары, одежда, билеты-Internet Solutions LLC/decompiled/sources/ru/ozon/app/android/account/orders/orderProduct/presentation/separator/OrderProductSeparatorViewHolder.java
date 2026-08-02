package ru.ozon.app.android.account.orders.orderProduct.presentation.separator;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.orderProduct.viewObject.OrderProductSeparatorVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00022\u0006\u0010\t\u001a\u00020\bH\u0014¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/account/orders/orderProduct/presentation/separator/OrderProductSeparatorViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductSeparatorVO;", "Landroid/view/View;", "separatorView", "<init>", "(Landroid/view/View;)V", "item", "Ll20/d;", "info", "", "bind", "(Lru/ozon/app/android/account/orders/orderProduct/viewObject/OrderProductSeparatorVO;Ll20/d;)V", "Landroid/view/View;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OrderProductSeparatorViewHolder extends k<OrderProductSeparatorVO> {

    @NotNull
    private final View separatorView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OrderProductSeparatorViewHolder(@NotNull View separatorView) {
        super(separatorView);
        Intrinsics.checkNotNullParameter(separatorView, "separatorView");
        this.separatorView = separatorView;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull OrderProductSeparatorVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = this.separatorView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int parseColor = styleParser.parseColor(context, item.getBackgroundColor(), UniColors.GRAPHIC_NEUTRAL.getResId());
        View view = this.separatorView;
        view.setBackgroundColor(parseColor);
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
        int px = item.getLeftPadding().getPx();
        Context context2 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        marginLayoutParams.leftMargin = ResourceExtKt.toPx(px, context2);
        int px2 = item.getRightPadding().getPx();
        Context context3 = view.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        marginLayoutParams.rightMargin = ResourceExtKt.toPx(px2, context3);
        view.setLayoutParams(marginLayoutParams);
    }
}
