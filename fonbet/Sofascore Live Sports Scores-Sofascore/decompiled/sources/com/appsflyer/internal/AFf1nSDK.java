package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.lvl.AppsFlyerLVL;
import com.appsflyer.sdk_base.logger.LogTag;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFf1nSDK {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public interface AFa1tSDK {
        void AFLogger(String str, Exception exc);

        void AFLogger(@NonNull String str, @NonNull String str2);
    }

    public final boolean AFKeystoreWrapper(long j, @NonNull Context context, @NonNull final AFa1tSDK aFa1tSDK) {
        try {
            AppsFlyerLVL.checkLicense(j, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFf1nSDK.2
                public final void onLvlFailure(Exception exc) {
                    aFa1tSDK.AFLogger("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1tSDK.AFLogger(str, str2);
                        return;
                    }
                    AFa1tSDK aFa1tSDK2 = aFa1tSDK;
                    if (str2 == null) {
                        aFa1tSDK2.AFLogger("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1tSDK2.AFLogger("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable th) {
            AFLogger.INSTANCE.e(LogTag.GENERAL, "Exception while getting LVL data", th);
            return false;
        }
    }
}
