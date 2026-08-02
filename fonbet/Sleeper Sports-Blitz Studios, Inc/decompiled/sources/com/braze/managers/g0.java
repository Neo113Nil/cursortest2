package com.braze.managers;

import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class g0 {
    public static final long i = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: a, reason: collision with root package name */
    public final b3 f583a;
    public final com.braze.events.d b;
    public final com.braze.communication.dust.j c;
    public final com.braze.requests.util.c d;
    public final com.braze.storage.a1 e;
    public Job f;
    public Job g;
    public int h;

    public g0(Context context, String str, String apiKey, b3 serverConfigStorageProvider, com.braze.events.d internalPublisher, com.braze.communication.dust.j connector, com.braze.requests.util.c backoffStateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(connector, "connector");
        Intrinsics.checkNotNullParameter(backoffStateProvider, "backoffStateProvider");
        this.f583a = serverConfigStorageProvider;
        this.b = internalPublisher;
        this.c = connector;
        this.d = backoffStateProvider;
        this.e = new com.braze.storage.a1(context, str, apiKey);
        internalPublisher.c(com.braze.events.internal.a0.class, new IEventSubscriber() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda5
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g0.a(g0.this, (com.braze.events.internal.a0) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.b0.class, new IEventSubscriber() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda6
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g0.a(g0.this, (com.braze.events.internal.b0) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.o.class, new IEventSubscriber() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g0.a(g0.this, (com.braze.events.internal.o) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.h.class, new IEventSubscriber() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                g0.a(g0.this, (com.braze.events.internal.h) obj);
            }
        });
    }

    public static final String b() {
        return "Ending DUST subscription";
    }

    public static final String c() {
        return "Saving rcs value from TTL message";
    }

    public static final String d() {
        return "Cancelling ending of DUST subscription on delay and resuming stream";
    }

    public static final String e() {
        return "Ending DUST subscription on a delay";
    }

    public static final String f() {
        return "Received dust config. Starting/resuming a new subscription";
    }

    public static final String h() {
        return "Connection attempt succeeded. Resetting attempts to 0";
    }

    public static final String i() {
        return "Max reconnect attempts reached. Not starting DUST subscription.";
    }

    public final void a(com.braze.models.dust.b bVar) {
        g0 g0Var;
        if (bVar == null) {
            return;
        }
        final String str = bVar.b;
        if (str != null) {
            g0Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.a(str);
                }
            }, 6, (Object) null);
        } else {
            g0Var = this;
        }
        ((com.braze.communication.dust.i) g0Var.c).b();
        Job job = g0Var.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        long j = bVar.f622a;
        com.braze.requests.util.b bVar2 = (com.braze.requests.util.b) g0Var.d;
        g0Var.g = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Long.valueOf(j + bVar2.a(bVar2.b)), null, new b0(this, null), 2, null);
    }

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda17
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.h();
            }
        }, 7, (Object) null);
        this.h = 0;
        ((com.braze.requests.util.b) this.d).f = 0;
    }

    public static final String b(com.braze.models.dust.g gVar) {
        return "Ingesting DUST message of type " + gVar.a() + "\n" + gVar;
    }

    public static final String c(long j) {
        return "Scheduling stream reconnection in " + j + " ms";
    }

    public final void b(final long j) {
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda13
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.c(j);
            }
        }, 6, (Object) null);
        this.g = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(j), null, new c0(this, j, null), 2, null);
    }

    public static final String b(Integer num) {
        return "Not scheduling dust reconnect for non-retriable response code: " + num;
    }

    public final void a(com.braze.models.dust.c cVar) {
        if (cVar == null) {
            return;
        }
        String str = cVar.b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.c();
                }
            }, 7, (Object) null);
            this.e.writeData(DataStoreKey.DUST_RCS, str);
        }
        Long l = cVar.f623a;
        if (l != null) {
            final long longValue = l.longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.a(longValue);
                }
            }, 7, (Object) null);
            b(longValue);
        }
    }

    public static final void a(g0 g0Var, com.braze.events.internal.a0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda18
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.d();
            }
        }, 7, (Object) null);
        Job job = g0Var.f;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        g0Var.a(true);
    }

    public static final void a(g0 g0Var, com.braze.events.internal.b0 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.e();
            }
        }, 7, (Object) null);
        g0Var.f = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(i), null, new z(g0Var, null), 2, null);
    }

    public static final void a(g0 g0Var, final com.braze.events.internal.o it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda21
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.a(com.braze.events.internal.o.this);
            }
        }, 7, (Object) null);
        com.braze.enums.e eVar = it.b;
        com.braze.enums.e eVar2 = com.braze.enums.e.f504a;
        if (eVar == eVar2) {
            g0Var.a();
        } else if (it.f531a == eVar2) {
            g0Var.a(true);
        }
    }

    public static final String a(com.braze.events.internal.o oVar) {
        return "Got network change event: " + oVar;
    }

    public static final void a(g0 g0Var, final com.braze.events.internal.h it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda11
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.f();
            }
        }, 7, (Object) null);
        com.braze.storage.a1 a1Var = g0Var.e;
        DataStoreKey dataStoreKey = DataStoreKey.MITE_KEY;
        String readString = a1Var.readString(dataStoreKey, "");
        if (readString == null || readString.length() == 0) {
            readString = null;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) g0Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda14
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.a(com.braze.events.internal.h.this);
            }
        }, 7, (Object) null);
        String str = it.f524a;
        if (str != null) {
            g0Var.e.writeData(dataStoreKey, str);
        }
        String str2 = it.b;
        if (str2 != null) {
            g0Var.e.writeData(DataStoreKey.DUST_HOST, str2);
        }
        String str3 = it.c;
        if (str3 != null) {
            g0Var.e.writeData(DataStoreKey.DUST_AUTH, str3);
        }
        g0Var.a(Intrinsics.areEqual(readString, it.f524a));
    }

    public static final String a(com.braze.events.internal.h hVar) {
        return "Setting dust config: mite=" + hVar.b() + ", host=" + hVar.a();
    }

    public final void a(final boolean z) {
        Job job = this.g;
        String str = null;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        if (this.h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.i();
                }
            }, 7, (Object) null);
            return;
        }
        final String readString = this.e.readString(DataStoreKey.MITE_KEY, "");
        if (readString == null || readString.length() == 0) {
            readString = null;
        }
        final String readString2 = this.e.readString(DataStoreKey.DUST_HOST, "");
        if (readString2 == null || readString2.length() == 0) {
            readString2 = null;
        }
        final String readString3 = this.e.readString(DataStoreKey.DUST_AUTH, "");
        if (readString3 == null || readString3.length() == 0) {
            readString3 = null;
        }
        String readString4 = this.e.readString(DataStoreKey.DUST_RCS, "");
        if (readString4 != null && readString4.length() != 0) {
            str = readString4;
        }
        if (readString != null && readString2 != null && readString3 != null && this.f583a.F()) {
            final String a2 = a0.a(readString2, readString, readString3, str, this.h);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.a(z, readString, a2);
                }
            }, 7, (Object) null);
            ((com.braze.communication.dust.i) this.c).a(a2, new d0(this), new e0(this), new f0(this), z);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.a(readString, readString2, readString3, this);
            }
        }, 7, (Object) null);
    }

    public static final String a(String str, String str2, String str3, g0 g0Var) {
        return "Cannot start dust subscription: mite=" + str + ", host=" + str2 + ", auth=" + (str3 != null) + ", enabled=" + g0Var.f583a.F();
    }

    public static final String a(boolean z, String str, String str2) {
        return "Starting (resume = " + z + ") DUST subscription for mite: " + str + " to url: " + str2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.b();
            }
        }, 7, (Object) null);
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        this.g = null;
        ((com.braze.communication.dust.i) this.c).b();
    }

    public final void a(final com.braze.models.dust.g dm) {
        Intrinsics.checkNotNullParameter(dm, "dm");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda19
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.b(com.braze.models.dust.g.this);
            }
        }, 7, (Object) null);
        final com.braze.models.dust.f a2 = dm.a();
        int ordinal = a2.ordinal();
        if (ordinal == 1) {
            com.braze.events.d dVar = this.b;
            com.braze.requests.c cVar = com.braze.requests.c.b;
            dVar.b(new com.braze.events.internal.e(), com.braze.events.internal.e.class);
            return;
        }
        if (ordinal == 2) {
            a(dm instanceof com.braze.models.dust.c ? (com.braze.models.dust.c) dm : null);
        } else if (ordinal != 3) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.W, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda20
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.a(com.braze.models.dust.f.this);
                }
            }, 6, (Object) null);
        } else {
            a(dm instanceof com.braze.models.dust.b ? (com.braze.models.dust.b) dm : null);
        }
    }

    public static final String a(com.braze.models.dust.f fVar) {
        return "Lacked logic to ingest message! Type: " + fVar;
    }

    public static final String a(long j) {
        return "Scheduling reconnection in " + j + "ms";
    }

    public static final String a(String str) {
        return "Received disconnect and retry request. Reason: " + str;
    }

    public final void a(final Integer num) {
        this.h++;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return g0.a(g0.this, num);
            }
        }, 7, (Object) null);
        Job job = this.g;
        if (job != null) {
            Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
        }
        IntRange intRange = com.braze.communication.dust.i.g;
        if (num != null && intRange.contains(num.intValue())) {
            com.braze.requests.util.b bVar = (com.braze.requests.util.b) this.d;
            b(bVar.a(bVar.b));
        } else {
            IntRange intRange2 = com.braze.communication.dust.i.f;
            if (num != null) {
                intRange2.contains(num.intValue());
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.g0$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return g0.b(num);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(g0 g0Var, Integer num) {
        return "Connection attempt failed. Attempts now at: " + g0Var.h + ". Response code: " + num;
    }
}
