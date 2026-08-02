package com.google.android.gms.internal.auth;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
import xsna.d901;
import xsna.h501;
import xsna.i801;
import xsna.l701;
import xsna.olc;
import xsna.u2u;

/* compiled from: com.google.android.gms:play-services-auth-base@@18.0.10 */
/* loaded from: classes12.dex */
public final class zzam extends u2u {
    public zzam(Context context, Looper looper, olc olcVar, c.b bVar, c.InterfaceC0114c interfaceC0114c) {
        super(context, looper, 120, olcVar, bVar, interfaceC0114c);
    }

    @Override // xsna.rd6
    public final IInterface createServiceInterface(IBinder iBinder) {
        int i = l701.a;
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.account.IWorkAccountService");
        return queryLocalInterface instanceof i801 ? (i801) queryLocalInterface : new h501(iBinder, "com.google.android.gms.auth.account.IWorkAccountService");
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return new Feature[]{d901.d};
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.account.IWorkAccountService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.account.workaccount.START";
    }

    @Override // xsna.rd6
    public final boolean usesClientTelemetry() {
        return true;
    }
}
