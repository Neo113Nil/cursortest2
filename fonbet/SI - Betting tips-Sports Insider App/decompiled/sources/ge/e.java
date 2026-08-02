package ge;

import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.p1;
import com.sports.insider.ui.live.LiveFragment;
import hg.d1;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ LinearLayoutManager f9964a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ LiveFragment f9965b;

    public e(LinearLayoutManager linearLayoutManager, LiveFragment liveFragment) {
        this.f9964a = linearLayoutManager;
        this.f9965b = liveFragment;
    }

    @Override // androidx.recyclerview.widget.p1
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        Intrinsics.checkNotNullParameter(recyclerView, "recyclerView");
        LinearLayoutManager linearLayoutManager = this.f9964a;
        int findFirstVisibleItemPosition = linearLayoutManager.findFirstVisibleItemPosition();
        int findLastVisibleItemPosition = linearLayoutManager.findLastVisibleItemPosition();
        LiveFragment liveFragment = this.f9965b;
        if (findFirstVisibleItemPosition <= findLastVisibleItemPosition) {
            int i11 = findFirstVisibleItemPosition;
            while (true) {
                View view = linearLayoutManager.findViewByPosition(i11);
                if (view != null) {
                    Intrinsics.checkNotNullParameter(view, "view");
                    int measuredHeight = view.getMeasuredHeight();
                    if (measuredHeight != 0) {
                        double height = (r5.height() / measuredHeight) * 100;
                        if (view.getLocalVisibleRect(new Rect()) && height > 75.0d) {
                            k kVar = liveFragment.f6910a;
                            if (kVar == null) {
                                return;
                            }
                            hc.f fVar = (i11 == -1 || kVar.f9978a.isEmpty()) ? null : (hc.f) CollectionsKt.G(i11, kVar.f9978a);
                            if (fVar == null) {
                                return;
                            } else {
                                liveFragment.F().f9996e.b(fVar);
                            }
                        }
                    }
                    if (i11 == findLastVisibleItemPosition) {
                        break;
                    } else {
                        i11++;
                    }
                } else {
                    return;
                }
            }
        }
        d1 d1Var = liveFragment.F().f9999h;
        Boolean valueOf = Boolean.valueOf(findFirstVisibleItemPosition != 0);
        d1Var.getClass();
        d1Var.k(null, valueOf);
    }
}
