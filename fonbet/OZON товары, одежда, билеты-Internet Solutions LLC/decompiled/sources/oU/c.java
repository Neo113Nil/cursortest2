package oU;

import android.view.View;
import ru.ozon.app.android.marketing.widgets.coupon.presentation.HighlightsCouponOverlayViewHolder;
import ru.ozon.app.android.travel.molecules.view.input.TravelTextInputLayout;

/* loaded from: classes2.dex */
public final /* synthetic */ class c implements View.OnLayoutChangeListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77852a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f77853b;

    public /* synthetic */ c(Object obj, int i11) {
        this.f77852a = i11;
        this.f77853b = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i11, int i12, int i13, int i14, int i15, int i16, int i17, int i18) {
        switch (this.f77852a) {
            case 0:
                TravelTextInputLayout.updateLayout$default((TravelTextInputLayout) this.f77853b, false, 1, null);
                break;
            default:
                ((HighlightsCouponOverlayViewHolder) this.f77853b).updatePositionAndVisibility();
                break;
        }
    }
}
