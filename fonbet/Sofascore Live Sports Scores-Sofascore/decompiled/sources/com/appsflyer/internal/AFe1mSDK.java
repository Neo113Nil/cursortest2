package com.appsflyer.internal;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.appsflyer.share.LinkGenerator;
import com.appsflyer.share.attribution.AppsFlyerRequestListener;
import com.appsflyer.share.network.http.ResponseNetwork;
import com.ironsource.Ua;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class AFe1mSDK extends AFe1oSDK<String> {

    @Nullable
    private final LinkGenerator.ResponseListener AFLoggerLogLevel;

    @NonNull
    private final LinkGenerator afErrorLog;

    @NonNull
    private final UUID afInfoLog;

    @Nullable
    private final String afWarnLog;
    private final Map<String, String> e;
    private final String i;

    public AFe1mSDK(@NonNull AFc1aSDK aFc1aSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, @Nullable String str2, @Nullable LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFd1aSDK.i, new AFe1zSDK[]{AFd1aSDK.registerClient}, aFc1aSDK, uuid.toString());
        this.afInfoLog = uuid;
        this.i = str;
        this.e = new HashMap(map);
        this.AFLoggerLogLevel = responseListener;
        this.afWarnLog = str2;
        this.afErrorLog = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final void AFLogger() {
        ResponseNetwork responseNetwork;
        super.AFLogger();
        LinkGenerator.ResponseListener responseListener = this.AFLoggerLogLevel;
        if (responseListener != null) {
            if (this.AFKeystoreWrapper != AFd1bSDK.SUCCESS || (responseNetwork = ((AFe1oSDK) this).w) == null) {
                responseListener.onResponseError(this.afErrorLog.generateLink());
            } else {
                responseListener.onResponse((String) responseNetwork.getBody());
            }
        }
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    @Nullable
    public final AppsFlyerRequestListener AFLoggerLogLevel() {
        return null;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean a_() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final boolean afInfoLog() {
        return false;
    }

    @Override // com.appsflyer.internal.AFe1oSDK
    public final AFd1qSDK<String> d(@NonNull String str) {
        return ((AFe1oSDK) this).registerClient.registerClient(this.i, this.e, this.afWarnLog, this.afInfoLog, str);
    }

    @Override // com.appsflyer.internal.AFe1oSDK, com.appsflyer.internal.AFe1vSDK
    public final long registerClient() {
        return Ua.C;
    }
}
