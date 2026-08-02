package com.google.android.gms.internal.auth_blockstore;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.aap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzt implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        aap aapVar = new aap(1, taskCompletionSource);
        zzg zzgVar = (zzg) ((zzf) anyClient).getService();
        Parcel J = zzgVar.J();
        zzc.c(J, aapVar);
        zzgVar.S1(J, 2);
    }
}
