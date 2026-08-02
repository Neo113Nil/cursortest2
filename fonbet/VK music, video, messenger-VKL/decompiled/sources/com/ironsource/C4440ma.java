package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.ma, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public class C4440ma {
    private static C4440ma c;
    private final HashSet<ImpressionDataListener> a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    public static synchronized C4440ma b() {
        C4440ma c4440ma;
        synchronized (C4440ma.class) {
            try {
                if (c == null) {
                    c = new C4440ma();
                }
                c4440ma = c;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c4440ma;
    }

    public HashSet<ImpressionDataListener> a() {
        return this.a;
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public void a(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }
}
