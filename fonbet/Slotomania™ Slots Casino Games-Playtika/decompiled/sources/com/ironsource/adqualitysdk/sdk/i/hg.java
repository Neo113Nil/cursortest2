package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.qq.e.comm.managers.GDTAdSdk;

/* loaded from: classes6.dex */
public final class hg extends gt {

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2325 = 1;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2326 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2327 = 5055998094937703637L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2325 + 21;
        f2326 = i2 % 128;
        String intern = (i2 % 2 != 0 ? m7832("䒶됙ꗾ锒蘨\uf78b\ue729탅쇣ㄍ⋤Ꮉ̜粼汒崹事빧꿄颩蠛粒\ueaf9\uda37쯙㭪㐚▀ᕒۆ瞤", ViewConfiguration.getMinimumFlingVelocity() * 7022742) : m7832("䒶됙ꗾ锒蘨\uf78b\ue729탅쇣ㄍ⋤Ꮉ̜粼汒崹事빧꿄颩蠛粒\ueaf9\uda37쯙㭪㐚▀ᕒۆ瞤", 61603 - (ViewConfiguration.getMinimumFlingVelocity() >> 16))).intern();
        int i3 = f2326 + 3;
        f2325 = i3 % 128;
        if (i3 % 2 == 0) {
            int i4 = 78 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2326 + 41;
        int i3 = i2 % 128;
        f2325 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 31;
        f2326 = i5 % 128;
        if (i5 % 2 == 0) {
            return GDTAdSdk.class;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        cf cfVar = new cf(mo7797());
        int i2 = f2325 + 85;
        f2326 = i2 % 128;
        if (i2 % 2 == 0) {
            return cfVar;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2325 + 63;
        f2326 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7832("䒡\ua637膵\ue323캬⠘\u0b8b", KeyEvent.normalizeMetaState(0) + 57991).intern();
        int i4 = f2326 + 25;
        f2325 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7832(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2327);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
