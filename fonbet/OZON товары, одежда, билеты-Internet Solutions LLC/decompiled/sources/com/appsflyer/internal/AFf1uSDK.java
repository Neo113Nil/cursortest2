package com.appsflyer.internal;

import androidx.annotation.NonNull;
import com.appsflyer.attribution.AppsFlyerRequestListener;
import com.appsflyer.internal.components.network.http.ResponseNetwork;
import com.appsflyer.internal.components.network.http.exceptions.ParsingException;
import com.appsflyer.share.LinkGenerator;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

/* loaded from: classes8.dex */
public final class AFf1uSDK extends AFf1rSDK<String> {
    private final String afInfoLog;

    /* renamed from: e, reason: collision with root package name */
    private final String f57447e;
    private final Map<String, String> force;

    /* renamed from: i, reason: collision with root package name */
    @NonNull
    private final LinkGenerator f57448i;

    /* renamed from: v, reason: collision with root package name */
    @NonNull
    private final UUID f57449v;

    /* renamed from: w, reason: collision with root package name */
    private final LinkGenerator.ResponseListener f57450w;

    public AFf1uSDK(@NonNull AFd1mSDK aFd1mSDK, @NonNull UUID uuid, @NonNull String str, @NonNull Map<String, String> map, String str2, LinkGenerator.ResponseListener responseListener, @NonNull LinkGenerator linkGenerator) {
        super(AFf1zSDK.ONELINK, new AFf1zSDK[]{AFf1zSDK.RC_CDN}, aFd1mSDK, uuid.toString());
        this.f57449v = uuid;
        this.f57447e = str;
        this.force = new HashMap(map);
        this.f57450w = responseListener;
        this.afInfoLog = str2;
        this.f57448i = linkGenerator;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final long AFInAppEventType() {
        return 3000L;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        ResponseNetwork responseNetwork;
        super.AFKeystoreWrapper();
        LinkGenerator.ResponseListener responseListener = this.f57450w;
        if (responseListener != null) {
            if (this.AFInAppEventType == AFe1dSDK.SUCCESS && (responseNetwork = this.AFLogger) != null) {
                responseListener.onResponse((String) responseNetwork.getBody());
                return;
            }
            Throwable e11 = e();
            if (!(e11 instanceof ParsingException)) {
                responseListener.onResponse(this.f57448i.generateLink());
            } else if (((ParsingException) e11).getRawResponse().isSuccessful()) {
                responseListener.onResponseError("Can't parse one link data");
            } else {
                responseListener.onResponse(this.f57448i.generateLink());
            }
        }
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AppsFlyerRequestListener registerClient() {
        return null;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean unregisterClient() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final boolean v() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK
    protected final AFe1uSDK<String> valueOf(@NonNull String str) {
        return ((AFf1rSDK) this).f57438d.AFKeystoreWrapper(this.f57447e, this.force, this.afInfoLog, this.f57449v, str);
    }
}
