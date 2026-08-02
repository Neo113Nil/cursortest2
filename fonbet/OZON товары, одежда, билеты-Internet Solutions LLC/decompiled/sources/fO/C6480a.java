package fO;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.returns.ui.molecules.bottomEars.presentation.viewMapper.StickyBottomEarsWidgetMapper;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelQuickFilters.presentation.sticky.TravelQuickFiltersOverlayViewMapper;
import ru.ozon.app.android.ugc.widgets.reviewFormMobile.reviewFormHeader.ReviewFormHeaderViewMapper;

/* renamed from: fO.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C6480a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f63022a;

    public /* synthetic */ C6480a(int i11) {
        this.f63022a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$1;
        View createHolder$lambda$12;
        View createHolder$lambda$0;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f63022a) {
            case 0:
                createHolder$lambda$1 = TravelQuickFiltersOverlayViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
            case 1:
                createHolder$lambda$12 = ReviewFormHeaderViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$12;
            default:
                createHolder$lambda$0 = StickyBottomEarsWidgetMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
        }
    }
}
