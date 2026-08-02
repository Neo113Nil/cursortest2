package ru.ozon.app.android.cart.common.dynamicElement.verticalSpacer;

import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\r\u001a\u00020\b2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/cart/common/dynamicElement/verticalSpacer/VerticalSpacerPreCreateViewVH;", "Landroidx/recyclerview/widget/RecyclerView$C;", "Landroid/view/View;", "cartSplitVerticalSpacer", "<init>", "(Landroid/view/View;)V", "", "spacing", "", "setHeight", "(I)V", "Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$VerticalSpacer;", "item", "bind", "(Lru/ozon/app/android/cart/common/dynamicElement/DynamicElementVO$VerticalSpacer;)V", "Landroid/view/View;", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class VerticalSpacerPreCreateViewVH extends RecyclerView.C {

    @NotNull
    private final View cartSplitVerticalSpacer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public VerticalSpacerPreCreateViewVH(@NotNull View cartSplitVerticalSpacer) {
        super(cartSplitVerticalSpacer);
        Intrinsics.checkNotNullParameter(cartSplitVerticalSpacer, "cartSplitVerticalSpacer");
        this.cartSplitVerticalSpacer = cartSplitVerticalSpacer;
    }

    private final void setHeight(int spacing) {
        View view = this.cartSplitVerticalSpacer;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = ResourceExtKt.toPx(spacing);
        view.setLayoutParams(layoutParams);
    }

    public final void bind(@NotNull DynamicElementVO.VerticalSpacer item) {
        Intrinsics.checkNotNullParameter(item, "item");
        setHeight(item.getSpacing());
    }
}
