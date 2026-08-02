package com.bytedance.adsdk.sf;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.yhk;
import defpackage.zzl;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class gbb<K, V> {
    private int gm;
    private int kj;
    private int oo;
    private final LinkedHashMap<K, V> pcc;
    private int qf;
    private int sf;
    private int vj;
    private int wh;

    public gbb(int i) {
        if (i <= 0) {
            a70.p("maxSize <= 0");
            throw null;
        }
        this.gm = i;
        this.pcc = new LinkedHashMap<>(0, 0.75f, true);
    }

    private int gm(K k, V v) {
        int sf = sf(k, v);
        if (sf >= 0) {
            return sf;
        }
        zzl.l("Negative size: ", k, U3.j.b, v);
        return 0;
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x006f, code lost:
    
        throw new java.lang.IllegalStateException(getClass().getName() + ".sizeOf() is reporting inconsistent results!");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void pcc(int i) {
        while (true) {
            synchronized (this) {
                try {
                    if (this.sf < 0 || (this.pcc.isEmpty() && this.sf != 0)) {
                        break;
                    }
                    if (this.sf <= i || this.pcc.isEmpty()) {
                        break;
                    }
                    Map.Entry<K, V> next = this.pcc.entrySet().iterator().next();
                    K key = next.getKey();
                    V value = next.getValue();
                    this.pcc.remove(key);
                    this.sf -= gm(key, value);
                    this.wh++;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public int sf(K k, V v) {
        return 1;
    }

    public final synchronized String toString() {
        int i;
        try {
            int i2 = this.qf;
            int i3 = this.kj + i2;
            i = i3 != 0 ? (i2 * 100) / i3 : 0;
            Locale locale = Locale.US;
        } catch (Throwable th) {
            throw th;
        }
        return "LruCache[maxSize=" + this.gm + ",hits=" + this.qf + ",misses=" + this.kj + ",hitRate=" + i + "%]";
    }

    public V sf(K k) {
        return null;
    }

    public final V pcc(K k, V v) {
        V put;
        if (k != null && v != null) {
            synchronized (this) {
                try {
                    this.oo++;
                    this.sf += gm(k, v);
                    put = this.pcc.put(k, v);
                    if (put != null) {
                        this.sf -= gm(k, put);
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            pcc(this.gm);
            return put;
        }
        yhk.s("key == null || value == null");
        return null;
    }

    public final V pcc(K k) {
        V put;
        if (k != null) {
            synchronized (this) {
                try {
                    V v = this.pcc.get(k);
                    if (v != null) {
                        this.qf++;
                        return v;
                    }
                    this.kj++;
                    V sf = sf(k);
                    if (sf == null) {
                        return null;
                    }
                    synchronized (this) {
                        try {
                            this.vj++;
                            put = this.pcc.put(k, sf);
                            if (put != null) {
                                this.pcc.put(k, put);
                            } else {
                                this.sf += gm(k, sf);
                            }
                        } catch (Throwable th) {
                            throw th;
                        }
                    }
                    if (put != null) {
                        return put;
                    }
                    pcc(this.gm);
                    return sf;
                } finally {
                }
            }
        }
        yhk.s("key == null");
        return null;
    }
}
