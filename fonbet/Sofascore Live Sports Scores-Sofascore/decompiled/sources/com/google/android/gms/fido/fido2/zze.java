package com.google.android.gms.fido.fido2;

import android.os.Parcel;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.fido.zzs;
import com.google.android.gms.tasks.TaskCompletionSource;
import defpackage.ebo;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final /* synthetic */ class zze implements RemoteCall {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.gms.common.api.internal.RemoteCall
    public final void u(Api.AnyClient anyClient, TaskCompletionSource taskCompletionSource) {
        ebo eboVar = new ebo(2, taskCompletionSource);
        zzs zzsVar = (zzs) ((com.google.android.gms.internal.fido.zzp) anyClient).getService();
        Parcel J = zzsVar.J();
        ClassLoader classLoader = com.google.android.gms.internal.fido.zzc.a;
        J.writeStrongBinder(eboVar);
        J.writeInt(0);
        zzsVar.S1(J, 2);
    }
}
