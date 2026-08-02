package ai.verisoul.sdk;

import Ph.AbstractC1440a0;
import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.F0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X;
import Ph.X0;
import Wh.a;
import Wh.g;
import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.session.SessionData;
import ai.verisoul.sdk.helpers.session.SessionHelper;
import ai.verisoul.sdk.helpers.session.Status;
import ai.verisoul.sdk.logger.Logger;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.random.Random;
import kotlin.ranges.IntRange;
import kotlin.ranges.RangesKt;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J*\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\b\u0002\u0010\t\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ(\u0010\u000e\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\bH\u0082@¢\u0006\u0004\b\u000e\u0010\fJ \u0010\u000f\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\r\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\r\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004H\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\n¢\u0006\u0004\b\u0013\u0010\u0003R\u001b\u0010\u0019\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001b\u001a\u00020\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0016\u0010\u001e\u001a\u00020\u001d8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010!\u001a\u00020 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001e\u0010$\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010#8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010&\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0018\u0010(\u001a\u0004\u0018\u00010\u00048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b(\u0010'R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0007\u0010)¨\u0006*"}, d2 = {"Lai/verisoul/sdk/SessionManager;", "", "<init>", "()V", "", "projectId", "Lai/verisoul/sdk/VerisoulEnvironment;", "env", "", "isReinitialization", "", "generateTokenInternal", "(Ljava/lang/String;Lai/verisoul/sdk/VerisoulEnvironment;ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "reinitialize", "collectData", "init", "(Ljava/lang/String;Lai/verisoul/sdk/VerisoulEnvironment;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getSessionId", "(Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdown", "Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "getSessionHelper", "()Lai/verisoul/sdk/helpers/session/SessionHelper;", "sessionHelper", "LPh/M;", "exceptionHandler", "LPh/M;", "LPh/P;", "scope", "LPh/P;", "LWh/a;", "generationLock", "LWh/a;", "LPh/X;", "currentSessionGeneration", "LPh/X;", "TAG", "Ljava/lang/String;", "projectid", "Lai/verisoul/sdk/VerisoulEnvironment;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSessionManager.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SessionManager.kt\nai/verisoul/sdk/SessionManager\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n+ 5 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,235:1\n120#2,10:236\n120#2,10:246\n120#2,10:256\n120#2,10:266\n1#3:276\n67#4:277\n48#5,4:278\n*S KotlinDebug\n*F\n+ 1 SessionManager.kt\nai/verisoul/sdk/SessionManager\n*L\n63#1:236,10\n67#1:246,10\n118#1:256,10\n146#1:266,10\n23#1:277\n25#1:278,4\n*E\n"})
/* loaded from: classes.dex */
public final class SessionManager {

    @NotNull
    private static final String TAG;

    @Nullable
    private static X currentSessionGeneration;

    @Nullable
    private static VerisoulEnvironment env;

    @NotNull
    private static final M exceptionHandler;

    @NotNull
    private static final a generationLock;

    @Nullable
    private static String projectid;

    @NotNull
    private static volatile P scope;
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SessionManager.class, "sessionHelper", "getSessionHelper()Lai/verisoul/sdk/helpers/session/SessionHelper;", 0))};

    @NotNull
    public static final SessionManager INSTANCE = new SessionManager();

    /* renamed from: sessionHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private static final InjectDelegate sessionHelper = new InjectDelegate(SessionHelper.class);

    static {
        SessionManager$special$$inlined$CoroutineExceptionHandler$1 sessionManager$special$$inlined$CoroutineExceptionHandler$1 = new SessionManager$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2);
        exceptionHandler = sessionManager$special$$inlined$CoroutineExceptionHandler$1;
        scope = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(sessionManager$special$$inlined$CoroutineExceptionHandler$1));
        generationLock = g.b(false, 1, null);
        TAG = String.valueOf(Reflection.getOrCreateKotlinClass(SessionManager.class).getSimpleName());
    }

    private SessionManager() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x00ac, code lost:
    
        if (r11.setDeviceDataCollectionIsDone(r0) == r1) goto L30;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x00c8  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object collectData(String str, VerisoulEnvironment verisoulEnvironment, boolean z10, Continuation<? super String> continuation) {
        SessionManager$collectData$1 sessionManager$collectData$1;
        Object coroutine_suspended;
        int i10;
        SessionManager sessionManager;
        Object collectNativeDataAndPost;
        String str2;
        if (continuation instanceof SessionManager$collectData$1) {
            sessionManager$collectData$1 = (SessionManager$collectData$1) continuation;
            int i11 = sessionManager$collectData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                sessionManager$collectData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = sessionManager$collectData$1.result;
                coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = sessionManager$collectData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    Logger.INSTANCE.info(TAG, "Collect data (reinitialize: " + z10 + ")");
                    SessionHelper sessionHelper2 = getSessionHelper();
                    sessionManager$collectData$1.L$0 = this;
                    sessionManager$collectData$1.label = 1;
                    obj = sessionHelper2.initSessionId(str, verisoulEnvironment, z10, sessionManager$collectData$1);
                    if (obj != coroutine_suspended) {
                        sessionManager = this;
                    }
                    return coroutine_suspended;
                }
                if (i10 == 1) {
                    SessionManager sessionManager2 = (SessionManager) sessionManager$collectData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    sessionManager = sessionManager2;
                } else {
                    if (i10 != 2) {
                        if (i10 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        str2 = (String) sessionManager$collectData$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        Logger.INSTANCE.info(TAG, "Collect data done for SID: " + str2);
                        return str2;
                    }
                    str2 = (String) sessionManager$collectData$1.L$1;
                    sessionManager = (SessionManager) sessionManager$collectData$1.L$0;
                    ResultKt.throwOnFailure(obj);
                    if (((Boolean) obj).booleanValue()) {
                        throw new IllegalArgumentException(("Failed to collect native data for session: " + str2).toString());
                    }
                    SessionHelper sessionHelper3 = sessionManager.getSessionHelper();
                    sessionManager$collectData$1.L$0 = str2;
                    sessionManager$collectData$1.L$1 = null;
                    sessionManager$collectData$1.label = 3;
                }
                String str3 = (String) obj;
                Core core = Core.INSTANCE;
                sessionManager$collectData$1.L$0 = sessionManager;
                sessionManager$collectData$1.L$1 = str3;
                sessionManager$collectData$1.label = 2;
                collectNativeDataAndPost = core.collectNativeDataAndPost(str3, sessionManager$collectData$1);
                if (collectNativeDataAndPost != coroutine_suspended) {
                    obj = collectNativeDataAndPost;
                    str2 = str3;
                    if (((Boolean) obj).booleanValue()) {
                    }
                }
                return coroutine_suspended;
            }
        }
        sessionManager$collectData$1 = new SessionManager$collectData$1(this, continuation);
        Object obj2 = sessionManager$collectData$1.result;
        coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionManager$collectData$1.label;
        if (i10 != 0) {
        }
        String str32 = (String) obj2;
        Core core2 = Core.INSTANCE;
        sessionManager$collectData$1.L$0 = sessionManager;
        sessionManager$collectData$1.L$1 = str32;
        sessionManager$collectData$1.label = 2;
        collectNativeDataAndPost = core2.collectNativeDataAndPost(str32, sessionManager$collectData$1);
        if (collectNativeDataAndPost != coroutine_suspended) {
        }
        return coroutine_suspended;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object generateTokenInternal(String str, VerisoulEnvironment verisoulEnvironment, boolean z10, Continuation<? super Unit> continuation) {
        SessionManager$generateTokenInternal$1 sessionManager$generateTokenInternal$1;
        int i10;
        a aVar;
        X x10;
        X b10;
        try {
            if (continuation instanceof SessionManager$generateTokenInternal$1) {
                sessionManager$generateTokenInternal$1 = (SessionManager$generateTokenInternal$1) continuation;
                int i11 = sessionManager$generateTokenInternal$1.label;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    sessionManager$generateTokenInternal$1.label = i11 - Integer.MIN_VALUE;
                    Object obj = sessionManager$generateTokenInternal$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = sessionManager$generateTokenInternal$1.label;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        aVar = generationLock;
                        sessionManager$generateTokenInternal$1.L$0 = str;
                        sessionManager$generateTokenInternal$1.L$1 = verisoulEnvironment;
                        sessionManager$generateTokenInternal$1.L$2 = aVar;
                        sessionManager$generateTokenInternal$1.Z$0 = z10;
                        sessionManager$generateTokenInternal$1.label = 1;
                        if (aVar.f(null, sessionManager$generateTokenInternal$1) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        z10 = sessionManager$generateTokenInternal$1.Z$0;
                        a aVar2 = (a) sessionManager$generateTokenInternal$1.L$2;
                        verisoulEnvironment = (VerisoulEnvironment) sessionManager$generateTokenInternal$1.L$1;
                        String str2 = (String) sessionManager$generateTokenInternal$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        aVar = aVar2;
                        str = str2;
                    }
                    x10 = currentSessionGeneration;
                    if (x10 != null && x10.isActive()) {
                        Logger.INSTANCE.info(TAG, "Cancelling previous token generation");
                        C0.a.b(x10, null, 1, null);
                    }
                    Logger.INSTANCE.info(TAG, "Starting new token generation");
                    b10 = AbstractC1459k.b(scope, null, null, new SessionManager$generateTokenInternal$2$1(str, verisoulEnvironment, z10, null), 3, null);
                    currentSessionGeneration = b10;
                    Unit unit = Unit.INSTANCE;
                    aVar.g(null);
                    return Unit.INSTANCE;
                }
            }
            x10 = currentSessionGeneration;
            if (x10 != null) {
                Logger.INSTANCE.info(TAG, "Cancelling previous token generation");
                C0.a.b(x10, null, 1, null);
            }
            Logger.INSTANCE.info(TAG, "Starting new token generation");
            b10 = AbstractC1459k.b(scope, null, null, new SessionManager$generateTokenInternal$2$1(str, verisoulEnvironment, z10, null), 3, null);
            currentSessionGeneration = b10;
            Unit unit2 = Unit.INSTANCE;
            aVar.g(null);
            return Unit.INSTANCE;
        } catch (Throwable th2) {
            aVar.g(null);
            throw th2;
        }
        sessionManager$generateTokenInternal$1 = new SessionManager$generateTokenInternal$1(this, continuation);
        Object obj2 = sessionManager$generateTokenInternal$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = sessionManager$generateTokenInternal$1.label;
        if (i10 != 0) {
        }
    }

    public static /* synthetic */ Object generateTokenInternal$default(SessionManager sessionManager, String str, VerisoulEnvironment verisoulEnvironment, boolean z10, Continuation continuation, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        return sessionManager.generateTokenInternal(str, verisoulEnvironment, z10, continuation);
    }

    private final SessionHelper getSessionHelper() {
        return (SessionHelper) sessionHelper.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(2:3|(4:5|6|7|8))|96|6|7|8|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x003b, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x0199, code lost:
    
        ai.verisoul.sdk.logger.Logger.INSTANCE.error(ai.verisoul.sdk.SessionManager.TAG, "VerisoulException: " + r9.getCode() + " - " + r9.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:82:0x01bf, code lost:
    
        throw r9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x01c0, code lost:
    
        ai.verisoul.sdk.logger.Logger.INSTANCE.info(ai.verisoul.sdk.SessionManager.TAG, "Session generation cancelled in getSessionId, returning null to allow retry");
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x01c9, code lost:
    
        return null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x0038, code lost:
    
        r9 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:86:0x0137, code lost:
    
        r2 = ai.verisoul.sdk.SessionManagerKt.findVerisoulException(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x013b, code lost:
    
        if (r2 == null) goto L85;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x013d, code lost:
    
        ai.verisoul.sdk.logger.Logger.INSTANCE.error(ai.verisoul.sdk.SessionManager.TAG, "Failed to get session ID: " + r9.getMessage());
        r9 = ai.verisoul.sdk.SessionManager.projectid;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x015b, code lost:
    
        if (r9 != null) goto L87;
     */
    /* JADX WARN: Code restructure failed: missing block: B:92:0x0161, code lost:
    
        r3 = ai.verisoul.sdk.SessionManager.INSTANCE;
        r0.L$0 = null;
        r0.L$1 = null;
        r0.label = 7;
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x016e, code lost:
    
        if (r3.reinitialize(r9, r2, r0) == r1) goto L91;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0172, code lost:
    
        ai.verisoul.sdk.logger.Logger.INSTANCE.error(ai.verisoul.sdk.SessionManager.TAG, "VerisoulException (wrapped): " + r2.getCode() + " - " + r2.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x0198, code lost:
    
        throw r2;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0033 A[Catch: Exception -> 0x0038, VerisoulException -> 0x003b, CancellationException -> 0x01c0, TRY_ENTER, TRY_LEAVE, TryCatch #3 {VerisoulException -> 0x003b, CancellationException -> 0x01c0, Exception -> 0x0038, blocks: (B:14:0x0033, B:17:0x0042, B:18:0x00ae, B:20:0x00b2, B:22:0x00bc, B:25:0x00c9, B:27:0x00d6, B:29:0x00da, B:33:0x0047, B:36:0x0050, B:37:0x00fe, B:39:0x0102, B:41:0x0108, B:43:0x0114, B:45:0x0119, B:47:0x0126, B:49:0x012a, B:52:0x0059, B:53:0x0095, B:56:0x00eb, B:59:0x009a, B:68:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00e7  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0047 A[Catch: Exception -> 0x0038, VerisoulException -> 0x003b, CancellationException -> 0x01c0, TRY_LEAVE, TryCatch #3 {VerisoulException -> 0x003b, CancellationException -> 0x01c0, Exception -> 0x0038, blocks: (B:14:0x0033, B:17:0x0042, B:18:0x00ae, B:20:0x00b2, B:22:0x00bc, B:25:0x00c9, B:27:0x00d6, B:29:0x00da, B:33:0x0047, B:36:0x0050, B:37:0x00fe, B:39:0x0102, B:41:0x0108, B:43:0x0114, B:45:0x0119, B:47:0x0126, B:49:0x012a, B:52:0x0059, B:53:0x0095, B:56:0x00eb, B:59:0x009a, B:68:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:35:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0102 A[Catch: Exception -> 0x0038, VerisoulException -> 0x003b, CancellationException -> 0x01c0, TryCatch #3 {VerisoulException -> 0x003b, CancellationException -> 0x01c0, Exception -> 0x0038, blocks: (B:14:0x0033, B:17:0x0042, B:18:0x00ae, B:20:0x00b2, B:22:0x00bc, B:25:0x00c9, B:27:0x00d6, B:29:0x00da, B:33:0x0047, B:36:0x0050, B:37:0x00fe, B:39:0x0102, B:41:0x0108, B:43:0x0114, B:45:0x0119, B:47:0x0126, B:49:0x012a, B:52:0x0059, B:53:0x0095, B:56:0x00eb, B:59:0x009a, B:68:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0126 A[Catch: Exception -> 0x0038, VerisoulException -> 0x003b, CancellationException -> 0x01c0, TryCatch #3 {VerisoulException -> 0x003b, CancellationException -> 0x01c0, Exception -> 0x0038, blocks: (B:14:0x0033, B:17:0x0042, B:18:0x00ae, B:20:0x00b2, B:22:0x00bc, B:25:0x00c9, B:27:0x00d6, B:29:0x00da, B:33:0x0047, B:36:0x0050, B:37:0x00fe, B:39:0x0102, B:41:0x0108, B:43:0x0114, B:45:0x0119, B:47:0x0126, B:49:0x012a, B:52:0x0059, B:53:0x0095, B:56:0x00eb, B:59:0x009a, B:68:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x009a A[Catch: Exception -> 0x0038, VerisoulException -> 0x003b, CancellationException -> 0x01c0, TryCatch #3 {VerisoulException -> 0x003b, CancellationException -> 0x01c0, Exception -> 0x0038, blocks: (B:14:0x0033, B:17:0x0042, B:18:0x00ae, B:20:0x00b2, B:22:0x00bc, B:25:0x00c9, B:27:0x00d6, B:29:0x00da, B:33:0x0047, B:36:0x0050, B:37:0x00fe, B:39:0x0102, B:41:0x0108, B:43:0x0114, B:45:0x0119, B:47:0x0126, B:49:0x012a, B:52:0x0059, B:53:0x0095, B:56:0x00eb, B:59:0x009a, B:68:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x005d  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x0085 A[Catch: Exception -> 0x0038, VerisoulException -> 0x003b, CancellationException -> 0x01c0, TRY_ENTER, TryCatch #3 {VerisoulException -> 0x003b, CancellationException -> 0x01c0, Exception -> 0x0038, blocks: (B:14:0x0033, B:17:0x0042, B:18:0x00ae, B:20:0x00b2, B:22:0x00bc, B:25:0x00c9, B:27:0x00d6, B:29:0x00da, B:33:0x0047, B:36:0x0050, B:37:0x00fe, B:39:0x0102, B:41:0x0108, B:43:0x0114, B:45:0x0119, B:47:0x0126, B:49:0x012a, B:52:0x0059, B:53:0x0095, B:56:0x00eb, B:59:0x009a, B:68:0x0085), top: B:7:0x0023 }] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x00ea  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0026  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object getSessionId(@NotNull Continuation<? super String> continuation) {
        SessionManager$getSessionId$1 sessionManager$getSessionId$1;
        a aVar;
        SessionManager sessionManager;
        X x10;
        SessionManager sessionManager2;
        String str;
        String str2;
        SessionData sessionData;
        String str3;
        VerisoulEnvironment verisoulEnvironment;
        SessionData sessionData2;
        String str4;
        VerisoulEnvironment verisoulEnvironment2;
        SessionManager sessionManager3;
        if (continuation instanceof SessionManager$getSessionId$1) {
            sessionManager$getSessionId$1 = (SessionManager$getSessionId$1) continuation;
            int i10 = sessionManager$getSessionId$1.label;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                sessionManager$getSessionId$1.label = i10 - Integer.MIN_VALUE;
                Object obj = sessionManager$getSessionId$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                switch (sessionManager$getSessionId$1.label) {
                    case 0:
                        ResultKt.throwOnFailure(obj);
                        aVar = generationLock;
                        sessionManager$getSessionId$1.L$0 = this;
                        sessionManager$getSessionId$1.L$1 = aVar;
                        sessionManager$getSessionId$1.label = 1;
                        if (aVar.f(null, sessionManager$getSessionId$1) != coroutine_suspended) {
                            sessionManager = this;
                            try {
                                x10 = currentSessionGeneration;
                                if (x10 != null) {
                                    sessionManager2 = sessionManager;
                                    SessionHelper sessionHelper2 = sessionManager2.getSessionHelper();
                                    sessionManager$getSessionId$1.L$0 = sessionManager2;
                                    sessionManager$getSessionId$1.L$1 = null;
                                    sessionManager$getSessionId$1.label = 3;
                                    obj = sessionHelper2.getSession(sessionManager$getSessionId$1);
                                    if (obj == coroutine_suspended) {
                                    }
                                    sessionData = (SessionData) obj;
                                    if (sessionData == null) {
                                    }
                                    Logger.INSTANCE.info(TAG, "No valid cached session, reinitializing");
                                    str3 = projectid;
                                    if (str3 != null) {
                                        sessionManager$getSessionId$1.L$0 = null;
                                        sessionManager$getSessionId$1.label = 4;
                                        if (sessionManager2.reinitialize(str3, verisoulEnvironment, sessionManager$getSessionId$1) != coroutine_suspended) {
                                        }
                                    }
                                    return null;
                                }
                                sessionManager$getSessionId$1.L$0 = sessionManager;
                                sessionManager$getSessionId$1.L$1 = null;
                                sessionManager$getSessionId$1.label = 2;
                                obj = x10.await(sessionManager$getSessionId$1);
                                if (obj != coroutine_suspended) {
                                    sessionManager2 = sessionManager;
                                    str = (String) obj;
                                    if (str != null) {
                                        SessionHelper sessionHelper22 = sessionManager2.getSessionHelper();
                                        sessionManager$getSessionId$1.L$0 = sessionManager2;
                                        sessionManager$getSessionId$1.L$1 = null;
                                        sessionManager$getSessionId$1.label = 3;
                                        obj = sessionHelper22.getSession(sessionManager$getSessionId$1);
                                        if (obj == coroutine_suspended) {
                                        }
                                        sessionData = (SessionData) obj;
                                        if (sessionData == null && !sessionData.isExpired() && sessionData.getStatus().getNativeDataCollection() == Status.Done) {
                                            return sessionData.getSessionId();
                                        }
                                        Logger.INSTANCE.info(TAG, "No valid cached session, reinitializing");
                                        str3 = projectid;
                                        if (str3 != null && (verisoulEnvironment = env) != null) {
                                            sessionManager$getSessionId$1.L$0 = null;
                                            sessionManager$getSessionId$1.label = 4;
                                            if (sessionManager2.reinitialize(str3, verisoulEnvironment, sessionManager$getSessionId$1) != coroutine_suspended) {
                                            }
                                        }
                                        return null;
                                    }
                                    SessionHelper sessionHelper3 = sessionManager2.getSessionHelper();
                                    sessionManager$getSessionId$1.L$0 = str;
                                    sessionManager$getSessionId$1.label = 5;
                                    Object session = sessionHelper3.getSession(sessionManager$getSessionId$1);
                                    if (session != coroutine_suspended) {
                                        str2 = str;
                                        obj = session;
                                        sessionData2 = (SessionData) obj;
                                        if (sessionData2 == null && Intrinsics.areEqual(sessionData2.getSessionId(), str2) && sessionData2.getStatus().getNativeDataCollection() == Status.Done) {
                                            return str2;
                                        }
                                        Logger.INSTANCE.error(TAG, "Session state mismatch, reinitializing");
                                        str4 = projectid;
                                        if (str4 != null && (verisoulEnvironment2 = env) != null) {
                                            sessionManager3 = INSTANCE;
                                            sessionManager$getSessionId$1.L$0 = null;
                                            sessionManager$getSessionId$1.label = 6;
                                            if (sessionManager3.reinitialize(str4, verisoulEnvironment2, sessionManager$getSessionId$1) == coroutine_suspended) {
                                            }
                                        }
                                        return null;
                                    }
                                }
                            } finally {
                                aVar.g(null);
                            }
                        }
                        return coroutine_suspended;
                    case 1:
                        aVar = (a) sessionManager$getSessionId$1.L$1;
                        sessionManager = (SessionManager) sessionManager$getSessionId$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        x10 = currentSessionGeneration;
                        if (x10 != null) {
                        }
                        break;
                    case 2:
                        sessionManager2 = (SessionManager) sessionManager$getSessionId$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        str = (String) obj;
                        if (str != null) {
                        }
                        break;
                    case 3:
                        sessionManager2 = (SessionManager) sessionManager$getSessionId$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        sessionData = (SessionData) obj;
                        if (sessionData == null) {
                        }
                        Logger.INSTANCE.info(TAG, "No valid cached session, reinitializing");
                        str3 = projectid;
                        if (str3 != null) {
                        }
                        return null;
                    case 4:
                        ResultKt.throwOnFailure(obj);
                        return null;
                    case 5:
                        str2 = (String) sessionManager$getSessionId$1.L$0;
                        ResultKt.throwOnFailure(obj);
                        sessionData2 = (SessionData) obj;
                        if (sessionData2 == null) {
                            break;
                        }
                        Logger.INSTANCE.error(TAG, "Session state mismatch, reinitializing");
                        str4 = projectid;
                        if (str4 != null) {
                            sessionManager3 = INSTANCE;
                            sessionManager$getSessionId$1.L$0 = null;
                            sessionManager$getSessionId$1.label = 6;
                            if (sessionManager3.reinitialize(str4, verisoulEnvironment2, sessionManager$getSessionId$1) == coroutine_suspended) {
                            }
                            break;
                        }
                        return null;
                    case 6:
                        ResultKt.throwOnFailure(obj);
                        return null;
                    case 7:
                        ResultKt.throwOnFailure(obj);
                        return null;
                    default:
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
            }
        }
        sessionManager$getSessionId$1 = new SessionManager$getSessionId$1(this, continuation);
        Object obj2 = sessionManager$getSessionId$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        switch (sessionManager$getSessionId$1.label) {
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(4:(2:3|(4:5|6|7|8))|7|8|(3:(0)|(1:95)|(1:82))) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:35|36|37|38|(1:40)) */
    /* JADX WARN: Can't wrap try/catch for region: R(5:44|45|46|47|(3:49|(9:51|52|53|(1:55)|56|(3:58|103|104)|60|61|(3:63|103|104)(2:64|(7:66|13|14|15|(0)|103|104)))|96)(8:67|53|(0)|56|(0)|60|61|(0)(0))) */
    /* JADX WARN: Can't wrap try/catch for region: R(6:20|21|22|23|24|(9:26|27|28|29|(1:31)(1:89)|32|33|(5:35|36|37|38|(1:40))(1:85)|41)) */
    /* JADX WARN: Can't wrap try/catch for region: R(9:26|27|28|29|(1:31)(1:89)|32|33|(5:35|36|37|38|(1:40))(1:85)|41) */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x007c, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x007d, code lost:
    
        r8 = r17;
        r14 = r18;
        r15 = r19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:135:0x00cd, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0278, code lost:
    
        if (r0.f(null, r4) == r5) goto L128;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x02a3, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x02a4, code lost:
    
        r2 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0319, code lost:
    
        r1 = ai.verisoul.sdk.SessionManagerKt.findVerisoulException(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x031d, code lost:
    
        if (r1 != null) goto L117;
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x032c, code lost:
    
        ai.verisoul.sdk.logger.Logger.INSTANCE.error(ai.verisoul.sdk.SessionManager.TAG, "Init failed with non-retryable error: " + r1.getCode() + " - " + r1.getMessage());
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0354, code lost:
    
        throw r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x0355, code lost:
    
        ai.verisoul.sdk.logger.Logger.INSTANCE.error(ai.verisoul.sdk.SessionManager.TAG, "Init retry failed (attempt " + r2 + "): " + r0.getMessage() + ". Retrying in " + r6 + " ms");
        r4 = r4;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:83:0x0239, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x023a, code lost:
    
        r2 = r15;
        r15 = r20;
        r14 = r21;
        r8 = r22;
        r4 = r24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0245, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0246, code lost:
    
        r2 = r15;
        r15 = r3;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x030f, code lost:
    
        r0 = th;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0310, code lost:
    
        r8 = r2;
        r2 = r15;
        r15 = r14;
        r14 = r3;
     */
    /* JADX WARN: Finally extract failed */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Not initialized variable reg: 17, insn: 0x007d: MOVE (r8 I:??[OBJECT, ARRAY]) = (r17 I:??[OBJECT, ARRAY]), block:B:134:0x007d */
    /* JADX WARN: Not initialized variable reg: 18, insn: 0x007f: MOVE (r14 I:??[OBJECT, ARRAY]) = (r18 I:??[OBJECT, ARRAY]), block:B:134:0x007d */
    /* JADX WARN: Not initialized variable reg: 19, insn: 0x0081: MOVE (r15 I:??[OBJECT, ARRAY]) = (r19 I:??[OBJECT, ARRAY]), block:B:134:0x007d */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0057  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:111:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x00ec  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x010d  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0181  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x019f  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x01fe  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0206 A[Catch: CancellationException -> 0x0085, all -> 0x0245, TRY_LEAVE, TryCatch #2 {all -> 0x0245, blocks: (B:33:0x0201, B:35:0x0206), top: B:32:0x0201 }] */
    /* JADX WARN: Removed duplicated region for block: B:55:0x02c6  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x02d0 A[Catch: CancellationException -> 0x0085, all -> 0x00cd, TRY_LEAVE, TryCatch #7 {all -> 0x00cd, blocks: (B:41:0x025e, B:52:0x02a0, B:53:0x02a8, B:56:0x02c8, B:58:0x02d0, B:112:0x00c5, B:115:0x00e7, B:117:0x0104), top: B:7:0x0029 }] */
    /* JADX WARN: Removed duplicated region for block: B:63:0x039a  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x03a4  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0253  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x002c  */
    /* JADX WARN: Type inference failed for: r2v0, types: [ai.verisoul.sdk.VerisoulEnvironment, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v19 */
    /* JADX WARN: Type inference failed for: r2v23 */
    /* JADX WARN: Type inference failed for: r2v49 */
    /* JADX WARN: Type inference failed for: r2v50 */
    /* JADX WARN: Type inference failed for: r2v7, types: [int] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:66:0x03e6 -> B:13:0x0054). Please report as a decompilation issue!!! */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object init(@NotNull String str, @NotNull VerisoulEnvironment verisoulEnvironment, @NotNull Continuation<? super Unit> continuation) {
        SessionManager$init$1 sessionManager$init$1;
        long j10;
        VerisoulEnvironment verisoulEnvironment2;
        String str2;
        SessionManager sessionManager;
        long j11;
        long j12;
        SessionManager sessionManager2;
        long currentTimeMillis;
        int i10;
        String str3;
        long j13;
        long j14;
        long j15;
        int i11;
        int i12;
        Object obj;
        int i13;
        a aVar;
        int i14;
        Object obj2;
        SessionManager sessionManager3;
        a aVar2;
        boolean z10;
        VerisoulEnvironment verisoulEnvironment3;
        int i15;
        VerisoulEnvironment verisoulEnvironment4;
        SessionManager sessionManager4;
        VerisoulEnvironment verisoulEnvironment5;
        String str4;
        VerisoulEnvironment verisoulEnvironment6;
        String str5 = str;
        int i16 = verisoulEnvironment;
        try {
            if (continuation instanceof SessionManager$init$1) {
                sessionManager$init$1 = (SessionManager$init$1) continuation;
                int i17 = sessionManager$init$1.label;
                if ((i17 & Integer.MIN_VALUE) != 0) {
                    sessionManager$init$1.label = i17 - Integer.MIN_VALUE;
                    Object obj3 = sessionManager$init$1.result;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    j10 = sessionManager$init$1.label;
                    switch (j10) {
                        case 0:
                            ResultKt.throwOnFailure(obj3);
                            projectid = str5;
                            env = i16;
                            Logger.INSTANCE.info(TAG, "SessionManager.init");
                            SessionHelper sessionHelper2 = getSessionHelper();
                            sessionManager$init$1.L$0 = this;
                            sessionManager$init$1.L$1 = str5;
                            sessionManager$init$1.L$2 = i16;
                            sessionManager$init$1.label = 1;
                            obj3 = sessionHelper2.isNeedToGenerateAnewToken(sessionManager$init$1);
                            if (obj3 != coroutine_suspended) {
                                sessionManager4 = this;
                                verisoulEnvironment5 = i16;
                                VerisoulEnvironment verisoulEnvironment7 = verisoulEnvironment5;
                                if (!((Boolean) obj3).booleanValue()) {
                                    SessionHelper sessionHelper3 = sessionManager4.getSessionHelper();
                                    sessionManager$init$1.L$0 = sessionManager4;
                                    sessionManager$init$1.L$1 = str5;
                                    sessionManager$init$1.L$2 = verisoulEnvironment5;
                                    sessionManager$init$1.label = 2;
                                    obj3 = sessionHelper3.isNeedToSubmitDeviceData(sessionManager$init$1);
                                    if (obj3 != coroutine_suspended) {
                                        VerisoulEnvironment verisoulEnvironment8 = verisoulEnvironment5;
                                        str4 = str5;
                                        verisoulEnvironment6 = verisoulEnvironment8;
                                        if (((Boolean) obj3).booleanValue()) {
                                            String str6 = str4;
                                            verisoulEnvironment7 = verisoulEnvironment6;
                                            str5 = str6;
                                        }
                                        return Unit.INSTANCE;
                                    }
                                }
                                j12 = System.currentTimeMillis();
                                j15 = 18000;
                                sessionManager2 = sessionManager4;
                                j10 = 1000;
                                str3 = str5;
                                i15 = 0;
                                verisoulEnvironment3 = verisoulEnvironment7;
                                if (F0.q(sessionManager$init$1.get$context())) {
                                    i14 = i15 + 1;
                                    long j16 = j15;
                                    long currentTimeMillis2 = System.currentTimeMillis() - j12;
                                    if (currentTimeMillis2 >= j16) {
                                        Logger.INSTANCE.error(TAG, "Init timeout after " + currentTimeMillis2 + "ms (" + i14 + " attempts)");
                                    } else {
                                        try {
                                        } catch (Throwable th2) {
                                            th = th2;
                                            j11 = j16;
                                            break;
                                        }
                                        aVar2 = generationLock;
                                        sessionManager$init$1.L$0 = sessionManager2;
                                        sessionManager$init$1.L$1 = str3;
                                        sessionManager$init$1.L$2 = verisoulEnvironment3;
                                        sessionManager$init$1.L$3 = aVar2;
                                        sessionManager$init$1.J$0 = j12;
                                        j11 = j16;
                                        sessionManager$init$1.J$1 = j11;
                                        sessionManager$init$1.J$2 = j10;
                                        sessionManager$init$1.I$0 = i14;
                                        sessionManager$init$1.label = 3;
                                        obj2 = null;
                                        if (aVar2.f(null, sessionManager$init$1) != coroutine_suspended) {
                                            try {
                                                SessionManager sessionManager5 = sessionManager2;
                                                str2 = str3;
                                                sessionManager3 = sessionManager5;
                                                verisoulEnvironment2 = verisoulEnvironment3;
                                                z10 = currentSessionGeneration == null;
                                                r2.g(obj2);
                                                if (z10) {
                                                    sessionManager$init$1.L$0 = sessionManager3;
                                                    sessionManager$init$1.L$1 = str2;
                                                    sessionManager$init$1.L$2 = verisoulEnvironment2;
                                                    sessionManager$init$1.L$3 = obj2;
                                                    sessionManager$init$1.J$0 = j12;
                                                    sessionManager$init$1.J$1 = j11;
                                                    sessionManager$init$1.J$2 = j10;
                                                    sessionManager$init$1.I$0 = i14;
                                                    sessionManager$init$1.label = 4;
                                                    SessionManager sessionManager6 = sessionManager3;
                                                    SessionManager$init$1 sessionManager$init$12 = sessionManager$init$1;
                                                    VerisoulEnvironment verisoulEnvironment9 = verisoulEnvironment2;
                                                    String str7 = str2;
                                                    if (generateTokenInternal$default(sessionManager6, str7, verisoulEnvironment9, false, sessionManager$init$12, 4, null) != coroutine_suspended) {
                                                        i13 = i14;
                                                        sessionManager = sessionManager6;
                                                        str2 = str7;
                                                        verisoulEnvironment2 = verisoulEnvironment9;
                                                        sessionManager$init$1 = sessionManager$init$12;
                                                    }
                                                } else {
                                                    i13 = i14;
                                                    sessionManager = sessionManager3;
                                                }
                                                aVar = generationLock;
                                                sessionManager$init$1.L$0 = sessionManager;
                                                sessionManager$init$1.L$1 = str2;
                                                sessionManager$init$1.L$2 = verisoulEnvironment2;
                                                sessionManager$init$1.L$3 = aVar;
                                                sessionManager$init$1.J$0 = j12;
                                                sessionManager$init$1.J$1 = j11;
                                                sessionManager$init$1.J$2 = j10;
                                                sessionManager$init$1.I$0 = i13;
                                                sessionManager$init$1.label = 5;
                                                obj = null;
                                                break;
                                            } finally {
                                            }
                                            a aVar3 = aVar2;
                                        }
                                    }
                                }
                                return Unit.INSTANCE;
                            }
                            return coroutine_suspended;
                        case 1:
                            VerisoulEnvironment verisoulEnvironment10 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            String str8 = (String) sessionManager$init$1.L$1;
                            sessionManager4 = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            verisoulEnvironment5 = verisoulEnvironment10;
                            str5 = str8;
                            VerisoulEnvironment verisoulEnvironment72 = verisoulEnvironment5;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                            j12 = System.currentTimeMillis();
                            j15 = 18000;
                            sessionManager2 = sessionManager4;
                            j10 = 1000;
                            str3 = str5;
                            i15 = 0;
                            verisoulEnvironment3 = verisoulEnvironment72;
                            if (F0.q(sessionManager$init$1.get$context())) {
                            }
                            return Unit.INSTANCE;
                        case 2:
                            verisoulEnvironment6 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            str4 = (String) sessionManager$init$1.L$1;
                            sessionManager4 = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            if (((Boolean) obj3).booleanValue()) {
                            }
                            return Unit.INSTANCE;
                        case 3:
                            int i18 = sessionManager$init$1.I$0;
                            j10 = sessionManager$init$1.J$2;
                            j11 = sessionManager$init$1.J$1;
                            j12 = sessionManager$init$1.J$0;
                            aVar2 = (a) sessionManager$init$1.L$3;
                            verisoulEnvironment2 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            str2 = (String) sessionManager$init$1.L$1;
                            SessionManager sessionManager7 = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            sessionManager3 = sessionManager7;
                            obj2 = null;
                            i14 = i18;
                            a aVar32 = aVar2;
                            if (currentSessionGeneration == null) {
                            }
                            aVar32.g(obj2);
                            if (z10) {
                            }
                            aVar = generationLock;
                            sessionManager$init$1.L$0 = sessionManager;
                            sessionManager$init$1.L$1 = str2;
                            sessionManager$init$1.L$2 = verisoulEnvironment2;
                            sessionManager$init$1.L$3 = aVar;
                            sessionManager$init$1.J$0 = j12;
                            sessionManager$init$1.J$1 = j11;
                            sessionManager$init$1.J$2 = j10;
                            sessionManager$init$1.I$0 = i13;
                            sessionManager$init$1.label = 5;
                            obj = null;
                            break;
                        case 4:
                            i13 = sessionManager$init$1.I$0;
                            j10 = sessionManager$init$1.J$2;
                            j11 = sessionManager$init$1.J$1;
                            j12 = sessionManager$init$1.J$0;
                            verisoulEnvironment2 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            str2 = (String) sessionManager$init$1.L$1;
                            sessionManager = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            aVar = generationLock;
                            sessionManager$init$1.L$0 = sessionManager;
                            sessionManager$init$1.L$1 = str2;
                            sessionManager$init$1.L$2 = verisoulEnvironment2;
                            sessionManager$init$1.L$3 = aVar;
                            sessionManager$init$1.J$0 = j12;
                            sessionManager$init$1.J$1 = j11;
                            sessionManager$init$1.J$2 = j10;
                            sessionManager$init$1.I$0 = i13;
                            sessionManager$init$1.label = 5;
                            obj = null;
                            break;
                        case 5:
                            i13 = sessionManager$init$1.I$0;
                            j10 = sessionManager$init$1.J$2;
                            j11 = sessionManager$init$1.J$1;
                            j12 = sessionManager$init$1.J$0;
                            aVar = (a) sessionManager$init$1.L$3;
                            verisoulEnvironment2 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            str2 = (String) sessionManager$init$1.L$1;
                            sessionManager = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            obj = null;
                            int i19 = i13;
                            a aVar4 = aVar;
                            try {
                                X x10 = currentSessionGeneration;
                                aVar4.g(obj);
                                if (x10 != null) {
                                    sessionManager$init$1.L$0 = sessionManager;
                                    sessionManager$init$1.L$1 = str2;
                                    sessionManager$init$1.L$2 = verisoulEnvironment2;
                                    sessionManager$init$1.L$3 = obj;
                                    sessionManager$init$1.J$0 = j12;
                                    sessionManager$init$1.J$1 = j11;
                                    sessionManager$init$1.J$2 = j10;
                                    sessionManager$init$1.I$0 = i19;
                                    sessionManager$init$1.label = 6;
                                    Object await = x10.await(sessionManager$init$1);
                                    if (await != coroutine_suspended) {
                                        i12 = i19;
                                        obj3 = await;
                                        i11 = i12;
                                        SessionHelper sessionHelper4 = sessionManager.getSessionHelper();
                                        sessionManager$init$1.L$0 = sessionManager;
                                        sessionManager$init$1.L$1 = str2;
                                        sessionManager$init$1.L$2 = verisoulEnvironment2;
                                        sessionManager$init$1.L$3 = null;
                                        sessionManager$init$1.J$0 = j12;
                                        sessionManager$init$1.J$1 = j11;
                                        sessionManager$init$1.J$2 = j10;
                                        sessionManager$init$1.I$0 = i11;
                                        sessionManager$init$1.label = 7;
                                        obj3 = sessionHelper4.isNeedToSubmitDeviceData(sessionManager$init$1);
                                        i16 = i11;
                                        if (obj3 == coroutine_suspended) {
                                        }
                                        int i20 = i16;
                                        if (!((Boolean) obj3).booleanValue()) {
                                            Logger.INSTANCE.info(TAG, "Init completed - native data collection done (attempt " + ((int) i16) + ")");
                                            return Unit.INSTANCE;
                                        }
                                        int i21 = i20;
                                        VerisoulEnvironment verisoulEnvironment11 = verisoulEnvironment2;
                                        long j17 = j10;
                                        String str9 = str2;
                                        long j18 = j11;
                                        sessionManager2 = sessionManager;
                                        long j19 = j12;
                                        currentTimeMillis = j18 - (System.currentTimeMillis() - j19);
                                        if (currentTimeMillis > 0) {
                                            Logger.INSTANCE.error(TAG, "Init timeout - no time remaining for retry");
                                            return Unit.INSTANCE;
                                        }
                                        long min = Math.min(RangesKt.random(new IntRange(0, 250), Random.INSTANCE) + j17, Math.min(currentTimeMillis, 5000L));
                                        sessionManager$init$1 = sessionManager$init$1;
                                        sessionManager$init$1.L$0 = sessionManager2;
                                        sessionManager$init$1.L$1 = str9;
                                        sessionManager$init$1.L$2 = verisoulEnvironment11;
                                        sessionManager$init$1.L$3 = null;
                                        sessionManager$init$1.J$0 = j19;
                                        sessionManager$init$1.J$1 = j18;
                                        sessionManager$init$1.J$2 = j17;
                                        sessionManager$init$1.I$0 = i21;
                                        sessionManager$init$1.label = 8;
                                        if (AbstractC1440a0.a(min, sessionManager$init$1) != coroutine_suspended) {
                                            i10 = i21;
                                            str3 = str9;
                                            j13 = j17;
                                            j14 = j19;
                                            j15 = j18;
                                            verisoulEnvironment4 = verisoulEnvironment11;
                                            j10 = RangesKt.coerceAtMost(j13 * 2, 5000L);
                                            j12 = j14;
                                            i15 = i10;
                                            verisoulEnvironment3 = verisoulEnvironment4;
                                            if (F0.q(sessionManager$init$1.get$context())) {
                                            }
                                            return Unit.INSTANCE;
                                        }
                                    }
                                    return coroutine_suspended;
                                }
                                i11 = i19;
                                SessionHelper sessionHelper42 = sessionManager.getSessionHelper();
                                sessionManager$init$1.L$0 = sessionManager;
                                sessionManager$init$1.L$1 = str2;
                                sessionManager$init$1.L$2 = verisoulEnvironment2;
                                sessionManager$init$1.L$3 = null;
                                sessionManager$init$1.J$0 = j12;
                                sessionManager$init$1.J$1 = j11;
                                sessionManager$init$1.J$2 = j10;
                                sessionManager$init$1.I$0 = i11;
                                sessionManager$init$1.label = 7;
                                obj3 = sessionHelper42.isNeedToSubmitDeviceData(sessionManager$init$1);
                                i16 = i11;
                                if (obj3 == coroutine_suspended) {
                                }
                                int i202 = i16;
                                if (!((Boolean) obj3).booleanValue()) {
                                }
                                int i212 = i202;
                                VerisoulEnvironment verisoulEnvironment112 = verisoulEnvironment2;
                                long j172 = j10;
                                String str92 = str2;
                                long j182 = j11;
                                sessionManager2 = sessionManager;
                                long j192 = j12;
                                currentTimeMillis = j182 - (System.currentTimeMillis() - j192);
                                if (currentTimeMillis > 0) {
                                }
                            } catch (Throwable th3) {
                                aVar4.g(null);
                                throw th3;
                            }
                            break;
                        case 6:
                            int i22 = sessionManager$init$1.I$0;
                            j10 = sessionManager$init$1.J$2;
                            j11 = sessionManager$init$1.J$1;
                            j12 = sessionManager$init$1.J$0;
                            VerisoulEnvironment verisoulEnvironment12 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            String str10 = (String) sessionManager$init$1.L$1;
                            SessionManager sessionManager8 = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            verisoulEnvironment2 = verisoulEnvironment12;
                            str2 = str10;
                            sessionManager = sessionManager8;
                            i12 = i22;
                            i11 = i12;
                            SessionHelper sessionHelper422 = sessionManager.getSessionHelper();
                            sessionManager$init$1.L$0 = sessionManager;
                            sessionManager$init$1.L$1 = str2;
                            sessionManager$init$1.L$2 = verisoulEnvironment2;
                            sessionManager$init$1.L$3 = null;
                            sessionManager$init$1.J$0 = j12;
                            sessionManager$init$1.J$1 = j11;
                            sessionManager$init$1.J$2 = j10;
                            sessionManager$init$1.I$0 = i11;
                            sessionManager$init$1.label = 7;
                            obj3 = sessionHelper422.isNeedToSubmitDeviceData(sessionManager$init$1);
                            i16 = i11;
                            if (obj3 == coroutine_suspended) {
                            }
                            int i2022 = i16;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                            int i2122 = i2022;
                            VerisoulEnvironment verisoulEnvironment1122 = verisoulEnvironment2;
                            long j1722 = j10;
                            String str922 = str2;
                            long j1822 = j11;
                            sessionManager2 = sessionManager;
                            long j1922 = j12;
                            currentTimeMillis = j1822 - (System.currentTimeMillis() - j1922);
                            if (currentTimeMillis > 0) {
                            }
                            break;
                        case 7:
                            int i23 = sessionManager$init$1.I$0;
                            j10 = sessionManager$init$1.J$2;
                            j11 = sessionManager$init$1.J$1;
                            j12 = sessionManager$init$1.J$0;
                            VerisoulEnvironment verisoulEnvironment13 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            String str11 = (String) sessionManager$init$1.L$1;
                            SessionManager sessionManager9 = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            verisoulEnvironment2 = verisoulEnvironment13;
                            str2 = str11;
                            sessionManager = sessionManager9;
                            i16 = i23;
                            int i20222 = i16;
                            if (!((Boolean) obj3).booleanValue()) {
                            }
                            int i21222 = i20222;
                            VerisoulEnvironment verisoulEnvironment11222 = verisoulEnvironment2;
                            long j17222 = j10;
                            String str9222 = str2;
                            long j18222 = j11;
                            sessionManager2 = sessionManager;
                            long j19222 = j12;
                            currentTimeMillis = j18222 - (System.currentTimeMillis() - j19222);
                            if (currentTimeMillis > 0) {
                            }
                            break;
                        case 8:
                            int i24 = sessionManager$init$1.I$0;
                            long j20 = sessionManager$init$1.J$2;
                            long j21 = sessionManager$init$1.J$1;
                            long j22 = sessionManager$init$1.J$0;
                            VerisoulEnvironment verisoulEnvironment14 = (VerisoulEnvironment) sessionManager$init$1.L$2;
                            String str12 = (String) sessionManager$init$1.L$1;
                            sessionManager2 = (SessionManager) sessionManager$init$1.L$0;
                            ResultKt.throwOnFailure(obj3);
                            str3 = str12;
                            j14 = j22;
                            j15 = j21;
                            j13 = j20;
                            i10 = i24;
                            verisoulEnvironment4 = verisoulEnvironment14;
                            j10 = RangesKt.coerceAtMost(j13 * 2, 5000L);
                            j12 = j14;
                            i15 = i10;
                            verisoulEnvironment3 = verisoulEnvironment4;
                            if (F0.q(sessionManager$init$1.get$context())) {
                            }
                            return Unit.INSTANCE;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            switch (j10) {
            }
        } catch (CancellationException e10) {
            throw e10;
        }
        sessionManager$init$1 = new SessionManager$init$1(this, continuation);
        Object obj32 = sessionManager$init$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        j10 = sessionManager$init$1.label;
    }

    @Nullable
    public final Object reinitialize(@NotNull String str, @NotNull VerisoulEnvironment verisoulEnvironment, @NotNull Continuation<? super Unit> continuation) {
        projectid = str;
        env = verisoulEnvironment;
        Logger.INSTANCE.info(TAG, "Reinitializing session token generation...");
        Object generateTokenInternal = generateTokenInternal(str, verisoulEnvironment, true, continuation);
        return generateTokenInternal == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? generateTokenInternal : Unit.INSTANCE;
    }

    public final void shutdown() {
        AbstractC1457j.b(null, new SessionManager$shutdown$1(null), 1, null);
        Q.f(scope, null, 1, null);
        scope = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(exceptionHandler));
        projectid = null;
        env = null;
        Logger.INSTANCE.info(TAG, "SessionManager shutdown completed");
    }
}
