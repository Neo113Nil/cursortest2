package androidx.appcompat.widget;

import android.widget.AbsListView;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class q2 implements AbsListView.OnScrollListener {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ s2 f890a;

    public q2(s2 s2Var) {
        this.f890a = s2Var;
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScrollStateChanged(AbsListView absListView, int i5) {
        s2 s2Var = this.f890a;
        p2 p2Var = s2Var.f932r;
        j0 j0Var = s2Var.f940z;
        if (i5 != 1 || j0Var.getInputMethodMode() == 2 || j0Var.getContentView() == null) {
            return;
        }
        s2Var.f936v.removeCallbacks(p2Var);
        p2Var.run();
    }

    @Override // android.widget.AbsListView.OnScrollListener
    public final void onScroll(AbsListView absListView, int i5, int i10, int i11) {
    }
}
