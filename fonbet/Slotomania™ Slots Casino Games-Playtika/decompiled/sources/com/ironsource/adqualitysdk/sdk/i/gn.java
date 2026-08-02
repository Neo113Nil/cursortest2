package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.five_corp.ad.FiveAd;
import com.google.common.base.Ascii;

/* loaded from: classes6.dex */
public final class gn extends gt {

    /* renamed from: ﮐ, reason: contains not printable characters */
    private static int f2213 = 0;

    /* renamed from: ﺙ, reason: contains not printable characters */
    private static int f2214 = 1;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2215 = 5;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f2216 = -884433757;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static int f2217 = -1545621584;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static short[] f2218;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static byte[] f2219 = {Ascii.DC2, 83, -84, -97, 125, 83, 104, -70, 115, 67, -50, -114, 115, 124, 116, -118, -97, 125, 115, 72, -79, -114, 124, 1, -52, 51, 32, -62, -52};

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ｋ */
    public final String mo7798() {
        int i = 2 % 2;
        int i2 = f2214 + 3;
        f2213 = i2 % 128;
        String intern = (i2 % 2 != 0 ? m7808((short) ExpandableListView.getPackedPositionType(1L), 884433856 << View.MeasureSpec.getMode(0), 2 >>> View.MeasureSpec.getSize(0), 20512 >> AndroidCharacter.getMirror((char) 16), (byte) (Color.green(1) * 87)) : m7808((short) ExpandableListView.getPackedPositionType(0L), 884433856 - View.MeasureSpec.getMode(0), (-6) - View.MeasureSpec.getSize(0), AndroidCharacter.getMirror('0') + 20512, (byte) (112 - Color.green(0)))).intern();
        int i3 = f2214 + 69;
        f2213 = i3 % 128;
        if (i3 % 2 == 0) {
            return intern;
        }
        throw null;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻐ */
    public final Class mo7796() {
        int i = 2 % 2;
        int i2 = f2213 + 55;
        f2214 = i2 % 128;
        if (i2 % 2 == 0) {
            int i3 = 6 / 0;
        }
        return FiveAd.class;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﾇ */
    public final be mo7799() {
        int i = 2 % 2;
        br brVar = new br(mo7797());
        int i2 = f2213 + 1;
        f2214 = i2 % 128;
        int i3 = i2 % 2;
        return brVar;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.gt
    /* renamed from: ﻛ */
    public final String mo7797() {
        int i = 2 % 2;
        int i2 = f2213 + 11;
        f2214 = i2 % 128;
        String intern = (i2 % 2 == 0 ? m7808((short) View.getDefaultSize(1, 1), 884433859 % (ViewConfiguration.getFadingEdgeLength() << 12), 79 - (TypedValue.complexToFloat(1) > 2.0f ? 1 : (TypedValue.complexToFloat(1) == 2.0f ? 0 : -1)), 1545621608 >>> TextUtils.lastIndexOf("", (char) 5), (byte) (10 - MotionEvent.axisFromString(""))) : m7808((short) View.getDefaultSize(0, 0), 884433859 - (ViewConfiguration.getFadingEdgeLength() >> 16), (-6) - (TypedValue.complexToFloat(0) > 0.0f ? 1 : (TypedValue.complexToFloat(0) == 0.0f ? 0 : -1)), TextUtils.lastIndexOf("", '0') + 1545621608, (byte) ((-50) - MotionEvent.axisFromString("")))).intern();
        int i3 = f2214 + 79;
        f2213 = i3 % 128;
        if (i3 % 2 == 0) {
            return intern;
        }
        Object obj = null;
        super.hashCode();
        throw null;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m7808(short s, int i, int i2, int i3, byte b) {
        String obj;
        synchronized (n.f3088) {
            StringBuilder sb = new StringBuilder();
            int i4 = f2215;
            int i5 = i2 + i4;
            int i6 = i5 == -1 ? 1 : 0;
            if (i6 != 0) {
                byte[] bArr = f2219;
                if (bArr != null) {
                    i5 = (byte) (bArr[f2217 + i3] + i4);
                } else {
                    i5 = (short) (f2218[f2217 + i3] + i4);
                }
            }
            if (i5 > 0) {
                n.f3090 = ((i3 + i5) - 2) + f2217 + i6;
                n.f3091 = b;
                n.f3092 = (char) (i + f2216);
                sb.append(n.f3092);
                n.f3093 = n.f3092;
                n.f3089 = 1;
                while (n.f3089 < i5) {
                    byte[] bArr2 = f2219;
                    if (bArr2 != null) {
                        int i7 = n.f3090;
                        n.f3090 = i7 - 1;
                        n.f3092 = (char) (n.f3093 + (((byte) (bArr2[i7] + s)) ^ n.f3091));
                    } else {
                        short[] sArr = f2218;
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
