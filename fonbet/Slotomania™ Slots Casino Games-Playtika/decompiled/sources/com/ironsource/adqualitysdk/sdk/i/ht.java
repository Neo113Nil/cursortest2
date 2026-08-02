package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.ExpandableListView;
import com.vungle.ads.internal.protos.Sdk;

/* loaded from: classes5.dex */
public final class ht extends hi<View.OnTouchListener> implements View.OnTouchListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static int f2412 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static int f2413;

    /* renamed from: ﻐ, reason: contains not printable characters */
    private e f2414;

    /* renamed from: ｋ, reason: contains not printable characters */
    private static char[] f2411 = {62636, 5436, 14293, 20895, 29266, 40181, 48813, 57208, 63746, 7081, 9341, 17949, 24769, 33147, 41791, 52728, 61334, 2113, 11006, 13490, 21846, 30482, 37306, 45686, 57158, 16064, 7187, 31359, 22965, 46934, 38220, 62650, 53931, 12375, 4029, 28154, 19203, 43671, 35038, 58920, 50294, 9132, 276, 8018, 32503, 23785, 47707, 39344, 63476, 54591, 13466, 4800};

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static long f2410 = 5055208583091249585L;

    public interface e {
        /* renamed from: ﻛ */
        boolean mo7411(ht htVar, View view, MotionEvent motionEvent);
    }

    public ht(View.OnTouchListener onTouchListener, e eVar) {
        super(onTouchListener);
        this.f2414 = eVar;
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(View view, MotionEvent motionEvent) {
        int i = 2 % 2;
        int i2 = f2412 + 39;
        f2413 = i2 % 128;
        int i3 = i2 % 2;
        try {
            this.f2414.mo7411(this, view, motionEvent);
            int i4 = f2412 + Sdk.SDKError.Reason.ASSET_FAILED_STATUS_CODE_VALUE;
            f2413 = i4 % 128;
            int i5 = i4 % 2;
        } catch (Throwable th) {
            kl.m8458(m7855((char) ((-16714525) - Color.rgb(0, 0, 0)), TextUtils.getOffsetBefore("", 0), TextUtils.lastIndexOf("", '0') + 25).intern(), m7855((char) (57091 - ExpandableListView.getPackedPositionType(0L)), (KeyEvent.getMaxKeyCode() >> 16) + 24, 28 - (ViewConfiguration.getScrollBarSize() >> 8)).intern(), th, false);
        }
        if (mo6363() != null) {
            return mo6363().onTouch(view, motionEvent);
        }
        return false;
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    private static String m7855(char c, int i, int i2) {
        String str;
        synchronized (c.f1197) {
            char[] cArr = new char[i2];
            c.f1198 = 0;
            while (c.f1198 < i2) {
                cArr[c.f1198] = (char) ((f2411[c.f1198 + i] ^ (c.f1198 * f2410)) ^ c);
                c.f1198++;
            }
            str = new String(cArr);
        }
        return str;
    }
}
