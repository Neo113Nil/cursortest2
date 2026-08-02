package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.BaseGmsClient;
import defpackage.g4n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzf extends g4n {
    public final IBinder g;
    public final /* synthetic */ BaseGmsClient h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zzf(BaseGmsClient baseGmsClient, int i, IBinder iBinder, Bundle bundle) {
        super(baseGmsClient, i, bundle);
        this.h = baseGmsClient;
        this.g = iBinder;
    }

    @Override // defpackage.g4n
    public final boolean b() {
        String interfaceDescriptor;
        BaseGmsClient baseGmsClient;
        String g;
        BaseGmsClient.BaseConnectionCallbacks baseConnectionCallbacks;
        IBinder iBinder = this.g;
        try {
            Preconditions.i(iBinder);
            interfaceDescriptor = iBinder.getInterfaceDescriptor();
            baseGmsClient = this.h;
            g = baseGmsClient.g();
            baseConnectionCallbacks = baseGmsClient.u;
        } catch (RemoteException unused) {
        }
        if (!g.equals(interfaceDescriptor)) {
            new StringBuilder(baseGmsClient.g().length() + 34 + String.valueOf(interfaceDescriptor).length());
            return false;
        }
        IInterface b = baseGmsClient.b(iBinder);
        if (b != null && (baseGmsClient.r(2, 4, b) || baseGmsClient.r(3, 4, b))) {
            baseGmsClient.A = null;
            Bundle connectionHint = baseGmsClient.getConnectionHint();
            if (baseConnectionCallbacks == null) {
                return true;
            }
            baseConnectionCallbacks.onConnected(connectionHint);
            return true;
        }
        return false;
    }

    @Override // defpackage.g4n
    public final void c(ConnectionResult connectionResult) {
        BaseGmsClient baseGmsClient = this.h;
        BaseGmsClient.BaseOnConnectionFailedListener baseOnConnectionFailedListener = baseGmsClient.v;
        if (baseOnConnectionFailedListener != null) {
            baseOnConnectionFailedListener.J(connectionResult);
        }
        baseGmsClient.k(connectionResult);
    }
}
