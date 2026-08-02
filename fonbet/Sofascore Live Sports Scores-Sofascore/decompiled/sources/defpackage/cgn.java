package defpackage;

import com.google.android.gms.internal.ads.zzeu;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class cgn extends t01 {
    public long c;
    public long[] d;
    public long[] e;

    public static String R(zzeu zzeuVar) {
        int J = zzeuVar.J();
        int i = zzeuVar.b;
        zzeuVar.E(J);
        return new String(zzeuVar.a, i, J);
    }

    public static HashMap S(zzeu zzeuVar) {
        int h = zzeuVar.h();
        HashMap hashMap = new HashMap(h);
        for (int i = 0; i < h; i++) {
            String R = R(zzeuVar);
            Serializable T = T(zzeuVar.I(), zzeuVar);
            if (T != null) {
                hashMap.put(R, T);
            }
        }
        return hashMap;
    }

    public static Serializable T(int i, zzeu zzeuVar) {
        if (i == 0) {
            return Double.valueOf(Double.longBitsToDouble(zzeuVar.d()));
        }
        if (i == 1) {
            return Boolean.valueOf(zzeuVar.I() == 1);
        }
        if (i == 2) {
            return R(zzeuVar);
        }
        if (i != 3) {
            if (i == 8) {
                return S(zzeuVar);
            }
            if (i != 10) {
                if (i != 11) {
                    return null;
                }
                Date date = new Date((long) Double.longBitsToDouble(zzeuVar.d()));
                zzeuVar.E(2);
                return date;
            }
            int h = zzeuVar.h();
            ArrayList arrayList = new ArrayList(h);
            for (int i2 = 0; i2 < h; i2++) {
                Serializable T = T(zzeuVar.I(), zzeuVar);
                if (T != null) {
                    arrayList.add(T);
                }
            }
            return arrayList;
        }
        HashMap hashMap = new HashMap();
        while (true) {
            String R = R(zzeuVar);
            int I = zzeuVar.I();
            if (I == 9) {
                return hashMap;
            }
            Serializable T2 = T(I, zzeuVar);
            if (T2 != null) {
                hashMap.put(R, T2);
            }
        }
    }
}
