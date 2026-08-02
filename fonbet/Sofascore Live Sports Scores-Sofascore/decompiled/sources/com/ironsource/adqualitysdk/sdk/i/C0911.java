package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.Arrays;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ỵ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0911 implements Comparable {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0290 f3047;

    public C0911(C0290 c0290) {
        this.f3047 = c0290;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        JSONObject jSONObject;
        C0911 c0911 = (C0911) obj;
        synchronized (this) {
            jSONObject = this.f3047.f531;
        }
        long optLong = jSONObject.optLong(StringFog.decrypt("F4I=\n", "Y/Fhe7E0U2s=\n"));
        long m536 = c0911.m536();
        if (optLong < m536) {
            return -1;
        }
        if (optLong != m536) {
            return 1;
        }
        long m534 = m534();
        long m5342 = c0911.m534();
        if (m534 < m5342) {
            return -1;
        }
        return m534 == m5342 ? 0 : 1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C0911.class != obj.getClass()) {
            return false;
        }
        return this.f3047.f530.equals(((C0911) obj).f3047.f530);
    }

    public final int hashCode() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3047.f531;
        }
        if (jSONObject != null) {
            return m535().hashCode();
        }
        return 0;
    }

    public final String toString() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3047.f531;
        }
        return jSONObject.toString();
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String m533() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3047.f531;
        }
        return jSONObject.optString(StringFog.decrypt("87ig\n", "htHEHDmCP4g=\n"), null);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final long m534() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3047.f531;
        }
        return jSONObject.optInt(StringFog.decrypt("EoA=\n", "d+57SweGLFw=\n"));
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final synchronized JSONObject m535() {
        return this.f3047.f531;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final synchronized void m537(int i) {
        JSONObject jSONObject = this.f3047.f531;
        if (jSONObject != null) {
            AbstractC0523.m347(jSONObject, i, Arrays.asList(AbstractC0615.f2003));
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final long m536() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3047.f531;
        }
        return jSONObject.optLong(StringFog.decrypt("F4I=\n", "Y/Fhe7E0U2s=\n"));
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m538(String str) {
        JSONObject jSONObject;
        try {
            synchronized (this) {
                jSONObject = this.f3047.f531;
            }
            jSONObject.put(StringFog.decrypt("Ad9C\n", "dLYm1BvAEVg=\n"), str);
        } catch (JSONException unused) {
        }
    }
}
