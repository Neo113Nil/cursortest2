package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.os.RemoteException;
import android.util.Log;
import android.util.Pair;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.c;
import com.google.android.gms.internal.base.zar;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;
import xsna.cv90;
import xsna.exc0;
import xsna.ftf0;
import xsna.gmv;
import xsna.jlp0;
import xsna.knz0;
import xsna.lnz0;
import xsna.qdg0;
import xsna.qpz0;
import xsna.spz0;
import xsna.tdg0;
import xsna.wdg0;
import xsna.z23;

/* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
@KeepName
/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends qdg0> extends cv90<R> {
    static final ThreadLocal zaa = new qpz0();
    public static final /* synthetic */ int zad = 0;

    @KeepName
    private spz0 resultGuardian;

    @NonNull
    protected final a zab;

    @NonNull
    protected final WeakReference zac;
    private final Object zae;
    private final CountDownLatch zaf;
    private final ArrayList zag;

    @Nullable
    private tdg0 zah;
    private final AtomicReference zai;

    @Nullable
    private qdg0 zaj;
    private Status zak;
    private volatile boolean zal;
    private boolean zam;
    private boolean zan;

    @Nullable
    private gmv zao;
    private volatile knz0 zap;
    private boolean zaq;

    /* compiled from: com.google.android.gms:play-services-base@@18.10.0 */
    /* loaded from: classes12.dex */
    public static class a<R extends qdg0> extends zar {
        public a(@NonNull Looper looper) {
            super(looper);
        }

        public final void a(@NonNull tdg0 tdg0Var, @NonNull qdg0 qdg0Var) {
            int i = BasePendingResult.zad;
            exc0.i(tdg0Var);
            sendMessage(obtainMessage(1, new Pair(tdg0Var, qdg0Var)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(@NonNull Message message) {
            int i = message.what;
            if (i != 1) {
                if (i != 2) {
                    Log.wtf("BasePendingResult", z23.b(i, "Don't know how to handle message: ", new StringBuilder(String.valueOf(i).length() + 34)), new Exception());
                    return;
                } else {
                    ((BasePendingResult) message.obj).forceFailureUnlessReady(Status.i);
                    return;
                }
            }
            Pair pair = (Pair) message.obj;
            tdg0 tdg0Var = (tdg0) pair.first;
            qdg0 qdg0Var = (qdg0) pair.second;
            try {
                tdg0Var.a(qdg0Var);
            } catch (RuntimeException e) {
                BasePendingResult.zal(qdg0Var);
                throw e;
            }
        }
    }

    @Deprecated
    public BasePendingResult() {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(Looper.getMainLooper());
        this.zac = new WeakReference(null);
    }

    private final qdg0 zaa() {
        qdg0 qdg0Var;
        synchronized (this.zae) {
            exc0.k("Result has already been consumed.", !this.zal);
            exc0.k("Result is not ready.", isReady());
            qdg0Var = this.zaj;
            this.zaj = null;
            this.zah = null;
            this.zal = true;
        }
        lnz0 lnz0Var = (lnz0) this.zai.getAndSet(null);
        if (lnz0Var != null) {
            lnz0Var.a.a.remove(this);
        }
        exc0.i(qdg0Var);
        return qdg0Var;
    }

    private final void zab(qdg0 qdg0Var) {
        this.zaj = qdg0Var;
        this.zak = qdg0Var.getStatus();
        this.zao = null;
        this.zaf.countDown();
        if (this.zam) {
            this.zah = null;
        } else {
            tdg0 tdg0Var = this.zah;
            if (tdg0Var != null) {
                a aVar = this.zab;
                aVar.removeMessages(2);
                aVar.a(tdg0Var, zaa());
            } else if (this.zaj instanceof ftf0) {
                this.resultGuardian = new spz0(this);
            }
        }
        ArrayList arrayList = this.zag;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            ((cv90.a) arrayList.get(i)).a(this.zak);
        }
        arrayList.clear();
    }

    public static void zal(@Nullable qdg0 qdg0Var) {
        if (qdg0Var instanceof ftf0) {
            try {
                ((ftf0) qdg0Var).release();
            } catch (RuntimeException unused) {
                "Unable to release ".concat(String.valueOf(qdg0Var));
            }
        }
    }

    @Override // xsna.cv90
    public final void addStatusListener(@NonNull cv90.a aVar) {
        exc0.a("Callback cannot be null.", aVar != null);
        synchronized (this.zae) {
            try {
                if (isReady()) {
                    aVar.a(this.zak);
                } else {
                    this.zag.add(aVar);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.cv90
    @NonNull
    public final R await() {
        exc0.h("await must not be called on the UI thread");
        exc0.k("Result has already been consumed", !this.zal);
        exc0.k("Cannot await if then() has been called.", this.zap == null);
        try {
            this.zaf.await();
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.g);
        }
        exc0.k("Result is not ready.", isReady());
        return (R) zaa();
    }

    @Override // xsna.cv90
    public void cancel() {
        synchronized (this.zae) {
            if (!this.zam && !this.zal) {
                gmv gmvVar = this.zao;
                if (gmvVar != null) {
                    try {
                        gmvVar.cancel();
                    } catch (RemoteException unused) {
                    }
                }
                zal(this.zaj);
                this.zam = true;
                zab(createFailedResult(Status.j));
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
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.cv90
    public final boolean isCanceled() {
        boolean z;
        synchronized (this.zae) {
            z = this.zam;
        }
        return z;
    }

    public final boolean isReady() {
        return this.zaf.getCount() == 0;
    }

    public final void setCancelToken(@NonNull gmv gmvVar) {
        synchronized (this.zae) {
            this.zao = gmvVar;
        }
    }

    public final void setResult(@NonNull R r) {
        synchronized (this.zae) {
            try {
                if (this.zan || this.zam) {
                    zal(r);
                    return;
                }
                isReady();
                exc0.k("Results have already been set", !isReady());
                exc0.k("Result has already been consumed", !this.zal);
                zab(r);
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.cv90
    public final void setResultCallback(@Nullable tdg0<? super R> tdg0Var) {
        synchronized (this.zae) {
            try {
                if (tdg0Var == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                exc0.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z = false;
                }
                exc0.k("Cannot set callbacks if then() has been called.", z);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tdg0Var, zaa());
                } else {
                    this.zah = tdg0Var;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.cv90
    @NonNull
    public final <S extends qdg0> jlp0<S> then(@NonNull wdg0<? super R, ? extends S> wdg0Var) {
        knz0 b;
        exc0.k("Result has already been consumed.", !this.zal);
        synchronized (this.zae) {
            try {
                exc0.k("Cannot call then() twice.", this.zap == null);
                exc0.k("Cannot call then() if callbacks are set.", this.zah == null);
                exc0.k("Cannot call then() if result was canceled.", !this.zam);
                this.zaq = true;
                this.zap = new knz0(this.zac);
                b = this.zap.b(wdg0Var);
                if (isReady()) {
                    this.zab.a(this.zap, zaa());
                } else {
                    this.zah = this.zap;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return b;
    }

    public final boolean zaj() {
        boolean isCanceled;
        synchronized (this.zae) {
            try {
                if (((c) this.zac.get()) != null) {
                    if (!this.zaq) {
                    }
                    isCanceled = isCanceled();
                }
                cancel();
                isCanceled = isCanceled();
            } catch (Throwable th) {
                throw th;
            }
        }
        return isCanceled;
    }

    public final void zak() {
        boolean z = true;
        if (!this.zaq && !((Boolean) zaa.get()).booleanValue()) {
            z = false;
        }
        this.zaq = z;
    }

    public final /* synthetic */ qdg0 zam() {
        return this.zaj;
    }

    public final void zan(@Nullable lnz0 lnz0Var) {
        this.zai.set(lnz0Var);
    }

    @Deprecated
    public BasePendingResult(@NonNull Looper looper) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(looper);
        this.zac = new WeakReference(null);
    }

    @Override // xsna.cv90
    @NonNull
    public final R await(long j, @NonNull TimeUnit timeUnit) {
        if (j > 0) {
            exc0.h("await must not be called on the UI thread when time is greater than zero.");
        }
        exc0.k("Result has already been consumed.", !this.zal);
        exc0.k("Cannot await if then() has been called.", this.zap == null);
        try {
            if (!this.zaf.await(j, timeUnit)) {
                forceFailureUnlessReady(Status.i);
            }
        } catch (InterruptedException unused) {
            forceFailureUnlessReady(Status.g);
        }
        exc0.k("Result is not ready.", isReady());
        return (R) zaa();
    }

    @Override // xsna.cv90
    public final void setResultCallback(@NonNull tdg0<? super R> tdg0Var, long j, @NonNull TimeUnit timeUnit) {
        synchronized (this.zae) {
            try {
                if (tdg0Var == null) {
                    this.zah = null;
                    return;
                }
                boolean z = true;
                exc0.k("Result has already been consumed.", !this.zal);
                if (this.zap != null) {
                    z = false;
                }
                exc0.k("Cannot set callbacks if then() has been called.", z);
                if (isCanceled()) {
                    return;
                }
                if (isReady()) {
                    this.zab.a(tdg0Var, zaa());
                } else {
                    this.zah = tdg0Var;
                    a aVar = this.zab;
                    aVar.sendMessageDelayed(aVar.obtainMessage(2, this), timeUnit.toMillis(j));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public BasePendingResult(@Nullable c cVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        this.zab = new a(cVar != null ? cVar.d() : Looper.getMainLooper());
        this.zac = new WeakReference(cVar);
    }

    public BasePendingResult(@NonNull a<R> aVar) {
        this.zae = new Object();
        this.zaf = new CountDownLatch(1);
        this.zag = new ArrayList();
        this.zai = new AtomicReference();
        this.zaq = false;
        exc0.j(aVar, "CallbackHandler must not be null");
        this.zab = aVar;
        this.zac = new WeakReference(null);
    }
}
