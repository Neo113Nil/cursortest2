package com.google.android.gms.internal.identity;

import android.accounts.Account;
import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Log;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.C3180d;
import com.google.android.gms.identity.intents.UserAddressRequest;

/* loaded from: classes2.dex */
public final class zze extends AbstractC3181e {
    private final Activity zze;
    private zzd zzf;
    private final String zzg;
    private final int zzh;

    public zze(Activity activity, Looper looper, C3180d c3180d, int i10, f.b bVar, f.c cVar) {
        super((Context) activity, looper, 12, c3180d, bVar, cVar);
        this.zzg = c3180d.b();
        this.zze = activity;
        this.zzh = i10;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* bridge */ /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return queryLocalInterface instanceof zzh ? (zzh) queryLocalInterface : new zzh(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final void disconnect() {
        super.disconnect();
        zzd zzdVar = this.zzf;
        if (zzdVar != null) {
            zzdVar.zzb = null;
            this.zzf = null;
        }
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return AbstractC3175h.f32612a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final boolean requiresAccount() {
        return true;
    }

    public final void zzp(UserAddressRequest userAddressRequest, int i10) {
        super.checkConnected();
        this.zzf = new zzd(i10, this.zze);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.zzg)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzg, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.zzh);
            ((zzh) super.getService()).zzc((zzg) AbstractC3191o.m(this.zzf), userAddressRequest, bundle);
        } catch (RemoteException e10) {
            Log.e("AddressClientImpl", "Exception requesting user address", e10);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
            ((zzd) AbstractC3191o.m(this.zzf)).zzc(1, bundle2);
        }
    }
}
