package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import com.google.android.gms.common.api.C3117a;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;

/* renamed from: com.google.android.gms.common.api.internal.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3124d extends BasePendingResult implements InterfaceC3126e {
    private final C3117a api;
    private final C3117a.c clientKey;

    public AbstractC3124d(C3117a c3117a, com.google.android.gms.common.api.f fVar) {
        super((com.google.android.gms.common.api.f) AbstractC3191o.n(fVar, "GoogleApiClient must not be null"));
        AbstractC3191o.n(c3117a, "Api must not be null");
        this.clientKey = c3117a.b();
        this.api = c3117a;
    }

    public final void c(RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public abstract void doExecute(@NonNull C3117a.b bVar);

    public final C3117a getApi() {
        return this.api;
    }

    @NonNull
    public final C3117a.c getClientKey() {
        return this.clientKey;
    }

    public void onSetFailedResult(@NonNull com.google.android.gms.common.api.l lVar) {
    }

    public final void run(@NonNull C3117a.b bVar) {
        try {
            doExecute(bVar);
        } catch (DeadObjectException e10) {
            c(e10);
            throw e10;
        } catch (RemoteException e11) {
            c(e11);
        }
    }

    @Override // com.google.android.gms.common.api.internal.InterfaceC3126e
    public final void setFailedResult(@NonNull Status status) {
        AbstractC3191o.b(!status.l(), "Failed result must not be success");
        com.google.android.gms.common.api.l createFailedResult = createFailedResult(status);
        setResult((AbstractC3124d) createFailedResult);
        onSetFailedResult(createFailedResult);
    }
}
