package ru.tinkoff.scrollingpagerindicator;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
final class b extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollingPagerIndicator f97999a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f98000b;

    b(d dVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f98000b = dVar;
        this.f97999a = scrollingPagerIndicator;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onChanged() {
        RecyclerView.g gVar;
        d dVar = this.f98000b;
        gVar = dVar.f98006d;
        this.f97999a.m(gVar.getItemCount());
        dVar.i();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeChanged(int i11, int i12) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeMoved(int i11, int i12, int i13) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeRemoved(int i11, int i12) {
        onChanged();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeChanged(int i11, int i12, Object obj) {
        onChanged();
    }
}
