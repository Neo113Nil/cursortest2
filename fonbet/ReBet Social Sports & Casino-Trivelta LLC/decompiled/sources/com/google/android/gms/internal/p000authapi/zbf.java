package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.C3180d;
import com.plaid.internal.EnumC3631g;
import z9.d;

/* loaded from: classes2.dex */
public final class zbf extends AbstractC3181e {
    private final Bundle zba;

    public zbf(Context context, Looper looper, d dVar, C3180d c3180d, InterfaceC3128f interfaceC3128f, InterfaceC3146o interfaceC3146o) {
        super(context, looper, EnumC3631g.SDK_ASSET_ICON_REJECTED_REC_VALUE, c3180d, interfaceC3128f, interfaceC3146o);
        Bundle bundle = new Bundle();
        bundle.putString("session_id", null);
        this.zba = bundle;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.identity.internal.IAuthorizationService");
        return queryLocalInterface instanceof zbj ? (zbj) queryLocalInterface : new zbj(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Feature[] getApiFeatures() {
        return zbav.zbx;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.identity.internal.IAuthorizationService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.identity.service.authorization.START";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean getUseDynamicLookup() {
        return true;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean usesClientTelemetry() {
        return true;
    }
}
