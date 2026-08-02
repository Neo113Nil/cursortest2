package org.chromium.net;

import android.net.TrafficStats;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* loaded from: classes10.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    private static final Method f78962a;

    /* renamed from: b, reason: collision with root package name */
    private static final Method f78963b;

    static {
        try {
            f78962a = TrafficStats.class.getMethod("setThreadStatsUid", Integer.TYPE);
            f78963b = TrafficStats.class.getMethod("clearThreadStatsUid", new Class[0]);
        } catch (NoSuchMethodException | SecurityException e11) {
            throw new RuntimeException("Unable to get TrafficStats methods", e11);
        }
    }

    public static void a() {
        try {
            f78963b.invoke(null, new Object[0]);
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("TrafficStats.clearThreadStatsUid failed", e12);
        }
    }

    public static void b(int i11) {
        try {
            f78962a.invoke(null, Integer.valueOf(i11));
        } catch (IllegalAccessException e11) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e11);
        } catch (InvocationTargetException e12) {
            throw new RuntimeException("TrafficStats.setThreadStatsUid failed", e12);
        }
    }
}
