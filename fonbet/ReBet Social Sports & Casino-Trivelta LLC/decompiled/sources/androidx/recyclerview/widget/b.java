package androidx.recyclerview.widget;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes.dex */
public final class b implements q {

    /* renamed from: a, reason: collision with root package name */
    public final RecyclerView.h f22980a;

    public b(RecyclerView.h hVar) {
        this.f22980a = hVar;
    }

    @Override // androidx.recyclerview.widget.q
    public void a(int i10, int i11) {
        this.f22980a.notifyItemRangeInserted(i10, i11);
    }

    @Override // androidx.recyclerview.widget.q
    public void b(int i10, int i11) {
        this.f22980a.notifyItemRangeRemoved(i10, i11);
    }

    @Override // androidx.recyclerview.widget.q
    public void c(int i10, int i11, Object obj) {
        this.f22980a.notifyItemRangeChanged(i10, i11, obj);
    }

    @Override // androidx.recyclerview.widget.q
    public void d(int i10, int i11) {
        this.f22980a.notifyItemMoved(i10, i11);
    }
}
