package nq;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.cml.delivery.widgets.searchBar.presentation.SearchBarViewMapper;
import ru.ozon.app.android.travel.feature.general.common.widgets.buttonWithInformation.v1.presentation.horizontal.ButtonWithInformationViewMapper;

/* renamed from: nq.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* synthetic */ class C8616a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f77433a;

    public /* synthetic */ C8616a(int i11) {
        this.f77433a = i11;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$0;
        View createHolder$lambda$1;
        LinearLayout linearLayout = (LinearLayout) viewGroup;
        switch (this.f77433a) {
            case 0:
                createHolder$lambda$0 = SearchBarViewMapper.createHolder$lambda$0(linearLayout);
                return createHolder$lambda$0;
            default:
                createHolder$lambda$1 = ButtonWithInformationViewMapper.createHolder$lambda$1(linearLayout);
                return createHolder$lambda$1;
        }
    }
}
