package com.unity3d.ads.adplayer;

import kotlin.coroutines.d;
import xsna.ovj;
import xsna.pvj;
import xsna.yvj;
import xsna.zvj;

/* compiled from: AdPlayerScope.kt */
/* loaded from: classes14.dex */
public final class AdPlayerScope implements yvj {
    private final /* synthetic */ yvj $$delegate_0;
    private final ovj defaultDispatcher;
    private final pvj sdkErrorHandler;

    public AdPlayerScope(ovj ovjVar, pvj pvjVar) {
        this.$$delegate_0 = zvj.a(ovjVar.plus(pvjVar));
        this.defaultDispatcher = ovjVar;
        this.sdkErrorHandler = pvjVar;
    }

    @Override // xsna.yvj
    public d getCoroutineContext() {
        return this.$$delegate_0.getCoroutineContext();
    }
}
