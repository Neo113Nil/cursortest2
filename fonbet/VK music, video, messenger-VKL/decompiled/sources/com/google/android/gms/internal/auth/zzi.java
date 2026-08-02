package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import xsna.d901;
import xsna.i380;
import xsna.olc;
import xsna.u2u;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
final class zzi extends u2u {
    public zzi(Context context, Looper looper, olc olcVar, x3j x3jVar, i380 i380Var) {
        super(context, looper, 224, olcVar, x3jVar, i380Var);
    }

    @Override // xsna.rd6
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final void disconnect(String str) {
        "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str));
        super.disconnect(str);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return new Feature[]{d901.c, d901.b, d901.a};
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // xsna.rd6
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
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
