package yQ;

import android.animation.ValueAnimator;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v4.view.SearchFormV4LocationsView;
import ru.ozon.app.android.travel.feature.general.main.widgets.searchForm.v5.view.SearchFormV5LocationsView;

/* loaded from: classes4.dex */
public final /* synthetic */ class a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f106379a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ float f106380b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f106381c;

    public /* synthetic */ a(ConstraintLayout constraintLayout, float f7, int i11) {
        this.f106379a = i11;
        this.f106381c = constraintLayout;
        this.f106380b = f7;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f106379a) {
            case 0:
                SearchFormV4LocationsView.shrinkAnimator$lambda$18$lambda$17((SearchFormV4LocationsView) this.f106381c, this.f106380b, valueAnimator);
                break;
            default:
                SearchFormV5LocationsView.shrinkAnimator$lambda$18$lambda$17((SearchFormV5LocationsView) this.f106381c, this.f106380b, valueAnimator);
                break;
        }
    }
}
