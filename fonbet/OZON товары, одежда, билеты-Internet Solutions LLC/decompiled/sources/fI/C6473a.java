package fI;

import android.animation.ValueAnimator;
import android.view.View;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.pinchtozoom.PinchToZoomOnboardingAnimator;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffsPriceDetails.view.AviaCheckTariffsPriceDetailsView;
import ru.ozon.fintech.features.camera.ui.PhoneFrameView;

/* renamed from: fI.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C6473a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63014a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f63015b;

    public /* synthetic */ C6473a(Object obj, int i11) {
        this.f63014a = i11;
        this.f63015b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f63014a) {
            case 0:
                PinchToZoomOnboardingAnimator.getDotsAlphaAnimator$lambda$11$lambda$10((PinchToZoomOnboardingAnimator) this.f63015b, valueAnimator);
                break;
            case 1:
                PhoneFrameView.onSizeChanged$lambda$2$lambda$1((PhoneFrameView) this.f63015b, valueAnimator);
                break;
            default:
                AviaCheckTariffsPriceDetailsView.hideViewAnimated$lambda$8$lambda$6((View) this.f63015b, valueAnimator);
                break;
        }
    }
}
