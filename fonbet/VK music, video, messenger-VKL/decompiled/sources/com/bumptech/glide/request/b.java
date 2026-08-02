package com.bumptech.glide.request;

import androidx.annotation.Nullable;
import com.bumptech.glide.request.RequestCoordinator;
import xsna.f7g0;
import xsna.svj0;

/* compiled from: ThumbnailRequestCoordinator.java */
/* loaded from: classes12.dex */
public final class b implements RequestCoordinator, f7g0 {

    @Nullable
    public final RequestCoordinator a;
    public final Object b;
    public volatile svj0 c;
    public volatile f7g0 d;
    public RequestCoordinator.RequestState e;
    public RequestCoordinator.RequestState f;
    public boolean g;

    public b(Object obj, @Nullable RequestCoordinator requestCoordinator) {
        RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
        this.e = requestState;
        this.f = requestState;
        this.b = obj;
        this.a = requestCoordinator;
    }

    @Override // xsna.f7g0
    public final boolean a() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.SUCCESS;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator, xsna.f7g0
    public final boolean b() {
        boolean z;
        synchronized (this.b) {
            try {
                z = this.d.b() || this.c.b();
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean c(f7g0 f7g0Var) {
        boolean z;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.a;
                z = (requestCoordinator == null || requestCoordinator.c(this)) && f7g0Var.equals(this.c) && !b();
            } finally {
            }
        }
        return z;
    }

    @Override // xsna.f7g0
    public final void clear() {
        synchronized (this.b) {
            this.g = false;
            RequestCoordinator.RequestState requestState = RequestCoordinator.RequestState.CLEARED;
            this.e = requestState;
            this.f = requestState;
            this.d.clear();
            this.c.clear();
        }
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void d(f7g0 f7g0Var) {
        synchronized (this.b) {
            try {
                if (f7g0Var.equals(this.d)) {
                    this.f = RequestCoordinator.RequestState.SUCCESS;
                    return;
                }
                this.e = RequestCoordinator.RequestState.SUCCESS;
                RequestCoordinator requestCoordinator = this.a;
                if (requestCoordinator != null) {
                    requestCoordinator.d(this);
                }
                if (!this.f.h()) {
                    this.d.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f7g0
    public final boolean e(f7g0 f7g0Var) {
        if (!(f7g0Var instanceof b)) {
            return false;
        }
        b bVar = (b) f7g0Var;
        if (this.c == null) {
            if (bVar.c != null) {
                return false;
            }
        } else if (!this.c.e(bVar.c)) {
            return false;
        }
        return this.d == null ? bVar.d == null : this.d.e(bVar.d);
    }

    @Override // xsna.f7g0
    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.CLEARED;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final boolean g(f7g0 f7g0Var) {
        boolean z;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.a;
                z = (requestCoordinator == null || requestCoordinator.g(this)) && (f7g0Var.equals(this.c) || this.e != RequestCoordinator.RequestState.SUCCESS);
            } finally {
            }
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final RequestCoordinator getRoot() {
        RequestCoordinator root;
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.a;
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
        synchronized (this.b) {
            try {
                RequestCoordinator requestCoordinator = this.a;
                z = (requestCoordinator == null || requestCoordinator.h(this)) && f7g0Var.equals(this.c) && this.e != RequestCoordinator.RequestState.PAUSED;
            } finally {
            }
        }
        return z;
    }

    @Override // xsna.f7g0
    public final void i() {
        synchronized (this.b) {
            try {
                this.g = true;
                try {
                    if (this.e != RequestCoordinator.RequestState.SUCCESS) {
                        RequestCoordinator.RequestState requestState = this.f;
                        RequestCoordinator.RequestState requestState2 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState != requestState2) {
                            this.f = requestState2;
                            this.d.i();
                        }
                    }
                    if (this.g) {
                        RequestCoordinator.RequestState requestState3 = this.e;
                        RequestCoordinator.RequestState requestState4 = RequestCoordinator.RequestState.RUNNING;
                        if (requestState3 != requestState4) {
                            this.e = requestState4;
                            this.c.i();
                        }
                    }
                    this.g = false;
                } catch (Throwable th) {
                    this.g = false;
                    throw th;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // xsna.f7g0
    public final boolean isRunning() {
        boolean z;
        synchronized (this.b) {
            z = this.e == RequestCoordinator.RequestState.RUNNING;
        }
        return z;
    }

    @Override // com.bumptech.glide.request.RequestCoordinator
    public final void j(f7g0 f7g0Var) {
        synchronized (this.b) {
            try {
                if (!f7g0Var.equals(this.c)) {
                    this.f = RequestCoordinator.RequestState.FAILED;
                    return;
                }
                this.e = RequestCoordinator.RequestState.FAILED;
                RequestCoordinator requestCoordinator = this.a;
                if (requestCoordinator != null) {
                    requestCoordinator.j(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.f7g0
    public final void pause() {
        synchronized (this.b) {
            try {
                if (!this.f.h()) {
                    this.f = RequestCoordinator.RequestState.PAUSED;
                    this.d.pause();
                }
                if (!this.e.h()) {
                    this.e = RequestCoordinator.RequestState.PAUSED;
                    this.c.pause();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }
}
