package jF;

import android.animation.ValueAnimator;
import ru.ozon.app.android.pdpoldwidgets.widgets.comparison.core.carousel.ui.ComparisonCarouselBehavior;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;

/* renamed from: jF.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C7315a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f69523a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f69524b;

    public /* synthetic */ C7315a(Object obj, int i11) {
        this.f69523a = i11;
        this.f69524b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f69523a) {
            case 0:
                ComparisonCarouselBehavior.animator$lambda$2$lambda$1((ComparisonCarouselBehavior) this.f69524b, valueAnimator);
                break;
            default:
                ComplexRouteItemView.showAndHideDeleteButton$lambda$1$lambda$0((ComplexRouteItemView) this.f69524b, valueAnimator);
                break;
        }
    }
}
