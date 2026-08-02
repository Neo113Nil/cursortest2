package androidx.recyclerview.widget;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class c implements o0 {

    /* renamed from: a, reason: collision with root package name */
    public final Object f2330a;

    @Override // androidx.recyclerview.widget.o0
    public void a(int i5, int i10) {
        ((x0) this.f2330a).notifyItemMoved(i5, i10);
    }

    @Override // androidx.recyclerview.widget.o0
    public void b(int i5, int i10) {
        ((x0) this.f2330a).notifyItemRangeInserted(i5, i10);
    }

    @Override // androidx.recyclerview.widget.o0
    public void c(int i5, int i10) {
        ((x0) this.f2330a).notifyItemRangeRemoved(i5, i10);
    }

    @Override // androidx.recyclerview.widget.o0
    public void d(int i5, int i10, Object obj) {
        ((x0) this.f2330a).notifyItemRangeChanged(i5, i10, obj);
    }
}
