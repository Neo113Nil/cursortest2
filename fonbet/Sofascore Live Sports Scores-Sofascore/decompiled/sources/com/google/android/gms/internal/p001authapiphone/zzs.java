package com.google.android.gms.internal.p001authapiphone;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.v7p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzs implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        v7p v7pVar = new v7p(taskCompletionSource);
        zzh zzhVar = (zzh) ((zzw) anyClient).getService();
        zzhVar.getClass();
        Parcel J = zza.J();
        int i = zzc.a;
        J.writeStrongBinder(v7pVar);
        zzhVar.S1(J, 6);
    }
}
