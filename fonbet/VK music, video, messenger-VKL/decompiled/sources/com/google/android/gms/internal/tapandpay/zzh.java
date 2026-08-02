package com.google.android.gms.internal.tapandpay;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.c;
import xsna.olc;
import xsna.u2u;
import xsna.zsz0;

/* compiled from: com.google.android.gms:play-services-tapandpay@@17.0.1 */
/* loaded from: classes12.dex */
public final class zzh extends u2u<zze> {
    public zzh(Context context, Looper looper, c.b bVar, c.InterfaceC0114c interfaceC0114c, olc olcVar) {
        super(context, looper, 79, olcVar, bVar, interfaceC0114c);
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.tapandpay.internal.ITapAndPayService");
        return queryLocalInterface instanceof zze ? (zze) queryLocalInterface : new zzg(iBinder);
    }

    @Override // xsna.rd6
    public final Feature[] getApiFeatures() {
        return zsz0.a;
    }

    @Override // xsna.rd6
    public final Bundle getGetServiceRequestExtraArgs() {
        return new Bundle();
    }

    @Override // xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.tapandpay.internal.ITapAndPayService";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.tapandpay.service.BIND";
    }
}
