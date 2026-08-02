package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import android.content.SharedPreferences;
import android.graphics.Color;
import android.graphics.PointF;
import android.os.Process;
import android.provider.Settings;
import android.text.AndroidCharacter;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewConfiguration;
import java.util.UUID;

/* loaded from: classes5.dex */
public final class iq {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f2558 = 0;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2559 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2560 = 171;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m8095(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2558 + 43;
        f2559 = i2 % 128;
        int i3 = i2 % 2;
        m.m8520(str, str2);
        if (i3 == 0) {
            int i4 = 28 / 0;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static void m8096(String str, String str2) {
        int i = 2 % 2;
        int i2 = f2559 + 59;
        f2558 = i2 % 128;
        int i3 = i2 % 2;
        m.m8527(str, str2);
        int i4 = f2558 + 89;
        f2559 = i4 % 128;
        if (i4 % 2 == 0) {
            throw null;
        }
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static String m8093(Context context) {
        int i = 2 % 2;
        int i2 = f2558 + 65;
        f2559 = i2 % 128;
        if (i2 % 2 == 0) {
            String string = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m8092(AndroidCharacter.getMirror('\f') * 21, true, 4066 >> (Process.myTid() % 79), "�\u000b\b\u0002�\ufff8\u0002�\ufffa\u0007", 77 >>> (Process.myTid() / 65)).intern());
            if (string != null) {
                return string;
            }
        } else {
            String string2 = Settings.Secure.getString(context.getApplicationContext().getContentResolver(), m8092(':' - AndroidCharacter.getMirror('0'), false, 274 - (Process.myTid() >> 22), "�\u000b\b\u0002�\ufff8\u0002�\ufffa\u0007", 8 - (Process.myTid() >> 22)).intern());
            if (string2 != null) {
                return string2;
            }
        }
        int i3 = f2558 + 29;
        f2559 = i3 % 128;
        int i4 = i3 % 2;
        m8096(m8092((ViewConfiguration.getKeyRepeatDelay() >> 16) + 33, true, KeyEvent.keyCodeFromString("") + 265, "\u0014\u0017\u0005\u0015\u0004\ufff1ￂ￣\ufff8\uffe7\uffe7￭\ufff5￫\u0015\u0007\u0005\u0010\u0007\u0014\u0007\b\u0007\u0014\ufff2\u0006\u0007\u0014\u0003\n\ufff5\u0006\u0007", 14 - (ViewConfiguration.getScrollBarFadeDuration() >> 16)).intern(), m8092(46 - (ViewConfiguration.getMaximumFlingVelocity() >> 16), true, 257 - (ViewConfiguration.getKeyRepeatTimeout() >> 16), "\u0013\u001d\uffffￊ\uffd8￮\ufff3\t￮\ufff3\ufff9￼￮\ufff8￫ￊ\u0012\r\u001e\u000f\u0010ￊ\u001e\uffd1\u0018\u000e\u0016\u001f\u0019￭\uffd8\u000e\u0013ￊ\u000e\u000f\u001e\u000b\u001c\u000f\u0018\u000f\u0011ￊ\u0011\u0018", 30 - (ViewConfiguration.getScrollBarSize() >> 8)).intern());
        String m8094 = m8094(context);
        int i5 = f2559 + 29;
        f2558 = i5 % 128;
        int i6 = i5 % 2;
        return m8094;
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static String m8094(Context context) {
        int i = 2 % 2;
        int i2 = f2558 + 21;
        f2559 = i2 % 128;
        int i3 = i2 % 2;
        SharedPreferences sharedPreferences = context.getSharedPreferences(m8092((ViewConfiguration.getTapTimeout() >> 16) + 11, false, ((Process.getThreadPriority(0) + 20) >> 6) + 268, "\u0015ￍ\u0003\u0001\u0012\u0013\u000e\u0011\u0004ￍ\n", 4 - View.MeasureSpec.getMode(0)).intern(), 0);
        String string = sharedPreferences.getString(m8092((ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)) + 17, false, Color.blue(0) + 273, "\u0003\ufffe\r\t\t\u0007\u0006\ufffb\uffc8\u0001\uffff\b\uffff\f\ufffb\u000e\uffff\ufffe", 1 - TextUtils.indexOf((CharSequence) "", '0', 0)).intern(), null);
        if (TextUtils.isEmpty(string)) {
            string = UUID.randomUUID().toString();
            sharedPreferences.edit().putString(m8092(18 - (ViewConfiguration.getMaximumDrawingCacheSize() >> 24), false, (PointF.length(0.0f, 0.0f) > 0.0f ? 1 : (PointF.length(0.0f, 0.0f) == 0.0f ? 0 : -1)) + 273, "\u0003\ufffe\r\t\t\u0007\u0006\ufffb\uffc8\u0001\uffff\b\uffff\f\ufffb\u000e\uffff\ufffe", 3 - (ViewConfiguration.getGlobalActionKeyTimeout() > 0L ? 1 : (ViewConfiguration.getGlobalActionKeyTimeout() == 0L ? 0 : -1))).intern(), string).commit();
        }
        int i4 = f2559 + 109;
        f2558 = i4 % 128;
        int i5 = i4 % 2;
        return string;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static String m8092(int i, boolean z, int i2, String str, int i3) {
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
                cArr3[i4] = (char) (cArr3[i4] - f2560);
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
}
