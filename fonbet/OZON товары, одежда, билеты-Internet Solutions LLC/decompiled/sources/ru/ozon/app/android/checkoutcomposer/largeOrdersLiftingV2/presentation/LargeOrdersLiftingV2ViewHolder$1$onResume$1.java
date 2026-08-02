package ru.ozon.app.android.checkoutcomposer.largeOrdersLiftingV2.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.uni.android.atom.image.Image;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "show", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class LargeOrdersLiftingV2ViewHolder$1$onResume$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ LargeOrdersLiftingV2ViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LargeOrdersLiftingV2ViewHolder$1$onResume$1(LargeOrdersLiftingV2ViewHolder largeOrdersLiftingV2ViewHolder) {
        super(1);
        this.this$0 = largeOrdersLiftingV2ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        if (!z11) {
            this.this$0.binding.largeOrdersLiftingTF.clearFocus();
        }
        LargeOrdersLiftingV2ViewHolder largeOrdersLiftingV2ViewHolder = this.this$0;
        Image largeOrdersLiftingIV = largeOrdersLiftingV2ViewHolder.binding.largeOrdersLiftingIV;
        Intrinsics.checkNotNullExpressionValue(largeOrdersLiftingIV, "largeOrdersLiftingIV");
        largeOrdersLiftingV2ViewHolder.animateVisibility(largeOrdersLiftingIV, !z11);
    }
}
