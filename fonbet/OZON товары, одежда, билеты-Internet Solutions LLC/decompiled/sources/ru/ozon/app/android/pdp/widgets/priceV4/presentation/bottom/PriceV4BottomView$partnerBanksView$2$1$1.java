package ru.ozon.app.android.pdp.widgets.priceV4.presentation.bottom;

import android.view.View;
import android.view.ViewGroup;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isCropped", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class PriceV4BottomView$partnerBanksView$2$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ PriceV4BottomView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceV4BottomView$partnerBanksView$2$1$1(PriceV4BottomView priceV4BottomView) {
        super(1);
        this.this$0 = priceV4BottomView;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        View gradientView;
        View gradientView2;
        int i11;
        gradientView = this.this$0.getGradientView();
        gradientView.setVisibility(z11 ? 0 : 8);
        if (z11) {
            gradientView2 = this.this$0.getGradientView();
            PriceV4BottomView priceV4BottomView = this.this$0;
            ViewGroup.LayoutParams layoutParams = gradientView2.getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
            }
            i11 = priceV4BottomView.banksIconHeight;
            layoutParams.height = i11;
            gradientView2.setLayoutParams(layoutParams);
        }
    }
}
