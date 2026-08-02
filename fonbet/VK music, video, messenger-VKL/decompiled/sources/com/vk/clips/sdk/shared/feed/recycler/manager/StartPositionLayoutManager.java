package com.vk.clips.sdk.shared.feed.recycler.manager;

import android.os.Parcelable;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.gzs;
import xsna.z0h0;

/* compiled from: StartPositionLayoutManager.kt */
/* loaded from: classes17.dex */
public class StartPositionLayoutManager extends LinearLayoutManager {
    public gzs<Integer> r;

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        if (this.r.invoke().intValue() != -1 && a0Var.b() > 0) {
            K(this.r.invoke().intValue(), 0);
            this.r = new z0h0(5);
        }
        super.onLayoutChildren(vVar, a0Var);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onRestoreInstanceState(Parcelable parcelable) {
        this.r = new z0h0(5);
        super.onRestoreInstanceState(parcelable);
    }
}
