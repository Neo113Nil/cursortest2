package androidx.transition;

import android.view.View;
import java.util.ArrayList;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class k implements y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ View f2716a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ ArrayList f2717b;

    public k(View view, ArrayList arrayList) {
        this.f2716a = view;
        this.f2717b = arrayList;
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var) {
        a0Var.removeListener(this);
        this.f2716a.setVisibility(8);
        ArrayList arrayList = this.f2717b;
        int size = arrayList.size();
        for (int i5 = 0; i5 < size; i5++) {
            ((View) arrayList.get(i5)).setVisibility(0);
        }
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var) {
        a0Var.removeListener(this);
        a0Var.addListener(this);
    }

    @Override // androidx.transition.y
    public final void onTransitionStart(a0 a0Var, boolean z5) {
        a0Var.removeListener(this);
        a0Var.addListener(this);
    }

    @Override // androidx.transition.y
    public final void onTransitionEnd(a0 a0Var, boolean z5) {
        onTransitionEnd(a0Var);
    }

    @Override // androidx.transition.y
    public final void onTransitionCancel(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public final void onTransitionPause(a0 a0Var) {
    }

    @Override // androidx.transition.y
    public final void onTransitionResume(a0 a0Var) {
    }
}
