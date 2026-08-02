package ru.ozon.app.android.travel.utils.extensions;

import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0004\u001a6\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001*\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00040\u00032\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u0001\u001a<\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0003*\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00032\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0003¨\u0006\b"}, d2 = {"mapAsStringMapTo", "", "", "", "", "destination", "combineWith", "other", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MapExtensionsKt {
    public static final Map<String, String> combineWith(Map<String, String> map, Map<String, ? extends Object> map2) {
        if (map2 == null) {
            return map;
        }
        LinkedHashMap u11 = map != null ? U.u(map) : new LinkedHashMap();
        mapAsStringMapTo(map2, u11);
        return u11;
    }

    @NotNull
    public static final Map<String, String> mapAsStringMapTo(@NotNull Map<String, ? extends Object> map, @NotNull Map<String, String> destination) {
        Intrinsics.checkNotNullParameter(map, "<this>");
        Intrinsics.checkNotNullParameter(destination, "destination");
        for (Map.Entry<String, ? extends Object> entry : map.entrySet()) {
            destination.put(entry.getKey(), entry.getValue().toString());
        }
        return destination;
    }
}
