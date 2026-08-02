package ru.ozon.app.android.pdp.utils;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u001a+\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006¨\u0006\u0007"}, d2 = {"toListItem", "Lru/ozon/app/android/pdp/utils/ListItemHolder;", "T", "", "id", "", "(Ljava/lang/Object;Ljava/lang/Long;)Lru/ozon/app/android/pdp/utils/ListItemHolder;", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ListItemsAdapterKt {
    @NotNull
    public static final <T> ListItemHolder<T> toListItem(@NotNull Object obj, Long l11) {
        Intrinsics.checkNotNullParameter(obj, "<this>");
        return new ListItemHolder<>(l11, obj);
    }
}
