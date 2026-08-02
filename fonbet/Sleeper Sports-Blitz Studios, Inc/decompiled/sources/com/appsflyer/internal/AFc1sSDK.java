package com.appsflyer.internal;

import com.appsflyer.internal.AFf1zSDK.AnonymousClass3;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class AFc1sSDK implements Runnable {
    private final AFa1mSDK getCurrencyIso4217Code;
    private final Map<String, Object> getMonetizationNetwork;
    private final AFd1kSDK getRevenue;

    public AFc1sSDK(AFd1kSDK aFd1kSDK, AFa1mSDK aFa1mSDK, Map<String, ? extends Object> map) {
        Intrinsics.checkNotNullParameter(aFd1kSDK, "");
        Intrinsics.checkNotNullParameter(aFa1mSDK, "");
        this.getRevenue = aFd1kSDK;
        this.getCurrencyIso4217Code = aFa1mSDK;
        this.getMonetizationNetwork = map;
    }

    @Override // java.lang.Runnable
    public final void run() {
        AFf1dSDK aFf1gSDK;
        if (this.getCurrencyIso4217Code.getCurrencyIso4217Code()) {
            AFf1fSDK aFf1fSDK = new AFf1fSDK(this.getCurrencyIso4217Code, this.getRevenue);
            aFf1fSDK.copydefault = this.getMonetizationNetwork;
            aFf1gSDK = aFf1fSDK;
        } else if (this.getCurrencyIso4217Code instanceof AFh1lSDK) {
            aFf1gSDK = new AFf1dSDK((AFh1lSDK) this.getCurrencyIso4217Code, this.getRevenue);
        } else {
            aFf1gSDK = new AFf1gSDK(this.getCurrencyIso4217Code, this.getRevenue);
        }
        AFf1zSDK copydefault = this.getRevenue.copydefault();
        copydefault.getRevenue.execute(copydefault.new AnonymousClass3(aFf1gSDK));
        if (aFf1gSDK.getCurrencyIso4217Code == AFf1wSDK.CONVERSION) {
            this.getRevenue.values();
            if (AFe1gSDK.getMediationNetwork() && AFb1qSDK.getRevenue(this.getRevenue.AFInAppEventParameterName().getCurrencyIso4217Code)) {
                AFf1zSDK copydefault2 = this.getRevenue.copydefault();
                copydefault2.getRevenue.execute(copydefault2.new AnonymousClass3(new AFf1hSDK(this.getRevenue, "install")));
            }
        }
    }
}
