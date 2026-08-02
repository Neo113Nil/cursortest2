package ai.verisoul.sdk.helpers.integrity;

import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X0;
import ai.verisoul.sdk.data.remote.IntegritySubmitRequest;
import ai.verisoul.sdk.data.remote.IntegritySubmitRequestData;
import ai.verisoul.sdk.data.remote.VerisoulHttpService;
import ai.verisoul.sdk.helpers.session.SessionData;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.logger.Logger;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ(\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\rH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\r\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u000fH\u0096@¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u0018R\u0014\u0010\u0019\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u001f\u001a\u00020\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0018\u0010\"\u001a\u0004\u0018\u00010!8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, d2 = {"Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelperImp;", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper", "Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "verisoulHttpService", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityService;", "integrityService", "<init>", "(Lai/verisoul/sdk/helpers/session/SessionHelper;Lai/verisoul/sdk/data/remote/VerisoulHttpService;Lai/verisoul/sdk/helpers/integrity/AppIntegrityService;)V", "", "playIntegrityToken", "expectedSessionId", "", "integrityCheckStartTimestamp", "", "postIntegrityToken", "(Ljava/lang/String;Ljava/lang/String;JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "cancelIntegrityJob", "()V", "syncAppIntegrityData", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityService;", "logTag", "Ljava/lang/String;", "LPh/M;", "exceptionHandler", "LPh/M;", "LPh/P;", "scope", "LPh/P;", "LPh/C0;", "activeIntegrityJob", "LPh/C0;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppIntegrityHelper.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppIntegrityHelper.kt\nai/verisoul/sdk/helpers/integrity/AppIntegrityHelperImp\n+ 2 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,114:1\n48#2,4:115\n*S KotlinDebug\n*F\n+ 1 AppIntegrityHelper.kt\nai/verisoul/sdk/helpers/integrity/AppIntegrityHelperImp\n*L\n24#1:115,4\n*E\n"})
/* loaded from: classes.dex */
public final class AppIntegrityHelperImp implements AppIntegrityHelper {

    @Nullable
    private C0 activeIntegrityJob;

    @NotNull
    private final M exceptionHandler;

    @NotNull
    private final AppIntegrityService integrityService;

    @NotNull
    private final String logTag;

    @NotNull
    private final P scope;

    @NotNull
    private final SessionHelper sessionHelper;

    @NotNull
    private final VerisoulHttpService verisoulHttpService;

