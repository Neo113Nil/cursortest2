package com.unity3d.ads.core.data.manager;

import com.ironsource.C4259pg;
import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import defpackage.a70;
import defpackage.gki;
import defpackage.lu3;
import defpackage.pog;
import defpackage.rd0;
import defpackage.rq3;
import defpackage.u1;
import defpackage.y6a;
import defpackage.z88;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0019\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bH\u0096@¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bH\u0096@¢\u0006\u0004\b\f\u0010\nJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0011\u001a\u00020\u00102\u0006\u0010\r\u001a\u00020\bH\u0096@¢\u0006\u0004\b\u0011\u0010\u000fJ\u001d\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u00122\u0006\u0010\r\u001a\u00020\bH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/unity3d/ads/core/data/manager/AndroidOfferwallManager;", "Lcom/unity3d/ads/core/data/manager/OfferwallManager;", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "offerwallBridge", "Lcom/unity3d/ads/core/log/Logger;", "logger", "<init>", "(Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;Lcom/unity3d/ads/core/log/Logger;)V", "", C4259pg.b, "(Lrq3;)Ljava/lang/Object;", "", "isConnected", "placementName", "isAdReady", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "", "loadAd", "Lz88;", "Lcom/unity3d/ads/core/domain/offerwall/OfferwallEventData;", "showAd", "(Ljava/lang/String;)Lz88;", "Lcom/unity3d/services/ads/offerwall/OfferwallAdapterBridge;", "Lcom/unity3d/ads/core/log/Logger;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidOfferwallManager implements OfferwallManager {

    @NotNull
    private final Logger logger;

    @NotNull
    private final OfferwallAdapterBridge offerwallBridge;

    public AndroidOfferwallManager(@NotNull OfferwallAdapterBridge offerwallAdapterBridge, @NotNull Logger logger) {
        offerwallAdapterBridge.getClass();
        logger.getClass();
        this.offerwallBridge = offerwallAdapterBridge;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object getVersion(@NotNull rq3<? super String> rq3Var) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isAdReady(@NotNull String str, @NotNull rq3<? super Boolean> rq3Var) {
        return Boolean.valueOf(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    public Object isConnected(@NotNull rq3<? super Boolean> rq3Var) {
        return Boolean.valueOf(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(@NotNull String str, @NotNull rq3<? super Unit> rq3Var) {
        AndroidOfferwallManager$loadAd$1 androidOfferwallManager$loadAd$1;
        int i;
        OfferwallEventData offerwallEventData;
        if (rq3Var instanceof AndroidOfferwallManager$loadAd$1) {
            androidOfferwallManager$loadAd$1 = (AndroidOfferwallManager$loadAd$1) rq3Var;
            int i2 = androidOfferwallManager$loadAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidOfferwallManager$loadAd$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidOfferwallManager$loadAd$1.result;
                lu3 lu3Var = lu3.a;
                i = androidOfferwallManager$loadAd$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    this.logger.debug("Offerwall Manager - loadAd: " + str);
                    gki gkiVar = new gki(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$loadAd$2(this, str, null));
                    AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new AndroidOfferwallManager$loadAd$3(str, null);
                    androidOfferwallManager$loadAd$1.label = 1;
                    obj = rd0.z(gkiVar, androidOfferwallManager$loadAd$3, androidOfferwallManager$loadAd$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                offerwallEventData = (OfferwallEventData) (((OfferwallEventData) obj).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? obj : null);
                if (offerwallEventData != null) {
                    return Unit.a;
                }
                Integer errorCode = offerwallEventData.getErrorCode();
                int intValue = errorCode != null ? errorCode.intValue() : 0;
                StringBuilder sb = new StringBuilder("Error loading offerwall ad: ");
                Object errorMessage = offerwallEventData.getErrorMessage();
                if (errorMessage == null) {
                    errorMessage = offerwallEventData.getOfferwallEvent();
                }
                sb.append(errorMessage);
                throw new LoadException(intValue, sb.toString());
            }
        }
        androidOfferwallManager$loadAd$1 = new AndroidOfferwallManager$loadAd$1(this, rq3Var);
        Object obj2 = androidOfferwallManager$loadAd$1.result;
        lu3 lu3Var2 = lu3.a;
        i = androidOfferwallManager$loadAd$1.label;
        if (i != 0) {
        }
        offerwallEventData = (OfferwallEventData) (((OfferwallEventData) obj2).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? obj2 : null);
        if (offerwallEventData != null) {
        }
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    @NotNull
    public z88 showAd(@NotNull String placementName) {
        placementName.getClass();
        this.logger.debug("Offerwall Manager - showAd: ".concat(placementName));
        return new pog(new u1(new gki(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$showAd$1(this, placementName, null)), new AndroidOfferwallManager$showAd$2(null), (rq3) null, 29));
    }
}
