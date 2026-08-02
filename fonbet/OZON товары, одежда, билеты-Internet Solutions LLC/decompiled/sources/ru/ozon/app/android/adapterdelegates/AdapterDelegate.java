package ru.ozon.app.android.adapterdelegates;

import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class AdapterDelegate<T> {
    protected abstract boolean isForViewType(@NonNull T t2, int i11);

    protected abstract void onBindViewHolder(@NonNull T t2, int i11, @NonNull RecyclerView.C c11, @NonNull List<Object> list);

    @NonNull
    protected abstract RecyclerView.C onCreateViewHolder(@NonNull ViewGroup viewGroup);

    protected boolean onFailedToRecycleView(@NonNull RecyclerView.C c11) {
        return false;
    }

    protected void onViewAttachedToWindow(@NonNull RecyclerView.C c11) {
    }

    protected void onViewDetachedFromWindow(@NonNull RecyclerView.C c11) {
    }

    protected void onViewRecycled(@NonNull RecyclerView.C c11) {
    }
}
