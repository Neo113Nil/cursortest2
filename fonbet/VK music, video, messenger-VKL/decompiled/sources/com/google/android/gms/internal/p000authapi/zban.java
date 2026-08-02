package com.google.android.gms.internal.p000authapi;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;
import xsna.i7o0;
import xsna.mov;

/* compiled from: com.google.android.gms:play-services-auth@@21.1.1 */
/* loaded from: classes12.dex */
final class zban extends mov.a {
    final /* synthetic */ TaskCompletionSource zba;

    public zban(zbaq zbaqVar, TaskCompletionSource taskCompletionSource) {
        this.zba = taskCompletionSource;
    }

    @Override // xsna.mov
    public final void onResult(Status status) throws RemoteException {
        i7o0.i(status, null, this.zba);
    }
}
