package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;

/* loaded from: classes4.dex */
public final class ea {

    /* renamed from: ﭸ, reason: contains not printable characters */
    private static int f1906 = 1;

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f1907 = -1091683929;

    /* renamed from: ﱟ, reason: contains not printable characters */
    private static short[] f1908 = null;

    /* renamed from: ﱡ, reason: contains not printable characters */
    private static byte[] f1909 = {0};

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f1910 = 78;

    /* renamed from: ﻏ, reason: contains not printable characters */
    private static int f1911 = 0;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f1912 = 1629295465;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private boolean f1913;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private boolean f1914;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private boolean f1915;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private Object f1916;

    public ea(Object obj) {
        this.f1916 = obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final Object m7684() {
        int i = 2 % 2;
        int i2 = f1906;
        int i3 = i2 + 1;
        f1911 = i3 % 128;
        int i4 = i3 % 2;
        Object obj = this.f1916;
        int i5 = i2 + 99;
        f1911 = i5 % 128;
        int i6 = i5 % 2;
        return obj;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final boolean m7682() {
        int i = 2 % 2;
        Object obj = this.f1916;
        if (obj == null) {
            return false;
        }
        if (obj instanceof Boolean) {
            return ((Boolean) obj).booleanValue();
        }
        if (obj instanceof Integer) {
            int i2 = f1906 + 85;
            f1911 = i2 % 128;
            int i3 = i2 % 2;
            return ((Integer) obj).intValue() != 0;
        }
        if (obj instanceof Long) {
            if (((Long) obj).longValue() == 0) {
                return false;
            }
            int i4 = f1911 + 73;
            f1906 = i4 % 128;
            int i5 = i4 % 2;
            return true;
        }
        if (obj instanceof Double) {
            if (((Double) obj).doubleValue() == 0.0d) {
                return false;
            }
            int i6 = f1911 + 1;
            f1906 = i6 % 128;
            int i7 = i6 % 2;
            return true;
        }
        if (!(obj instanceof String)) {
            return true;
        }
        if (TextUtils.isEmpty((String) obj)) {
            return false;
        }
        int i8 = f1906 + 105;
        f1911 = i8 % 128;
        int i9 = i8 % 2;
        return true;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final Number m7680() {
        int i = 2 % 2;
        int i2 = f1906;
        int i3 = i2 + 79;
        int i4 = i3 % 128;
        f1911 = i4;
        Object obj = null;
        if (i3 % 2 == 0) {
            Object obj2 = this.f1916;
            if (obj2 instanceof Integer) {
                return (Integer) obj2;
            }
            if (!(obj2 instanceof Long)) {
                if (!(obj2 instanceof Double)) {
                    return null;
                }
                int i5 = i2 + 17;
                f1911 = i5 % 128;
                int i6 = i5 % 2;
                return (Double) obj2;
            }
            int i7 = i4 + 7;
            f1906 = i7 % 128;
            if (i7 % 2 != 0) {
                return (Long) obj2;
            }
            int i8 = 96 / 0;
            return (Long) obj2;
        }
        boolean z = this.f1916 instanceof Integer;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final boolean m7683() {
        int i = 2 % 2;
        int i2 = f1906 + 61;
        int i3 = i2 % 128;
        f1911 = i3;
        if (i2 % 2 != 0) {
            throw null;
        }
        boolean z = this.f1913;
        int i4 = i3 + 55;
        f1906 = i4 % 128;
        int i5 = i4 % 2;
        return z;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final ea m7681(boolean z) {
        int i = 2 % 2;
        int i2 = f1906 + 105;
        f1911 = i2 % 128;
        if (i2 % 2 == 0) {
            this.f1913 = z;
            return this;
        }
        this.f1913 = z;
        throw null;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final boolean m7679() {
        int i = 2 % 2;
        int i2 = f1906;
        int i3 = i2 + 53;
        f1911 = i3 % 128;
        int i4 = i3 % 2;
        boolean z = this.f1914;
        int i5 = i2 + 107;
        f1911 = i5 % 128;
        int i6 = i5 % 2;
        return z;
    }

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final ea m7676() {
        int i = 2 % 2;
        int i2 = f1911;
        int i3 = i2 + 109;
        f1906 = i3 % 128;
        int i4 = i3 % 2;
        this.f1914 = true;
        int i5 = i2 + 43;
        f1906 = i5 % 128;
        if (i5 % 2 != 0) {
            return this;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean m7678() {
        int i = 2 % 2;
        int i2 = f1906 + 77;
        int i3 = i2 % 128;
        f1911 = i3;
        int i4 = i2 % 2;
        boolean z = this.f1915;
        int i5 = i3 + 79;
        f1906 = i5 % 128;
        if (i5 % 2 == 0) {
            int i6 = 52 / 0;
        }
        return z;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final ea m7677() {
        int i = 2 % 2;
        int i2 = f1906 + 9;
        int i3 = i2 % 128;
        f1911 = i3;
        int i4 = i2 % 2;
        this.f1915 = true;
        int i5 = i3 + 3;
        f1906 = i5 % 128;
        int i6 = i5 % 2;
        return this;
    }

    public final String toString() {
        int i = 2 % 2;
        int i2 = f1911 + 45;
        f1906 = i2 % 128;
        int i3 = i2 % 2;
        if (!(this.f1916 instanceof String)) {
            return new StringBuilder().append(this.f1916).toString();
        }
        String obj = new StringBuilder().append(m7675((short) TextUtils.indexOf("", "", 0), 1091683963 - View.resolveSizeAndState(0, 0, 0), (-78) - MotionEvent.axisFromString(""), (-1629295465) - ExpandableListView.getPackedPositionGroup(0L), (byte) (ExpandableListView.getPackedPositionGroup(0L) - 80)).intern()).append(this.f1916).append(m7675((short) (((byte) KeyEvent.getModifierMetaStateMask()) + 1), 1091683963 - View.resolveSizeAndState(0, 0, 0), (ViewConfiguration.getZoomControlsTimeout() > 0L ? 1 : (ViewConfiguration.getZoomControlsTimeout() == 0L ? 0 : -1)) - 78, View.MeasureSpec.getSize(0) - 1629295465, (byte) ((ViewConfiguration.getKeyRepeatTimeout() >> 16) - 80)).intern()).toString();
        int i4 = f1906 + 63;
        f1911 = i4 % 128;
        int i5 = i4 % 2;
        return obj;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static String m7675(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f1910;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f1909;
                if (bArr != null) {
                    i5 = (byte) (bArr[f1912 + i3] + i4);
                } else {
                    i5 = (short) (f1908[f1912 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f1912 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f1907);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f1909;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f1908;
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
