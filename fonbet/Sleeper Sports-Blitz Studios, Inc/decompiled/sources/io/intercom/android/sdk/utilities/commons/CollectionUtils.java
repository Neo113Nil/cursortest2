package io.intercom.android.sdk.utilities.commons;

import java.util.Collection;

/* loaded from: classes9.dex */
public class CollectionUtils {
    public static int capacityFor(Collection<?> collection) {
        if (collection == null) {
            return 0;
        }
        return collection.size();
    }
}
