package com.google.android.gms.internal.appset;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.tzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzm implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzg zzgVar = (zzg) ((zzd) anyClient).getService();
        com.google.android.gms.appset.zza zzaVar = new com.google.android.gms.appset.zza(null, null);
        tzo tzoVar = new tzo(taskCompletionSource);
        zzgVar.getClass();
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.appset.internal.IAppSetService");
        int i = zzc.a;
        obtain.writeInt(1);
        zzaVar.writeToParcel(obtain, 0);
        obtain.writeStrongBinder(tzoVar);
        Parcel obtain2 = Parcel.obtain();
        try {
            zzgVar.a.transact(1, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain.recycle();
            obtain2.recycle();
        }
    }
}
