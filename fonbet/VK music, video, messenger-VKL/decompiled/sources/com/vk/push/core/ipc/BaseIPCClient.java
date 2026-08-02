package com.vk.push.core.ipc;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.vk.push.common.AppInfo;
import com.vk.push.common.Logger;
import com.vk.push.core.base.AidlResult;
import com.vk.push.core.base.AsyncCallback;
import com.vk.push.core.base.DelayedAction;
import com.vk.push.core.ipc.IpcRequest;
import com.vk.push.core.utils.PackageExtenstionsKt;
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
import kotlin.Result;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.TimeoutCancellationException;
import xsna.b6l;
import xsna.bpn0;
import xsna.brm0;
import xsna.e50;
import xsna.epx;
import xsna.gzs;
import xsna.he6;
import xsna.ie6;
import xsna.izs;
import xsna.je6;
import xsna.lq9;
import xsna.oxo0;
import xsna.s3q0;
import xsna.s7s0;
import xsna.spj;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: BaseIPCClient.kt */
/* loaded from: classes5.dex */
public abstract class BaseIPCClient<T extends IInterface> {
    public static final Companion Companion = new Companion(null);
    public static final long DEFAULT_CLOSE_CONNECTION_TIMEOUT_MILLIS = 10000;
    public final Context a;
    public final List<AppInfo> b;
    public final long c;
    public final izs<BaseIPCClient<T>, s3q0> d;
    public final gzs<s3q0> e;
    public final bpn0 f;
    public final bpn0 g;
    public volatile b<T> h;
    public final AtomicBoolean i;
    public final ExecutorService j;
    public final Set<IpcRequest<T, ?>> k;
    public final BaseIPCClient$connection$1 l;

    /* compiled from: BaseIPCClient.kt */
    public interface BindingResult {

        /* compiled from: BaseIPCClient.kt */
        public static final class BindServiceFailed implements BindingResult {
            public static final BindServiceFailed INSTANCE = new BindServiceFailed();
        }

        /* compiled from: BaseIPCClient.kt */
        public static final class InvalidSignature implements BindingResult {
            public static final InvalidSignature INSTANCE = new InvalidSignature();
        }

        /* compiled from: BaseIPCClient.kt */
        public static final class Ok implements BindingResult {
            public static final Ok INSTANCE = new Ok();
        }
    }

    /* compiled from: BaseIPCClient.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: BaseIPCClient.kt */
    public static final class a extends Lambda implements izs<BaseIPCClient<T>, s3q0> {
        public static final a i = new a(1);

        @Override // xsna.izs
        public final /* bridge */ /* synthetic */ s3q0 invoke(Object obj) {
            return s3q0.a;
        }
    }

    /* compiled from: BaseIPCClient.kt */
    public static final class b<T> {
        public final AppInfo a;
        public final ComponentName b;
        public final T c;

        /* JADX WARN: Multi-variable type inference failed */
        public b(AppInfo appInfo, ComponentName componentName, IInterface iInterface) {
            this.a = appInfo;
            this.b = componentName;
            this.c = iInterface;
        }
    }

    /* compiled from: BaseIPCClient.kt */
    public static final class c extends Lambda implements gzs<DelayedAction> {
        final /* synthetic */ BaseIPCClient<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(BaseIPCClient<T> baseIPCClient) {
            super(0);
            this.this$0 = baseIPCClient;
        }

        @Override // xsna.gzs
        public final DelayedAction invoke() {
            return new DelayedAction(null, new com.vk.push.core.ipc.a(this.this$0), 1, null);
        }
    }

