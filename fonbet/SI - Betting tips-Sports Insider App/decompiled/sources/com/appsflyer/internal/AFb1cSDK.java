package com.appsflyer.internal;

import android.content.Context;
import com.appsflyer.AFLogger;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.d5;
import e5.p;
import e6.y;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
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
        w7.m p10;
        Context context = this.getMonetizationNetwork.getMonetizationNetwork;
        if (context != null) {
            try {
                d7.e eVar = new d7.e(context, 1);
                d7.g gVar = (d7.g) eVar.f8268b;
                if (gVar.f8274m.b(gVar.f8273l, 212800000) == 0) {
                    e6.m a7 = y.a();
                    a7.f8725d = new Feature[]{q5.c.f22037a};
                    a7.f8722a = new io.sentry.hints.j(gVar);
                    a7.f8724c = true;
                    a7.f8723b = false;
                    a7.f8726e = 27601;
                    p10 = gVar.c(0, a7.a());
                } else {
                    p10 = d5.p(new d6.e(new Status(17, null, null, null)));
                }
                h9.c cVar = new h9.c(20, eVar);
                p10.getClass();
                p pVar = w7.h.f24980a;
                w7.m mVar = (w7.m) p10.h(pVar, cVar);
                mVar.e(pVar, new c(this));
                Intrinsics.checkNotNullExpressionValue(mVar, "");
            } catch (Throwable th2) {
                AFh1ySDK.e$default(AFLogger.INSTANCE, AFg1cSDK.APP_SET_ID, "Error while trying to  fetch App set ID", th2, false, false, false, false, 120, null);
                Unit unit = Unit.f19194a;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void getMonetizationNetwork(AFb1cSDK aFb1cSDK, q5.a aVar) {
        Intrinsics.checkNotNullParameter(aFb1cSDK, "");
        AFc1eSDK aFc1eSDK = aFb1cSDK.AFAdRevenueData;
        int i5 = aVar.f22035b;
        String str = aVar.f22034a;
        Intrinsics.checkNotNullExpressionValue(str, "");
        aFc1eSDK.copydefault = new AFb1gSDK(i5, str);
    }
}
