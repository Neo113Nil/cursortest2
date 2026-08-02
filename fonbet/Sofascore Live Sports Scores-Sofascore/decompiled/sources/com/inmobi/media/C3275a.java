package com.inmobi.media;

import com.inmobi.media.ads.network.common.model.AdResponse;
import defpackage.ljg;
import defpackage.rq3;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3275a extends S0 {
    public final byte[] b;
    public final long c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3275a(byte[] bArr, long j, C3906y9 c3906y9) {
        super(c3906y9);
        bArr.getClass();
        this.b = bArr;
        this.c = j;
    }

    @Override // com.inmobi.media.S0
    public final Unit a(AdResponse adResponse, Function1 function1) {
        C3906y9 c3906y9 = this.a;
        if (c3906y9 != null) {
            long j = this.c;
            long placementId = adResponse.getPlacementId();
            StringBuilder o = ljg.o("Instance PLId: ", j, ", Response PLId: ");
            o.append(placementId);
            c3906y9.a("ABAdResponseManager", o.toString());
        }
        W0.a(adResponse, this.a, function1);
        return Unit.a;
    }

    @Override // com.inmobi.media.S0
    public final Object a(rq3 rq3Var) {
        return new String(this.b, Charsets.UTF_8);
    }
}
