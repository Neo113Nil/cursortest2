package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.joo;
import defpackage.k4n;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzq implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzp zzpVar = (zzp) ((joo) anyClient).getService();
        k4n k4nVar = new k4n(1, taskCompletionSource);
        Parcel J = zzpVar.J();
        zzc.c(J, k4nVar);
        J.writeString(null);
        zzpVar.S1(J, 3);
    }
}
