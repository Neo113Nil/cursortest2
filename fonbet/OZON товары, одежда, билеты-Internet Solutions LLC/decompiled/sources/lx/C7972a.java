package lx;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.fresh.unsorted.widgets.deliveryWidget.v4.presentation.DeliveryWidgetV4OverlayViewMapper;
import ru.ozon.app.android.travel.feature.tours.widgets.orderToursChangeForm.button.presentation.OrderToursChangeFormButtonViewMapper;

/* renamed from: lx.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final /* synthetic */ class C7972a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f73442a;

    public /* synthetic */ C7972a(int i11) {
        this.f73442a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$2;
        View createHolder$lambda$3;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f73442a) {
            case 0:
                createHolder$lambda$2 = DeliveryWidgetV4OverlayViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
            default:
                createHolder$lambda$3 = OrderToursChangeFormButtonViewMapper.createHolder$lambda$3(linearLayout);
                return createHolder$lambda$3;
        }
    }
}
