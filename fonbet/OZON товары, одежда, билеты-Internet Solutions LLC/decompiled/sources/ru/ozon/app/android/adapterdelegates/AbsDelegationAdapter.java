package ru.ozon.app.android.adapterdelegates;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class AbsDelegationAdapter<T> extends RecyclerView.g {
    protected AdapterDelegatesManager<T> delegatesManager;
    protected T items;

    public AbsDelegationAdapter() {
        this(new AdapterDelegatesManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int i11) {
        return this.delegatesManager.getItemViewType(this.items, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NonNull RecyclerView.C c11, int i11) {
        this.delegatesManager.onBindViewHolder(this.items, i11, c11, null);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    @NonNull
    public RecyclerView.C onCreateViewHolder(@NonNull ViewGroup viewGroup, int i11) {
        return this.delegatesManager.onCreateViewHolder(viewGroup, i11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public boolean onFailedToRecycleView(@NonNull RecyclerView.C c11) {
        return this.delegatesManager.onFailedToRecycleView(c11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewAttachedToWindow(@NonNull RecyclerView.C c11) {
        this.delegatesManager.onViewAttachedToWindow(c11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewDetachedFromWindow(@NonNull RecyclerView.C c11) {
        this.delegatesManager.onViewDetachedFromWindow(c11);
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onViewRecycled(@NonNull RecyclerView.C c11) {
        this.delegatesManager.onViewRecycled(c11);
    }

    public void setItems(T t2) {
        this.items = t2;
    }

    public AbsDelegationAdapter(@NonNull AdapterDelegatesManager<T> adapterDelegatesManager) {
        if (adapterDelegatesManager == null) {
            throw new NullPointerException("AdapterDelegatesManager is null");
        }
        this.delegatesManager = adapterDelegatesManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NonNull RecyclerView.C c11, int i11, @NonNull List list) {
        this.delegatesManager.onBindViewHolder(this.items, i11, c11, list);
    }
}
