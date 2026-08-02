package com.vungle.ads.internal.persistence;

import com.vungle.ads.internal.executor.j;
import com.vungle.ads.internal.util.PathProvider;
import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a {
    public final synchronized FilePreferences a(j jVar, PathProvider pathProvider, String str) {
        ConcurrentHashMap concurrentHashMap;
        Object obj;
        Object putIfAbsent;
        try {
            jVar.getClass();
            pathProvider.getClass();
            str.getClass();
            concurrentHashMap = FilePreferences.e;
            obj = concurrentHashMap.get(str);
            if (obj == null && (putIfAbsent = concurrentHashMap.putIfAbsent(str, (obj = new FilePreferences(jVar, pathProvider, str, 0)))) != null) {
                obj = putIfAbsent;
            }
        } catch (Throwable th) {
            throw th;
        }
        return (FilePreferences) obj;
    }
}
