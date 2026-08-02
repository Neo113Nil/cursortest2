package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4492p8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* loaded from: classes13.dex */
public class U4 {
    private final Map<String, T4> a = new LinkedHashMap();
    private final Map<String, T4> b = new LinkedHashMap();
    private final Map<String, T4> c = new LinkedHashMap();

    private Map<String, T4> b(C4492p8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C4492p8.e.RewardedVideo.name())) {
            return this.a;
        }
        if (eVar.name().equalsIgnoreCase(C4492p8.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(C4492p8.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public Collection<T4> a(C4492p8.e eVar) {
        Map<String, T4> b = b(eVar);
        return b != null ? b.values() : new ArrayList();
    }

    public T4 a(C4492p8.e eVar, String str) {
        Map<String, T4> b;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null) {
            return null;
        }
        return b.get(str);
    }

    private void a(C4492p8.e eVar, String str, T4 t4) {
        Map<String, T4> b;
        if (TextUtils.isEmpty(str) || t4 == null || (b = b(eVar)) == null) {
            return;
        }
        b.put(str, t4);
    }

    public void b(C4492p8.e eVar, String str) {
        Map<String, T4> b;
        T4 remove;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null || (remove = b.remove(str)) == null) {
            return;
        }
        remove.a();
    }

    public T4 a(C4492p8.e eVar, K9 k9) {
        T4 t4 = new T4(k9);
        a(eVar, k9.e(), t4);
        return t4;
    }

    public T4 a(C4492p8.e eVar, String str, Map<String, String> map, Hc hc) {
        T4 t4 = new T4(str, str, map, hc);
        a(eVar, str, t4);
        return t4;
    }
}
