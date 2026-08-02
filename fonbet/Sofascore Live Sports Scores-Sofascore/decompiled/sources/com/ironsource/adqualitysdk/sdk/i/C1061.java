package com.ironsource.adqualitysdk.sdk.i;

import android.app.Activity;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ﮐ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C1061 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1027 f3352;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ Activity f3353;

    public C1061(C1027 c1027, Activity activity) {
        this.f3352 = c1027;
        this.f3353 = activity;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        if (C1027.m619(this.f3352, this.f3353)) {
            AbstractC1008.m614(new C1071(this));
            C1027 c1027 = this.f3352;
            c1027.f3280 = false;
            c1027.f3281 = true;
            if ((!c1027.f3282 || c1027.f3279) && !this.f3353.isFinishing()) {
                C1027 c10272 = this.f3352;
                Activity activity = this.f3353;
                c10272.getClass();
                String hexString = Integer.toHexString(activity.hashCode());
                if (c10272.f3282) {
                    JSONObject jSONObject = new JSONObject();
                    try {
                        jSONObject.put(AbstractC0615.f1990, true);
                    } catch (JSONException e) {
                        AbstractC0420.m243(C1027.f3277, StringFog.decrypt("2KcespmLuTP5vAK6y8+3GfKhP7iFz/gj8vUGroTF4nc=\n", "ndVs3eur2Fc=\n") + e.getLocalizedMessage());
                    }
                    c10272.m393(jSONObject, activity, hexString);
                } else {
                    c10272.f3282 = true;
                    c10272.m393(new JSONObject(), activity, hexString);
                }
            }
            this.f3352.f3279 = false;
        }
    }
}
