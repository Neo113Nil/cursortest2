package ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.widget.FrameLayout;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.utils.ContextExtKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceV4BottomView$gradientView$2 extends AbstractC7737t implements Function0<View> {
    final /* synthetic */ Context $context;
    final /* synthetic */ PriceV4BottomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV4BottomView$gradientView$2(Context context, PriceV4BottomView priceV4BottomView) {
        super(0);
        this.$context = context;
        this.this$0 = priceV4BottomView;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final View invoke() {
        int i11;
        FrameLayout leftViewRoot;
        View view = new View(this.$context);
        PriceV4BottomView priceV4BottomView = this.this$0;
        Context context = this.$context;
        int dp_24 = Dimens.INSTANCE.getDP_24();
        i11 = priceV4BottomView.banksIconHeight;
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(dp_24, i11);
        layoutParams.gravity = 8388613;
        view.setLayoutParams(layoutParams);
        view.setBackground(new GradientDrawable(GradientDrawable.Orientation.LEFT_RIGHT, new int[]{0, ContextExtKt.parseColor(context, UniColors.LAYER_FLOOR_1.getToken())}));
        leftViewRoot = this.this$0.getLeftViewRoot();
        leftViewRoot.addView(view);
        return view;
    }
}
