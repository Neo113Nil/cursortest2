package com.google.android.gms.internal.fido;

import P9.b;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.C3180d;
import com.plaid.internal.EnumC3631g;

/* loaded from: classes2.dex */
public final class zzk extends AbstractC3181e {
    public zzk(Context context, Looper looper, C3180d c3180d, f.b bVar, f.c cVar) {
        super(context, looper, EnumC3631g.SDK_ASSET_ILLUSTRATION_SDK_EMPTY_SVG_VALUE, c3180d, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService");
        return queryLocalInterface instanceof zzn ? (zzn) queryLocalInterface : new zzn(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Feature[] getApiFeatures() {
        return new Feature[]{b.f8940h, b.f8941i, b.f8952t};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("FIDO2_ACTION_START_SERVICE", "com.google.android.gms.fido.fido2.privileged.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.fido2.internal.privileged.IFido2PrivilegedService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.fido2.privileged.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
