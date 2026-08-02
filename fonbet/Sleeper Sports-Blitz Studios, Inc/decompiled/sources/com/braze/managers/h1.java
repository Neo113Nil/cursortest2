package com.braze.managers;

import android.content.Context;
import com.braze.Constants;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.storage.b3;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.Job;

/* loaded from: classes6.dex */
public final class h1 {
    public static final c1 k = new c1();

    /* renamed from: a, reason: collision with root package name */
    public final b3 f587a;
    public final com.braze.events.d b;
    public d1 c;
    public long d;
    public int e;
    public final ArrayList f;
    public int g;
    public final ReentrantLock h;
    public Job i;
    public final AtomicInteger j;

    public h1(b3 serverConfigStorageProvider, com.braze.events.d internalPublisher, Context context) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f587a = serverConfigStorageProvider;
        this.b = internalPublisher;
        this.c = new d1();
        this.d = DateTimeUtils.nowInSeconds();
        this.f = new ArrayList();
        this.h = new ReentrantLock();
        this.j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        internalPublisher.c(com.braze.events.internal.q.class, new IEventSubscriber() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda7
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                h1.a(h1.this, (com.braze.events.internal.q) obj);
            }
        });
        internalPublisher.c(com.braze.events.internal.t.class, new IEventSubscriber() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda8
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                h1.a(h1.this, (com.braze.events.internal.t) obj);
            }
        });
    }

    public static final void a(h1 h1Var, com.braze.events.internal.q it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f533a instanceof com.braze.requests.x) {
            h1Var.j.decrementAndGet();
            BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new b1(h1Var, null), 3, null);
        }
    }

    public static final String b() {
        return "Shutting down SDK Debugger due to being past expiration time";
    }

    public static final String d() {
        return "Initializing SDK Debugger";
    }

    public static final String e() {
        return "SDK Debugger transitioned from disabled to enabled. Initializing SDK Debugger.";
    }

    public static final String f() {
        return "SDK Debugger transitioned from enabled to disabled. Shutting down SDK Debugger.";
    }

    public static final String h() {
        return "Debugging session has expired. Disabling SDK Debugger.";
    }

    public static final String j() {
        return "Shutting down SDK Debugger";
    }

    public final void c() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda6
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1.d();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new f1(this));
        this.b.b(new com.braze.events.internal.u(), com.braze.events.internal.u.class);
    }

    public final boolean g() {
        h1 h1Var;
        this.c.f580a = this.f587a.M();
        d1 d1Var = this.c;
        if (d1Var.f580a) {
            d1Var.c = this.f587a.y();
            this.c.d = this.f587a.A();
            this.c.e = this.f587a.B();
            this.c.f = this.f587a.C();
            this.c.b = Long.valueOf(this.f587a.z());
        }
        Long l = this.c.b;
        if (l != null) {
            if (DateTimeUtils.nowInSeconds() > l.longValue()) {
                h1Var = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return h1.h();
                    }
                }, 7, (Object) null);
                h1Var.c = new d1();
                return h1Var.c.f580a;
            }
        }
        h1Var = this;
        return h1Var.c.f580a;
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda1
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1.j();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.c = new d1();
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.f.clear();
            this.g = 0;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final void a(h1 h1Var, final com.braze.events.internal.t newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        final d1 d1Var = h1Var.c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1.a(com.braze.events.internal.t.this, d1Var);
            }
        }, 7, (Object) null);
        if (newConfig.f535a.b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda2
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h1.a(d1.this);
                }
            }, 7, (Object) null);
            newConfig.f535a.b = d1Var.b;
        }
        d1 d1Var2 = newConfig.f535a;
        if (d1Var2.c == null) {
            d1Var2.c = d1Var.c;
        }
        h1Var.c = d1Var2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return h1.a(com.braze.events.internal.t.this);
            }
        }, 6, (Object) null);
        h1Var.f587a.a(newConfig.f535a);
        boolean z = d1Var.f580a;
        if (!z && h1Var.c.f580a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda4
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h1.e();
                }
            }, 6, (Object) null);
            h1Var.c();
        } else {
            if (!z || h1Var.c.f580a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) h1Var, priority, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda5
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return h1.f();
                }
            }, 6, (Object) null);
            h1Var.i();
        }
    }

    public static final String a(com.braze.events.internal.t tVar, d1 d1Var) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + tVar.a() + ".\nOld config " + d1Var;
    }

    public static final String a(d1 d1Var) {
        return "updating expiration time to " + d1Var.b();
    }

    public static final String a(com.braze.events.internal.t tVar) {
        return "Updating SDK Debugger config with " + tVar.a();
    }

    public final void a(String tag, BrazeLogger.Priority priority, String message, Throwable th) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.c.f() || StringsKt.contains$default((CharSequence) message, (CharSequence) Constants.LOG_TAG_PREFIX, false, 2, (Object) null)) {
            return;
        }
        String str = "";
        Object obj = th;
        if (th == null) {
            obj = "";
        }
        for (String str2 : StringsKt.split$default((CharSequence) (priority + " " + tag + ": " + message + " " + obj), new String[]{"\n"}, false, 0, 6, (Object) null)) {
            if (str2.length() + str.length() > this.c.e()) {
                a(priority + ": " + ((Object) str));
                str = str2;
            } else {
                str = ((Object) str) + "\n" + str2;
            }
        }
        if (str.length() > 0) {
            a(str);
        }
        BuildersKt__Builders_commonKt.launch$default(BrazeCoroutineScope.INSTANCE, null, null, new g1(this, null), 3, null);
    }

    public final void a(String str) {
        com.braze.models.o oVar = new com.braze.models.o(str);
        ReentrantLock reentrantLock = this.h;
        reentrantLock.lock();
        try {
            this.f.add(oVar);
            int length = this.g + oVar.f638a.length();
            this.g = length;
            if (length > 1048576) {
                while (this.g > 838860) {
                    this.g -= ((com.braze.models.o) this.f.remove(0)).f638a.length();
                    this.e++;
                }
            }
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final Unit a() {
        Long b;
        if (this.c.f() && this.c.a() != null && this.c.b() != null && (((b = this.c.b()) == null || b.longValue() != 0) && this.j.get() <= 0)) {
            Long b2 = this.c.b();
            if (b2 != null) {
                if (DateTimeUtils.nowInSeconds() > b2.longValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: com.braze.managers.h1$$ExternalSyntheticLambda9
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return h1.b();
                        }
                    }, 7, (Object) null);
                    i();
                    return Unit.INSTANCE;
                }
            }
            if (DateTimeUtils.nowInSeconds() <= this.c.d() + this.d && this.g <= this.c.c()) {
                if (this.i == null) {
                    this.i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Boxing.boxLong(TimeUnit.SECONDS.toMillis((this.c.d() + this.d) - DateTimeUtils.nowInSeconds())), null, new e1(this, null), 2, null);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                ReentrantLock reentrantLock = this.h;
                reentrantLock.lock();
                try {
                    Iterator it = this.f.iterator();
                    int i = 0;
                    int i2 = 0;
                    while (it.hasNext()) {
                        com.braze.models.o oVar = (com.braze.models.o) it.next();
                        int i3 = this.e;
                        if (i3 != 0) {
                            String str = "Removed " + i3 + " logs due to buffer overflow";
                            arrayList.add(new com.braze.models.o(str));
                            this.e = 0;
                            i2 += str.length();
                        }
                        int length = oVar.c().length() + i2;
                        if (length <= this.c.e()) {
                            arrayList.add(oVar);
                            i2 = length;
                        }
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        this.f.remove((com.braze.models.o) it2.next());
                    }
                    Iterator it3 = this.f.iterator();
                    while (it3.hasNext()) {
                        i += ((com.braze.models.o) it3.next()).c().length();
                    }
                    this.g = i;
                    this.d = DateTimeUtils.nowInSeconds();
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    Job job = this.i;
                    if (job != null) {
                        Job.DefaultImpls.cancel$default(job, (CancellationException) null, 1, (Object) null);
                    }
                    this.i = null;
                    if (!arrayList.isEmpty()) {
                        this.j.incrementAndGet();
                        this.b.b(new com.braze.events.internal.v(arrayList), com.braze.events.internal.v.class);
                    }
                } catch (Throwable th) {
                    reentrantLock.unlock();
                    throw th;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
