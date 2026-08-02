package com.vk.core.ui.utils;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.v;
import xsna.x9;

/* compiled from: CenterLayoutManager.kt */
/* loaded from: classes17.dex */
public final class CenterLayoutManager extends LinearLayoutManager {
    public final a r;

    /* compiled from: CenterLayoutManager.kt */
    public static final class a extends v {
        @Override // androidx.recyclerview.widget.v
        public final int calculateDtToFit(int i, int i2, int i3, int i4, int i5) {
            return x9.b(i4, i3, 2, i3) - (((i2 - i) / 2) + i);
        }
    }

    public CenterLayoutManager(Context context) {
        super(1, false);
        this.r = new a(context);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        a aVar = this.r;
        aVar.setTargetPosition(i);
        startSmoothScroll(aVar);
    }
}
