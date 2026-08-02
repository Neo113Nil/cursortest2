package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.appset.AppSet;
import com.google.android.gms.appset.AppSetIdInfo;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class AFb1bSDK implements AFb1hSDK {
    private final AFf1iSDK getCurrencyIso4217Code;
    private final AFc1oSDK getMonetizationNetwork;
    private final AFc1hSDK getRevenue;

    public AFb1bSDK(AFc1oSDK aFc1oSDK, AFc1hSDK aFc1hSDK, AFf1iSDK aFf1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFf1iSDK, "");
        this.getMonetizationNetwork = aFc1oSDK;
        this.getRevenue = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1iSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMediationNetwork() {
        Context context = this.getRevenue.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AppSet.getClient(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.AFb1bSDK$$ExternalSyntheticLambda0
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AFb1bSDK.getCurrencyIso4217Code(AFb1bSDK.this, (AppSetIdInfo) obj);
                    }
                }), "");
            } catch (Throwable th) {
                AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th, false, false, false, false, 120, null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getCurrencyIso4217Code(AFb1bSDK aFb1bSDK, AppSetIdInfo appSetIdInfo) {
        Intrinsics.checkNotNullParameter(aFb1bSDK, "");
        AFc1oSDK aFc1oSDK = aFb1bSDK.getMonetizationNetwork;
        int scope = appSetIdInfo.getScope();
        String id = appSetIdInfo.getId();
        Intrinsics.checkNotNullExpressionValue(id, "");
        aFc1oSDK.areAllFieldsValid = new AFb1cSDK(scope, id);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean getRevenue() {
        return !this.getCurrencyIso4217Code.getMediationNetwork() && AFj1nSDK.getRevenue(this.getRevenue.getMonetizationNetwork) && AFj1nSDK.AFAdRevenueData(this.getRevenue.getMonetizationNetwork);
    }
}
