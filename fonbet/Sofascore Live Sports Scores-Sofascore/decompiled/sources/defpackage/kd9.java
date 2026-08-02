package defpackage;

import android.net.Uri;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kd9 {
    public final jd9 a;
    public final HashMap b;
    public final ArrayList c;
    public String d;

    public kd9(jd9 jd9Var, String str, Uri uri, int i) {
        this.a = jd9Var;
        HashMap hashMap = new HashMap();
        this.b = hashMap;
        hashMap.put(str, uri);
        this.d = str;
        ArrayList arrayList = new ArrayList();
        this.c = arrayList;
        if (i != -1) {
            arrayList.add(Integer.valueOf(i));
        }
    }

    public static hv9 a(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            bd9 bd9Var = (bd9) list.get(i);
            Uri uri = bd9Var.a;
            try {
                d(bd9Var.a, null, i, arrayList, new jd9(bd9Var.b, bd9Var.d, bd9Var.c), hashMap, hashMap2);
            } catch (s9e unused) {
            }
        }
        return hv9.v(arrayList);
    }

    public static hv9 b(List list) {
        ArrayList arrayList = new ArrayList();
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        for (int i = 0; i < list.size(); i++) {
            cd9 cd9Var = (cd9) list.get(i);
            d(cd9Var.a, cd9Var.g, i, arrayList, new jd9(cd9Var.b, cd9Var.h, null), hashMap, hashMap2);
        }
        return hv9.v(arrayList);
    }

    public static void d(Uri uri, String str, int i, ArrayList arrayList, jd9 jd9Var, HashMap hashMap, HashMap hashMap2) {
        int i2;
        String str2;
        Integer num = (Integer) hashMap.get(jd9Var);
        int i3 = 1;
        if (num == null) {
            hashMap2.put(jd9Var, 0);
            if (str == null) {
                hashMap2.put(jd9Var, 1);
                str = ".";
            }
            kd9 kd9Var = new kd9(jd9Var, str, uri, i);
            hashMap.put(jd9Var, Integer.valueOf(arrayList.size()));
            arrayList.add(kd9Var);
            return;
        }
        if (str == null) {
            Integer num2 = (Integer) hashMap2.get(jd9Var);
            num2.getClass();
            int intValue = num2.intValue() + 1;
            if (intValue <= 1) {
                z1a.o(intValue, "invalid count: %s", intValue >= 0);
                str2 = intValue == 0 ? "" : ".";
            } else {
                long j = intValue;
                int i4 = (int) j;
                if (i4 != j) {
                    hc5.h(vxd.l(j, "Required array size too large: "));
                    return;
                }
                char[] cArr = new char[i4];
                ".".getChars(0, 1, cArr, 0);
                while (true) {
                    i2 = i4 - i3;
                    if (i3 >= i2) {
                        break;
                    }
                    System.arraycopy(cArr, 0, cArr, i3, i3);
                    i3 <<= 1;
                }
                System.arraycopy(cArr, 0, cArr, i3, i2);
                str2 = new String(cArr);
            }
            hashMap2.put(jd9Var, Integer.valueOf(intValue));
            str = str2;
        }
        kd9 kd9Var2 = (kd9) arrayList.get(num.intValue());
        Uri uri2 = (Uri) kd9Var2.b.get(str);
        if (uri2 != null && !uri.equals(uri2)) {
            throw s9e.b("Different playlist URLs are found for pathway ID " + str + " within the HlsRedundantGroup", null);
        }
        kd9Var2.b.put(str, uri);
        if (i != -1) {
            kd9Var2.c.add(Integer.valueOf(i));
        }
    }

    public final Uri c() {
        Uri uri = (Uri) this.b.get(this.d);
        uri.getClass();
        return uri;
    }
}
