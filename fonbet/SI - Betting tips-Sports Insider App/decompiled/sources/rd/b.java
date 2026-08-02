package rd;

import androidx.fragment.app.p0;
import b3.a;
import com.sports.insider.R;
import com.sports.insider.ui.views.ToolbarView;
import gf.k;
import gf.t;
import kotlin.Metadata;
import pd.x;
import ve.w0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u00032\u00020\u0004B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lrd/b;", "Lb3/a;", "VB", "Lrd/a;", "Lve/w0;", "<init>", "()V", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class b<VB extends b3.a> extends a<VB> implements w0 {

    /* renamed from: b, reason: collision with root package name */
    public final t f22460b = k.b(new me.a(15, this));

    public final x G() {
        return (x) this.f22460b.getValue();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        p0 activity = getActivity();
        ToolbarView toolbarView = activity != null ? (ToolbarView) activity.findViewById(R.id.toolbarView) : null;
        if (toolbarView != null) {
            toolbarView.setToolbarMenuInterface(this);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
        p0 activity = getActivity();
        ToolbarView toolbarView = activity != null ? (ToolbarView) activity.findViewById(R.id.toolbarView) : null;
        if (toolbarView != null) {
            toolbarView.setToolbarMenuInterface(null);
        }
    }

    public void k(int i5) {
    }
}
