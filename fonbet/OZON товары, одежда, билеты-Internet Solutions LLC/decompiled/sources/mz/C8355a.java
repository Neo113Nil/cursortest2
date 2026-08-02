package mz;

import android.animation.ValueAnimator;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.marketing.widgets.bigPromoPDP.presentation.BigPromoPercentageView;
import ru.ozon.app.android.pdp.widgets.navBar.NavBarUtils;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaComplexSearchForm.view.ComplexRouteItemView;
import ru.ozon.app.android.uikit.view.progress.OzProgressBar;

/* renamed from: mz.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C8355a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76042a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f76043b;

    public /* synthetic */ C8355a(Object obj, int i11) {
        this.f76042a = i11;
        this.f76043b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f76042a) {
            case 0:
                BigPromoPercentageView.startAnimation$lambda$3$lambda$2((BigPromoPercentageView) this.f76043b, valueAnimator);
                break;
            case 1:
                NavBarUtils.DefaultImpls.alphaAnimation$lambda$2$lambda$1((Function1) this.f76043b, valueAnimator);
                break;
            case 2:
                ComplexRouteItemView.showAndHideDeleteButton$lambda$3$lambda$2((ComplexRouteItemView) this.f76043b, valueAnimator);
                break;
            default:
                OzProgressBar.animateProgress$lambda$5$lambda$4((OzProgressBar) this.f76043b, valueAnimator);
                break;
        }
    }
}
