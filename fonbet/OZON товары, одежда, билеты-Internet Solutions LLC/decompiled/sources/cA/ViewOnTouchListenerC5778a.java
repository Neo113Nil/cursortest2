package cA;

import android.view.MotionEvent;
import android.view.View;
import ru.ozon.app.android.cml.delivery.widgets.regionSearch.presentation.RegionSearchWidgetViewHolder;
import ru.ozon.app.android.marketing.widgets.sellerTransparencyV3.presentation.SellerTransparencyV3ViewHolder;
import ru.ozon.app.android.pdp.widgets.brand.presentation.original.OriginalBrandBinder;

/* renamed from: cA.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class ViewOnTouchListenerC5778a implements View.OnTouchListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f56850a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f56851b;

    public /* synthetic */ ViewOnTouchListenerC5778a(Object obj, int i11) {
        this.f56850a = i11;
        this.f56851b = obj;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        boolean badgeOnTouchListener$lambda$1;
        boolean _init_$lambda$1;
        boolean z11;
        switch (this.f56850a) {
            case 0:
                badgeOnTouchListener$lambda$1 = SellerTransparencyV3ViewHolder.badgeOnTouchListener$lambda$1((SellerTransparencyV3ViewHolder) this.f56851b, view, motionEvent);
                return badgeOnTouchListener$lambda$1;
            case 1:
                _init_$lambda$1 = OriginalBrandBinder._init_$lambda$1((OriginalBrandBinder) this.f56851b, view, motionEvent);
                return _init_$lambda$1;
            default:
                z11 = RegionSearchWidgetViewHolder.touchListener$lambda$0((RegionSearchWidgetViewHolder) this.f56851b, view, motionEvent);
                return z11;
        }
    }
}
