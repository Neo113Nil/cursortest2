package com.vk.im.ui.utils.recyclerview.carousel;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import xsna.x9;

/* compiled from: CenterLayoutManager.kt */
/* loaded from: classes2.dex */
public final class CenterLayoutManager extends LinearLayoutManager {

    /* compiled from: CenterLayoutManager.kt */
    public static final class a extends v {
        @Override // androidx.recyclerview.widget.v
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return x9.b(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
