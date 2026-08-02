package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import java.util.List;

/* loaded from: classes4.dex */
public final class ft extends gc {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static long f2117 = -5534098131843656923L;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2118 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2119 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private final gb[] f2120;

    public ft(List<gb> list, byte b) {
        super(b);
        gb[] gbVarArr = new gb[list.size()];
        this.f2120 = gbVarArr;
        list.toArray(gbVarArr);
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final ea mo7776(ee eeVar, cl clVar) {
        int i = 2 % 2;
        ea eaVar = new ea(null);
        ee eeVar2 = new ee(eeVar);
        gb[] gbVarArr = this.f2120;
        int length = gbVarArr.length;
        int i2 = 0;
        while (i2 < length) {
            int i3 = f2119 + 103;
            f2118 = i3 % 128;
            int i4 = i3 % 2;
            eaVar = gbVarArr[i2].m7788(eeVar2, clVar);
            if (eaVar.m7683() || eaVar.m7679() || !(!eaVar.m7678())) {
                break;
            }
            eeVar.m7706();
            i2++;
            int i5 = f2118 + 69;
            f2119 = i5 % 128;
            int i6 = i5 % 2;
        }
        return eaVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gb
    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int mo7775(ee eeVar) {
        int i = 2 % 2;
        int i2 = 0;
        int i3 = 0;
        while (i2 < eeVar.m7705()) {
            int i4 = f2118 + 15;
            f2119 = i4 % 128;
            int i5 = i4 % 2;
            i3 += this.f2120[i2].toString().split(m7774("匯", 46133 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1))).intern()).length;
            i2++;
            int i6 = f2119 + 115;
            f2118 = i6 % 128;
            int i7 = i6 % 2;
        }
        return i3;
    }

    public final String toString() {
        int i = 2 % 2;
        StringBuilder sb = new StringBuilder();
        sb.append(m7774("卞䝪", 5189 - TextUtils.getOffsetBefore("", 0)).intern());
        gb[] gbVarArr = this.f2120;
        int length = gbVarArr.length;
        int i2 = f2118 + 15;
        f2119 = i2 % 128;
        int i3 = i2 % 2;
        int i4 = 0;
        while (i4 < length) {
            int i5 = f2118 + 29;
            f2119 = i5 % 128;
            if (i5 % 2 != 0) {
                gb gbVar = gbVarArr[i4];
                m7791(sb);
                sb.append(gbVar.toString());
                sb.append(m7774("匯", TextUtils.lastIndexOf("", '0', 0) + 46134).intern());
                i4++;
            } else {
                gb gbVar2 = gbVarArr[i4];
                m7791(sb);
                sb.append(gbVar2.toString());
                sb.append(m7774("匯", 46134 % TextUtils.lastIndexOf("", 'K', 0)).intern());
                i4 += 8;
            }
        }
        m7792(sb);
        sb.append(m7774("単", 51577 - Color.argb(0, 0, 0, 0)).intern());
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        int i2 = f2119 + 3;
        f2118 = i2 % 128;
        int i3 = i2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj != null && getClass() == obj.getClass()) {
            gb[] gbVarArr = this.f2120;
            gb[] gbVarArr2 = ((ft) obj).f2120;
            if (gbVarArr != null) {
                return gbVarArr.equals(gbVarArr2);
            }
            if (gbVarArr2 == null) {
                int i4 = f2119 + 73;
                f2118 = i4 % 128;
                int i5 = i4 % 2;
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f2119 + 93;
        f2118 = i2 % 128;
        int i3 = i2 % 2;
        gb[] gbVarArr = this.f2120;
        if (gbVarArr == null) {
            return 0;
        }
        int hashCode = gbVarArr.hashCode();
        int i4 = f2119 + 91;
        f2118 = i4 % 128;
        int i5 = i4 % 2;
        return hashCode;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7774(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2117);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
