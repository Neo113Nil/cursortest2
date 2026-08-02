package ai.verisoul.sdk.helpers.session;

import ai.verisoul.sdk.VerisoulEnvironment;
import ai.verisoul.sdk.data.local.preferences.PreferencesHelper;
import ai.verisoul.sdk.logger.Logger;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0010\u0010\b\u001a\u0004\u0018\u00010\tH\u0096@¢\u0006\u0002\u0010\nJ\u0010\u0010\u000b\u001a\u0004\u0018\u00010\u0006H\u0096@¢\u0006\u0002\u0010\nJ\u001e\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u0010H\u0082@¢\u0006\u0002\u0010\u0011J&\u0010\u0012\u001a\u00020\u00062\u0006\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\u0015J\u000e\u0010\u0016\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u0017\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u0018\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u0019\u001a\u00020\u0014H\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u0013\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u001a\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u001b\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\nJ\u000e\u0010\u001c\u001a\u00020\rH\u0096@¢\u0006\u0002\u0010\nR\u0010\u0010\u0005\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lai/verisoul/sdk/helpers/session/SessionHelperImp;", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "preferencesHelper", "Lai/verisoul/sdk/data/local/preferences/PreferencesHelper;", "(Lai/verisoul/sdk/data/local/preferences/PreferencesHelper;)V", "lastSessionId", "", "logTag", "getSession", "Lai/verisoul/sdk/helpers/session/SessionData;", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "initSession", "", "projectId", "env", "Lai/verisoul/sdk/VerisoulEnvironment;", "(Ljava/lang/String;Lai/verisoul/sdk/VerisoulEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "initSessionId", "reinitialize", "", "(Ljava/lang/String;Lai/verisoul/sdk/VerisoulEnvironment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "isNeedToGenerateAnewToken", "isNeedToSubmitDeviceData", "isNeedToSubmitPlayIntegrityData", "isNeedToSubmitTouchData", "setDeviceDataCollectionIsDone", "setPlayIntegrityIsDone", "setSubmitTouchDataIsDone", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class SessionHelperImp implements SessionHelper {

    @Nullable
    private String lastSessionId;

    @NotNull
    private final String logTag;

    @NotNull
    private final PreferencesHelper preferencesHelper;

    public SessionHelperImp(@NotNull PreferencesHelper preferencesHelper) {
        Intrinsics.checkNotNullParameter(preferencesHelper, "preferencesHelper");
        this.preferencesHelper = preferencesHelper;
        this.logTag = "Verisoul-[" + SessionHelperImp.class.getSimpleName() + "]";
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object initSession(String str, VerisoulEnvironment verisoulEnvironment, Continuation<? super Unit> continuation) {
        this.lastSessionId = UUID.randomUUID().toString();
        String str2 = this.lastSessionId;
        Intrinsics.checkNotNull(str2);
        long currentTimeMillis = System.currentTimeMillis() + SessionData.EXPIRATION_TIME;
        Status status = Status.Waiting;
        SessionData sessionData = new SessionData(str2, currentTimeMillis, str, verisoulEnvironment, new SessionStatus(status, status, status));
        Logger.INSTANCE.info(this.logTag, "Session initialized");
        Object saveSession = this.preferencesHelper.saveSession(sessionData, continuation);
        return saveSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? saveSession : Unit.INSTANCE;
    }

    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    public Object getSession(@NotNull Continuation<? super SessionData> continuation) {
        return this.preferencesHelper.getSession(continuation);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0048 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object getSessionId(@NotNull Continuation<? super String> continuation) {
        SessionHelperImp$getSessionId$1 sessionHelperImp$getSessionId$1;
        int i10;
        SessionData sessionData;
        if (continuation instanceof SessionHelperImp$getSessionId$1) {
            sessionHelperImp$getSessionId$1 = (SessionHelperImp$getSessionId$1) continuation;
            int i11 = sessionHelperImp$getSessionId$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$getSessionId$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$getSessionId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$getSessionId$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$getSessionId$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$getSessionId$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                sessionData = (SessionData) obj;
                if (sessionData == null) {
                    return sessionData.getSessionId();
                }
                return null;
            }
        }
        sessionHelperImp$getSessionId$1 = new SessionHelperImp$getSessionId$1(this, continuation);
        Object obj2 = sessionHelperImp$getSessionId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$getSessionId$1.label;
        if (i10 != 0) {
        }
        sessionData = (SessionData) obj2;
        if (sessionData == null) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x00e3, code lost:
    
        if (r9.initSession(r11, r10, r0) != r1) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d5  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0026  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object initSessionId(@NotNull String str, @NotNull VerisoulEnvironment verisoulEnvironment, boolean z10, @NotNull Continuation<? super String> continuation) {
        SessionHelperImp$initSessionId$1 sessionHelperImp$initSessionId$1;
        Object coroutine_suspended;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionData sessionData;
        PreferencesHelper preferencesHelper;
        String str2;
        SessionHelperImp sessionHelperImp2;
        if (continuation instanceof SessionHelperImp$initSessionId$1) {
            sessionHelperImp$initSessionId$1 = (SessionHelperImp$initSessionId$1) continuation;
            int i11 = sessionHelperImp$initSessionId$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$initSessionId$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$initSessionId$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$initSessionId$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper2 = this.preferencesHelper;
                    sessionHelperImp$initSessionId$1.L$0 = this;
                    sessionHelperImp$initSessionId$1.L$1 = str;
                    sessionHelperImp$initSessionId$1.L$2 = verisoulEnvironment;
                    sessionHelperImp$initSessionId$1.Z$0 = z10;
                    sessionHelperImp$initSessionId$1.label = 1;
                    obj = preferencesHelper2.getSession(sessionHelperImp$initSessionId$1);
                    if (obj != coroutine_suspended) {
                        sessionHelperImp = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    z10 = sessionHelperImp$initSessionId$1.Z$0;
                    verisoulEnvironment = (VerisoulEnvironment) sessionHelperImp$initSessionId$1.L$2;
                    str = (String) sessionHelperImp$initSessionId$1.L$1;
                    sessionHelperImp = (SessionHelperImp) sessionHelperImp$initSessionId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        sessionHelperImp2 = (SessionHelperImp) sessionHelperImp$initSessionId$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        String str3 = sessionHelperImp2.lastSessionId;
                        Intrinsics.checkNotNull(str3);
                        return str3;
                    }
                    VerisoulEnvironment verisoulEnvironment2 = (VerisoulEnvironment) sessionHelperImp$initSessionId$1.L$2;
                    String str4 = (String) sessionHelperImp$initSessionId$1.L$1;
                    SessionHelperImp sessionHelperImp3 = (SessionHelperImp) sessionHelperImp$initSessionId$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    verisoulEnvironment = verisoulEnvironment2;
                    sessionHelperImp2 = sessionHelperImp3;
                    str2 = str4;
                    sessionHelperImp$initSessionId$1.L$0 = sessionHelperImp2;
                    sessionHelperImp$initSessionId$1.L$1 = null;
                    sessionHelperImp$initSessionId$1.L$2 = null;
                    sessionHelperImp$initSessionId$1.label = 3;
                }
                sessionData = (SessionData) obj;
                if ((sessionData == null ? sessionData.getSessionId() : null) == null && !sessionData.isExpired() && Intrinsics.areEqual(str, sessionData.getProjectId()) && Intrinsics.areEqual(sessionData.getEnv(), verisoulEnvironment) && !z10) {
                    sessionHelperImp.lastSessionId = sessionData.getSessionId();
                    Logger.INSTANCE.info(sessionHelperImp.logTag, "Session Retrieved");
                    String str5 = sessionHelperImp.lastSessionId;
                    Intrinsics.checkNotNull(str5);
                    return str5;
                }
                Logger.INSTANCE.info(sessionHelperImp.logTag, "Session Cleared");
                preferencesHelper = sessionHelperImp.preferencesHelper;
                sessionHelperImp$initSessionId$1.L$0 = sessionHelperImp;
                sessionHelperImp$initSessionId$1.L$1 = str;
                sessionHelperImp$initSessionId$1.L$2 = verisoulEnvironment;
                sessionHelperImp$initSessionId$1.label = 2;
                if (preferencesHelper.clearSession(sessionHelperImp$initSessionId$1) != coroutine_suspended) {
                    str2 = str;
                    sessionHelperImp2 = sessionHelperImp;
                    sessionHelperImp$initSessionId$1.L$0 = sessionHelperImp2;
                    sessionHelperImp$initSessionId$1.L$1 = null;
                    sessionHelperImp$initSessionId$1.L$2 = null;
                    sessionHelperImp$initSessionId$1.label = 3;
                }
                return coroutine_suspended;
            }
        }
        sessionHelperImp$initSessionId$1 = new SessionHelperImp$initSessionId$1(this, continuation);
        Object obj2 = sessionHelperImp$initSessionId$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$initSessionId$1.label;
        if (i10 != 0) {
        }
        sessionData = (SessionData) obj2;
        if ((sessionData == null ? sessionData.getSessionId() : null) == null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "Session Cleared");
        preferencesHelper = sessionHelperImp.preferencesHelper;
        sessionHelperImp$initSessionId$1.L$0 = sessionHelperImp;
        sessionHelperImp$initSessionId$1.L$1 = str;
        sessionHelperImp$initSessionId$1.L$2 = verisoulEnvironment;
        sessionHelperImp$initSessionId$1.label = 2;
        if (preferencesHelper.clearSession(sessionHelperImp$initSessionId$1) != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isNeedToGenerateAnewToken(@NotNull Continuation<? super Boolean> continuation) {
        SessionHelperImp$isNeedToGenerateAnewToken$1 sessionHelperImp$isNeedToGenerateAnewToken$1;
        int i10;
        boolean z10;
        SessionData sessionData;
        if (continuation instanceof SessionHelperImp$isNeedToGenerateAnewToken$1) {
            sessionHelperImp$isNeedToGenerateAnewToken$1 = (SessionHelperImp$isNeedToGenerateAnewToken$1) continuation;
            int i11 = sessionHelperImp$isNeedToGenerateAnewToken$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$isNeedToGenerateAnewToken$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$isNeedToGenerateAnewToken$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$isNeedToGenerateAnewToken$1.label;
                z10 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    sessionHelperImp$isNeedToGenerateAnewToken$1.label = 1;
                    obj = getSession(sessionHelperImp$isNeedToGenerateAnewToken$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                sessionData = (SessionData) obj;
                if (sessionData != null && !sessionData.isExpired() && sessionData.getStatus().getNativeDataCollection() == Status.Done) {
                    z10 = false;
                }
                return Boxing.boxBoolean(z10);
            }
        }
        sessionHelperImp$isNeedToGenerateAnewToken$1 = new SessionHelperImp$isNeedToGenerateAnewToken$1(this, continuation);
        Object obj2 = sessionHelperImp$isNeedToGenerateAnewToken$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$isNeedToGenerateAnewToken$1.label;
        z10 = true;
        if (i10 != 0) {
        }
        sessionData = (SessionData) obj2;
        if (sessionData != null) {
            z10 = false;
        }
        return Boxing.boxBoolean(z10);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isNeedToSubmitDeviceData(@NotNull Continuation<? super Boolean> continuation) {
        SessionHelperImp$isNeedToSubmitDeviceData$1 sessionHelperImp$isNeedToSubmitDeviceData$1;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionStatus status;
        if (continuation instanceof SessionHelperImp$isNeedToSubmitDeviceData$1) {
            sessionHelperImp$isNeedToSubmitDeviceData$1 = (SessionHelperImp$isNeedToSubmitDeviceData$1) continuation;
            int i11 = sessionHelperImp$isNeedToSubmitDeviceData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$isNeedToSubmitDeviceData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$isNeedToSubmitDeviceData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$isNeedToSubmitDeviceData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$isNeedToSubmitDeviceData$1.L$0 = this;
                    sessionHelperImp$isNeedToSubmitDeviceData$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$isNeedToSubmitDeviceData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionHelperImp = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionHelperImp = (SessionHelperImp) sessionHelperImp$isNeedToSubmitDeviceData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                SessionData sessionData = (SessionData) obj;
                Status nativeDataCollection = (sessionData != null || (status = sessionData.getStatus()) == null) ? null : status.getNativeDataCollection();
                Logger.INSTANCE.info(sessionHelperImp.logTag, "isNeedToSubmitDeviceData:" + (nativeDataCollection != null ? nativeDataCollection.name() : null));
                return Boxing.boxBoolean(nativeDataCollection != Status.Done);
            }
        }
        sessionHelperImp$isNeedToSubmitDeviceData$1 = new SessionHelperImp$isNeedToSubmitDeviceData$1(this, continuation);
        Object obj2 = sessionHelperImp$isNeedToSubmitDeviceData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$isNeedToSubmitDeviceData$1.label;
        if (i10 != 0) {
        }
        SessionData sessionData2 = (SessionData) obj2;
        if (sessionData2 != null) {
        }
        if (nativeDataCollection != null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "isNeedToSubmitDeviceData:" + (nativeDataCollection != null ? nativeDataCollection.name() : null));
        return Boxing.boxBoolean(nativeDataCollection != Status.Done);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isNeedToSubmitPlayIntegrityData(@NotNull Continuation<? super Boolean> continuation) {
        SessionHelperImp$isNeedToSubmitPlayIntegrityData$1 sessionHelperImp$isNeedToSubmitPlayIntegrityData$1;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionStatus status;
        if (continuation instanceof SessionHelperImp$isNeedToSubmitPlayIntegrityData$1) {
            sessionHelperImp$isNeedToSubmitPlayIntegrityData$1 = (SessionHelperImp$isNeedToSubmitPlayIntegrityData$1) continuation;
            int i11 = sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.L$0 = this;
                    sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$isNeedToSubmitPlayIntegrityData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionHelperImp = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionHelperImp = (SessionHelperImp) sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                SessionData sessionData = (SessionData) obj;
                Status playIntegrity = (sessionData != null || (status = sessionData.getStatus()) == null) ? null : status.getPlayIntegrity();
                Logger.INSTANCE.info(sessionHelperImp.logTag, "isNeedToSubmitPlayIntegrityData:" + (playIntegrity != null ? playIntegrity.name() : null));
                return Boxing.boxBoolean(playIntegrity != Status.Done);
            }
        }
        sessionHelperImp$isNeedToSubmitPlayIntegrityData$1 = new SessionHelperImp$isNeedToSubmitPlayIntegrityData$1(this, continuation);
        Object obj2 = sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$isNeedToSubmitPlayIntegrityData$1.label;
        if (i10 != 0) {
        }
        SessionData sessionData2 = (SessionData) obj2;
        if (sessionData2 != null) {
        }
        if (playIntegrity != null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "isNeedToSubmitPlayIntegrityData:" + (playIntegrity != null ? playIntegrity.name() : null));
        return Boxing.boxBoolean(playIntegrity != Status.Done);
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object isNeedToSubmitTouchData(@NotNull Continuation<? super Boolean> continuation) {
        SessionHelperImp$isNeedToSubmitTouchData$1 sessionHelperImp$isNeedToSubmitTouchData$1;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionStatus status;
        if (continuation instanceof SessionHelperImp$isNeedToSubmitTouchData$1) {
            sessionHelperImp$isNeedToSubmitTouchData$1 = (SessionHelperImp$isNeedToSubmitTouchData$1) continuation;
            int i11 = sessionHelperImp$isNeedToSubmitTouchData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$isNeedToSubmitTouchData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$isNeedToSubmitTouchData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$isNeedToSubmitTouchData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$isNeedToSubmitTouchData$1.L$0 = this;
                    sessionHelperImp$isNeedToSubmitTouchData$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$isNeedToSubmitTouchData$1);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    sessionHelperImp = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionHelperImp = (SessionHelperImp) sessionHelperImp$isNeedToSubmitTouchData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                }
                SessionData sessionData = (SessionData) obj;
                Status touchDataCollection = (sessionData != null || (status = sessionData.getStatus()) == null) ? null : status.getTouchDataCollection();
                Logger.INSTANCE.info(sessionHelperImp.logTag, "isNeedToSubmitTouchData:" + (touchDataCollection != null ? touchDataCollection.name() : null));
                return Boxing.boxBoolean(touchDataCollection != Status.Done);
            }
        }
        sessionHelperImp$isNeedToSubmitTouchData$1 = new SessionHelperImp$isNeedToSubmitTouchData$1(this, continuation);
        Object obj2 = sessionHelperImp$isNeedToSubmitTouchData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$isNeedToSubmitTouchData$1.label;
        if (i10 != 0) {
        }
        SessionData sessionData2 = (SessionData) obj2;
        if (sessionData2 != null) {
        }
        if (touchDataCollection != null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "isNeedToSubmitTouchData:" + (touchDataCollection != null ? touchDataCollection.name() : null));
        return Boxing.boxBoolean(touchDataCollection != Status.Done);
    }

    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    public Object reinitialize(@NotNull Continuation<? super Unit> continuation) {
        Object clearSession = this.preferencesHelper.clearSession(continuation);
        return clearSession == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? clearSession : Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setDeviceDataCollectionIsDone(@NotNull Continuation<? super Unit> continuation) {
        SessionHelperImp$setDeviceDataCollectionIsDone$1 sessionHelperImp$setDeviceDataCollectionIsDone$1;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionData sessionData;
        SessionHelperImp sessionHelperImp2;
        if (continuation instanceof SessionHelperImp$setDeviceDataCollectionIsDone$1) {
            sessionHelperImp$setDeviceDataCollectionIsDone$1 = (SessionHelperImp$setDeviceDataCollectionIsDone$1) continuation;
            int i11 = sessionHelperImp$setDeviceDataCollectionIsDone$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$setDeviceDataCollectionIsDone$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$setDeviceDataCollectionIsDone$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$setDeviceDataCollectionIsDone$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$setDeviceDataCollectionIsDone$1.L$0 = this;
                    sessionHelperImp$setDeviceDataCollectionIsDone$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$setDeviceDataCollectionIsDone$1);
                    if (obj != coroutine_suspended) {
                        sessionHelperImp = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionHelperImp2 = (SessionHelperImp) sessionHelperImp$setDeviceDataCollectionIsDone$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sessionHelperImp = sessionHelperImp2;
                    Logger.INSTANCE.info(sessionHelperImp.logTag, "Set DeviceDataCollectionIsDone");
                    return Unit.INSTANCE;
                }
                sessionHelperImp = (SessionHelperImp) sessionHelperImp$setDeviceDataCollectionIsDone$1.L$0;
                ResultKt.throwOnFailure(obj);
                sessionData = (SessionData) obj;
                if (sessionData != null) {
                    sessionData.setStatus(new SessionStatus(sessionData.getStatus().getPlayIntegrity(), Status.Done, sessionData.getStatus().getTouchDataCollection()));
                    PreferencesHelper preferencesHelper2 = sessionHelperImp.preferencesHelper;
                    sessionHelperImp$setDeviceDataCollectionIsDone$1.L$0 = sessionHelperImp;
                    sessionHelperImp$setDeviceDataCollectionIsDone$1.label = 2;
                    if (preferencesHelper2.saveSession(sessionData, sessionHelperImp$setDeviceDataCollectionIsDone$1) != coroutine_suspended) {
                        sessionHelperImp2 = sessionHelperImp;
                        sessionHelperImp = sessionHelperImp2;
                    }
                    return coroutine_suspended;
                }
                Logger.INSTANCE.info(sessionHelperImp.logTag, "Set DeviceDataCollectionIsDone");
                return Unit.INSTANCE;
            }
        }
        sessionHelperImp$setDeviceDataCollectionIsDone$1 = new SessionHelperImp$setDeviceDataCollectionIsDone$1(this, continuation);
        Object obj2 = sessionHelperImp$setDeviceDataCollectionIsDone$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$setDeviceDataCollectionIsDone$1.label;
        if (i10 != 0) {
        }
        sessionData = (SessionData) obj2;
        if (sessionData != null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "Set DeviceDataCollectionIsDone");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setPlayIntegrityIsDone(@NotNull Continuation<? super Unit> continuation) {
        SessionHelperImp$setPlayIntegrityIsDone$1 sessionHelperImp$setPlayIntegrityIsDone$1;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionData sessionData;
        SessionHelperImp sessionHelperImp2;
        if (continuation instanceof SessionHelperImp$setPlayIntegrityIsDone$1) {
            sessionHelperImp$setPlayIntegrityIsDone$1 = (SessionHelperImp$setPlayIntegrityIsDone$1) continuation;
            int i11 = sessionHelperImp$setPlayIntegrityIsDone$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$setPlayIntegrityIsDone$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$setPlayIntegrityIsDone$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$setPlayIntegrityIsDone$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$setPlayIntegrityIsDone$1.L$0 = this;
                    sessionHelperImp$setPlayIntegrityIsDone$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$setPlayIntegrityIsDone$1);
                    if (obj != coroutine_suspended) {
                        sessionHelperImp = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionHelperImp2 = (SessionHelperImp) sessionHelperImp$setPlayIntegrityIsDone$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sessionHelperImp = sessionHelperImp2;
                    Logger.INSTANCE.info(sessionHelperImp.logTag, "Set PlayIntegrityIsDone");
                    return Unit.INSTANCE;
                }
                sessionHelperImp = (SessionHelperImp) sessionHelperImp$setPlayIntegrityIsDone$1.L$0;
                ResultKt.throwOnFailure(obj);
                sessionData = (SessionData) obj;
                if (sessionData != null) {
                    sessionData.setStatus(new SessionStatus(Status.Done, sessionData.getStatus().getNativeDataCollection(), sessionData.getStatus().getTouchDataCollection()));
                    PreferencesHelper preferencesHelper2 = sessionHelperImp.preferencesHelper;
                    sessionHelperImp$setPlayIntegrityIsDone$1.L$0 = sessionHelperImp;
                    sessionHelperImp$setPlayIntegrityIsDone$1.label = 2;
                    if (preferencesHelper2.saveSession(sessionData, sessionHelperImp$setPlayIntegrityIsDone$1) != coroutine_suspended) {
                        sessionHelperImp2 = sessionHelperImp;
                        sessionHelperImp = sessionHelperImp2;
                    }
                    return coroutine_suspended;
                }
                Logger.INSTANCE.info(sessionHelperImp.logTag, "Set PlayIntegrityIsDone");
                return Unit.INSTANCE;
            }
        }
        sessionHelperImp$setPlayIntegrityIsDone$1 = new SessionHelperImp$setPlayIntegrityIsDone$1(this, continuation);
        Object obj2 = sessionHelperImp$setPlayIntegrityIsDone$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$setPlayIntegrityIsDone$1.label;
        if (i10 != 0) {
        }
        sessionData = (SessionData) obj2;
        if (sessionData != null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "Set PlayIntegrityIsDone");
        return Unit.INSTANCE;
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    @Override // ai.verisoul.sdk.helpers.session.SessionHelper
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object setSubmitTouchDataIsDone(@NotNull Continuation<? super Unit> continuation) {
        SessionHelperImp$setSubmitTouchDataIsDone$1 sessionHelperImp$setSubmitTouchDataIsDone$1;
        int i10;
        SessionHelperImp sessionHelperImp;
        SessionData sessionData;
        SessionHelperImp sessionHelperImp2;
        if (continuation instanceof SessionHelperImp$setSubmitTouchDataIsDone$1) {
            sessionHelperImp$setSubmitTouchDataIsDone$1 = (SessionHelperImp$setSubmitTouchDataIsDone$1) continuation;
            int i11 = sessionHelperImp$setSubmitTouchDataIsDone$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionHelperImp$setSubmitTouchDataIsDone$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionHelperImp$setSubmitTouchDataIsDone$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionHelperImp$setSubmitTouchDataIsDone$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    PreferencesHelper preferencesHelper = this.preferencesHelper;
                    sessionHelperImp$setSubmitTouchDataIsDone$1.L$0 = this;
                    sessionHelperImp$setSubmitTouchDataIsDone$1.label = 1;
                    obj = preferencesHelper.getSession(sessionHelperImp$setSubmitTouchDataIsDone$1);
                    if (obj != coroutine_suspended) {
                        sessionHelperImp = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 != 1) {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    sessionHelperImp2 = (SessionHelperImp) sessionHelperImp$setSubmitTouchDataIsDone$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sessionHelperImp = sessionHelperImp2;
                    Logger.INSTANCE.info(sessionHelperImp.logTag, "Set TouchDataIsDone");
                    return Unit.INSTANCE;
                }
                sessionHelperImp = (SessionHelperImp) sessionHelperImp$setSubmitTouchDataIsDone$1.L$0;
                ResultKt.throwOnFailure(obj);
                sessionData = (SessionData) obj;
                if (sessionData != null) {
                    sessionData.setStatus(new SessionStatus(sessionData.getStatus().getPlayIntegrity(), sessionData.getStatus().getNativeDataCollection(), Status.Done));
                    PreferencesHelper preferencesHelper2 = sessionHelperImp.preferencesHelper;
                    sessionHelperImp$setSubmitTouchDataIsDone$1.L$0 = sessionHelperImp;
                    sessionHelperImp$setSubmitTouchDataIsDone$1.label = 2;
                    if (preferencesHelper2.saveSession(sessionData, sessionHelperImp$setSubmitTouchDataIsDone$1) != coroutine_suspended) {
                        sessionHelperImp2 = sessionHelperImp;
                        sessionHelperImp = sessionHelperImp2;
                    }
                    return coroutine_suspended;
                }
                Logger.INSTANCE.info(sessionHelperImp.logTag, "Set TouchDataIsDone");
                return Unit.INSTANCE;
            }
        }
        sessionHelperImp$setSubmitTouchDataIsDone$1 = new SessionHelperImp$setSubmitTouchDataIsDone$1(this, continuation);
        Object obj2 = sessionHelperImp$setSubmitTouchDataIsDone$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionHelperImp$setSubmitTouchDataIsDone$1.label;
        if (i10 != 0) {
        }
        sessionData = (SessionData) obj2;
        if (sessionData != null) {
        }
        Logger.INSTANCE.info(sessionHelperImp.logTag, "Set TouchDataIsDone");
        return Unit.INSTANCE;
    }
}
