package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import defpackage.w1l;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class b<K, V> {
    public long a() {
        g e = w1l.e(i.b());
        if (e == null) {
            e = i.b().a();
        }
        return e.c0() * 1000;
    }

    public abstract V a(K k, int i);

    public abstract void a(K k, V v);

    public abstract void a(K k, V v, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public long b() {
        g e = w1l.e(i.b());
        if (e == null) {
            e = i.b().a();
        }
        return e.d0() * 1000;
    }

    public V b(K k, int i) {
        return null;
    }
}
