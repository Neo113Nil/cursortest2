package oU;

import android.animation.ValueAnimator;
import android.view.ViewGroup;
import ru.ozon.android.messenger.blocks.common.HighlightLinearLayout;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayoutV2;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77857a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ViewGroup f77858b;

    public /* synthetic */ g(ViewGroup viewGroup, int i11) {
        this.f77857a = i11;
        this.f77858b = viewGroup;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f77857a) {
            case 0:
                TravelTextInputLayoutV2.riseHint$lambda$17$lambda$16((TravelTextInputLayoutV2) this.f77858b, valueAnimator);
                break;
            default:
                HighlightLinearLayout.h((HighlightLinearLayout) this.f77858b, valueAnimator);
                break;
        }
    }
}
