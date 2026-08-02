package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.uzo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzm implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        uzo uzoVar = new uzo(taskCompletionSource);
        zzh zzhVar = (zzh) ((zzw) anyClient).getService();
        zzhVar.getClass();
        Parcel J = zza.J();
        int i = zzc.a;
        J.writeStrongBinder(uzoVar);
        zzhVar.S1(J, 3);
    }
}
