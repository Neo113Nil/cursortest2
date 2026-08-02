package ru.ozon.app.android.pdp.widgets.brand.presentation.button;

import WZ.l;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.data.OnBoardingDTO;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegateImpl;
import ru.ozon.app.android.pdp.ui.configurators.pdp.onboarding.PDPOnBoardingViewModel;
import ru.ozon.app.android.pdp.widgets.brand.presentation.ButtonBrandVO;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/composer/widgets/v2/onboarding/presentation/OnBoardingDelegateImpl;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ButtonBrandBinder$onBoardingDelegate$2 extends AbstractC7737t implements Function0<OnBoardingDelegateImpl> {
    final /* synthetic */ ButtonBrandBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ButtonBrandBinder$onBoardingDelegate$2(ButtonBrandBinder buttonBrandBinder) {
        super(0);
        this.this$0 = buttonBrandBinder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final OnBoardingDelegateImpl invoke() {
        ComposerReferences composerReferences;
        OnBoardingDTO onBoarding;
        ButtonV3View buttonV3View;
        PDPOnBoardingViewModel pDPOnBoardingViewModel;
        l lVar;
        composerReferences = this.this$0.refs;
        ButtonBrandVO boundData = this.this$0.getViewHolderOwner().getBoundData();
        if (boundData == null || (onBoarding = boundData.getOnBoarding()) == null) {
            return null;
        }
        buttonV3View = this.this$0.view;
        k<ButtonBrandVO> viewHolderOwner = this.this$0.getViewHolderOwner();
        pDPOnBoardingViewModel = this.this$0.viewModel;
        lVar = this.this$0.tokenizedAnalytics;
        return new OnBoardingDelegateImpl("brand", composerReferences, buttonV3View, onBoarding, viewHolderOwner, pDPOnBoardingViewModel, lVar, 0.0f, UserVerificationMethods.USER_VERIFY_PATTERN, null);
    }
}
