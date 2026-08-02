package defpackage;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vtg extends t01 {
    public long c;
    public long[] d;
    public long[] e;

    public static Serializable R(int i, j9e j9eVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(j9eVar.u()));
        }
        if (i == 1) {
            return Boolean.valueOf(j9eVar.A() == 1);
        }
        if (i == 2) {
            return T(j9eVar);
        }
        if (i != 3) {
            if (i == 8) {
                return S(j9eVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(j9eVar.u()));
                j9eVar.O(2);
                return date;
            }
            int E = j9eVar.E();
            ArrayList arrayList = new ArrayList(E);
            for (int i2 = 0; i2 < E; i2++) {
                Serializable R = R(j9eVar.A(), j9eVar);
                if (R != null) {
                    arrayList.add(R);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String T = T(j9eVar);
            int A = j9eVar.A();
            if (A == 9) {
                return hashMap;
            }
            Serializable R2 = R(A, j9eVar);
            if (R2 != null) {
                hashMap.put(T, R2);
            }
        }
    }

    public static HashMap S(j9e j9eVar) {
        int E = j9eVar.E();
        HashMap hashMap = new HashMap(E);
        for (int i = 0; i < E; i++) {
            String T = T(j9eVar);
            Serializable R = R(j9eVar.A(), j9eVar);
            if (R != null) {
                hashMap.put(T, R);
            }
        }
        return hashMap;
    }

    public static String T(j9e j9eVar) {
        int H = j9eVar.H();
        int i = j9eVar.b;
        j9eVar.O(H);
        return new String(j9eVar.a, i, H);
    }
}
