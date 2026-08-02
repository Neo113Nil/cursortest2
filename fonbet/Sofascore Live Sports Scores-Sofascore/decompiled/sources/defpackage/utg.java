package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class utg extends t01 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable R(int i, nkk nkkVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(nkkVar.m()));
        }
        if (i == 1) {
            return Boolean.valueOf(nkkVar.s() == 1);
        }
        if (i == 2) {
            return T(nkkVar);
        }
        if (i != 3) {
            if (i == 8) {
                return S(nkkVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(nkkVar.m()));
                nkkVar.F(2);
                return date;
            }
            int v = nkkVar.v();
            ArrayList arrayList = new ArrayList(v);
            for (int i2 = 0; i2 < v; i2++) {
                Serializable R = R(nkkVar.s(), nkkVar);
                if (R != null) {
                    arrayList.add(R);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String T = T(nkkVar);
            int s = nkkVar.s();
            if (s == 9) {
                return hashMap;
            }
            Serializable R2 = R(s, nkkVar);
            if (R2 != null) {
                hashMap.put(T, R2);
            }
        }
    }

    public static HashMap S(nkk nkkVar) {
        int v = nkkVar.v();
        HashMap hashMap = new HashMap(v);
        for (int i = 0; i < v; i++) {
            String T = T(nkkVar);
            Serializable R = R(nkkVar.s(), nkkVar);
            if (R != null) {
                hashMap.put(T, R);
            }
        }
        return hashMap;
    }

    public static String T(nkk nkkVar) {
        int x = nkkVar.x();
        int i = nkkVar.b;
        nkkVar.F(x);
        return new String(nkkVar.a, i, x);
    }
}
