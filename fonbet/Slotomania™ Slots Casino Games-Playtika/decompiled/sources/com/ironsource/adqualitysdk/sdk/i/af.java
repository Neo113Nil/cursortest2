package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.os.Process;
import android.os.SystemClock;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.google.common.base.Ascii;
import com.vungle.ads.internal.protos.Sdk;
import org.chromium.support_lib_boundary.WebViewProviderFactoryBoundaryInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
final class af {

    /* renamed from: ﮉ, reason: contains not printable characters */
    private static int f151 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f152 = 0;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f154 = 175;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private int f156;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private long f157;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private long f158;

    /* renamed from: ｋ, reason: contains not printable characters */
    private long f159;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private long f160;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Boolean f161 = null;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static char[] f153 = {'E', 41730, 18066, 59967, 36274, 12560, 54483, 30825, 7150, 48787, 25096, 1442, 43311, 19678, 61513, 37866, 14185, 55838, 32135, 8560, 50341, 26694, 3013, 44926, 21236, 5766, 46572, 20593, 13367, 38726, 46880, 5201, 61914, 8328, 33768, 26239, 5772, 46586, 20587, 'l', 41745, 18067, 59940, 36244, 12639, 54485, 30835, 7144, 12281};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static long f155 = -8963835845049146512L;

