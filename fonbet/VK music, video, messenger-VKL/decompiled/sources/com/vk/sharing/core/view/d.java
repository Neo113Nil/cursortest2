package com.vk.sharing.core.view;

import androidx.recyclerview.widget.GridLayoutManager;

/* compiled from: SharingV2View.kt */
/* loaded from: classes5.dex */
public final class d extends GridLayoutManager.c {
    public final /* synthetic */ f d;

    public d(f fVar) {
        this.d = fVar;
    }

    @Override // androidx.recyclerview.widget.GridLayoutManager.c
    public final int c(int i) {
        f fVar = this.d;
        if (fVar.N0.getItemViewType(i) == 3) {
            return fVar.K0.s;
        }
        return 1;
    }
}
