package ru.ozon.app.android.adapterdelegates;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.C5470d;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.i;
import java.util.List;

/* loaded from: classes11.dex */
public class AsyncListDifferDelegationAdapter<T> extends RecyclerView.g {
    protected final AdapterDelegatesManager<List<T>> delegatesManager;
    protected final C5470d<T> differ;

    public AsyncListDifferDelegationAdapter(@NonNull i.d<T> dVar) {
        this(dVar, new AdapterDelegatesManager());
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        return this.differ.b().size();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemViewType(int i11) {
        return this.delegatesManager.getItemViewType(this.differ.b(), i11);
    }

    public List<T> getItems() {
        return this.differ.b();
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NonNull RecyclerView.C c11, int i11) {
        this.delegatesManager.onBindViewHolder(this.differ.b(), i11, c11, null);
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

    public void setItems(List<T> list) {
        this.differ.e(list, null);
    }

    public AsyncListDifferDelegationAdapter(@NonNull i.d<T> dVar, @NonNull AdapterDelegatesManager<List<T>> adapterDelegatesManager) {
        if (dVar == null) {
            throw new NullPointerException("ItemCallback is null");
        }
        if (adapterDelegatesManager == null) {
            throw new NullPointerException("AdapterDelegatesManager is null");
        }
        this.differ = new C5470d<>(this, dVar);
        this.delegatesManager = adapterDelegatesManager;
    }

    @Override // androidx.recyclerview.widget.RecyclerView.g
    public void onBindViewHolder(@NonNull RecyclerView.C c11, int i11, @NonNull List list) {
        this.delegatesManager.onBindViewHolder(this.differ.b(), i11, c11, list);
    }

    public void setItems(List<T> list, Runnable runnable) {
        this.differ.e(list, runnable);
    }
}
