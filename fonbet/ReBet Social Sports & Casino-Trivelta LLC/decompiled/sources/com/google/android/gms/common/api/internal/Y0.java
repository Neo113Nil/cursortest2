package com.google.android.gms.common.api.internal;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.Feature;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.tasks.TaskCompletionSource;

/* loaded from: classes2.dex */
public final class Y0 extends AbstractC3166y0 {

    /* renamed from: b, reason: collision with root package name */
    public final AbstractC3163x f32429b;

    /* renamed from: c, reason: collision with root package name */
    public final TaskCompletionSource f32430c;

    /* renamed from: d, reason: collision with root package name */
    public final InterfaceC3159v f32431d;

    public Y0(int i10, AbstractC3163x abstractC3163x, TaskCompletionSource taskCompletionSource, InterfaceC3159v interfaceC3159v) {
        super(i10);
        this.f32430c = taskCompletionSource;
        this.f32429b = abstractC3163x;
        this.f32431d = interfaceC3159v;
        if (i10 == 2 && abstractC3163x.c()) {
            throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void a(Status status) {
        this.f32430c.trySetException(this.f32431d.a(status));
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void b(Exception exc) {
        this.f32430c.trySetException(exc);
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void c(C3147o0 c3147o0) {
        try {
            this.f32429b.b(c3147o0.v(), this.f32430c);
        } catch (DeadObjectException e10) {
            throw e10;
        } catch (RemoteException e11) {
            a(a1.e(e11));
        } catch (RuntimeException e12) {
            this.f32430c.trySetException(e12);
        }
    }

    @Override // com.google.android.gms.common.api.internal.a1
    public final void d(D d10, boolean z10) {
        d10.d(this.f32430c, z10);
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3166y0
    public final boolean f(C3147o0 c3147o0) {
        return this.f32429b.c();
    }

    @Override // com.google.android.gms.common.api.internal.AbstractC3166y0
    public final Feature[] g(C3147o0 c3147o0) {
        return this.f32429b.e();
    }
}
