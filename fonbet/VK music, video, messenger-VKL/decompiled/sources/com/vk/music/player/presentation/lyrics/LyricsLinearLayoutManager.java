package com.vk.music.player.presentation.lyrics;

import android.content.Context;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import xsna.j9p0;
import xsna.mb00;

/* compiled from: LyricsLinearLayoutManager.kt */
/* loaded from: classes3.dex */
public final class LyricsLinearLayoutManager extends LinearLayoutManager {
    public final mb00 r;

    public LyricsLinearLayoutManager(Context context, mb00 mb00Var) {
        super(1, false);
        this.r = mb00Var;
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final RecyclerView.p generateDefaultLayoutParams() {
        return new RecyclerView.p(-1, -2);
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void smoothScrollToPosition(RecyclerView recyclerView, RecyclerView.a0 a0Var, int i) {
        j9p0 j9p0Var = new j9p0(recyclerView.getContext(), this.r);
        j9p0Var.setTargetPosition(i);
        startSmoothScroll(j9p0Var);
    }
}
