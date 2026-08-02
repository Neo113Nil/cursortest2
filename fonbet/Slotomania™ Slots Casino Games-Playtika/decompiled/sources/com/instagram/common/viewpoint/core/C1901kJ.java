package com.instagram.common.viewpoint.core;

import java.util.Collection;
import org.json.JSONObject;

/* renamed from: com.facebook.ads.redexgen.X.kJ, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public class C1901kJ implements InterfaceC0950Mw {
    public final /* synthetic */ C1695gi A00;
    public final /* synthetic */ String A01;
    public final /* synthetic */ JSONObject A02;

    public C1901kJ(JSONObject jSONObject, C1695gi c1695gi, String str) {
        this.A02 = jSONObject;
        this.A00 = c1695gi;
        this.A01 = str;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0950Mw
    public final String A7O() {
        return this.A01;
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0950Mw
    public final Collection<String> A7p() {
        return AbstractC0951Mx.A03(this.A00, this.A02);
    }

    @Override // com.instagram.common.viewpoint.core.InterfaceC0950Mw
    public final EnumC0949Mv A8K() {
        return AbstractC0951Mx.A00(this.A02);
    }
}
