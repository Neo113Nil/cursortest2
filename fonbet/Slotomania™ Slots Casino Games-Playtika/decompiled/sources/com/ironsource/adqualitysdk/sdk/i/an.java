package com.ironsource.adqualitysdk.sdk.i;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.SystemClock;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import io.ktor.util.date.GMTDateParser;
import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* loaded from: classes3.dex */
public final class an {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f352 = 1;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static char f353 = 5;

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static char[] f354 = {'g', 'e', 't', 'I', 'n', GMTDateParser.SECONDS, 'a', 'c', 'r', 'i', 'R', 'v', AbstractJsonLexerKt.UNICODE_ESC, GMTDateParser.DAY_OF_MONTH, 'o', 'x', '.', 'l', 'b', GMTDateParser.MINUTES, 'L', 'B', GMTDateParser.MONTH, GMTDateParser.HOURS, 'j'};

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f355;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static Object m6013(Context context) {
        int i = 2 % 2;
        try {
            Object invoke = kk.m8442(m6016(), m6014(View.resolveSize(0, 0) + 11, "\u0001\u0002\u0003\u0004\u0000\t\u0001\u0007\u0002\tp", (byte) ((SystemClock.uptimeMillis() > 0L ? 1 : (SystemClock.uptimeMillis() == 0L ? 0 : -1)) + 10)).intern(), Arrays.asList(context)).invoke(null, context);
            int i2 = f352 + 21;
            f355 = i2 % 128;
            int i3 = i2 % 2;
            return invoke;
        } catch (IllegalAccessException | InvocationTargetException unused) {
            int i4 = f355 + 111;
            f352 = i4 % 128;
            int i5 = i4 % 2;
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m6015(Object obj, BroadcastReceiver broadcastReceiver, IntentFilter intentFilter) {
        int i = 2 % 2;
        int i2 = f355 + 83;
        f352 = i2 % 128;
        int i3 = i2 % 2;
        try {
            kk.m8442(obj, m6014((ViewConfiguration.getEdgeSlop() >> 16) + 16, "\u0006\u0003\u0004\u0005\u0007\u0000\u0003\u0006\u000b\u0000\u0006\u0002\u0006\u000e\u0003\u0006", (byte) ((ViewConfiguration.getTapTimeout() >> 16) + 57)).intern(), Arrays.asList(broadcastReceiver, intentFilter)).invoke(obj, broadcastReceiver, intentFilter);
            int i4 = f355 + 67;
            f352 = i4 % 128;
            if (i4 % 2 != 0) {
                return;
            }
            Object obj2 = null;
            super.hashCode();
            throw null;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m6017(Object obj, BroadcastReceiver broadcastReceiver) {
        int i = 2 % 2;
        int i2 = f352 + 31;
        f355 = i2 % 128;
        int i3 = i2 % 2;
        try {
            kk.m8442(obj, m6014(19 - (ViewConfiguration.getScrollFriction() > 0.0f ? 1 : (ViewConfiguration.getScrollFriction() == 0.0f ? 0 : -1)), "\u000e\u0002\u0006\u0003\u0004\u0005\u0007\u0000\u0003\u0006\u000b\u0000\u0006\u0002\u0006\u000e\u0003\u0006", (byte) (5 - Color.argb(0, 0, 0, 0))).intern(), Arrays.asList(broadcastReceiver)).invoke(obj, broadcastReceiver);
            int i4 = f352 + 83;
            f355 = i4 % 128;
            int i5 = i4 % 2;
        } catch (IllegalAccessException | InvocationTargetException unused) {
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Class m6016() {
        int i = 2 % 2;
        int i2 = f355 + 69;
        f352 = i2 % 128;
        int i3 = i2 % 2;
        Class m8433 = kk.m8433(m6014(59 - ExpandableListView.getPackedPositionChild(0L), "\t\u0001\u0012\r\u0013\u000e\n\u0012\u0011\u0012\f\t\u0007\u0010\u0017\r\u000b\t\f\b\u0007\u0006\u0004\u0011\t\u0001\u0005\u0001\u0003\u0006\u0011\u0006\u0013\t\u0003\u0002\u0000\u0003\u000f\u0015\f\t\u0007\u0010\u0017\u0006\u000b\t\f\b\u0007\u0006\u0007\u0002\t\u0001\u0005\u0001\u0003\u0006", (byte) (113 - (TypedValue.complexToFraction(0, 0.0f, 0.0f) > 0.0f ? 1 : (TypedValue.complexToFraction(0, 0.0f, 0.0f) == 0.0f ? 0 : -1)))).intern(), false);
        int i4 = f352 + 101;
        f355 = i4 % 128;
        int i5 = i4 % 2;
        return m8433;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m6014(int i, String str, byte b) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (j.f2674) {
            char[] cArr3 = f354;
            char c = f353;
            char[] cArr4 = new char[i];
            if (i % 2 != 0) {
                i--;
                cArr4[i] = (char) (cArr2[i] - b);
            }
            if (i > 1) {
                j.f2681 = 0;
                while (j.f2681 < i) {
                    j.f2680 = cArr2[j.f2681];
                    j.f2677 = cArr2[j.f2681 + 1];
                    if (j.f2680 == j.f2677) {
                        cArr4[j.f2681] = (char) (j.f2680 - b);
                        cArr4[j.f2681 + 1] = (char) (j.f2677 - b);
                    } else {
                        j.f2679 = j.f2680 / c;
                        j.f2676 = j.f2680 % c;
                        j.f2678 = j.f2677 / c;
                        j.f2675 = j.f2677 % c;
                        if (j.f2676 == j.f2675) {
                            j.f2679 = ((j.f2679 + c) - 1) % c;
                            j.f2678 = ((j.f2678 + c) - 1) % c;
                            int i2 = (j.f2679 * c) + j.f2676;
                            int i3 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i2];
                            cArr4[j.f2681 + 1] = cArr3[i3];
                        } else if (j.f2679 == j.f2678) {
                            j.f2676 = ((j.f2676 + c) - 1) % c;
                            j.f2675 = ((j.f2675 + c) - 1) % c;
                            int i4 = (j.f2679 * c) + j.f2676;
                            int i5 = (j.f2678 * c) + j.f2675;
                            cArr4[j.f2681] = cArr3[i4];
                            cArr4[j.f2681 + 1] = cArr3[i5];
                        } else {
                            int i6 = (j.f2679 * c) + j.f2675;
                            int i7 = (j.f2678 * c) + j.f2676;
                            cArr4[j.f2681] = cArr3[i6];
                            cArr4[j.f2681 + 1] = cArr3[i7];
                        }
                    }
                    j.f2681 += 2;
                }
            }
            str2 = new String(cArr4);
        }
        return str2;
    }
}
