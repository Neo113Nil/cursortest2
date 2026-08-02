package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.util.Log;
import androidx.annotation.NonNull;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.internal.InterfaceC3128f;
import com.google.android.gms.common.api.internal.InterfaceC3146o;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.C3180d;
import com.plaid.internal.EnumC3631g;
import v9.AbstractC6673h;

/* loaded from: classes2.dex */
final class zzi extends AbstractC3181e {
    public zzi(Context context, Looper looper, C3180d c3180d, InterfaceC3128f interfaceC3128f, InterfaceC3146o interfaceC3146o) {
        super(context, looper, EnumC3631g.SDK_ASSET_ILLUSTRATION_ACCOUNT_NUMBER_CONFIRMED_CIRCLE_VALUE, c3180d, interfaceC3128f, interfaceC3146o);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.data.IGoogleAuthService");
        return queryLocalInterface instanceof zzp ? (zzp) queryLocalInterface : new zzp(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final void disconnect(String str) {
        Log.w("GoogleAuthSvcClientImpl", "GoogleAuthServiceClientImpl disconnected with reason: ".concat(String.valueOf(str)));
        super.disconnect(str);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Feature[] getApiFeatures() {
        return new Feature[]{AbstractC6673h.f67111l, AbstractC6673h.f67110k, AbstractC6673h.f67100a};
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 17895000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.data.IGoogleAuthService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    @NonNull
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.authapi.START";
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
