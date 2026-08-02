package ru.ozon.app.android.cart.totalV3.presentation.adapter;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.totalV3.presentation.TotalVO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0002H\u0016R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/cart/totalV3/presentation/adapter/SpaceViewHolder;", "Lru/ozon/app/android/cart/totalV3/presentation/adapter/ItemViewHolder;", "Lru/ozon/app/android/cart/totalV3/presentation/TotalVO$TotalItemVO$SpaceVO;", "view", "Landroid/view/View;", "<init>", "(Landroid/view/View;)V", "bind", "", "item", "cart_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SpaceViewHolder extends ItemViewHolder<TotalVO.TotalItemVO.SpaceVO> {

    @NotNull
    private final View view;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SpaceViewHolder(@NotNull View view) {
        super(view);
        Intrinsics.checkNotNullParameter(view, "view");
        this.view = view;
    }

    public void bind(@NotNull TotalVO.TotalItemVO.SpaceVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        int height = item.getHeight();
        Context context = this.view.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (this.view.getHeight() != ResourceExtKt.toPx(height, context)) {
            View view = this.view;
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            int height2 = item.getHeight();
            Context context2 = this.view.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            layoutParams.height = ResourceExtKt.toPx(height2, context2);
            view.setLayoutParams(layoutParams);
        }
    }
}
