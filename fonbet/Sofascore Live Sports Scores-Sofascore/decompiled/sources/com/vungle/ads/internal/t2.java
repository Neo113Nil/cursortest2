package com.vungle.ads.internal;

import com.vungle.ads.SdkNotInitialized;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class t2 extends xka implements Function0 {
    public final /* synthetic */ w2 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public t2(w2 w2Var) {
        super(0);
        this.a = w2Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        this.a.a(new SdkNotInitialized("Network permissions not granted").logError$vungle_ads_release());
        return Unit.a;
    }
}
