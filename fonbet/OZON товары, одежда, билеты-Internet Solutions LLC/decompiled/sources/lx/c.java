package lx;

import android.animation.ValueAnimator;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.ProgressAnimationHelper;
import ru.ozon.app.android.travel.feature.avia.widgets.aviaCheckTariffs.presentation.flights.AviaCheckTariffsWidgetViewHolder;

/* loaded from: classes12.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73444a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f73445b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f73444a = i11;
        this.f73445b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f73444a) {
            case 0:
                ProgressAnimationHelper.animateProgressWidth$lambda$6$lambda$5((ProgressAnimationHelper) this.f73445b, valueAnimator);
                break;
            default:
                AviaCheckTariffsWidgetViewHolder.applyNewHeight$lambda$7$lambda$6$lambda$5((RecyclerView) this.f73445b, valueAnimator);
                break;
        }
    }
}
