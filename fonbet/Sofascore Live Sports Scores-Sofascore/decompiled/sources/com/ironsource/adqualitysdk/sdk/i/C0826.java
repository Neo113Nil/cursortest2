package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.ISAdQualitySegment;
import com.ironsource.adqualitysdk.sdk.StringFog;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴼ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0826 extends AbstractRunnableC0606 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C0808 f2635;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ ISAdQualitySegment f2636;

    public C0826(C0808 c0808, ISAdQualitySegment iSAdQualitySegment) {
        this.f2635 = c0808;
        this.f2636 = iSAdQualitySegment;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        boolean z;
        C0808 c0808 = this.f2635;
        synchronized (c0808) {
            z = c0808.f2601;
        }
        if (!z) {
            AbstractC0420.m245(StringFog.decrypt("VsKzzBiK/m5u9aby\n", "F6biuXnmlxo=\n"), StringFog.decrypt("T6kZvjI6phx46AT8IXewF3joWrkPSZQdXb0W9S9urFlfjDy5L2n1F2O8V/Aoc6EQbaQe4yN++w==\n", "DMh3mUYa1Xk=\n"));
            return;
        }
        C0748 c0748 = this.f2635.f2585;
        if (c0748 != null) {
            ISAdQualitySegment iSAdQualitySegment = this.f2636;
            C0926 c0926 = c0748.f2472;
            String decrypt = StringFog.decrypt("QVGfh/Wn0yBXWp8=\n", "MjTr2IbCtE0=\n");
            JSONObject jSONObject = new JSONObject(iSAdQualitySegment.getCustomData());
            try {
                if (!TextUtils.isEmpty(iSAdQualitySegment.getName())) {
                    jSONObject.put(StringFog.decrypt("m1IwbA==\n", "6DVeAVNyQGI=\n"), iSAdQualitySegment.getName());
                }
                if (iSAdQualitySegment.getAge() != -1) {
                    jSONObject.put(StringFog.decrypt("RJRrcQ==\n", "N/UMFN4dbpo=\n"), iSAdQualitySegment.getAge());
                }
                if (!TextUtils.isEmpty(iSAdQualitySegment.getGender())) {
                    jSONObject.put(StringFog.decrypt("fVWizQ==\n", "DjLHoxdVklo=\n"), iSAdQualitySegment.getGender());
                }
                if (iSAdQualitySegment.getLevel() != -1) {
                    jSONObject.put(StringFog.decrypt("03YbLg==\n", "oBptQtRqlUk=\n"), iSAdQualitySegment.getLevel());
                }
                if (iSAdQualitySegment.getIsPaying() != null) {
                    jSONObject.put(StringFog.decrypt("gfVm/w==\n", "8oUHhghsUW8=\n"), iSAdQualitySegment.getIsPaying().get());
                }
                if (iSAdQualitySegment.getInAppPurchasesTotal() != -1.0d) {
                    jSONObject.put(StringFog.decrypt("TqDQkqc=\n", "Pcmx4tOmYH0=\n"), iSAdQualitySegment.getInAppPurchasesTotal());
                }
                if (iSAdQualitySegment.getUserCreationDate() != 0) {
                    jSONObject.put(StringFog.decrypt("nCR7AQ==\n", "71EYZcOkVCU=\n"), iSAdQualitySegment.getUserCreationDate());
                }
            } catch (JSONException unused) {
            }
            c0926.m556(decrypt, jSONObject);
        }
    }
}
