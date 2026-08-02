package com.vungle.ads.internal;

import com.vungle.ads.BaseAdListener;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class d0 extends xka implements Function0 {
    public final /* synthetic */ i0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(i0 i0Var) {
        super(0);
        this.a = i0Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        BaseAdListener adListener = this.a.getAdListener();
        if (adListener != null) {
            adListener.onAdImpression(this.a);
        }
        return Unit.a;
    }
}
