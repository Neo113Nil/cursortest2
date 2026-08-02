package ru.ozon.app.android.pdp.utils;

import java.util.Collection;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0010\u000b\n\u0002\b\u0003\u001a\u001f\u0010\u0003\u001a\u00020\u0002\"\u0004\b\u0000\u0010\u0000*\n\u0012\u0004\u0012\u00028\u0000\u0018\u00010\u0001¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"T", "", "", "isNotNullOrEmpty", "(Ljava/util/Collection;)Z", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class CollectionsExtKt {
    public static final <T> boolean isNotNullOrEmpty(Collection<? extends T> collection) {
        return !(collection == null || collection.isEmpty());
    }
}
