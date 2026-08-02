package com.vk.music.view.player.holders.tracklist;

import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.log.L;

/* compiled from: MusicBigPlayerTrackListHolder.kt */
/* loaded from: classes3.dex */
public final class MusicBigPlayerTrackListHolder$recycler$1$linearLayoutManager$1 extends LinearLayoutManager {
    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final void onLayoutChildren(RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        try {
            super.onLayoutChildren(vVar, a0Var);
        } catch (RuntimeException e) {
            L.i(e);
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final int scrollVerticallyBy(int i, RecyclerView.v vVar, RecyclerView.a0 a0Var) {
        try {
            return super.scrollVerticallyBy(i, vVar, a0Var);
        } catch (RuntimeException e) {
            L.i(e);
            return 0;
        }
    }

    @Override // androidx.recyclerview.widget.LinearLayoutManager, androidx.recyclerview.widget.RecyclerView.o
    public final boolean supportsPredictiveItemAnimations() {
        return false;
    }
}
