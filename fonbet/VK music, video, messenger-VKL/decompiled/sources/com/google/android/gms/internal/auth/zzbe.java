package com.google.android.gms.internal.auth;

import android.accounts.Account;
import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.text.TextUtils;
import xsna.a65;
import xsna.b65;
import xsna.i380;
import xsna.olc;
import xsna.u2u;
import xsna.vnz0;
import xsna.x3j;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzbe extends u2u {
    private final Bundle zze;

    public zzbe(Context context, Looper looper, olc olcVar, b65 b65Var, x3j x3jVar, i380 i380Var) {
        super(context, looper, 16, olcVar, x3jVar, i380Var);
        this.zze = b65Var == null ? new Bundle() : new Bundle(b65Var.b);
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.internal.IAuthService");
        return queryLocalInterface instanceof zzbh ? (zzbh) queryLocalInterface : new zzbh(iBinder);
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zze;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.internal.IAuthService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.service.START";
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final boolean requiresSignIn() {
        olc clientSettings = getClientSettings();
        Account account = clientSettings.a;
        if (TextUtils.isEmpty(account != null ? account.name : null)) {
            return false;
        }
        if (((vnz0) clientSettings.d.get(a65.a)) == null) {
            return !clientSettings.b.isEmpty();
        }
        throw null;
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
