package com.appsflyer.internal;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.annotation.NonNull;
import com.appsflyer.AFLogger;
import com.appsflyer.attribution.AppsFlyerRequestListener;

/* loaded from: classes8.dex */
public final class AFf1tSDK extends AFf1rSDK<String> {
    private final AFd1sSDK afInfoLog;

    /* renamed from: e, reason: collision with root package name */
    @NonNull
    private final String f57445e;

    /* renamed from: i, reason: collision with root package name */
    private final AFj1ySDK f57446i;

    public AFf1tSDK(@NonNull AFd1mSDK aFd1mSDK, @NonNull String str, AFj1ySDK aFj1ySDK) {
        super(AFf1zSDK.IMPRESSIONS, new AFf1zSDK[]{AFf1zSDK.RC_CDN, AFf1zSDK.FETCH_ADVERTISING_ID}, aFd1mSDK, str);
        this.f57445e = str;
        this.f57446i = aFj1ySDK;
        this.afInfoLog = aFd1mSDK.AFInAppEventType();
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final boolean AFInAppEventParameterName() {
        return false;
    }

    @Override // com.appsflyer.internal.AFf1rSDK, com.appsflyer.internal.AFe1eSDK
    public final void AFKeystoreWrapper() {
        super.AFKeystoreWrapper();
        AFe1hSDK<Result> aFe1hSDK = this.AFLogger;
        if (aFe1hSDK != 0) {
            int statusCode = aFe1hSDK.getStatusCode();
            if (statusCode == 200) {
                StringBuilder sb2 = new StringBuilder("Cross promotion impressions success: ");
                sb2.append(this.f57445e);
                AFLogger.afInfoLog(sb2.toString(), false);
                return;
            }
            if (statusCode != 301 && statusCode != 302) {
                StringBuilder sb3 = new StringBuilder("call to ");
                sb3.append(this.f57445e);
                sb3.append(" failed: ");
                sb3.append(statusCode);
                AFLogger.afInfoLog(sb3.toString());
                return;
            }
            StringBuilder sb4 = new StringBuilder("Cross promotion redirection success: ");
            sb4.append(this.f57445e);
            AFLogger.afInfoLog(sb4.toString(), false);
            String values = aFe1hSDK.values("Location");
            AFj1ySDK aFj1ySDK = this.f57446i;
            if (aFj1ySDK == null || values == null) {
                return;
            }
            aFj1ySDK.AFKeystoreWrapper = values;
            Context context = aFj1ySDK.AFInAppEventType.get();
            if (context != null) {
                try {
                    if (aFj1ySDK.AFKeystoreWrapper != null) {
                        context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(aFj1ySDK.AFKeystoreWrapper)).setFlags(268435456));
                    }
                } catch (Exception e11) {
                    AFLogger.afErrorLog("Failed to open cross promotion url, does OS have browser installed?".concat(String.valueOf(e11)), e11);
                }
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
    protected final AFe1uSDK<String> valueOf(@NonNull String str) {
        AFe1wSDK aFe1wSDK = ((AFf1rSDK) this).f57438d;
        String valueOf = this.afInfoLog.valueOf();
        return aFe1wSDK.AFInAppEventType(AFc1rSDK.AFInAppEventType(valueOf) ? this.f57445e : Uri.parse(this.f57445e).buildUpon().appendQueryParameter("advertising_id", valueOf).build().toString());
    }
}
