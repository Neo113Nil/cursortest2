package ru.ozon.android.messenger.framework.presentation.chatdetail;

import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes10.dex */
public final class p extends RecyclerView.i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ k f89924a;

    p(k kVar) {
        this.f89924a = kVar;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.i
    public final void onItemRangeInserted(int i11, int i12) {
        k kVar = this.f89924a;
        kVar.D().unregisterAdapterDataObserver(this);
        k.M(kVar);
    }
}
