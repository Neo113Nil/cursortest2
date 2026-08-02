package com.google.android.gms.signin.internal;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.internal.Storage;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.BaseGmsClient;
import com.google.android.gms.common.internal.ClientSettings;
import com.google.android.gms.common.internal.GmsClient;
import com.google.android.gms.common.internal.IAccountAccessor;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.internal.zaw;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
/* loaded from: classes3.dex */
public class SignInClientImpl extends GmsClient<zaf> implements com.google.android.gms.signin.zae {
    public final boolean I;
    public final ClientSettings J;
    public final Bundle K;
    public final Integer L;

    public SignInClientImpl(Context context, Looper looper, ClientSettings clientSettings, Bundle bundle, GoogleApiClient.ConnectionCallbacks connectionCallbacks, GoogleApiClient.OnConnectionFailedListener onConnectionFailedListener) {
        super(context, looper, 44, clientSettings, connectionCallbacks, onConnectionFailedListener);
        this.I = true;
        this.J = clientSettings;
        this.K = bundle;
        this.L = clientSettings.h;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void a(IAccountAccessor iAccountAccessor, boolean z) {
        try {
            zaf zafVar = (zaf) getService();
            Integer num = this.L;
            Preconditions.i(num);
            int intValue = num.intValue();
            Parcel J = zafVar.J();
            int i = com.google.android.gms.internal.base.zac.a;
            if (iAccountAccessor == null) {
                J.writeStrongBinder(null);
            } else {
                J.writeStrongBinder(iAccountAccessor.asBinder());
            }
            J.writeInt(intValue);
            J.writeInt(z ? 1 : 0);
            zafVar.S1(J, 9);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.signin.internal.ISignInService");
        return queryLocalInterface instanceof zaf ? (zaf) queryLocalInterface : new zaf(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void d(zac zacVar) {
        try {
            try {
                Account account = this.J.a;
                if (account == null) {
                    account = new Account(BaseGmsClient.DEFAULT_ACCOUNT, "com.google");
                }
                GoogleSignInAccount b = BaseGmsClient.DEFAULT_ACCOUNT.equals(account.name) ? Storage.a(getContext()).b() : null;
                Integer num = this.L;
                Preconditions.i(num);
                zaw zawVar = new zaw(2, account, num.intValue(), b);
                zaf zafVar = (zaf) getService();
                zai zaiVar = new zai(1, zawVar);
                Parcel J = zafVar.J();
                com.google.android.gms.internal.base.zac.b(J, zaiVar);
                J.writeStrongBinder(zacVar.asBinder());
                zafVar.S1(J, 12);
            } catch (RemoteException unused) {
            }
        } catch (RemoteException unused2) {
            zacVar.p0(new zak(1, new ConnectionResult(8, null, null), null));
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final Bundle e() {
        ClientSettings clientSettings = this.J;
        boolean equals = getContext().getPackageName().equals(clientSettings.e);
        Bundle bundle = this.K;
        if (!equals) {
            bundle.putString("com.google.android.gms.signin.internal.realClientPackageName", clientSettings.e);
        }
        return bundle;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String g() {
        return "com.google.android.gms.signin.internal.ISignInService";
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient
    public final String h() {
        return "com.google.android.gms.signin.service.START";
    }

    @Override // com.google.android.gms.signin.zae
    public final void l() {
        connect(new BaseGmsClient.LegacyClientCallbackAdapter());
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.signin.zae
    public final void n() {
        try {
            zaf zafVar = (zaf) getService();
            Integer num = this.L;
            Preconditions.i(num);
            int intValue = num.intValue();
            Parcel J = zafVar.J();
            J.writeInt(intValue);
            zafVar.S1(J, 7);
        } catch (RemoteException unused) {
        }
    }

    @Override // com.google.android.gms.common.internal.BaseGmsClient, com.google.android.gms.common.api.Api.Client
    public final boolean requiresSignIn() {
        return this.I;
    }
}
