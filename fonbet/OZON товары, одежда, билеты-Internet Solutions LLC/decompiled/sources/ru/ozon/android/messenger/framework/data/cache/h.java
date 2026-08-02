package ru.ozon.android.messenger.framework.data.cache;

import java.util.Comparator;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

/* loaded from: classes10.dex */
public final class h<T> implements Comparator {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.Comparator
    public final int compare(T t2, T t11) {
        return Vc.a.b(Double.valueOf(((ItemDTO) t2).getOrderBy()), Double.valueOf(((ItemDTO) t11).getOrderBy()));
    }
}
