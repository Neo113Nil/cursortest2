package k5;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.HandlerThread;
import android.telephony.PhoneStateListener;
import android.telephony.ServiceState;
import android.telephony.TelephonyManager;
import androidx.annotation.NonNull;
import java.util.HashSet;
import java.util.Iterator;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import v3.ExecutorC10204F;

/* loaded from: classes8.dex */
final class Z2 {

    /* renamed from: k, reason: collision with root package name */
    private static final HashSet f70688k = C7540m0.a(EnumC7578w.READ_PHONE_STATE, EnumC7578w.ACCESS_COARSE_LOCATION);

    /* renamed from: a, reason: collision with root package name */
    private final TelephonyManager f70689a;

    /* renamed from: b, reason: collision with root package name */
    private final Context f70690b;

    /* renamed from: c, reason: collision with root package name */
    private PhoneStateListener f70691c;

    /* renamed from: d, reason: collision with root package name */
    private I1 f70692d;

    /* renamed from: e, reason: collision with root package name */
    private boolean f70693e;

    /* renamed from: f, reason: collision with root package name */
    private ServiceState f70694f;

    /* renamed from: g, reason: collision with root package name */
    private long f70695g;

    /* renamed from: h, reason: collision with root package name */
    private CountDownLatch f70696h;

    /* renamed from: i, reason: collision with root package name */
    private HandlerThread f70697i;

    /* renamed from: j, reason: collision with root package name */
    private Handler f70698j;

    Z2(@NonNull Context context, @NonNull TelephonyManager telephonyManager) {
        this.f70690b = context;
        this.f70689a = telephonyManager;
    }

    public static void a(Z2 z22, ServiceState serviceState) {
        z22.f70694f = serviceState;
        z22.f70695g = System.currentTimeMillis();
        z22.f();
        CountDownLatch countDownLatch = z22.f70696h;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    public static /* synthetic */ void b(Z2 z22) {
        z22.getClass();
        Y2 y22 = new Y2(z22);
        z22.f70691c = y22;
        z22.f70689a.listen(y22, 1);
    }

    public static /* synthetic */ void c(Z2 z22) {
        PhoneStateListener phoneStateListener = z22.f70691c;
        if (phoneStateListener != null) {
            z22.f70689a.listen(phoneStateListener, 0);
            z22.f70691c = null;
        }
        z22.f70697i.quitSafely();
    }

    private ServiceState e() {
        ServiceState serviceState = (this.f70694f == null || this.f70695g + 1000 >= System.currentTimeMillis()) ? null : this.f70694f;
        if (serviceState != null || this.f70689a.getSimState() == 1) {
            return serviceState;
        }
        this.f70696h = new CountDownLatch(1);
        synchronized (this) {
            try {
                this.f70693e = true;
                HandlerThread handlerThread = new HandlerThread("PhoneStateListener");
                this.f70697i = handlerThread;
                handlerThread.start();
                Handler handler = new Handler(this.f70697i.getLooper());
                this.f70698j = handler;
                if (Build.VERSION.SDK_INT >= 31) {
                    TelephonyManager telephonyManager = this.f70689a;
                    ExecutorC10204F executorC10204F = new ExecutorC10204F(handler);
                    I1 i12 = new I1(new W2(this));
                    telephonyManager.registerTelephonyCallback(executorC10204F, i12);
                    this.f70692d = i12;
                } else {
                    handler.post(new Runnable() { // from class: k5.X2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Z2.b(Z2.this);
                        }
                    });
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        try {
            this.f70696h.await(1000L, TimeUnit.MILLISECONDS);
        } catch (InterruptedException unused) {
        }
        f();
        return this.f70694f;
    }

    private synchronized void f() {
        try {
            if (this.f70693e) {
                this.f70693e = false;
                if (Build.VERSION.SDK_INT >= 31) {
                    TelephonyManager telephonyManager = this.f70689a;
                    I1 i12 = this.f70692d;
                    if (i12 != null) {
                        telephonyManager.unregisterTelephonyCallback(i12);
                    }
                    this.f70692d = null;
                } else {
                    this.f70698j.post(new Runnable() { // from class: k5.V2
                        @Override // java.lang.Runnable
                        public final void run() {
                            Z2.c(Z2.this);
                        }
                    });
                }
            }
        } catch (Throwable th2) {
            throw th2;
        }
    }

    static void g(Z2 z22, ServiceState serviceState) {
        z22.f70694f = serviceState;
        z22.f70695g = System.currentTimeMillis();
        z22.f();
        CountDownLatch countDownLatch = z22.f70696h;
        if (countDownLatch != null) {
            countDownLatch.countDown();
        }
    }

    @SuppressLint({"MissingPermission"})
    public final ServiceState d() {
        Iterator it = f70688k.iterator();
        while (it.hasNext()) {
            if (!Gf.d.l(this.f70690b, ((EnumC7578w) it.next()).a())) {
                return e();
            }
        }
        try {
            return this.f70689a.getServiceState();
        } catch (SecurityException unused) {
            return e();
        }
    }
}
