package wx;

import android.animation.ValueAnimator;
import ru.ozon.app.android.fresh.unsorted.widgets.infoDropDown.presentation.InfoDropDownItemViewHolder;
import ru.ozon.app.android.uikit.view.input.MobilizationTextInputLayout;

/* renamed from: wx.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C10570a implements ValueAnimator.AnimatorUpdateListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f104637a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f104638b;

    public /* synthetic */ C10570a(Object obj, int i11) {
        this.f104637a = i11;
        this.f104638b = obj;
    }

    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        switch (this.f104637a) {
            case 0:
                InfoDropDownItemViewHolder.animator$lambda$2$lambda$1((InfoDropDownItemViewHolder) this.f104638b, valueAnimator);
                break;
            default:
                MobilizationTextInputLayout.centerHint$lambda$15$lambda$14((MobilizationTextInputLayout) this.f104638b, valueAnimator);
                break;
        }
    }
}
