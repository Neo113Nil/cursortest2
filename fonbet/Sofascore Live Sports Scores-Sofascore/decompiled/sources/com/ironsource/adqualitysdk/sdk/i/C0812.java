package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴭ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0812 extends AbstractC0978 {

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2610 = StringFog.decrypt("NHps\n", "Rw4f/QuvLdg=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2609 = StringFog.decrypt("WRY=\n", "LWUuJ/T8LJQ=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2608 = StringFog.decrypt("YDg=\n", "FUxyKFG9+jo=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public final int f2613 = UnityAdsConstants.RequestPolicy.RETRY_MAX_DURATION;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f2612 = StringFog.decrypt("Rc8MEyvvUw==\n", "Nb1jZ0SBIPk=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f2611 = StringFog.decrypt("6cDOjG9uRpL/\n", "jKyr7xscKfw=\n");

    public C0812(C1037 c1037) {
        this.f3205 = c1037;
    }

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final String m495() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("q31V\n", "3g85hhhlyHk=\n"));
        return optJSONObject != null ? optJSONObject.optString(StringFog.decrypt("dQ==\n", "EOGiz9IiGuY=\n"), this.f2611) : this.f2611;
    }

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final long m496() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optLong(f2608, 0L);
    }

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final long m497() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optLong(f2609, 0L);
    }

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final int m498() {
        JSONObject jSONObject;
        if (((C0346) AbstractC0274.m142()).f849) {
            synchronized (this) {
                jSONObject = this.f3206;
            }
            if (jSONObject.optBoolean(StringFog.decrypt("0CpgQQ==\n", "tEMBJmLCaJo=\n"), false)) {
                return m501();
            }
        }
        return m597().optInt(StringFog.decrypt("N2nZ\n", "Wh+qlWGv+b0=\n"), 9850);
    }

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final int m499() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optInt(StringFog.decrypt("sCig\n", "3U3QRhGaoT4=\n"), 40);
    }

    /* renamed from: ｋ, reason: contains not printable characters */
    public final List m500() {
        JSONObject jSONObject;
        C1037 c1037 = this.f3205;
        JSONObject jSONObject2 = c1037.f3308;
        String str = c1037.f3309;
        List arrayList = new ArrayList();
        String str2 = AbstractC0523.f1759;
        JSONArray optJSONArray = jSONObject2.optJSONArray(str);
        if (optJSONArray != null) {
            arrayList = AbstractC0523.m344(optJSONArray);
        }
        synchronized (this) {
            jSONObject = this.f3206;
        }
        String decrypt = StringFog.decrypt("1ZaT\n", "sOLrD96Qhcg=\n");
        List arrayList2 = new ArrayList();
        JSONArray optJSONArray2 = jSONObject.optJSONArray(decrypt);
        if (optJSONArray2 != null) {
            arrayList2 = AbstractC0523.m344(optJSONArray2);
        }
        arrayList.addAll(arrayList2);
        return arrayList;
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final int m501() {
        JSONObject jSONObject;
        synchronized (this) {
            jSONObject = this.f3206;
        }
        return jSONObject.optInt(StringFog.decrypt("KJdP9PSXuA==\n", "TP4uk5nhy3c=\n"), 1000000);
    }
}
