package nD;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.pdp.widgets.cartButtonQuant.subscribe.SubscribeQuantViewMapper;
import ru.ozon.app.android.travel.feature.general.main.widgets.priceCalendarFooter.v1.presentation.PriceCalendarFooterViewMapper;

/* renamed from: nD.a, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* synthetic */ class C8463a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f76650a;

    public /* synthetic */ C8463a(int i11) {
        this.f76650a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$2;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f76650a) {
            case 0:
                createHolder$lambda$1 = SubscribeQuantViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            default:
                createHolder$lambda$2 = PriceCalendarFooterViewMapper.createHolder$lambda$2(linearLayout);
                return createHolder$lambda$2;
        }
    }
}
