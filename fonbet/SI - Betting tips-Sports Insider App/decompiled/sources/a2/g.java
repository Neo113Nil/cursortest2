package a2;

import android.util.Log;
import androidx.lifecycle.c0;
import androidx.lifecycle.e0;
import androidx.lifecycle.w;
import e.d0;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class g implements c0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f33b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f34c;

    public /* synthetic */ g(int i5, Object obj, Object obj2) {
        this.f32a = i5;
        this.f33b = obj;
        this.f34c = obj2;
    }

    @Override // androidx.lifecycle.c0
    public final void c(e0 owner, w event) {
        switch (this.f32a) {
            case 0:
                m mVar = (m) this.f33b;
                y1.l lVar = (y1.l) this.f34c;
                Intrinsics.checkNotNullParameter(owner, "owner");
                Intrinsics.checkNotNullParameter(event, "event");
                if (event == w.ON_RESUME && ((List) mVar.b().f25604e.f10742a.getValue()).contains(lVar)) {
                    if (m.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + owner + " view lifecycle reaching RESUMED");
                    }
                    mVar.b().c(lVar);
                }
                if (event == w.ON_DESTROY) {
                    if (m.n()) {
                        Log.v("FragmentNavigator", "Marking transition complete for entry " + lVar + " due to fragment " + owner + " view lifecycle reaching DESTROYED");
                    }
                    mVar.b().c(lVar);
                    break;
                }
                break;
            case 1:
                androidx.core.view.q qVar = (androidx.core.view.q) this.f33b;
                androidx.core.view.r rVar = (androidx.core.view.r) this.f34c;
                qVar.getClass();
                if (event == w.ON_DESTROY) {
                    qVar.b(rVar);
                    break;
                }
                break;
            default:
                e.j.m((d0) this.f33b, (e.j) this.f34c, owner, event);
                break;
        }
    }
}
