package com.braze.dispatch;

import android.content.Context;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkCapabilities;
import android.os.Build;
import com.braze.Braze;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.events.internal.a0;
import com.braze.events.internal.b0;
import com.braze.events.internal.o;
import com.braze.support.BrazeLogger;
import com.reactnativecommunity.netinfo.BroadcastReceiverConnectivityReceiver;
import java.util.concurrent.CancellationException;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class f {
    public static final String m = BrazeLogger.getBrazeLogTag((Class<?>) f.class);

    /* renamed from: a, reason: collision with root package name */
    public final Context f499a;
    public final com.braze.events.d b;
    public final a c;
    public final d d;
    public final b e;
    public com.braze.enums.f f;
    public long g;
    public volatile boolean h;
    public final ConnectivityManager i;
    public com.braze.enums.e j;
    public Job k;
    public boolean l;

    public f(Context context, com.braze.events.d internalEventPublisher, a dataSyncConfigurationProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(dataSyncConfigurationProvider, "dataSyncConfigurationProvider");
        this.f499a = context;
        this.b = internalEventPublisher;
        this.c = dataSyncConfigurationProvider;
        this.f = com.braze.enums.f.b;
        this.g = -1L;
        Object systemService = context.getSystemService("connectivity");
        Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.net.ConnectivityManager");
        this.i = (ConnectivityManager) systemService;
        this.j = com.braze.enums.e.c;
        if (Build.VERSION.SDK_INT >= 30) {
            this.e = new b(this);
        } else {
            this.d = new d(this);
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

    public final Job a(final long j) {
        Job launch$default;
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda6
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a(j, this);
                }
            }, 6, (Object) null);
            launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new e(this, j, null), 3, null);
            return launch$default;
        }
        Braze.INSTANCE.getInstance(this.f499a).requestImmediateDataFlush();
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda7
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.a(f.this);
            }
        }, 7, (Object) null);
        return null;
    }

    public final void b(final long j) {
        Job job = this.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = null;
        if (this.g >= 1000) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.c(j);
                }
            }, 7, (Object) null);
            this.k = a(j);
        }
    }

    public final synchronized void c() {
        if (this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.d();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda5
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.e();
            }
        }, 7, (Object) null);
        if (Build.VERSION.SDK_INT >= 30) {
            ConnectivityManager connectivityManager = this.i;
            b bVar = this.e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.registerDefaultNetworkCallback(bVar);
            a(this.i.getNetworkCapabilities(this.i.getActiveNetwork()));
        } else {
            this.f499a.registerReceiver(this.d, new IntentFilter(BroadcastReceiverConnectivityReceiver.CONNECTIVITY_ACTION));
        }
        b(this.g);
        this.h = true;
    }

    public final synchronized void f() {
        if (!this.h) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.g();
                }
            }, 7, (Object) null);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.h();
            }
        }, 7, (Object) null);
        Job job = this.k;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.k = null;
        i();
        this.h = false;
    }

    public final void i() {
        try {
            if (Build.VERSION.SDK_INT < 30) {
                this.f499a.unregisterReceiver(this.d);
                return;
            }
            ConnectivityManager connectivityManager = this.i;
            b bVar = this.e;
            if (bVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("connectivityNetworkCallback");
                bVar = null;
            }
            connectivityManager.unregisterNetworkCallback(bVar);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.j();
                }
            }, 4, (Object) null);
        }
    }

    public static final String d(f fVar) {
        return "Flush interval was too low (" + fVar.g + "), moving to minimum of 1000 ms";
    }

    public final void b() {
        long j;
        int intValue;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda8
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.c(f.this);
            }
        }, 6, (Object) null);
        final long j2 = this.g;
        if (this.f != com.braze.enums.f.b && !this.l) {
            int ordinal = this.j.ordinal();
            if (ordinal != 0) {
                if (ordinal == 1) {
                    a aVar = this.c;
                    aVar.getClass();
                    com.braze.configuration.b bVar = com.braze.configuration.b.b;
                    intValue = aVar.getIntValue("com_braze_data_flush_interval_bad_network", 60);
                } else if (ordinal == 2) {
                    a aVar2 = this.c;
                    aVar2.getClass();
                    com.braze.configuration.b bVar2 = com.braze.configuration.b.b;
                    intValue = aVar2.getIntValue("com_braze_data_flush_interval_good_network", 30);
                } else {
                    if (ordinal != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    a aVar3 = this.c;
                    aVar3.getClass();
                    com.braze.configuration.b bVar3 = com.braze.configuration.b.b;
                    intValue = aVar3.getIntValue("com_braze_data_flush_interval_great_network", 10);
                }
                j = intValue * 1000;
            } else {
                j = -1;
            }
            this.g = j;
            if (j != -1 && j < 1000) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return f.d(f.this);
                    }
                }, 6, (Object) null);
                this.g = 1000L;
            }
        } else {
            this.g = -1L;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f.b(f.this);
            }
        }, 6, (Object) null);
        if (j2 != this.g) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda11
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.b(j2, this);
                }
            }, 7, (Object) null);
            b(this.g);
        }
    }

    public static final String c(long j) {
        return "Posting new sync runnable with delay " + j + " ms";
    }

    public static final String c(f fVar) {
        return "recalculateDispatchState called with session state: " + fVar.f + " lastNetworkLevel: " + fVar.j;
    }

    public static final String a(long j, f fVar) {
        return "Kicking off the Sync Job. initialDelaysMs: " + j + ": currentIntervalMs " + fVar.g + " ms";
    }

    public static final String a(f fVar) {
        return "Data flush interval is " + fVar.g + " ms. Not scheduling a proceeding data flush.";
    }

    public final void a(com.braze.events.d dVar, Exception exc) {
        try {
            dVar.b(exc, Throwable.class);
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda0
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.a();
                }
            }, 4, (Object) null);
        }
    }

    public static final String a() {
        return "Failed to log throwable.";
    }

    public final void a(NetworkCapabilities networkCapabilities) {
        com.braze.enums.e eVar = this.j;
        com.braze.enums.e a2 = com.braze.support.c.a(networkCapabilities);
        this.j = a2;
        if (eVar != a2) {
            this.b.b(new o(eVar, a2), o.class);
        }
        b();
    }

    public final void a(com.braze.events.d eventManager) {
        Intrinsics.checkNotNullParameter(eventManager, "eventManager");
        eventManager.c(a0.class, new IEventSubscriber() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda14
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f.a(f.this, (a0) obj);
            }
        });
        eventManager.c(b0.class, new IEventSubscriber() { // from class: com.braze.dispatch.f$$ExternalSyntheticLambda1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                f.a(f.this, (b0) obj);
            }
        });
    }

    public static final void a(f fVar, a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.f = com.braze.enums.f.f505a;
        fVar.b();
    }

    public static final void a(f fVar, b0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        fVar.f = com.braze.enums.f.b;
        fVar.b();
    }

    public static final String b(f fVar) {
        return "currentIntervalMs: " + fVar.g;
    }

    public static final String b(long j, f fVar) {
        return "Data flush interval has changed from " + j + " ms to " + fVar.g + " ms after connectivity state change to: " + fVar.j + " and session state: " + fVar.f;
    }
}
