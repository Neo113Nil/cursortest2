package com.vk.profile.core.scheduled_clips;

import android.content.Context;
import android.util.AttributeSet;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.lists.RecyclerPaginatedView;
import xsna.q0i;
import xsna.t0i;

/* compiled from: CommunityScheduledClipsGridPaginatedView.kt */
/* loaded from: classes5.dex */
public final class CommunityScheduledClipsGridPaginatedView extends RecyclerPaginatedView {
    public q0i N;
    public t0i O;

    public CommunityScheduledClipsGridPaginatedView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
    }

    /* JADX WARN: Incorrect types in method signature: <T:Landroidx/recyclerview/widget/RecyclerView$e0;V:Landroidx/recyclerview/widget/RecyclerView$Adapter<TT;>;:Lxsna/vic;>(TV;)V */
    @Override // com.vk.lists.RecyclerPaginatedView
    public void setAdapter(RecyclerView.Adapter adapter) {
        this.O = adapter instanceof t0i ? (t0i) adapter : null;
        super.setAdapter(adapter);
        RecyclerView recyclerView = this.x;
        if (recyclerView == null) {
            return;
        }
        q0i q0iVar = this.N;
        if (q0iVar != null) {
            recyclerView.removeItemDecoration(q0iVar);
        }
        t0i t0iVar = this.O;
        if (t0iVar == null) {
            return;
        }
        q0i q0iVar2 = new q0i(t0iVar);
        recyclerView.addItemDecoration(q0iVar2);
        this.N = q0iVar2;
    }
}
