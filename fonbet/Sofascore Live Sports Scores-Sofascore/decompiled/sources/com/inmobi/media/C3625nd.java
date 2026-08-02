package com.inmobi.media;

import com.inmobi.ads.InMobiAdRequestStatus;
import defpackage.ot8;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.nd, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class C3625nd extends ot8 implements Function1 {
    public C3625nd(C3651od c3651od) {
        super(1, 0, C3651od.class, c3651od, "transitionToFetchFailedState", "transitionToFetchFailedState(S)V");
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        short shortValue = ((Number) obj).shortValue();
        C3651od c3651od = (C3651od) this.receiver;
        c3651od.getClass();
        c3651od.a(new InMobiAdRequestStatus(InMobiAdRequestStatus.StatusCode.INTERNAL_ERROR), shortValue);
        return Unit.a;
    }
}
