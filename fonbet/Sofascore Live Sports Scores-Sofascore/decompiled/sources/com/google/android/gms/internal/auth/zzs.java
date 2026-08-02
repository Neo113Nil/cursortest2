package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.joo;
import defpackage.z9p;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzs implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        zzp zzpVar = (zzp) ((joo) anyClient).getService();
        z9p z9pVar = new z9p(taskCompletionSource);
        Parcel J = zzpVar.J();
        zzc.c(J, z9pVar);
        J.writeInt(0);
        J.writeString(null);
        J.writeInt(0);
        zzpVar.S1(J, 1);
    }
}
