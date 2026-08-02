package com.unity3d.ads.core.domain.offerwall;

import com.unity3d.ads.core.data.manager.OfferwallManager;
import defpackage.lu3;
import defpackage.rq3;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086B¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/unity3d/ads/core/domain/offerwall/LoadOfferwallAd;", "", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "offerwallManager", "<init>", "(Lcom/unity3d/ads/core/data/manager/OfferwallManager;)V", "", "placementName", "", "invoke", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class LoadOfferwallAd {

    @NotNull
    private final OfferwallManager offerwallManager;

    public LoadOfferwallAd(@NotNull OfferwallManager offerwallManager) {
        offerwallManager.getClass();
        this.offerwallManager = offerwallManager;
    }

    @Nullable
    public final Object invoke(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        Object loadAd = this.offerwallManager.loadAd(str, rq3Var);
        return loadAd == lu3.a ? loadAd : Unit.a;
    }
}
