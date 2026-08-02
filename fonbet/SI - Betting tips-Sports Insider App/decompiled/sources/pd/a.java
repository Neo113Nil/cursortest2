package pd;

import androidx.appcompat.widget.q4;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.q0;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sports.insider.ui.activities.BonusesInfo;
import com.sports.insider.ui.viewpage.ViewPageEventFragment;
import ic.i0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class a implements q0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f21722a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Fragment f21723b;

    public /* synthetic */ a(Fragment fragment, int i5) {
        this.f21722a = i5;
        this.f21723b = fragment;
    }

    @Override // androidx.lifecycle.q0
    public final void a(Object obj) {
        q4 q4Var;
        SwipeRefreshLayout swipeRefreshLayout;
        y1.c0 c0Var;
        switch (this.f21722a) {
            case 0:
                BonusesInfo bonusesInfo = (BonusesInfo) this.f21723b;
                boolean booleanValue = ((Boolean) obj).booleanValue();
                if (bonusesInfo.isAdded() && (q4Var = bonusesInfo.f6883c) != null && (swipeRefreshLayout = (SwipeRefreshLayout) q4Var.f898h) != null) {
                    swipeRefreshLayout.setRefreshing(booleanValue);
                    break;
                }
                break;
            default:
                ViewPageEventFragment viewPageEventFragment = (ViewPageEventFragment) this.f21723b;
                i0 i0Var = (i0) obj;
                ic.f fVar = i0Var != null ? (ic.f) i0Var.a() : null;
                ic.f fVar2 = fVar != null ? fVar : null;
                if (fVar2 != null && (c0Var = fVar2.f11114a) != null) {
                    try {
                        a.a.r(viewPageEventFragment).d(c0Var);
                        break;
                    } catch (Exception unused) {
                        return;
                    }
                }
                break;
        }
    }
}
