package com.google.android.gms.internal.fido;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.C3180d;

/* loaded from: classes2.dex */
public final class zzac extends AbstractC3181e {
    public zzac(Context context, Looper looper, C3180d c3180d, f.b bVar, f.c cVar) {
        super(context, looper, 119, c3180d, bVar, cVar);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService");
        return queryLocalInterface instanceof zzz ? (zzz) queryLocalInterface : new zzz(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Bundle getGetServiceRequestExtraArgs() {
        Bundle bundle = new Bundle();
        bundle.putString("ACTION_START_SERVICE", "com.google.android.gms.fido.u2f.zeroparty.START");
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 13000000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fido.u2f.internal.zeroparty.IU2fZeroPartyService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.fido.u2f.zeroparty.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
