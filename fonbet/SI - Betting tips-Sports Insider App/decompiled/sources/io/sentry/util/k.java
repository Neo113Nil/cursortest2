package io.sentry.util;

import io.sentry.f0;
import j$.util.concurrent.ConcurrentHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class k {

    /* renamed from: a, reason: collision with root package name */
    public static final ConcurrentHashMap f17170a = new ConcurrentHashMap();

    public static boolean a(String str, List list) {
        Pattern pattern;
        if (str != null && list != null && !list.isEmpty()) {
            ConcurrentHashMap concurrentHashMap = f17170a;
            if (concurrentHashMap.containsKey(str)) {
                return ((Boolean) concurrentHashMap.get(str)).booleanValue();
            }
            Iterator it = list.iterator();
            while (it.hasNext()) {
                if (((f0) it.next()).f16391a.equalsIgnoreCase(str)) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
            }
            Iterator it2 = list.iterator();
            while (it2.hasNext()) {
                try {
                    pattern = ((f0) it2.next()).f16392b;
                } catch (Throwable unused) {
                }
                if (pattern == null ? false : pattern.matcher(str).matches()) {
                    concurrentHashMap.put(str, Boolean.TRUE);
                    return true;
                }
                continue;
            }
            concurrentHashMap.put(str, Boolean.FALSE);
        }
        return false;
    }
}
