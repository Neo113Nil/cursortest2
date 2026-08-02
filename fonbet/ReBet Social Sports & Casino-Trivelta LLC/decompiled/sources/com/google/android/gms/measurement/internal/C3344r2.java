package com.google.android.gms.measurement.internal;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.AbstractC3175h;
import com.google.android.gms.common.internal.AbstractC3179c;

/* renamed from: com.google.android.gms.measurement.internal.r2, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C3344r2 extends AbstractC3179c {
    public C3344r2(Context context, Looper looper, AbstractC3179c.a aVar, AbstractC3179c.b bVar) {
        super(context, looper, 93, aVar, bVar, null);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.measurement.internal.IMeasurementService");
        return queryLocalInterface instanceof InterfaceC3241e2 ? (InterfaceC3241e2) queryLocalInterface : new C3217b2(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return AbstractC3175h.f32612a;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.measurement.internal.IMeasurementService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getStartServiceAction() {
        return "com.google.android.gms.measurement.START";
    }
}
