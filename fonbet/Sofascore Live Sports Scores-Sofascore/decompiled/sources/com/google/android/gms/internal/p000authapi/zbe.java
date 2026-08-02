package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.auth.api.zbc;
import com.google.android.gms.auth.api.zbd;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zbe extends GmsClient {
    public final zbd I;

    public zbe(Context context, Looper looper, ClientSettings clientSettings, zbd zbdVar, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 68, clientSettings, connectionCallbacks, onConnectionFailedListener);
        zbdVar = zbdVar == null ? zbd.c : zbdVar;
        zbc zbcVar = new zbc();
        zbcVar.a = Boolean.FALSE;
        zbd zbdVar2 = zbd.c;
        zbdVar.getClass();
        zbcVar.a = Boolean.valueOf(zbdVar.a);
        zbcVar.b = zbdVar.b;
        zbcVar.b = zbat.a();
        this.I = new zbd(zbcVar);
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder, "com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle e() {
        zbd zbdVar = this.I;
        zbdVar.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", zbdVar.a);
        bundle.putString("log_session_id", zbdVar.b);
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
