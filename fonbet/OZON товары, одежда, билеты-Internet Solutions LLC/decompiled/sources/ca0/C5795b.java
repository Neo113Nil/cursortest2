package ca0;

import android.animation.ValueAnimator;
import android.view.View;
import android.widget.TextView;
import ru.ozon.app.android.travel.feature.avia.shared.airplaneSeat.AirplaneSeatView;
import ru.ozon.app.android.travel.molecules.view.iconField.IconFieldView;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;
import ru.ozon.fintech.features.camera.ui.PhoneFrameView;
import ru.ozon.fintech.ui.button.switchbutton.FinSwitchItemView;

/* renamed from: ca0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C5795b implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56889a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ View f56890b;

    public /* synthetic */ C5795b(View view, int i11) {
        this.f56889a = i11;
        this.f56890b = view;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f56889a) {
            case 0:
                FinSwitchItemView.setTextColorAnimate$lambda$6((TextView) this.f56890b, valueAnimator);
                break;
            case 1:
                AirplaneSeatView.changeBackgroundColorWithAnimation$lambda$11$lambda$10((AirplaneSeatView) this.f56890b, valueAnimator);
                break;
            case 2:
                IconFieldView.fadeTextAnimator$lambda$14$lambda$13((IconFieldView) this.f56890b, valueAnimator);
                break;
            case 3:
                TravelTextInputLayout.riseHint$lambda$21$lambda$20((TravelTextInputLayout) this.f56890b, valueAnimator);
                break;
            default:
                PhoneFrameView.onSizeChanged$lambda$6$lambda$5((PhoneFrameView) this.f56890b, valueAnimator);
                break;
        }
    }
}
