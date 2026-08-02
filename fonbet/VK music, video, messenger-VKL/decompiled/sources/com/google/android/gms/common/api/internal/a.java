package com.google.android.gms.common.api.internal;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.a;
import com.google.android.gms.common.api.a.b;
import com.google.android.gms.common.api.c;
import com.google.android.gms.common.api.internal.BasePendingResult;
import xsna.exc0;
import xsna.qdg0;
import xsna.ue6;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
/* loaded from: classes12.dex */
public abstract class a<R extends qdg0, A extends a.b> extends BasePendingResult<R> implements ue6<R> {

    @Nullable
    private final com.google.android.gms.common.api.a<?> api;
    private final a.c<A> clientKey;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    @Deprecated
    public a(@NonNull a.c<A> cVar, @NonNull c cVar2) {
        super(cVar2);
        exc0.j(cVar2, "GoogleApiClient must not be null");
        exc0.i(cVar);
        this.clientKey = cVar;
        this.api = null;
    }

    private void setFailedResult(@NonNull RemoteException remoteException) {
        setFailedResult(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
    }

    public abstract void doExecute(@NonNull A a) throws RemoteException;

    @Nullable
    public final com.google.android.gms.common.api.a<?> getApi() {
        return this.api;
    }

    @NonNull
    public final a.c<A> getClientKey() {
        return this.clientKey;
    }

    public final void run(@NonNull A a) throws DeadObjectException {
        try {
            doExecute(a);
        } catch (DeadObjectException e) {
            setFailedResult(e);
            throw e;
        } catch (RemoteException e2) {
            setFailedResult(e2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.ue6
    public /* bridge */ /* synthetic */ void setResult(@NonNull Object obj) {
        setResult((a<R, A>) obj);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NonNull com.google.android.gms.common.api.a<?> aVar, @NonNull c cVar) {
        super(cVar);
        exc0.j(cVar, "GoogleApiClient must not be null");
        exc0.j(aVar, "Api must not be null");
        this.clientKey = aVar.b;
        this.api = aVar;
    }

    @Override // xsna.ue6
    public final void setFailedResult(@NonNull Status status) {
        exc0.a("Failed result must not be success", !status.i());
        R createFailedResult = createFailedResult(status);
        setResult((a<R, A>) createFailedResult);
        onSetFailedResult(createFailedResult);
    }

    public a(@NonNull BasePendingResult.a<R> aVar) {
        super(aVar);
        this.clientKey = new a.c<>();
        this.api = null;
    }

    public void onSetFailedResult(@NonNull R r) {
    }
}
