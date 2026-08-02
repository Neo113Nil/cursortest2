package com.google.android.gms.internal.fitness;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.c;
import xsna.olc;

/* compiled from: com.google.android.gms:play-services-fitness@@21.2.0 */
/* loaded from: classes12.dex */
public final class zzap extends zze {
    public static final a.g zze;
    public static final a zzf;
    public static final a zzg;
    public static final int zzh = 63;

    /* JADX WARN: Multi-variable type inference failed */
    static {
        a.g gVar = new a.g();
        zze = gVar;
        zzf = new a("Fitness.INTERNAL_API", new zzal(null), gVar);
        zzg = new a("Fitness.INTERNAL_CLIENT", new zzan(0 == true ? 1 : 0), gVar);
    }

    public /* synthetic */ zzap(Context context, Looper looper, olc olcVar, c.b bVar, c.InterfaceC0114c interfaceC0114c, zzao zzaoVar) {
        super(context, looper, zzh, bVar, interfaceC0114c, olcVar);
    }

    @Override // xsna.rd6
    public final /* synthetic */ IInterface createServiceInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.fitness.internal.IGoogleFitInternalApi");
        return queryLocalInterface instanceof zzch ? (zzch) queryLocalInterface : new zzch(iBinder);
    }

    @Override // com.google.android.gms.internal.fitness.zze, xsna.rd6, com.google.android.gms.common.api.a.f
    public final int getMinApkVersion() {
        return 12451000;
    }

    @Override // xsna.rd6
    public final String getServiceDescriptor() {
        return "com.google.android.gms.fitness.internal.IGoogleFitInternalApi";
    }

    @Override // xsna.rd6
    public final String getStartServiceAction() {
        return "com.google.android.gms.fitness.InternalApi";
    }
}
