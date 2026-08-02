package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C4181la {
    private static C4181la c;
    private final HashSet<ImpressionDataListener> a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    public static synchronized C4181la b() {
        C4181la c4181la;
        synchronized (C4181la.class) {
            c4181la = c;
            if (c4181la == null) {
                c4181la = new C4181la();
                c = c4181la;
            }
        }
        return c4181la;
    }

    public void a(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.add(impressionDataListener);
        }
    }

    public ConcurrentHashMap<String, List<String>> c() {
        return this.b;
    }

    public void d() {
        synchronized (this) {
            this.a.clear();
        }
    }

    public HashSet<ImpressionDataListener> a() {
        return this.a;
    }

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(@NotNull ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }
}