    /* compiled from: BaseIPCClient.kt */
    public static final class d extends Lambda implements gzs<Logger> {
        final /* synthetic */ Logger $logger;
        final /* synthetic */ BaseIPCClient<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Logger logger, BaseIPCClient<T> baseIPCClient) {
            super(0);
            this.$logger = logger;
            this.this$0 = baseIPCClient;
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            return this.$logger.createLogger(this.this$0.getLogTag());
        }
    }

    /* compiled from: BaseIPCClient.kt */
    @b6l(c = "com.vk.push.core.ipc.BaseIPCClient", f = "BaseIPCClient.kt", l = {191}, m = "makeAsyncRequest")
    public static final class e<V> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseIPCClient<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(BaseIPCClient<T> baseIPCClient, spj<? super e> spjVar) {
            super(spjVar);
            this.this$0 = baseIPCClient;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.makeAsyncRequest(null, null, null, null, null, 0L, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: BaseIPCClient.kt */
    @b6l(c = "com.vk.push.core.ipc.BaseIPCClient$makeAsyncRequest$2", f = "BaseIPCClient.kt", l = {403}, m = "invokeSuspend")
    public static final class f<V> extends SuspendLambda implements wzs<yvj, spj<? super V>, Object> {
        final /* synthetic */ izs<String, ComponentName> $componentNameCreator;
        final /* synthetic */ wzs<T, AsyncCallback, s3q0> $ipcCall;
        final /* synthetic */ String $ipcCallName;
        final /* synthetic */ izs<Exception, V> $transformErrorResult;
        final /* synthetic */ wzs<AidlResult<?>, AppInfo, V> $transformSuccessResult;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        int label;
        final /* synthetic */ BaseIPCClient<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(BaseIPCClient<T> baseIPCClient, wzs<? super T, ? super AsyncCallback, s3q0> wzsVar, String str, wzs<? super AidlResult<?>, ? super AppInfo, ? extends V> wzsVar2, izs<? super Exception, ? extends V> izsVar, izs<? super String, ComponentName> izsVar2, spj<? super f> spjVar) {
            super(2, spjVar);
            this.this$0 = baseIPCClient;
            this.$ipcCall = wzsVar;
            this.$ipcCallName = str;
            this.$transformSuccessResult = wzsVar2;
            this.$transformErrorResult = izsVar;
            this.$componentNameCreator = izsVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new f(this.this$0, this.$ipcCall, this.$ipcCallName, this.$transformSuccessResult, this.$transformErrorResult, this.$componentNameCreator, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((f) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            BaseIPCClient<T> baseIPCClient = this.this$0;
            wzs<T, AsyncCallback, s3q0> wzsVar = this.$ipcCall;
            String str = this.$ipcCallName;
            wzs<AidlResult<?>, AppInfo, V> wzsVar2 = this.$transformSuccessResult;
            izs<Exception, V> izsVar = this.$transformErrorResult;
            izs<String, ComponentName> izsVar2 = this.$componentNameCreator;
            this.L$0 = baseIPCClient;
            this.L$1 = wzsVar;
            this.L$2 = str;
            this.L$3 = wzsVar2;
            this.L$4 = izsVar;
            this.L$5 = izsVar2;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            BaseIPCClient.access$executeWhenConnected(baseIPCClient, new IpcRequest.AsyncRequest(wzsVar, str, wzsVar2, baseIPCClient.getLogger(), izsVar, lq9Var), izsVar2);
            Object n = lq9Var.n();
            return n == coroutineSingletons ? coroutineSingletons : n;
        }
    }

    /* compiled from: BaseIPCClient.kt */
    @b6l(c = "com.vk.push.core.ipc.BaseIPCClient", f = "BaseIPCClient.kt", l = {155}, m = "makeSimpleRequest")
    public static final class g<V> extends ContinuationImpl {
        Object L$0;
        Object L$1;
        Object L$2;
        int label;
        /* synthetic */ Object result;
        final /* synthetic */ BaseIPCClient<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(BaseIPCClient<T> baseIPCClient, spj<? super g> spjVar) {
            super(spjVar);
            this.this$0 = baseIPCClient;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return this.this$0.makeSimpleRequest(null, null, null, null, this);
        }
    }

    /* JADX INFO: Add missing generic type declarations: [V] */
    /* compiled from: BaseIPCClient.kt */
    @b6l(c = "com.vk.push.core.ipc.BaseIPCClient$makeSimpleRequest$2", f = "BaseIPCClient.kt", l = {403}, m = "invokeSuspend")
    public static final class h<V> extends SuspendLambda implements wzs<yvj, spj<? super V>, Object> {
        final /* synthetic */ izs<String, ComponentName> $componentNameCreator;
        final /* synthetic */ wzs<T, AppInfo, V> $ipcCall;
        final /* synthetic */ String $ipcCallName;
        final /* synthetic */ izs<Exception, V> $transformErrorResult;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;
        final /* synthetic */ BaseIPCClient<T> this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public h(BaseIPCClient<T> baseIPCClient, wzs<? super T, ? super AppInfo, ? extends V> wzsVar, String str, izs<? super Exception, ? extends V> izsVar, izs<? super String, ComponentName> izsVar2, spj<? super h> spjVar) {
            super(2, spjVar);
            this.this$0 = baseIPCClient;
            this.$ipcCall = wzsVar;
            this.$ipcCallName = str;
            this.$transformErrorResult = izsVar;
            this.$componentNameCreator = izsVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new h(this.this$0, this.$ipcCall, this.$ipcCallName, this.$transformErrorResult, this.$componentNameCreator, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, Object obj) {
            return ((h) create(yvjVar, (spj) obj)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            int i = this.label;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                kotlin.a.a(obj);
                return obj;
            }
            kotlin.a.a(obj);
            BaseIPCClient<T> baseIPCClient = this.this$0;
            wzs<T, AppInfo, V> wzsVar = this.$ipcCall;
            String str = this.$ipcCallName;
            izs<Exception, V> izsVar = this.$transformErrorResult;
            izs<String, ComponentName> izsVar2 = this.$componentNameCreator;
            this.L$0 = baseIPCClient;
            this.L$1 = wzsVar;
            this.L$2 = str;
            this.L$3 = izsVar;
            this.L$4 = izsVar2;
            this.label = 1;
            lq9 lq9Var = new lq9(1, s7s0.c(this));
            lq9Var.o();
            BaseIPCClient.access$executeWhenConnected(baseIPCClient, new IpcRequest.SimpleRequest(wzsVar, str, baseIPCClient.getLogger(), izsVar, lq9Var), izsVar2);
            Object n = lq9Var.n();
            return n == coroutineSingletons ? coroutineSingletons : n;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v17, types: [com.vk.push.core.ipc.BaseIPCClient$connection$1] */
    public BaseIPCClient(Context context, List<AppInfo> list, long j, izs<? super BaseIPCClient<T>, s3q0> izsVar, gzs<s3q0> gzsVar, final Logger logger) {
        this.a = context;
        this.b = list;
        this.c = j;
        this.d = izsVar;
        this.e = gzsVar;
        if (list.isEmpty()) {
            throw new IllegalArgumentException("Preferred hosts must not be empty");
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (hashSet.add(((AppInfo) obj).getPackageName())) {
                arrayList.add(obj);
            }
        }
        if (arrayList.size() != this.b.size()) {
            throw new IllegalArgumentException("Found duplicate package names in preferred hosts");
        }
        if (this.c < 0) {
            throw new IllegalArgumentException("closeConnectionTimeoutMillis must be >= 0");
        }
        this.f = new bpn0(new d(logger, this));
        this.g = new bpn0(new c(this));
        this.i = new AtomicBoolean(false);
        this.j = Executors.unconfigurableExecutorService(new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue()));
        this.k = Collections.synchronizedSet(new LinkedHashSet());
        this.l = new ServiceConnection() { // from class: com.vk.push.core.ipc.BaseIPCClient$connection$1
            @Override // android.content.ServiceConnection
            public void onBindingDied(ComponentName componentName) {
                BaseIPCClient.access$handleOnBindingDied(this, componentName);
            }

            @Override // android.content.ServiceConnection
            public void onNullBinding(ComponentName componentName) {
                Logger.DefaultImpls.warn$default(logger, "Null binding from " + componentName.getPackageName(), null, 2, null);
            }

            @Override // android.content.ServiceConnection
            public void onServiceConnected(ComponentName componentName, IBinder iBinder) {
                AtomicBoolean atomicBoolean;
                BaseIPCClient<T> baseIPCClient = this;
                atomicBoolean = baseIPCClient.i;
                atomicBoolean.set(true);
                BaseIPCClient.access$handleOnServiceConnected(baseIPCClient, componentName, iBinder);
            }

            @Override // android.content.ServiceConnection
            public void onServiceDisconnected(ComponentName componentName) {
                BaseIPCClient.access$handleOnServiceDisconnected(this, componentName);
            }
        };
    }

    public static final void access$executeWhenConnected(BaseIPCClient baseIPCClient, IpcRequest ipcRequest, izs izsVar) {
        NoHostsToBindException unknownBindingException;
        ComponentName componentName;
        b<T> bVar = baseIPCClient.h;
        T t = bVar != null ? bVar.c : null;
        b<T> bVar2 = baseIPCClient.h;
        AppInfo appInfo = bVar2 != null ? bVar2.a : null;
        if (t != null && appInfo != null) {
            try {
                baseIPCClient.k.add(ipcRequest);
                ipcRequest.execute(t, appInfo, new ie6(baseIPCClient));
                return;
            } catch (RemoteException e2) {
                baseIPCClient.getLogger().warn("RemoteException while executing request", e2);
                return;
            }
        }
        NoHostsToBindException noHostsToBindException = null;
        for (AppInfo appInfo2 : baseIPCClient.b) {
            try {
                componentName = (ComponentName) izsVar.invoke(appInfo2.getPackageName());
            } catch (SecurityException e3) {
                baseIPCClient.getLogger().error("No permission to bind to " + appInfo2.getPackageName(), e3);
                noHostsToBindException = new SecurityBindingException();
            } catch (Exception e4) {
                baseIPCClient.getLogger().error("Unable to bind service", e4);
                unknownBindingException = new UnknownBindingException(e4);
            }
            if (componentName == null) {
                Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Component name from host " + appInfo2.getPackageName() + " is null", null, 2, null);
                unknownBindingException = new ComponentCreationFailedException();
                noHostsToBindException = unknownBindingException;
            } else {
                BindingResult i = baseIPCClient.i(appInfo2, componentName, ipcRequest);
                if (epx.f(i, BindingResult.Ok.INSTANCE)) {
                    return;
                } else {
                    noHostsToBindException = l(i);
                }
            }
        }
        Logger.DefaultImpls.error$default(baseIPCClient.getLogger(), "No available hosts found. Binding has failed, giving up.", null, 2, null);
        if (noHostsToBindException == null) {
            noHostsToBindException = new NoHostsToBindException();
        }
        ipcRequest.onError(noHostsToBindException);
        gzs<s3q0> gzsVar = baseIPCClient.e;
        if (gzsVar != null) {
            gzsVar.invoke();
        }
    }

    public static final void access$handleOnBindingDied(BaseIPCClient baseIPCClient, ComponentName componentName) {
        Logger.DefaultImpls.warn$default(baseIPCClient.getLogger(), "Binding to " + componentName.getPackageName() + " has died", null, 2, null);
        baseIPCClient.m();
        b<T> bVar = baseIPCClient.h;
        if (bVar != null) {
            baseIPCClient.j.submit(new e50(1, baseIPCClient, bVar));
        }
    }

    public static final void access$handleOnServiceConnected(BaseIPCClient baseIPCClient, ComponentName componentName, IBinder iBinder) {
        Object obj;
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "On service connected! Remote host package name = " + componentName.getPackageName(), null, 2, null);
        Iterator<T> it = baseIPCClient.b.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (brm0.w(((AppInfo) obj).getPackageName(), componentName.getPackageName(), true)) {
                    break;
                }
            }
        }
        AppInfo appInfo = (AppInfo) obj;
        if (appInfo == null) {
            Logger.DefaultImpls.error$default(baseIPCClient.getLogger(), "onServiceConnected: host is null", null, 2, null);
            return;
        }
        IInterface createInterface = baseIPCClient.createInterface(iBinder);
        baseIPCClient.h = new b<>(appInfo, componentName, createInterface);
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Service connection to " + componentName.getPackageName() + " has been established", null, 2, null);
        je6 je6Var = new je6(baseIPCClient, createInterface, appInfo);
        if (baseIPCClient.k.isEmpty()) {
            return;
        }
        baseIPCClient.j.submit(new he6(baseIPCClient, je6Var));
    }

    public static final void access$handleOnServiceDisconnected(BaseIPCClient baseIPCClient, ComponentName componentName) {
        Logger.DefaultImpls.info$default(baseIPCClient.getLogger(), "Service has been disconnected, host: " + componentName.getPackageName(), null, 2, null);
        b<T> bVar = baseIPCClient.h;
        baseIPCClient.h = bVar != null ? new b<>(bVar.a, bVar.b, null) : null;
    }

    public static NoHostsToBindException l(BindingResult bindingResult) {
        if (epx.f(bindingResult, BindingResult.InvalidSignature.INSTANCE)) {
            return new InvalidSignatureException();
        }
        if (epx.f(bindingResult, BindingResult.BindServiceFailed.INSTANCE)) {
            return new BindingFailedException();
        }
        return null;
    }

    public static /* synthetic */ Object makeAsyncRequest$default(BaseIPCClient baseIPCClient, wzs wzsVar, String str, wzs wzsVar2, izs izsVar, izs izsVar2, long j, spj spjVar, int i, Object obj) {
        if (obj == null) {
            return baseIPCClient.makeAsyncRequest(wzsVar, str, wzsVar2, izsVar, izsVar2, (i & 32) != 0 ? TimeUnit.MINUTES.toMillis(3L) : j, spjVar);
        }
        throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: makeAsyncRequest");
    }

    public List<AppInfo> a() {
        return getPreferredHosts();
    }

    public abstract T createInterface(IBinder iBinder);

    public final Context getContext() {
        return this.a;
    }

    public abstract String getLogTag();

    public final Logger getLogger() {
        return (Logger) this.f.getValue();
    }

    public final List<AppInfo> getPreferredHosts() {
        return this.b;
    }

    public final BindingResult h(AppInfo appInfo, ComponentName componentName) throws SecurityException {
        boolean validateCallingPackage;
        String packageName = appInfo.getPackageName();
        Context context = this.a;
        if (epx.f(packageName, context.getPackageName())) {
            validateCallingPackage = true;
        } else {
            validateCallingPackage = PackageExtenstionsKt.validateCallingPackage(context, appInfo.getPubKey(), appInfo.getPackageName());
            if (!validateCallingPackage) {
                Logger.DefaultImpls.error$default(getLogger(), "Signature validation for " + appInfo.getPackageName() + " has failed", null, 2, null);
            }
        }
        if (!validateCallingPackage) {
            return BindingResult.InvalidSignature.INSTANCE;
        }
        Intent intent = new Intent();
        intent.setComponent(componentName);
        return context.bindService(intent, this.l, 1) ? BindingResult.Ok.INSTANCE : BindingResult.BindServiceFailed.INSTANCE;
    }

    public final BindingResult i(AppInfo appInfo, ComponentName componentName, IpcRequest<T, ?> ipcRequest) {
        BindingResult h2 = h(appInfo, componentName);
        if (!epx.f(h2, BindingResult.Ok.INSTANCE)) {
            Logger.DefaultImpls.info$default(getLogger(), "Unable to bind to " + appInfo.getPackageName() + ", trying next host", null, 2, null);
            return h2;
        }
        Logger.DefaultImpls.info$default(getLogger(), "bindService to " + appInfo.getPackageName() + " via " + ipcRequest.getIpcCallName() + " function returns true, waiting for connection establishment", null, 2, null);
        this.k.add(ipcRequest);
        b<T> bVar = this.h;
        T t = bVar != null ? bVar.c : null;
        if (t == null) {
            this.h = new b<>(appInfo, componentName, null);
            return h2;
        }
        Logger.DefaultImpls.info$default(getLogger(), "bindService to " + appInfo.getPackageName() + " via " + ipcRequest.getIpcCallName() + ", remoteService already exists", null, 2, null);
        je6 je6Var = new je6(this, t, appInfo);
        if (!this.k.isEmpty()) {
            this.j.submit(new he6(this, je6Var));
        }
        return h2;
    }

    public final void j() {
        ((DelayedAction) this.g.getValue()).runWithDelay(this.c);
    }

    public final boolean k() {
        Object m = m();
        b<T> bVar = this.h;
        this.h = bVar != null ? new b<>(bVar.a, bVar.b, null) : null;
        Logger logger = getLogger();
        StringBuilder sb = new StringBuilder("Service connection is released success = ");
        boolean z = !(m instanceof Result.Failure);
        sb.append(z);
        Logger.DefaultImpls.info$default(logger, sb.toString(), null, 2, null);
        this.d.invoke(this);
        return z;
    }

    public final Object m() {
        try {
            if (this.i.compareAndSet(true, false)) {
                Logger.DefaultImpls.info$default(getLogger(), "Unbind service", null, 2, null);
                this.a.unbindService(this.l);
            } else {
                Logger.DefaultImpls.info$default(getLogger(), "Unbind service skipped", null, 2, null);
            }
            return s3q0.a;
        } catch (Throwable th) {
            return new Result.Failure(th);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x004d  */
    /* JADX WARN: Type inference failed for: r4v14 */
    /* JADX WARN: Type inference failed for: r4v2, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r4v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <V> Object makeAsyncRequest(wzs<? super T, ? super AsyncCallback, s3q0> wzsVar, String str, wzs<? super AidlResult<?>, ? super AppInfo, ? extends V> wzsVar2, izs<? super Exception, ? extends V> izsVar, izs<? super String, ComponentName> izsVar2, long j, spj<? super V> spjVar) {
        e eVar;
        int i;
        izs<? super Exception, ? extends V> izsVar3;
        BaseIPCClient<T> baseIPCClient;
        String str2;
        V invoke;
        try {
            if (spjVar instanceof e) {
                eVar = (e) spjVar;
                int i2 = eVar.label;
                ?? r4 = -2147483648;
                if ((i2 & Integer.MIN_VALUE) != 0) {
                    eVar.label = i2 - Integer.MIN_VALUE;
                    e eVar2 = eVar;
                    Object obj = eVar2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    i = eVar2.label;
                    if (i != 0) {
                        kotlin.a.a(obj);
                        try {
                            try {
                                izsVar3 = izsVar;
                                try {
                                    f fVar = new f(this, wzsVar, str, wzsVar2, izsVar3, izsVar2, null);
                                    eVar2.L$0 = this;
                                    eVar2.L$1 = str;
                                    izsVar3 = izsVar;
                                    eVar2.L$2 = izsVar3;
                                    eVar2.label = 1;
                                    obj = oxo0.b(j, fVar, eVar2);
                                    if (obj == coroutineSingletons) {
                                        return coroutineSingletons;
                                    }
                                    baseIPCClient = this;
                                } catch (TimeoutCancellationException e2) {
                                    e = e2;
                                    baseIPCClient = this;
                                    str2 = str;
                                    baseIPCClient.getLogger().warn("Timeout exceeded while executing AIDL request " + str2, e);
                                    invoke = izsVar3.invoke(e);
                                    baseIPCClient.j();
                                    return invoke;
                                } catch (CancellationException e3) {
                                    e = e3;
                                    baseIPCClient = this;
                                    str2 = str;
                                    baseIPCClient.getLogger().warn("AIDL request " + str2 + " was cancelled. Release connection immediately", e);
                                    baseIPCClient.k();
                                    invoke = izsVar3.invoke(e);
                                    baseIPCClient.j();
                                    return invoke;
                                }
                            } catch (Throwable th) {
                                th = th;
                                r4 = this;
                                r4.j();
                                throw th;
                            }
                        } catch (TimeoutCancellationException e4) {
                            e = e4;
                            izsVar3 = izsVar;
                        } catch (CancellationException e5) {
                            e = e5;
                            izsVar3 = izsVar;
                        }
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        izs<? super Exception, ? extends V> izsVar4 = (izs) eVar2.L$2;
                        str2 = (String) eVar2.L$1;
                        baseIPCClient = (BaseIPCClient) eVar2.L$0;
                        try {
                            kotlin.a.a(obj);
                        } catch (TimeoutCancellationException e6) {
                            e = e6;
                            izsVar3 = izsVar4;
                            baseIPCClient.getLogger().warn("Timeout exceeded while executing AIDL request " + str2, e);
                            invoke = izsVar3.invoke(e);
                            baseIPCClient.j();
                            return invoke;
                        } catch (CancellationException e7) {
                            e = e7;
                            izsVar3 = izsVar4;
                            baseIPCClient.getLogger().warn("AIDL request " + str2 + " was cancelled. Release connection immediately", e);
                            baseIPCClient.k();
                            invoke = izsVar3.invoke(e);
                            baseIPCClient.j();
                            return invoke;
                        }
                    }
                    baseIPCClient.j();
                    return obj;
                }
            }
            if (i != 0) {
            }
            baseIPCClient.j();
            return obj;
        } catch (Throwable th2) {
            th = th2;
        }
        eVar = new e(this, spjVar);
        e eVar22 = eVar;
        Object obj2 = eVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        i = eVar22.label;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:10:0x0029  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0053  */
    /* JADX WARN: Type inference failed for: r2v12, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r2v17 */
    /* JADX WARN: Type inference failed for: r2v22 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v3, types: [int] */
    /* JADX WARN: Type inference failed for: r2v4 */
    /* JADX WARN: Type inference failed for: r2v5, types: [com.vk.push.core.ipc.BaseIPCClient] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <V> Object makeSimpleRequest(wzs<? super T, ? super AppInfo, ? extends V> wzsVar, String str, izs<? super Exception, ? extends V> izsVar, izs<? super String, ComponentName> izsVar2, spj<? super V> spjVar) {
        g gVar;
        ?? r2;
        String str2;
        izs<? super Exception, ? extends V> izsVar3;
        BaseIPCClient<T> baseIPCClient;
        BaseIPCClient<T> baseIPCClient2;
        BaseIPCClient<T> baseIPCClient3;
        V invoke;
        try {
            if (spjVar instanceof g) {
                gVar = (g) spjVar;
                int i = gVar.label;
                if ((i & Integer.MIN_VALUE) != 0) {
                    gVar.label = i - Integer.MIN_VALUE;
                    g gVar2 = gVar;
                    Object obj = gVar2.result;
                    CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
                    r2 = gVar2.label;
                    if (r2 != 0) {
                        kotlin.a.a(obj);
                        try {
                            try {
                                long millis = TimeUnit.MINUTES.toMillis(3L);
                                str2 = str;
                                izsVar3 = izsVar;
                                try {
                                    h hVar = new h(this, wzsVar, str2, izsVar3, izsVar2, null);
                                    gVar2.L$0 = this;
                                    str2 = str;
                                    try {
                                        gVar2.L$1 = str2;
                                        izsVar3 = izsVar;
                                        gVar2.L$2 = izsVar3;
                                        gVar2.label = 1;
                                        obj = oxo0.b(millis, hVar, gVar2);
                                        if (obj == coroutineSingletons) {
                                            return coroutineSingletons;
                                        }
                                        baseIPCClient3 = this;
                                    } catch (TimeoutCancellationException e2) {
                                        e = e2;
                                        izsVar3 = izsVar;
                                        baseIPCClient2 = this;
                                        baseIPCClient2.getLogger().warn("Timeout exceeded while executing AIDL request " + str2, e);
                                        invoke = izsVar3.invoke(e);
                                        r2 = baseIPCClient2;
                                        r2.j();
                                        return invoke;
                                    } catch (CancellationException e3) {
                                        e = e3;
                                        izsVar3 = izsVar;
                                        baseIPCClient = this;
                                        baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately " + str2, e);
                                        baseIPCClient.k();
                                        invoke = izsVar3.invoke(e);
                                        r2 = baseIPCClient;
                                        r2.j();
                                        return invoke;
                                    }
                                } catch (TimeoutCancellationException e4) {
                                    e = e4;
                                    baseIPCClient2 = this;
                                    baseIPCClient2.getLogger().warn("Timeout exceeded while executing AIDL request " + str2, e);
                                    invoke = izsVar3.invoke(e);
                                    r2 = baseIPCClient2;
                                    r2.j();
                                    return invoke;
                                } catch (CancellationException e5) {
                                    e = e5;
                                    baseIPCClient = this;
                                    baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately " + str2, e);
                                    baseIPCClient.k();
                                    invoke = izsVar3.invoke(e);
                                    r2 = baseIPCClient;
                                    r2.j();
                                    return invoke;
                                }
                            } catch (Throwable th) {
                                th = th;
                                r2 = this;
                                r2.j();
                                throw th;
                            }
                        } catch (TimeoutCancellationException e6) {
                            e = e6;
                            str2 = str;
                        } catch (CancellationException e7) {
                            e = e7;
                            str2 = str;
                        }
                    } else {
                        if (r2 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        izs<? super Exception, ? extends V> izsVar4 = (izs) gVar2.L$2;
                        str2 = (String) gVar2.L$1;
                        baseIPCClient3 = (BaseIPCClient) gVar2.L$0;
                        try {
                            kotlin.a.a(obj);
                        } catch (TimeoutCancellationException e8) {
                            e = e8;
                            izsVar3 = izsVar4;
                            baseIPCClient2 = baseIPCClient3;
                            baseIPCClient2.getLogger().warn("Timeout exceeded while executing AIDL request " + str2, e);
                            invoke = izsVar3.invoke(e);
                            r2 = baseIPCClient2;
                            r2.j();
                            return invoke;
                        } catch (CancellationException e9) {
                            e = e9;
                            izsVar3 = izsVar4;
                            baseIPCClient = baseIPCClient3;
                            baseIPCClient.getLogger().warn("AIDL request was cancelled. Release connection immediately " + str2, e);
                            baseIPCClient.k();
                            invoke = izsVar3.invoke(e);
                            r2 = baseIPCClient;
                            r2.j();
                            return invoke;
                        } catch (Throwable th2) {
                            th = th2;
                            r2 = baseIPCClient3;
                            r2.j();
                            throw th;
                        }
                    }
                    baseIPCClient3.j();
                    return obj;
                }
            }
            if (r2 != 0) {
            }
            baseIPCClient3.j();
            return obj;
        } catch (Throwable th3) {
            th = th3;
        }
        gVar = new g(this, spjVar);
        g gVar22 = gVar;
        Object obj2 = gVar22.result;
        CoroutineSingletons coroutineSingletons2 = CoroutineSingletons.COROUTINE_SUSPENDED;
        r2 = gVar22.label;
    }

    public /* synthetic */ BaseIPCClient(Context context, List list, long j, izs izsVar, gzs gzsVar, Logger logger, int i, zcl zclVar) {
        this(context, list, (i & 4) != 0 ? 10000L : j, (i & 8) != 0 ? a.i : izsVar, gzsVar, logger);
    }
}
