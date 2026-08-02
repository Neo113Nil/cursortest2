package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.identity.zbc;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.ConnectionCallbacks;
import com.google.android.gms.common.api.internal.OnConnectionFailedListener;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.vungle.ads.internal.protos.Sdk;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbg extends GmsClient {
    public final Bundle I;

    public zbg(Context context, Looper looper, zbc zbcVar, ClientSettings clientSettings, ConnectionCallbacks connectionCallbacks, OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, Sdk.SDKError.Reason.MRAID_JS_COPY_FAILED_VALUE, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zbcVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("session_id", null);
        this.I = bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return queryLocalInterface instanceof zbk ? (zbk) queryLocalInterface : new zbk(iBinder, "com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle e() {
        return this.I;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Feature[] getApiFeatures() {
        return zbas.c;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean j() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final boolean usesClientTelemetry() {
        return true;
    }
}
