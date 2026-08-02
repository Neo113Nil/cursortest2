package com.google.android.gms.internal.ads;

import defpackage.mz1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzfw {
    public final String a;

    public zzfw(String str) {
        this.a = str;
    }

    public static zzfw a(zzeu zzeuVar) {
        String str;
        zzeuVar.E(2);
        int I = zzeuVar.I();
        int i = I >> 1;
        int i2 = I & 1;
        int I2 = zzeuVar.I() >> 3;
        if (i == 4 || i == 5 || i == 7 || i == 8) {
            str = "dvhe";
        } else if (i == 9) {
            str = "dvav";
        } else {
            if (i != 10) {
                return null;
            }
            str = "dav1";
        }
        int i3 = I2 | (i2 << 5);
        String str2 = i < 10 ? ".0" : ".";
        int length = str2.length() + 4;
        int length2 = String.valueOf(i).length();
        int length3 = String.valueOf(i3).length();
        String str3 = i3 < 10 ? ".0" : ".";
        StringBuilder sb = new StringBuilder(mz1.d(length + length2, length3, str3));
        sb.append(str);
        sb.append(str2);
        sb.append(i);
        sb.append(str3);
        sb.append(i3);
        return new zzfw(sb.toString());
    }
}
