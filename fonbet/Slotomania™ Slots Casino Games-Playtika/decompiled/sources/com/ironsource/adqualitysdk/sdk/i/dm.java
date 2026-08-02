package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.graphics.ImageFormat;
import android.os.SystemClock;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.ironsource.adqualitysdk.sdk.ISAdQualityAdType;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes4.dex */
public final class dm {

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static int f1784 = 1;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static int f1785;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private String f1787;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private ISAdQualityAdType f1788;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private List<String> f1789;

    /* renamed from: ｋ, reason: contains not printable characters */
    private JSONObject f1790;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private String f1791;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private String f1792;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static char[] f1786 = {25984, 28912, 20350, 9702, 4906, 1618, 14821, 21317, 18127, 30815, 'p', 5404, 10888, 16406, 21913, 27394, 41070, 46353, 35457, 57361, 62861, 51991, 8341, 13837, 2946, 24857, 45426, 42000, 39835, 61700, 58550, 55836, 12678, 10011, 6793, 28691, 'w', 5400, 10904, 16417, 21917, 27412, 32921, 38424, 43951, 49408, 54934, 60459, 441, 5931};

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static long f1783 = 1989832669443659133L;

    public dm(JSONObject jSONObject) {
        this.f1788 = ISAdQualityAdType.UNKNOWN;
        this.f1792 = eb.m7685(jSONObject.optString(m7584((char) ((SystemClock.currentThreadTimeMillis() > (-1L) ? 1 : (SystemClock.currentThreadTimeMillis() == (-1L) ? 0 : -1)) + 26099), TextUtils.indexOf((CharSequence) "", '0', 0, 0) + 1, 4 - Color.green(0)).intern()));
        String m7685 = eb.m7685(jSONObject.optString(m7584((char) (4940 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))), 4 - View.resolveSize(0, 0), 6 - Color.alpha(0)).intern()));
        if (!TextUtils.isEmpty(m7685)) {
            this.f1788 = ISAdQualityAdType.fromInt(Integer.parseInt(m7685));
        }
        this.f1790 = jSONObject.optJSONObject(m7584((char) TextUtils.getCapsMode("", 0, 0), (ViewConfiguration.getMinimumFlingVelocity() >> 16) + 10, 6 - View.MeasureSpec.makeMeasureSpec(0, 0)).intern());
        this.f1789 = kj.m8416(jSONObject, m7584((char) (40976 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1))), 15 - ImageFormat.getBitsPerPixel(0), MotionEvent.axisFromString("") + 11).intern(), new ArrayList());
        this.f1791 = eb.m7685(jSONObject.optString(m7584((char) ((ViewConfiguration.getKeyRepeatDelay() >> 16) + 45316), 25 - (ExpandableListView.getPackedPositionForChild(0, 0) > 0L ? 1 : (ExpandableListView.getPackedPositionForChild(0, 0) == 0L ? 0 : -1)), KeyEvent.keyCodeFromString("") + 10).intern()));
        this.f1787 = eb.m7685(jSONObject.optString(m7584((char) Gravity.getAbsoluteGravity(0, 0), 36 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), (ViewConfiguration.getMaximumDrawingCacheSize() >> 24) + 14).intern()));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String m7589() {
        int i = 2 % 2;
        int i2 = f1785 + 81;
        int i3 = i2 % 128;
        f1784 = i3;
        int i4 = i2 % 2;
        String str = this.f1792;
        int i5 = i3 + 107;
        f1785 = i5 % 128;
        if (i5 % 2 != 0) {
            int i6 = 10 / 0;
        }
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ISAdQualityAdType m7588() {
        int i = 2 % 2;
        int i2 = f1785 + 115;
        f1784 = i2 % 128;
        if (i2 % 2 != 0) {
            return this.f1788;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final JSONObject m7587() {
        int i = 2 % 2;
        int i2 = f1784;
        int i3 = i2 + 61;
        f1785 = i3 % 128;
        int i4 = i3 % 2;
        JSONObject jSONObject = this.f1790;
        int i5 = i2 + 91;
        f1785 = i5 % 128;
        int i6 = i5 % 2;
        return jSONObject;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final List<String> m7590() {
        int i = 2 % 2;
        int i2 = f1784;
        int i3 = i2 + 1;
        f1785 = i3 % 128;
        int i4 = i3 % 2;
        List<String> list = this.f1789;
        int i5 = i2 + 31;
        f1785 = i5 % 128;
        if (i5 % 2 == 0) {
            return list;
        }
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String m7586() {
        int i = 2 % 2;
        int i2 = f1784 + 7;
        int i3 = i2 % 128;
        f1785 = i3;
        int i4 = i2 % 2;
        String str = this.f1791;
        int i5 = i3 + 57;
        f1784 = i5 % 128;
        int i6 = i5 % 2;
        return str;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String m7585() {
        int i = 2 % 2;
        int i2 = f1784 + 11;
        int i3 = i2 % 128;
        f1785 = i3;
        if (i2 % 2 != 0) {
            Object obj = null;
            super.hashCode();
            throw null;
        }
        String str = this.f1787;
        int i4 = i3 + 29;
        f1784 = i4 % 128;
        int i5 = i4 % 2;
        return str;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7584(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f1786[c.f1198 + i] ^ (c.f1198 * f1783)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
