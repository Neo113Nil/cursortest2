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
import com.google.android.gms.common.api.c;
import com.google.android.gms.identity.intents.UserAddressRequest;
import xsna.olc;
import xsna.u2u;

/* loaded from: classes12.dex */
public final class zze extends u2u<zzi> {
    private Activity mActivity;
    private final int mTheme;
    private zzf zzh;
    private final String zzi;

    public zze(Activity activity, Looper looper, olc olcVar, int i, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super((Context) activity, looper, 12, olcVar, bVar, interfaceC0114c);
        Account account = olcVar.a;
        this.zzi = account != null ? account.name : null;
        this.mActivity = activity;
        this.mTheme = i;
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.identity.intents.internal.IAddressService");
        return queryLocalInterface instanceof zzi ? (zzi) queryLocalInterface : new zzj(iBinder);
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final void disconnect() {
        super.disconnect();
        zzf zzfVar = this.zzh;
        if (zzfVar != null) {
            zzfVar.setActivity(null);
            this.zzh = null;
        }
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.identity.intents.internal.IAddressService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.identity.service.BIND";
    }

    @Override // xsna.rd6
    public final boolean requiresAccount() {
        return true;
    }

    public final void zza(UserAddressRequest userAddressRequest, int i) {
        checkConnected();
        this.zzh = new zzf(i, this.mActivity);
        try {
            Bundle bundle = new Bundle();
            bundle.putString("com.google.android.gms.identity.intents.EXTRA_CALLING_PACKAGE_NAME", getContext().getPackageName());
            if (!TextUtils.isEmpty(this.zzi)) {
                bundle.putParcelable("com.google.android.gms.identity.intents.EXTRA_ACCOUNT", new Account(this.zzi, "com.google"));
            }
            bundle.putInt("com.google.android.gms.identity.intents.EXTRA_THEME", this.mTheme);
            ((zzi) getService()).zza(this.zzh, userAddressRequest, bundle);
        } catch (RemoteException e) {
            Log.e("AddressClientImpl", "Exception requesting user address", e);
            Bundle bundle2 = new Bundle();
            bundle2.putInt("com.google.android.gms.identity.intents.EXTRA_ERROR_CODE", 555);
            this.zzh.zza(1, bundle2);
        }
    }
}
