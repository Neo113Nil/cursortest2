package com.appsflyer.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import com.appsflyer.lvl.AppsFlyerLVL;

/* loaded from: classes.dex */
public final class AFg1zSDK {

    interface AFa1vSDK {
        void AFInAppEventParameterName(@NonNull String str, @NonNull String str2);

        void AFInAppEventType(String str, Exception exc);
    }

    public final boolean AFInAppEventParameterName(long j11, @NonNull Context context, @NonNull final AFa1vSDK aFa1vSDK) {
        try {
            AppsFlyerLVL.checkLicense(j11, context, new AppsFlyerLVL.resultListener() { // from class: com.appsflyer.internal.AFg1zSDK.3
                public final void onLvlFailure(Exception exc) {
                    aFa1vSDK.AFInAppEventType("onLvlFailure with exception", exc);
                }

                public final void onLvlResult(String str, String str2) {
                    if (str != null && str2 != null) {
                        aFa1vSDK.AFInAppEventParameterName(str, str2);
                    } else if (str2 == null) {
                        aFa1vSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signature"));
                    } else {
                        aFa1vSDK.AFInAppEventType("onLvlResult with error", new Exception("AFLVL Invalid signedData"));
                    }
                }
            });
            return true;
        } catch (Throwable unused) {
            return false;
        }
    }
}
