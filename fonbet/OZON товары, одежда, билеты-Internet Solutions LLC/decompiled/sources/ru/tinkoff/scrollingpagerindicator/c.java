package ru.tinkoff.scrollingpagerindicator;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes4.dex */
final class c extends RecyclerView.t {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ScrollingPagerIndicator f98001a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ d f98002b;

    c(d dVar, ScrollingPagerIndicator scrollingPagerIndicator) {
        this.f98002b = dVar;
        this.f98001a = scrollingPagerIndicator;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x000a, code lost:
    
        r4 = r3.e();
     */
    @Override // androidx.recyclerview.widget.RecyclerView.t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onScrollStateChanged(@NonNull RecyclerView recyclerView, int i11) {
        int e11;
        RecyclerView.g gVar;
        RecyclerView.g gVar2;
        if (i11 == 0) {
            d dVar = this.f98002b;
            if (!d.c(dVar) || e11 == -1) {
                return;
            }
            gVar = dVar.f98006d;
            int itemCount = gVar.getItemCount();
            ScrollingPagerIndicator scrollingPagerIndicator = this.f98001a;
            scrollingPagerIndicator.m(itemCount);
            gVar2 = dVar.f98006d;
            if (e11 < gVar2.getItemCount()) {
                scrollingPagerIndicator.k(e11);
            }
        }
    }

    @Override // androidx.recyclerview.widget.RecyclerView.t
    public final void onScrolled(@NonNull RecyclerView recyclerView, int i11, int i12) {
        this.f98002b.i();
    }
}
