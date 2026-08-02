package com.google.android.gms.common.api.internal;

import android.os.Looper;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.internal.measurement.d5;
import d6.j;
import d6.l;
import e6.d;
import e6.g0;
import e6.h0;
import e6.s;
import g6.v;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends l> extends d5 {
    public static final g0 j = new g0(0);

    /* renamed from: e, reason: collision with root package name */
    public l f4474e;

    /* renamed from: f, reason: collision with root package name */
    public Status f4475f;

    /* renamed from: g, reason: collision with root package name */
    public volatile boolean f4476g;

    /* renamed from: h, reason: collision with root package name */
    public boolean f4477h;

    /* renamed from: a, reason: collision with root package name */
    public final Object f4470a = new Object();

    /* renamed from: b, reason: collision with root package name */
    public final CountDownLatch f4471b = new CountDownLatch(1);

    /* renamed from: c, reason: collision with root package name */
    public final ArrayList f4472c = new ArrayList();

    /* renamed from: d, reason: collision with root package name */
    public final AtomicReference f4473d = new AtomicReference();

    /* renamed from: i, reason: collision with root package name */
    public boolean f4478i = false;

    public BasePendingResult(j jVar) {
        new d(jVar != null ? ((s) jVar).f8750b.f8255g : Looper.getMainLooper(), 1);
        new WeakReference(jVar);
    }

    public final void q0(h0 h0Var) {
        synchronized (this.f4470a) {
            try {
                if (t0()) {
                    h0Var.a(this.f4475f);
                } else {
                    this.f4472c.add(h0Var);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public abstract l r0(Status status);

    public final void s0(Status status) {
        synchronized (this.f4470a) {
            try {
                if (!t0()) {
                    u0(r0(status));
                    this.f4477h = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean t0() {
        return this.f4471b.getCount() == 0;
    }

    public final void u0(l lVar) {
        synchronized (this.f4470a) {
            try {
                if (this.f4477h) {
                    return;
                }
                t0();
                v.j("Results have already been set", !t0());
                v.j("Result has already been consumed", !this.f4476g);
                this.f4474e = lVar;
                this.f4475f = lVar.getStatus();
                this.f4471b.countDown();
                ArrayList arrayList = this.f4472c;
                int size = arrayList.size();
                for (int i5 = 0; i5 < size; i5++) {
                    ((h0) arrayList.get(i5)).a(this.f4475f);
                }
                arrayList.clear();
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
