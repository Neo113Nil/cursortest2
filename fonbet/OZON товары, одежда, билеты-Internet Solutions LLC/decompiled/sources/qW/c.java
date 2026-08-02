package qW;

import android.animation.ValueAnimator;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.bottomSheetFragment.SheetHeightController;
import ru.ozon.fintech.ui.pinprogress.PinProgressView;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f81778a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f81779b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f81780c;

    public /* synthetic */ c(int i11, Object obj, Object obj2) {
        this.f81778a = i11;
        this.f81779b = obj;
        this.f81780c = obj2;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f81778a) {
            case 0:
                SheetHeightController.revealSheet$lambda$9$lambda$5((BottomSheetBehavior) this.f81779b, (SheetHeightController) this.f81780c, valueAnimator);
                break;
            default:
                PinProgressView.reset$lambda$4$lambda$3$lambda$2$lambda$1((PinProgressView.DotState) this.f81779b, (PinProgressView) this.f81780c, valueAnimator);
                break;
        }
    }
}
