package qk;

import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import d20.InterfaceC6068e;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingV2StickyButtonBaseView;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.button.CancelPostingsV2ButtonViewMapper;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewHolder.ReturnTotalMobileView;
import ru.ozon.app.android.returns.returnableItemsList.presentation.totalMobile.viewMapper.TotalMobileViewMapper;

/* loaded from: classes11.dex */
public final /* synthetic */ class a implements InterfaceC6068e {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f82270a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ConstraintLayout f82271b;

    public /* synthetic */ a(ConstraintLayout constraintLayout, int i11) {
        this.f82270a = i11;
        this.f82271b = constraintLayout;
    }

    @Override // d20.InterfaceC6068e
    public final View create(ViewGroup viewGroup) {
        View createHolder$lambda$0;
        View createHolder$lambda$02;
        switch (this.f82270a) {
            case 0:
                createHolder$lambda$0 = CancelPostingsV2ButtonViewMapper.createHolder$lambda$0((CancelPostingV2StickyButtonBaseView) this.f82271b, (LinearLayout) viewGroup);
                return createHolder$lambda$0;
            default:
                createHolder$lambda$02 = TotalMobileViewMapper.createHolder$lambda$0((ReturnTotalMobileView) this.f82271b, (LinearLayout) viewGroup);
                return createHolder$lambda$02;
        }
    }
}
