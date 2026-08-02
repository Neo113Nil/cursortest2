package ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons;

import android.view.View;
import androidx.lifecycle.W;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.widgets.galleryV4.presentation.GalleryV4VO;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class GalleryV4OnBoardingButtonVH$bind$1$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ GalleryV4VO.Button.OnBoarding $this_apply;
    final /* synthetic */ GalleryV4OnBoardingButtonVH this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    GalleryV4OnBoardingButtonVH$bind$1$2(GalleryV4OnBoardingButtonVH galleryV4OnBoardingButtonVH, GalleryV4VO.Button.OnBoarding onBoarding) {
        super(0);
        this.this$0 = galleryV4OnBoardingButtonVH;
        this.$this_apply = onBoarding;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        W w11;
        GalleryV4ButtonsViewModel galleryV4ButtonsViewModel;
        final GalleryV4OnBoardingButtonView galleryV4OnBoardingButtonView;
        GalleryV4ButtonsViewModel galleryV4ButtonsViewModel2;
        GalleryV4OnBoardingButtonView galleryV4OnBoardingButtonView2;
        w11 = this.this$0.observer;
        if (w11 != null) {
            galleryV4ButtonsViewModel = this.this$0.viewModel;
            if (galleryV4ButtonsViewModel != null) {
                galleryV4ButtonsViewModel.startOnBoarding(this.$this_apply.getId(), this.$this_apply.getDaysToShowAgain());
            }
            galleryV4OnBoardingButtonView = this.this$0.view;
            final GalleryV4OnBoardingButtonVH galleryV4OnBoardingButtonVH = this.this$0;
            if (galleryV4OnBoardingButtonView.isAttachedToWindow()) {
                galleryV4OnBoardingButtonView.addOnAttachStateChangeListener(new View.OnAttachStateChangeListener() { // from class: ru.ozon.app.android.pdp.widgets.galleryV4.presentation.buttons.GalleryV4OnBoardingButtonVH$bind$1$2$invoke$$inlined$doOnDetach$1
                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewAttachedToWindow(@NotNull View view) {
                    }

                    @Override // android.view.View.OnAttachStateChangeListener
                    public void onViewDetachedFromWindow(@NotNull View view) {
                        GalleryV4ButtonsViewModel galleryV4ButtonsViewModel3;
                        GalleryV4OnBoardingButtonView galleryV4OnBoardingButtonView3;
                        galleryV4OnBoardingButtonView.removeOnAttachStateChangeListener(this);
                        galleryV4ButtonsViewModel3 = galleryV4OnBoardingButtonVH.viewModel;
                        if (galleryV4ButtonsViewModel3 != null) {
                            galleryV4ButtonsViewModel3.cancelOnBoarding();
                        }
                        galleryV4OnBoardingButtonView3 = galleryV4OnBoardingButtonVH.view;
                        galleryV4OnBoardingButtonView3.stopOnBoarding();
                    }
                });
                return;
            }
            galleryV4ButtonsViewModel2 = galleryV4OnBoardingButtonVH.viewModel;
            if (galleryV4ButtonsViewModel2 != null) {
                galleryV4ButtonsViewModel2.cancelOnBoarding();
            }
            galleryV4OnBoardingButtonView2 = galleryV4OnBoardingButtonVH.view;
            galleryV4OnBoardingButtonView2.stopOnBoarding();
        }
    }
}
