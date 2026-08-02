package com.mbridge.msdk.foundation.same.buffer;

import defpackage.a70;
import defpackage.yhk;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private final LinkedHashMap<String, JSONObject> a;
    private final int b;
    private int c;

    public a(int i) {
        if (i <= 0) {
            a70.p("maxSize <= 0");
            throw null;
        }
        this.b = i;
        this.a = new LinkedHashMap<>(0, 0.75f, true);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0074, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void a(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.c < 0 || (this.a.isEmpty() && this.c != 0)) {
                        break;
                    }
                    if (this.c <= i || this.a.isEmpty()) {
                        break;
                    }
                    Map.Entry<String, JSONObject> next = this.a.entrySet().iterator().next();
                    if (next == null) {
                        return;
                    }
                    String key = next.getKey();
                    try {
                        int b = b(key, next.getValue());
                        this.a.remove(key);
                        this.c -= b;
                    } catch (Throwable unused) {
                    }
                } finally {
                }
            }
        }
    }

    private int b(String str, JSONObject jSONObject) {
        return 1;
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxSize=%d]", Integer.valueOf(this.b));
    }

    public final JSONObject a(String str) {
        JSONObject jSONObject;
        if (str != null) {
            synchronized (this) {
                jSONObject = this.a.get(str);
            }
            return jSONObject;
        }
        yhk.s("key == null");
        return null;
    }

    public Collection<String> a() {
        HashSet hashSet;
        synchronized (this) {
            hashSet = new HashSet(this.a.keySet());
        }
        return hashSet;
    }

    public final boolean a(String str, JSONObject jSONObject) {
        if (str != null && jSONObject != null) {
            synchronized (this) {
                try {
                    this.c += b(str, jSONObject);
                    JSONObject put = this.a.put(str, jSONObject);
                    if (put != null) {
                        this.c -= b(str, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            a(this.b);
            return true;
        }
        yhk.s("key == null || value == null");
        return false;
    }
}
