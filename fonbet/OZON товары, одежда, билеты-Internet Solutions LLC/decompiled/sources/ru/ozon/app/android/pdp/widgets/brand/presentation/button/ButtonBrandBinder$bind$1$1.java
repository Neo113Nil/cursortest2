package ru.ozon.app.android.pdp.widgets.brand.presentation.button;

import androidx.recyclerview.widget.m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingCutConfig;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.brand.presentation.ButtonBrandVO;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonBrandBinder$bind$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ ButtonBrandBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonBrandBinder$bind$1$1(ButtonBrandBinder buttonBrandBinder) {
        super(0);
        this.this$0 = buttonBrandBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        OnBoardingDelegate onBoardingDelegate;
        onBoardingDelegate = this.this$0.getOnBoardingDelegate();
        if (onBoardingDelegate != null) {
            k<ButtonBrandVO> viewHolderOwner = this.this$0.getViewHolderOwner();
            Dimens dimens = Dimens.INSTANCE;
            OnBoardingDelegate.DefaultImpls.bind$default(onBoardingDelegate, viewHolderOwner, new OnBoardingCutConfig(Integer.valueOf(dimens.getDP_8()), null, Integer.valueOf(dimens.getDP_4()), null, null, null, null, false, m.e.DEFAULT_SWIPE_ANIMATION_DURATION, null), null, 4, null);
        }
    }
}
