package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public abstract class S0 extends AbstractC3166y0 {

    /* renamed from: b, reason: collision with root package name */
    public final TaskCompletionSource f32391b;

    public S0(int i10, TaskCompletionSource taskCompletionSource) {
        super(i10);
        this.f32391b = taskCompletionSource;
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void a(Status status) {
        this.f32391b.trySetException(new com.google.android.gms.common.api.b(status));
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void b(Exception exc) {
        this.f32391b.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void c(C3147o0 c3147o0) {
        try {
            h(c3147o0);
        } catch (DeadObjectException e10) {
            a(a1.e(e10));
            throw e10;
        } catch (RemoteException e11) {
            a(a1.e(e11));
        } catch (RuntimeException e12) {
            this.f32391b.trySetException(e12);
        }
    }

    public abstract void h(C3147o0 c3147o0);
}
