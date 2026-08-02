package com.huawei.hms.utils;

import android.text.TextUtils;
import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/* loaded from: classes13.dex */
public class ResolutionFlagUtil {
    private static volatile ResolutionFlagUtil a;
    private static final Map<String, Long> b = new ConcurrentHashMap();
    private static final Object c = new Object();

    private ResolutionFlagUtil() {
    }

    private void a() {
        long time = new Timestamp(System.currentTimeMillis()).getTime() - 10800000;
        for (String str : b.keySet()) {
            Map<String, Long> map = b;
            Long l = map.get(str);
            if (l == null || l.longValue() == 0) {
                map.remove(str);
            } else if (time >= l.longValue()) {
                map.remove(str);
            }
        }
    }

    public static ResolutionFlagUtil getInstance() {
        if (a != null) {
            return a;
        }
        synchronized (c) {
            try {
                if (a == null) {
                    a = new ResolutionFlagUtil();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return a;
    }

    public long getResolutionFlag(String str) {
        if (str == null) {
            return 0L;
        }
        Map<String, Long> map = b;
        if (map.get(str) != null) {
            return map.get(str).longValue();
        }
        return 0L;
    }

    public void removeResolutionFlag(String str) {
        if (str == null) {
            return;
        }
        b.remove(str);
    }

    public void saveResolutionFlag(String str, long j) {
        if (TextUtils.isEmpty(str) || j == 0) {
            return;
        }
        a(str, j);
    }

    private void a(String str, long j) {
        Map<String, Long> map = b;
        synchronized (map) {
            a();
            map.put(str, Long.valueOf(j));
        }
    }
}
