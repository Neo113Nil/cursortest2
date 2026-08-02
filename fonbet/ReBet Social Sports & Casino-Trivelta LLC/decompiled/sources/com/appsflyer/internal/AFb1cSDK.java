package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.tasks.OnSuccessListener;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import u9.AbstractC6531a;

/* loaded from: classes.dex */
public final class AFb1cSDK implements AFb1hSDK {

    @NotNull
    private final AFc1eSDK AFAdRevenueData;

    @NotNull
    private final AFf1eSDK getCurrencyIso4217Code;

    @NotNull
    private final AFc1hSDK getMonetizationNetwork;

    public AFb1cSDK(@NotNull AFc1eSDK aFc1eSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFf1eSDK aFf1eSDK) {
        Intrinsics.checkNotNullParameter(aFc1eSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        this.AFAdRevenueData = aFc1eSDK;
        this.getMonetizationNetwork = aFc1hSDK;
        this.getCurrencyIso4217Code = aFf1eSDK;
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final boolean AFAdRevenueData() {
        return !this.getCurrencyIso4217Code.getCurrencyIso4217Code() && !this.AFAdRevenueData.getMediationNetwork() && AFj1kSDK.getMediationNetwork(this.getMonetizationNetwork.getMonetizationNetwork) && AFj1kSDK.getMonetizationNetwork(this.getMonetizationNetwork.getMonetizationNetwork);
    }

    @Override // com.appsflyer.internal.AFb1hSDK
    public final void getMonetizationNetwork() {
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                Intrinsics.checkNotNullExpressionValue(AbstractC6531a.a(context).getAppSetIdInfo().addOnSuccessListener(new OnSuccessListener() { // from class: com.appsflyer.internal.j
                    @Override // com.google.android.gms.tasks.OnSuccessListener
                    public final void onSuccess(Object obj) {
                        AFb1cSDK.getMonetizationNetwork(AFb1cSDK.this, (u9.c) obj);
                    }
                }), "");
            } catch (Throwable th2) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.INSTANCE;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, u9.c cVar) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
        int b10 = cVar.b();
        String a10 = cVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "");
        aFc1eSDK.copydefault = new AFb1gSDK(b10, a10);
    }
}
