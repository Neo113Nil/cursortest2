package com.mbridge.msdk.config.dynamic.binddata.wrapper;

import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.mn0;
import defpackage.zol;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    private final ConcurrentHashMap<String, CopyOnWriteArrayList<b<String>>> a = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, Object> b = new ConcurrentHashMap<>();

    private void a(String str, Object obj, String str2) {
        CopyOnWriteArrayList<b<String>> copyOnWriteArrayList;
        if (this.a.containsKey(str) && (copyOnWriteArrayList = this.a.get(str)) != null) {
            for (b<String> bVar : copyOnWriteArrayList) {
                if (bVar instanceof d) {
                    d dVar = (d) bVar;
                    View a = dVar.a();
                    if (a == null) {
                        bVar.a(str, obj);
                    } else if (Looper.myLooper() == Looper.getMainLooper()) {
                        bVar.a(str, obj);
                    } else {
                        a.post(new zol(dVar, str, obj, false, 1));
                    }
                } else {
                    bVar.a(str, obj);
                }
            }
        }
    }

    public void b(String str, b<String> bVar) {
        try {
            a(str, bVar);
        } catch (Exception e) {
            q0.b("ObservableMap", "Failed to pre-register map observer: " + e.getMessage(), e);
        }
    }

    @Nullable
    public Object c(@Nullable Object obj) {
        return this.b.remove(obj);
    }

    public boolean d() {
        return this.b.isEmpty();
    }

    @NonNull
    public Set<String> e() {
        return this.b.keySet();
    }

    public int f() {
        return this.b.size();
    }

    @NonNull
    public Collection<Object> g() {
        return this.b.values();
    }

    @NonNull
    public String toString() {
        return this.b.toString();
    }

    public Map<String, CopyOnWriteArrayList<b<String>>> c() {
        return this.a;
    }

    public Map<String, Object> b() {
        return this.b;
    }

    public void b(Map<String, CopyOnWriteArrayList<b<String>>> map) {
        this.a.clear();
        this.a.putAll(map);
    }

    @Nullable
    public Object b(@Nullable Object obj) {
        return this.b.get(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ CopyOnWriteArrayList a(String str) {
        return new CopyOnWriteArrayList();
    }

    public boolean a(@Nullable Object obj) {
        return this.b.containsKey(obj);
    }

    @NonNull
    public Set<Map.Entry<String, Object>> a() {
        return this.b.entrySet();
    }

    public void a(@NonNull Map<? extends String, ?> map) {
        for (Map.Entry<? extends String, ?> entry : map.entrySet()) {
            a(entry.getKey(), entry.getValue());
        }
    }

    public Integer a(String str, Object obj) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        try {
            this.b.put(str, obj);
            a(str, obj, str);
            return 1;
        } catch (Exception e) {
            q0.b("ObservableMap", e.getMessage(), e);
            return 0;
        }
    }

    public Integer a(String str, String str2, Object obj) {
        if (TextUtils.isEmpty(str2)) {
            return 0;
        }
        try {
            this.b.put(str2, obj);
            a(str, obj, str2);
            return 1;
        } catch (Exception e) {
            q0.b("ObservableMap", "Failed to notify map observers: " + e.getMessage(), e);
            return 0;
        }
    }

    public void a(String str, b<String> bVar) {
        try {
            this.a.computeIfAbsent(str, new mn0(6)).addIfAbsent(bVar);
        } catch (Exception e) {
            q0.b("ObservableMap", "Failed to add map observer: " + e.getMessage(), e);
        }
    }
}
