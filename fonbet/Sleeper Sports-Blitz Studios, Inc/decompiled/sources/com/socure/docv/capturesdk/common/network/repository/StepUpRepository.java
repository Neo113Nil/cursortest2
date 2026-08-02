package com.socure.docv.capturesdk.common.network.repository;

import com.google.gson.Gson;
import com.socure.docv.capturesdk.common.network.model.SocureApiError;
import com.socure.docv.capturesdk.common.network.model.stepup.DeviceSessionRequest;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleDataResponse;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleRequestExtKt;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ModuleSubmissionRequest;
import com.socure.docv.capturesdk.common.network.model.stepup.modules.ResponseWrapper;
import com.socure.docv.capturesdk.common.network.transport.StepUpApiService;
import com.socure.docv.capturesdk.common.session.SessionManager;
import com.socure.docv.capturesdk.common.utils.ErrorHandlerKt;
import com.socure.docv.capturesdk.common.utils.HeaderUtils;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import okhttp3.MediaType;
import okhttp3.MultipartBody;
import okhttp3.RequestBody;
import retrofit2.Response;

/* compiled from: StepUpRepository.kt */
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0014\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0002J3\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00010\u000b2\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\r\u001a\u00020\u000eH\u0086@ø\u0001\u0000¢\u0006\u0002\u0010\u000fJ6\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t0\bH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u0013\u0010\u0014J<\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001a\u0010\u001bJ2\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u001d\u001a\u00020\u001eH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\u001f\u0010 J<\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b\"\u0010\u001bJ2\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010$\u001a\u00020\tH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b%\u0010&J*\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\tH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b(\u0010)J<\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b+\u0010\u001bJ<\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b-\u0010\u001bJ*\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\tH\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b/\u0010)J<\u00100\u001a\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0016\u001a\u00020\t2\u0006\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018H\u0086@ø\u0001\u0001ø\u0001\u0002ø\u0001\u0000ø\u0001\u0000¢\u0006\u0004\b1\u0010\u001bJ\u0012\u00102\u001a\u00020\u0012*\b\u0012\u0004\u0012\u0002030\u000bH\u0002R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b\u0019\n\u0002\b!\n\u0005\b¡\u001e0\u0001¨\u00064"}, d2 = {"Lcom/socure/docv/capturesdk/common/network/repository/StepUpRepository;", "", "stepUpApiService", "Lcom/socure/docv/capturesdk/common/network/transport/StepUpApiService;", "gson", "Lcom/google/gson/Gson;", "(Lcom/socure/docv/capturesdk/common/network/transport/StepUpApiService;Lcom/google/gson/Gson;)V", "getSubmitModuleHeader", "", "", "startDeviceSession", "Lretrofit2/Response;", "customHeaders", "request", "Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;", "(Ljava/util/Map;Lcom/socure/docv/capturesdk/common/network/model/stepup/DeviceSessionRequest;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "startModulesSession", "Lkotlin/Result;", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ModuleDataResponse;", "startModulesSession-gIAlu-s", "(Ljava/util/Map;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitBackModule", "moduleId", "documentBody", "Lokhttp3/MultipartBody$Part;", "metricsData", "submitBackModule-BWLJW6A", "(Ljava/lang/String;Lokhttp3/MultipartBody$Part;Lokhttp3/MultipartBody$Part;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitConsentModule", "consentStatus", "", "submitConsentModule-0E7RQCE", "(Ljava/lang/String;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitFrontModule", "submitFrontModule-BWLJW6A", "submitIDSelectionModule", "type", "submitIDSelectionModule-0E7RQCE", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitLanding", "submitLanding-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "submitPassportModule", "submitPassportModule-BWLJW6A", "submitSelfieModule", "submitSelfieModule-BWLJW6A", "submitTransition", "submitTransition-gIAlu-s", "submitUnstructuredDoc", "submitUnstructuredDoc-BWLJW6A", "parseResponse", "Lcom/socure/docv/capturesdk/common/network/model/stepup/modules/ResponseWrapper;", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class StepUpRepository {
    public static final int $stable = 8;
    private final Gson gson;
    private final StepUpApiService stepUpApiService;

    public StepUpRepository(StepUpApiService stepUpApiService, Gson gson) {
        Intrinsics.checkNotNullParameter(stepUpApiService, "stepUpApiService");
        Intrinsics.checkNotNullParameter(gson, "gson");
        this.stepUpApiService = stepUpApiService;
        this.gson = gson;
    }

    public final Object startDeviceSession(Map<String, String> map, DeviceSessionRequest deviceSessionRequest, Continuation<? super Response<Object>> continuation) {
        return this.stepUpApiService.deviceSession(map, deviceSessionRequest, continuation);
    }

    private final Map<String, String> getSubmitModuleHeader() {
        HeaderUtils headerUtils = HeaderUtils.INSTANCE;
        String sessionToken = SessionManager.INSTANCE.getSessionToken();
        if (sessionToken != null) {
            return headerUtils.getSubmitModuleHeader(sessionToken);
        }
        throw new IllegalArgumentException("Required value was null.".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitPassportModule-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11532submitPassportModuleBWLJW6A(String str, MultipartBody.Part part, MultipartBody.Part part2, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitPassportModule$1 stepUpRepository$submitPassportModule$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitPassportModule$1) {
                stepUpRepository$submitPassportModule$1 = (StepUpRepository$submitPassportModule$1) continuation;
                if ((stepUpRepository$submitPassportModule$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitPassportModule$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitPassportModule$1 stepUpRepository$submitPassportModule$12 = stepUpRepository$submitPassportModule$1;
                    Object obj = stepUpRepository$submitPassportModule$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitPassportModule$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createPassportModuleRequest$default(str, null, 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(createPasspo…est(moduleId = moduleId))");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitPassportModule$12.L$0 = this;
                        stepUpRepository$submitPassportModule$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, part, create$default, part2, stepUpRepository$submitPassportModule$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitPassportModule$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitPassportModule$1 = new StepUpRepository$submitPassportModule$1(this, continuation);
        StepUpRepository$submitPassportModule$1 stepUpRepository$submitPassportModule$122 = stepUpRepository$submitPassportModule$1;
        Object obj2 = stepUpRepository$submitPassportModule$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitPassportModule$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitSelfieModule-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11533submitSelfieModuleBWLJW6A(String str, MultipartBody.Part part, MultipartBody.Part part2, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitSelfieModule$1 stepUpRepository$submitSelfieModule$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitSelfieModule$1) {
                stepUpRepository$submitSelfieModule$1 = (StepUpRepository$submitSelfieModule$1) continuation;
                if ((stepUpRepository$submitSelfieModule$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitSelfieModule$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitSelfieModule$1 stepUpRepository$submitSelfieModule$12 = stepUpRepository$submitSelfieModule$1;
                    Object obj = stepUpRepository$submitSelfieModule$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitSelfieModule$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createSelfieModuleRequest$default(str, null, 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(createSelfie…est(moduleId = moduleId))");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitSelfieModule$12.L$0 = this;
                        stepUpRepository$submitSelfieModule$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, part, create$default, part2, stepUpRepository$submitSelfieModule$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitSelfieModule$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitSelfieModule$1 = new StepUpRepository$submitSelfieModule$1(this, continuation);
        StepUpRepository$submitSelfieModule$1 stepUpRepository$submitSelfieModule$122 = stepUpRepository$submitSelfieModule$1;
        Object obj2 = stepUpRepository$submitSelfieModule$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitSelfieModule$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitBackModule-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11527submitBackModuleBWLJW6A(String str, MultipartBody.Part part, MultipartBody.Part part2, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitBackModule$1 stepUpRepository$submitBackModule$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitBackModule$1) {
                stepUpRepository$submitBackModule$1 = (StepUpRepository$submitBackModule$1) continuation;
                if ((stepUpRepository$submitBackModule$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitBackModule$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitBackModule$1 stepUpRepository$submitBackModule$12 = stepUpRepository$submitBackModule$1;
                    Object obj = stepUpRepository$submitBackModule$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitBackModule$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createBackModuleRequest$default(str, null, 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(createBackMo…est(moduleId = moduleId))");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitBackModule$12.L$0 = this;
                        stepUpRepository$submitBackModule$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, part, create$default, part2, stepUpRepository$submitBackModule$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitBackModule$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitBackModule$1 = new StepUpRepository$submitBackModule$1(this, continuation);
        StepUpRepository$submitBackModule$1 stepUpRepository$submitBackModule$122 = stepUpRepository$submitBackModule$1;
        Object obj2 = stepUpRepository$submitBackModule$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitBackModule$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitFrontModule-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11529submitFrontModuleBWLJW6A(String str, MultipartBody.Part part, MultipartBody.Part part2, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitFrontModule$1 stepUpRepository$submitFrontModule$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitFrontModule$1) {
                stepUpRepository$submitFrontModule$1 = (StepUpRepository$submitFrontModule$1) continuation;
                if ((stepUpRepository$submitFrontModule$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitFrontModule$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitFrontModule$1 stepUpRepository$submitFrontModule$12 = stepUpRepository$submitFrontModule$1;
                    Object obj = stepUpRepository$submitFrontModule$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitFrontModule$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createFrontModuleRequest$default(str, null, 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(createFrontM…est(moduleId = moduleId))");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitFrontModule$12.L$0 = this;
                        stepUpRepository$submitFrontModule$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, part, create$default, part2, stepUpRepository$submitFrontModule$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitFrontModule$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitFrontModule$1 = new StepUpRepository$submitFrontModule$1(this, continuation);
        StepUpRepository$submitFrontModule$1 stepUpRepository$submitFrontModule$122 = stepUpRepository$submitFrontModule$1;
        Object obj2 = stepUpRepository$submitFrontModule$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitFrontModule$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitIDSelectionModule-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11530submitIDSelectionModule0E7RQCE(String str, String str2, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitIDSelectionModule$1 stepUpRepository$submitIDSelectionModule$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitIDSelectionModule$1) {
                stepUpRepository$submitIDSelectionModule$1 = (StepUpRepository$submitIDSelectionModule$1) continuation;
                if ((stepUpRepository$submitIDSelectionModule$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitIDSelectionModule$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitIDSelectionModule$1 stepUpRepository$submitIDSelectionModule$12 = stepUpRepository$submitIDSelectionModule$1;
                    Object obj = stepUpRepository$submitIDSelectionModule$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitIDSelectionModule$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createIdTypeSelectionModuleRequest$default(str, null, str2, 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(\n           …= type)\n                )");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitIDSelectionModule$12.L$0 = this;
                        stepUpRepository$submitIDSelectionModule$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, null, create$default, null, stepUpRepository$submitIDSelectionModule$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitIDSelectionModule$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitIDSelectionModule$1 = new StepUpRepository$submitIDSelectionModule$1(this, continuation);
        StepUpRepository$submitIDSelectionModule$1 stepUpRepository$submitIDSelectionModule$122 = stepUpRepository$submitIDSelectionModule$1;
        Object obj2 = stepUpRepository$submitIDSelectionModule$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitIDSelectionModule$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitConsentModule-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11528submitConsentModule0E7RQCE(String str, boolean z, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitConsentModule$1 stepUpRepository$submitConsentModule$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitConsentModule$1) {
                stepUpRepository$submitConsentModule$1 = (StepUpRepository$submitConsentModule$1) continuation;
                if ((stepUpRepository$submitConsentModule$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitConsentModule$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitConsentModule$1 stepUpRepository$submitConsentModule$12 = stepUpRepository$submitConsentModule$1;
                    Object obj = stepUpRepository$submitConsentModule$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitConsentModule$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createConsentModuleRequest$default(str, null, z ? "accept" : "decline", 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(\n           …      )\n                )");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitConsentModule$12.L$0 = this;
                        stepUpRepository$submitConsentModule$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, null, create$default, null, stepUpRepository$submitConsentModule$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitConsentModule$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitConsentModule$1 = new StepUpRepository$submitConsentModule$1(this, continuation);
        StepUpRepository$submitConsentModule$1 stepUpRepository$submitConsentModule$122 = stepUpRepository$submitConsentModule$1;
        Object obj2 = stepUpRepository$submitConsentModule$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitConsentModule$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: submitLanding-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11531submitLandinggIAlus(String str, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitLanding$1 stepUpRepository$submitLanding$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitLanding$1) {
                stepUpRepository$submitLanding$1 = (StepUpRepository$submitLanding$1) continuation;
                if ((stepUpRepository$submitLanding$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitLanding$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitLanding$1 stepUpRepository$submitLanding$12 = stepUpRepository$submitLanding$1;
                    Object obj = stepUpRepository$submitLanding$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitLanding$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(new ModuleSubmissionRequest("Landing", "1.0", str, null, 8, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(\n           …      )\n                )");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitLanding$12.L$0 = this;
                        stepUpRepository$submitLanding$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, null, create$default, null, stepUpRepository$submitLanding$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitLanding$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitLanding$1 = new StepUpRepository$submitLanding$1(this, continuation);
        StepUpRepository$submitLanding$1 stepUpRepository$submitLanding$122 = stepUpRepository$submitLanding$1;
        Object obj2 = stepUpRepository$submitLanding$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitLanding$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0029  */
    /* renamed from: submitTransition-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11534submitTransitiongIAlus(String str, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitTransition$1 stepUpRepository$submitTransition$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitTransition$1) {
                stepUpRepository$submitTransition$1 = (StepUpRepository$submitTransition$1) continuation;
                if ((stepUpRepository$submitTransition$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitTransition$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitTransition$1 stepUpRepository$submitTransition$12 = stepUpRepository$submitTransition$1;
                    Object obj = stepUpRepository$submitTransition$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitTransition$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(new ModuleSubmissionRequest("TransitionScreen", "1.0", str, null, 8, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(\n           …      )\n                )");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitTransition$12.L$0 = this;
                        stepUpRepository$submitTransition$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, null, create$default, null, stepUpRepository$submitTransition$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitTransition$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitTransition$1 = new StepUpRepository$submitTransition$1(this, continuation);
        StepUpRepository$submitTransition$1 stepUpRepository$submitTransition$122 = stepUpRepository$submitTransition$1;
        Object obj2 = stepUpRepository$submitTransition$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitTransition$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0025  */
    /* renamed from: submitUnstructuredDoc-BWLJW6A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11535submitUnstructuredDocBWLJW6A(String str, MultipartBody.Part part, MultipartBody.Part part2, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$submitUnstructuredDoc$1 stepUpRepository$submitUnstructuredDoc$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$submitUnstructuredDoc$1) {
                stepUpRepository$submitUnstructuredDoc$1 = (StepUpRepository$submitUnstructuredDoc$1) continuation;
                if ((stepUpRepository$submitUnstructuredDoc$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$submitUnstructuredDoc$1.label -= Integer.MIN_VALUE;
                    StepUpRepository$submitUnstructuredDoc$1 stepUpRepository$submitUnstructuredDoc$12 = stepUpRepository$submitUnstructuredDoc$1;
                    Object obj = stepUpRepository$submitUnstructuredDoc$12.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$submitUnstructuredDoc$12.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        Map<String, String> submitModuleHeader = getSubmitModuleHeader();
                        RequestBody.Companion companion2 = RequestBody.INSTANCE;
                        String json = this.gson.toJson(ModuleRequestExtKt.createUnstructuredDocModuleRequest$default(str, null, 2, null));
                        Intrinsics.checkNotNullExpressionValue(json, "gson.toJson(createUnstru…est(moduleId = moduleId))");
                        RequestBody create$default = RequestBody.Companion.create$default(companion2, json, (MediaType) null, 1, (Object) null);
                        stepUpRepository$submitUnstructuredDoc$12.L$0 = this;
                        stepUpRepository$submitUnstructuredDoc$12.label = 1;
                        obj = stepUpApiService.submitModule(submitModuleHeader, part, create$default, part2, stepUpRepository$submitUnstructuredDoc$12);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$submitUnstructuredDoc$12.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion3 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$submitUnstructuredDoc$1 = new StepUpRepository$submitUnstructuredDoc$1(this, continuation);
        StepUpRepository$submitUnstructuredDoc$1 stepUpRepository$submitUnstructuredDoc$122 = stepUpRepository$submitUnstructuredDoc$1;
        Object obj2 = stepUpRepository$submitUnstructuredDoc$122.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$submitUnstructuredDoc$122.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* renamed from: startModulesSession-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m11526startModulesSessiongIAlus(Map<String, String> map, Continuation<? super Result<ModuleDataResponse>> continuation) {
        StepUpRepository$startModulesSession$1 stepUpRepository$startModulesSession$1;
        int i;
        StepUpRepository stepUpRepository;
        try {
            if (continuation instanceof StepUpRepository$startModulesSession$1) {
                stepUpRepository$startModulesSession$1 = (StepUpRepository$startModulesSession$1) continuation;
                if ((stepUpRepository$startModulesSession$1.label & Integer.MIN_VALUE) != 0) {
                    stepUpRepository$startModulesSession$1.label -= Integer.MIN_VALUE;
                    Object obj = stepUpRepository$startModulesSession$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i = stepUpRepository$startModulesSession$1.label;
                    if (i != 0) {
                        ResultKt.throwOnFailure(obj);
                        Result.Companion companion = Result.INSTANCE;
                        StepUpRepository stepUpRepository2 = this;
                        StepUpApiService stepUpApiService = this.stepUpApiService;
                        stepUpRepository$startModulesSession$1.L$0 = this;
                        stepUpRepository$startModulesSession$1.label = 1;
                        obj = stepUpApiService.startModulesSession(map, stepUpRepository$startModulesSession$1);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        stepUpRepository = this;
                    } else {
                        if (i != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        stepUpRepository = (StepUpRepository) stepUpRepository$startModulesSession$1.L$0;
                        ResultKt.throwOnFailure(obj);
                    }
                    return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
                }
            }
            if (i != 0) {
            }
            return Result.m13470constructorimpl(stepUpRepository.parseResponse((Response) obj));
        } catch (Throwable th) {
            Result.Companion companion2 = Result.INSTANCE;
            return Result.m13470constructorimpl(ResultKt.createFailure(th));
        }
        stepUpRepository$startModulesSession$1 = new StepUpRepository$startModulesSession$1(this, continuation);
        Object obj2 = stepUpRepository$startModulesSession$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i = stepUpRepository$startModulesSession$1.label;
    }

    private final ModuleDataResponse parseResponse(Response<ResponseWrapper> response) {
        if (response.isSuccessful()) {
            ResponseWrapper body = response.body();
            Intrinsics.checkNotNull(body);
            return body.getData();
        }
        throw new SocureApiError(StepUpRepositoryKt.codeToError(ErrorHandlerKt.getErrorSocureSdkResponseHttpInfo(response.errorBody()).getFirst().intValue()));
    }
}
