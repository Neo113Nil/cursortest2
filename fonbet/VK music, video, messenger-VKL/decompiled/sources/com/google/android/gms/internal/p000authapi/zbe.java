package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.c;
import xsna.olc;
import xsna.sqz0;
import xsna.tqz0;
import xsna.u2u;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
public final class zbe extends u2u {
    private final tqz0 zba;

    public zbe(Context context, Looper looper, olc olcVar, tqz0 tqz0Var, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 68, olcVar, bVar, interfaceC0114c);
        tqz0Var = tqz0Var == null ? tqz0.d : tqz0Var;
        sqz0 sqz0Var = new sqz0();
        sqz0Var.a = Boolean.FALSE;
        tqz0 tqz0Var2 = tqz0.d;
        tqz0Var.getClass();
        sqz0Var.a = Boolean.valueOf(tqz0Var.b);
        sqz0Var.b = tqz0Var.c;
        sqz0Var.b = zbat.zba();
        this.zba = new tqz0(sqz0Var);
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbf ? (zbf) queryLocalInterface : new zbf(iBinder);
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        tqz0 tqz0Var = this.zba;
        tqz0Var.getClass();
        Bundle bundle = new Bundle();
        bundle.putString("consumer_package", null);
        bundle.putBoolean("force_save_dialog", tqz0Var.b);
        bundle.putString("log_session_id", tqz0Var.c);
        return bundle;
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
