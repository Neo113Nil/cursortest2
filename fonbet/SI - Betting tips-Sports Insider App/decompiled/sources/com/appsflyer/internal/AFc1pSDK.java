package com.appsflyer.internal;

import android.content.SharedPreferences;
import androidx.appcompat.widget.c1;
import com.appsflyer.AFLogger;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFc1pSDK implements AFc1qSDK {

    @NotNull
    private final gf.i getMediationNetwork;

    @NotNull
    private final AFc1gSDK<SharedPreferences> getMonetizationNetwork;

    public AFc1pSDK(@NotNull AFc1gSDK<SharedPreferences> aFc1gSDK) {
        Intrinsics.checkNotNullParameter(aFc1gSDK, "");
        this.getMonetizationNetwork = aFc1gSDK;
        this.getMediationNetwork = gf.k.b(new Function0<SharedPreferences>() { // from class: com.appsflyer.internal.AFc1pSDK.4
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            @NotNull
            /* renamed from: m_, reason: merged with bridge method [inline-methods] */
            public final SharedPreferences invoke() {
                return (SharedPreferences) AFc1pSDK.this.getMonetizationNetwork.getMonetizationNetwork.invoke();
            }
        });
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(@Nullable String str, boolean z5) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putBoolean(str, z5).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    @Nullable
    public final String getMonetizationNetwork(@Nullable String str, @Nullable String str2) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getString(str, str2);
        } catch (ClassCastException e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, c1.m("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return str2;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getRevenue(@Nullable String str, @Nullable String str2) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putString(str, str2).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMediationNetwork(@Nullable String str, boolean z5) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getBoolean(str, z5);
        } catch (ClassCastException e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, c1.m("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return z5;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(@Nullable String str, long j) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putLong(str, j).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final int getRevenue(@Nullable String str, int i5) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getInt(str, i5);
        } catch (ClassCastException e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, c1.m("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return i5;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void AFAdRevenueData(@Nullable String str) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().remove(str).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final long getMonetizationNetwork(@Nullable String str, long j) {
        try {
            return ((SharedPreferences) this.getMediationNetwork.getValue()).getLong(str, j);
        } catch (ClassCastException e7) {
            AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.PREFERENCES, c1.m("Unexpected data type found for key ", str), e7, false, false, false, false, 120, null);
            return j;
        }
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final void getMediationNetwork(@Nullable String str, int i5) {
        ((SharedPreferences) this.getMediationNetwork.getValue()).edit().putInt(str, i5).apply();
    }

    @Override // com.appsflyer.internal.AFc1qSDK
    public final boolean getMonetizationNetwork(@Nullable String str) {
        return ((SharedPreferences) this.getMediationNetwork.getValue()).contains(str);
    }
}
