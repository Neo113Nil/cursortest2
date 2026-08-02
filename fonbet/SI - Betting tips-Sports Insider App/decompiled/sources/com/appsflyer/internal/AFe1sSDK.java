package com.appsflyer.internal;

import android.annotation.SuppressLint;
import com.appsflyer.internal.AFe1oSDK.AnonymousClass1;
import com.appsflyer.internal.AFe1rSDK;
import java.util.concurrent.ExecutorService;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class AFe1sSDK {

    @NotNull
    public final AFc1hSDK AFAdRevenueData;

    @NotNull
    private final AFe1oSDK component3;

    @NotNull
    private final AFf1eSDK component4;

    @NotNull
    private final AFc1oSDK getCurrencyIso4217Code;

    @NotNull
    private final AFg1nSDK getMediationNetwork;

    @NotNull
    public final AFc1qSDK getMonetizationNetwork;

    @NotNull
    private final ExecutorService getRevenue;

    public AFe1sSDK(@NotNull AFc1qSDK aFc1qSDK, @NotNull AFc1hSDK aFc1hSDK, @NotNull AFc1oSDK aFc1oSDK, @NotNull ExecutorService executorService, @NotNull AFg1nSDK aFg1nSDK, @NotNull AFf1eSDK aFf1eSDK, @NotNull AFe1oSDK aFe1oSDK) {
        Intrinsics.checkNotNullParameter(aFc1qSDK, "");
        Intrinsics.checkNotNullParameter(aFc1hSDK, "");
        Intrinsics.checkNotNullParameter(aFc1oSDK, "");
        Intrinsics.checkNotNullParameter(executorService, "");
        Intrinsics.checkNotNullParameter(aFg1nSDK, "");
        Intrinsics.checkNotNullParameter(aFf1eSDK, "");
        Intrinsics.checkNotNullParameter(aFe1oSDK, "");
        this.getMonetizationNetwork = aFc1qSDK;
        this.AFAdRevenueData = aFc1hSDK;
        this.getCurrencyIso4217Code = aFc1oSDK;
        this.getRevenue = executorService;
        this.getMediationNetwork = aFg1nSDK;
        this.component4 = aFf1eSDK;
        this.component3 = aFe1oSDK;
    }

    @SuppressLint({"NewApi"})
    public final void AFAdRevenueData(@NotNull AFe1rSDK aFe1rSDK, @NotNull Function1<? super AFe1uSDK, Unit> function1) {
        Intrinsics.checkNotNullParameter(aFe1rSDK, "");
        Intrinsics.checkNotNullParameter(function1, "");
        AFf1wSDK aFf1wSDK = new AFf1wSDK(aFe1rSDK, this.getRevenue, this.getCurrencyIso4217Code, this.AFAdRevenueData, this.getMediationNetwork, this.component4, function1);
        AFe1oSDK aFe1oSDK = this.component3;
        aFe1oSDK.getCurrencyIso4217Code.execute(aFe1oSDK.new AnonymousClass1(aFf1wSDK));
    }

    @SuppressLint({"NewApi"})
    public final void getMediationNetwork() {
        if (this.getMonetizationNetwork.getMediationNetwork("didSendRevenueTriggerOnLastBackground", true) || !AFj1kSDK.getRevenue(this.AFAdRevenueData.getMonetizationNetwork)) {
            return;
        }
        AFAdRevenueData(AFe1rSDK.AFa1uSDK.INSTANCE, new Function1<AFe1uSDK, Unit>() { // from class: com.appsflyer.internal.AFe1sSDK.1
            {
                super(1);
            }

            public final void getRevenue(@NotNull AFe1uSDK aFe1uSDK) {
                Intrinsics.checkNotNullParameter(aFe1uSDK, "");
                if (aFe1uSDK == AFe1uSDK.SUCCESS) {
                    AFe1sSDK.this.getMonetizationNetwork.AFAdRevenueData("didSendRevenueTriggerOnLastBackground", true);
                }
            }

            @Override // kotlin.jvm.functions.Function1
            public final /* synthetic */ Object invoke(Object obj) {
                getRevenue((AFe1uSDK) obj);
                return Unit.f19194a;
            }
        });
    }
}
