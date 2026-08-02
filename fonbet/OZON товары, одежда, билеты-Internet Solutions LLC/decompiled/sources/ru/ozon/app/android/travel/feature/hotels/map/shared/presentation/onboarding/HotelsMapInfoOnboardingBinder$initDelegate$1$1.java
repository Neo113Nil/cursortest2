package ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.onboarding;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateForOverlayWidgets;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isShown", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoOnboardingBinder$initDelegate$1$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ HotelsMapInfoOnboardingBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoOnboardingBinder$initDelegate$1$1(HotelsMapInfoOnboardingBinder hotelsMapInfoOnboardingBinder) {
        super(1);
        this.this$0 = hotelsMapInfoOnboardingBinder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:2:0x0002, code lost:
    
        r1 = r0.this$0.onBoardingDelegate;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void invoke(boolean z11) {
        OnBoardingDelegateForOverlayWidgets onBoardingDelegateForOverlayWidgets;
        if (!z11 || onBoardingDelegateForOverlayWidgets == null) {
            return;
        }
        onBoardingDelegateForOverlayWidgets.unbind();
    }
}
