package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;
import xsna.f7g0;

/* compiled from: ErrorRequestCoordinator.java */
/* loaded from: classes12.dex */
public final class a implements RequestCoordinator, f7g0 {
    public final Object a;

    @Nullable
    public final RequestCoordinator b;
    public volatile f7g0 c;
    public volatile f7g0 d;
    public RequestCoordinator.RequestState e;
    public RequestCoordinator.RequestState f;

    public a(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.a = obj;
        this.b = requestCoordinator;
    }

    @Override // xsna.f7g0
    public final boolean a() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.SUCCESS;
                z = requestState == requestState2 || this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, xsna.f7g0
    public final boolean b() {
        boolean z;
        synchronized (this.a) {
            try {
                z = this.c.b() || this.d.b();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean c(f7g0 f7g0Var) {
        boolean z;
        RequestCoordinator.RequestState requestState;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = false;
            if (requestCoordinator == null || requestCoordinator.c(this)) {
                RequestCoordinator.RequestState requestState2 = this.e;
                RequestCoordinator.RequestState requestState3 = RequestCoordinator.RequestState.FAILED;
                if (requestState2 != requestState3 ? f7g0Var.equals(this.c) : f7g0Var.equals(this.d) && ((requestState = this.f) == RequestCoordinator.RequestState.SUCCESS || requestState == requestState3)) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // xsna.f7g0
    public final void clear() {
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
                this.e = requestState;
                this.c.clear();
                if (this.f != requestState) {
                    this.f = requestState;
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void d(f7g0 f7g0Var) {
        synchronized (this.a) {
            try {
                if (f7g0Var.equals(this.c)) {
                    this.e = RequestCoordinator.RequestState.SUCCESS;
                } else if (f7g0Var.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                }
                RequestCoordinator requestCoordinator = this.b;
                if (requestCoordinator != null) {
                    requestCoordinator.d(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f7g0
    public final boolean e(f7g0 f7g0Var) {
        if (f7g0Var instanceof a) {
            a aVar = (a) f7g0Var;
            if (this.c.e(aVar.c) && this.d.e(aVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // xsna.f7g0
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.CLEARED;
                z = requestState == requestState2 && this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean g(f7g0 f7g0Var) {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = requestCoordinator == null || requestCoordinator.g(this);
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.a) {
            try {
                RequestCoordinator requestCoordinator = this.b;
                root = requestCoordinator != null ? requestCoordinator.getRoot() : this;
            } catch (Throwable th) {
                throw th;
            }
        }
        return root;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean h(f7g0 f7g0Var) {
        boolean z;
        synchronized (this.a) {
            RequestCoordinator requestCoordinator = this.b;
            z = (requestCoordinator == null || requestCoordinator.h(this)) && f7g0Var.equals(this.c);
        }
        return z;
    }

    @Override // xsna.f7g0
    public final void i() {
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.e = requestState2;
                    this.c.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f7g0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                z = requestState == requestState2 || this.f == requestState2;
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void j(f7g0 f7g0Var) {
        synchronized (this.a) {
            try {
                if (f7g0Var.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    RequestCoordinator requestCoordinator = this.b;
                    if (requestCoordinator != null) {
                        requestCoordinator.j(this);
                    }
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator.RequestState requestState = this.f;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState != requestState2) {
                    this.f = requestState2;
                    this.d.i();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f7g0
    public final void pause() {
        synchronized (this.a) {
            try {
                RequestCoordinator.RequestState requestState = this.e;
                RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                if (requestState == requestState2) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
                if (this.f == requestState2) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
