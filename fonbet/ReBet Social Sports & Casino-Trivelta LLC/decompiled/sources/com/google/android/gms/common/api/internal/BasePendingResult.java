package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.h;
import com.google.android.gms.common.api.l;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.common.internal.InterfaceC3185i;
import com.google.android.gms.internal.base.zau;
import com.google.errorprone.annotations.ResultIgnorabilityUnspecified;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

@KeepName
/* loaded from: classes2.dex */
public abstract class BasePendingResult<R extends com.google.android.gms.common.api.l> extends com.google.android.gms.common.api.h {
    static final ThreadLocal zaa = new h1();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private i1 resultGuardian;

    @NonNull
    protected final a zab;

    @NonNull
    protected final WeakReference zac;
    private com.google.android.gms.common.api.m zah;
    private com.google.android.gms.common.api.l zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;
    private InterfaceC3185i zao;
    private volatile T0 zap;
    private final Object zae = new Object();
    private final CountDownLatch zaf = new CountDownLatch(1);
    private final ArrayList zag = new ArrayList();
    private final AtomicReference zai = new AtomicReference();
    private boolean zaq = false;

    public static class a extends zau {
        public a(Looper looper) {
            super(looper);
        }

        public final void a(com.google.android.gms.common.api.m mVar, com.google.android.gms.common.api.l lVar) {
            int i10 = BasePendingResult.zad;
            sendMessage(obtainMessage(1, new Pair((com.google.android.gms.common.api.m) AbstractC3191o.m(mVar), lVar)));
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i10 = message.what;
            if (i10 != 1) {
                if (i10 == 2) {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.f32278i);
                    return;
                }
                Log.wtf("BasePendingResult", "Don't know how to handle message: " + i10, new Exception());
                return;
            }
            Pair pair = (Pair) message.obj;
            com.google.android.gms.common.api.m mVar = (com.google.android.gms.common.api.m) pair.first;
            com.google.android.gms.common.api.l lVar = (com.google.android.gms.common.api.l) pair.second;
            try {
                mVar.a(lVar);
            } catch (RuntimeException e10) {
                BasePendingResult.zal(lVar);
                throw e10;
            }
        }
    }

    public BasePendingResult(com.google.android.gms.common.api.f fVar) {
        this.zab = new a(fVar != null ? fVar.l() : Looper.getMainLooper());
        this.zac = new WeakReference(fVar);
    }

    public static void zal(com.google.android.gms.common.api.l lVar) {
    }

    public final com.google.android.gms.common.api.l a() {
        com.google.android.gms.common.api.l lVar;
        synchronized (this.zae) {
            AbstractC3191o.q(!this.zal, "Result has already been consumed.");
            AbstractC3191o.q(isReady(), "Result is not ready.");
            lVar = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        U0 u02 = (U0) this.zai.getAndSet(null);
        if (u02 != null) {
            u02.f32400a.f32402a.remove(this);
        }
        return (com.google.android.gms.common.api.l) AbstractC3191o.m(lVar);
    }

    @Override // com.google.android.gms.common.api.h
    public final void addStatusListener(@NonNull h.a aVar) {
        AbstractC3191o.b(aVar != null, "Callback cannot be null.");
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await() {
        AbstractC3191o.l("await must not be called on the UI thread");
        AbstractC3191o.q(!this.zal, "Result has already been consumed");
        AbstractC3191o.q(this.zap == null, "Cannot await if then() has been called.");
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f32276g);
        }
        AbstractC3191o.q(isReady(), "Result is not ready.");
        return (R) a();
    }

    public final void b(com.google.android.gms.common.api.l lVar) {
        this.zaj = lVar;
        this.zak = lVar.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            com.google.android.gms.common.api.m mVar = this.zah;
            if (mVar != null) {
                this.zab.removeMessages(2);
                this.zab.a(mVar, a());
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i10 = 0; i10 < size; i10++) {
            ((h.a) arrayList.get(i10)).a(this.zak);
        }
        this.zag.clear();
    }

    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                InterfaceC3185i interfaceC3185i = this.zao;
                if (interfaceC3185i != null) {
                    try {
                        interfaceC3185i.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                b(createFailedResult(Status.f32279j));
            }
        }
    }

    @NonNull
    public abstract R createFailedResult(@NonNull Status status);

    @Deprecated
    public final void forceFailureUnlessReady(@NonNull Status status) {
        synchronized (this.zae) {
            try {
                if (!isReady()) {
                    setResult(createFailedResult(status));
                    this.zan = true;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final boolean isCanceled() {
        boolean z10;
        synchronized (this.zae) {
            z10 = this.zam;
        }
        return z10;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(@NonNull InterfaceC3185i interfaceC3185i) {
        synchronized (this.zae) {
            this.zao = interfaceC3185i;
        }
    }

    public final void setResult(@NonNull R r10) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r10);
                    return;
                }
                isReady();
                AbstractC3191o.q(!isReady(), "Results have already been set");
                AbstractC3191o.q(!this.zal, "Result has already been consumed");
                b(r10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public final void setResultCallback(com.google.android.gms.common.api.m mVar) {
        synchronized (this.zae) {
            try {
                if (mVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z10 = true;
                AbstractC3191o.q(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z10 = false;
                }
                AbstractC3191o.q(z10, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(mVar, a());
                } else {
                    this.zah = mVar;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @NonNull
    public final <S extends com.google.android.gms.common.api.l> com.google.android.gms.common.api.p then(@NonNull com.google.android.gms.common.api.n nVar) {
        com.google.android.gms.common.api.p b10;
        AbstractC3191o.q(!this.zal, "Result has already been consumed.");
        synchronized (this.zae) {
            try {
                AbstractC3191o.q(this.zap == null, "Cannot call then() twice.");
                AbstractC3191o.q(this.zah == null, "Cannot call then() if callbacks are set.");
                AbstractC3191o.q(!this.zam, "Cannot call then() if result was canceled.");
                this.zaq = true;
                this.zap = new T0(this.zac);
                b10 = this.zap.b(nVar);
                if (isReady()) {
                    this.zab.a(this.zap, a());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return b10;
    }

    public final void zak() {
        boolean z10 = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z10 = false;
        }
        this.zaq = z10;
    }

    public final boolean zam() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((com.google.android.gms.common.api.f) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return isCanceled;
    }

    public final void zan(U0 u02) {
        this.zai.set(u02);
    }

    @Override // com.google.android.gms.common.api.h
    @NonNull
    @ResultIgnorabilityUnspecified
    public final R await(long j10, @NonNull TimeUnit timeUnit) {
        if (j10 > 0) {
            AbstractC3191o.l("await must not be called on the UI thread when time is greater than zero.");
        }
        AbstractC3191o.q(!this.zal, "Result has already been consumed.");
        AbstractC3191o.q(this.zap == null, "Cannot await if then() has been called.");
        try {
            if (!this.zaf.await(j10, timeUnit)) {
                forceFailureUnlessReady(Status.f32278i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.f32276g);
        }
        AbstractC3191o.q(isReady(), "Result is not ready.");
        return (R) a();
    }

    public final void setResultCallback(@NonNull com.google.android.gms.common.api.m mVar, long j10, @NonNull TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (mVar == null) {
                    this.zah = null;
                    return;
                }
                boolean z10 = true;
                AbstractC3191o.q(!this.zal, "Result has already been consumed.");
                if (this.zap != null) {
                    z10 = false;
                }
                AbstractC3191o.q(z10, "Cannot set callbacks if then() has been called.");
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(mVar, a());
                } else {
                    this.zah = mVar;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j10));
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
