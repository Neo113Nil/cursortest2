package com.ironsource.adqualitysdk.sdk.i;

import java.util.Arrays;
import java.util.List;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.Ⅴ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public final class C0959 implements InterfaceC0890 {

    /* renamed from: ｋ, reason: contains not printable characters */
    public final /* synthetic */ C1102 f3174;

    /* renamed from: ﾇ, reason: contains not printable characters */
    public final /* synthetic */ C0950 f3175;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public final /* synthetic */ C0499 f3176;

    public C0959(C0499 c0499, C0950 c0950, C1102 c1102) {
        this.f3176 = c0499;
        this.f3175 = c0950;
        this.f3174 = c1102;
    }

    @Override // com.ironsource.adqualitysdk.sdk.i.InterfaceC0890
    /* renamed from: ﾒ */
    public final JSONObject mo404(String str, JSONObject jSONObject) {
        List asList = Arrays.asList(str, jSONObject);
        C0499 c0499 = this.f3176;
        C0950 c0950 = this.f3175;
        C1102 c1102 = this.f3174;
        c0499.getClass();
        return (JSONObject) c0499.m325(c0950, c0950.f3165, c1102, asList).f3367;
    }
}
