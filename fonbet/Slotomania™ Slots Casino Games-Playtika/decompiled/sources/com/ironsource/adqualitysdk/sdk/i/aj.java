package com.ironsource.adqualitysdk.sdk.i;

import android.graphics.Color;
import android.text.TextUtils;
import android.view.Gravity;
import android.view.ViewConfiguration;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes3.dex */
public final class aj {

    /* renamed from: ﻐ, reason: contains not printable characters */
    private static int f314 = 0;

    /* renamed from: ﻛ, reason: contains not printable characters */
    private static int f315 = 1;

    /* renamed from: ﾒ, reason: contains not printable characters */
    private static long f316 = -5791257903350168093L;

    /* renamed from: ｋ, reason: contains not printable characters */
    private final ai f317;

    public aj(ai aiVar) {
        this.f317 = aiVar;
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final void m5985(ISAdQualitySegment iSAdQualitySegment) {
        ai aiVar;
        String m5983;
        int i = 2 % 2;
        int i2 = f314 + 23;
        f315 = i2 % 128;
        if (i2 % 2 == 0) {
            aiVar = this.f317;
            m5983 = m5983("얐䫍\udb01桝\uf8bcৱ鹆⺃뿞찮嵹", 36684 % TextUtils.lastIndexOf("", 'I', 0));
        } else {
            aiVar = this.f317;
            m5983 = m5983("얐䫍\udb01桝\uf8bcৱ鹆⺃뿞찮嵹", TextUtils.lastIndexOf("", '0', 0) + 36684);
        }
        aiVar.m5959(m5983.intern(), m5984(iSAdQualitySegment));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static JSONObject m5984(ISAdQualitySegment iSAdQualitySegment) {
        int i = 2 % 2;
        JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
        try {
            if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                jSONObject.put(m5983("얐戗誫㌷", 42899 - Gravity.getAbsoluteGravity(0, 0)).intern(), iSAdQualitySegment.getName());
            }
            if (iSAdQualitySegment.getAge() != -1) {
                jSONObject.put(m5983("얐\ue295讪냃", 10007 - (ViewConfiguration.getMaximumFlingVelocity() >> 16)).intern(), iSAdQualitySegment.getAge());
            }
            if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                jSONObject.put(m5983("얐\uf4c7꜀噄", 12611 - (ViewConfiguration.getScrollDefaultDelay() >> 16)).intern(), iSAdQualitySegment.getGender());
            }
            if (iSAdQualitySegment.getLevel() != -1) {
                jSONObject.put(m5983("얐讒妯\u2fd8", (ViewConfiguration.getWindowTouchSlop() >> 8) + 19997).intern(), iSAdQualitySegment.getLevel());
            }
            if (iSAdQualitySegment.getIsPaying() != null) {
                int i2 = f315 + 91;
                f314 = i2 % 128;
                int i3 = i2 % 2;
                jSONObject.put(m5983("얐느⮄ꂓ", (-16746749) - Color.rgb(0, 0, 0)).intern(), iSAdQualitySegment.getIsPaying().get());
            }
            if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                int i4 = f314 + 47;
                f315 = i4 % 128;
                int i5 = i4 % 2;
                jSONObject.put(m5983("얐ؗ䊸轄쯣", Color.argb(0, 0, 0, 0) + 50077).intern(), iSAdQualitySegment.getInAppPurchasesTotal());
                int i6 = f315 + 87;
                f314 = i6 % 128;
                int i7 = i6 % 2;
            }
            if (iSAdQualitySegment.getUserCreationDate() != 0) {
                jSONObject.put(m5983("얐\udcef\uf772觬", 6521 - (ViewConfiguration.getMinimumFlingVelocity() >> 16)).intern(), iSAdQualitySegment.getUserCreationDate());
            }
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    private static String m5983(String str, int i) {
        String str2;
        char[] cArr = str;
        if (str != null) {
            cArr = str.toCharArray();
        }
        char[] cArr2 = cArr;
        synchronized (i.f2454) {
            i.f2455 = i;
            char[] cArr3 = new char[cArr2.length];
            i.f2453 = 0;
            while (i.f2453 < cArr2.length) {
                cArr3[i.f2453] = (char) ((cArr2[i.f2453] ^ (i.f2453 * i.f2455)) ^ f316);
                i.f2453++;
            }
            str2 = new String(cArr3);
        }
        return str2;
    }
}
