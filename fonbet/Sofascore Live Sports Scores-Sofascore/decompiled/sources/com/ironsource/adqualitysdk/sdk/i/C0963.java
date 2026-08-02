package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ⅱ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0963 implements InterfaceC0878 {

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0926 f3183;

    public C0963(C0926 c0926) {
        this.f3183 = c0926;
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static JSONObject m596(C0963 c0963, Activity activity) {
        c0963.getClass();
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(StringFog.decrypt("t7qXJPeKDA==\n", "1tnjapbnaZ4=\n"), activity.getClass().getName());
            return jSONObject;
        } catch (JSONException unused) {
            AbstractC0420.m243(StringFog.decrypt("+sJO3SmzU7bI\n", "u6wvsVDHOtU=\n"), StringFog.decrypt("XSjEtwx4AzV8M9i/XjkBJXEs36wHeAwwdT8=\n", "GFq22H5YYlE=\n"));
            return jSONObject;
        }
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0878
    /* renamed from: ﾇ */
    public final void mo455(Activity activity) {
        AbstractC1008.m611(new C0969(this, activity));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0878
    /* renamed from: ﾒ */
    public final void mo456(Activity activity) {
        AbstractC1008.m611(new C0973(this, activity));
    }
}
