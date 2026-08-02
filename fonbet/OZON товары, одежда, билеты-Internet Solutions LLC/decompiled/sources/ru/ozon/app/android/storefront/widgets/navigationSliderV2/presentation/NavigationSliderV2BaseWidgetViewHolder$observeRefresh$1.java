package ru.ozon.app.android.storefront.widgets.navigationSliderV2.presentation;

import A00.a;
import androidx.fragment.app.ComponentCallbacksC5392m;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import l20.C7854a;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.OnBoardingDelegate;

@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"LA00/a$o;", "Ll20/a;", "kotlin.jvm.PlatformType", "event", "", "invoke", "(LA00/a$o;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class NavigationSliderV2BaseWidgetViewHolder$observeRefresh$1 extends AbstractC7737t implements Function1<a.o<C7854a>, Unit> {
    final /* synthetic */ NavigationSliderV2BaseWidgetViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    NavigationSliderV2BaseWidgetViewHolder$observeRefresh$1(NavigationSliderV2BaseWidgetViewHolder navigationSliderV2BaseWidgetViewHolder) {
        super(1);
        this.this$0 = navigationSliderV2BaseWidgetViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(a.o<C7854a> oVar) {
        invoke2(oVar);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(a.o<C7854a> oVar) {
        OnBoardingDelegate onBoardingDelegate;
        ComposerReferences composerReferences;
        NavigationSliderV2OnBoardingViewModel navigationSliderV2OnBoardingViewModel;
        String tag;
        NavigationSliderV2OnBoardingViewModel navigationSliderV2OnBoardingViewModel2;
        if (oVar.g() instanceof a.u) {
            onBoardingDelegate = this.this$0.onboardingDelegate;
            if (onBoardingDelegate != null) {
                onBoardingDelegate.unbind();
            }
            composerReferences = this.this$0.composerReferences;
            ComponentCallbacksC5392m c11 = composerReferences.getContainer().c();
            if (c11 != null && (tag = c11.getTag()) != null) {
                navigationSliderV2OnBoardingViewModel2 = this.this$0.onBoardingViewModel;
                navigationSliderV2OnBoardingViewModel2.removePageFromCache(tag);
            }
            navigationSliderV2OnBoardingViewModel = this.this$0.onBoardingViewModel;
            navigationSliderV2OnBoardingViewModel.onShown("navsliderV2OnboardingKey", false);
            NavigationSliderV2VO boundedData = this.this$0.getBoundedData();
            if (boundedData != null) {
                this.this$0.initDelegate(boundedData.getOnboarding());
            }
            this.this$0.showOnboardingIfExist();
        }
    }
}
