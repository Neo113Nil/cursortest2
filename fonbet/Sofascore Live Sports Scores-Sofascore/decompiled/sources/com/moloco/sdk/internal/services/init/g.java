package com.moloco.sdk.internal.services.init;

import android.content.SharedPreferences;
import com.moloco.sdk.internal.MolocoLogger;
import defpackage.dmi;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class g {
    public final SharedPreferences a;
    public final CoroutineContext b;

    public g(SharedPreferences sharedPreferences, CoroutineContext coroutineContext) {
        coroutineContext.getClass();
        this.a = sharedPreferences;
        this.b = coroutineContext;
    }

    public static void a(a aVar, SharedPreferences sharedPreferences) {
        List split$default;
        MolocoLogger molocoLogger = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Performing migration for cache key: ".concat(aVar.a()), null, false, 12, null);
        String a = aVar.a();
        String str = aVar.a;
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Migrating from v0 to v1 for cache key: ".concat(a), null, false, 12, null);
        MolocoLogger.info$default(molocoLogger, "InitCacheImpl", "Total keys in cache: " + sharedPreferences.getAll().size(), null, false, 12, null);
        Map<String, ?> all = sharedPreferences.getAll();
        all.getClass();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry<String, ?> entry : all.entrySet()) {
            String key = entry.getKey();
            key.getClass();
            split$default = StringsKt__StringsKt.split$default(key, new String[]{"___"}, false, 0, 6, null);
            if (Intrinsics.c(CollectionsKt.firstOrNull(split$default), str) && Intrinsics.c(CollectionsKt.j0(split$default), "v0")) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        MolocoLogger molocoLogger2 = MolocoLogger.INSTANCE;
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Number of existing V0 keys in cache: " + linkedHashMap.size(), null, false, 12, null);
        if (linkedHashMap.isEmpty()) {
            MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", dmi.q("No v0 cache keys found for migration for appKey: ", str), null, false, 12, null);
            return;
        }
        MolocoLogger.info$default(molocoLogger2, "InitCacheImpl", "Found v0 cache key: " + ((String) CollectionsKt.X(linkedHashMap.keySet())) + ", migrating to new key: " + aVar.a(), null, false, 12, null);
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        String a2 = aVar.a();
        Object X = CollectionsKt.X(linkedHashMap.values());
        edit.putString(a2, X instanceof String ? (String) X : null);
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            edit.remove((String) ((Map.Entry) it.next()).getKey());
        }
        edit.commit();
    }
}
