package com.bytedance.adsdk.sf;

import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class tmg<V> {
    private final V pcc;
    private final Throwable sf;

    public tmg(V v) {
        this.pcc = v;
        this.sf = null;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tmg)) {
            return false;
        }
        tmg tmgVar = (tmg) obj;
        if (pcc() != null && pcc().equals(tmgVar.pcc())) {
            return true;
        }
        if (sf() == null || tmgVar.sf() == null) {
            return false;
        }
        return sf().toString().equals(sf().toString());
    }

    public int hashCode() {
        return Arrays.hashCode(new Object[]{pcc(), sf()});
    }

    public V pcc() {
        return this.pcc;
    }

    public Throwable sf() {
        return this.sf;
    }

    public tmg(Throwable th) {
        this.sf = th;
        this.pcc = null;
    }
}
