package com.ironsource.adqualitysdk.sdk.i;

import android.text.TextUtils;
import com.ironsource.adqualitysdk.sdk.StringFog;
import defpackage.ceo;
import defpackage.mz1;
import java.util.ArrayList;
import java.util.HashMap;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ț, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0259 extends AbstractRunnableC0606 {

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ C0233 f477;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1115 f478;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ int f479;

    public C0259(C0233 c0233, int i, C1115 c1115) {
        this.f477 = c0233;
        this.f479 = i;
        this.f478 = c1115;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        HashMap hashMap;
        ArrayList arrayList = new ArrayList();
        C0233 c0233 = this.f477;
        C0358 c0358 = c0233.f439;
        String o = mz1.o(new StringBuilder(), c0233.f440, StringFog.decrypt("vQ==\n", "l+G9KQYai9o=\n"));
        int i = this.f479;
        C0715 c0715 = c0358.f901;
        c0715.getClass();
        try {
            HashMap m409 = c0715.f2420.m409(o, i);
            hashMap = new HashMap();
            for (String str : m409.keySet()) {
                String str2 = (String) m409.get(str);
                if (str2 != null && !TextUtils.isEmpty(str2)) {
                    try {
                        hashMap.put(str, c0715.f2421.m414(str2));
                    } catch (C0755 unused) {
                    }
                }
            }
        } catch (Throwable unused2) {
            hashMap = null;
        }
        for (String str3 : hashMap.values()) {
            try {
                JSONObject jSONObject = new JSONObject(str3);
                arrayList.add(new C0290(jSONObject.optString(StringFog.decrypt("SwluGg==\n", "PnwHfiIw9UA=\n")), jSONObject.getJSONObject(StringFog.decrypt("2lAM58oOqW4=\n", "qj9/k45v3Q8=\n"))));
            } catch (Exception unused3) {
                AbstractC0420.m252(C0233.m134(this.f477), StringFog.decrypt("Ft3tltDWkogn3emb\n", "VbyO/rWF5uc=\n"), ceo.e("3UYoZAxPOSa+Si9tCVV7cv1IPmANRT436EwzfEYBbSbsQDNvSFd/PutMZyg=\n", "nildCGghHlI=\n", str3), null, null, true);
            }
        }
        AbstractC1008.m610(new C0268(this, arrayList));
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ, reason: contains not printable characters */
    public final void mo137(Throwable th) {
        super.mo137(th);
        AbstractC1008.m610(new C0262(this));
    }
}
