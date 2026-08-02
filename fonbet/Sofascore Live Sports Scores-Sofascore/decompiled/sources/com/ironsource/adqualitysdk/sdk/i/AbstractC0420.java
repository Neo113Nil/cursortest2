package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.ISAdQualityLogLevel;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ӟ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0420 {
    static {
        StringFog.decrypt("2JtXzrzeLNXyjBjhi+Asxv2ATNk=\n", "kek4oO+xWac=\n");
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static void m243(String str, String str2) {
        m252(str, str, str2, null, null, false);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public static void m244(String str, String str2) {
        m251(str, str, str2, null, false);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m246(String str, String str2, String str3, boolean z) {
        if (m247()) {
            m249(str);
        } else if (z && m248().shouldPrintLog(ISAdQualityLogLevel.VERBOSE)) {
            m249(str2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m252(String str, String str2, String str3, Throwable th, AbstractC0463 abstractC0463, boolean z) {
        if (m247()) {
            m249(str);
            if (abstractC0463 != null) {
                abstractC0463.toString();
                return;
            }
            return;
        }
        if (z && m248().shouldPrintLog(ISAdQualityLogLevel.ERROR)) {
            m249(str2);
            if (abstractC0463 != null) {
                abstractC0463.toString();
            }
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static void m245(String str, String str2) {
        m252(str, str, str2, null, null, true);
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static boolean m247() {
        boolean z;
        C0808 m476 = C0808.m476();
        synchronized (m476) {
            z = m476.f2597;
        }
        return z;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m254(String str, String str2, boolean z) {
        m252(str, str, str2, null, null, z);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ISAdQualityLogLevel m248() {
        ISAdQualityLogLevel iSAdQualityLogLevel;
        C0808 m476 = C0808.m476();
        synchronized (m476) {
            iSAdQualityLogLevel = m476.f2596;
        }
        return iSAdQualityLogLevel;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m253(String str, String str2, String str3, boolean z) {
        if (m247()) {
            m249(str);
        } else if (z && m248().shouldPrintLog(ISAdQualityLogLevel.INFO)) {
            m249(str2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m250(String str, String str2) {
        m251(str, str, str2, null, true);
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m251(String str, String str2, String str3, Object obj, boolean z) {
        if (obj != null) {
            obj.toString();
        }
        if (m247()) {
            m249(str);
        } else if (z && m248().shouldPrintLog(ISAdQualityLogLevel.DEBUG)) {
            m249(str2);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static String m249(String str) {
        return ceo.e("3xsi3u9aWJP1DG3x2GRYgPoAOcmGFQ==\n", "lmlNsLw1LeE=\n", str);
    }
}
