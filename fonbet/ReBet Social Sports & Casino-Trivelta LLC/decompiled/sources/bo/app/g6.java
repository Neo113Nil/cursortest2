package bo.app;

import Ph.C0;
import android.content.Context;
import bo.app.af;
import bo.app.cf;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.enums.DataStoreKey;
import com.braze.events.IEventSubscriber;
import com.braze.storage.C2990d;
import com.braze.support.BrazeLogger;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.concurrent.TimeUnit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;

/* loaded from: classes.dex */
public final class g6 {

    /* renamed from: i, reason: collision with root package name */
    public static final long f25471i = TimeUnit.SECONDS.toMillis(3);

    /* renamed from: a, reason: collision with root package name */
    public final ue f25472a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f25473b;

    /* renamed from: c, reason: collision with root package name */
    public final o6 f25474c;

    /* renamed from: d, reason: collision with root package name */
    public final x7 f25475d;

    /* renamed from: e, reason: collision with root package name */
    public final C2990d f25476e;

    /* renamed from: f, reason: collision with root package name */
    public C0 f25477f;

    /* renamed from: g, reason: collision with root package name */
    public C0 f25478g;

    /* renamed from: h, reason: collision with root package name */
    public int f25479h;

    public g6(Context context, String str, String apiKey, ue serverConfigStorageProvider, r7 internalPublisher, o6 connector, x7 backoffStateProvider) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(apiKey, "apiKey");
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(connector, "connector");
        Intrinsics.checkNotNullParameter(backoffStateProvider, "backoffStateProvider");
        this.f25472a = serverConfigStorageProvider;
        this.f25473b = internalPublisher;
        this.f25474c = connector;
        this.f25475d = backoffStateProvider;
        this.f25476e = new C2990d(context, str, apiKey);
        internalPublisher.c(af.class, new IEventSubscriber() { // from class: c3.S1
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g6.a(bo.app.g6.this, (af) obj);
            }
        });
        internalPublisher.c(cf.class, new IEventSubscriber() { // from class: c3.d2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g6.a(bo.app.g6.this, (cf) obj);
            }
        });
        internalPublisher.c(db.class, new IEventSubscriber() { // from class: c3.g2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g6.a(bo.app.g6.this, (bo.app.db) obj);
            }
        });
        internalPublisher.c(u5.class, new IEventSubscriber() { // from class: c3.h2
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.g6.a(bo.app.g6.this, (bo.app.u5) obj);
            }
        });
    }

    public static final String a(u5 u5Var) {
        return "Setting dust config: mite=" + u5Var.f26105a + ", host=" + u5Var.f26106b;
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

    public final void g() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Y1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.h();
            }
        }, 7, (Object) null);
        this.f25479h = 0;
        this.f25475d.f26265f = 0;
    }

    public static final String b(k9 k9Var) {
        return "Ingesting DUST message of type " + k9Var.a() + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + k9Var;
    }

    public static final String c(long j10) {
        return "Scheduling stream reconnection in " + j10 + " ms";
    }

    public final void b(final long j10) {
        C0 c02 = this.f25478g;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, BrazeLogger.Priority.f29472V, (Throwable) null, false, new Function0() { // from class: c3.b2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.c(j10);
            }
        }, 6, (Object) null);
        this.f25478g = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(j10), null, new c6(this, j10, null), 2, null);
    }

    public final void a(x5 x5Var) {
        g6 g6Var;
        if (x5Var == null) {
            return;
        }
        final String str = x5Var.f26249b;
        if (str != null) {
            g6Var = this;
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.c2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g6.a(str);
                }
            }, 6, (Object) null);
        } else {
            g6Var = this;
        }
        g6Var.f25474c.b();
        C0 c02 = g6Var.f25478g;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        BrazeCoroutineScope brazeCoroutineScope = BrazeCoroutineScope.INSTANCE;
        long j10 = x5Var.f26248a;
        x7 x7Var = g6Var.f25475d;
        g6Var.f25478g = BrazeCoroutineScope.launchDelayed$default(brazeCoroutineScope, Long.valueOf(j10 + x7Var.a(x7Var.f26261b)), null, new b6(this, null), 2, null);
    }

    public static final String b(Integer num) {
        return "Not scheduling dust reconnect for non-retriable response code: " + num;
    }

    public final void a(p6 p6Var) {
        if (p6Var == null) {
            return;
        }
        String str = p6Var.f25904b;
        if (str != null) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.e2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g6.c();
                }
            }, 7, (Object) null);
            this.f25476e.writeData(DataStoreKey.DUST_RCS, str);
        }
        Long l10 = p6Var.f25903a;
        if (l10 != null) {
            final long longValue = l10.longValue();
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.f2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g6.a(longValue);
                }
            }, 7, (Object) null);
            b(longValue);
        }
    }

    public static final void a(g6 g6Var, af it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.m2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.d();
            }
        }, 7, (Object) null);
        C0 c02 = g6Var.f25477f;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        g6Var.a(true);
    }

    public static final void a(g6 g6Var, cf it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.j2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.e();
            }
        }, 7, (Object) null);
        g6Var.f25477f = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Long.valueOf(f25471i), null, new z5(g6Var, null), 2, null);
    }

    public static final void a(g6 g6Var, final db it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.n2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.a(bo.app.db.this);
            }
        }, 7, (Object) null);
        cb cbVar = it.f25396b;
        cb cbVar2 = cb.f25351a;
        if (cbVar == cbVar2) {
            g6Var.a();
        } else if (it.f25395a == cbVar2) {
            g6Var.a(true);
        }
    }

    public static final String a(db dbVar) {
        return "Got network change event: " + dbVar;
    }

    public static final void a(g6 g6Var, final u5 it) {
        Intrinsics.checkNotNullParameter(it, "it");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.k2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.f();
            }
        }, 7, (Object) null);
        C2990d c2990d = g6Var.f25476e;
        DataStoreKey dataStoreKey = DataStoreKey.MITE_KEY;
        String readString = c2990d.readString(dataStoreKey, "");
        if (readString == null || readString.length() == 0) {
            readString = null;
        }
        BrazeLogger.brazelog$default(brazeLogger, (Object) g6Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.l2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.a(bo.app.u5.this);
            }
        }, 7, (Object) null);
        String str = it.f26105a;
        if (str != null) {
            g6Var.f25476e.writeData(dataStoreKey, str);
        }
        String str2 = it.f26106b;
        if (str2 != null) {
            g6Var.f25476e.writeData(DataStoreKey.DUST_HOST, str2);
        }
        String str3 = it.f26107c;
        if (str3 != null) {
            g6Var.f25476e.writeData(DataStoreKey.DUST_AUTH, str3);
        }
        g6Var.a(Intrinsics.areEqual(readString, it.f26105a));
    }

    public final void a(final boolean z10) {
        C0 c02 = this.f25478g;
        String str = null;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        if (this.f25479h > 10) {
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.T1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g6.i();
                }
            }, 7, (Object) null);
            return;
        }
        final String readString = this.f25476e.readString(DataStoreKey.MITE_KEY, "");
        if (readString == null || readString.length() == 0) {
            readString = null;
        }
        final String readString2 = this.f25476e.readString(DataStoreKey.DUST_HOST, "");
        if (readString2 == null || readString2.length() == 0) {
            readString2 = null;
        }
        final String readString3 = this.f25476e.readString(DataStoreKey.DUST_AUTH, "");
        if (readString3 == null || readString3.length() == 0) {
            readString3 = null;
        }
        String readString4 = this.f25476e.readString(DataStoreKey.DUST_RCS, "");
        if (readString4 != null && readString4.length() != 0) {
            str = readString4;
        }
        if (readString != null && readString2 != null && readString3 != null && this.f25472a.G()) {
            final String a10 = a6.a(readString2, readString, readString3, str, this.f25479h);
            BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.U1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g6.a(z10, readString, a10);
                }
            }, 7, (Object) null);
            this.f25474c.a(a10, new d6(this), new e6(this), new f6(this), z10);
            return;
        }
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.V1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.a(readString, readString2, readString3, this);
            }
        }, 7, (Object) null);
    }

    public static final String a(String str, String str2, String str3, g6 g6Var) {
        return "Cannot start dust subscription: mite=" + str + ", host=" + str2 + ", auth=" + (str3 != null) + ", enabled=" + g6Var.f25472a.G();
    }

    public static final String a(boolean z10, String str, String str2) {
        return "Starting (resume = " + z10 + ") DUST subscription for mite: " + str + " to url: " + str2;
    }

    public final void a() {
        BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.i2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.b();
            }
        }, 7, (Object) null);
        C0 c02 = this.f25478g;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.f25478g = null;
        this.f25474c.b();
    }

    public final void a(final k9 dm) {
        Intrinsics.checkNotNullParameter(dm, "dm");
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.W1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.b(bo.app.k9.this);
            }
        }, 7, (Object) null);
        final j9 a10 = dm.a();
        int ordinal = a10.ordinal();
        if (ordinal == 1) {
            r7 r7Var = this.f25473b;
            j2 j2Var = j2.f25585b;
            r7Var.b(new p3(), p3.class);
            return;
        }
        if (ordinal == 2) {
            a(dm instanceof p6 ? (p6) dm : null);
            return;
        }
        if (ordinal == 3) {
            a(dm instanceof x5 ? (x5) dm : null);
        } else {
            if (ordinal != 4) {
                BrazeLogger.brazelog$default(brazeLogger, (Object) this, BrazeLogger.Priority.f29473W, (Throwable) null, false, new Function0() { // from class: c3.X1
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.g6.a(bo.app.j9.this);
                    }
                }, 6, (Object) null);
                return;
            }
            r7 r7Var2 = this.f25473b;
            j2 j2Var2 = j2.f25585b;
            r7Var2.b(new a8(), a8.class);
        }
    }

    public static final String a(j9 j9Var) {
        return "Lacked logic to ingest message! Type: " + j9Var;
    }

    public static final String a(long j10) {
        return "Scheduling reconnection in " + j10 + "ms";
    }

    public static final String a(String str) {
        return "Received disconnect and retry request. Reason: " + str;
    }

    public final void a(final Integer num) {
        this.f25479h++;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.Z1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.g6.a(bo.app.g6.this, num);
            }
        }, 7, (Object) null);
        C0 c02 = this.f25478g;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        IntRange intRange = o6.f25856g;
        if (num != null && intRange.contains(num.intValue())) {
            x7 x7Var = this.f25475d;
            b(x7Var.a(x7Var.f26261b));
        } else {
            IntRange intRange2 = o6.f25855f;
            if (num != null) {
                intRange2.contains(num.intValue());
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.a2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.g6.b(num);
                }
            }, 7, (Object) null);
        }
    }

    public static final String a(g6 g6Var, Integer num) {
        return "Connection attempt failed. Attempts now at: " + g6Var.f25479h + ". Response code: " + num;
    }
}
