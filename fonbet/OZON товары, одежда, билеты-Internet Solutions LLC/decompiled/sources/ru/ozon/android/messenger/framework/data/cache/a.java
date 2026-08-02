package ru.ozon.android.messenger.framework.data.cache;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.remote.models.items.ItemDTO;

/* loaded from: classes6.dex */
public final class a {
    @NotNull
    public static List a(@NotNull ArrayList itemsFromCache, @NotNull List itemsFromResponse, boolean z11) {
        Intrinsics.checkNotNullParameter(itemsFromCache, "itemsFromCache");
        Intrinsics.checkNotNullParameter(itemsFromResponse, "itemsFromResponse");
        if (itemsFromCache.isEmpty()) {
            return itemsFromResponse;
        }
        if (itemsFromResponse.isEmpty()) {
            return itemsFromCache;
        }
        Tc.b builder = C7714v.B();
        HashSet hashSet = new HashSet();
        Iterator it = itemsFromResponse.iterator();
        while (it.hasNext()) {
            hashSet.add(((ItemDTO) it.next()).getId());
        }
        double orderBy = ((ItemDTO) C7714v.K(itemsFromResponse)).getOrderBy();
        double orderBy2 = ((ItemDTO) C7714v.X(itemsFromResponse)).getOrderBy();
        Iterator it2 = itemsFromCache.iterator();
        boolean z12 = false;
        while (it2.hasNext()) {
            ItemDTO itemDTO = (ItemDTO) it2.next();
            if (z11) {
                if (!hashSet.contains(itemDTO.getId()) && (itemDTO.getOrderBy() < orderBy || itemDTO.getOrderBy() > orderBy2)) {
                    if (!z12 && itemDTO.getOrderBy() > orderBy2) {
                        builder.addAll(itemsFromResponse);
                        z12 = true;
                    }
                    builder.add(itemDTO);
                } else if (!z12 && itemDTO.getOrderBy() < orderBy) {
                    builder.addAll(itemsFromResponse);
                    z12 = true;
                }
            } else if (!hashSet.contains(itemDTO.getId()) && (itemDTO.getOrderBy() > orderBy || itemDTO.getOrderBy() < orderBy2)) {
                if (!z12 && itemDTO.getOrderBy() < orderBy2) {
                    builder.addAll(itemsFromResponse);
                    z12 = true;
                }
                builder.add(itemDTO);
            } else if (!z12 && itemDTO.getOrderBy() > orderBy2) {
                builder.addAll(itemsFromResponse);
                z12 = true;
            }
        }
        if (!z12) {
            builder.addAll(itemsFromResponse);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        return builder.B();
    }
}
