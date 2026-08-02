package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C2578o8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public class U4 {
    private final Map<String, T4> a = new LinkedHashMap();
    private final Map<String, T4> b = new LinkedHashMap();
    private final Map<String, T4> c = new LinkedHashMap();

    private Map<String, T4> b(C2578o8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C2578o8.e.RewardedVideo.name())) {
            return this.a;
        }
        if (eVar.name().equalsIgnoreCase(C2578o8.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(C2578o8.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public Collection<T4> a(C2578o8.e eVar) {
        Map<String, T4> b = b(eVar);
        return b != null ? b.values() : new ArrayList();
    }

    public T4 a(C2578o8.e eVar, String str) {
        Map<String, T4> b;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null) {
            return null;
        }
        return b.get(str);
    }

    public void b(C2578o8.e eVar, String str) {
        Map<String, T4> b;
        T4 remove;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null || (remove = b.remove(str)) == null) {
            return;
        }
        remove.a();
    }

    private void a(C2578o8.e eVar, String str, T4 t4) {
        Map<String, T4> b;
        if (TextUtils.isEmpty(str) || t4 == null || (b = b(eVar)) == null) {
            return;
        }
        b.put(str, t4);
    }

    public T4 a(C2578o8.e eVar, J9 j9) {
        T4 t4 = new T4(j9);
        a(eVar, j9.e(), t4);
        return t4;
    }

    public T4 a(C2578o8.e eVar, String str, Map<String, String> map, Gc gc) {
        T4 t4 = new T4(str, str, map, gc);
        a(eVar, str, t4);
        return t4;
    }
}
