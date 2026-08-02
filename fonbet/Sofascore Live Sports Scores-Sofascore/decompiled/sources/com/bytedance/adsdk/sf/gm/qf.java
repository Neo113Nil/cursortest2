package com.bytedance.adsdk.sf.gm;

import android.util.Pair;
import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class qf<T> {
    T pcc;
    T sf;

    private static boolean sf(Object obj, Object obj2) {
        if (obj != obj2) {
            return obj != null && obj.equals(obj2);
        }
        return true;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof Pair)) {
            return false;
        }
        Pair pair = (Pair) obj;
        return sf(pair.first, this.pcc) && sf(pair.second, this.sf);
    }

    public int hashCode() {
        T t = this.pcc;
        int hashCode = t == null ? 0 : t.hashCode();
        T t2 = this.sf;
        return hashCode ^ (t2 != null ? t2.hashCode() : 0);
    }

    public void pcc(T t, T t2) {
        this.pcc = t;
        this.sf = t2;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Pair{");
        sb.append(this.pcc);
        sb.append(" ");
        return mz1.n(sb, this.sf, "}");
    }
}
