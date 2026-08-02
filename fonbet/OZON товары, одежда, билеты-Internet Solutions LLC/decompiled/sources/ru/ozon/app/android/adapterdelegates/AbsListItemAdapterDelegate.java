package ru.ozon.app.android.adapterdelegates;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.RecyclerView.C;
import java.util.List;

/* loaded from: classes11.dex */
public abstract class AbsListItemAdapterDelegate<I extends T, T, VH extends RecyclerView.C> extends AdapterDelegate<List<T>> {
    protected abstract boolean isForViewType(@NonNull T t2, @NonNull List<T> list, int i11);

    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    protected /* bridge */ /* synthetic */ void onBindViewHolder(@NonNull Object obj, int i11, @NonNull RecyclerView.C c11, @NonNull List list) {
        onBindViewHolder((List) obj, i11, c11, (List<Object>) list);
    }

    protected abstract void onBindViewHolder(@NonNull I i11, @NonNull VH vh2, @NonNull List<Object> list);

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.app.android.adapterdelegates.AdapterDelegate
    public final boolean isForViewType(@NonNull List<T> list, int i11) {
        return isForViewType(list.get(i11), list, i11);
    }

    protected final void onBindViewHolder(@NonNull List<T> list, int i11, @NonNull RecyclerView.C c11, @NonNull List<Object> list2) {
        onBindViewHolder(list.get(i11), c11, list2);
    }
}
