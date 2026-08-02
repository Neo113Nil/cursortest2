package com.mbridge.msdk.mbnative.cache;

import com.mbridge.msdk.out.Campaign;
import com.mbridge.msdk.setting.g;
import com.mbridge.msdk.setting.i;
import xsna.wga0;

/* compiled from: AbsNativeCache.java */
/* loaded from: classes13.dex */
public abstract class b<K, V> {
    public long a() {
        g a = wga0.a(i.b());
        if (a == null) {
            a = i.b().a();
        }
        return a.c0() * 1000;
    }

    public abstract V a(K k, int i);

    public abstract void a(K k, V v);

    public abstract void a(K k, V v, String str);

    public abstract void a(String str, Campaign campaign, String str2);

    public V b(K k, int i) {
        return null;
    }

    public long b() {
        g a = wga0.a(i.b());
        if (a == null) {
            a = i.b().a();
        }
        return a.d0() * 1000;
    }
}
