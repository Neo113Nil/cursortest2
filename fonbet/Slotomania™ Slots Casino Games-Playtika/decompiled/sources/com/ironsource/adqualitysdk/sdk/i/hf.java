package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.PointF;
import android.os.Process;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.ViewConfiguration;
import com.google.common.base.Ascii;
import com.tapjoy.Tapjoy;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes6.dex */
public final class hf extends gt {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2318 = 1;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f2319 = 0;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f2320 = {-102, 10, 5, -6, Ascii.SI, Ascii.CR, 38, -75, 10, 5, -6, Ascii.SI, -19, 70, -63, -2, Ascii.FF, -113, 10, 5, -6, Ascii.SI, -19};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static short[] f2321 = null;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2322 = 1831181999;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2323 = 119;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2324 = -530823127;

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        short myPid;
        int maximumFlingVelocity;
        int minimumFlingVelocity;
        int keyRepeatTimeout;
        int myTid;
        int i = 2 % 2;
        int i2 = f2319 + 73;
        f2318 = i2 % 128;
        if (i2 % 2 == 0) {
            myPid = (short) (Process.myPid() - 116);
            maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >>> 7) - 1831181900;
            minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() / 32) * 35;
            keyRepeatTimeout = 530823127 << (ViewConfiguration.getKeyRepeatTimeout() << Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE);
            myTid = Process.myTid() % 103;
        } else {
            myPid = (short) (Process.myPid() >> 22);
            maximumFlingVelocity = (ViewConfiguration.getMaximumFlingVelocity() >> 16) - 1831181900;
            minimumFlingVelocity = (ViewConfiguration.getMinimumFlingVelocity() >> 16) - 120;
            keyRepeatTimeout = 530823127 - (ViewConfiguration.getKeyRepeatTimeout() >> 16);
            myTid = Process.myTid() >> 22;
        }
        return m7831(myPid, maximumFlingVelocity, minimumFlingVelocity, keyRepeatTimeout, (byte) myTid).intern();
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2318 + Sdk.SDKError.Reason.TPAT_ERROR_VALUE;
        int i3 = i2 % 128;
        f2319 = i3;
        int i4 = i2 % 2;
        int i5 = i3 + 51;
        f2318 = i5 % 128;
        int i6 = i5 % 2;
        return Tapjoy.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        ce ceVar = new ce(mo7797());
        int i2 = f2319 + 55;
        f2318 = i2 % 128;
        int i3 = i2 % 2;
        return ceVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2319 + 29;
        f2318 = i2 % 128;
        return (i2 % 2 == 0 ? m7831((short) (PointF.length(2.0f, 0.0f) > 2.0f ? 1 : (PointF.length(2.0f, 0.0f) == 2.0f ? 0 : -1)), (-1831181883) - TextUtils.indexOf("", ""), (ViewConfiguration.getScrollBarFadeDuration() + 94) * 103, (ViewConfiguration.getScrollBarFadeDuration() % 86) + 530823144, (byte) KeyEvent.normalizeMetaState(1)) : m7831((short) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)), TextUtils.indexOf("", "") - 1831181883, (-120) - (ViewConfiguration.getScrollBarFadeDuration() >> 16), 530823144 - (ViewConfiguration.getScrollBarFadeDuration() >> 16), (byte) KeyEvent.normalizeMetaState(0))).intern();
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m7831(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2323;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2320;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2324 + i3] + i4);
                } else {
                    i5 = (short) (f2321[f2324 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2324 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2322);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2320;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2321;
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
