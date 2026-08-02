package com.ironsource.adqualitysdk.sdk.i;

import android.os.Handler;
import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.HashSet;
import java.util.Iterator;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ʡ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0298 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final C0926 f549;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final Handler f550;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public C0971 f551;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f546 = StringFog.decrypt("IAH7SSWHzKABEuw=\n", "ZXeeJ1HUqc4=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f545 = StringFog.decrypt("/ZwzX48xBnL5mw==\n", "nP9HAP9QcwE=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f544 = StringFog.decrypt("qpLgqpn/HWymlPA=\n", "y/GU9euabhk=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f543 = StringFog.decrypt("QDLOjqeLno1VNN4=\n", "IVG60cT5++w=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f542 = StringFog.decrypt("PxecsqMXUlYqEYw=\n", "XnTo7dBjMyQ=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f541 = StringFog.decrypt("ftxi4/6dq19v2nI=\n", "H78WvI3pxC8=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f540 = StringFog.decrypt("4g9oZHdjvlTxA2Vedw==\n", "g2wcOxMGzSA=\n");

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static final String f539 = StringFog.decrypt("szgDCPLF2t62BAQj4NDJ\n", "0lt3V4GkrLs=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final HashSet f548 = new HashSet();

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final HashSet f547 = new HashSet();

    public C0298(Handler handler, C0926 c0926) {
        this.f549 = c0926;
        this.f550 = handler;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void m175(String str, String str2, String str3, String str4, JSONObject jSONObject, boolean z) {
        synchronized (this.f547) {
            try {
                String str5 = str3 + StringFog.decrypt("FQ==\n", "LxS5CpmqHJY=\n") + str2;
                if (!this.f547.contains(str5) || z || AbstractC0274.m142().mo149()) {
                    this.f547.add(str5);
                    if (Math.random() * 100.0d >= m174()) {
                        AbstractC0420.m244(f546, StringFog.decrypt("gKSbc/FtftWqqshk4EB/zraimjD1aX/SsO3FMPR2ftLjuchg8WxpnLClmnXjd3XQoA==\n", "xM3oEJAfGrw=\n"));
                        return;
                    }
                    this.f549.getClass();
                    JSONObject jSONObject2 = new JSONObject();
                    try {
                        jSONObject2.put(StringFog.decrypt("UgIZx7U=\n", "N3BtptIxrEI=\n"), str);
                        jSONObject2.put(StringFog.decrypt("B8msT9M=\n", "YrvBPLT6HGE=\n"), str2);
                        jSONObject2.put(StringFog.decrypt("N0IbHet7\n", "UjB4co8eAAI=\n"), str3);
                        if (!TextUtils.isEmpty(str4)) {
                            jSONObject2.put(StringFog.decrypt("eVZ1cFA=\n", "HCQGBDsbXWU=\n"), str4);
                        }
                        if (jSONObject != null) {
                            AbstractC0523.m348(jSONObject2, jSONObject, false);
                        }
                    } catch (JSONException e) {
                        String str6 = C0926.f3089;
                        AbstractC0420.m252(str6, str6, StringFog.decrypt("24ZJMs+G98P6nVU6ncPk1fGGGzDY1eXG+ZE=\n", "nvQ7Xb2mlqc=\n"), e, null, false);
                    }
                    String decrypt = StringFog.decrypt("L/4bPGL8pDs=\n", "W45EWRCOy0k=\n");
                    Iterator it = new HashSet(this.f548).iterator();
                    while (it.hasNext()) {
                        JSONObject mo404 = ((InterfaceC0890) it.next()).mo404(decrypt, jSONObject2);
                        if (mo404 != null) {
                            AbstractC0523.m348(jSONObject2, mo404, false);
                        }
                    }
                    this.f549.m556(StringFog.decrypt("NCYi6iZeqmQ=\n", "QFZ9j1QsxRY=\n"), jSONObject2);
                }
            } finally {
            }
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static double m174() {
        JSONObject jSONObject;
        if (((C0346) AbstractC0274.m142()).f849) {
            return 100.0d;
        }
        C0346 c0346 = (C0346) AbstractC0274.m142();
        synchronized (c0346) {
            jSONObject = c0346.f3206;
        }
        return jSONObject.optDouble(StringFog.decrypt("3ta0\n", "qrPEbMg0i0s=\n"), 5.0d);
    }
}
