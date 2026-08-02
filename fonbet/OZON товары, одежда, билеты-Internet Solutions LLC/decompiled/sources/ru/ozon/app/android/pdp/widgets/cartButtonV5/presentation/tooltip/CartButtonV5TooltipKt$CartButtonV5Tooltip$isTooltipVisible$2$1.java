package ru.ozon.app.android.pdp.widgets.cartButtonV5.presentation.tooltip;

import S0.A1;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

@Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class CartButtonV5TooltipKt$CartButtonV5Tooltip$isTooltipVisible$2$1 extends AbstractC7737t implements Function0<Boolean> {
    final /* synthetic */ A1<Float> $alpha$delegate;
    final /* synthetic */ A1<Boolean> $currentIsVisible$delegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CartButtonV5TooltipKt$CartButtonV5Tooltip$isTooltipVisible$2$1(A1<Boolean> a12, A1<Float> a13) {
        super(0);
        this.$currentIsVisible$delegate = a12;
        this.$alpha$delegate = a13;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // kotlin.jvm.functions.Function0
    public final Boolean invoke() {
        boolean CartButtonV5Tooltip$lambda$5;
        boolean z11;
        float CartButtonV5Tooltip$lambda$4;
        CartButtonV5Tooltip$lambda$5 = CartButtonV5TooltipKt.CartButtonV5Tooltip$lambda$5(this.$currentIsVisible$delegate);
        if (!CartButtonV5Tooltip$lambda$5) {
            CartButtonV5Tooltip$lambda$4 = CartButtonV5TooltipKt.CartButtonV5Tooltip$lambda$4(this.$alpha$delegate);
            if (CartButtonV5Tooltip$lambda$4 <= 0.0f) {
                z11 = false;
                return Boolean.valueOf(z11);
            }
        }
        z11 = true;
        return Boolean.valueOf(z11);
    }
}
