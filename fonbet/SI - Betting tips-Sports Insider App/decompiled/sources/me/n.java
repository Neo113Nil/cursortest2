package me;

import android.graphics.Rect;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.sports.insider.ui.prediction.PredictionFragment;
import com.sports.insider.ui.strip.PredictionListFragment;
import com.sports.insider.ui.viewpage.ViewImageFragment;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class n extends c4.i {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f20663b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Fragment f20664c;

    public /* synthetic */ n(Fragment fragment, int i5) {
        this.f20663b = i5;
        this.f20664c = fragment;
    }

    @Override // c4.i
    public final void a(q4.h request, q4.p result) {
        SwipeRefreshLayout swipeRefreshLayout;
        switch (this.f20663b) {
            case 0:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                ((PredictionFragment) this.f20664c).L();
                break;
            case 1:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                PredictionListFragment predictionListFragment = (PredictionListFragment) this.f20664c;
                Rect rect = predictionListFragment.f7032l;
                ec.b0 b0Var = (ec.b0) predictionListFragment.f22459a;
                if (b0Var != null && (swipeRefreshLayout = b0Var.f8876i) != null) {
                    swipeRefreshLayout.getHitRect(rect);
                    ec.b0 b0Var2 = (ec.b0) predictionListFragment.f22459a;
                    if (b0Var2 != null) {
                        FrameLayout frameLayout = b0Var2.f8874g;
                        pe.s H = predictionListFragment.H();
                        boolean localVisibleRect = frameLayout.getLocalVisibleRect(rect);
                        AtomicBoolean atomicBoolean = H.f21878s;
                        if (localVisibleRect && !atomicBoolean.get()) {
                            atomicBoolean.set(true);
                            if (!H.f21882w.get()) {
                                H.q.C(H.f21884y);
                                break;
                            }
                        }
                    }
                }
                break;
            default:
                Intrinsics.checkNotNullParameter(request, "request");
                Intrinsics.checkNotNullParameter(result, "result");
                pe.s sVar = ((ViewImageFragment) this.f20664c).f7075d;
                if (sVar != null) {
                    AtomicBoolean atomicBoolean2 = sVar.f21877r;
                    if (!atomicBoolean2.get()) {
                        atomicBoolean2.set(true);
                        sVar.q.C(sVar.f21883x);
                        break;
                    }
                }
                break;
        }
    }
}
