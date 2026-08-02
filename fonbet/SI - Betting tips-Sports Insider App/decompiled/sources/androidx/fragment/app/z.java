package androidx.fragment.app;

import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class z implements Runnable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f2115a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Object f2116b;

    public /* synthetic */ z(int i5, Object obj) {
        this.f2115a = i5;
        this.f2116b = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.f2115a) {
            case 0:
                Fragment fragment = (Fragment) this.f2116b;
                b2 b2Var = fragment.mViewLifecycleOwner;
                b2Var.f1876f.b(fragment.mSavedViewRegistryState);
                fragment.mSavedViewRegistryState = null;
                break;
            case 1:
                Ref.ObjectRef seekCancelLambda = (Ref.ObjectRef) this.f2116b;
                Intrinsics.checkNotNullParameter(seekCancelLambda, "$seekCancelLambda");
                Function0 function0 = (Function0) seekCancelLambda.element;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 2:
                ArrayList transitioningViews = (ArrayList) this.f2116b;
                Intrinsics.checkNotNullParameter(transitioningViews, "$transitioningViews");
                t1.a(transitioningViews, 4);
                break;
            case 3:
                p this$0 = (p) this.f2116b;
                Intrinsics.checkNotNullParameter(this$0, "this$0");
                if (j1.L(2)) {
                    Log.v("FragmentManager", "Transition for all operations has completed");
                }
                Iterator it = this$0.f2020c.iterator();
                while (it.hasNext()) {
                    ((q) it.next()).f1994a.c(this$0);
                }
                break;
            default:
                Iterator it2 = ((j1) this.f2116b).f1975n.iterator();
                while (it2.hasNext()) {
                    ((a2.o) it2.next()).getClass();
                }
                break;
        }
    }
}
