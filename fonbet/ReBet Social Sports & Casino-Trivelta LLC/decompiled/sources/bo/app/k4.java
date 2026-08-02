package bo.app;

import Ph.AbstractC1459k;
import Ph.C0;
import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import bo.app.af;
import bo.app.cf;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class k4 {

    /* renamed from: m, reason: collision with root package name */
    public static final String f25639m = BrazeLogger.getBrazeLogTag((Class<?>) k4.class);

    /* renamed from: a, reason: collision with root package name */
    public final Context f25640a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f25641b;

    /* renamed from: c, reason: collision with root package name */
    public final d4 f25642c;

    /* renamed from: d, reason: collision with root package name */
    public final i4 f25643d;

    /* renamed from: e, reason: collision with root package name */
    public final g4 f25644e;

    /* renamed from: f, reason: collision with root package name */
    public bf f25645f;

    /* renamed from: g, reason: collision with root package name */
    public long f25646g;

    /* renamed from: h, reason: collision with root package name */
    public volatile boolean f25647h;

    /* renamed from: i, reason: collision with root package name */
    public final ConnectivityManager f25648i;

    /* renamed from: j, reason: collision with root package name */
    public cb f25649j;

    /* renamed from: k, reason: collision with root package name */
    public C0 f25650k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f25651l;

    public k4(Context context, r7 internalEventPublisher, d4 dataSyncConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.f25640a = context;
        this.f25641b = internalEventPublisher;
        this.f25642c = dataSyncConfigurationProvider;
        this.f25645f = bf.f25303b;
        this.f25646g = -1L;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.f25648i = (ConnectivityManager) systemService;
        this.f25649j = cb.f25353c;
        if (Build.VERSION.SDK_INT >= 30) {
            this.f25644e = new g4(this);
        } else {
            this.f25643d = new i4(this);
        }
        a(internalEventPublisher);
    }

    public static final String d() {
        return "The data sync policy is already running. Ignoring request.";
    }

    public static final String e() {
        return "Data sync started";
    }

    public static final String g() {
        return "The data sync policy is not running. Ignoring request.";
    }

    public static final String h() {
        return "Data sync stopped";
    }

    public static final String j() {
        return "Failed to unregister Connectivity callback";
    }

    public final C0 a(final long j10) {
        C0 d10;
        if (this.f25646g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.H4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.a(j10, this);
                }
            }, 6, (Object) null);
            d10 = AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new j4(this, j10, null), 3, null);
            return d10;
        }
        Braze.INSTANCE.getInstance(this.f25640a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.I4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k4.a(bo.app.k4.this);
            }
        }, 7, (Object) null);
        return null;
    }

    public final void b(final long j10) {
        C0 c02 = this.f25650k;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f25650k = null;
        if (this.f25646g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.G4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.c(j10);
                }
            }, 7, (Object) null);
            this.f25650k = a(j10);
        }
    }

    public final synchronized void c() {
        if (this.f25647h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.D4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.J4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k4.e();
            }
        }, 7, (Object) null);
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.f25648i;
            g4 g4Var = this.f25644e;
            if (g4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                g4Var = null;
            }
            connectivityManager.registerDefaultNetworkCallback(g4Var);
            a(this.f25648i.getNetworkCapabilities(this.f25648i.getActiveNetwork()));
        } else {
            this.f25640a.registerReceiver(this.f25643d, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        }
        b(this.f25646g);
        this.f25647h = true;
    }

    public final synchronized void f() {
        if (!this.f25647h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.M4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.g();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.N4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k4.h();
            }
        }, 7, (Object) null);
        C0 c02 = this.f25650k;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f25650k = null;
        i();
        this.f25647h = false;
    }

    public final void i() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.f25640a.unregisterReceiver(this.f25643d);
                return;
            }
            ConnectivityManager connectivityManager = this.f25648i;
            g4 g4Var = this.f25644e;
            if (g4Var == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                g4Var = null;
            }
            connectivityManager.unregisterNetworkCallback(g4Var);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.F4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.j();
                }
            }, 4, (Object) null);
        }
    }

    public static final String d(k4 k4Var) {
        return "currentIntervalMs: " + k4Var.f25646g;
    }

    public static final String a(long j10, k4 k4Var) {
        return "Kicking off the Sync Job. initialDelaysMs: " + j10 + ": currentIntervalMs " + k4Var.f25646g + " ms";
    }

    public final void b() {
        long j10;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.O4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k4.b(bo.app.k4.this);
            }
        }, 6, (Object) null);
        final long j11 = this.f25646g;
        if (this.f25645f != bf.f25303b && !this.f25651l) {
            int ordinal = this.f25649j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    d4 d4Var = this.f25642c;
                    d4Var.getClass();
                    f1 f1Var = f1.f25441b;
                    intValue = d4Var.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (ordinal == 2) {
                    d4 d4Var2 = this.f25642c;
                    d4Var2.getClass();
                    f1 f1Var2 = f1.f25441b;
                    intValue = d4Var2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else if (ordinal == 3) {
                    d4 d4Var3 = this.f25642c;
                    d4Var3.getClass();
                    f1 f1Var3 = f1.f25441b;
                    intValue = d4Var3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                } else {
                    throw new NoWhenBranchMatchedException();
                }
                j10 = intValue * 1000;
            } else {
                j10 = -1;
            }
            this.f25646g = j10;
            if (j10 != -1 && j10 < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.P4
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.k4.c(bo.app.k4.this);
                    }
                }, 6, (Object) null);
                this.f25646g = 1000L;
            }
        } else {
            this.f25646g = -1L;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.Q4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.k4.d(bo.app.k4.this);
            }
        }, 6, (Object) null);
        if (j11 != this.f25646g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.R4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.b(j11, this);
                }
            }, 7, (Object) null);
            b(this.f25646g);
        }
    }

    public static final String a(k4 k4Var) {
        return "Data flush interval is " + k4Var.f25646g + " ms. Not scheduling a proceeding data flush.";
    }

    public final void a(r7 r7Var, Exception exc) {
        try {
            r7Var.b(exc, Throwable.class);
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.E4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.k4.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to log throwable.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        cb cbVar = this.f25649j;
        cb a10 = com.braze.support.b.a(networkCapabilities);
        this.f25649j = a10;
        if (cbVar != a10) {
            this.f25641b.b(new db(cbVar, a10), db.class);
        }
        b();
    }

    public static final String c(long j10) {
        return "Posting new sync runnable with delay " + j10 + " ms";
    }

    public static final String c(k4 k4Var) {
        return "Flush interval was too low (" + k4Var.f25646g + "), moving to minimum of 1000 ms";
    }

    public final void a(r7 eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.c(af.class, new IEventSubscriber() { // from class: c3.K4
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.k4.a(bo.app.k4.this, (af) obj);
            }
        });
        eventManager.c(cf.class, new IEventSubscriber() { // from class: c3.L4
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.k4.a(bo.app.k4.this, (cf) obj);
            }
        });
    }

    public static final void a(k4 k4Var, af it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k4Var.f25645f = bf.f25302a;
        k4Var.b();
    }

    public static final void a(k4 k4Var, cf it) {
        Intrinsics.checkNotNullParameter(it, "it");
        k4Var.f25645f = bf.f25303b;
        k4Var.b();
    }

    public static final String b(k4 k4Var) {
        return "recalculateDispatchState called with session state: " + k4Var.f25645f + " lastNetworkLevel: " + k4Var.f25649j;
    }

    public static final String b(long j10, k4 k4Var) {
        return "Data flush interval has changed from " + j10 + " ms to " + k4Var.f25646g + " ms after connectivity state change to: " + k4Var.f25649j + " and session state: " + k4Var.f25645f;
    }
}
