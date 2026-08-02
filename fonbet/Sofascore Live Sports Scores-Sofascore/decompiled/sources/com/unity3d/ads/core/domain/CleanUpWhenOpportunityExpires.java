package com.unity3d.ads.core.domain;

import com.unity3d.ads.adplayer.AdPlayer;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.log.Logger;
import defpackage.a70;
import defpackage.au3;
import defpackage.bea;
import defpackage.bu3;
import defpackage.cu3;
import defpackage.cw2;
import defpackage.g9i;
import defpackage.ku3;
import defpackage.s9a;
import defpackage.tz9;
import defpackage.xw3;
import defpackage.yda;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.e;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0018\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\bH\u0086\u0002¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\rR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lcom/unity3d/ads/core/domain/CleanUpWhenOpportunityExpires;", "", "Lau3;", "defaultDispatcher", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lau3;Lcom/unity3d/ads/core/log/Logger;)V", "Lcom/unity3d/ads/core/data/model/AdObject;", "adObject", "", "invoke", "(Lcom/unity3d/ads/core/data/model/AdObject;)V", "Lcom/unity3d/ads/core/log/Logger;", "Lcu3;", "coroutineExceptionHandler", "Lcu3;", "Lku3;", "coroutineScope", "Lku3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CleanUpWhenOpportunityExpires {

    @NotNull
    private final cu3 coroutineExceptionHandler;

    @NotNull
    private final ku3 coroutineScope;

    @NotNull
    private final Logger logger;

    public CleanUpWhenOpportunityExpires(@NotNull au3 au3Var, @NotNull Logger logger) {
        au3Var.getClass();
        logger.getClass();
        this.logger = logger;
        CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1 = new CleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1(bu3.a, this);
        this.coroutineExceptionHandler = cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1;
        this.coroutineScope = s9a.c(e.d(tz9.o(), au3Var).plus(cleanUpWhenOpportunityExpires$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit invoke$lambda$2(yda ydaVar, Throwable th) {
        ydaVar.e(null);
        return Unit.a;
    }

    public final void invoke(@NotNull AdObject adObject) {
        ku3 adScope;
        adObject.getClass();
        if (adObject.getAdScope() == null) {
            a70.p("AdObject does not have an adScope.");
            return;
        }
        g9i L = xw3.L(this.coroutineScope, null, null, new CleanUpWhenOpportunityExpires$invoke$job$1(adObject, null), 3);
        AdPlayer adPlayer = adObject.getAdPlayer();
        if (adPlayer == null || (adScope = adPlayer.getScope()) == null) {
            adScope = adObject.getAdScope();
        }
        bea.x(adScope.getCoroutineContext()).n(new cw2(L, 0));
    }
}
