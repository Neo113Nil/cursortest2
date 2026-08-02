package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class g2 extends p1 {

    /* renamed from: a, reason: collision with root package name */
    public boolean f2399a = false;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h2 f2400b;

    public g2(h2 h2Var) {
        this.f2400b = h2Var;
    }

    @Override // androidx.recyclerview.widget.p1
    public final void onScrollStateChanged(RecyclerView recyclerView, int i5) {
        super.onScrollStateChanged(recyclerView, i5);
        if (i5 == 0 && this.f2399a) {
            this.f2399a = false;
            this.f2400b.snapToTargetExistingView();
        }
    }

    @Override // androidx.recyclerview.widget.p1
    public final void onScrolled(RecyclerView recyclerView, int i5, int i10) {
        if (i5 == 0 && i10 == 0) {
            return;
        }
        this.f2399a = true;
    }
}
