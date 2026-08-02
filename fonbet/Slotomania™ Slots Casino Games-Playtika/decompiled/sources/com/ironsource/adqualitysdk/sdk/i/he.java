package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.smaato.sdk.core.SmaatoSdk;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class he extends gt {

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2311 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2312 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static short[] f2313 = null;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2314 = 1816458346;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2315 = 68;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static byte[] f2316 = {89, 71, 122, 93, 69, 86, 106, 60, 59, -113, 101, 85, 82, 43, -107, 89, 103, Ascii.ESC, -95, 93, 69, 86, 106, 92, Ascii.ESC, -105, 96, 82, -91, -115, -98, -86, -92, 0, 0};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2317 = -552104295;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2312 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f2311 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7830((short) (35 - TextUtils.indexOf((CharSequence) "", '0', 0, 0)), Color.rgb(0, 0, 0) - 1799681031, (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) - 40, (ViewConfiguration.getMaximumFlingVelocity() >> 16) + 552104295, (byte) (ExpandableListView.getPackedPositionType(0L) + Sdk.SDKError.Reason.INVALID_ADS_ENDPOINT_VALUE)).intern();
        int i4 = f2311 + 101;
        f2312 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 22 / 0;
        }
        return intern;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2312;
        int i3 = i2 + 109;
        f2311 = i3 % 128;
        int i4 = i3 % 2;
        int i5 = i2 + 55;
        f2311 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 20 / 0;
        }
        return SmaatoSdk.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        cb cbVar = new cb(mo7797());
        int i2 = f2311 + 51;
        f2312 = i2 % 128;
        if (i2 % 2 != 0) {
            int i3 = 28 / 0;
        }
        return cbVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2312 + 109;
        f2311 = i2 % 128;
        int i3 = i2 % 2;
        String intern = m7830((short) (96 - (ViewConfiguration.getLongPressTimeout() >> 16)), (-1816458231) - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) - 62, 552104323 - KeyEvent.getDeadChar(0, 0), (byte) ((-2) - Color.red(0))).intern();
        int i4 = f2311 + 43;
        f2312 = i4 % 128;
        int i5 = i4 % 2;
        return intern;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7830(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2315;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2316;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2317 + i3] + i4);
                } else {
                    i5 = (short) (f2313[f2317 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2317 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2314);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2316;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2313;
                        int i8 = n.f3090;
                        n.f3090 = i8 - 1;
                        n.f3092 = (char) (n.f3093 + (((short) (sArr[i8] + s)) ^ n.f3091));
                    }
                    sb.append(n.f3092);
                    n.f3093 = n.f3092;
                    n.f3089++;
                }
            }
            obj = sb.toString();
        }
        return obj;
    }
}
