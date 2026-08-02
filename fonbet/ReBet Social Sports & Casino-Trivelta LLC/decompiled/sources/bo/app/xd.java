package bo.app;

import Ph.AbstractC1459k;
import Ph.C0;
import android.content.Context;
import com.braze.coroutine.BrazeCoroutineScope;
import com.braze.events.IEventSubscriber;
import com.braze.support.BrazeLogger;
import com.braze.support.DateTimeUtils;
import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* loaded from: classes.dex */
public final class xd {

    /* renamed from: k, reason: collision with root package name */
    public static final sd f26273k = new sd();

    /* renamed from: a, reason: collision with root package name */
    public final ue f26274a;

    /* renamed from: b, reason: collision with root package name */
    public final r7 f26275b;

    /* renamed from: c, reason: collision with root package name */
    public td f26276c;

    /* renamed from: d, reason: collision with root package name */
    public long f26277d;

    /* renamed from: e, reason: collision with root package name */
    public int f26278e;

    /* renamed from: f, reason: collision with root package name */
    public final ArrayList f26279f;

    /* renamed from: g, reason: collision with root package name */
    public int f26280g;

    /* renamed from: h, reason: collision with root package name */
    public final ReentrantLock f26281h;

    /* renamed from: i, reason: collision with root package name */
    public C0 f26282i;

    /* renamed from: j, reason: collision with root package name */
    public final AtomicInteger f26283j;

