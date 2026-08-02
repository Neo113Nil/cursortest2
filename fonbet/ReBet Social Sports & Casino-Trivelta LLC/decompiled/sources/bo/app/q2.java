package bo.app;

import Ph.A;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.G0;
import android.app.AlarmManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.os.Build;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.SessionStateChangedEvent;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.braze.support.IntentUtils;
import java.util.LinkedHashMap;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class q2 {

    /* renamed from: n, reason: collision with root package name */
    public static final String f25924n = BrazeLogger.getBrazeLogTag((Class<?>) q2.class);

    /* renamed from: o, reason: collision with root package name */
    public static final long f25925o;

    /* renamed from: p, reason: collision with root package name */
    public static final long f25926p;

    /* renamed from: a, reason: collision with root package name */
    public final Context f25927a;

    /* renamed from: b, reason: collision with root package name */
    public final f7 f25928b;

    /* renamed from: c, reason: collision with root package name */
    public final r7 f25929c;

    /* renamed from: d, reason: collision with root package name */
    public final m9 f25930d;

    /* renamed from: e, reason: collision with root package name */
    public final AlarmManager f25931e;

    /* renamed from: f, reason: collision with root package name */
    public final int f25932f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f25933g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f25934h;

    /* renamed from: i, reason: collision with root package name */
    public final String f25935i;

    /* renamed from: j, reason: collision with root package name */
    public final o2 f25936j;

    /* renamed from: k, reason: collision with root package name */
    public C0 f25937k;

    /* renamed from: l, reason: collision with root package name */
    public za f25938l;

    /* renamed from: m, reason: collision with root package name */
    public final LinkedHashMap f25939m;

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f25925o = timeUnit.toMillis(10L);
        f25926p = timeUnit.toMillis(10L);
    }

    public q2(Context applicationContext, f7 sessionStorageManager, r7 internalEventPublisher, m9 externalEventPublisher, AlarmManager alarmManager, int i10, boolean z10) {
        A b10;
        Intrinsics.checkNotNullParameter(applicationContext, "applicationContext");
        Intrinsics.checkNotNullParameter(sessionStorageManager, "sessionStorageManager");
        Intrinsics.checkNotNullParameter(internalEventPublisher, "internalEventPublisher");
        Intrinsics.checkNotNullParameter(externalEventPublisher, "externalEventPublisher");
        Intrinsics.checkNotNullParameter(alarmManager, "alarmManager");
        this.f25927a = applicationContext;
        this.f25928b = sessionStorageManager;
        this.f25929c = internalEventPublisher;
        this.f25930d = externalEventPublisher;
        this.f25931e = alarmManager;
        this.f25932f = i10;
        this.f25933g = z10;
        this.f25934h = new ReentrantLock();
        b10 = G0.b(null, 1, null);
        this.f25937k = b10;
        this.f25939m = new LinkedHashMap();
        o2 o2Var = new o2(this);
        this.f25936j = o2Var;
        String str = applicationContext.getPackageName() + ".intent.BRAZE_SESSION_SHOULD_SEAL";
        this.f25935i = str;
        try {
            if (Build.VERSION.SDK_INT >= 33) {
                applicationContext.registerReceiver(o2Var, new IntentFilter(str), 2);
            } else {
                applicationContext.registerReceiver(o2Var, new IntentFilter(str));
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.j9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.a(bo.app.q2.this);
                }
            }, 4, (Object) null);
            this.f25936j = null;
        }
    }

    public static final String a(za zaVar) {
        return "Clearing completely dispatched sealed session " + zaVar.f26205a;
    }

    public static final String b(za zaVar) {
        return "New session created with ID: " + zaVar.f26205a;
    }

    public static final String c(za zaVar) {
        return "Checking if this session needs to be sealed: " + zaVar.f26205a;
    }

    public static final String d(za zaVar) {
        return "Session [" + zaVar.f26205a + "] being sealed because its end time is over the grace period. Session: " + zaVar;
    }

    public static final String e(za zaVar) {
        return "Sealed session with id " + zaVar.f26205a;
    }

    public static final String f(za zaVar) {
        return "Closed session with id " + zaVar.f26205a;
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

    public final boolean g() {
        ReentrantLock reentrantLock = this.f25934h;
        reentrantLock.lock();
        try {
            j();
            final za zaVar = this.f25938l;
            boolean z10 = true;
            if (zaVar != null && !zaVar.f26208d) {
                if (zaVar.f26207c != null) {
                    zaVar.f26207c = null;
                } else {
                    z10 = false;
                }
                reentrantLock.unlock();
                return z10;
            }
            i();
            if (zaVar != null && zaVar.f26208d) {
                try {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.w9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.q2.a(bo.app.za.this);
                        }
                    }, 7, (Object) null);
                    this.f25928b.a(zaVar.f26205a.f26327b);
                    reentrantLock.unlock();
                    return z10;
                } catch (Throwable th2) {
                    th = th2;
                    reentrantLock.unlock();
                    throw th;
                }
            }
            reentrantLock.unlock();
            return z10;
        } catch (Throwable th3) {
            th = th3;
        }
    }

    public final ye h() {
        ReentrantLock reentrantLock = this.f25934h;
        reentrantLock.lock();
        try {
            j();
            za zaVar = this.f25938l;
            return zaVar != null ? zaVar.f26205a : null;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final void i() {
        final za zaVar = new za();
        this.f25938l = zaVar;
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.x9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q2.b(bo.app.za.this);
            }
        }, 6, (Object) null);
        this.f25929c.b(new xe(zaVar), xe.class);
        ((r7) this.f25930d).b(new SessionStateChangedEvent(zaVar.f26205a.f26327b, SessionStateChangedEvent.ChangeType.SESSION_STARTED), SessionStateChangedEvent.class);
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x007f, code lost:
    
        if ((r13.toMillis((long) r5) + r14) <= r11) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j() {
        ReentrantLock reentrantLock = this.f25934h;
        reentrantLock.lock();
        try {
            if (this.f25938l == null) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.E9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.k();
                    }
                }, 7, (Object) null);
                we c10 = this.f25928b.c();
                this.f25938l = c10 != null ? new za(c10.f26205a, c10.f26206b, c10.f26207c, c10.f26208d) : null;
            }
            final za zaVar = this.f25938l;
            if (zaVar != null) {
                BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.F9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.c(bo.app.za.this);
                    }
                }, 7, (Object) null);
                Double d10 = zaVar.f26207c;
                if (d10 != null && !zaVar.f26208d) {
                    double d11 = zaVar.f26206b;
                    double doubleValue = d10.doubleValue();
                    int i10 = this.f25932f;
                    boolean z10 = this.f25933g;
                    long nowInMilliseconds = DateTimeUtils.nowInMilliseconds();
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    long millis = timeUnit.toMillis(i10);
                    if (z10) {
                        if (timeUnit.toMillis((long) d11) + millis + f25926p <= nowInMilliseconds) {
                            BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29471I, (Throwable) null, false, new Function0() { // from class: c3.k9
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return bo.app.q2.d(bo.app.za.this);
                                }
                            }, 6, (Object) null);
                            l();
                            f7 f7Var = this.f25928b;
                            za zaVar2 = this.f25938l;
                            f7Var.a(String.valueOf(zaVar2 != null ? zaVar2.f26205a : null));
                            this.f25938l = null;
                        }
                    }
                }
                Unit unit = Unit.INSTANCE;
            }
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void l() {
        final za zaVar = this.f25938l;
        if (zaVar != null) {
            ReentrantLock reentrantLock = this.f25934h;
            reentrantLock.lock();
            try {
                zaVar.f26208d = true;
                zaVar.f26207c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f25928b.a(zaVar);
                this.f25929c.b(new ze(zaVar), ze.class);
                ((r7) this.f25930d).b(new SessionStateChangedEvent(zaVar.f26205a.f26327b, SessionStateChangedEvent.ChangeType.SESSION_ENDED), SessionStateChangedEvent.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.y9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.e(bo.app.za.this);
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
            o2 o2Var = this.f25936j;
            if (o2Var != null) {
                this.f25927a.unregisterReceiver(o2Var);
            }
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.u9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.n();
                }
            }, 4, (Object) null);
        }
    }

    public final void o() {
        za zaVar;
        ReentrantLock reentrantLock = this.f25934h;
        reentrantLock.lock();
        try {
            if (g() && (zaVar = this.f25938l) != null) {
                this.f25928b.a(zaVar);
            }
            C0.a.b(this.f25937k, null, 1, null);
            b();
            this.f25929c.b(af.f25254a, af.class);
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.q9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.d(bo.app.q2.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void p() {
        C0 d10;
        ReentrantLock reentrantLock = this.f25934h;
        reentrantLock.lock();
        try {
            g();
            final za zaVar = this.f25938l;
            if (zaVar != null) {
                zaVar.f26207c = Double.valueOf(DateTimeUtils.nowInSecondsPrecise());
                this.f25928b.a(zaVar);
                C0.a.b(this.f25937k, null, 1, null);
                d10 = AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new p2(this, null), 3, null);
                this.f25937k = d10;
                e();
                this.f25929c.b(cf.f25364a, cf.class);
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.o9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.f(bo.app.za.this);
                    }
                }, 7, (Object) null);
                Unit unit = Unit.INSTANCE;
            }
            reentrantLock.unlock();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.p9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.e(bo.app.q2.this);
                }
            }, 6, (Object) null);
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String a(q2 q2Var) {
        return "Failed to register dynamic receiver for " + q2Var.f25935i;
    }

    public static final String b(String str) {
        return "Attempting to close session with context: " + str;
    }

    public static final String d(String str) {
        return "Attempting to open session with context: " + str;
    }

    public static final String e(q2 q2Var) {
        return "Completed the stopSession call. Current session: " + q2Var.h();
    }

    public static final String f() {
        return "Failed to create session seal alarm";
    }

    public final void c(final String str) {
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.z9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.d(str);
                }
            }, 6, (Object) null);
            a(str, true);
        } else {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.A9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.a();
                }
            }, 6, (Object) null);
            a("$/! global session context sentinel", true);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.B9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q2.c(bo.app.q2.this);
            }
        }, 6, (Object) null);
    }

    public static final String a() {
        return "Opening a session with a global context identifier.";
    }

    public static final String b(q2 q2Var) {
        return "Completed the attemptToCloseSession call. Current session: " + q2Var.h();
    }

    public static final String d(q2 q2Var) {
        return "Completed the startSession call. Current session: " + q2Var.h();
    }

    public final void e() {
        za mutableSession = this.f25938l;
        if (mutableSession != null) {
            int i10 = this.f25932f;
            boolean z10 = this.f25933g;
            Intrinsics.checkNotNullParameter(mutableSession, "mutableSession");
            TimeUnit timeUnit = TimeUnit.SECONDS;
            long millis = timeUnit.toMillis(i10);
            if (z10) {
                millis = Math.max(f25926p, (timeUnit.toMillis((long) mutableSession.f26206b) + millis) - DateTimeUtils.nowInMilliseconds());
            }
            final long j10 = millis;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.r9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.a(j10);
                }
            }, 7, (Object) null);
            try {
                Intent intent = new Intent(this.f25935i);
                intent.putExtra("session_id", mutableSession.toString());
                this.f25931e.set(1, DateTimeUtils.nowInMilliseconds() + j10, PendingIntent.getBroadcast(this.f25927a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
            } catch (Exception e10) {
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.s9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.f();
                    }
                }, 4, (Object) null);
            }
        }
    }

    public static final String d() {
        return "Failed to cancel session seal alarm";
    }

    public final void a(final String sessionContextId) {
        Intrinsics.checkNotNullParameter(sessionContextId, "sessionContextId");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.C9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q2.b(sessionContextId);
            }
        }, 6, (Object) null);
        a(sessionContextId, false);
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.D9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q2.b(bo.app.q2.this);
            }
        }, 6, (Object) null);
    }

    public final void b() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.t9
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.q2.c();
            }
        }, 7, (Object) null);
        try {
            Intent intent = new Intent(this.f25935i);
            intent.putExtra("session_id", String.valueOf(this.f25938l));
            this.f25931e.cancel(PendingIntent.getBroadcast(this.f25927a, 0, intent, IntentUtils.getImmutablePendingIntentFlags() | 1073741824));
        } catch (Exception e10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29470E, (Throwable) e10, false, new Function0() { // from class: c3.v9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.d();
                }
            }, 4, (Object) null);
        }
    }

    public static final String c(q2 q2Var) {
        return "Completed the attemptToOpenSession call. Current session: " + q2Var.h();
    }

    public final void a(String sessionContextId, boolean z10) {
        Intrinsics.checkNotNullParameter(sessionContextId, "sessionContextId");
        ReentrantLock reentrantLock = this.f25934h;
        reentrantLock.lock();
        int i10 = z10 ? 1 : -1;
        try {
            Object obj = this.f25939m.get(sessionContextId);
            if (obj == null) {
                obj = 0;
            }
            this.f25939m.put(sessionContextId, Integer.valueOf(((Number) obj).intValue() + i10));
            final int sumOfInt = CollectionsKt.sumOfInt(this.f25939m.values());
            BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
            BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.l9
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.q2.a(sumOfInt, this);
                }
            }, 6, (Object) null);
            if (sumOfInt > 0) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.m9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.q();
                    }
                }, 6, (Object) null);
                o();
            } else {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, priority, (Throwable) null, false, new Function0() { // from class: c3.n9
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.q2.r();
                    }
                }, 6, (Object) null);
                p();
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public static final String c() {
        return "Cancelling session seal alarm";
    }

    public static final String a(int i10, q2 q2Var) {
        return "Session context identifier map updated. sum: " + i10 + " map: " + q2Var.f25939m;
    }

    public static final String a(long j10) {
        return "Creating a session seal alarm with a delay of " + j10 + " ms";
    }
}
