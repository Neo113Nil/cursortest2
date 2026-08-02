package ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder;

import android.view.View;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.GalleryV5VO;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnBoardingButtonView;
import ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.GalleryV5OnboardingViewModel;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV5ButtonOnBoardingBinder$bind$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ GalleryV5VO.Button.OnBoarding $this_apply;
    final /* synthetic */ GalleryV5OnBoardingButtonView $view;
    final /* synthetic */ GalleryV5ButtonOnBoardingBinder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV5ButtonOnBoardingBinder$bind$1$2(GalleryV5ButtonOnBoardingBinder galleryV5ButtonOnBoardingBinder, GalleryV5VO.Button.OnBoarding onBoarding, GalleryV5OnBoardingButtonView galleryV5OnBoardingButtonView) {
        super(0);
        this.this$0 = galleryV5ButtonOnBoardingBinder;
        this.$this_apply = onBoarding;
        this.$view = galleryV5OnBoardingButtonView;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        W w11;
        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel;
        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel2;
        w11 = this.this$0.observer;
        if (w11 != null) {
            galleryV5OnboardingViewModel = this.this$0.viewModel;
            if (galleryV5OnboardingViewModel != null) {
                galleryV5OnboardingViewModel.startOnBoarding(this.$this_apply.getId(), this.$this_apply.getDaysToShowAgain());
            }
            final GalleryV5OnBoardingButtonView galleryV5OnBoardingButtonView = this.$view;
            final GalleryV5ButtonOnBoardingBinder galleryV5ButtonOnBoardingBinder = this.this$0;
            if (galleryV5OnBoardingButtonView.isAttachedToWindow()) {
                galleryV5OnBoardingButtonView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryV5.presentation.buttons.binder.GalleryV5ButtonOnBoardingBinder$bind$1$2$invoke$$inlined$doOnDetach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                        GalleryV5OnboardingViewModel galleryV5OnboardingViewModel3;
                        galleryV5OnBoardingButtonView.removeOnAttachStateChangeListener(this);
                        galleryV5OnboardingViewModel3 = galleryV5ButtonOnBoardingBinder.viewModel;
                        if (galleryV5OnboardingViewModel3 != null) {
                            galleryV5OnboardingViewModel3.cancelOnBoarding();
                        }
                        galleryV5OnBoardingButtonView.stopOnBoarding();
                    }
                });
                return;
            }
            galleryV5OnboardingViewModel2 = galleryV5ButtonOnBoardingBinder.viewModel;
            if (galleryV5OnboardingViewModel2 != null) {
                galleryV5OnboardingViewModel2.cancelOnBoarding();
            }
            galleryV5OnBoardingButtonView.stopOnBoarding();
        }
    }
}
