package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.media.AudioTrack;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualityDeviceIdType;
import com.vungle.ads.internal.protos.Sdk;
import java.util.HashMap;
import java.util.Map;

/* loaded from: classes3.dex */
public final class as {

    /* renamed from: ﭖ, reason: contains not printable characters */
    private static byte[] f416 = {-2, 92, -95, -89, 88, 86, 82};

    /* renamed from: ﭴ, reason: contains not printable characters */
    private static int f417 = -1654479476;

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f418 = 0;

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f419 = 1;

    /* renamed from: ﮌ, reason: contains not printable characters */
    private static short[] f420 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f421 = -2059273381;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f422 = 9;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private ISAdQualityDeviceIdType f425;

    /* renamed from: ｋ, reason: contains not printable characters */
    private String f428 = "";

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f429 = m6111((short) View.combineMeasuredStates(0, 0), 1654479554 - (AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)), (-10) - Color.alpha(0), 2059273381 - (ViewConfiguration.getPressedStateDuration() >> 16), (byte) (TextUtils.indexOf("", "", 0) + 83)).intern();

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f426 = true;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f430 = "";

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f427 = false;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private Map<String, String> f424 = new HashMap();

    /* renamed from: ﮐ, reason: contains not printable characters */
    private boolean f423 = false;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m6118() {
        int i = 2 % 2;
        int i2 = f419;
        int i3 = i2 + 7;
        f418 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            throw null;
        }
        String str = this.f428;
        int i4 = i2 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f418 = i4 % 128;
        if (i4 % 2 == 0) {
            return str;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6125(String str) {
        int i = 2 % 2;
        int i2 = f418 + 49;
        f419 = i2 % 128;
        int i3 = i2 % 2;
        this.f428 = str;
        if (i3 == 0) {
            throw null;
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final synchronized String m6120() {
        int i = 2 % 2;
        int i2 = f419 + 103;
        int i3 = i2 % 128;
        f418 = i3;
        int i4 = i2 % 2;
        String str = this.f429;
        int i5 = i3 + 99;
        f419 = i5 % 128;
        if (i5 % 2 != 0) {
            return str;
        }
        int i6 = 80 / 0;
        return str;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final synchronized void m6117(String str) {
        int i = 2 % 2;
        int i2 = f419;
        int i3 = i2 + 95;
        f418 = i3 % 128;
        Object obj = null;
        if (i3 % 2 != 0) {
            this.f429 = str;
            throw null;
        }
        this.f429 = str;
        int i4 = i2 + 33;
        f418 = i4 % 128;
        if (i4 % 2 != 0) {
            super.hashCode();
            throw null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final boolean m6127() {
        int i = 2 % 2;
        int i2 = f418;
        int i3 = i2 + 107;
        f419 = i3 % 128;
        if (i3 % 2 == 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        boolean z = this.f426;
        int i4 = i2 + 47;
        f419 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m6122(boolean z) {
        int i = 2 % 2;
        int i2 = f418;
        int i3 = i2 + 71;
        f419 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = null;
        this.f426 = z;
        if (i4 == 0) {
            super.hashCode();
            throw null;
        }
        int i5 = i2 + 43;
        f419 = i5 % 128;
        if (i5 % 2 != 0) {
            return;
        }
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m6116() {
        int i = 2 % 2;
        int i2 = f419 + 7;
        f418 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f430;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m6121(String str) {
        int i = 2 % 2;
        int i2 = f419;
        int i3 = i2 + 25;
        f418 = i3 % 128;
        int i4 = i3 % 2;
        this.f430 = str;
        int i5 = i2 + 75;
        f418 = i5 % 128;
        int i6 = i5 % 2;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m6123() {
        int i = 2 % 2;
        int i2 = f419 + 61;
        f418 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f427;
        }
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final void m6119(boolean z) {
        int i = 2 % 2;
        int i2 = f419;
        int i3 = i2 + 113;
        f418 = i3 % 128;
        int i4 = i3 % 2;
        this.f427 = z;
        if (i4 != 0) {
            throw null;
        }
        int i5 = i2 + 69;
        f418 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 29 / 0;
        }
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final ISAdQualityDeviceIdType m6114() {
        int i = 2 % 2;
        int i2 = f419 + 37;
        f418 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f425;
        }
        throw null;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6124(ISAdQualityDeviceIdType iSAdQualityDeviceIdType) {
        int i = 2 % 2;
        int i2 = f419 + 37;
        f418 = i2 % 128;
        int i3 = i2 % 2;
        this.f425 = iSAdQualityDeviceIdType;
        if (i3 == 0) {
            return;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final Map<String, String> m6113() {
        int i = 2 % 2;
        int i2 = f418 + 17;
        int i3 = i2 % 128;
        f419 = i3;
        int i4 = i2 % 2;
        Map<String, String> map = this.f424;
        int i5 = i3 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f418 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 14 / 0;
        }
        return map;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m6126(Map<String, String> map) {
        int i = 2 % 2;
        int i2 = f418 + 61;
        f419 = i2 % 128;
        int i3 = i2 % 2;
        this.f424 = map;
        if (i3 == 0) {
            int i4 = 8 / 0;
        }
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean m6112() {
        int i = 2 % 2;
        int i2 = f418 + 29;
        f419 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f423;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final void m6115() {
        int i = 2 % 2;
        int i2 = f419;
        int i3 = i2 + 105;
        f418 = i3 % 128;
        int i4 = i3 % 2;
        this.f423 = true;
        int i5 = i2 + 13;
        f418 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 77 / 0;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m6111(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f422;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f416;
                if (bArr != null) {
                    i5 = (byte) (bArr[f421 + i3] + i4);
                } else {
                    i5 = (short) (f420[f421 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f421 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f417);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f416;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f420;
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
