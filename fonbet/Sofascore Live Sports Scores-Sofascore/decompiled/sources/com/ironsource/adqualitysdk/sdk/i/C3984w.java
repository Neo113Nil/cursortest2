package com.ironsource.adqualitysdk.sdk.i;

import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.w, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3984w extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C3985x f274;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Object f275;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f276;

    public C3984w(C3985x c3985x, String str, Object obj) {
        this.f274 = c3985x;
        this.f276 = str;
        this.f275 = obj;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        WeakReference weakReference;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put(AbstractC0615.f2022, this.f274.f279);
            jSONObject.put(AbstractC0615.f2021, StringFog.decrypt("+GaJ\n", "jxDqeXAcdLI=\n"));
            jSONObject.put(AbstractC0615.f2033, this.f276);
            if (this.f274.f278) {
                jSONObject.put(AbstractC0615.f2032, true);
            }
        } catch (JSONException e) {
            AbstractC0420.m243(StringFog.decrypt("0tr1rFQiymHh9/aUWSvYUg==\n", "hb+X+j1HvSA=\n"), StringFog.decrypt("OGQU/JOh9D0YdxL6j+a3LBF/BfjB6+QgEyxG\n", "fRZmk+GBl08=\n") + e.getLocalizedMessage());
        }
        C3985x c3985x = this.f274;
        AbstractViewOnLayoutChangeListenerC3987z abstractViewOnLayoutChangeListenerC3987z = c3985x.f277.f281;
        WebView webView = c3985x.f280;
        L l = abstractViewOnLayoutChangeListenerC3987z.f286;
        abstractViewOnLayoutChangeListenerC3987z.mo104(jSONObject, webView, (l == null || (weakReference = l.f100.f77) == null) ? null : (D) weakReference.get(), this.f275);
    }
}
