package zl0;

import android.content.ComponentName;
import android.content.pm.ResolveInfo;
import android.content.pm.ServiceInfo;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: zl0.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C11150a {
    public static final ComponentName a(@NotNull List<? extends ResolveInfo> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter(list, "<this>");
        Intrinsics.checkNotNullParameter("ru.vk.store", "releasePackage");
        Intrinsics.checkNotNullParameter("ru.vk.store.qa", "debugPackage");
        List<? extends ResolveInfo> list2 = list;
        int h11 = U.h(C7714v.z(list2, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (ResolveInfo resolveInfo : list2) {
            Pair pair = new Pair(resolveInfo.serviceInfo.packageName, resolveInfo);
            linkedHashMap.put(pair.e(), pair.f());
        }
        ResolveInfo resolveInfo2 = (ResolveInfo) linkedHashMap.get("ru.vk.store.qa");
        if (resolveInfo2 == null) {
            resolveInfo2 = (ResolveInfo) linkedHashMap.get("ru.vk.store");
        }
        if (resolveInfo2 == null) {
            return null;
        }
        ServiceInfo serviceInfo = resolveInfo2.serviceInfo;
        return new ComponentName(serviceInfo.packageName, serviceInfo.name);
    }
}
