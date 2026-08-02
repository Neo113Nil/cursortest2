package ai.verisoul.sdk;

import Ph.AbstractC1455i;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.C1469p;
import Ph.InterfaceC1465n;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X;
import Ph.X0;
import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityHelper;
import ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandler;
import ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper;
import ai.verisoul.sdk.helpers.sensor.TouchEventValidator;
import ai.verisoul.sdk.helpers.sensor.accelerometer.AccelerometerHelper;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.helpers.webview.VerisoulSessionCallback;
import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.view.MotionEvent;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0006J*\u0010\u000e\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\b\u0010\f\u001a\u0004\u0018\u00010\u000bH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0017\u0010\u001a\u001a\u00020\r2\u0006\u0010\u0017\u001a\u00020\tH\u0000¢\u0006\u0004\b\u0018\u0010\u0019J%\u0010 \u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001f\u001a\u00020\t¢\u0006\u0004\b \u0010!J\u0015\u0010\"\u001a\u00020\r2\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\"\u0010#J\u0013\u0010%\u001a\b\u0012\u0004\u0012\u00020\r0$¢\u0006\u0004\b%\u0010&J\r\u0010'\u001a\u00020\r¢\u0006\u0004\b'\u0010\u0003J\u0018\u0010)\u001a\u00020\u00142\u0006\u0010(\u001a\u00020\tH\u0086@¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\r2\b\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.R\u0018\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010/R\u0016\u00100\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u00101R\u0018\u00102\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0014\u00104\u001a\u00020\t8\u0002X\u0082T¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082T¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u00109\u001a\u0002068\u0006X\u0086T¢\u0006\u0006\n\u0004\b9\u00108R\u001b\u0010?\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R\u001b\u0010D\u001a\u00020@8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u0010<\u001a\u0004\bB\u0010CR\u001b\u0010I\u001a\u00020E8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bF\u0010<\u001a\u0004\bG\u0010HR\u001b\u0010N\u001a\u00020J8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bK\u0010<\u001a\u0004\bL\u0010MR\u001b\u0010S\u001a\u00020O8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bP\u0010<\u001a\u0004\bQ\u0010RR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001e\u0010TR\u0016\u0010\u001f\u001a\u00020\t8\u0002@\u0002X\u0082.¢\u0006\u0006\n\u0004\b\u001f\u00105R\u0016\u0010U\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bU\u00101R\u0018\u0010V\u001a\u0004\u0018\u00010\t8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bV\u00105R\u0016\u0010W\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bW\u00108R\u0016\u0010X\u001a\u0002068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bX\u00108R\u0014\u0010Y\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u0018\u0010\\\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0018\u0010_\u001a\u0004\u0018\u00010^8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010b\u001a\u00020a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010c¨\u0006d"}, d2 = {"Lai/verisoul/sdk/Core;", "", "<init>", "()V", "LPh/P;", "getOrCreateScope", "()LPh/P;", "Lai/verisoul/sdk/helpers/webview/VerisoulSessionCallback;", "callback", "", "message", "", "cause", "", "failCallback", "(Lai/verisoul/sdk/helpers/webview/VerisoulSessionCallback;Ljava/lang/String;Ljava/lang/Throwable;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "throwable", "Lai/verisoul/sdk/VerisoulException;", "findVerisoulException", "(Ljava/lang/Throwable;)Lai/verisoul/sdk/VerisoulException;", "", "acquireDebounce", "()Z", StackTraceHelper.ID_KEY, "updateCurrentSessionId$sdk_release", "(Ljava/lang/String;)V", "updateCurrentSessionId", "Landroid/content/Context;", "appContext", "Lai/verisoul/sdk/VerisoulEnvironment;", "deploymentEnvironment", "projectIdentifier", "init", "(Landroid/content/Context;Lai/verisoul/sdk/VerisoulEnvironment;Ljava/lang/String;)V", "getSessionId", "(Lai/verisoul/sdk/helpers/webview/VerisoulSessionCallback;)V", "LPh/X;", "reinitialize", "()LPh/X;", "shutdown", "sessionId", "collectNativeDataAndPost", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroid/view/MotionEvent;", "userMotionEvent", "onTouchEvent", "(Landroid/view/MotionEvent;)V", "Landroid/content/Context;", "isLoading", "Z", "dataCollected", "Ljava/lang/Boolean;", "logTag", "Ljava/lang/String;", "", "debounceIntervalMillis", "J", "sensorDataTimeout", "Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", "userInteractionHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "getUserInteractionHelper", "()Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", "userInteractionHelper", "Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", "deviceMotionHelper$delegate", "getDeviceMotionHelper", "()Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", "deviceMotionHelper", "Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandler;", "deviceDataCollector$delegate", "getDeviceDataCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandler;", "deviceDataCollector", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", "appIntegrityHelper$delegate", "getAppIntegrityHelper", "()Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", "appIntegrityHelper", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper$delegate", "getSessionHelper", "()Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper", "Lai/verisoul/sdk/VerisoulEnvironment;", "isCoreInitialized", "currentSessionId", "coreInitializationTimestamp", "lastReinitTimeMillis", "debounceLock", "Ljava/lang/Object;", "scopeLock", "scope", "LPh/P;", "LPh/C0;", "initializationJob", "LPh/C0;", "LPh/M;", "exceptionHandler", "LPh/M;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nCore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Core.kt\nai/verisoul/sdk/Core\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,329:1\n1#2:330\n314#3,11:331\n67#4:342\n67#4:343\n67#4:344\n67#4:345\n67#4:346\n48#5,4:347\n*S KotlinDebug\n*F\n+ 1 Core.kt\nai/verisoul/sdk/Core\n*L\n271#1:331,11\n28#1:342\n29#1:343\n30#1:344\n31#1:345\n32#1:346\n48#1:347,4\n*E\n"})
/* loaded from: classes.dex */
public final class Core {

    @Nullable
    private static Context appContext = null;
    private static long coreInitializationTimestamp = 0;

    @Nullable
    private static String currentSessionId = null;

    @Nullable
    private static Boolean dataCollected = null;
    private static final long debounceIntervalMillis = 1000;
    private static VerisoulEnvironment deploymentEnvironment = null;

    @Nullable
    private static volatile C0 initializationJob = null;
    private static boolean isCoreInitialized = false;
    private static boolean isLoading = false;
    private static long lastReinitTimeMillis = 0;

    @NotNull
    private static final String logTag = "Verisoul-[Core]";
    private static String projectIdentifier = null;

    @Nullable
    private static P scope = null;
    public static final long sensorDataTimeout = 300000;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(Core.class, "userInteractionHelper", "getUserInteractionHelper()Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", 0)), Reflection.property1(new PropertyReference1Impl(Core.class, "deviceMotionHelper", "getDeviceMotionHelper()Lai/verisoul/sdk/helpers/sensor/accelerometer/AccelerometerHelper;", 0)), Reflection.property1(new PropertyReference1Impl(Core.class, "deviceDataCollector", "getDeviceDataCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandler;", 0)), Reflection.property1(new PropertyReference1Impl(Core.class, "appIntegrityHelper", "getAppIntegrityHelper()Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", 0)), Reflection.property1(new PropertyReference1Impl(Core.class, "sessionHelper", "getSessionHelper()Lai/verisoul/sdk/helpers/session/SessionHelper;", 0))};

    @NotNull
    public static final Core INSTANCE = new Core();

    /* renamed from: userInteractionHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InjectDelegate userInteractionHelper = new InjectDelegate(GatherUserEventsHelper.class);

    /* renamed from: deviceMotionHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InjectDelegate deviceMotionHelper = new InjectDelegate(AccelerometerHelper.class);

    /* renamed from: deviceDataCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InjectDelegate deviceDataCollector = new InjectDelegate(DeviceDataCollectorHandler.class);

    /* renamed from: appIntegrityHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InjectDelegate appIntegrityHelper = new InjectDelegate(AppIntegrityHelper.class);

    /* renamed from: sessionHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InjectDelegate sessionHelper = new InjectDelegate(SessionHelper.class);

    @NotNull
    private static final Object debounceLock = new Object();

    @NotNull
    private static final Object scopeLock = new Object();

    @NotNull
    private static final M exceptionHandler = new Core$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2);

    private Core() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean acquireDebounce() {
        boolean z10;
        synchronized (debounceLock) {
            long currentTimeMillis = System.currentTimeMillis();
            if (currentTimeMillis - lastReinitTimeMillis < debounceIntervalMillis) {
                z10 = false;
            } else {
                lastReinitTimeMillis = currentTimeMillis;
                z10 = true;
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object failCallback(VerisoulSessionCallback verisoulSessionCallback, String str, Throwable th2, Continuation<? super Unit> continuation) {
        Object g10 = AbstractC1455i.g(C1452g0.c(), new Core$failCallback$2(verisoulSessionCallback, str, th2, null), continuation);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final VerisoulException findVerisoulException(Throwable throwable) {
        while (throwable != null) {
            if (throwable instanceof VerisoulException) {
                return (VerisoulException) throwable;
            }
            throwable = throwable.getCause();
        }
        return null;
    }

    private final AppIntegrityHelper getAppIntegrityHelper() {
        return (AppIntegrityHelper) appIntegrityHelper.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataCollectorHandler getDeviceDataCollector() {
        return (DeviceDataCollectorHandler) deviceDataCollector.getValue(this, $$delegatedProperties[2]);
    }

    private final AccelerometerHelper getDeviceMotionHelper() {
        return (AccelerometerHelper) deviceMotionHelper.getValue(this, $$delegatedProperties[1]);
    }

    private final P getOrCreateScope() {
        P p10;
        synchronized (scopeLock) {
            p10 = scope;
            if (p10 == null) {
                p10 = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(exceptionHandler));
                scope = p10;
            }
        }
        return p10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SessionHelper getSessionHelper() {
        return (SessionHelper) sessionHelper.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GatherUserEventsHelper getUserInteractionHelper() {
        return (GatherUserEventsHelper) userInteractionHelper.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final Object collectNativeDataAndPost(@NotNull String str, @NotNull Continuation<? super Boolean> continuation) {
        final C1469p c1469p = new C1469p(IntrinsicsKt.intercepted(continuation), 1);
        c1469p.F();
        DeviceDataCollectorHandler deviceDataCollector2 = INSTANCE.getDeviceDataCollector();
        String str2 = projectIdentifier;
        if (str2 == null) {
            Intrinsics.throwUninitializedPropertyAccessException("projectIdentifier");
            str2 = null;
        }
        deviceDataCollector2.collectNativeDeviceData(str, str2, new Function1<Exception, Unit>() { // from class: ai.verisoul.sdk.Core$collectNativeDataAndPost$2$1
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Exception exc) {
                invoke2(exc);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(@NotNull Exception ex) {
                Intrinsics.checkNotNullParameter(ex, "ex");
                if (InterfaceC1465n.this.isActive()) {
                    InterfaceC1465n interfaceC1465n = InterfaceC1465n.this;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(ResultKt.createFailure(ex)));
                }
                Logger.INSTANCE.error("Verisoul-[Core]", "Failed to collect native data: " + ex.getMessage());
            }
        }, new Function0<Unit>() { // from class: ai.verisoul.sdk.Core$collectNativeDataAndPost$2$2
            {
                super(0);
            }

            @Override // kotlin.jvm.functions.Function0
            public /* bridge */ /* synthetic */ Unit invoke() {
                invoke2();
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2() {
                if (InterfaceC1465n.this.isActive()) {
                    InterfaceC1465n interfaceC1465n = InterfaceC1465n.this;
                    Result.Companion companion = Result.INSTANCE;
                    interfaceC1465n.resumeWith(Result.m147constructorimpl(Boolean.TRUE));
                }
            }
        });
        Object z10 = c1469p.z();
        if (z10 == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return z10;
    }

    public final void getSessionId(@NotNull VerisoulSessionCallback callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        if (isCoreInitialized) {
            AbstractC1459k.d(getOrCreateScope(), null, null, new Core$getSessionId$1(callback, 4, null), 3, null);
        } else {
            Logger.INSTANCE.error(logTag, "Verisoul.init() must be called before getSessionId()");
            callback.onFailure(new VerisoulException(VerisoulErrorCodes.SESSION_UNAVAILABLE, "Verisoul.init() must be called before getSessionId()", null, 4, null));
        }
    }

    public final void init(@NotNull Context appContext2, @NotNull VerisoulEnvironment deploymentEnvironment2, @NotNull String projectIdentifier2) {
        C0 d10;
        Intrinsics.checkNotNullParameter(appContext2, "appContext");
        Intrinsics.checkNotNullParameter(deploymentEnvironment2, "deploymentEnvironment");
        Intrinsics.checkNotNullParameter(projectIdentifier2, "projectIdentifier");
        if (isCoreInitialized) {
            Logger.INSTANCE.error(logTag, "Verisoul.init() only needs to be called once");
            return;
        }
        appContext = appContext2.getApplicationContext();
        deploymentEnvironment = deploymentEnvironment2;
        projectIdentifier = projectIdentifier2;
        coreInitializationTimestamp = System.currentTimeMillis();
        isCoreInitialized = true;
        d10 = AbstractC1459k.d(getOrCreateScope(), null, null, new Core$init$1(projectIdentifier2, deploymentEnvironment2, null), 3, null);
        initializationJob = d10;
    }

    public final void onTouchEvent(@Nullable MotionEvent userMotionEvent) {
        if (userMotionEvent == null) {
            return;
        }
        try {
            if (!TouchEventValidator.INSTANCE.isValid(userMotionEvent)) {
                Logger.INSTANCE.error(logTag, "Invalid MotionEvent, skipping touch event");
                return;
            }
            String str = currentSessionId;
            if (str == null) {
                Logger.INSTANCE.info(logTag, "No session ID, skipping touch event");
            } else {
                AbstractC1459k.d(getOrCreateScope(), C1452g0.a(), null, new Core$onTouchEvent$1(userMotionEvent, str, null), 2, null);
            }
        } catch (Throwable th2) {
            Logger.INSTANCE.error(logTag, "Failed to handle touch event: " + th2.getMessage());
        }
    }

    @NotNull
    public final X reinitialize() {
        X b10;
        b10 = AbstractC1459k.b(getOrCreateScope(), null, null, new Core$reinitialize$1(null), 3, null);
        return b10;
    }

    public final void shutdown() {
        synchronized (scopeLock) {
            try {
                P p10 = scope;
                if (p10 != null) {
                    Q.f(p10, null, 1, null);
                }
                scope = null;
                initializationJob = null;
                Unit unit = Unit.INSTANCE;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        SessionManager.INSTANCE.shutdown();
        isCoreInitialized = false;
        currentSessionId = null;
        Logger.INSTANCE.info(logTag, "Core shutdown completed");
    }

    public final synchronized void updateCurrentSessionId$sdk_release(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        currentSessionId = id2;
    }
}
