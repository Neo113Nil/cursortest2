package com.google.android.gms.internal.auth;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.joo;
import defpackage.uep;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zzu implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        uep uepVar = new uep(taskCompletionSource);
        zzp zzpVar = (zzp) ((joo) anyClient).getService();
        Parcel J = zzpVar.J();
        zzc.c(J, uepVar);
        J.writeInt(0);
        zzpVar.S1(J, 4);
    }
}
