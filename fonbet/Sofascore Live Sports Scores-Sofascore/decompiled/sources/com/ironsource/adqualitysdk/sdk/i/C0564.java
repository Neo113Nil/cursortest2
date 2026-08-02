package com.ironsource.adqualitysdk.sdk.i;

import android.content.Context;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ก, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0564 extends AbstractRunnableC0606 {

    /* renamed from: ﱡ, reason: contains not printable characters */
    public final /* synthetic */ C0558 f1848;

    /* renamed from: ﺙ, reason: contains not printable characters */
    public final /* synthetic */ C0649 f1849;

    /* renamed from: ﻏ, reason: contains not printable characters */
    public final /* synthetic */ LinkedHashMap f1850;

    /* renamed from: ﻐ, reason: contains not printable characters */
    public final /* synthetic */ List f1851;

    /* renamed from: ﻛ, reason: contains not printable characters */
    public final /* synthetic */ String f1852;

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ Context f1853;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ String f1854;

    public C0564(C0558 c0558, String str, Context context, String str2, List list, LinkedHashMap linkedHashMap, C0649 c0649) {
        this.f1848 = c0558;
        this.f1854 = str;
        this.f1853 = context;
        this.f1852 = str2;
        this.f1851 = list;
        this.f1850 = linkedHashMap;
        this.f1849 = c0649;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.AbstractRunnableC0606
    /* renamed from: ﾒ */
    public final void mo58() {
        AbstractC0274 m142 = AbstractC0274.m142();
        String str = this.f1854;
        String str2 = this.f1848.f1832;
        C0909 c0909 = (C0909) ((C0346) m142).mo152().get(str);
        if (c0909 != null && c0909.m532(str2)) {
            JSONObject jSONObject = new JSONObject();
            this.f1848.m373(this.f1854, jSONObject);
            C0558.m359(this.f1848).put(this.f1854, jSONObject);
            AbstractC1008.m613(new C0602(this), AbstractC0274.m142().mo153());
            return;
        }
        C0558 c0558 = this.f1848;
        Context context = this.f1853;
        String str3 = this.f1852;
        String str4 = this.f1854;
        List list = this.f1851;
        C0631 c0631 = new C0631(this);
        c0558.getClass();
        AbstractC1008.m614(new C0798(c0558, str4, context, str3, list, c0631));
    }
}
