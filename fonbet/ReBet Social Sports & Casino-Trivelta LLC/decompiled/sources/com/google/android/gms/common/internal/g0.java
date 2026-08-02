package com.google.android.gms.common.internal;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.internal.AbstractC3179c;
import java.util.Objects;

/* loaded from: classes2.dex */
public final class g0 extends T {

    /* renamed from: g, reason: collision with root package name */
    public final IBinder f32715g;

    /* renamed from: h, reason: collision with root package name */
    public final /* synthetic */ AbstractC3179c f32716h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g0(AbstractC3179c abstractC3179c, int i10, IBinder iBinder, Bundle bundle) {
        super(abstractC3179c, i10, bundle);
        Objects.requireNonNull(abstractC3179c);
        this.f32716h = abstractC3179c;
        this.f32715g = iBinder;
    }

    @Override // com.google.android.gms.common.internal.T
    public final boolean e() {
        try {
            IBinder iBinder = this.f32715g;
            AbstractC3191o.m(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            AbstractC3179c abstractC3179c = this.f32716h;
            if (!abstractC3179c.getServiceDescriptor().equals(interfaceDescriptor)) {
                String serviceDescriptor = abstractC3179c.getServiceDescriptor();
                StringBuilder sb2 = new StringBuilder(String.valueOf(serviceDescriptor).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb2.append("service descriptor mismatch: ");
                sb2.append(serviceDescriptor);
                sb2.append(" vs. ");
                sb2.append(interfaceDescriptor);
                Log.w("GmsClient", sb2.toString());
                return false;
            }
            IInterface createServiceInterface = abstractC3179c.createServiceInterface(this.f32715g);
            if (createServiceInterface == null || !(abstractC3179c.zze(2, 4, createServiceInterface) || abstractC3179c.zze(3, 4, createServiceInterface))) {
                return false;
            }
            abstractC3179c.zzn(null);
            AbstractC3179c.a zzk = abstractC3179c.zzk();
            Bundle connectionHint = abstractC3179c.getConnectionHint();
            if (zzk == null) {
                return true;
            }
            abstractC3179c.zzk().g(connectionHint);
            return true;
        } catch (RemoteException unused) {
            Log.w("GmsClient", "service probably died");
            return false;
        }
    }

    @Override // com.google.android.gms.common.internal.T
    public final void f(ConnectionResult connectionResult) {
        AbstractC3179c abstractC3179c = this.f32716h;
        if (abstractC3179c.zzl() != null) {
            abstractC3179c.zzl().c(connectionResult);
        }
        abstractC3179c.onConnectionFailed(connectionResult);
    }
}
