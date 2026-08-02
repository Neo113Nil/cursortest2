package ke;

import android.view.View;
import androidx.lifecycle.d1;
import com.sports.insider.ui.activities.MainActivity;
import com.sports.insider.ui.onboarding.IdentifyFragment;
import com.sports.insider.ui.onboarding.SportInsiderFragment;
import eg.c0;
import eg.y;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class e implements View.OnClickListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f19029a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f19030b;

    public /* synthetic */ e(int i5, Object obj) {
        this.f19029a = i5;
        this.f19030b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        switch (this.f19029a) {
            case 0:
                IdentifyFragment identifyFragment = (IdentifyFragment) this.f19030b;
                c0.t(d1.g(identifyFragment), new y("OnClickNotAutoNavigate"), null, new h(identifyFragment, null, 0), 2);
                break;
            case 1:
                SportInsiderFragment sportInsiderFragment = (SportInsiderFragment) this.f19030b;
                c0.t(d1.g(sportInsiderFragment), new y("OnClickNotAutoNavigate"), null, new u(sportInsiderFragment, null, 0), 2);
                break;
            default:
                ((com.google.android.play.core.appupdate.e) ((MainActivity) this.f19030b).B.getValue()).a();
                break;
        }
    }
}
