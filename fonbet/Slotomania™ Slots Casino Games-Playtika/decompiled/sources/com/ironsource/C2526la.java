package com.ironsource;

import com.ironsource.mediationsdk.impressionData.ImpressionDataListener;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/* renamed from: com.ironsource.la, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public class C2526la {
    private static C2526la c;
    private final HashSet<ImpressionDataListener> a = new HashSet<>();
    private ConcurrentHashMap<String, List<String>> b = new ConcurrentHashMap<>();

    C2526la() {
    }

    public static synchronized C2526la b() {
        C2526la c2526la;
        synchronized (C2526la.class) {
            if (c == null) {
                c = new C2526la();
            }
            c2526la = c;
        }
        return c2526la;
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

    public void a(String str, List<String> list) {
        this.b.put(str, list);
    }

    public void b(ImpressionDataListener impressionDataListener) {
        synchronized (this) {
            this.a.remove(impressionDataListener);
        }
    }
}
