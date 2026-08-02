package com.appsflyer.internal;

import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.exceptions.HttpException;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.internal.components.queue.exceptions.CreateHttpCallException;
import java.io.IOException;

/* loaded from: classes6.dex */
public abstract class AFf1pSDK<Result> extends AFe1bSDK<AFe1iSDK<Result>> {
    public AFe1iSDK<Result> areAllFieldsValid;
    protected final AFb1aSDK component1;
    protected final AFe1qSDK component2;
    private AFb1vSDK component3;
    public final AFg1uSDK component4;
    private String equals;

    protected boolean a_() {
        return true;
    }

    protected abstract AppsFlyerRequestListener component1();

    protected abstract boolean copydefault();

    @Override // com.appsflyer.internal.AFe1bSDK
    public long getMediationNetwork() {
        return 60000L;
    }

    protected abstract AFe1rSDK<Result> getMonetizationNetwork(String str);

    private AFf1pSDK(AFf1wSDK aFf1wSDK, AFf1wSDK[] aFf1wSDKArr, AFe1qSDK aFe1qSDK, AFg1uSDK aFg1uSDK, AFb1aSDK aFb1aSDK, AFb1vSDK aFb1vSDK, String str) {
        super(aFf1wSDK, aFf1wSDKArr, str);
        this.component2 = aFe1qSDK;
        this.component4 = aFg1uSDK;
        this.component1 = aFb1aSDK;
        this.component3 = aFb1vSDK;
    }

    public AFf1pSDK(AFf1wSDK aFf1wSDK, AFf1wSDK[] aFf1wSDKArr, AFd1kSDK aFd1kSDK, String str) {
        this(aFf1wSDK, aFf1wSDKArr, aFd1kSDK.AFAdRevenueData(), aFd1kSDK.AFInAppEventType(), aFd1kSDK.equals(), aFd1kSDK.AFKeystoreWrapper(), str);
    }

    public AFf1pSDK(AFf1wSDK aFf1wSDK, AFf1wSDK[] aFf1wSDKArr, AFd1kSDK aFd1kSDK, String str, String str2) {
        this(aFf1wSDK, aFf1wSDKArr, aFd1kSDK.AFAdRevenueData(), aFd1kSDK.AFInAppEventType(), aFd1kSDK.equals(), aFd1kSDK.AFKeystoreWrapper(), str);
        this.equals = str2;
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final void getRevenue() {
        String str;
        super.getRevenue();
        if (!copydefault() || (str = this.component4.component2) == null || str.trim().isEmpty()) {
            return;
        }
        AFe1rSDK<Result> monetizationNetwork = getMonetizationNetwork(str);
        if (monetizationNetwork != null) {
            AFAdRevenueData(monetizationNetwork.getRevenue);
        } else {
            AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public AFe1dSDK AFAdRevenueData() throws Exception {
        if (a_() && this.component4.getRevenue()) {
            AppsFlyerRequestListener component1 = component1();
            if (component1 != null) {
                component1.onError(11, "Skipping event because 'isStopped' is true");
            }
            throw new AFf1xSDK();
        }
        String str = this.component4.component2;
        if (str != null && !str.trim().isEmpty()) {
            AFe1rSDK<Result> monetizationNetwork = getMonetizationNetwork(str);
            if (monetizationNetwork == null) {
                AFLogger.afErrorLogForExcManagerOnly("Failed to create a cached HTTP call", new CreateHttpCallException("createHttpCall returned null"));
                return AFe1dSDK.FAILURE;
            }
            if (copydefault()) {
                AFAdRevenueData(monetizationNetwork.getRevenue);
            }
            AFe1iSDK<Result> AFAdRevenueData = monetizationNetwork.AFAdRevenueData();
            this.areAllFieldsValid = AFAdRevenueData;
            this.component1.AFAdRevenueData(monetizationNetwork.getRevenue.AFAdRevenueData, AFAdRevenueData.getStatusCode(), AFAdRevenueData.getBody().toString());
            AppsFlyerRequestListener component12 = component1();
            if (component12 != null) {
                if (AFAdRevenueData.isSuccessful()) {
                    component12.onSuccess();
                } else {
                    StringBuilder sb = new StringBuilder("Status code failure ");
                    sb.append(AFAdRevenueData.getStatusCode());
                    component12.onError(50, sb.toString());
                }
            }
            if (AFAdRevenueData.isSuccessful()) {
                return AFe1dSDK.SUCCESS;
            }
            return AFe1dSDK.FAILURE;
        }
        AppsFlyerRequestListener component13 = component1();
        if (component13 != null) {
            component13.onError(41, "No dev key");
        }
        throw new AFe1aSDK();
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public boolean getMonetizationNetwork() {
        if (component4() instanceof AFf1xSDK) {
            return false;
        }
        if (this.getMonetizationNetwork == AFe1dSDK.TIMEOUT) {
            return true;
        }
        Throwable component4 = component4();
        return (component4 instanceof IOException) && !(component4 instanceof ParsingException);
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public final void AFAdRevenueData(Throwable th) {
        Throwable th2;
        boolean z = !(th instanceof HttpException);
        if (th instanceof AFf1xSDK) {
            th2 = th;
            AFLogger.INSTANCE.e(AFh1xSDK.HTTP_CLIENT, "AppsFlyer SDK is stopped: the request was not sent to the server", th2, true, false);
        } else {
            th2 = th;
            AFLogger.INSTANCE.e(AFh1xSDK.HTTP_CLIENT, "Error while sending request to server: ".concat(String.valueOf(th2)), th2, true, true, z);
        }
        AppsFlyerRequestListener component1 = component1();
        if (component1 != null) {
            String message = th2.getMessage();
            if (message == null) {
                message = "";
            }
            component1.onError(40, message);
        }
    }

    private void AFAdRevenueData(AFe1nSDK aFe1nSDK) {
        String str = this.equals;
        this.equals = this.component3.getMediationNetwork(new AFb1iSDK(aFe1nSDK.AFAdRevenueData, aFe1nSDK.getMonetizationNetwork(), "6.15.1", this.getCurrencyIso4217Code));
        if (str != null) {
            this.component3.getRevenue(str);
        }
    }

    @Override // com.appsflyer.internal.AFe1bSDK
    public void getCurrencyIso4217Code() {
        String str;
        if (this.getMonetizationNetwork != AFe1dSDK.SUCCESS) {
            if (getMonetizationNetwork() || (str = this.equals) == null) {
                return;
            }
            this.component3.getRevenue(str);
            return;
        }
        String str2 = this.equals;
        if (str2 != null) {
            this.component3.getRevenue(str2);
        }
    }
}
