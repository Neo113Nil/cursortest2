package com.vk.topics.impl.fragments;

import android.view.ViewGroup;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.topics.impl.fragments.c;
import java.util.ArrayList;
import me.grishka.appkit.views.UsableRecyclerView;
import xsna.ii7;
import xsna.mf7;

/* compiled from: TopicListAdapter.kt */
/* loaded from: classes6.dex */
public final class d extends UsableRecyclerView.c<c> implements mf7 {
    public final ArrayList<ii7> c;
    public final c.d d;

    public d(ArrayList<ii7> arrayList, c.d dVar) {
        this.c = arrayList;
        this.d = dVar;
    }

    @Override // xsna.mf7
    public final int e0(int i) {
        return 6;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final int getItemCount() {
        return this.c.size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
        ((c) e0Var).V5(this.c.get(i));
    }

    @Override // androidx.recyclerview.widget.RecyclerView.Adapter
    public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
        return new c(viewGroup.getContext(), this.d);
    }
}
