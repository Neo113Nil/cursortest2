package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.internal.measurement.zzcn;

/* renamed from: com.google.android.gms.measurement.internal.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public abstract class AbstractC3381w {

    /* renamed from: d, reason: collision with root package name */
    public static volatile Handler f34349d;

    /* renamed from: a, reason: collision with root package name */
    public final Q3 f34350a;

    /* renamed from: b, reason: collision with root package name */
    public final Runnable f34351b;

    /* renamed from: c, reason: collision with root package name */
    public volatile long f34352c;

    public AbstractC3381w(Q3 q32) {
        AbstractC3191o.m(q32);
        this.f34350a = q32;
        this.f34351b = new RunnableC3373v(this, q32);
    }

    public abstract void a();

    public final void b(long j10) {
        d();
        if (j10 >= 0) {
            Q3 q32 = this.f34350a;
            this.f34352c = q32.e().a();
            if (f().postDelayed(this.f34351b, j10)) {
                return;
            }
            q32.a().o().b("Failed to schedule delayed post. time", Long.valueOf(j10));
        }
    }

    public final boolean c() {
        return this.f34352c != 0;
    }

    public final void d() {
        this.f34352c = 0L;
        f().removeCallbacks(this.f34351b);
    }

    public final /* synthetic */ void e(long j10) {
        this.f34352c = 0L;
    }

    public final Handler f() {
        Handler handler;
        if (f34349d != null) {
            return f34349d;
        }
        synchronized (AbstractC3381w.class) {
            try {
                if (f34349d == null) {
                    f34349d = new zzcn(this.f34350a.d().getMainLooper());
                }
                handler = f34349d;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return handler;
    }
}
