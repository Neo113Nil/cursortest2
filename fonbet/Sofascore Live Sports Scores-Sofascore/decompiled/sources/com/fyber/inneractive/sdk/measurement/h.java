package com.fyber.inneractive.sdk.measurement;

import android.text.TextUtils;
import com.fyber.inneractive.sdk.model.vast.x;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import defpackage.dmi;
import defpackage.mz1;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class h implements com.fyber.inneractive.sdk.response.i {
    public URL a;
    public String b;
    public String d;
    public String e;
    public String f;
    public final HashMap c = new HashMap();
    public boolean g = false;

    public final String a() {
        if (!this.g) {
            return "JavaScriptResource = ";
        }
        if (TextUtils.isEmpty(this.b)) {
            return "apiFramework = ";
        }
        if (this.b.equalsIgnoreCase(CampaignEx.KEY_OMID)) {
            return dmi.q("JavaScriptResource_url = ", TextUtils.isEmpty(this.f) ? "" : this.f);
        }
        return dmi.q("apiFramework = ", this.b);
    }

    public final boolean b() {
        if (!this.g || this.a == null) {
            return false;
        }
        String str = this.b;
        if (str != null) {
            return !TextUtils.isEmpty(str) && this.b.equalsIgnoreCase(CampaignEx.KEY_OMID);
        }
        return true;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Verification{mJavaScriptResource=");
        sb.append(this.a);
        sb.append(", mTrackingEvents=");
        sb.append(this.c);
        sb.append(", mVerificationParameters='");
        sb.append(this.d);
        sb.append("', mVendor='");
        return mz1.o(sb, this.e, "'}");
    }

    @Override // com.fyber.inneractive.sdk.response.i
    public final List a(x xVar) {
        HashMap hashMap;
        if (xVar == null || (hashMap = this.c) == null) {
            return null;
        }
        return (List) hashMap.get(xVar);
    }

    public final void a(x xVar, String str) {
        List list = (List) this.c.get(xVar);
        if (list == null) {
            list = new ArrayList();
            this.c.put(xVar, list);
        }
        if (TextUtils.isEmpty(str)) {
            return;
        }
        list.add(str);
    }
}
