package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import com.vungle.ads.internal.protos.Sdk;
import xsna.arz0;
import xsna.i380;
import xsna.olc;
import xsna.u2u;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class zbh extends u2u {
    private final Bundle zba;

    public zbh(Context context, Looper looper, arz0 arz0Var, olc olcVar, x3j x3jVar, i380 i380Var) {
        super(context, looper, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE, olcVar, x3jVar, i380Var);
        this.zba = new Bundle();
    }

    @Override // xsna.rd6
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ICredentialSavingService");
        return queryLocalInterface instanceof zbn ? (zbn) queryLocalInterface : new zbn(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return zbas.zbi;
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // xsna.rd6
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.ICredentialSavingService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.credentialsaving.START";
    }

    @Override // xsna.rd6
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
