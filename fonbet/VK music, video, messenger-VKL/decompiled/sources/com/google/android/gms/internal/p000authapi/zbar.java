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
import xsna.i380;
import xsna.olc;
import xsna.trz0;
import xsna.u2u;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes.dex */
public final class zbar extends u2u {
    private final Bundle zba;

    public zbar(Context context, Looper looper, trz0 trz0Var, olc olcVar, x3j x3jVar, i380 i380Var) {
        super(context, looper, Sdk.SDKError.Reason.PLACEMENT_SLEEP_VALUE, olcVar, x3jVar, i380Var);
        this.zba = new Bundle();
    }

    @Override // xsna.rd6
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.ISignInService");
        return queryLocalInterface instanceof zbw ? (zbw) queryLocalInterface : new zbw(iBinder);
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
        return "com.google.android.gms.auth.api.identity.internal.ISignInService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.signin.START";
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
