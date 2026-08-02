package com.facebook.ads.redexgen.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C2858kJ implements InterfaceC1907Mw {
    public final /* synthetic */ C2652gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C2858kJ(JSONObject jSONObject, C2652gi c2652gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c2652gi;
        this.A01 = str;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1907Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1907Mw
    public final Collection<String> A7p() {
        return AbstractC1908Mx.A03(this.A00, this.A02);
    }

    @Override // com.facebook.ads.redexgen.core.InterfaceC1907Mw
    public final EnumC1906Mv A8K() {
        return AbstractC1908Mx.A00(this.A02);
    }
}
