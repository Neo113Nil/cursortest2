package com.unity3d.ads.core.data.manager;

import com.unity3d.ads.core.data.model.exception.LoadException;
import com.unity3d.ads.core.domain.offerwall.OfferwallEventData;
import com.unity3d.ads.core.log.Logger;
import com.unity3d.services.ads.offerwall.OfferwallAdapterBridge;
import com.unity3d.services.ads.offerwall.OfferwallEvent;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlinx.coroutines.flow.FlowKt__LimitKt$transformWhile$1;
import xsna.izg0;
import xsna.ksr;
import xsna.rsr;
import xsna.s3q0;
import xsna.spj;
import xsna.xwm0;

/* compiled from: AndroidOfferwallManager.kt */
/* loaded from: classes14.dex */
public final class AndroidOfferwallManager implements OfferwallManager {
    private final Logger logger;
    private final OfferwallAdapterBridge offerwallBridge;

    public AndroidOfferwallManager(OfferwallAdapterBridge offerwallAdapterBridge, Logger logger) {
        this.offerwallBridge = offerwallAdapterBridge;
        this.logger = logger;
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object getVersion(spj<? super String> spjVar) {
        return this.offerwallBridge.getVersion();
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isAdReady(String str, spj<? super Boolean> spjVar) {
        return Boolean.valueOf(this.offerwallBridge.isAdReady(str));
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public Object isConnected(spj<? super Boolean> spjVar) {
        return Boolean.valueOf(this.offerwallBridge.isConnected());
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object loadAd(String str, spj<? super s3q0> spjVar) {
        AndroidOfferwallManager$loadAd$1 androidOfferwallManager$loadAd$1;
        int i;
        OfferwallEventData offerwallEventData;
        if (spjVar instanceof AndroidOfferwallManager$loadAd$1) {
            androidOfferwallManager$loadAd$1 = (AndroidOfferwallManager$loadAd$1) spjVar;
            int i2 = androidOfferwallManager$loadAd$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                androidOfferwallManager$loadAd$1.label = i2 - Integer.MIN_VALUE;
                Object obj = androidOfferwallManager$loadAd$1.result;
                CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                i = androidOfferwallManager$loadAd$1.label;
                if (i != 0) {
                    kotlin.a.a(obj);
                    this.logger.debug("Offerwall Manager - loadAd: " + str);
                    xwm0 xwm0Var = new xwm0(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$loadAd$2(this, str, null));
                    AndroidOfferwallManager$loadAd$3 androidOfferwallManager$loadAd$3 = new AndroidOfferwallManager$loadAd$3(str, null);
                    androidOfferwallManager$loadAd$1.label = 1;
                    obj = rsr.o(xwm0Var, androidOfferwallManager$loadAd$3, androidOfferwallManager$loadAd$1);
                    if (obj == coroutineSingletons) {
                        return coroutineSingletons;
                    }
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    kotlin.a.a(obj);
                }
                offerwallEventData = (OfferwallEventData) (((OfferwallEventData) obj).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? obj : null);
                if (offerwallEventData != null) {
                    return s3q0.a;
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
        androidOfferwallManager$loadAd$1 = new AndroidOfferwallManager$loadAd$1(this, spjVar);
        Object obj2 = androidOfferwallManager$loadAd$1.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = androidOfferwallManager$loadAd$1.label;
        if (i != 0) {
        }
        offerwallEventData = (OfferwallEventData) (((OfferwallEventData) obj2).getOfferwallEvent() != OfferwallEvent.REQUEST_SUCCESS ? obj2 : null);
        if (offerwallEventData != null) {
        }
    }

    @Override // com.unity3d.ads.core.data.manager.OfferwallManager
    public ksr<OfferwallEventData> showAd(String str) {
        this.logger.debug("Offerwall Manager - showAd: ".concat(str));
        return new izg0(new FlowKt__LimitKt$transformWhile$1(new xwm0(this.offerwallBridge.getOfferwallEventFlow(), new AndroidOfferwallManager$showAd$1(this, str, null)), new AndroidOfferwallManager$showAd$2(null), null));
    }
}
