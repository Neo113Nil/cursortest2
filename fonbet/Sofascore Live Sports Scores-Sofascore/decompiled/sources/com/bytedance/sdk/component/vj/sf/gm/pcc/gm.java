package com.bytedance.sdk.component.vj.sf.gm.pcc;

import java.lang.ref.SoftReference;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gm<K, V> {
    private final LinkedHashMap<K, SoftReference<V>> pcc = new LinkedHashMap<>(0, 0.75f, true);
    private int sf;

    public gm(int i) {
        this.sf = i;
    }

    public synchronized void pcc(int i) {
        int size = this.pcc.size() - i;
        if (size > 0) {
            Iterator<Map.Entry<K, SoftReference<V>>> it = this.pcc.entrySet().iterator();
            for (int i2 = 0; i2 < size; i2++) {
                it.next();
                it.remove();
            }
        }
        if (i == 0) {
            return;
        }
        Iterator<Map.Entry<K, SoftReference<V>>> it2 = this.pcc.entrySet().iterator();
        while (it2.hasNext()) {
            if (it2.next().getValue().get() == null) {
                it2.remove();
            }
        }
    }

    public final synchronized String toString() {
        return String.format("LruCache[maxCount=%d,size=%d]", Integer.valueOf(this.sf), Integer.valueOf(this.pcc.size()));
    }

    public synchronized void pcc(K k, V v) {
        if (this.sf <= 0) {
            return;
        }
        if (k == null || v == null) {
            return;
        }
        this.pcc.put(k, new SoftReference<>(v));
        int size = this.pcc.size();
        int i = this.sf;
        if (size > i) {
            pcc((int) (i * 0.7d));
        }
    }

    public synchronized V pcc(K k) {
        V v = null;
        if (k == null) {
            return null;
        }
        if (this.sf <= 0) {
            return null;
        }
        SoftReference<V> softReference = this.pcc.get(k);
        if (softReference != null) {
            v = softReference.get();
            if (v != null) {
                return v;
            }
            this.pcc.remove(k);
        }
        return v;
    }
}
