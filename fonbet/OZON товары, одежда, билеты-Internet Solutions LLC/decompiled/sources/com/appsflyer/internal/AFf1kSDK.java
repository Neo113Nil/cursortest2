package com.appsflyer.internal;

import android.util.Base64;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import java.net.MalformedURLException;
import java.net.URL;

/* loaded from: classes.dex */
public final class AFf1kSDK extends AFf1rSDK<String> {

    /* renamed from: e, reason: collision with root package name */
    private final AFh1qSDK f57422e;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public AFf1kSDK(@NonNull AFh1qSDK aFh1qSDK, @NonNull AFd1mSDK aFd1mSDK) {
        super(r2, r3, aFd1mSDK, r0.toString(), aFh1qSDK.AFInAppEventParameterName);
        AFf1zSDK aFf1zSDK = aFh1qSDK.f57479w;
        AFf1zSDK aFf1zSDK2 = aFf1zSDK == null ? AFf1zSDK.CACHED_EVENT : aFf1zSDK;
        AFf1zSDK[] aFf1zSDKArr = {AFf1zSDK.RC_CDN};
        StringBuilder sb2 = new StringBuilder();
        sb2.append(aFh1qSDK.AFInAppEventParameterName);
        sb2.append("-");
        sb2.append(values(aFh1qSDK));
        this.f57422e = aFh1qSDK;
    }

    private static String values(AFh1qSDK aFh1qSDK) {
        try {
            return new URL(aFh1qSDK.unregisterClient).getHost();
        } catch (MalformedURLException unused) {
            return "";
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        ResponseNetwork responseNetwork;
        AFf1zSDK aFf1zSDK = this.f57422e.f57479w;
        if (aFf1zSDK == null) {
            aFf1zSDK = AFf1zSDK.CACHED_EVENT;
        }
        return (aFf1zSDK == AFf1zSDK.ARS_VALIDATE && (responseNetwork = this.AFLogger) != null && responseNetwork.getStatusCode() == 424) || super.AFInAppEventParameterName();
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return this.f57422e.AFInAppEventType;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1uSDK<String> valueOf(@NonNull String str) {
        String encodeToString = Base64.encodeToString(this.f57422e.AFInAppEventType(), 2);
        AFLogger.afInfoLog("cached data: ".concat(String.valueOf(encodeToString)));
        ((AFf1rSDK) this).unregisterClient.valueOf(this.f57422e.unregisterClient, encodeToString);
        return ((AFf1rSDK) this).f57438d.valueOf(this.f57422e);
    }
}
