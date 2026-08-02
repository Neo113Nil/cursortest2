package com.google.firebase.messaging;

import android.annotation.SuppressLint;
import android.app.Application;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import androidx.annotation.Keep;
import androidx.annotation.NonNull;
import com.google.android.gms.cloudmessaging.CloudMessage;
import com.google.android.gms.common.internal.AbstractC3191o;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.android.gms.tasks.SuccessContinuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.Z;
import com.google.firebase.messaging.e0;
import d9.InterfaceC4046i;
import eb.C4192b;
import eb.C4196f;
import gb.InterfaceC4371a;
import io.agora.rtc2.internal.AudioRoutingController;
import java.io.IOException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import tb.C6456a;
import tb.InterfaceC6457b;
import tb.InterfaceC6459d;
import vb.InterfaceC6681a;
import wb.InterfaceC6736b;
import x2.ExecutorC6789k;

/* loaded from: classes3.dex */
public class FirebaseMessaging {
    private static final String EXTRA_DUMMY_P_INTENT = "app";
    static final String GMS_PACKAGE = "com.google.android.gms";

    @Deprecated
    public static final String INSTANCE_ID_SCOPE = "FCM";
    private static final long MIN_DELAY_SEC = 30;
    private static final String SEND_INTENT_ACTION = "com.google.android.gcm.intent.SEND";
    private static final String SUBTYPE_DEFAULT = "";
    static final String TAG = "FirebaseMessaging";
    private static e0 store;
    static ScheduledExecutorService syncExecutor;
    private final a autoInit;
    private final Context context;
    private final Executor fileExecutor;
    private final C4196f firebaseApp;
    private final I gmsRpc;
    private final InterfaceC6681a iid;
    private final Executor initExecutor;
    private final Application.ActivityLifecycleCallbacks lifecycleCallbacks;
    private final N metadata;
    private final Z requestDeduplicator;
    private boolean syncScheduledOrRunning;
    private final Task<j0> topicsSubscriberTask;
    private static final long MAX_DELAY_SEC = TimeUnit.HOURS.toSeconds(8);
    static InterfaceC6736b transportFactory = new InterfaceC6736b() { // from class: com.google.firebase.messaging.x
        @Override // wb.InterfaceC6736b
        public final Object get() {
            return FirebaseMessaging.f();
        }
    };

    public class a {

        /* renamed from: a, reason: collision with root package name */
        public final InterfaceC6459d f37841a;

        /* renamed from: b, reason: collision with root package name */
        public boolean f37842b;

        /* renamed from: c, reason: collision with root package name */
        public InterfaceC6457b f37843c;

        /* renamed from: d, reason: collision with root package name */
        public Boolean f37844d;

        public a(InterfaceC6459d interfaceC6459d) {
            this.f37841a = interfaceC6459d;
        }

        public static /* synthetic */ void a(a aVar, C6456a c6456a) {
            if (aVar.c()) {
                FirebaseMessaging.this.startSyncIfNecessary();
            }
        }

