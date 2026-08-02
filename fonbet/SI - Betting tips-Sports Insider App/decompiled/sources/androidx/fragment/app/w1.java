package androidx.fragment.app;

import android.transition.Transition;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class w1 implements Transition.TransitionListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Object f2103a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2104b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f2105c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2106d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ y1 f2107e;

    public w1(y1 y1Var, Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        this.f2107e = y1Var;
        this.f2103a = obj;
        this.f2104b = arrayList;
        this.f2105c = obj2;
        this.f2106d = arrayList2;
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionEnd(Transition transition) {
        transition.removeListener(this);
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionStart(Transition transition) {
        y1 y1Var = this.f2107e;
        Object obj = this.f2103a;
        if (obj != null) {
            y1Var.A(obj, this.f2104b, null);
        }
        Object obj2 = this.f2105c;
        if (obj2 != null) {
            y1Var.A(obj2, this.f2106d, null);
        }
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionCancel(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionPause(Transition transition) {
    }

    @Override // android.transition.Transition.TransitionListener
    public final void onTransitionResume(Transition transition) {
    }
}
