package com.google.android.gms.internal.ads;

import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzhh {
    public static int a(int i) {
        int i2 = 0;
        while (i > 0) {
            i >>>= 1;
            i2++;
        }
        return i2;
    }

    public static zzhe b(zzeu zzeuVar, boolean z, boolean z2) {
        if (z) {
            c(3, zzeuVar, false);
        }
        zzeuVar.k((int) zzeuVar.a(), StandardCharsets.UTF_8);
        long a = zzeuVar.a();
        String[] strArr = new String[(int) a];
        for (int i = 0; i < a; i++) {
            strArr[i] = zzeuVar.k((int) zzeuVar.a(), StandardCharsets.UTF_8);
        }
        if (z2 && (zzeuVar.I() & 1) == 0) {
            throw zzat.a(null, "framing bit expected to be set");
        }
        return new zzhe(strArr);
    }

    public static boolean c(int i, zzeu zzeuVar, boolean z) {
        if (zzeuVar.B() < 7) {
            if (z) {
                return false;
            }
            int B = zzeuVar.B();
            StringBuilder sb = new StringBuilder(String.valueOf(B).length() + 18);
            sb.append("too short header: ");
            sb.append(B);
            throw zzat.a(null, sb.toString());
        }
        if (zzeuVar.I() != i) {
            if (z) {
                return false;
            }
            throw zzat.a(null, "expected header type ".concat(String.valueOf(Integer.toHexString(i))));
        }
        if (zzeuVar.I() == 118 && zzeuVar.I() == 111 && zzeuVar.I() == 114 && zzeuVar.I() == 98 && zzeuVar.I() == 105 && zzeuVar.I() == 115) {
            return true;
        }
        if (z) {
            return false;
        }
        throw zzat.a(null, "expected characters 'vorbis'");
    }
}
