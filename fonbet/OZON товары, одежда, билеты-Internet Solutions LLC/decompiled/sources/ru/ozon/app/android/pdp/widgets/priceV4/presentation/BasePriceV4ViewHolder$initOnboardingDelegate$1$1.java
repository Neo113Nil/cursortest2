package ru.ozon.app.android.pdp.widgets.priceV4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShown", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class BasePriceV4ViewHolder$initOnboardingDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ BasePriceV4ViewHolder<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePriceV4ViewHolder$initOnboardingDelegate$1$1(BasePriceV4ViewHolder<T> basePriceV4ViewHolder) {
        super(1);
        this.this$0 = basePriceV4ViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r1 = ((ru.ozon.app.android.pdp.widgets.priceV4.presentation.BasePriceV4ViewHolder) r0.this$0).onboardingDelegate;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z11) {
        OnBoardingDelegate onBoardingDelegate;
        if (!z11 || onBoardingDelegate == null) {
            return;
        }
        onBoardingDelegate.unbind();
    }
}
