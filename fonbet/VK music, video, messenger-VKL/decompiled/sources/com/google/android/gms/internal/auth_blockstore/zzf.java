package com.google.android.gms.internal.auth_blockstore;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.Feature;
import xsna.i380;
import xsna.olc;
import xsna.u2u;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-auth-blockstore@@16.4.0 */
/* loaded from: classes.dex */
public final class zzf extends u2u {
    public zzf(Context context, Looper looper, olc olcVar, x3j x3jVar, i380 i380Var) {
        super(context, looper, 258, olcVar, x3jVar, i380Var);
    }

    @Override // xsna.rd6
    @Nullable
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.blockstore.internal.IBlockstoreService");
        return queryLocalInterface instanceof zzg ? (zzg) queryLocalInterface : new zzg(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return zzab.zzl;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // xsna.rd6
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.blockstore.internal.IBlockstoreService";
    }

    @Override // xsna.rd6
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.blockstore.service.START";
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
