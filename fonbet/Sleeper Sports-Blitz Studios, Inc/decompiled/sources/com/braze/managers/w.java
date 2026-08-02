package com.braze.managers;

import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.storage.k1;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CompletableJob;
import kotlinx.coroutines.Job;
import kotlinx.coroutines.JobKt__JobKt;

/* loaded from: classes6.dex */
public final class w {
    public static final String n = BrazeLogger.getBrazeLogTag((Class<?>) w.class);
    public static final long o;
    public static final long p;

    /* renamed from: a, reason: collision with root package name */
    public final Context f611a;
    public final k1 b;
    public final com.braze.events.d c;
    public final com.braze.events.e d;
    public final AlarmManager e;
    public final int f;
    public final boolean g;
    public final ReentrantLock h;
    public final String i;
    public final u j;
    public Job k;
    public com.braze.models.n l;
    public final LinkedHashMap m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        o = timeUnit.toMillis(10L);
        p = timeUnit.toMillis(10L);
    }

    public w(Context applicationContext, k1 sessionStorageManager, com.braze.events.d internalEventPublisher, com.braze.events.e externalEventPublisher, AlarmManager alarmManager, int i, boolean z) {
        CompletableJob Job$default;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(alarmManager, "alarmManager");
        this.f611a = applicationContext;
        this.b = sessionStorageManager;
        this.c = internalEventPublisher;
        this.d = externalEventPublisher;
        this.e = alarmManager;
        this.f = i;
        this.g = z;
        this.h = new ReentrantLock();
        Job$default = JobKt__JobKt.Job$default((Job) null, 1, (Object) null);
        this.k = Job$default;
        this.m = new LinkedHashMap();
        u uVar = new u(this);
        this.j = uVar;
        String str = applicationContext.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.i = str;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationContext.registerReceiver(uVar, new IntentFilter(str), 2);
            } else {
                applicationContext.registerReceiver(uVar, new IntentFilter(str));
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a(w.this);
                }
            }, 4, (Object) null);
            this.j = null;
        }
    }

    public static final String a(w wVar) {
        return "Failed to register dynamic receiver for " + wVar.i;
    }

    public static final String b(String str) {
        return "Attempting to close session with context: " + str;
    }

    public static final String d(String str) {
        return "Attempting to open session with context: " + str;
    }

    public static final String e(w wVar) {
        return "Completed the stopSession call. Current session: " + wVar.h();
    }

    public static final String f(com.braze.models.n nVar) {
        return "Closed session with id " + nVar.f();
    }

    public static final String k() {
        return "Getting the stored open session";
    }

    public static final String n() {
        return "Failed to unregister session seal receiver.";
    }

    public static final String q() {
        return "At least one session context is open. Calling startSession.";
    }

    public static final String r() {
        return "No session contexts are open. Calling stopSession.";
    }

    public final void c(final String str) {
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.d(str);
                }
            }, 6, (Object) null);
            a(str, true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda3
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a();
                }
            }, 6, (Object) null);
            a("$/! global session context sentinel", true);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda4
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.c(w.this);
            }
        }, 6, (Object) null);
    }

    public final boolean g() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            j();
            final com.braze.models.n nVar = this.l;
            boolean z = true;
            if (nVar != null && !nVar.d) {
                if (nVar.c != null) {
                    nVar.c = null;
                } else {
                    z = false;
                }
                reentrantLock.unlock();
                return z;
            }
            i();
            if (nVar != null && nVar.d) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda13
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return w.a(com.braze.models.n.this);
                        }
                    }, 7, (Object) null);
                    this.b.a(nVar.f647a.b);
                    reentrantLock.unlock();
                    return z;
                } catch (Throwable th) {
                    th = th;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            reentrantLock.unlock();
            return z;
        } catch (Throwable th2) {
            th = th2;
        }
    }

    public final com.braze.models.q h() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            j();
            com.braze.models.n nVar = this.l;
            return nVar != null ? nVar.f647a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        final com.braze.models.n nVar = new com.braze.models.n();
        this.l = nVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.b(com.braze.models.n.this);
            }
        }, 6, (Object) null);
        this.c.b(new com.braze.events.internal.y(nVar), com.braze.events.internal.y.class);
        ((com.braze.events.d) this.d).b(new SessionStateChangedEvent(nVar.f647a.b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007e, code lost:
    
        if ((r13.toMillis((long) r5) + r14) <= r11) goto L23;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (this.l == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda7
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.k();
                    }
                }, 7, (Object) null);
                com.braze.models.p c = this.b.c();
                this.l = c != null ? new com.braze.models.n(c.f647a, c.b, c.e(), c.d) : null;
            }
            final com.braze.models.n nVar = this.l;
            if (nVar != null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda8
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.c(com.braze.models.n.this);
                    }
                }, 7, (Object) null);
                Double d = nVar.c;
                if (d != null && !nVar.d) {
                    double d2 = nVar.b;
                    double doubleValue = d.doubleValue();
                    int i = this.f;
                    boolean z = this.g;
                    long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long millis = timeUnit.toMillis(i);
                    if (z) {
                        if (timeUnit.toMillis((long) d2) + millis + p <= nowInMilliseconds) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.I, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return w.d(com.braze.models.n.this);
                                }
                            }, 6, (Object) null);
                            l();
                            k1 k1Var = this.b;
                            com.braze.models.n nVar2 = this.l;
                            k1Var.a(String.valueOf(nVar2 != null ? nVar2.f647a : null));
                            this.l = null;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void l() {
        final com.braze.models.n nVar = this.l;
        if (nVar != null) {
            ReentrantLock reentrantLock = this.h;
            reentrantLock.lock();
            try {
                nVar.d = true;
                nVar.c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.b.a(nVar);
                this.c.b(new com.braze.events.internal.z(nVar), com.braze.events.internal.z.class);
                ((com.braze.events.d) this.d).b(new SessionStateChangedEvent(nVar.f647a.b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda14
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.e(com.braze.models.n.this);
                    }
                }, 6, (Object) null);
                Unit unit = Unit.INSTANCE;
            } finally {
                reentrantLock.unlock();
            }
        }
    }

    public final void m() {
        try {
            u uVar = this.j;
            if (uVar != null) {
                this.f611a.unregisterReceiver(uVar);
            }
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda17
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.n();
                }
            }, 4, (Object) null);
        }
    }

    public final void o() {
        com.braze.models.n nVar;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            if (g() && (nVar = this.l) != null) {
                this.b.a(nVar);
            }
            Job.DefaultImpls.cancel$default(this.k, (CancellationException) null, 1, (Object) null);
            b();
            this.c.b(com.braze.events.internal.a0.f511a, com.braze.events.internal.a0.class);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda16
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.d(w.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public final void p() {
        Job launch$default;
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            g();
            final com.braze.models.n nVar = this.l;
            if (nVar != null) {
                nVar.c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.b.a(nVar);
                Job.DefaultImpls.cancel$default(this.k, (CancellationException) null, 1, (Object) null);
                launch$default = BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new v(this, null), 3, null);
                this.k = launch$default;
                e();
                this.c.b(com.braze.events.internal.b0.f512a, com.braze.events.internal.b0.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda11
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.f(com.braze.models.n.this);
                    }
                }, 7, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.V, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda12
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.e(w.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th) {
            reentrantLock.unlock();
            throw th;
        }
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public static final String b(w wVar) {
        return "Completed the attemptToCloseSession call. Current session: " + wVar.h();
    }

    public static final String d(w wVar) {
        return "Completed the startSession call. Current session: " + wVar.h();
    }

    public static final String e(com.braze.models.n nVar) {
        return "Sealed session with id " + nVar.f();
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public static final String b(com.braze.models.n nVar) {
        return "New session created with ID: " + nVar.f();
    }

    public static final String d(com.braze.models.n nVar) {
        return "Session [" + nVar.f() + "] being sealed because its end time is over the grace period. Session: " + nVar;
    }

    public final void a(final String sessionContextId) {
        Intrinsics.checkNotNullParameter(sessionContextId, "sessionContextId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda10
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.b(sessionContextId);
            }
        }, 6, (Object) null);
        a(sessionContextId, false);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda15
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.b(w.this);
            }
        }, 6, (Object) null);
    }

    public final void e() {
        com.braze.models.n mutableSession = this.l;
        if (mutableSession != null) {
            int i = this.f;
            boolean z = this.g;
            Intrinsics.checkNotNullParameter(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i);
            if (z) {
                millis = Math.max(p, (timeUnit.toMillis((long) mutableSession.b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            final long j = millis;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda21
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a(j);
                }
            }, 7, (Object) null);
            try {
                Intent intent = new Intent(this.i);
                intent.putExtra("session_id", mutableSession.toString());
                this.e.set(1, DateTimeUtils.nowInMilliseconds() + j, PendingIntent.getBroadcast(this.f611a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda22
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.f();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return w.c();
            }
        }, 7, (Object) null);
        try {
            Intent intent = new Intent(this.i);
            intent.putExtra("session_id", String.valueOf(this.l));
            this.e.cancel(PendingIntent.getBroadcast(this.f611a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.E, (Throwable) e, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.d();
                }
            }, 4, (Object) null);
        }
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public static final String c(w wVar) {
        return "Completed the attemptToOpenSession call. Current session: " + wVar.h();
    }

    public final void a(String sessionContextId, boolean z) {
        Intrinsics.checkNotNullParameter(sessionContextId, "sessionContextId");
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        int i = z ? 1 : -1;
        try {
            Object obj = this.m.get(sessionContextId);
            if (obj == null) {
                obj = 0;
            }
            this.m.put(sessionContextId, Integer.valueOf(((Number) obj).intValue() + i));
            final int sumOfInt = CollectionsKt.sumOfInt(this.m.values());
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda18
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return w.a(sumOfInt, this);
                }
            }, 6, (Object) null);
            if (sumOfInt > 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda19
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.q();
                    }
                }, 6, (Object) null);
                o();
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.w$$ExternalSyntheticLambda20
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return w.r();
                    }
                }, 6, (Object) null);
                p();
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String c(com.braze.models.n nVar) {
        return "Checking if this session needs to be sealed: " + nVar.f();
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String a(int i, w wVar) {
        return "Session context identifier map updated. sum: " + i + " map: " + wVar.m;
    }

    public static final String a(com.braze.models.n nVar) {
        return "Clearing completely dispatched sealed session " + nVar.f();
    }

    public static final String a(long j) {
        return "Creating a session seal alarm with a delay of " + j + " ms";
    }
}
