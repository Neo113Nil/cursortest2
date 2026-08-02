package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.log.Logger;
import kotlin.coroutines.d;
import xsna.eyx;
import xsna.fb;
import xsna.iyx;
import xsna.myc0;
import xsna.ovj;
import xsna.pvj;
import xsna.s3q0;
import xsna.whn0;
import xsna.yok0;
import xsna.yvj;
import xsna.zvj;

/* compiled from: CleanUpWhenOpportunityExpires.kt */
/* loaded from: classes14.dex */
public final class CleanUpWhenOpportunityExpires {
    private final pvj coroutineExceptionHandler;
    private final yvj coroutineScope;
    private final Logger logger;

    public CleanUpWhenOpportunityExpires(ovj ovjVar, Logger logger) {
        this.logger = logger;
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(pvj.a.b, this);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = zvj.a(d.a.a(whn0.a(), ovjVar).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final s3q0 invoke$lambda$2(eyx eyxVar, Throwable th) {
        eyxVar.b(null);
        return s3q0.a;
    }

    public final void invoke(AdObject adObject) {
        yvj adScope;
        if (adObject.getAdScope() == null) {
            throw new IllegalArgumentException("AdObject does not have an adScope.");
        }
        yok0 h = myc0.h(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3);
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (adScope = adPlayer.getScope()) == null) {
            adScope = adObject.getAdScope();
        }
        iyx.f(adScope.getCoroutineContext()).E(new fb(h, 21));
    }
}
