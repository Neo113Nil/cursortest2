package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.appsflyer.sdk_base.logger.AFLoggerBase;
import com.appsflyer.sdk_base.logger.LogTag;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFc1uSDK implements AFb1cSDK {

    @NotNull
    private final AFc1cSDK AFKeystoreWrapper;

    @NotNull
    private final AFf1oSDK AFLogger;

    @NotNull
    private final AFc1gSDK d;

    public AFc1uSDK(@NotNull AFc1gSDK aFc1gSDK, @NotNull AFc1cSDK aFc1cSDK, @NotNull AFf1oSDK aFf1oSDK) {
        aFc1gSDK.getClass();
        aFc1cSDK.getClass();
        aFf1oSDK.getClass();
        this.d = aFc1gSDK;
        this.AFKeystoreWrapper = aFc1cSDK;
        this.AFLogger = aFf1oSDK;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void AFLogger(AFc1uSDK aFc1uSDK, AppSetIdInfo appSetIdInfo) {
        AFc1gSDK aFc1gSDK = aFc1uSDK.d;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        id.getClass();
        aFc1gSDK.setImeiData = new AFc1rSDK(scope, id);
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final boolean d() {
        return !this.AFLogger.AFLogger() && !this.d.updateServerUninstallToken && AFi1cSDK.d(this.AFKeystoreWrapper.d) && AFi1cSDK.unregisterClient(this.AFKeystoreWrapper.d);
    }

    @Override // com.appsflyer.internal.AFb1cSDK
    public final void unregisterClient() {
        Context context = this.AFKeystoreWrapper.d;
        if (context != null) {
            try {
                AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new f(this));
            } catch (Throwable th) {
                AFLoggerBase.e$default(AFLogger.INSTANCE, LogTag.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                Unit unit = Unit.a;
            }
        }
    }
}
