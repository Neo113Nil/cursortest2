package com.google.android.material.datepicker;

import android.content.Context;
import android.util.DisplayMetrics;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

/* loaded from: classes3.dex */
public abstract class u extends LinearLayoutManager {

    public class a extends androidx.recyclerview.widget.o {
        public a(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.o
        public float v(DisplayMetrics displayMetrics) {
            return 100.0f / displayMetrics.densityDpi;
        }
    }

    public u(Context context, int i10, boolean z10) {
        super(context, i10, z10);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.q
    public void W1(RecyclerView recyclerView, RecyclerView.B b10, int i10) {
        a aVar = new a(recyclerView.getContext());
        aVar.p(i10);
        X1(aVar);
    }
}
