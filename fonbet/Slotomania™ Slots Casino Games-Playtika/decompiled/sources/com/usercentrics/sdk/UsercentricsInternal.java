package com.usercentrics.sdk;

import android.content.Context;
import com.ironsource.C2608q2;
import com.unity3d.services.ads.gmascar.bridges.mobileads.MobileAdsBridgeBase;
import com.unity3d.services.core.fid.Constants;
import com.usercentrics.sdk.UsercentricsInstanceState;
import com.usercentrics.sdk.core.application.Application;
import com.usercentrics.sdk.core.application.UsercentricsApplication;
import com.usercentrics.sdk.errors.InitializationFailedException;
import com.usercentrics.sdk.errors.InvalidIdException;
import com.usercentrics.sdk.errors.UsercentricsError;
import com.usercentrics.sdk.errors.UsercentricsException;
import com.usercentrics.sdk.log.UsercentricsLogger;
import com.usercentrics.sdk.v2.async.dispatcher.Dispatcher;
import io.sentry.SentryEvent;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: UsercentricsInternal.kt */
@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0003\n\u0000\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J \u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0002J \u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bH\u0002J\u001b\u0010\u001d\u001a\u00020\u00142\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00040\u0012H\u0002¢\u0006\u0002\u0010\u001fJ\u0010\u0010 \u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u001e\u0010!\u001a\u00020\u00142\u0006\u0010\u0017\u001a\u00020\u00182\u000e\u0010\u0019\u001a\n\u0018\u00010\u001aj\u0004\u0018\u0001`\u001bJ\u0016\u0010\"\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$H\u0082@¢\u0006\u0002\u0010%J \u0010&\u001a\u00020\u00142\u0006\u0010'\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\t2\u0006\u0010(\u001a\u00020)H\u0002J.\u0010*\u001a\u00020\u00142\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020-\u0012\u0004\u0012\u00020\u00140,2\u0012\u0010.\u001a\u000e\u0012\u0004\u0012\u00020/\u0012\u0004\u0012\u00020\u00140,J\u0018\u00100\u001a\u00020\u00142\u0006\u0010#\u001a\u00020$2\u0006\u00101\u001a\u00020$H\u0002J\u0010\u00102\u001a\u00020\u00142\u0006\u00103\u001a\u00020$H\u0002J\u0006\u00104\u001a\u00020\u0014J\b\u00105\u001a\u00020\u0014H\u0002J\u0010\u00106\u001a\u00020\u00182\u0006\u0010\u0017\u001a\u00020\u0018H\u0002J\u0012\u00107\u001a\u00020$2\b\u00108\u001a\u0004\u0018\u000109H\u0002R\"\u0010\u0005\u001a\u0004\u0018\u00010\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0004@BX\u0080\u000e¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\f\u001a\u00020\u00048F¢\u0006\u0006\u001a\u0004\b\r\u0010\u0007R\u0018\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u000e@BX\u0082\u000e¢\u0006\u0002\n\u0000R\u001a\u0010\u0010\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\u00120\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R(\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\u000e\u0010\u0003\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013@BX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006:"}, d2 = {"Lcom/usercentrics/sdk/UsercentricsInternal;", "", "()V", "<set-?>", "Lcom/usercentrics/sdk/UsercentricsSDK;", "_instance", "get_instance$usercentrics_release", "()Lcom/usercentrics/sdk/UsercentricsSDK;", "application", "Lcom/usercentrics/sdk/core/application/Application;", "getApplication", "()Lcom/usercentrics/sdk/core/application/Application;", C2608q2.p, Constants.GET_INSTANCE, "", "isInitializing", "isReadyObservable", "Lcom/usercentrics/sdk/Observable;", "Lkotlin/Result;", "Lkotlin/Function0;", "", "onOngoingInitializationFinish", "bootApplication", "options", "Lcom/usercentrics/sdk/UsercentricsOptions;", "context", "Landroid/content/Context;", "Lcom/usercentrics/sdk/UsercentricsContext;", "doInitialize", "finishInitialization", "result", "(Ljava/lang/Object;)V", "fixTimeoutValuesIfNeeded", MobileAdsBridgeBase.initializeMethodName, "initializeSDKOffline", "initializeOnlineError", "Lcom/usercentrics/sdk/errors/UsercentricsException;", "(Lcom/usercentrics/sdk/errors/UsercentricsException;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initializeSDKOnline", "usercentrics", "timeout", "", "isReady", "onSuccess", "Lkotlin/Function1;", "Lcom/usercentrics/sdk/UsercentricsReadyStatus;", "onFailure", "Lcom/usercentrics/sdk/errors/UsercentricsError;", "onFailureInitializingSDKOffline", "offlineException", "onFailureInitializingSDKOnline", SentryEvent.JsonKeys.EXCEPTION, "reset", "resetToInitializeAgain", "validateOptions", "wrapAsUsercentricsException", "throwable", "", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class UsercentricsInternal {
    private static volatile UsercentricsSDK _instance;
    private static boolean isInitializing;
    private static Function0<Unit> onOngoingInitializationFinish;
    public static final UsercentricsInternal INSTANCE = new UsercentricsInternal();
    private static final Observable<Result<UsercentricsSDK>> isReadyObservable = new Observable<>();

    private UsercentricsInternal() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Application getApplication() {
        UsercentricsApplication instance$usercentrics_release = UsercentricsApplication.INSTANCE.getInstance$usercentrics_release();
        if (instance$usercentrics_release != null) {
            return instance$usercentrics_release.getApplication();
        }
        return null;
    }

    public final UsercentricsSDK get_instance$usercentrics_release() {
        return _instance;
    }

    public final UsercentricsSDK getInstance() {
        UsercentricsInstanceState from = UsercentricsInstanceState.INSTANCE.from(_instance, isReadyObservable.getValue());
        if (from instanceof UsercentricsInstanceState.Invalid) {
            throw ((UsercentricsInstanceState.Invalid) from).getCause();
        }
        if (from instanceof UsercentricsInstanceState.Valid) {
            return ((UsercentricsInstanceState.Valid) from).getValue();
        }
        throw new NoWhenBranchMatchedException();
    }

    public final void isReady(final Function1<? super UsercentricsReadyStatus, Unit> onSuccess, final Function1<? super UsercentricsError, Unit> onFailure) {
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        isReadyObservable.subscribe(new Function1<Result<? extends UsercentricsSDK>, Unit>() { // from class: com.usercentrics.sdk.UsercentricsInternal$isReady$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Result<? extends UsercentricsSDK> result) {
                m10584invoke(result.getValue());
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: collision with other method in class */
            public final void m10584invoke(Object obj) {
                Object obj2;
                Function1<UsercentricsReadyStatus, Unit> function1 = onSuccess;
                Function1<UsercentricsError, Unit> function12 = onFailure;
                if (Result.m11187isSuccessimpl(obj)) {
                    UsercentricsSDK usercentricsSDK = (UsercentricsSDK) obj;
                    try {
                        Result.Companion companion = Result.INSTANCE;
                        obj2 = Result.m11180constructorimpl(usercentricsSDK.readyStatus$usercentrics_release());
                    } catch (Throwable th) {
                        Result.Companion companion2 = Result.INSTANCE;
                        obj2 = Result.m11180constructorimpl(ResultKt.createFailure(th));
                    }
                    if (Result.m11187isSuccessimpl(obj2)) {
                        function1.invoke((UsercentricsReadyStatus) obj2);
                    }
                    Throwable m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj2);
                    if (m11183exceptionOrNullimpl != null) {
                        String message = m11183exceptionOrNullimpl.getMessage();
                        if (message == null) {
                            message = "";
                        }
                        function12.invoke(new UsercentricsError(new UsercentricsException(message, m11183exceptionOrNullimpl)));
                    }
                }
                Function1<UsercentricsError, Unit> function13 = onFailure;
                Throwable m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj);
                if (m11183exceptionOrNullimpl2 != null) {
                    Intrinsics.checkNotNull(m11183exceptionOrNullimpl2, "null cannot be cast to non-null type com.usercentrics.sdk.errors.UsercentricsException");
                    function13.invoke(((UsercentricsException) m11183exceptionOrNullimpl2).asError$usercentrics_release());
                }
            }
        });
    }

    public final void initialize(final UsercentricsOptions options, final Context context) {
        Intrinsics.checkNotNullParameter(options, "options");
        if (!isInitializing) {
            doInitialize(options, context);
        } else {
            onOngoingInitializationFinish = new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsInternal$initialize$1
                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                    Application application;
                    UsercentricsLogger logger;
                    application = UsercentricsInternal.INSTANCE.getApplication();
                    if (application != null && (logger = application.getLogger()) != null) {
                        UsercentricsLogger.DefaultImpls.warning$default(logger, "Initialize is being invoked more than once, make sure this is the intended behaviour.", null, 2, null);
                    }
                    UsercentricsInternal.INSTANCE.doInitialize(UsercentricsOptions.this, context);
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doInitialize(UsercentricsOptions options, Context context) {
        if (_instance != null) {
            resetToInitializeAgain();
        }
        isInitializing = true;
        try {
            UsercentricsOptions validateOptions = validateOptions(UsercentricsOptions.copy$usercentrics_release$default(options, null, null, null, 0L, null, null, null, false, null, 0L, 1023, null));
            Application bootApplication = bootApplication(validateOptions, context);
            UsercentricsSDK provide = SDKProviderKt.getUsercentricsProvider().provide(bootApplication, validateOptions, context);
            _instance = provide;
            initializeSDKOnline(provide, bootApplication, options.getInitTimeoutMillis());
        } catch (Exception e) {
            Result.Companion companion = Result.INSTANCE;
            finishInitialization(Result.m11180constructorimpl(ResultKt.createFailure(e)));
        }
    }

    private final UsercentricsOptions validateOptions(UsercentricsOptions options) {
        boolean isSelfHostedConfigurationInvalid$usercentrics_release = options.isSelfHostedConfigurationInvalid$usercentrics_release();
        if (!((!StringsKt.isBlank(options.getSettingsId())) ^ (!StringsKt.isBlank(options.getRuleSetId())))) {
            throw new InvalidIdException();
        }
        if (isSelfHostedConfigurationInvalid$usercentrics_release) {
            throw new UsercentricsException("Defined self hosting domains are not valid. Please validate them!", null, 2, null);
        }
        return fixTimeoutValuesIfNeeded(options);
    }

    private final UsercentricsOptions fixTimeoutValuesIfNeeded(UsercentricsOptions options) {
        if (options.getTimeoutMillis() <= 0) {
            options.setTimeoutMillis(10000L);
        }
        if (options.getInitTimeoutMillis() < 5000) {
            options.setInitTimeoutMillis(5000L);
        }
        return options;
    }

    private final Application bootApplication(UsercentricsOptions options, Context context) {
        UsercentricsApplication.INSTANCE.setInitialValues(options, context);
        Application provide = UsercentricsApplication.INSTANCE.provide();
        provide.boot();
        return provide;
    }

    private final void initializeSDKOnline(UsercentricsSDK usercentrics, Application application, long timeout) {
        application.getDispatcher().dispatchWithTimeout(timeout, new UsercentricsInternal$initializeSDKOnline$1(application.getEtagCacheStorage().getValue(), usercentrics, null)).onFailure(new Function1<Throwable, Unit>() { // from class: com.usercentrics.sdk.UsercentricsInternal$initializeSDKOnline$2
            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(Throwable th) {
                invoke2(th);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(Throwable it) {
                UsercentricsException wrapAsUsercentricsException;
                Intrinsics.checkNotNullParameter(it, "it");
                UsercentricsInternal usercentricsInternal = UsercentricsInternal.INSTANCE;
                wrapAsUsercentricsException = UsercentricsInternal.INSTANCE.wrapAsUsercentricsException(it);
                usercentricsInternal.onFailureInitializingSDKOnline(wrapAsUsercentricsException);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001a, code lost:
    
        if (r0 == null) goto L14;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final UsercentricsException wrapAsUsercentricsException(Throwable throwable) {
        String th;
        if (throwable instanceof UsercentricsException) {
            return (UsercentricsException) throwable;
        }
        if (throwable != null && (th = throwable.getMessage()) != null) {
            if (StringsKt.isBlank(th)) {
                th = null;
            }
        }
        th = throwable != null ? throwable.toString() : "Unknown error";
        return new UsercentricsException(th, throwable);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onFailureInitializingSDKOnline(UsercentricsException exception) {
        Application application = getApplication();
        if (application == null) {
            return;
        }
        application.getLogger().warning("Usercentrics SDK was not able to initialize online, let's try to initialize offline", exception);
        application.getDispatcher().dispatch(new UsercentricsInternal$onFailureInitializingSDKOnline$1(application, exception, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0075  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object initializeSDKOffline(UsercentricsException usercentricsException, Continuation<? super Unit> continuation) {
        UsercentricsInternal$initializeSDKOffline$1 usercentricsInternal$initializeSDKOffline$1;
        int i;
        UsercentricsSDK usercentricsSDK;
        Object mo10585initializegIAlus$usercentrics_release;
        UsercentricsInternal usercentricsInternal;
        if (continuation instanceof UsercentricsInternal$initializeSDKOffline$1) {
            usercentricsInternal$initializeSDKOffline$1 = (UsercentricsInternal$initializeSDKOffline$1) continuation;
            if ((usercentricsInternal$initializeSDKOffline$1.label & Integer.MIN_VALUE) != 0) {
                usercentricsInternal$initializeSDKOffline$1.label -= Integer.MIN_VALUE;
                Object obj = usercentricsInternal$initializeSDKOffline$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i = usercentricsInternal$initializeSDKOffline$1.label;
                if (i != 0) {
                    ResultKt.throwOnFailure(obj);
                    usercentricsSDK = _instance;
                    if (usercentricsSDK == null) {
                        return Unit.INSTANCE;
                    }
                    usercentricsInternal$initializeSDKOffline$1.L$0 = this;
                    usercentricsInternal$initializeSDKOffline$1.L$1 = usercentricsException;
                    usercentricsInternal$initializeSDKOffline$1.L$2 = usercentricsSDK;
                    usercentricsInternal$initializeSDKOffline$1.label = 1;
                    mo10585initializegIAlus$usercentrics_release = usercentricsSDK.mo10585initializegIAlus$usercentrics_release(true, usercentricsInternal$initializeSDKOffline$1);
                    if (mo10585initializegIAlus$usercentrics_release == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    usercentricsInternal = this;
                } else {
                    if (i != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    UsercentricsSDK usercentricsSDK2 = (UsercentricsSDK) usercentricsInternal$initializeSDKOffline$1.L$2;
                    UsercentricsException usercentricsException2 = (UsercentricsException) usercentricsInternal$initializeSDKOffline$1.L$1;
                    UsercentricsInternal usercentricsInternal2 = (UsercentricsInternal) usercentricsInternal$initializeSDKOffline$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    Object value = ((Result) obj).getValue();
                    usercentricsSDK = usercentricsSDK2;
                    usercentricsException = usercentricsException2;
                    usercentricsInternal = usercentricsInternal2;
                    mo10585initializegIAlus$usercentrics_release = value;
                }
                if (!Result.m11187isSuccessimpl(mo10585initializegIAlus$usercentrics_release)) {
                    Result.Companion companion = Result.INSTANCE;
                    usercentricsInternal.finishInitialization(Result.m11180constructorimpl(usercentricsSDK));
                    return Unit.INSTANCE;
                }
                usercentricsInternal.onFailureInitializingSDKOffline(usercentricsException, new UsercentricsException("", Result.m11183exceptionOrNullimpl(mo10585initializegIAlus$usercentrics_release)));
                return Unit.INSTANCE;
            }
        }
        usercentricsInternal$initializeSDKOffline$1 = new UsercentricsInternal$initializeSDKOffline$1(this, continuation);
        Object obj2 = usercentricsInternal$initializeSDKOffline$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = usercentricsInternal$initializeSDKOffline$1.label;
        if (i != 0) {
        }
        if (!Result.m11187isSuccessimpl(mo10585initializegIAlus$usercentrics_release)) {
        }
    }

    private final void onFailureInitializingSDKOffline(UsercentricsException initializeOnlineError, UsercentricsException offlineException) {
        UsercentricsLogger logger;
        Application application = getApplication();
        if (application != null && (logger = application.getLogger()) != null) {
            logger.warning("Usercentrics SDK was not able to initialize offline, cannot initialize, please make sure the internet connection is fine and retry", offlineException);
        }
        Result.Companion companion = Result.INSTANCE;
        finishInitialization(Result.m11180constructorimpl(ResultKt.createFailure(new InitializationFailedException(initializeOnlineError))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void finishInitialization(final Object result) {
        Dispatcher dispatcher;
        Application application;
        UsercentricsLogger logger;
        if (Result.m11187isSuccessimpl(result) && (application = getApplication()) != null && (logger = application.getLogger()) != null) {
            UsercentricsLogger.DefaultImpls.debug$default(logger, "Usercentrics SDK is fully initialized", null, 2, null);
        }
        Function0<Unit> function0 = onOngoingInitializationFinish;
        onOngoingInitializationFinish = null;
        isInitializing = false;
        if (function0 != null) {
            function0.invoke();
            return;
        }
        isReadyObservable.set(Result.m11179boximpl(result));
        Application application2 = getApplication();
        if (application2 == null || (dispatcher = application2.getDispatcher()) == null) {
            return;
        }
        dispatcher.dispatchMain(new Function0<Unit>() { // from class: com.usercentrics.sdk.UsercentricsInternal$finishInitialization$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
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
                Observable observable;
                observable = UsercentricsInternal.isReadyObservable;
                observable.emit(Result.m11179boximpl(result));
            }
        });
    }

    public final void reset() {
        UsercentricsApplication.INSTANCE.tearDown(true);
        UsercentricsEvent.INSTANCE.tearDown$usercentrics_release();
        isReadyObservable.disposeAll();
        _instance = null;
        isInitializing = false;
        onOngoingInitializationFinish = null;
    }

    private final void resetToInitializeAgain() {
        UsercentricsApplication.INSTANCE.tearDown(false);
        UsercentricsEvent.INSTANCE.tearDown$usercentrics_release();
        isReadyObservable.disposeValue();
        _instance = null;
    }
}
