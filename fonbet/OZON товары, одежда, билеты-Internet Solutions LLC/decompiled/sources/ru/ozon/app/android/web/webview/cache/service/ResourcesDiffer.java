package ru.ozon.app.android.web.webview.cache.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.web.webview.cache.models.BothCacheStates;
import ru.ozon.app.android.web.webview.cache.models.ResourcesDiff;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0007R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/web/webview/cache/service/ResourcesDiffer;", "", "localCacheHelper", "Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;", "<init>", "(Lru/ozon/app/android/web/webview/cache/service/LocalCacheHelper;)V", "getDiff", "Lru/ozon/app/android/web/webview/cache/models/ResourcesDiff;", "cacheStates", "Lru/ozon/app/android/web/webview/cache/models/BothCacheStates;", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ResourcesDiffer {

    @NotNull
    private final LocalCacheHelper localCacheHelper;

    public ResourcesDiffer(@NotNull LocalCacheHelper localCacheHelper) {
        Intrinsics.checkNotNullParameter(localCacheHelper, "localCacheHelper");
        this.localCacheHelper = localCacheHelper;
    }

    @NotNull
    public final ResourcesDiff getDiff(@NotNull BothCacheStates cacheStates) {
        Intrinsics.checkNotNullParameter(cacheStates, "cacheStates");
        List<String> resources = cacheStates.getRemoteCacheState().getResources();
        int h11 = U.h(C7714v.z(resources, 10));
        if (h11 < 16) {
            h11 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11);
        for (Object obj : resources) {
            linkedHashMap.put(this.localCacheHelper.getRelativePathFromResourceUrl((String) obj), obj);
        }
        Set keySet = linkedHashMap.keySet();
        List<String> resources2 = cacheStates.getLocalCacheState().getResources();
        List l02 = C7714v.l0(resources2, keySet);
        Set d11 = e0.d(keySet, resources2);
        ArrayList arrayList = new ArrayList();
        Iterator it = d11.iterator();
        while (it.hasNext()) {
            String str = (String) linkedHashMap.get((String) it.next());
            if (str != null) {
                arrayList.add(str);
            }
        }
        return new ResourcesDiff(arrayList, l02);
    }
}
