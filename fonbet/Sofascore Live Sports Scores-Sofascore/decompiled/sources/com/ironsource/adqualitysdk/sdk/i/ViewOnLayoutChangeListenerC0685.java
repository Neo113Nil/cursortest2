package com.ironsource.adqualitysdk.sdk.i;

import android.view.View;
import android.webkit.WebView;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.util.ArrayList;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᓓ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class ViewOnLayoutChangeListenerC0685 implements View.OnLayoutChangeListener {

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ AbstractC0646 f2331;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ Object f2332;

    public ViewOnLayoutChangeListenerC0685(AbstractC0646 abstractC0646, Object obj) {
        this.f2331 = abstractC0646;
        this.f2332 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        try {
            ArrayList arrayList = new ArrayList();
            this.f2331.mo85(this.f2332, arrayList);
            if (arrayList.isEmpty()) {
                return;
            }
            View mo83 = this.f2331.mo83(this.f2332);
            if (mo83 != null && !this.f2331.f2185.f2196) {
                mo83.removeOnLayoutChangeListener(this);
            }
            this.f2331.m392(this.f2332, arrayList);
            this.f2331.mo106(new JSONObject(), (WebView) arrayList.get(0), this.f2332);
        } catch (Throwable th) {
            AbstractC0356.m204(StringFog.decrypt("4yRstzKs8TrAP0G/Ca7tO8k0cg==\n", "pVEA20HPg18=\n"), StringFog.decrypt("OXcN9x6BK4tcahHUDdgtkAhGF/kCxic=\n", "fAV/mGyhQuU=\n"), th, false);
        }
    }
}
