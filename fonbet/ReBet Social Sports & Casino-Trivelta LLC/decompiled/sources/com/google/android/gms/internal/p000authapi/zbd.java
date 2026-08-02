package com.google.android.gms.internal.p000authapi;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.f;
import com.google.android.gms.common.internal.AbstractC3181e;
import com.google.android.gms.common.internal.C3180d;
import x9.C6811f;
import x9.C6812g;

/* loaded from: classes2.dex */
public final class zbd extends AbstractC3181e {
    private final C6812g zba;

    public zbd(Context context, Looper looper, C3180d c3180d, C6812g c6812g, f.b bVar, f.c cVar) {
        super(context, looper, 68, c3180d, bVar, cVar);
        C6811f c6811f = new C6811f(c6812g == null ? C6812g.f67970d : c6812g);
        c6811f.a(zbaw.zba());
        this.zba = new C6812g(c6811f);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.auth.api.credentials.internal.ICredentialsService");
        return queryLocalInterface instanceof zbe ? (zbe) queryLocalInterface : new zbe(iBinder);
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final Bundle getGetServiceRequestExtraArgs() {
        return this.zba.a();
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c, com.google.android.gms.common.api.C3117a.f
    public final int getMinApkVersion() {
        return 12800000;
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getServiceDescriptor() {
        return "com.google.android.gms.auth.api.credentials.internal.ICredentialsService";
    }

    @Override // com.google.android.gms.common.internal.AbstractC3179c
    public final String getStartServiceAction() {
        return "com.google.android.gms.auth.api.credentials.service.START";
    }
}
