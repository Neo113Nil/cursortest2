package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﺒ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1095 implements InterfaceC0699 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C1037 f3403;

    public C1095(C1037 c1037) {
        this.f3403 = c1037;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0699
    /* renamed from: ﾒ */
    public final void mo405(String str) {
        C1037 c1037 = this.f3403;
        c1037.getClass();
        if (TextUtils.isEmpty(str)) {
            return;
        }
        try {
            c1037.f3308 = new JSONObject(str);
        } catch (JSONException unused) {
        }
    }
}