        public synchronized void b() {
            try {
                if (this.f37842b) {
                    return;
                }
                Boolean d10 = d();
                this.f37844d = d10;
                if (d10 == null) {
                    InterfaceC6457b interfaceC6457b = new InterfaceC6457b() { // from class: com.google.firebase.messaging.F
                        @Override // tb.InterfaceC6457b
                        public final void a(C6456a c6456a) {
                            FirebaseMessaging.a.a(FirebaseMessaging.a.this, c6456a);
                        }
                    };
                    this.f37843c = interfaceC6457b;
                    this.f37841a.d(C4192b.class, interfaceC6457b);
                }
                this.f37842b = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }

        public synchronized boolean c() {
            Boolean bool;
            try {
                b();
                bool = this.f37844d;
            } catch (Throwable th2) {
                throw th2;
            }
            return bool != null ? bool.booleanValue() : FirebaseMessaging.this.firebaseApp.w();
        }

        public final Boolean d() {
            ApplicationInfo applicationInfo;
            Bundle bundle;
            Context l10 = FirebaseMessaging.this.firebaseApp.l();
            SharedPreferences sharedPreferences = l10.getSharedPreferences("com.google.firebase.messaging", 0);
            if (sharedPreferences.contains("auto_init")) {
                return Boolean.valueOf(sharedPreferences.getBoolean("auto_init", false));
            }
            try {
                PackageManager packageManager = l10.getPackageManager();
                if (packageManager == null || (applicationInfo = packageManager.getApplicationInfo(l10.getPackageName(), 128)) == null || (bundle = applicationInfo.metaData) == null || !bundle.containsKey("firebase_messaging_auto_init_enabled")) {
                    return null;
                }
                return Boolean.valueOf(applicationInfo.metaData.getBoolean("firebase_messaging_auto_init_enabled"));
            } catch (PackageManager.NameNotFoundException unused) {
                return null;
            }
        }

        public synchronized void e(boolean z10) {
            try {
                b();
                InterfaceC6457b interfaceC6457b = this.f37843c;
                if (interfaceC6457b != null) {
                    this.f37841a.c(C4192b.class, interfaceC6457b);
                    this.f37843c = null;
                }
                SharedPreferences.Editor edit = FirebaseMessaging.this.firebaseApp.l().getSharedPreferences("com.google.firebase.messaging", 0).edit();
                edit.putBoolean("auto_init", z10);
                edit.apply();
                if (z10) {
                    FirebaseMessaging.this.startSyncIfNecessary();
                }
                this.f37844d = Boolean.valueOf(z10);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public FirebaseMessaging(C4196f c4196f, InterfaceC6681a interfaceC6681a, InterfaceC6736b interfaceC6736b, InterfaceC6736b interfaceC6736b2, com.google.firebase.installations.h hVar, InterfaceC6736b interfaceC6736b3, InterfaceC6459d interfaceC6459d) {
        this(c4196f, interfaceC6681a, interfaceC6736b, interfaceC6736b2, hVar, interfaceC6736b3, interfaceC6459d, new N(c4196f.l()));
    }

    public static /* synthetic */ Task b(FirebaseMessaging firebaseMessaging, String str, e0.a aVar, String str2) {
        getStore(firebaseMessaging.context).g(firebaseMessaging.getSubtype(), str, str2, firebaseMessaging.metadata.a());
        if (aVar == null || !str2.equals(aVar.f37945a)) {
            firebaseMessaging.lambda$new$1(str2);
        }
        return Tasks.forResult(str2);
    }

    public static /* synthetic */ void c(FirebaseMessaging firebaseMessaging) {
        if (firebaseMessaging.isAutoInitEnabled()) {
            firebaseMessaging.startSyncIfNecessary();
        }
    }

    public static synchronized void clearStoreForTest() {
        synchronized (FirebaseMessaging.class) {
            store = null;
        }
    }

    public static void clearTransportFactoryForTest() {
        transportFactory = new InterfaceC6736b() { // from class: com.google.firebase.messaging.w
            @Override // wb.InterfaceC6736b
            public final Object get() {
                return FirebaseMessaging.i();
            }
        };
    }

    public static /* synthetic */ void d(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            taskCompletionSource.setResult(firebaseMessaging.blockingGetToken());
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    public static /* synthetic */ InterfaceC4046i f() {
        return null;
    }

    @NonNull
    public static synchronized FirebaseMessaging getInstance() {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = getInstance(C4196f.n());
        }
        return firebaseMessaging;
    }

    @NonNull
    private static synchronized e0 getStore(Context context) {
        e0 e0Var;
        synchronized (FirebaseMessaging.class) {
            try {
                if (store == null) {
                    store = new e0(context);
                }
                e0Var = store;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return e0Var;
    }

    private String getSubtype() {
        return "[DEFAULT]".equals(this.firebaseApp.p()) ? "" : this.firebaseApp.r();
    }

    public static InterfaceC4046i getTransportFactory() {
        return (InterfaceC4046i) transportFactory.get();
    }

    public static /* synthetic */ void h(FirebaseMessaging firebaseMessaging, CloudMessage cloudMessage) {
        firebaseMessaging.getClass();
        if (cloudMessage != null) {
            M.y(cloudMessage.g());
            firebaseMessaging.handleProxiedNotificationData();
        }
    }

    private void handleProxiedNotificationData() {
        this.gmsRpc.f().addOnSuccessListener(this.initExecutor, new OnSuccessListener() { // from class: com.google.firebase.messaging.B
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.h(FirebaseMessaging.this, (CloudMessage) obj);
            }
        });
    }

    public static /* synthetic */ InterfaceC4046i i() {
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void initializeProxyNotifications() {
        U.c(this.context);
        W.f(this.context, this.gmsRpc, shouldRetainProxyNotifications());
        if (shouldRetainProxyNotifications()) {
            handleProxiedNotificationData();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: invokeOnTokenRefresh, reason: merged with bridge method [inline-methods] */
    public void lambda$new$1(String str) {
        if ("[DEFAULT]".equals(this.firebaseApp.p())) {
            if (Log.isLoggable(TAG, 3)) {
                this.firebaseApp.p();
            }
            Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
            intent.putExtra("token", str);
            new C3507n(this.context).g(intent);
        }
    }

    public static /* synthetic */ void k(FirebaseMessaging firebaseMessaging, j0 j0Var) {
        if (firebaseMessaging.isAutoInitEnabled()) {
            j0Var.p();
        }
    }

    public static /* synthetic */ void m(FirebaseMessaging firebaseMessaging, TaskCompletionSource taskCompletionSource) {
        firebaseMessaging.getClass();
        try {
            Tasks.await(firebaseMessaging.gmsRpc.c());
            getStore(firebaseMessaging.context).d(firebaseMessaging.getSubtype(), N.c(firebaseMessaging.firebaseApp));
            taskCompletionSource.setResult(null);
        } catch (Exception e10) {
            taskCompletionSource.setException(e10);
        }
    }

    private boolean shouldRetainProxyNotifications() {
        U.c(this.context);
        if (!U.d(this.context)) {
            return false;
        }
        if (this.firebaseApp.j(InterfaceC4371a.class) != null) {
            return true;
        }
        return M.a() && transportFactory != null;
    }

    private synchronized void startSync() {
        if (!this.syncScheduledOrRunning) {
            syncWithDelaySecondsInternal(0L);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void startSyncIfNecessary() {
        if (tokenNeedsRefresh(getTokenWithoutTriggeringSync())) {
            startSync();
        }
    }

    public String blockingGetToken() {
        final e0.a tokenWithoutTriggeringSync = getTokenWithoutTriggeringSync();
        if (!tokenNeedsRefresh(tokenWithoutTriggeringSync)) {
            return tokenWithoutTriggeringSync.f37945a;
        }
        final String c10 = N.c(this.firebaseApp);
        try {
            return (String) Tasks.await(this.requestDeduplicator.b(c10, new Z.a() { // from class: com.google.firebase.messaging.D
                @Override // com.google.firebase.messaging.Z.a
                public final Task start() {
                    Task onSuccessTask;
                    onSuccessTask = r0.gmsRpc.g().onSuccessTask(r0.fileExecutor, new SuccessContinuation() { // from class: com.google.firebase.messaging.y
                        @Override // com.google.android.gms.tasks.SuccessContinuation
                        public final Task then(Object obj) {
                            return FirebaseMessaging.b(FirebaseMessaging.this, r2, r3, (String) obj);
                        }
                    });
                    return onSuccessTask;
                }
            }));
        } catch (InterruptedException | ExecutionException e10) {
            throw new IOException(e10);
        }
    }

    @NonNull
    public Task<Void> deleteToken() {
        if (getTokenWithoutTriggeringSync() == null) {
            return Tasks.forResult(null);
        }
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        AbstractC3508o.e().execute(new Runnable() { // from class: com.google.firebase.messaging.E
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.m(FirebaseMessaging.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    @NonNull
    public boolean deliveryMetricsExportToBigQueryEnabled() {
        return M.a();
    }

    @SuppressLint({"ThreadPoolCreation"})
    public void enqueueTaskWithDelaySeconds(Runnable runnable, long j10) {
        synchronized (FirebaseMessaging.class) {
            try {
                if (syncExecutor == null) {
                    syncExecutor = new ScheduledThreadPoolExecutor(1, new L9.b("TAG"));
                }
                syncExecutor.schedule(runnable, j10, TimeUnit.SECONDS);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public Context getApplicationContext() {
        return this.context;
    }

    @NonNull
    public Task<String> getToken() {
        final TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.initExecutor.execute(new Runnable() { // from class: com.google.firebase.messaging.A
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.d(FirebaseMessaging.this, taskCompletionSource);
            }
        });
        return taskCompletionSource.getTask();
    }

    public e0.a getTokenWithoutTriggeringSync() {
        return getStore(this.context).e(getSubtype(), N.c(this.firebaseApp));
    }

    public Task<j0> getTopicsSubscriberTask() {
        return this.topicsSubscriberTask;
    }

    public boolean isAutoInitEnabled() {
        return this.autoInit.c();
    }

    public boolean isGmsCorePresent() {
        return this.metadata.g();
    }

    public boolean isNotificationDelegationEnabled() {
        return U.d(this.context);
    }

    @Deprecated
    public void send(@NonNull RemoteMessage remoteMessage) {
        if (TextUtils.isEmpty(remoteMessage.Z())) {
            throw new IllegalArgumentException("Missing 'to'");
        }
        Intent intent = new Intent(SEND_INTENT_ACTION);
        Intent intent2 = new Intent();
        intent2.setPackage("com.google.example.invalidpackage");
        intent.putExtra(EXTRA_DUMMY_P_INTENT, PendingIntent.getBroadcast(this.context, 0, intent2, AudioRoutingController.DEVICE_OUT_USB_HEADSET));
        intent.setPackage(GMS_PACKAGE);
        remoteMessage.d0(intent);
        this.context.sendOrderedBroadcast(intent, "com.google.android.gtalkservice.permission.GTALK_SERVICE");
    }

    public void setAutoInitEnabled(boolean z10) {
        this.autoInit.e(z10);
    }

    public void setDeliveryMetricsExportToBigQuery(boolean z10) {
        M.B(z10);
        W.f(this.context, this.gmsRpc, shouldRetainProxyNotifications());
    }

    @NonNull
    public Task<Void> setNotificationDelegationEnabled(boolean z10) {
        return U.e(this.initExecutor, this.context, z10).addOnSuccessListener(new ExecutorC6789k(), new OnSuccessListener() { // from class: com.google.firebase.messaging.z
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                W.f(r0.context, r0.gmsRpc, FirebaseMessaging.this.shouldRetainProxyNotifications());
            }
        });
    }

    public synchronized void setSyncScheduledOrRunning(boolean z10) {
        this.syncScheduledOrRunning = z10;
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> subscribeToTopic(@NonNull final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.r
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task q10;
                q10 = ((j0) obj).q(str);
                return q10;
            }
        });
    }

    public synchronized void syncWithDelaySecondsInternal(long j10) {
        enqueueTaskWithDelaySeconds(new f0(this, Math.min(Math.max(MIN_DELAY_SEC, 2 * j10), MAX_DELAY_SEC)), j10);
        this.syncScheduledOrRunning = true;
    }

    public boolean tokenNeedsRefresh(e0.a aVar) {
        return aVar == null || aVar.b(this.metadata.a());
    }

    @NonNull
    @SuppressLint({"TaskMainThread"})
    public Task<Void> unsubscribeFromTopic(@NonNull final String str) {
        return this.topicsSubscriberTask.onSuccessTask(new SuccessContinuation() { // from class: com.google.firebase.messaging.C
            @Override // com.google.android.gms.tasks.SuccessContinuation
            public final Task then(Object obj) {
                Task t10;
                t10 = ((j0) obj).t(str);
                return t10;
            }
        });
    }

    @NonNull
    @Keep
    public static synchronized FirebaseMessaging getInstance(@NonNull C4196f c4196f) {
        FirebaseMessaging firebaseMessaging;
        synchronized (FirebaseMessaging.class) {
            firebaseMessaging = (FirebaseMessaging) c4196f.j(FirebaseMessaging.class);
            AbstractC3191o.n(firebaseMessaging, "Firebase Messaging component is not present");
        }
        return firebaseMessaging;
    }

    public FirebaseMessaging(C4196f c4196f, InterfaceC6681a interfaceC6681a, InterfaceC6736b interfaceC6736b, InterfaceC6736b interfaceC6736b2, com.google.firebase.installations.h hVar, InterfaceC6736b interfaceC6736b3, InterfaceC6459d interfaceC6459d, N n10) {
        this(c4196f, interfaceC6681a, interfaceC6736b3, interfaceC6459d, n10, new I(c4196f, n10, interfaceC6736b, interfaceC6736b2, hVar), AbstractC3508o.f(), AbstractC3508o.c(), AbstractC3508o.b());
    }

    public FirebaseMessaging(C4196f c4196f, InterfaceC6681a interfaceC6681a, InterfaceC6736b interfaceC6736b, InterfaceC6459d interfaceC6459d, N n10, I i10, Executor executor, Executor executor2, Executor executor3) {
        this.syncScheduledOrRunning = false;
        transportFactory = interfaceC6736b;
        this.firebaseApp = c4196f;
        this.autoInit = new a(interfaceC6459d);
        Context l10 = c4196f.l();
        this.context = l10;
        C3510q c3510q = new C3510q();
        this.lifecycleCallbacks = c3510q;
        this.metadata = n10;
        this.gmsRpc = i10;
        this.requestDeduplicator = new Z(executor);
        this.initExecutor = executor2;
        this.fileExecutor = executor3;
        Context l11 = c4196f.l();
        if (l11 instanceof Application) {
            ((Application) l11).registerActivityLifecycleCallbacks(c3510q);
        } else {
            Log.w(TAG, "Context " + l11 + " was not an application, can't register for lifecycle callbacks. Some notification events may be dropped as a result.");
        }
        if (interfaceC6681a != null) {
            interfaceC6681a.a(new InterfaceC6681a.InterfaceC0940a() { // from class: com.google.firebase.messaging.s
            });
        }
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.t
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.c(FirebaseMessaging.this);
            }
        });
        Task<j0> f10 = j0.f(this, n10, i10, l10, AbstractC3508o.g());
        this.topicsSubscriberTask = f10;
        f10.addOnSuccessListener(executor2, new OnSuccessListener() { // from class: com.google.firebase.messaging.u
            @Override // com.google.android.gms.tasks.OnSuccessListener
            public final void onSuccess(Object obj) {
                FirebaseMessaging.k(FirebaseMessaging.this, (j0) obj);
            }
        });
        executor2.execute(new Runnable() { // from class: com.google.firebase.messaging.v
            @Override // java.lang.Runnable
            public final void run() {
                FirebaseMessaging.this.initializeProxyNotifications();
            }
        });
    }
}