    public xd(ue serverConfigStorageProvider, r7 internalPublisher, Context context) {
        Intrinsics.checkNotNullParameter(serverConfigStorageProvider, "serverConfigStorageProvider");
        Intrinsics.checkNotNullParameter(internalPublisher, "internalPublisher");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f26274a = serverConfigStorageProvider;
        this.f26275b = internalPublisher;
        this.f26276c = new td();
        this.f26277d = DateTimeUtils.nowInSeconds();
        this.f26279f = new ArrayList();
        this.f26281h = new ReentrantLock();
        this.f26283j = new AtomicInteger(0);
        if (g()) {
            c();
        }
        internalPublisher.c(zc.class, new IEventSubscriber() { // from class: c3.pc
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.xd.a(bo.app.xd.this, (bo.app.zc) obj);
            }
        });
        internalPublisher.c(yd.class, new IEventSubscriber() { // from class: c3.rc
            @Override // com.braze.events.IEventSubscriber
            public final void trigger(Object obj) {
                bo.app.xd.a(bo.app.xd.this, (bo.app.yd) obj);
            }
        });
    }

    public static final String a(yd ydVar, td tdVar) {
        return "Received SdkDebuggerConfigUpdateEvent. Updating SDK Debugger config with " + ydVar.f26325a + ".\nOld config " + tdVar;
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
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.tc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.xd.d();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(new vd(this));
        this.f26275b.b(new be(), be.class);
    }

    public final boolean g() {
        xd xdVar;
        this.f26276c.f26084a = this.f26274a.N();
        td tdVar = this.f26276c;
        if (tdVar.f26084a) {
            tdVar.f26086c = this.f26274a.z();
            this.f26276c.f26087d = this.f26274a.B();
            this.f26276c.f26088e = this.f26274a.C();
            this.f26276c.f26089f = this.f26274a.D();
            this.f26276c.f26085b = Long.valueOf(this.f26274a.A());
        }
        Long l10 = this.f26276c.f26085b;
        if (l10 != null) {
            if (DateTimeUtils.nowInSeconds() > l10.longValue()) {
                xdVar = this;
                BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) xdVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.sc
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return bo.app.xd.h();
                    }
                }, 7, (Object) null);
                xdVar.f26276c = new td();
                return xdVar.f26276c.f26084a;
            }
        }
        xdVar = this;
        return xdVar.f26276c.f26084a;
    }

    public final void i() {
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.qc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.xd.j();
            }
        }, 7, (Object) null);
        brazeLogger.setSdkDebuggerCallback$android_sdk_base_release(null);
        this.f26276c = new td();
        ReentrantLock reentrantLock = this.f26281h;
        reentrantLock.lock();
        try {
            this.f26279f.clear();
            this.f26280g = 0;
            Unit unit = Unit.INSTANCE;
        } finally {
            reentrantLock.unlock();
        }
    }

    public static final String a(yd ydVar) {
        return "Updating SDK Debugger config with " + ydVar.f26325a;
    }

    public static final void a(xd xdVar, zc it) {
        Intrinsics.checkNotNullParameter(it, "it");
        if (it.f26356a instanceof ee) {
            xdVar.f26283j.decrementAndGet();
            AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new rd(xdVar, null), 3, null);
        }
    }

    public static final String a(td tdVar) {
        return "updating expiration time to " + tdVar.f26085b;
    }

    public static final void a(xd xdVar, final yd newConfig) {
        Intrinsics.checkNotNullParameter(newConfig, "newConfig");
        final td tdVar = xdVar.f26276c;
        BrazeLogger brazeLogger = BrazeLogger.INSTANCE;
        BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.uc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.xd.a(bo.app.yd.this, tdVar);
            }
        }, 7, (Object) null);
        if (newConfig.f26325a.f26085b == null) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.vc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.xd.a(bo.app.td.this);
                }
            }, 7, (Object) null);
            newConfig.f26325a.f26085b = tdVar.f26085b;
        }
        td tdVar2 = newConfig.f26325a;
        if (tdVar2.f26086c == null) {
            tdVar2.f26086c = tdVar.f26086c;
        }
        xdVar.f26276c = tdVar2;
        BrazeLogger.Priority priority = BrazeLogger.Priority.f29472V;
        BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, priority, (Throwable) null, false, new Function0() { // from class: c3.wc
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return bo.app.xd.a(bo.app.yd.this);
            }
        }, 6, (Object) null);
        xdVar.f26274a.a(newConfig.f26325a);
        boolean z10 = tdVar.f26084a;
        if (!z10 && xdVar.f26276c.f26084a) {
            BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, priority, (Throwable) null, false, new Function0() { // from class: c3.xc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.xd.e();
                }
            }, 6, (Object) null);
            xdVar.c();
        } else {
            if (!z10 || xdVar.f26276c.f26084a) {
                return;
            }
            BrazeLogger.brazelog$default(brazeLogger, (Object) xdVar, priority, (Throwable) null, false, new Function0() { // from class: c3.yc
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return bo.app.xd.f();
                }
            }, 6, (Object) null);
            xdVar.i();
        }
    }

    public final void a(String tag, BrazeLogger.Priority priority, String message, Throwable th2) {
        Intrinsics.checkNotNullParameter(tag, "tag");
        Intrinsics.checkNotNullParameter(priority, "priority");
        Intrinsics.checkNotNullParameter(message, "message");
        if (!this.f26276c.f26084a || StringsKt.contains$default((CharSequence) message, (CharSequence) "Braze v42.2.0 .", false, 2, (Object) null)) {
            return;
        }
        String str = "";
        Object obj = th2;
        if (th2 == null) {
            obj = "";
        }
        for (String str2 : StringsKt.split$default((CharSequence) (priority + " " + tag + ": " + message + " " + obj), new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null)) {
            if (str2.length() + str.length() > this.f26276c.f26089f) {
                a(priority + ": " + ((Object) str));
                str = str2;
            } else {
                str = ((Object) str) + ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE + str2;
            }
        }
        if (str.length() > 0) {
            a(str);
        }
        AbstractC1459k.d(BrazeCoroutineScope.INSTANCE, null, null, new wd(this, null), 3, null);
    }

    public final void a(String str) {
        de deVar = new de(str);
        ReentrantLock reentrantLock = this.f26281h;
        reentrantLock.lock();
        try {
            this.f26279f.add(deVar);
            int length = this.f26280g + deVar.f25397a.length();
            this.f26280g = length;
            if (length > 1048576) {
                while (this.f26280g > 838860) {
                    this.f26280g -= ((de) this.f26279f.remove(0)).f25397a.length();
                    this.f26278e++;
                }
            }
            Unit unit = Unit.INSTANCE;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final Unit a() {
        Long l10;
        td tdVar = this.f26276c;
        if (tdVar.f26084a && tdVar.f26086c != null && (l10 = tdVar.f26085b) != null && l10.longValue() != 0 && this.f26283j.get() <= 0) {
            Long l11 = this.f26276c.f26085b;
            if (l11 != null) {
                if (DateTimeUtils.nowInSeconds() > l11.longValue()) {
                    BrazeLogger.brazelog$default(BrazeLogger.INSTANCE, (Object) this, (BrazeLogger.Priority) null, (Throwable) null, false, new Function0() { // from class: c3.zc
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return bo.app.xd.b();
                        }
                    }, 7, (Object) null);
                    i();
                    return Unit.INSTANCE;
                }
            }
            long nowInSeconds = DateTimeUtils.nowInSeconds();
            long j10 = this.f26277d;
            td tdVar2 = this.f26276c;
            long j11 = j10 + tdVar2.f26088e;
            if (nowInSeconds <= j11 && this.f26280g <= tdVar2.f26087d) {
                if (this.f26282i == null) {
                    this.f26282i = BrazeCoroutineScope.launchDelayed$default(BrazeCoroutineScope.INSTANCE, Boxing.boxLong(TimeUnit.SECONDS.toMillis(j11 - DateTimeUtils.nowInSeconds())), null, new ud(this, null), 2, null);
                }
            } else {
                ArrayList arrayList = new ArrayList();
                ReentrantLock reentrantLock = this.f26281h;
                reentrantLock.lock();
                try {
                    ArrayList arrayList2 = this.f26279f;
                    int size = arrayList2.size();
                    int i10 = 0;
                    int i11 = 0;
                    int i12 = 0;
                    while (i11 < size) {
                        Object obj = arrayList2.get(i11);
                        i11++;
                        de deVar = (de) obj;
                        int i13 = this.f26278e;
                        if (i13 != 0) {
                            String str = "Removed " + i13 + " logs due to buffer overflow";
                            arrayList.add(new de(str));
                            this.f26278e = 0;
                            i12 += str.length();
                        }
                        int length = deVar.f25397a.length() + i12;
                        if (length <= this.f26276c.f26089f) {
                            arrayList.add(deVar);
                            i12 = length;
                        }
                    }
                    int size2 = arrayList.size();
                    int i14 = 0;
                    while (i14 < size2) {
                        Object obj2 = arrayList.get(i14);
                        i14++;
                        this.f26279f.remove((de) obj2);
                    }
                    ArrayList arrayList3 = this.f26279f;
                    int size3 = arrayList3.size();
                    int i15 = 0;
                    while (i10 < size3) {
                        Object obj3 = arrayList3.get(i10);
                        i10++;
                        i15 += ((de) obj3).f25397a.length();
                    }
                    this.f26280g = i15;
                    this.f26277d = DateTimeUtils.nowInSeconds();
                    Unit unit = Unit.INSTANCE;
                    reentrantLock.unlock();
                    C0 c02 = this.f26282i;
                    if (c02 != null) {
                        C0.a.b(c02, null, 1, null);
                    }
                    this.f26282i = null;
                    if (!arrayList.isEmpty()) {
                        this.f26283j.incrementAndGet();
                        this.f26275b.b(new fe(arrayList), fe.class);
                    }
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            return Unit.INSTANCE;
        }
        return Unit.INSTANCE;
    }
}
