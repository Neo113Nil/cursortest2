package com.vungle.ads.internal.executor;

import com.iab.omid.library.vungle.internal.l;
import com.vungle.ads.OutOfMemory;
import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i extends xka implements Function0 {
    public final /* synthetic */ j a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(j jVar) {
        super(0);
        this.a = jVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        StringBuilder a = l.a("submit callable error in ");
        a.append(this.a.a());
        new OutOfMemory(a.toString()).logErrorNoReturnValue$vungle_ads_release();
        return Unit.a;
    }
}
