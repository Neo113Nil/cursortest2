package ru.ozon.app.android.adapterdelegates;

import java.util.List;

/* loaded from: classes11.dex */
public class ListDelegationAdapter<T extends List<?>> extends AbsDelegationAdapter<T> {
    @Override // androidx.recyclerview.widget.RecyclerView.g
    public int getItemCount() {
        T t2 = this.items;
        if (t2 == 0) {
            return 0;
        }
        return ((List) t2).size();
    }
}
