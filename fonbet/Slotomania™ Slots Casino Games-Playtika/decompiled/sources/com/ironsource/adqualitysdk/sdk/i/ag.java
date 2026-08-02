package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.graphics.PointF;
import android.graphics.drawable.Drawable;
import android.media.AudioTrack;
import android.os.Process;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;
import java.util.Arrays;
import java.util.List;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class ag implements Comparable<ag> {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f166 = 0;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f167 = null;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f168 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static byte[] f169 = {118, 4, -107, -119, -118, -99, -106, 0, 0, 0, 0};

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f170 = 813367882;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f171 = -1022637897;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f172 = 75;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private jn f173;

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(ag agVar) {
        int i = 2 % 2;
        int i2 = f168 + 31;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        int m5885 = m5885(agVar);
        int i4 = f168 + 41;
        f166 = i4 % 128;
        int i5 = i4 % 2;
        return m5885;
    }

    public ag(jn jnVar) {
        this.f173 = jnVar;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized JSONObject m5891() {
        JSONObject m8241;
        int i = 2 % 2;
        int i2 = f166 + 53;
        f168 = i2 % 128;
        if (i2 % 2 == 0) {
            m8241 = this.f173.m8241();
            int i3 = 61 / 0;
        } else {
            m8241 = this.f173.m8241();
        }
        return m8241;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized void m5890(int i) {
        int i2 = 2 % 2;
        int i3 = f166 + 55;
        f168 = i3 % 128;
        if (i3 % 2 != 0) {
            if (this.f173.m8241() != null) {
                int i4 = f168 + 103;
                f166 = i4 % 128;
                int i5 = i4 % 2;
                kj.m8421(this.f173.m8241(), i, m5884());
            }
        } else {
            this.f173.m8241();
            throw null;
        }
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static List<String> m5884() {
        int i = 2 % 2;
        int i2 = f168 + 43;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        List<String> asList = Arrays.asList(is.f2598);
        int i4 = f166 + 107;
        f168 = i4 % 128;
        if (i4 % 2 != 0) {
            return asList;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final jn m5886() {
        int i = 2 % 2;
        int i2 = f168 + 105;
        f166 = i2 % 128;
        if (i2 % 2 == 0) {
            return this.f173;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﱟ, reason: contains not printable characters */
    private long m5880() {
        int i = 2 % 2;
        int i2 = f168 + 11;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        long optLong = m5891().optLong(m5883((short) ((-118) - (AudioTrack.getMaxVolume() > 0.0f ? 1 : (AudioTrack.getMaxVolume() == 0.0f ? 0 : -1))), 1022638014 - (SystemClock.elapsedRealtime() > 0L ? 1 : (SystemClock.elapsedRealtime() == 0L ? 0 : -1)), (ViewConfiguration.getPressedStateDuration() >> 16) - 73, (-813367883) - Process.getGidForName(""), (byte) (MotionEvent.axisFromString("") + 1)).intern());
        int i4 = f168 + 99;
        f166 = i4 % 128;
        if (i4 % 2 == 0) {
            return optLong;
        }
        throw null;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    private long m5881() {
        int i = 2 % 2;
        int i2 = f168 + 71;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        long optInt = m5891().optInt(m5883((short) (5 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24)), Gravity.getAbsoluteGravity(0, 0) + 1022637998, (-74) - ((byte) KeyEvent.getModifierMetaStateMask()), (-813367881) - View.resolveSizeAndState(0, 0, 0), (byte) (TextUtils.lastIndexOf("", '0', 0) + 1)).intern());
        int i4 = f168 + 115;
        f166 = i4 % 128;
        int i5 = i4 % 2;
        return optInt;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    private String m5879() {
        String m8240;
        int i = 2 % 2;
        int i2 = f168 + Sdk.SDKError.Reason.JSON_ENCODE_ERROR_VALUE;
        f166 = i2 % 128;
        if (i2 % 2 != 0) {
            m8240 = this.f173.m8240();
            int i3 = 37 / 0;
        } else {
            m8240 = this.f173.m8240();
        }
        int i4 = f166 + 33;
        f168 = i4 % 128;
        int i5 = i4 % 2;
        return m8240;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m5889() {
        int i = 2 % 2;
        int i2 = f168 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        String optString = m5891().optString(m5883((short) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 114), 1022638009 - TextUtils.indexOf("", "", 0, 0), (ViewConfiguration.getEdgeSlop() >> 16) - 71, (-813367881) - ExpandableListView.getPackedPositionChild(0L), (byte) (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1))).intern());
        int i4 = f166 + 111;
        f168 = i4 % 128;
        if (i4 % 2 == 0) {
            int i5 = 16 / 0;
        }
        return optString;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String m5887() {
        int i = 2 % 2;
        int i2 = f168 + 11;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        String optString = m5891().optString(m5883((short) ((AudioTrack.getMinVolume() > 0.0f ? 1 : (AudioTrack.getMinVolume() == 0.0f ? 0 : -1)) + 94), 1022638014 - Drawable.resolveOpacity(0, 0), ((byte) KeyEvent.getModifierMetaStateMask()) - 71, TextUtils.getCapsMode("", 0, 0) - 813367877, (byte) Color.alpha(0)).intern(), null);
        int i4 = f168 + 109;
        f166 = i4 % 128;
        if (i4 % 2 == 0) {
            return optString;
        }
        throw null;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final void m5888(String str) {
        int i = 2 % 2;
        int i2 = f166 + 15;
        f168 = i2 % 128;
        int i3 = i2 % 2;
        try {
            m5891().put(m5883((short) (95 - (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1))), ImageFormat.getBitsPerPixel(0) + 1022638015, (Process.myPid() >> 22) - 72, (-813367876) - (SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)), (byte) Color.argb(0, 0, 0, 0)).intern(), str);
            int i4 = f166 + 11;
            f168 = i4 % 128;
            int i5 = i4 % 2;
        } catch (JSONException unused) {
        }
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f166 + 111;
        f168 = i2 % 128;
        int i3 = i2 % 2;
        JSONObject m5891 = m5891();
        if (i3 != 0) {
            return m5891.toString();
        }
        m5891.toString();
        Object obj = null;
        super.hashCode();
        throw null;
    }

    public final boolean equals(Object obj) {
        int i = 2 % 2;
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        int i2 = f166 + 61;
        f168 = i2 % 128;
        Object obj2 = null;
        if (i2 % 2 == 0) {
            obj.getClass();
            super.hashCode();
            throw null;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        boolean equals = m5879().equals(((ag) obj).m5879());
        int i3 = f168 + 75;
        f166 = i3 % 128;
        if (i3 % 2 == 0) {
            return equals;
        }
        super.hashCode();
        throw null;
    }

    public final int hashCode() {
        int i = 2 % 2;
        int i2 = f168 + 45;
        f166 = i2 % 128;
        Object obj = null;
        if (i2 % 2 != 0) {
            m5891();
            super.hashCode();
            throw null;
        }
        if (m5891() != null) {
            return m5891().hashCode();
        }
        int i3 = f166 + 59;
        f168 = i3 % 128;
        if (i3 % 2 != 0) {
            return 0;
        }
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private int m5885(ag agVar) {
        int i = 2 % 2;
        int i2 = f168 + 17;
        f166 = i2 % 128;
        int i3 = i2 % 2;
        long m5880 = m5880();
        long m58802 = agVar.m5880();
        if (m5880 < m58802) {
            int i4 = f168 + 21;
            f166 = i4 % 128;
            int i5 = i4 % 2;
            return -1;
        }
        if (m5880 != m58802) {
            return 1;
        }
        int i6 = f166 + 41;
        f168 = i6 % 128;
        int i7 = i6 % 2;
        return m5882(agVar);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private int m5882(ag agVar) {
        int i = 2 % 2;
        long m5881 = m5881();
        long m58812 = agVar.m5881();
        if (m5881 < m58812) {
            int i2 = f168 + 41;
            f166 = i2 % 128;
            int i3 = i2 % 2;
            return -1;
        }
        if (m5881 != m58812) {
            return 1;
        }
        int i4 = f168 + 3;
        f166 = i4 % 128;
        int i5 = i4 % 2;
        return 0;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m5883(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f172;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f169;
                if (bArr != null) {
                    i5 = (byte) (bArr[f170 + i3] + i4);
                } else {
                    i5 = (short) (f167[f170 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f170 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f171);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f169;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f167;
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
