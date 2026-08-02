package com.appsflyer.internal;

import android.content.SharedPreferences;
import com.appsflyer.AFLogger;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes2.dex */
public final class AFc1qSDK implements AFc1sSDK {
    private final Lazy getMediationNetwork;
    private final AFc1iSDK<SharedPreferences> getMonetizationNetwork;

    public AFc1qSDK(AFc1iSDK<SharedPreferences> aFc1iSDK) {
        Intrinsics.checkNotNullParameter(aFc1iSDK, "");
        this.getMonetizationNetwork = aFc1iSDK;
        this.getMediationNetwork = LazyKt.lazy(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1qSDK.1
            @Override // kotlin.jvm.functions.Function0
            /* renamed from: l_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1qSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
            }

            {
                super(0);
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void getRevenue(String str, String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final String AFAdRevenueData(String str, String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final boolean AFAdRevenueData(String str, boolean z) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, 120, null);
            return z;
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void getCurrencyIso4217Code(String str, boolean z) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z).apply();
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final long getMediationNetwork(String str, long j) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void AFAdRevenueData(String str, long j) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void getMonetizationNetwork(String str, int i) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i).apply();
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final int AFAdRevenueData(String str, int i) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i);
        } catch (ClassCastException e) {
            AFg1gSDK.e$default(AFLogger.INSTANCE, AFh1zSDK.PREFERENCES, "Unexpected data type found for key " + str, e, false, false, false, false, 120, null);
            return i;
        }
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final boolean getCurrencyIso4217Code(String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }

    @Override // com.appsflyer.internal.AFc1sSDK
    public final void getMediationNetwork(String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }
}
