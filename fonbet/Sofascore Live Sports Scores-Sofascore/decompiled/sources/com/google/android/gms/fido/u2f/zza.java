package com.google.android.gms.fido.u2f;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.fido.zzc;
import com.google.android.gms.internal.fido.zzw;
import com.google.android.gms.internal.fido.zzy;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.yqn;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zza implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        yqn yqnVar = new yqn(0, taskCompletionSource);
        zzw zzwVar = (zzw) ((zzy) anyClient).getService();
        Parcel J = zzwVar.J();
        ClassLoader classLoader = zzc.a;
        J.writeStrongBinder(yqnVar);
        J.writeInt(0);
        zzwVar.S1(J, 1);
    }
}
