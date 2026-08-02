package com.vungle.ads.internal;

import com.vungle.ads.internal.protos.Sdk;
import defpackage.xka;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class z extends xka implements Function0 {
    public final /* synthetic */ Sdk.SDKError.Reason a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Sdk.SDKError.Builder c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z(Sdk.SDKError.Reason reason, String str, Sdk.SDKError.Builder builder) {
        super(0);
        this.a = reason;
        this.b = str;
        this.c = builder;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a = com.iab.omid.library.vungle.internal.l.a("Logging error: ");
        a.append(this.a);
        a.append(" with message: ");
        a.append(this.b);
        a.append(", mediation: ");
        a.append(this.c.getMediationName());
        return a.toString();
    }
}
