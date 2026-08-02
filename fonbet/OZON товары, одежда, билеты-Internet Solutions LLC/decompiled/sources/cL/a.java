package cL;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v2.presentation.utils.DeliveryWidgetV2AnimationDelegate;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.presentation.multi.view.NavLikezoneCaruselBannerMulti;

/* loaded from: classes2.dex */
public final /* synthetic */ class a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56856a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56857b;

    public /* synthetic */ a(Object obj, int i11) {
        this.f56856a = i11;
        this.f56857b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z11;
        boolean z12;
        switch (this.f56856a) {
            case 0:
                z11 = NavLikezoneCaruselBannerMulti.View.topBadgeView$lambda$5$lambda$4((NavLikezoneCaruselBannerMulti.View) this.f56857b, view, motionEvent);
                return z11;
            default:
                z12 = DeliveryWidgetV2AnimationDelegate.setupTouchListener$lambda$9((DeliveryWidgetV2AnimationDelegate) this.f56857b, view, motionEvent);
                return z12;
        }
    }
}