    /* renamed from: ﻐ, reason: contains not printable characters */
    static /* synthetic */ Boolean m5862(af afVar, Boolean bool) {
        int i = 2 % 2;
        int i2 = f151;
        int i3 = i2 + 87;
        f152 = i3 % 128;
        int i4 = i3 % 2;
        afVar.f161 = bool;
        int i5 = i2 + 55;
        f152 = i5 % 128;
        if (i5 % 2 == 0) {
            return bool;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ long m5864(af afVar) {
        int i = 2 % 2;
        int i2 = f151;
        int i3 = i2 + 105;
        f152 = i3 % 128;
        if (i3 % 2 != 0) {
            long j = afVar.f160;
            Object obj = null;
            super.hashCode();
            throw null;
        }
        long j2 = afVar.f160;
        int i4 = i2 + 85;
        f152 = i4 % 128;
        if (i4 % 2 != 0) {
            int i5 = 52 / 0;
        }
        return j2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    static /* synthetic */ long m5865(af afVar, long j) {
        int i = 2 % 2;
        int i2 = f151 + 67;
        int i3 = i2 % 128;
        f152 = i3;
        int i4 = i2 % 2;
        afVar.f157 = j;
        int i5 = i3 + 109;
        f151 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ long m5869(af afVar) {
        int i = 2 % 2;
        int i2 = f152 + 99;
        int i3 = i2 % 128;
        f151 = i3;
        int i4 = i2 % 2;
        long j = afVar.f159;
        int i5 = i3 + 13;
        f152 = i5 % 128;
        if (i5 % 2 == 0) {
            return j;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    static /* synthetic */ long m5870(af afVar, long j) {
        int i = 2 % 2;
        int i2 = f151;
        int i3 = i2 + 103;
        f152 = i3 % 128;
        int i4 = i3 % 2;
        afVar.f158 = j;
        int i5 = i2 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f152 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 40 / 0;
        }
        return j;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    static /* synthetic */ long m5872(af afVar, long j) {
        int i = 2 % 2;
        int i2 = f151;
        int i3 = i2 + 45;
        f152 = i3 % 128;
        int i4 = i3 % 2;
        afVar.f160 = j;
        int i5 = i2 + 107;
        f152 = i5 % 128;
        int i6 = i5 % 2;
        return j;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    static /* synthetic */ long m5875(af afVar, long j) {
        int i = 2 % 2;
        int i2 = f152;
        int i3 = i2 + 41;
        f151 = i3 % 128;
        int i4 = i3 % 2;
        afVar.f159 = j;
        if (i4 == 0) {
            throw null;
        }
        int i5 = i2 + 35;
        f151 = i5 % 128;
        if (i5 % 2 != 0) {
            return j;
        }
        throw null;
    }

    af(int i) {
        this.f156 = i;
        ar.m6041().mo6067(new ax() { // from class: com.ironsource.adqualitysdk.sdk.i.af.2

            /* renamed from: ﻐ, reason: contains not printable characters */
            private static long f162 = -3200782027641499069L;

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static int f163 = 0;

            /* renamed from: ﾒ, reason: contains not printable characters */
            private static int f164 = 1;

            @Override // com.ironsource.adqualitysdk.sdk.i.ax
            /* renamed from: ﾇ, reason: contains not printable characters */
            public final void mo5878() {
                int i2 = 2 % 2;
                ap mo6055 = ar.m6041().mo6055();
                long m6028 = mo6055.m6028();
                if (m6028 == 0) {
                    int i3 = f163 + 103;
                    f164 = i3 % 128;
                    int i4 = i3 % 2;
                    af.m5862(af.this, Boolean.FALSE);
                    m6028 = mo6055.m6026();
                    kl.m8458(m5877("列펑兘휗哜\uda90塀\ude33快\udd83䍴설䛤쑔䨋쯙䦝콁䴟\uf2c7炭", 33211 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), m5877("分縒\u0a77홅\ue2bd軌嫸曘㍻\udf1f\ueb78랶䎓濭㯇쐩道뱣䡐ᒨ₉쳹餳ꕆ煿ᵁ⦠\uf597臤귀縸ਓ홓", (ViewConfiguration.getLongPressTimeout() >> 16) + 11299).intern(), (Throwable) null, false);
                    int i5 = f164 + 73;
                    f163 = i5 % 128;
                    if (i5 % 2 != 0) {
                        int i6 = 5 / 5;
                    }
                } else {
                    af.m5862(af.this, Boolean.TRUE);
                    int i7 = f164 + 19;
                    f163 = i7 % 128;
                    int i8 = i7 % 2;
                }
                af.m5872(af.this, mo6055.m6027());
                af.m5875(af.this, mo6055.m6026());
                af afVar = af.this;
                af.m5870(afVar, m6028 - af.m5864(afVar));
                af afVar2 = af.this;
                af.m5865(afVar2, m6028 - af.m5869(afVar2));
                int i9 = f163 + 101;
                f164 = i9 % 128;
                if (i9 % 2 == 0) {
                    int i10 = 49 / 0;
                }
            }

            /* renamed from: ﻛ, reason: contains not printable characters */
            private static String m5877(String str, int i2) {
                String str2;
                char[] cArr = str;
                if (str != null) {
                    cArr = str.toCharArray();
                }
                char[] cArr2 = cArr;
                synchronized (i.f2454) {
                    i.f2455 = i2;
                    char[] cArr3 = new char[cArr2.length];
                    i.f2453 = 0;
                    while (i.f2453 < cArr2.length) {
                        cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f162);
                        i.f2453++;
                    }
                    str2 = new String(cArr3);
                }
                return str2;
            }
        });
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    final boolean m5876(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f151 + Sdk.SDKError.Reason.INVALID_METRICS_ENDPOINT_VALUE;
        f152 = i2 % 128;
        if (i2 % 2 == 0) {
            if (!m5874(jSONObject) && this.f161 != null) {
                int i3 = f152 + 87;
                f151 = i3 % 128;
                try {
                    if (i3 % 2 == 0) {
                        m5867(jSONObject);
                        return false;
                    }
                    m5867(jSONObject);
                    return true;
                } catch (Exception e) {
                    kl.m8458(m5863(((byte) KeyEvent.getModifierMetaStateMask()) + Ascii.SYN, false, (ViewConfiguration.getScrollDefaultDelay() >> 16) + 281, "￩\u000f\u0004\ufff9\ufffe\b\u0005\u0004\uffff\u0010\ufffb\b￪\uffff\u0003\ufffb\t\n\ufff7\u0003\u0006", 12 - View.MeasureSpec.getSize(0)).intern(), m5866((char) Gravity.getAbsoluteGravity(0, 0), KeyEvent.getDeadChar(0, 0), 26 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))).intern(), (Throwable) e, false);
                }
            }
            return false;
        }
        m5874(jSONObject);
        throw null;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x00fa  */
    /* renamed from: ﻛ, reason: contains not printable characters */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void m5867(JSONObject jSONObject) {
        long optLong;
        boolean z;
        int i = 2 % 2;
        int i2 = f152 + 57;
        f151 = i2 % 128;
        int i3 = i2 % 2;
        try {
            if (jSONObject.optInt(m5866((char) ((ViewConfiguration.getTouchSlop() >> 8) + 5877), (KeyEvent.getMaxKeyCode() >> 16) + 25, 3 - (ExpandableListView.getPackedPositionForGroup(0) > 0L ? 1 : (ExpandableListView.getPackedPositionForGroup(0) == 0L ? 0 : -1))).intern(), 1) != this.f156) {
                int i4 = f151 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f152 = i4 % 128;
                int i5 = i4 % 2;
                if (!m5871(jSONObject)) {
                    optLong = jSONObject.optLong(m5866((char) (8428 - (ViewConfiguration.getEdgeSlop() >> 16)), AndroidCharacter.getMirror('0') - 15, Color.argb(0, 0, 0, 0) + 3).intern()) + this.f157;
                    jSONObject.put(m5863((ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 3, false, (ViewConfiguration.getScrollBarSize() >> 8) + 289, "\u0001�\u0002", 2 - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1))).intern(), this.f157);
                    int i6 = f151 + 29;
                    f152 = i6 % 128;
                    int i7 = i6 % 2;
                    z = false;
                    jSONObject.put(is.f2629, optLong);
                    if (!this.f161.booleanValue()) {
                        int i8 = f151 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
                        f152 = i8 % 128;
                        if (i8 % 2 != 0) {
                            jSONObject.put(m5863(4 - (PointF.length(1.0f, 1.0f) > 1.0f ? 1 : (PointF.length(1.0f, 1.0f) == 1.0f ? 0 : -1)), true, 5882 - KeyEvent.normalizeMetaState(1), "\u0000\u0000\u0001", 4 << (ViewConfiguration.getLongPressTimeout() >>> 58)).intern(), true);
                        } else {
                            jSONObject.put(m5863((PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 3, false, KeyEvent.normalizeMetaState(0) + 290, "\u0000\u0000\u0001", (ViewConfiguration.getLongPressTimeout() >> 16) + 2).intern(), false);
                        }
                    }
                    m5868(jSONObject, z);
                    m5873(jSONObject, z);
                    int i9 = f152 + 81;
                    f151 = i9 % 128;
                    int i10 = i9 % 2;
                }
            }
            optLong = jSONObject.optLong(m5866((char) (TextUtils.indexOf((CharSequence) "", '0', 0) + 13379), 28 - (ViewConfiguration.getTouchSlop() >> 8), 1 - ExpandableListView.getPackedPositionChild(0L)).intern()) + this.f158;
            jSONObject.put(m5866((char) (46933 - ExpandableListView.getPackedPositionGroup(0L)), (Process.myTid() >> 22) + 30, 3 - Color.red(0)).intern(), this.f158);
            z = true;
            jSONObject.put(is.f2629, optLong);
            if (!this.f161.booleanValue()) {
            }
            m5868(jSONObject, z);
            m5873(jSONObject, z);
            int i92 = f152 + 81;
            f151 = i92 % 128;
            int i102 = i92 % 2;
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static boolean m5874(JSONObject jSONObject) {
        int i = 2 % 2;
        if (!jSONObject.has(m5866((char) (46933 - Gravity.getAbsoluteGravity(0, 0)), 30 - (KeyEvent.getMaxKeyCode() >> 16), (ViewConfiguration.getJumpTapTimeout() >> 16) + 3).intern())) {
            int i2 = f152 + Sdk.SDKError.Reason.INVALID_RI_ENDPOINT_VALUE;
            f151 = i2 % 128;
            int i3 = i2 % 2;
            if (!jSONObject.has(m5863(TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 4, false, 289 - ExpandableListView.getPackedPositionGroup(0L), "\u0001�\u0002", (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 1).intern())) {
                int i4 = f152 + 25;
                f151 = i4 % 128;
                int i5 = i4 % 2;
                return false;
            }
        }
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private void m5868(JSONObject jSONObject, boolean z) {
        long optLong;
        int i;
        int i2 = 2 % 2;
        if (jSONObject.has(m5863((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 2, true, 290 - TextUtils.getTrimmedLength(""), "\u0000\u0000\u0001", -(ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1))).intern())) {
            int i3 = f152 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f151 = i3 % 128;
            int i4 = i3 % 2;
            if (!(!z)) {
                optLong = jSONObject.optLong(m5866((char) (5887 - TextUtils.getTrimmedLength("")), 36 - ExpandableListView.getPackedPositionType(0L), 2 - TextUtils.lastIndexOf("", '0')).intern()) + this.f158;
                i = f152 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
                f151 = i % 128;
            } else {
                optLong = jSONObject.optLong(m5863(3 - (ViewConfiguration.getWindowTouchSlop() >> 8), true, 291 - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), "\u0000\u0000\u0001", 1 - View.combineMeasuredStates(0, 0)).intern()) + this.f157;
                i = f151 + 3;
                f152 = i % 128;
            }
            int i5 = i % 2;
            try {
                jSONObject.put(m5863(3 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), true, ((Process.getThreadPriority(0) + 20) >> 6) + 290, "\u0000\u0000\u0001", View.MeasureSpec.getMode(0) + 1).intern(), optLong);
            } catch (JSONException unused) {
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private void m5873(JSONObject jSONObject, boolean z) {
        int i = 2 % 2;
        try {
            JSONObject optJSONObject = jSONObject.optJSONObject(m5866((char) (ViewConfiguration.getKeyRepeatDelay() >> 16), 39 - TextUtils.getTrimmedLength(""), 8 - TextUtils.lastIndexOf("", '0', 0, 0)).intern());
            if (optJSONObject != null) {
                Long l = null;
                if (z) {
                    long optLong = optJSONObject.optLong(m5863(-ImageFormat.getBitsPerPixel(0), false, Gravity.getAbsoluteGravity(0, 0) + 292, WebViewProviderFactoryBoundaryInterface.MULTI_COOKIE_VALUE_SEPARATOR, 1 - TextUtils.getCapsMode("", 0, 0)).intern());
                    if (optLong > 0) {
                        Long valueOf = Long.valueOf(optLong + this.f158);
                        int i2 = f151 + 109;
                        f152 = i2 % 128;
                        int i3 = i2 % 2;
                        l = valueOf;
                    }
                } else {
                    long optLong2 = optJSONObject.optLong(m5866((char) (12173 - KeyEvent.normalizeMetaState(0)), View.resolveSize(0, 0) + 48, -TextUtils.indexOf((CharSequence) "", '0', 0, 0)).intern());
                    if (optLong2 > 0) {
                        int i4 = f152 + 85;
                        f151 = i4 % 128;
                        int i5 = i4 % 2;
                        l = Long.valueOf(optLong2 + this.f157);
                    }
                }
                if (l != null) {
                    int i6 = f152 + 63;
                    f151 = i6 % 128;
                    int i7 = i6 % 2;
                    optJSONObject.put(m5866((char) (12173 - (KeyEvent.getMaxKeyCode() >> 16)), 48 - View.getDefaultSize(0, 0), 1 - View.MeasureSpec.getSize(0)).intern(), l);
                }
            }
        } catch (JSONException unused) {
        }
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private boolean m5871(JSONObject jSONObject) {
        int i = 2 % 2;
        int i2 = f151 + 73;
        f152 = i2 % 128;
        int i3 = i2 % 2;
        if (Math.abs((this.f159 - this.f160) - (jSONObject.optLong(m5866((char) (8429 - (Process.getElapsedCpuTime() > 0L ? 1 : (Process.getElapsedCpuTime() == 0L ? 0 : -1))), TextUtils.lastIndexOf("", '0', 0) + 34, (ViewConfiguration.getLongPressTimeout() >> 16) + 3).intern()) - jSONObject.optLong(m5866((char) (Process.getGidForName("") + 13379), (ViewConfiguration.getWindowTouchSlop() >> 8) + 28, Color.rgb(0, 0, 0) + 16777218).intern()))) > 10) {
            return false;
        }
        int i4 = f152 + 55;
        f151 = i4 % 128;
        int i5 = i4 % 2;
        return true;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m5863(int i, boolean z, int i2, String str, int i3) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (d.f1644) {
            char[] cArr3 = new char[i];
            d.f1641 = 0;
            while (d.f1641 < i) {
                d.f1643 = cArr2[d.f1641];
                cArr3[d.f1641] = (char) (d.f1643 + i2);
                int i4 = d.f1641;
                cArr3[i4] = (char) (cArr3[i4] - f154);
                d.f1641++;
            }
            if (i3 > 0) {
                d.f1642 = i3;
                char[] cArr4 = new char[i];
                System.arraycopy(cArr3, 0, cArr4, 0, i);
                System.arraycopy(cArr4, 0, cArr3, i - d.f1642, d.f1642);
                System.arraycopy(cArr4, d.f1642, cArr3, 0, i - d.f1642);
            }
            if (z) {
                char[] cArr5 = new char[i];
                d.f1641 = 0;
                while (d.f1641 < i) {
                    cArr5[d.f1641] = cArr3[(i - d.f1641) - 1];
                    d.f1641++;
                }
                cArr3 = cArr5;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m5866(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f153[c.f1198 + i] ^ (c.f1198 * f155)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
