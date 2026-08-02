package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.AbstractC3191o;
import java.lang.ref.WeakReference;

/* loaded from: classes2.dex */
public final class T0 extends com.google.android.gms.common.api.p implements com.google.android.gms.common.api.m {

    /* renamed from: e, reason: collision with root package name */
    public final WeakReference f32396e;

    /* renamed from: f, reason: collision with root package name */
    public final R0 f32397f;

    /* renamed from: a, reason: collision with root package name */
    public T0 f32392a = null;

    /* renamed from: b, reason: collision with root package name */
    public com.google.android.gms.common.api.h f32393b = null;

    /* renamed from: c, reason: collision with root package name */
    public final Object f32394c = new Object();

    /* renamed from: d, reason: collision with root package name */
    public Status f32395d = null;

    /* renamed from: g, reason: collision with root package name */
    public boolean f32398g = false;

    public T0(WeakReference weakReference) {
        AbstractC3191o.n(weakReference, "GoogleApiClient reference must not be null");
        this.f32396e = weakReference;
        com.google.android.gms.common.api.f fVar = (com.google.android.gms.common.api.f) weakReference.get();
        this.f32397f = new R0(this, fVar != null ? fVar.l() : Looper.getMainLooper());
    }

    public static final void l(com.google.android.gms.common.api.l lVar) {
    }

    @Override // com.google.android.gms.common.api.m
    public final void a(com.google.android.gms.common.api.l lVar) {
        synchronized (this.f32394c) {
            try {
                if (!lVar.getStatus().l()) {
                    h(lVar.getStatus());
                    l(lVar);
                } else if (k()) {
                    android.support.v4.media.session.b.a(AbstractC3191o.m(null));
                    throw null;
                }
            } finally {
            }
        }
    }

    public final com.google.android.gms.common.api.p b(com.google.android.gms.common.api.n nVar) {
        T0 t02;
        synchronized (this.f32394c) {
            AbstractC3191o.q(true, "Cannot call then() twice.");
            AbstractC3191o.q(true, "Cannot call then() and andFinally() on the same TransformedResult.");
            t02 = new T0(this.f32396e);
            this.f32392a = t02;
            i();
        }
        return t02;
    }

    public final void f() {
    }

    public final void g(com.google.android.gms.common.api.h hVar) {
        synchronized (this.f32394c) {
            this.f32393b = hVar;
            i();
        }
    }

    public final void h(Status status) {
        synchronized (this.f32394c) {
            this.f32395d = status;
            j(status);
        }
    }

    public final void i() {
    }

    public final void j(Status status) {
        synchronized (this.f32394c) {
            try {
                if (k()) {
                    android.support.v4.media.session.b.a(AbstractC3191o.m(null));
                    throw null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean k() {
        return false;
    }
}
