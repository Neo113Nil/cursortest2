package com.ironsource;

import android.text.TextUtils;
import com.ironsource.C4197m8;
import java.util.ArrayList;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class R4 {
    private final Map<String, Q4> a = new LinkedHashMap();
    private final Map<String, Q4> b = new LinkedHashMap();
    private final Map<String, Q4> c = new LinkedHashMap();

    private Map<String, Q4> b(C4197m8.e eVar) {
        if (eVar.name().equalsIgnoreCase(C4197m8.e.RewardedVideo.name())) {
            return this.a;
        }
        if (eVar.name().equalsIgnoreCase(C4197m8.e.Interstitial.name())) {
            return this.b;
        }
        if (eVar.name().equalsIgnoreCase(C4197m8.e.Banner.name())) {
            return this.c;
        }
        return null;
    }

    public Q4 a(C4197m8.e eVar, String str) {
        Map<String, Q4> b;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null) {
            return null;
        }
        return b.get(str);
    }

    public Collection<Q4> a(C4197m8.e eVar) {
        Map<String, Q4> b = b(eVar);
        if (b != null) {
            return b.values();
        }
        return new ArrayList();
    }

    private void a(C4197m8.e eVar, String str, Q4 q4) {
        Map<String, Q4> b;
        if (TextUtils.isEmpty(str) || q4 == null || (b = b(eVar)) == null) {
            return;
        }
        b.put(str, q4);
    }

    public Q4 a(C4197m8.e eVar, J9 j9) {
        Q4 q4 = new Q4(j9);
        a(eVar, j9.e(), q4);
        return q4;
    }

    public Q4 a(C4197m8.e eVar, String str, Map<String, String> map, Gc gc) {
        Q4 q4 = new Q4(str, str, map, gc);
        a(eVar, str, q4);
        return q4;
    }

    public void b(C4197m8.e eVar, String str) {
        Map<String, Q4> b;
        Q4 remove;
        if (TextUtils.isEmpty(str) || (b = b(eVar)) == null || (remove = b.remove(str)) == null) {
            return;
        }
        remove.a();
    }
}
