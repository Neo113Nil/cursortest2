package ai.verisoul.sdk.helpers.integrity;

import ai.verisoul.sdk.helpers.integrity.AppIntegrityResult;
import ai.verisoul.sdk.logger.Logger;
import android.content.Context;
import android.os.SystemClock;
import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.Task;
import com.google.android.play.core.integrity.IntegrityManagerFactory;
import com.google.android.play.core.integrity.StandardIntegrityException;
import com.google.android.play.core.integrity.StandardIntegrityManager;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.SafeContinuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugProbesKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u001a\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0096@¢\u0006\u0002\u0010\u0011J\u000e\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u001a\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0002\u0010\u0011J.\u0010\u0016\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f0\u001cH\u0002J*\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00142\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000f0\u001cH\u0002J$\u0010\u001f\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020 2\u0012\u0010\u001b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100!0\u001cH\u0002J.\u0010\"\u001a\u00020\u00172\n\u0010\u0018\u001a\u00060\u0019j\u0002`\u001a2\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000f0\u001cH\u0002J*\u0010#\u001a\u00020\u00172\u0006\u0010\b\u001a\u00020\t2\u0018\u0010\u001b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000f0\u001cH\u0002J\b\u0010$\u001a\u00020%H\u0002J\u001a\u0010&\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0002\u0010\u0011J\u001a\u0010'\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00100\u000fH\u0082@¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\tX\u0082.¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082D¢\u0006\u0002\n\u0000¨\u0006("}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityServiceImpl;", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityService;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "googleCloudProjectId", "", "integrityProviderStartTime", "integrityTokenProvider", "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityTokenProvider;", "tag", "", "tokenProviderExpirationTimeInMinutes", "", "checkAppIntegrity", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult;", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityError;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "createIntegrityTokenTask", "Lcom/google/android/gms/tasks/Task;", "Lcom/google/android/play/core/integrity/StandardIntegrityManager$StandardIntegrityToken;", "getToken", "handleGetTokenFailure", "", "exception", "Ljava/lang/Exception;", "Lkotlin/Exception;", "continuation", "Lkotlin/coroutines/Continuation;", "handleGetTokenSuccess", "token", "handleIntegrityServiceException", "Lcom/google/android/play/core/integrity/StandardIntegrityException;", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityResult$Failure;", "handleTokenProviderPreparationFailure", "handleTokenProviderPreparationSuccess", "isIntegrityTokenProviderReady", "", "prepareAndGetToken", "prepareIntegrityTokenProvider", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class AppIntegrityServiceImpl implements AppIntegrityService {

    @NotNull
    private final Context context;
    private final long googleCloudProjectId;
    private long integrityProviderStartTime;
    private StandardIntegrityManager.StandardIntegrityTokenProvider integrityTokenProvider;

    @NotNull
    private final String tag;
    private final int tokenProviderExpirationTimeInMinutes;

    public AppIntegrityServiceImpl(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.tag = "[" + AppIntegrityServiceImpl.class.getSimpleName() + "]";
        this.tokenProviderExpirationTimeInMinutes = 5;
        this.googleCloudProjectId = 90877328901L;
    }

    private final Task<StandardIntegrityManager.StandardIntegrityToken> createIntegrityTokenTask() {
        StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider = this.integrityTokenProvider;
        if (standardIntegrityTokenProvider == null) {
            Intrinsics.throwUninitializedPropertyAccessException("integrityTokenProvider");
            standardIntegrityTokenProvider = null;
        }
        Task<StandardIntegrityManager.StandardIntegrityToken> request = standardIntegrityTokenProvider.request(StandardIntegrityManager.StandardIntegrityTokenRequest.builder().build());
        Intrinsics.checkNotNullExpressionValue(request, "request(...)");
        return request;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x00ad, code lost:
    
        if (r12 != r1) goto L22;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x00b3 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x00b4  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getToken(Continuation<? super AppIntegrityResult<String, AppIntegrityError>> continuation) {
        AppIntegrityServiceImpl$getToken$1 appIntegrityServiceImpl$getToken$1;
        int i10;
        int i11;
        final AppIntegrityServiceImpl appIntegrityServiceImpl;
        final Ref.IntRef intRef;
        if (continuation instanceof AppIntegrityServiceImpl$getToken$1) {
            appIntegrityServiceImpl$getToken$1 = (AppIntegrityServiceImpl$getToken$1) continuation;
            int i12 = appIntegrityServiceImpl$getToken$1.label;
            if ((i12 & Integer.MIN_VALUE) != 0) {
                appIntegrityServiceImpl$getToken$1.label = i12 - Integer.MIN_VALUE;
                Object obj = appIntegrityServiceImpl$getToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = appIntegrityServiceImpl$getToken$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    i11 = 3;
                    appIntegrityServiceImpl = this;
                    intRef = new Ref.IntRef();
                    if (intRef.element < i11) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = appIntegrityServiceImpl$getToken$1.I$0;
                    intRef = (Ref.IntRef) appIntegrityServiceImpl$getToken$1.L$1;
                    appIntegrityServiceImpl = (AppIntegrityServiceImpl) appIntegrityServiceImpl$getToken$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    AppIntegrityResult appIntegrityResult = (AppIntegrityResult) obj;
                    if (appIntegrityResult instanceof AppIntegrityResult.Success) {
                        if (appIntegrityResult instanceof AppIntegrityResult.Failure) {
                            int i13 = intRef.element + 1;
                            intRef.element = i13;
                            if (i13 == i11) {
                                return appIntegrityResult;
                            }
                            Logger.INSTANCE.info(appIntegrityServiceImpl.tag, "Retrying to obtain integrity token...");
                        }
                        if (intRef.element < i11) {
                            return new AppIntegrityResult.Failure(new AppIntegrityError("Unknown error after retries.", 0, 2, null));
                        }
                        appIntegrityServiceImpl$getToken$1.L$0 = appIntegrityServiceImpl;
                        appIntegrityServiceImpl$getToken$1.L$1 = intRef;
                        appIntegrityServiceImpl$getToken$1.I$0 = i11;
                        appIntegrityServiceImpl$getToken$1.label = 1;
                        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(appIntegrityServiceImpl$getToken$1));
                        Logger.INSTANCE.info(appIntegrityServiceImpl.tag, "Requesting integrity token [Attempt " + (intRef.element + 1) + " of " + i11 + "].");
                        Task<StandardIntegrityManager.StandardIntegrityToken> createIntegrityTokenTask = appIntegrityServiceImpl.createIntegrityTokenTask();
                        createIntegrityTokenTask.addOnSuccessListener(new AppIntegrityServiceImpl$sam$com_google_android_gms_tasks_OnSuccessListener$0(new Function1<StandardIntegrityManager.StandardIntegrityToken, Unit>() { // from class: ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl$getToken$result$1$1
                            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                            /* JADX WARN: Multi-variable type inference failed */
                            {
                                super(1);
                            }

                            @Override // kotlin.jvm.functions.Function1
                            public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
                                invoke2(standardIntegrityToken);
                                return Unit.INSTANCE;
                            }

                            /* renamed from: invoke, reason: avoid collision after fix types in other method */
                            public final void invoke2(StandardIntegrityManager.StandardIntegrityToken standardIntegrityToken) {
                                String str;
                                Logger logger = Logger.INSTANCE;
                                str = AppIntegrityServiceImpl.this.tag;
                                logger.info(str, "Successfully obtained integrity token.");
                                Continuation<AppIntegrityResult<String, AppIntegrityError>> continuation2 = safeContinuation;
                                Result.Companion companion = Result.INSTANCE;
                                continuation2.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Success(standardIntegrityToken.token())));
                            }
                        }));
                        createIntegrityTokenTask.addOnFailureListener(new OnFailureListener() { // from class: ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl$getToken$result$1$2
                            @Override // com.google.android.gms.tasks.OnFailureListener
                            public final void onFailure(@NotNull Exception exception) {
                                String str;
                                Intrinsics.checkNotNullParameter(exception, "exception");
                                Logger logger = Logger.INSTANCE;
                                str = AppIntegrityServiceImpl.this.tag;
                                logger.error(str, "Failed to obtain integrity token (attempt " + (intRef.element + 1) + "): " + exception.getMessage());
                                if (exception instanceof StandardIntegrityException) {
                                    AppIntegrityServiceImpl.this.handleIntegrityServiceException((StandardIntegrityException) exception, safeContinuation);
                                    return;
                                }
                                Continuation<AppIntegrityResult<String, AppIntegrityError>> continuation2 = safeContinuation;
                                Result.Companion companion = Result.INSTANCE;
                                continuation2.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Failure(new AppIntegrityError("Something went wrong", 0, 2, null))));
                            }
                        });
                        obj = safeContinuation.getOrThrow();
                        if (obj == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            DebugProbesKt.probeCoroutineSuspended(appIntegrityServiceImpl$getToken$1);
                        }
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        AppIntegrityResult appIntegrityResult2 = (AppIntegrityResult) obj;
                        if (appIntegrityResult2 instanceof AppIntegrityResult.Success) {
                            return appIntegrityResult2;
                        }
                    }
                }
            }
        }
        appIntegrityServiceImpl$getToken$1 = new AppIntegrityServiceImpl$getToken$1(this, continuation);
        Object obj2 = appIntegrityServiceImpl$getToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = appIntegrityServiceImpl$getToken$1.label;
        if (i10 != 0) {
        }
    }

    private final void handleGetTokenFailure(Exception exception, Continuation<? super AppIntegrityResult<String, AppIntegrityError>> continuation) {
        Logger logger = Logger.INSTANCE;
        String str = this.tag;
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        logger.error(str, message);
        if (exception instanceof StandardIntegrityException) {
            handleIntegrityServiceException((StandardIntegrityException) exception, continuation);
        } else {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Failure(new AppIntegrityError("Something went wrong", 0, 2, null))));
        }
    }

    private final void handleGetTokenSuccess(StandardIntegrityManager.StandardIntegrityToken token, Continuation<? super AppIntegrityResult<String, AppIntegrityError>> continuation) {
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Success(token.token())));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleIntegrityServiceException(StandardIntegrityException exception, Continuation<? super AppIntegrityResult.Failure<AppIntegrityError>> continuation) {
        int errorCode = exception.getErrorCode();
        AppIntegrityError appIntegrityError = new AppIntegrityError(errorCode != -15 ? errorCode != -14 ? errorCode != -9 ? errorCode != -8 ? errorCode != -6 ? errorCode != -4 ? errorCode != -3 ? errorCode != -2 ? errorCode != -1 ? "Something went wrong" : "API_NOT_AVAILABLE" : "PLAY_STORE_NOT_FOUND" : "NETWORK_ERROR: Check your internet connection and retry." : "PLAY_STORE_ACCOUNT_NOT_FOUND" : "PLAY_SERVICES_NOT_FOUND" : "TOO_MANY_REQUESTS" : "CANNOT_BIND_TO_SERVICE" : "PLAY_STORE_VERSION_OUTDATED" : "PLAY_SERVICES_VERSION_OUTDATED", 0, 2, null);
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Failure(appIntegrityError)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTokenProviderPreparationFailure(Exception exception, Continuation<? super AppIntegrityResult<Unit, AppIntegrityError>> continuation) {
        Logger logger = Logger.INSTANCE;
        String str = this.tag;
        String message = exception.getMessage();
        if (message == null) {
            message = "";
        }
        logger.error(str, message);
        if (exception instanceof StandardIntegrityException) {
            handleIntegrityServiceException((StandardIntegrityException) exception, continuation);
        } else {
            Result.Companion companion = Result.INSTANCE;
            continuation.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Failure(new AppIntegrityError("Something went wrong", 0, 2, null))));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void handleTokenProviderPreparationSuccess(StandardIntegrityManager.StandardIntegrityTokenProvider integrityTokenProvider, Continuation<? super AppIntegrityResult<Unit, AppIntegrityError>> continuation) {
        this.integrityTokenProvider = integrityTokenProvider;
        this.integrityProviderStartTime = System.currentTimeMillis();
        Result.Companion companion = Result.INSTANCE;
        continuation.resumeWith(Result.m147constructorimpl(new AppIntegrityResult.Success(Unit.INSTANCE)));
    }

    private final boolean isIntegrityTokenProviderReady() {
        if (this.integrityTokenProvider == null) {
            Logger.INSTANCE.info(this.tag, ">>> Token provider not initialized yet.");
            return false;
        }
        long minutes = TimeUnit.MILLISECONDS.toMinutes(SystemClock.elapsedRealtime() - this.integrityProviderStartTime);
        Logger.INSTANCE.info(this.tag, ">>> Checking token provider readiness. Elapsed time in minutes: " + minutes + " / " + this.tokenProviderExpirationTimeInMinutes);
        return minutes < ((long) this.tokenProviderExpirationTimeInMinutes);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object prepareAndGetToken(Continuation<? super AppIntegrityResult<String, AppIntegrityError>> continuation) {
        AppIntegrityServiceImpl$prepareAndGetToken$1 appIntegrityServiceImpl$prepareAndGetToken$1;
        int i10;
        AppIntegrityServiceImpl appIntegrityServiceImpl;
        AppIntegrityResult appIntegrityResult;
        if (continuation instanceof AppIntegrityServiceImpl$prepareAndGetToken$1) {
            appIntegrityServiceImpl$prepareAndGetToken$1 = (AppIntegrityServiceImpl$prepareAndGetToken$1) continuation;
            int i11 = appIntegrityServiceImpl$prepareAndGetToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appIntegrityServiceImpl$prepareAndGetToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj = appIntegrityServiceImpl$prepareAndGetToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = appIntegrityServiceImpl$prepareAndGetToken$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    appIntegrityServiceImpl$prepareAndGetToken$1.L$0 = this;
                    appIntegrityServiceImpl$prepareAndGetToken$1.label = 1;
                    obj = prepareIntegrityTokenProvider(appIntegrityServiceImpl$prepareAndGetToken$1);
                    if (obj != coroutine_suspended) {
                        appIntegrityServiceImpl = this;
                    }
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                    return obj;
                }
                appIntegrityServiceImpl = (AppIntegrityServiceImpl) appIntegrityServiceImpl$prepareAndGetToken$1.L$0;
                ResultKt.throwOnFailure(obj);
                appIntegrityResult = (AppIntegrityResult) obj;
                if (appIntegrityResult instanceof AppIntegrityResult.Success) {
                    if (!(appIntegrityResult instanceof AppIntegrityResult.Failure)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    Logger.INSTANCE.error(appIntegrityServiceImpl.tag, "Failed to prepare token provider.");
                    return appIntegrityResult;
                }
                Logger.INSTANCE.info(appIntegrityServiceImpl.tag, "Token provider successfully prepared. Fetching token next.");
                appIntegrityServiceImpl$prepareAndGetToken$1.L$0 = null;
                appIntegrityServiceImpl$prepareAndGetToken$1.label = 2;
                Object token = appIntegrityServiceImpl.getToken(appIntegrityServiceImpl$prepareAndGetToken$1);
                return token == coroutine_suspended ? coroutine_suspended : token;
            }
        }
        appIntegrityServiceImpl$prepareAndGetToken$1 = new AppIntegrityServiceImpl$prepareAndGetToken$1(this, continuation);
        Object obj2 = appIntegrityServiceImpl$prepareAndGetToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = appIntegrityServiceImpl$prepareAndGetToken$1.label;
        if (i10 != 0) {
        }
        appIntegrityResult = (AppIntegrityResult) obj2;
        if (appIntegrityResult instanceof AppIntegrityResult.Success) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object prepareIntegrityTokenProvider(Continuation<? super AppIntegrityResult<Unit, AppIntegrityError>> continuation) {
        Logger.INSTANCE.info(this.tag, "Preparing standard integrity token provider...");
        final SafeContinuation safeContinuation = new SafeContinuation(IntrinsicsKt.intercepted(continuation));
        StandardIntegrityManager createStandard = IntegrityManagerFactory.createStandard(this.context);
        Intrinsics.checkNotNullExpressionValue(createStandard, "createStandard(...)");
        Task<StandardIntegrityManager.StandardIntegrityTokenProvider> prepareIntegrityToken = createStandard.prepareIntegrityToken(StandardIntegrityManager.PrepareIntegrityTokenRequest.builder().setCloudProjectNumber(this.googleCloudProjectId).build());
        prepareIntegrityToken.addOnSuccessListener(new AppIntegrityServiceImpl$sam$com_google_android_gms_tasks_OnSuccessListener$0(new Function1<StandardIntegrityManager.StandardIntegrityTokenProvider, Unit>() { // from class: ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl$prepareIntegrityTokenProvider$2$1
            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            {
                super(1);
            }

            @Override // kotlin.jvm.functions.Function1
            public /* bridge */ /* synthetic */ Unit invoke(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                invoke2(standardIntegrityTokenProvider);
                return Unit.INSTANCE;
            }

            /* renamed from: invoke, reason: avoid collision after fix types in other method */
            public final void invoke2(StandardIntegrityManager.StandardIntegrityTokenProvider standardIntegrityTokenProvider) {
                String str;
                Logger logger = Logger.INSTANCE;
                str = AppIntegrityServiceImpl.this.tag;
                logger.info(str, "Successfully prepared integrity token provider.");
                AppIntegrityServiceImpl appIntegrityServiceImpl = AppIntegrityServiceImpl.this;
                Intrinsics.checkNotNull(standardIntegrityTokenProvider);
                appIntegrityServiceImpl.handleTokenProviderPreparationSuccess(standardIntegrityTokenProvider, safeContinuation);
            }
        }));
        prepareIntegrityToken.addOnFailureListener(new OnFailureListener() { // from class: ai.verisoul.sdk.helpers.integrity.AppIntegrityServiceImpl$prepareIntegrityTokenProvider$2$2
            @Override // com.google.android.gms.tasks.OnFailureListener
            public final void onFailure(@NotNull Exception exception) {
                String str;
                Intrinsics.checkNotNullParameter(exception, "exception");
                Logger logger = Logger.INSTANCE;
                str = AppIntegrityServiceImpl.this.tag;
                logger.error(str, "Failed to prepare token provider: " + exception.getMessage());
                AppIntegrityServiceImpl.this.handleTokenProviderPreparationFailure(exception, safeContinuation);
            }
        });
        Object orThrow = safeContinuation.getOrThrow();
        if (orThrow == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
            DebugProbesKt.probeCoroutineSuspended(continuation);
        }
        return orThrow;
    }

    @Override // ai.verisoul.sdk.helpers.integrity.AppIntegrityService
    @Nullable
    public Object checkAppIntegrity(@NotNull Continuation<? super AppIntegrityResult<String, AppIntegrityError>> continuation) {
        Logger logger = Logger.INSTANCE;
        logger.info(this.tag, "checkAppIntegrity() called.");
        if (isIntegrityTokenProviderReady()) {
            logger.info(this.tag, "Standard integrity token provider is already prepared.");
            return getToken(continuation);
        }
        logger.info(this.tag, "Integrity token provider not ready; preparing token provider first.");
        return prepareAndGetToken(continuation);
    }
}
