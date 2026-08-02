package com.unity3d.ads.core.domain;

import com.unity3d.ads.core.log.Logger;
import kotlin.coroutines.d;
import xsna.pvj;

/* compiled from: CoroutineExceptionHandler.kt */
/* loaded from: classes14.dex */
public final class CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 extends kotlin.coroutines.a implements pvj {
    final /* synthetic */ CleanUpWhenOpportunityExpires this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(pvj.a aVar, CleanUpWhenOpportunityExpires cleanUpWhenOpportunityExpires) {
        super(aVar);
        this.this$0 = cleanUpWhenOpportunityExpires;
    }

    @Override // xsna.pvj
    public void handleException(d dVar, Throwable th) {
        Logger logger;
        logger = this.this$0.logger;
        logger.debug("CleanUpExpiredOpportunity: " + th.getMessage());
    }
}
