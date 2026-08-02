package ru.ozon.uni.android.uikit.view.atoms.buttons.jointpurchase;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/uni/android/uikit/view/atoms/buttons/usual/SmallButtonView;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class JointPurchaseButtonWithQuantityView$atomButton$2 extends AbstractC7737t implements Function0<SmallButtonView> {
    final /* synthetic */ JointPurchaseButtonWithQuantityView this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    JointPurchaseButtonWithQuantityView$atomButton$2(JointPurchaseButtonWithQuantityView jointPurchaseButtonWithQuantityView) {
        super(0);
        this.this$0 = jointPurchaseButtonWithQuantityView;
    }

    @Override // kotlin.jvm.functions.Function0
    public final SmallButtonView invoke() {
        SmallButtonView atomButtonView = this.this$0.getBinding().atomButtonView;
        Intrinsics.checkNotNullExpressionValue(atomButtonView, "atomButtonView");
        return atomButtonView;
    }
}
