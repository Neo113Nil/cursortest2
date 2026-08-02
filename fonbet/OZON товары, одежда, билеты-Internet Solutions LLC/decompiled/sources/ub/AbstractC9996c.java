package ub;

import Sc.InterfaceC4008j;
import Sc.r;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import android.os.SystemClock;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ub.AbstractC10010q;
import xe.d1;
import xe.f1;

/* renamed from: ub.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC9996c<T extends IInterface> {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Context f100447a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final List<Za.a> f100448b;

    /* renamed from: c, reason: collision with root package name */
    private final long f100449c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<AbstractC9996c<T>, Unit> f100450d;

    /* renamed from: e, reason: collision with root package name */
    private final kotlin.coroutines.jvm.internal.j f100451e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100452f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j f100453g;

    /* renamed from: h, reason: collision with root package name */
    private volatile a<T> f100454h;

    /* renamed from: i, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f100455i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final ExecutorService f100456j;

    /* renamed from: k, reason: collision with root package name */
    private final Set<AbstractC10010q<T, ?>> f100457k;

    /* renamed from: l, reason: collision with root package name */
    @NotNull
    private final ServiceConnectionC9997d f100458l;

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: ub.c$a */
    /* loaded from: classes9.dex */
    static final class a<T> {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final Za.a f100459a;

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final ComponentName f100460b;

        /* renamed from: c, reason: collision with root package name */
        private final IInterface f100461c;

        public a(@NotNull Za.a host, @NotNull ComponentName componentName, IInterface iInterface) {
            Intrinsics.checkNotNullParameter(host, "host");
            Intrinsics.checkNotNullParameter(componentName, "componentName");
            this.f100459a = host;
            this.f100460b = componentName;
            this.f100461c = iInterface;
        }

        @NotNull
        public final ComponentName a() {
            return this.f100460b;
        }

        @NotNull
        public final Za.a b() {
            return this.f100459a;
        }

        public final T c() {
            return (T) this.f100461c;
        }
    }

    public AbstractC9996c() {
        throw null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AbstractC9996c(Za.d logger, Context context, List preferredHosts, Function1 function1) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(preferredHosts, "preferredHosts");
        C9995b onCloseConnection = C9995b.f100446b;
        Intrinsics.checkNotNullParameter(onCloseConnection, "onCloseConnection");
        Intrinsics.checkNotNullParameter(logger, "logger");
        this.f100447a = context;
        this.f100448b = preferredHosts;
        this.f100449c = 10000L;
        this.f100450d = onCloseConnection;
        this.f100451e = (kotlin.coroutines.jvm.internal.j) function1;
        if (preferredHosts.isEmpty()) {
            throw new IllegalArgumentException("Preferred hosts must not be empty");
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : preferredHosts) {
            if (hashSet.add(((Za.a) obj).a())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.f100448b.size()) {
            throw new IllegalArgumentException("Found duplicate package names in preferred hosts");
        }
        if (this.f100449c < 0) {
            throw new IllegalArgumentException("closeConnectionTimeoutMillis must be >= 0");
        }
        this.f100452f = Sc.k.b(new C10004k(logger, this));
        this.f100453g = Sc.k.b(new C10000g(this));
        this.f100455i = new AtomicBoolean(false);
        ExecutorService unconfigurableExecutorService = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        Intrinsics.checkNotNullExpressionValue(unconfigurableExecutorService, "unconfigurableExecutorService(threadPool)");
        this.f100456j = unconfigurableExecutorService;
        this.f100457k = Collections.synchronizedSet(new LinkedHashSet());
        this.f100458l = new ServiceConnectionC9997d(logger, this);
    }

    public static void d(AbstractC9996c this$0, a service) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(service, "$service");
        this$0.s().info("Sleeping 1000 ms before next bind attempt");
        SystemClock.sleep(1000L);
        boolean m11 = this$0.m(service.b(), service.a());
        this$0.s().info("bindService to " + service.b().a() + " result: " + m11);
        if (m11) {
            return;
        }
        this$0.s().b("Failed to bind again. Giving up.", null);
        C10003j c10003j = new C10003j(this$0);
        Set<AbstractC10010q<T, ?>> runningRequests = this$0.f100457k;
        Intrinsics.checkNotNullExpressionValue(runningRequests, "runningRequests");
        if (runningRequests.isEmpty()) {
            return;
        }
        this$0.f100456j.submit(new Dx.b(this$0, c10003j));
    }

    public static void e(AbstractC9996c this$0, Function1 action) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        Intrinsics.checkNotNullParameter(action, "$action");
        Set<AbstractC10010q<T, ?>> runningRequests = this$0.f100457k;
        Intrinsics.checkNotNullExpressionValue(runningRequests, "runningRequests");
        synchronized (runningRequests) {
            try {
                Set<AbstractC10010q<T, ?>> runningRequests2 = this$0.f100457k;
                Intrinsics.checkNotNullExpressionValue(runningRequests2, "runningRequests");
                Iterator<T> it = runningRequests2.iterator();
                while (it.hasNext()) {
                    action.invoke(it.next());
                }
                this$0.f100457k.clear();
                Unit unit = Unit.f71690a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public static final void f(AbstractC9996c abstractC9996c, AbstractC10010q.a aVar, Function1 function1) {
        a<T> aVar2 = abstractC9996c.f100454h;
        T c11 = aVar2 != null ? aVar2.c() : null;
        a<T> aVar3 = abstractC9996c.f100454h;
        Za.a b11 = aVar3 != null ? aVar3.b() : null;
        if (c11 != null && b11 != null) {
            try {
                abstractC9996c.f100457k.add(aVar);
                aVar.a(c11, b11, new C10001h(abstractC9996c));
                return;
            } catch (RemoteException e11) {
                abstractC9996c.s().b("RemoteException while executing request", e11);
                return;
            }
        }
        for (Za.a aVar4 : abstractC9996c.f100448b) {
            try {
                ComponentName componentName = (ComponentName) function1.invoke(aVar4.a());
                if (componentName == null) {
                    abstractC9996c.s().b("Component name from host " + aVar4.a() + " is null", null);
                } else if (abstractC9996c.n(aVar4, componentName, aVar)) {
                    return;
                }
            } catch (SecurityException e12) {
                abstractC9996c.s().error("No permission to bind to " + aVar4.a(), e12);
            } catch (Exception e13) {
                abstractC9996c.s().error("Unable to bind service", e13);
            }
        }
        abstractC9996c.s().error("No available hosts found. Binding has failed, giving up.", null);
        aVar.d(new RemoteExceptionC10012s());
    }

    public static final void h(final AbstractC9996c abstractC9996c, ComponentName componentName) {
        abstractC9996c.s().b("Binding to " + componentName.getPackageName() + " has died", null);
        abstractC9996c.w();
        final a<T> aVar = abstractC9996c.f100454h;
        if (aVar != null) {
            abstractC9996c.f100456j.submit(new Runnable() { // from class: ub.a
                @Override // java.lang.Runnable
                public final void run() {
                    AbstractC9996c.d(AbstractC9996c.this, aVar);
                }
            });
        }
    }

    public static final void i(AbstractC9996c abstractC9996c, ComponentName componentName, IBinder iBinder) {
        Object obj;
        abstractC9996c.s().info("On service connected! Remote host package name = " + componentName.getPackageName());
        Iterator<T> it = abstractC9996c.f100448b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (kotlin.text.h.D(((Za.a) obj).a(), componentName.getPackageName(), true)) {
                    break;
                }
            }
        }
        Za.a aVar = (Za.a) obj;
        if (aVar == null) {
            abstractC9996c.s().error("onServiceConnected: host is null", null);
            return;
        }
        IInterface o11 = abstractC9996c.o(iBinder);
        abstractC9996c.f100454h = new a<>(aVar, componentName, o11);
        abstractC9996c.s().info("Service connection to " + componentName.getPackageName() + " has been established");
        C10002i c10002i = new C10002i(abstractC9996c, o11, aVar);
        Set<AbstractC10010q<T, ?>> runningRequests = abstractC9996c.f100457k;
        Intrinsics.checkNotNullExpressionValue(runningRequests, "runningRequests");
        if (runningRequests.isEmpty()) {
            return;
        }
        abstractC9996c.f100456j.submit(new Dx.b(abstractC9996c, c10002i));
    }

    public static final void j(AbstractC9996c abstractC9996c, ComponentName componentName) {
        abstractC9996c.s().info("Service has been disconnected, host: " + componentName.getPackageName());
        a<T> aVar = abstractC9996c.f100454h;
        abstractC9996c.f100454h = aVar != null ? new a<>(aVar.b(), aVar.a(), null) : null;
    }

    private final boolean m(Za.a aVar, ComponentName componentName) throws SecurityException {
        boolean f7;
        String a11 = aVar.a();
        Context context = this.f100447a;
        if (Intrinsics.d(a11, context.getPackageName())) {
            f7 = true;
        } else {
            f7 = Eb.h.f(context, aVar.b(), aVar.a());
            if (!f7) {
                s().error("Signature validation for " + aVar.a() + " has failed", null);
            }
        }
        if (!f7) {
            return false;
        }
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return context.bindService(intent, this.f100458l, 1);
    }

    private final boolean n(Za.a aVar, ComponentName componentName, AbstractC10010q.a aVar2) {
        if (!m(aVar, componentName)) {
            s().info("Unable to bind to " + aVar.a() + ", trying next host");
            return false;
        }
        s().info("bindService to " + aVar.a() + " via " + aVar2.e() + " function returns true, waiting for connection establishment");
        this.f100457k.add(aVar2);
        a<T> aVar3 = this.f100454h;
        T c11 = aVar3 != null ? aVar3.c() : null;
        if (c11 == null) {
            this.f100454h = new a<>(aVar, componentName, null);
            return true;
        }
        s().info("bindService to " + aVar.a() + " via " + aVar2.e() + ", remoteService already exists");
        C10002i c10002i = new C10002i(this, c11, aVar);
        Set<AbstractC10010q<T, ?>> runningRequests = this.f100457k;
        Intrinsics.checkNotNullExpressionValue(runningRequests, "runningRequests");
        if (runningRequests.isEmpty()) {
            return true;
        }
        this.f100456j.submit(new Dx.b(this, c10002i));
        return true;
    }

    private final void p() {
        C10009p.c((C10009p) this.f100453g.getValue(), this.f100449c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        Object w11 = w();
        a<T> aVar = this.f100454h;
        this.f100454h = aVar != null ? new a<>(aVar.b(), aVar.a(), null) : null;
        Za.d s11 = s();
        StringBuilder sb2 = new StringBuilder("Service connection is released success = ");
        r.Companion companion = Sc.r.INSTANCE;
        boolean z11 = !(w11 instanceof r.b);
        sb2.append(z11);
        s11.info(sb2.toString());
        this.f100450d.invoke(this);
        return z11;
    }

    private final Object w() {
        try {
            r.Companion companion = Sc.r.INSTANCE;
            if (this.f100455i.compareAndSet(true, false)) {
                s().info("Unbind service");
                this.f100447a.unbindService(this.f100458l);
            } else {
                s().info("Unbind service skipped");
            }
            return Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = Sc.r.INSTANCE;
            return Sc.s.a(th2);
        }
    }

    @NotNull
    public List<Za.a> a() {
        return this.f100448b;
    }

    @NotNull
    protected abstract T o(@NotNull IBinder iBinder);

    @NotNull
    protected final Context q() {
        return this.f100447a;
    }

    @NotNull
    protected abstract String r();

    @NotNull
    protected final Za.d s() {
        return (Za.d) this.f100452f.getValue();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0026  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0097 A[Catch: all -> 0x004d, TryCatch #9 {all -> 0x004d, blocks: (B:16:0x00ad, B:29:0x0049, B:36:0x0093, B:38:0x0097, B:47:0x00b9, B:44:0x00ce), top: B:8:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:48:0x005c  */
    /* JADX WARN: Type inference failed for: r0v21, types: [kotlin.coroutines.jvm.internal.j, kotlin.jvm.functions.Function1] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(@NotNull Function2 function2, @NotNull String str, @NotNull Function2 function22, @NotNull Function1 function1, @NotNull Function1 function12, long j11, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C10005l c10005l;
        AbstractC9996c<T> abstractC9996c;
        int i11;
        Function1 function13;
        AbstractC9996c<T> abstractC9996c2;
        Object invoke;
        RemoteExceptionC10012s remoteExceptionC10012s;
        ?? r02;
        AbstractC9996c<T> abstractC9996c3;
        Function1 function14;
        int i12;
        try {
            if (cVar instanceof C10005l) {
                c10005l = (C10005l) cVar;
                i12 = c10005l.f100479i;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    int i13 = i12 - LinearLayoutManager.INVALID_OFFSET;
                    c10005l.f100479i = i13;
                    abstractC9996c = i13;
                    C10005l c10005l2 = c10005l;
                    Object obj = c10005l2.f100477g;
                    Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                    i11 = c10005l2.f100479i;
                    if (i11 != 0) {
                        Sc.s.b(obj);
                        try {
                            try {
                                function13 = function1;
                                try {
                                    C10006m c10006m = new C10006m(this, function2, str, function22, function13, function12, null);
                                    c10005l2.f100474d = this;
                                    function13 = function1;
                                    c10005l2.f100475e = function13;
                                    c10005l2.f100479i = 1;
                                    obj = f1.b(j11, c10006m, c10005l2);
                                    if (obj != aVar) {
                                        abstractC9996c2 = this;
                                    }
                                } catch (CancellationException e11) {
                                    e = e11;
                                    abstractC9996c2 = this;
                                    abstractC9996c2.s().b("AIDL request was cancelled. Release connection immediately", e);
                                    abstractC9996c2.v();
                                    invoke = function13.invoke(e);
                                    abstractC9996c2.p();
                                    return invoke;
                                } catch (RemoteExceptionC10012s e12) {
                                    e = e12;
                                    abstractC9996c2 = this;
                                    remoteExceptionC10012s = e;
                                    r02 = abstractC9996c2.f100451e;
                                    if (r02 != 0) {
                                        c10005l2.f100474d = abstractC9996c2;
                                        c10005l2.f100475e = function13;
                                        c10005l2.f100476f = remoteExceptionC10012s;
                                        c10005l2.f100479i = 2;
                                        if (r02.invoke(c10005l2) != aVar) {
                                            abstractC9996c3 = abstractC9996c2;
                                            function14 = function13;
                                            function13 = function14;
                                            abstractC9996c2 = abstractC9996c3;
                                        }
                                        return aVar;
                                    }
                                    invoke = function13.invoke(remoteExceptionC10012s);
                                    abstractC9996c2.p();
                                    return invoke;
                                } catch (d1 e13) {
                                    e = e13;
                                    abstractC9996c2 = this;
                                    abstractC9996c2.s().b("Timeout exceeded while executing AIDL request", e);
                                    invoke = function13.invoke(e);
                                    abstractC9996c2.p();
                                    return invoke;
                                }
                            } catch (Throwable th2) {
                                th = th2;
                                abstractC9996c = this;
                                abstractC9996c.p();
                                throw th;
                            }
                        } catch (CancellationException e14) {
                            e = e14;
                            function13 = function1;
                        } catch (RemoteExceptionC10012s e15) {
                            e = e15;
                            function13 = function1;
                        } catch (d1 e16) {
                            e = e16;
                            function13 = function1;
                        }
                        return aVar;
                    }
                    if (i11 != 1) {
                        if (i11 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        remoteExceptionC10012s = c10005l2.f100476f;
                        function14 = c10005l2.f100475e;
                        abstractC9996c3 = c10005l2.f100474d;
                        try {
                            Sc.s.b(obj);
                            function13 = function14;
                            abstractC9996c2 = abstractC9996c3;
                            invoke = function13.invoke(remoteExceptionC10012s);
                            abstractC9996c2.p();
                            return invoke;
                        } catch (Throwable th3) {
                            th = th3;
                            abstractC9996c = abstractC9996c3;
                            abstractC9996c.p();
                            throw th;
                        }
                    }
                    Function1 function15 = c10005l2.f100475e;
                    abstractC9996c2 = c10005l2.f100474d;
                    try {
                        Sc.s.b(obj);
                    } catch (RemoteExceptionC10012s e17) {
                        e = e17;
                        function13 = function15;
                        remoteExceptionC10012s = e;
                        r02 = abstractC9996c2.f100451e;
                        if (r02 != 0) {
                        }
                        invoke = function13.invoke(remoteExceptionC10012s);
                        abstractC9996c2.p();
                        return invoke;
                    } catch (d1 e18) {
                        e = e18;
                        function13 = function15;
                        abstractC9996c2.s().b("Timeout exceeded while executing AIDL request", e);
                        invoke = function13.invoke(e);
                        abstractC9996c2.p();
                        return invoke;
                    } catch (CancellationException e19) {
                        e = e19;
                        function13 = function15;
                        abstractC9996c2.s().b("AIDL request was cancelled. Release connection immediately", e);
                        abstractC9996c2.v();
                        invoke = function13.invoke(e);
                        abstractC9996c2.p();
                        return invoke;
                    }
                    abstractC9996c2.p();
                    return obj;
                }
            }
            if (i11 != 0) {
            }
            abstractC9996c2.p();
            return obj;
        } catch (Throwable th4) {
            th = th4;
        }
        c10005l = new C10005l(this, cVar);
        abstractC9996c = i12;
        C10005l c10005l22 = c10005l;
        Object obj2 = c10005l22.f100477g;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c10005l22.f100479i;
    }
}
