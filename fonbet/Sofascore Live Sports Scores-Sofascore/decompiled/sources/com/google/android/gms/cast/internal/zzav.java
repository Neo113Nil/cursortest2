package com.google.android.gms.cast.internal;

import android.os.Looper;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.DefaultClock;
import com.google.android.gms.internal.cast.zzfk;
import defpackage.f2n;
import java.util.Locale;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zzav {
    public static final Object j = new Object();
    public final Logger a;
    public final long b;
    public final String c;
    public zzat h;
    public f2n i;
    public final DefaultClock e = DefaultClock.a;
    public long f = -1;
    public long g = 0;
    public final zzfk d = new zzfk(Looper.getMainLooper());

    public zzav(long j2, String str) {
        this.b = j2;
        this.c = str;
        this.a = new Logger("RequestTracker", str);
    }

    public final void a(long j2, zzat zzatVar) {
        zzat zzatVar2;
        long j3;
        long j4;
        this.e.getClass();
        long currentTimeMillis = System.currentTimeMillis();
        Object obj = j;
        synchronized (obj) {
            zzatVar2 = this.h;
            j3 = this.f;
            j4 = this.g;
            this.f = j2;
            this.h = zzatVar;
            this.g = currentTimeMillis;
        }
        if (zzatVar2 != null) {
            zzatVar2.a(this.c, j3, j4, currentTimeMillis);
        }
        synchronized (obj) {
            try {
                f2n f2nVar = this.i;
                if (f2nVar != null) {
                    this.d.removeCallbacks(f2nVar);
                }
                f2n f2nVar2 = new f2n(this, 9);
                this.i = f2nVar2;
                this.d.postDelayed(f2nVar2, this.b);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean b() {
        boolean z;
        synchronized (j) {
            z = this.f != -1;
        }
        return z;
    }

    public final boolean c(long j2) {
        boolean z;
        synchronized (j) {
            long j3 = this.f;
            z = false;
            if (j3 != -1 && j3 == j2) {
                z = true;
            }
        }
        return z;
    }

    public final void d(long j2, int i, zzaq zzaqVar) {
        synchronized (j) {
            try {
                if (c(j2)) {
                    Locale locale = Locale.ROOT;
                    f(i, zzaqVar, "request " + j2 + " completed");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean e(int i) {
        synchronized (j) {
            try {
                if (!b()) {
                    return false;
                }
                Locale locale = Locale.ROOT;
                f(i, null, "clearing request " + this.f);
                return true;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void f(int i, Object obj, String str) {
        this.a.a(str, new Object[0]);
        Object obj2 = j;
        synchronized (obj2) {
            try {
                if (this.h != null) {
                    this.e.getClass();
                    long currentTimeMillis = System.currentTimeMillis();
                    zzat zzatVar = this.h;
                    Preconditions.i(zzatVar);
                    zzatVar.b(this.c, this.f, i, obj, this.g, currentTimeMillis);
                }
                this.f = -1L;
                this.h = null;
                synchronized (obj2) {
                    f2n f2nVar = this.i;
                    if (f2nVar != null) {
                        this.d.removeCallbacks(f2nVar);
                        this.i = null;
                    }
                }
            } catch (Throwable th) {
                throw th;
            } finally {
            }
        }
    }
}
