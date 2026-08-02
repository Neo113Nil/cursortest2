package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ἶ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0918 {

    /* renamed from: ףּ, reason: contains not printable characters */
    public static final String f3063;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static final String f3064;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static final String f3065;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f3066;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f3067;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public HashMap f3068;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public C0950 f3069;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public F f3070;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public String f3071;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final String f3072;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final String f3073;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f3074;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final String f3075;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f3076;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final C0950 f3077;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final JSONObject f3078;

    static {
        StringFog.decrypt("FudF2qplIS0ny0TaqW8y\n", "VYgrtM8GVUI=\n");
        StringFog.decrypt("wjN1eQ==\n", "rFIYHMaxhDo=\n");
        StringFog.decrypt("FDUS6uo/gy8RMQQ=\n", "cFxhmoZe+mE=\n");
        StringFog.decrypt("8TZ4/QGizw==\n", "h1MKjmjNoWg=\n");
        StringFog.decrypt("yGLj9XTA\n", "pQuNphCrC/8=\n");
        StringFog.decrypt("4Uw2fpk1\n", "jC1OLf1eoes=\n");
        f3067 = StringFog.decrypt("gm01bHJaSIaffQhdb2hGjJ96\n", "8QleOB0bL+M=\n");
        f3066 = StringFog.decrypt("ZzgB8ZIflzZj\n", "EF1jp/t64Hw=\n");
        f3065 = StringFog.decrypt("H7O+l9ZP\n", "fNzQ5KI8Ml4=\n");
        StringFog.decrypt("/M/G7L+B8x710N39\n", "m6Opjt7tsHE=\n");
        f3064 = StringFog.decrypt("MB91RPAhOQ==\n", "XXoYJpVTSkY=\n");
        f3063 = StringFog.decrypt("9qP9FqSSAM/p\n", "msqOYsH8Zb0=\n");
        StringFog.decrypt("juoSkHlK+hs=\n", "745U+Rwmnmg=\n");
    }

    public C0918(String str, C0950 c0950) {
        this.f3078 = new JSONObject();
        try {
            JSONObject jSONObject = new JSONObject(str);
            this.f3078 = jSONObject;
            this.f3077 = c0950;
            this.f3076 = jSONObject.optString(StringFog.decrypt("z2Bksg==\n", "oQEJ1ydSU1A=\n"));
            this.f3075 = jSONObject.optString(StringFog.decrypt("WukbsmogyHBf7Q0=\n", "PoBowgZBsT4=\n"));
            this.f3074 = jSONObject.optString(StringFog.decrypt("vYVDQforZg==\n", "y+AxMpNECDg=\n"));
            this.f3073 = jSONObject.optString(StringFog.decrypt("O0OH0386\n", "VirpgBtROyM=\n"));
            this.f3072 = jSONObject.optString(StringFog.decrypt("vcByO++W\n", "0KEKaIv9KsY=\n"));
            if (jSONObject.has(StringFog.decrypt("LiglhGPQmAcnNz6V\n", "SURK5gK822g=\n"))) {
                JSONObject optJSONObject = jSONObject.optJSONObject(StringFog.decrypt("YCcOzfqB8RdpOBXc\n", "B0thr5vtsng=\n"));
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    this.f3077.m566(next, optJSONObject.opt(next));
                }
            }
        } catch (Throwable th) {
            AbstractC0962.m595(this.f3076, StringFog.decrypt("nsYlBMIBW8K+1SMC3kYY07TaOQ7TVVfC+9c4BdZIXw==\n", "27RXa7AhOLA=\n"), th, null);
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final HashMap m539() {
        String str = f3063;
        HashMap hashMap = this.f3068;
        if (hashMap == null) {
            JSONObject optJSONObject = this.f3078.optJSONObject(str);
            if (optJSONObject != null) {
                hashMap = new HashMap();
                Iterator<String> keys = optJSONObject.keys();
                while (keys.hasNext()) {
                    String next = keys.next();
                    hashMap.put(next, new C1183(this.f3076, next, optJSONObject.optJSONObject(next)));
                }
            } else {
                hashMap = null;
            }
            this.f3068 = hashMap;
        }
        return hashMap;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final C0950 m540() {
        ArrayList arrayList;
        if (this.f3069 == null) {
            C0950 c0950 = new C0950(AbstractC0523.m343(this.f3078.optJSONObject(f3065), new C0937(this)), this.f3077, true);
            this.f3069 = c0950;
            JSONArray optJSONArray = this.f3078.optJSONArray(f3064);
            if (optJSONArray != null) {
                arrayList = new ArrayList();
                for (int i = 0; i < optJSONArray.length(); i++) {
                    String m645 = AbstractC1088.m645(optJSONArray.optString(i));
                    if (m645 != null) {
                        arrayList.add(m645);
                    }
                }
            } else {
                arrayList = null;
            }
            if (arrayList != null) {
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    c0950.f3167.put((String) it.next(), null);
                }
            }
        }
        return this.f3069;
    }
}
