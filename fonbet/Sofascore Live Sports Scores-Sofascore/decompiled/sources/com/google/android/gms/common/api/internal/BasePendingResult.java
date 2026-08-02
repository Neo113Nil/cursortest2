package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Pair;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Releasable;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.base.zao;
import defpackage.a3n;
import defpackage.j40;
import defpackage.o2n;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@KeepForSdk
@KeepName
/* loaded from: classes3.dex */
public abstract class BasePendingResult<R extends Result> extends PendingResult<R> {
    public static final j40 n = new j40(6);
    public final Object a;
    public final CallbackHandler b;
    public final WeakReference c;
    public final CountDownLatch d;
    public final ArrayList e;
    public ResultCallback f;
    public final AtomicReference g;
    public Result h;
    public Status i;
    public volatile boolean j;
    public boolean k;
    public boolean l;
    public boolean m;

    @KeepName
    private a3n resultGuardian;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class CallbackHandler<R extends Result> extends zao {
        public CallbackHandler() {
            super(Looper.getMainLooper());
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i != 1) {
                if (i == 2) {
                    ((BasePendingResult) message.obj).f(Status.h);
                    return;
                } else {
                    new StringBuilder(String.valueOf(i).length() + 34);
                    new Exception();
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            ResultCallback resultCallback = (ResultCallback) pair.first;
            Result result = (Result) pair.second;
            try {
                resultCallback.a(result);
            } catch (RuntimeException e) {
                BasePendingResult.m(result);
                throw e;
            }
        }
    }

    public BasePendingResult(GoogleApiClient googleApiClient) {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.m = false;
        this.b = new CallbackHandler(googleApiClient != null ? googleApiClient.c() : Looper.getMainLooper());
        this.c = new WeakReference(googleApiClient);
    }

    public static void m(Result result) {
        if (result instanceof Releasable) {
            try {
                ((Releasable) result).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(result));
            }
        }
    }

    @Override // com.google.android.gms.common.api.PendingResult
    public final Result b() {
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        Preconditions.k("Result has already been consumed.", !this.j);
        try {
            if (!this.d.await(0L, timeUnit)) {
                f(Status.h);
            }
        } catch (InterruptedException unused) {
            f(Status.f);
        }
        Preconditions.k("Result is not ready.", g());
        return j();
    }

    public final void c(PendingResult.StatusListener statusListener) {
        synchronized (this.a) {
            try {
                if (g()) {
                    statusListener.a(this.i);
                } else {
                    this.e.add(statusListener);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public void d() {
        synchronized (this.a) {
            try {
                if (!this.k && !this.j) {
                    m(this.h);
                    this.k = true;
                    k(e(Status.i));
                }
            } finally {
            }
        }
    }

    public abstract Result e(Status status);

    public final void f(Status status) {
        synchronized (this.a) {
            try {
                if (!g()) {
                    a(e(status));
                    this.l = true;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final boolean g() {
        return this.d.getCount() == 0;
    }

    @Override // com.google.android.gms.common.api.internal.BaseImplementation.ResultHolder
    /* renamed from: h, reason: merged with bridge method [inline-methods] */
    public final void a(Result result) {
        synchronized (this.a) {
            try {
                if (this.l || this.k) {
                    m(result);
                    return;
                }
                g();
                Preconditions.k("Results have already been set", !g());
                Preconditions.k("Result has already been consumed", !this.j);
                k(result);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final void i(ResultCallback resultCallback) {
        boolean z;
        synchronized (this.a) {
            try {
                if (resultCallback == null) {
                    this.f = null;
                    return;
                }
                Preconditions.k("Result has already been consumed.", !this.j);
                synchronized (this.a) {
                    z = this.k;
                }
                if (z) {
                    return;
                }
                if (g()) {
                    CallbackHandler callbackHandler = this.b;
                    Result j = j();
                    callbackHandler.getClass();
                    callbackHandler.sendMessage(callbackHandler.obtainMessage(1, new Pair(resultCallback, j)));
                } else {
                    this.f = resultCallback;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final Result j() {
        Result result;
        synchronized (this.a) {
            Preconditions.k("Result has already been consumed.", !this.j);
            Preconditions.k("Result is not ready.", g());
            result = this.h;
            this.h = null;
            this.f = null;
            this.j = true;
        }
        o2n o2nVar = (o2n) this.g.getAndSet(null);
        if (o2nVar != null) {
            o2nVar.a.a.remove(this);
        }
        Preconditions.i(result);
        return result;
    }

    public final void k(Result result) {
        this.h = result;
        this.i = result.getStatus();
        this.d.countDown();
        if (this.k) {
            this.f = null;
        } else {
            ResultCallback resultCallback = this.f;
            if (resultCallback != null) {
                CallbackHandler callbackHandler = this.b;
                callbackHandler.removeMessages(2);
                callbackHandler.sendMessage(callbackHandler.obtainMessage(1, new Pair(resultCallback, j())));
            } else if (this.h instanceof Releasable) {
                this.resultGuardian = new a3n(this);
            }
        }
        ArrayList arrayList = this.e;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((PendingResult.StatusListener) arrayList.get(i)).a(this.i);
        }
        arrayList.clear();
    }

    public final void l() {
        boolean z = true;
        if (!this.m && !((Boolean) n.get()).booleanValue()) {
            z = false;
        }
        this.m = z;
    }

    @Deprecated
    public BasePendingResult() {
        this.a = new Object();
        this.d = new CountDownLatch(1);
        this.e = new ArrayList();
        this.g = new AtomicReference();
        this.m = false;
        this.b = new CallbackHandler(Looper.getMainLooper());
        this.c = new WeakReference(null);
    }
}
