package com.ironsource.adqualitysdk.sdk.i;

import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ˊ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0323 {

    /* renamed from: ﭖ, reason: contains not printable characters */
    public final List f781;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public final List f782;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public final List f783;

    /* renamed from: ﮉ, reason: contains not printable characters */
    public final List f784;

    /* renamed from: ﮌ, reason: contains not printable characters */
    public final boolean f785;

    /* renamed from: ﮐ, reason: contains not printable characters */
    public final boolean f786;

    /* renamed from: ﱟ, reason: contains not printable characters */
    public final boolean f787;

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final boolean f788;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final boolean f789;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final boolean f790;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final String f791;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final boolean f792;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final String f793;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final String f794;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final String f795;

    public C0323(JSONObject jSONObject) {
        ArrayList arrayList;
        ArrayList arrayList2;
        ArrayList arrayList3;
        this.f784 = new ArrayList();
        this.f783 = new ArrayList();
        this.f782 = new ArrayList();
        this.f781 = new ArrayList();
        this.f795 = jSONObject.optString(StringFog.decrypt("zh3cqhG7Am/OCvmNFaEk\n", "r3mKw3TMQQM=\n"));
        this.f794 = jSONObject.optString(StringFog.decrypt("SfsFWcOm6PtL9DJXww==\n", "KJ9TMKbRuJo=\n"));
        this.f793 = jSONObject.optString(StringFog.decrypt("B67qD9pafKIOqQ==\n", "bd2+YJM0Fsc=\n"));
        this.f792 = jSONObject.optBoolean(StringFog.decrypt("BgIoyW0U18sWBg7yYRPv1g==\n", "c3FNngh2gaI=\n"));
        jSONObject.optBoolean(StringFog.decrypt("HNXPXQKe8NcbycdvJJDa2gfS\n", "aaaqCmf8s78=\n"));
        this.f791 = jSONObject.optString(StringFog.decrypt("UQhdYgjy0Khc\n", "JHoxMnqXtsE=\n"));
        this.f790 = jSONObject.optBoolean(StringFog.decrypt("11neOYzL8Hz/Tg==\n", "viqQWPiihhk=\n"));
        this.f789 = jSONObject.optBoolean(StringFog.decrypt("SK+BbIPo6PNKgZ9jo83o81qz\n", "LsDzD+a7jZ0=\n"));
        this.f788 = jSONObject.optBoolean(StringFog.decrypt("EzkunKK15GUE\n", "YVxN6dDGjRM=\n"));
        this.f787 = jSONObject.optBoolean(StringFog.decrypt("Bj6bfbOcLmAQP5dHpg==\n", "c03+N9LqTxM=\n"), true);
        this.f786 = jSONObject.optBoolean(StringFog.decrypt("I27hOts5anYcbg==\n", "Vh2Ef6NNGBc=\n"));
        this.f785 = jSONObject.optBoolean(StringFog.decrypt("d+6cYoouH0pu+YRyoDMhfW7yp2mdOA14\n", "B5zzAe9dbBw=\n"), true);
        JSONArray optJSONArray = jSONObject.optJSONArray(StringFog.decrypt("dXX1FRFG0g==\n", "AxyQYlgioYE=\n"));
        ArrayList arrayList4 = null;
        if (optJSONArray != null) {
            arrayList = new ArrayList();
            for (int i = 0; i < optJSONArray.length(); i++) {
                Object opt = optJSONArray.opt(i);
                if (opt != null) {
                    arrayList.add(opt);
                }
            }
        } else {
            arrayList = null;
        }
        if (arrayList != null) {
            this.f784 = arrayList;
        }
        JSONArray optJSONArray2 = jSONObject.optJSONArray(StringFog.decrypt("8fCzUWT6nQH14JNXW/SHB+L2\n", "kJPHOBKT6Wg=\n"));
        if (optJSONArray2 != null) {
            arrayList2 = new ArrayList();
            for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                Object opt2 = optJSONArray2.opt(i2);
                if (opt2 != null) {
                    arrayList2.add(opt2);
                }
            }
        } else {
            arrayList2 = null;
        }
        if (arrayList2 != null) {
            this.f783 = arrayList2;
        }
        JSONArray optJSONArray3 = jSONObject.optJSONArray(StringFog.decrypt("5e1sQDULpFD06mZFIw==\n", "k4QJN0Zfyxk=\n"));
        if (optJSONArray3 != null) {
            arrayList3 = new ArrayList();
            for (int i3 = 0; i3 < optJSONArray3.length(); i3++) {
                Object opt3 = optJSONArray3.opt(i3);
                if (opt3 != null) {
                    arrayList3.add(opt3);
                }
            }
        } else {
            arrayList3 = null;
        }
        if (arrayList3 != null) {
            this.f782 = arrayList3;
        }
        JSONArray optJSONArray4 = jSONObject.optJSONArray(StringFog.decrypt("HOm3O40H8d4QzrMtjg==\n", "f4XWSP5igoo=\n"));
        if (optJSONArray4 != null) {
            arrayList4 = new ArrayList();
            for (int i4 = 0; i4 < optJSONArray4.length(); i4++) {
                Object opt4 = optJSONArray4.opt(i4);
                if (opt4 != null) {
                    arrayList4.add(opt4);
                }
            }
        }
        if (arrayList4 != null) {
            this.f781 = arrayList4;
        }
    }

    public C0323() {
        this.f784 = new ArrayList();
        this.f783 = new ArrayList();
        this.f782 = new ArrayList();
        this.f781 = new ArrayList();
    }
}
