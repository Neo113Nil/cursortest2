package com.moloco.sdk.internal.services;

import android.content.Context;
import defpackage.mqi;
import defpackage.ypa;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class s {
    public final Context a;
    public final mqi b = ypa.b(new com.moloco.sdk.acm.services.d(this, 8));

    public s(Context context) {
        this.a = context;
    }

    /*  JADX ERROR: NullPointerException in pass: InitCodeVariables
        java.lang.NullPointerException
        */
    public final com.moloco.sdk.internal.services.c0 a() {
        /*
            r17 = this;
            r0 = r17
            com.moloco.sdk.internal.services.c0 r1 = new com.moloco.sdk.internal.services.c0
            java.lang.String r2 = android.os.Build.MANUFACTURER
            java.lang.String r3 = ""
            if (r2 != 0) goto Lb
            r2 = r3
        Lb:
            java.lang.String r4 = android.os.Build.MODEL
            if (r4 != 0) goto L10
            r4 = r3
        L10:
            java.lang.String r5 = android.os.Build.HARDWARE
            r6 = r3
            if (r5 != 0) goto L16
            goto L17
        L16:
            r3 = r5
        L17:
            mqi r7 = r0.b
            java.lang.Object r7 = r7.getValue()
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            boolean r7 = r7.booleanValue()
            java.lang.String r8 = android.os.Build.VERSION.RELEASE
            r8.getClass()
            r8 = r5
            int r5 = android.os.Build.VERSION.SDK_INT
            java.util.Locale r9 = java.util.Locale.getDefault()
            java.lang.String r9 = r9.getLanguage()
            r9.getClass()
            android.content.Context r0 = r0.a
            java.lang.Class<android.telephony.TelephonyManager> r10 = android.telephony.TelephonyManager.class
            java.lang.Object r0 = r0.getSystemService(r10)
            android.telephony.TelephonyManager r0 = (android.telephony.TelephonyManager) r0
            if (r0 == 0) goto L49
            java.lang.String r0 = r0.getNetworkOperatorName()
            if (r0 == 0) goto L49
            goto L4a
        L49:
            r0 = r6
        L4a:
            android.content.res.Resources r10 = android.content.res.Resources.getSystem()
            android.util.DisplayMetrics r10 = r10.getDisplayMetrics()
            float r10 = r10.density
            long r11 = java.lang.System.currentTimeMillis()
            long r13 = android.os.SystemClock.elapsedRealtime()
            long r11 = r11 - r13
            if (r8 != 0) goto L60
            r8 = r6
        L60:
            java.lang.String r13 = android.os.Build.BRAND
            if (r13 != 0) goto L71
            r15 = r7
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r15
            r15 = r11
            r12 = r6
            r11 = r8
            r6 = r9
        L6e:
            r8 = r10
            r9 = r15
            goto L7c
        L71:
            r6 = r7
            r7 = r0
            r0 = r1
            r1 = r2
            r2 = r4
            r4 = r6
            r15 = r11
            r12 = r13
            r6 = r9
            r11 = r8
            goto L6e
        L7c:
            r0.<init>(r1, r2, r3, r4, r5, r6, r7, r8, r9, r11, r12)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.moloco.sdk.internal.services.s.a():com.moloco.sdk.internal.services.c0");
    }
}