    public AppIntegrityHelperImp(@NotNull SessionHelper sessionHelper, @NotNull VerisoulHttpService verisoulHttpService, @NotNull AppIntegrityService integrityService) {
        Intrinsics.checkNotNullParameter(sessionHelper, "sessionHelper");
        Intrinsics.checkNotNullParameter(verisoulHttpService, "verisoulHttpService");
        Intrinsics.checkNotNullParameter(integrityService, "integrityService");
        this.sessionHelper = sessionHelper;
        this.verisoulHttpService = verisoulHttpService;
        this.integrityService = integrityService;
        this.logTag = "Verisoul-[" + AppIntegrityHelperImp.class.getSimpleName() + "]";
        AppIntegrityHelperImp$special$$inlined$CoroutineExceptionHandler$1 appIntegrityHelperImp$special$$inlined$CoroutineExceptionHandler$1 = new AppIntegrityHelperImp$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2, this);
        this.exceptionHandler = appIntegrityHelperImp$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(appIntegrityHelperImp$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00e2  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002b  */
    /* JADX WARN: Type inference failed for: r0v22, types: [ai.verisoul.sdk.helpers.session.SessionHelper] */
    /* JADX WARN: Type inference failed for: r0v4, types: [ai.verisoul.sdk.helpers.session.SessionHelper] */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v2, types: [ai.verisoul.sdk.helpers.integrity.AppIntegrityHelperImp$postIntegrityToken$1, kotlin.coroutines.Continuation] */
    /* JADX WARN: Type inference failed for: r2v20 */
    /* JADX WARN: Type inference failed for: r2v28 */
    /* JADX WARN: Type inference failed for: r2v29 */
    /* JADX WARN: Type inference failed for: r2v3, types: [ai.verisoul.sdk.helpers.integrity.AppIntegrityHelperImp] */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v9 */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object] */
    /* JADX WARN: Type inference failed for: r3v1, types: [long] */
    /* JADX WARN: Type inference failed for: r3v10 */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r9v2, types: [ai.verisoul.sdk.data.remote.VerisoulHttpService] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object postIntegrityToken(String str, String str2, long j10, Continuation<? super Unit> continuation) {
        ?? r22;
        int i10;
        String str3;
        String str4;
        long j11;
        AppIntegrityHelperImp appIntegrityHelperImp;
        SessionData sessionData;
        AppIntegrityHelperImp appIntegrityHelperImp2;
        AppIntegrityHelperImp appIntegrityHelperImp3;
        long j12;
        ?? r02;
        try {
            if (continuation instanceof AppIntegrityHelperImp$postIntegrityToken$1) {
                AppIntegrityHelperImp$postIntegrityToken$1 appIntegrityHelperImp$postIntegrityToken$1 = (AppIntegrityHelperImp$postIntegrityToken$1) continuation;
                int i11 = appIntegrityHelperImp$postIntegrityToken$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    appIntegrityHelperImp$postIntegrityToken$1.label = i11 - Integer.MIN_VALUE;
                    r22 = appIntegrityHelperImp$postIntegrityToken$1;
                    Object obj = r22.result;
                    ?? coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = r22.label;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        ?? r03 = this.sessionHelper;
                        r22.L$0 = this;
                        str3 = str;
                        r22.L$1 = str3;
                        str4 = str2;
                        r22.L$2 = str4;
                        j11 = j10;
                        r22.J$0 = j11;
                        r22.label = 1;
                        obj = r03.getSession(r22);
                        if (obj != coroutine_suspended) {
                            appIntegrityHelperImp = this;
                        }
                        return coroutine_suspended;
                    }
                    if (i10 != 1) {
                        if (i10 != 2) {
                            if (i10 != 3) {
                                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                            }
                            j12 = r22.J$0;
                            appIntegrityHelperImp2 = (AppIntegrityHelperImp) r22.L$0;
                            try {
                                ResultKt.throwOnFailure(obj);
                                Logger.INSTANCE.metricLog(appIntegrityHelperImp2.logTag, "integrity_overall_duration", System.currentTimeMillis() - j12);
                            } catch (CancellationException e10) {
                                e = e10;
                                Logger.INSTANCE.info(appIntegrityHelperImp2.logTag, "Token submission cancelled");
                                throw e;
                            } catch (Exception e11) {
                                e = e11;
                                Logger logger = Logger.INSTANCE;
                                logger.error(appIntegrityHelperImp2.logTag, "Failed to post integrity token: " + e.getMessage());
                                logger.metricLog(appIntegrityHelperImp2.logTag, "integrity_overall_duration", System.currentTimeMillis() - j12);
                                return Unit.INSTANCE;
                            }
                            return Unit.INSTANCE;
                        }
                        long j13 = r22.J$0;
                        appIntegrityHelperImp3 = (AppIntegrityHelperImp) r22.L$0;
                        try {
                            ResultKt.throwOnFailure(obj);
                            j11 = j13;
                            try {
                                r02 = appIntegrityHelperImp3.sessionHelper;
                                r22.L$0 = appIntegrityHelperImp3;
                                r22.J$0 = j11;
                                r22.label = 3;
                            } catch (CancellationException e12) {
                                e = e12;
                                appIntegrityHelperImp2 = appIntegrityHelperImp3;
                                Logger.INSTANCE.info(appIntegrityHelperImp2.logTag, "Token submission cancelled");
                                throw e;
                            } catch (Exception e13) {
                                e = e13;
                                appIntegrityHelperImp2 = appIntegrityHelperImp3;
                                j12 = j11;
                                Logger logger2 = Logger.INSTANCE;
                                logger2.error(appIntegrityHelperImp2.logTag, "Failed to post integrity token: " + e.getMessage());
                                logger2.metricLog(appIntegrityHelperImp2.logTag, "integrity_overall_duration", System.currentTimeMillis() - j12);
                                return Unit.INSTANCE;
                            } catch (Throwable th2) {
                                th = th2;
                                r22 = appIntegrityHelperImp3;
                                coroutine_suspended = j11;
                                Logger.INSTANCE.metricLog(r22.logTag, "integrity_overall_duration", System.currentTimeMillis() - coroutine_suspended);
                                throw th;
                            }
                        } catch (CancellationException e14) {
                            e = e14;
                            appIntegrityHelperImp2 = appIntegrityHelperImp3;
                            Logger.INSTANCE.info(appIntegrityHelperImp2.logTag, "Token submission cancelled");
                            throw e;
                        } catch (Exception e15) {
                            e = e15;
                            appIntegrityHelperImp2 = appIntegrityHelperImp3;
                            j12 = j13;
                            Logger logger22 = Logger.INSTANCE;
                            logger22.error(appIntegrityHelperImp2.logTag, "Failed to post integrity token: " + e.getMessage());
                            logger22.metricLog(appIntegrityHelperImp2.logTag, "integrity_overall_duration", System.currentTimeMillis() - j12);
                            return Unit.INSTANCE;
                        } catch (Throwable th3) {
                            th = th3;
                            r22 = appIntegrityHelperImp3;
                            coroutine_suspended = j13;
                            Logger.INSTANCE.metricLog(r22.logTag, "integrity_overall_duration", System.currentTimeMillis() - coroutine_suspended);
                            throw th;
                        }
                        if (r02.setPlayIntegrityIsDone(r22) != coroutine_suspended) {
                            appIntegrityHelperImp2 = appIntegrityHelperImp3;
                            j12 = j11;
                            Logger.INSTANCE.metricLog(appIntegrityHelperImp2.logTag, "integrity_overall_duration", System.currentTimeMillis() - j12);
                            return Unit.INSTANCE;
                        }
                        return coroutine_suspended;
                    }
                    long j14 = r22.J$0;
                    String str5 = (String) r22.L$2;
                    String str6 = (String) r22.L$1;
                    AppIntegrityHelperImp appIntegrityHelperImp4 = (AppIntegrityHelperImp) r22.L$0;
                    ResultKt.throwOnFailure(obj);
                    str4 = str5;
                    str3 = str6;
                    appIntegrityHelperImp = appIntegrityHelperImp4;
                    j11 = j14;
                    sessionData = (SessionData) obj;
                    if (sessionData != null || !Intrinsics.areEqual(sessionData.getSessionId(), str4)) {
                        Logger.INSTANCE.info(appIntegrityHelperImp.logTag, "Session changed while Integrity was in flight; skipping token post for old sessionId=" + str4);
                        return Unit.INSTANCE;
                    }
                    try {
                        ?? r92 = appIntegrityHelperImp.verisoulHttpService;
                        IntegritySubmitRequest integritySubmitRequest = new IntegritySubmitRequest(sessionData.getProjectId(), sessionData.getSessionId(), new IntegritySubmitRequestData(str3));
                        r22.L$0 = appIntegrityHelperImp;
                        r22.L$1 = null;
                        r22.L$2 = null;
                        r22.J$0 = j11;
                        r22.label = 2;
                        if (r92.submitIntegrityData(integritySubmitRequest, r22) != coroutine_suspended) {
                            appIntegrityHelperImp3 = appIntegrityHelperImp;
                            r02 = appIntegrityHelperImp3.sessionHelper;
                            r22.L$0 = appIntegrityHelperImp3;
                            r22.J$0 = j11;
                            r22.label = 3;
                            if (r02.setPlayIntegrityIsDone(r22) != coroutine_suspended) {
                            }
                        }
                        return coroutine_suspended;
                    } catch (CancellationException e16) {
                        e = e16;
                        appIntegrityHelperImp2 = appIntegrityHelperImp;
                        Logger.INSTANCE.info(appIntegrityHelperImp2.logTag, "Token submission cancelled");
                        throw e;
                    } catch (Exception e17) {
                        e = e17;
                        appIntegrityHelperImp2 = appIntegrityHelperImp;
                        j12 = j11;
                        Logger logger222 = Logger.INSTANCE;
                        logger222.error(appIntegrityHelperImp2.logTag, "Failed to post integrity token: " + e.getMessage());
                        logger222.metricLog(appIntegrityHelperImp2.logTag, "integrity_overall_duration", System.currentTimeMillis() - j12);
                        return Unit.INSTANCE;
                    } catch (Throwable th4) {
                        th = th4;
                        r22 = appIntegrityHelperImp;
                        coroutine_suspended = j11;
                        Logger.INSTANCE.metricLog(r22.logTag, "integrity_overall_duration", System.currentTimeMillis() - coroutine_suspended);
                        throw th;
                    }
                }
            }
            if (i10 != 0) {
            }
            sessionData = (SessionData) obj;
            if (sessionData != null) {
            }
            Logger.INSTANCE.info(appIntegrityHelperImp.logTag, "Session changed while Integrity was in flight; skipping token post for old sessionId=" + str4);
            return Unit.INSTANCE;
        } catch (Throwable th5) {
            th = th5;
        }
        r22 = new AppIntegrityHelperImp$postIntegrityToken$1(this, continuation);
        Object obj2 = r22.result;
        ?? coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = r22.label;
    }

    public final void cancelIntegrityJob() {
        C0 c02 = this.activeIntegrityJob;
        if (c02 != null) {
            C0.a.b(c02, null, 1, null);
        }
        this.activeIntegrityJob = null;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005a  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ai.verisoul.sdk.helpers.integrity.AppIntegrityHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object syncAppIntegrityData(@NotNull Continuation<? super Unit> continuation) {
        AppIntegrityHelperImp$syncAppIntegrityData$1 appIntegrityHelperImp$syncAppIntegrityData$1;
        int i10;
        AppIntegrityHelperImp appIntegrityHelperImp;
        long j10;
        String sessionId;
        C0 d10;
        if (continuation instanceof AppIntegrityHelperImp$syncAppIntegrityData$1) {
            appIntegrityHelperImp$syncAppIntegrityData$1 = (AppIntegrityHelperImp$syncAppIntegrityData$1) continuation;
            int i11 = appIntegrityHelperImp$syncAppIntegrityData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                appIntegrityHelperImp$syncAppIntegrityData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = appIntegrityHelperImp$syncAppIntegrityData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = appIntegrityHelperImp$syncAppIntegrityData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    SessionHelper sessionHelper = this.sessionHelper;
                    appIntegrityHelperImp$syncAppIntegrityData$1.L$0 = this;
                    appIntegrityHelperImp$syncAppIntegrityData$1.J$0 = currentTimeMillis;
                    appIntegrityHelperImp$syncAppIntegrityData$1.label = 1;
                    obj = sessionHelper.getSession(appIntegrityHelperImp$syncAppIntegrityData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    appIntegrityHelperImp = this;
                    j10 = currentTimeMillis;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    long j11 = appIntegrityHelperImp$syncAppIntegrityData$1.J$0;
                    AppIntegrityHelperImp appIntegrityHelperImp2 = (AppIntegrityHelperImp) appIntegrityHelperImp$syncAppIntegrityData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    j10 = j11;
                    appIntegrityHelperImp = appIntegrityHelperImp2;
                }
                SessionData sessionData = (SessionData) obj;
                sessionId = sessionData == null ? sessionData.getSessionId() : null;
                if (sessionId == null) {
                    sessionId = "";
                }
                appIntegrityHelperImp.cancelIntegrityJob();
                d10 = AbstractC1459k.d(appIntegrityHelperImp.scope, null, null, new AppIntegrityHelperImp$syncAppIntegrityData$2(appIntegrityHelperImp, sessionId, j10, null), 3, null);
                appIntegrityHelperImp.activeIntegrityJob = d10;
                return Unit.INSTANCE;
            }
        }
        appIntegrityHelperImp$syncAppIntegrityData$1 = new AppIntegrityHelperImp$syncAppIntegrityData$1(this, continuation);
        Object obj2 = appIntegrityHelperImp$syncAppIntegrityData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = appIntegrityHelperImp$syncAppIntegrityData$1.label;
        if (i10 != 0) {
        }
        SessionData sessionData2 = (SessionData) obj2;
        if (sessionData2 == null) {
        }
        if (sessionId == null) {
        }
        appIntegrityHelperImp.cancelIntegrityJob();
        d10 = AbstractC1459k.d(appIntegrityHelperImp.scope, null, null, new AppIntegrityHelperImp$syncAppIntegrityData$2(appIntegrityHelperImp, sessionId, j10, null), 3, null);
        appIntegrityHelperImp.activeIntegrityJob = d10;
        return Unit.INSTANCE;
    }
}
