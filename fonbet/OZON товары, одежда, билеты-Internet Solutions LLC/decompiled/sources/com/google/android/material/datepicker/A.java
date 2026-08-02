package com.google.android.material.datepicker;

import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes9.dex */
class A extends LinearLayoutManager {

    final class a extends androidx.recyclerview.widget.r {
        @Override // androidx.recyclerview.widget.r
        protected final float calculateSpeedPerPixel(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.A a11, int i11) {
        a aVar = new a(recyclerView.getContext());
        aVar.setTargetPosition(i11);
        startSmoothScroll(aVar);
    }
}
