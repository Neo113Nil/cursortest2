package com.ironsource.adqualitysdk.sdk.i;

import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.facebook.ads.AdSettings;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class gq extends gt {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2246 = 1;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2247 = 0;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f2248 = -3462051208747850941L;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2246 + 7;
        f2247 = i2 % 128;
        int i3 = i2 % 2;
        long zoomControlsTimeout = ViewConfiguration.getZoomControlsTimeout();
        return m7813("挠築勤⧂±Ὓ\uf67e쵥ꐉ茡鯞狿䧑₃㾡ᙛ\ued3d쐷ꌽ믯鋂槾䂙徹㙕൹\ue472", i3 != 0 ? 31755 - (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) : (zoomControlsTimeout > 0L ? 1 : (zoomControlsTimeout == 0L ? 0 : -1)) + 6372).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2246;
        int i3 = i2 + 65;
        f2247 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 103;
        f2247 = i5 % 128;
        int i6 = i5 % 2;
        return AdSettings.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        bn bnVar = new bn(mo7797());
        int i2 = f2247 + 9;
        f2246 = i2 % 128;
        int i3 = i2 % 2;
        return bnVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2247 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2246 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7813("挥㡫햲狽ฅꭁ䂚ᷗ", 23369 - KeyEvent.keyCodeFromString("")).intern();
        int i4 = f2246 + 23;
        f2247 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7813(String str, int i) {
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
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f2248);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
