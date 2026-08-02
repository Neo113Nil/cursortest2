package com.unity3d.services.core.domain.task;

import com.safedk.android.utils.j;
import com.unity3d.services.core.configuration.Configuration;
import com.unity3d.services.core.configuration.ErrorState;
import com.unity3d.services.core.configuration.InitializeEventsMetricSender;
import com.unity3d.services.core.device.Device;
import com.unity3d.services.core.domain.ResultExtensionsKt;
import com.unity3d.services.core.domain.task.ConfigFileFromLocalStorage;
import com.unity3d.services.core.domain.task.InitializeStateComplete;
import com.unity3d.services.core.domain.task.InitializeStateConfig;
import com.unity3d.services.core.domain.task.InitializeStateCreate;
import com.unity3d.services.core.domain.task.InitializeStateLoadCache;
import com.unity3d.services.core.domain.task.InitializeStateLoadWeb;
import com.unity3d.services.core.domain.task.InitializeStateReset;
import com.unity3d.services.core.log.DeviceLog;
import com.unity3d.services.core.properties.ClientProperties;
import com.unity3d.services.core.properties.SdkProperties;
import com.vungle.ads.internal.protos.Sdk;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlinx.coroutines.BuildersKt__Builders_commonKt;
import kotlinx.coroutines.CoroutineName;
import kotlinx.coroutines.CoroutineScope;

/* compiled from: InitializeSDK.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "Lkotlin/Result;", "", "Lkotlinx/coroutines/CoroutineScope;"}, k = 3, mv = {1, 8, 0}, xi = 48)
@DebugMetadata(c = "com.unity3d.services.core.domain.task.InitializeSDK$doWork$2", f = "InitializeSDK.kt", i = {0, 1, 2, 2, 3, 4, 4, 5, 5, 5, 6, 6, 6, 7, 8, 9, 9, 10, 11}, l = {48, 53, Sdk.SDKMetric.SDKMetricType.INIT_TO_FAIL_CALLBACK_DURATION_MS_VALUE, 60, 65, 67, 71, 74, 89, 92, 100, 103, 106}, m = "invokeSuspend", n = {"$this$withContext", "$this$withContext", "$this$withContext", j.c, "resetResult", "$this$withContext", j.c, "$this$withContext", "configResult", j.c, "$this$withContext", "configResult", j.c, "loadCacheResult", "configResult", "configResult", "loadWebResult", "configResult", "configResult"}, s = {"L$0", "L$0", "L$0", "L$2", "L$0", "L$0", "L$2", "L$0", "L$2", "L$3", "L$0", "L$2", "L$3", "L$0", "L$1", "L$1", "L$2", "L$1", "L$1"})
/* loaded from: classes4.dex */
final class InitializeSDK$doWork$2 extends SuspendLambda implements Function2<CoroutineScope, Continuation<? super Result<? extends Unit>>, Object> {
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    int label;
    final /* synthetic */ InitializeSDK this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InitializeSDK$doWork$2(InitializeSDK initializeSDK, Continuation<? super InitializeSDK$doWork$2> continuation) {
        super(2, continuation);
        this.this$0 = initializeSDK;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<Unit> create(Object obj, Continuation<?> continuation) {
        InitializeSDK$doWork$2 initializeSDK$doWork$2 = new InitializeSDK$doWork$2(this.this$0, continuation);
        initializeSDK$doWork$2.L$0 = obj;
        return initializeSDK$doWork$2;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Object invoke(CoroutineScope coroutineScope, Continuation<? super Result<? extends Unit>> continuation) {
        return invoke2(coroutineScope, (Continuation<? super Result<Unit>>) continuation);
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final Object invoke2(CoroutineScope coroutineScope, Continuation<? super Result<Unit>> continuation) {
        return ((InitializeSDK$doWork$2) create(coroutineScope, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:20:0x0350, code lost:
    
        if (r13 == r1) goto L123;
     */
    /* JADX WARN: Removed duplicated region for block: B:102:0x01d8 A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0168 A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:116:0x01a5  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0161  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0321 A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0318  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0319  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x02d0 A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x025f A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:51:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x023f A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:60:0x026d A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fe A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01ca A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    /* JADX WARN: Removed duplicated region for block: B:93:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x01ad A[Catch: all -> 0x0369, CancellationException -> 0x0397, TryCatch #2 {CancellationException -> 0x0397, all -> 0x0369, blocks: (B:7:0x0015, B:8:0x0353, B:18:0x0026, B:19:0x0334, B:23:0x0031, B:24:0x031b, B:26:0x0321, B:30:0x0044, B:31:0x02e5, B:32:0x02f5, B:37:0x004f, B:40:0x02ca, B:42:0x02d0, B:46:0x005f, B:47:0x0259, B:49:0x025f, B:50:0x026c, B:53:0x0077, B:55:0x0239, B:57:0x023f, B:60:0x026d, B:62:0x0278, B:64:0x0282, B:66:0x0288, B:67:0x02a5, B:70:0x02ef, B:72:0x035d, B:73:0x0368, B:75:0x0093, B:76:0x0215, B:80:0x00a4, B:82:0x01f8, B:84:0x01fe, B:88:0x00b4, B:89:0x01c4, B:91:0x01ca, B:92:0x01d7, B:95:0x00ca, B:97:0x01a7, B:99:0x01ad, B:102:0x01d8, B:107:0x00e0, B:108:0x0162, B:110:0x0168, B:111:0x017c, B:114:0x0188, B:118:0x00f3, B:119:0x0142, B:124:0x0101, B:126:0x0121), top: B:2:0x000a }] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        Object m11180constructorimpl;
        CoroutineScope coroutineScope;
        InitializeSDK initializeSDK;
        Object handleInitializationException;
        ConfigFileFromLocalStorage configFileFromLocalStorage;
        Object obj2;
        CoroutineScope coroutineScope2;
        Throwable m11183exceptionOrNullimpl;
        Configuration configuration;
        InitializeStateReset initializeStateReset;
        Object obj3;
        Object obj4;
        InitializeStateConfig initializeStateConfig;
        CoroutineScope coroutineScope3;
        InitializeSDK initializeSDK2;
        Object obj5;
        Configuration configuration2;
        Object m10563executeErrorStateBWLJW6A;
        Throwable m11183exceptionOrNullimpl2;
        Object handleInitializationException2;
        InitializeStateLoadCache initializeStateLoadCache;
        Object obj6;
        Object obj7;
        String webViewData;
        InitializeStateLoadWeb initializeStateLoadWeb;
        Object obj8;
        Object m10563executeErrorStateBWLJW6A2;
        Throwable m11183exceptionOrNullimpl3;
        Object obj9;
        Object handleInitializationException3;
        InitializeStateCreate initializeStateCreate;
        Object obj10;
        Object obj11;
        InitializeSDK initializeSDK3;
        Object handleInitializationException4;
        InitializeStateComplete initializeStateComplete;
        Object obj12;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Result.Companion companion = Result.INSTANCE;
            m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(th));
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                coroutineScope = (CoroutineScope) this.L$0;
                initializeSDK = this.this$0;
                Result.Companion companion2 = Result.INSTANCE;
                InitializeSDK$doWork$2 initializeSDK$doWork$2 = this;
                SdkProperties.setInitializationTime(Device.getElapsedRealtime());
                SdkProperties.setInitializationTimeSinceEpoch(System.currentTimeMillis());
                InitializeEventsMetricSender.getInstance().didInitStart();
                if (ClientProperties.getGameId() == null) {
                    InitializationException initializationException = new InitializationException(ErrorState.InvalidGameId, new Exception("gameId is null."), new Configuration());
                    this.L$0 = coroutineScope;
                    this.L$1 = initializeSDK;
                    this.label = 1;
                    handleInitializationException = initializeSDK.handleInitializationException(initializationException, this);
                    if (handleInitializationException == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                ConfigFileFromLocalStorage.Params params = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.L$0 = coroutineScope;
                this.L$1 = initializeSDK;
                this.label = 2;
                obj2 = configFileFromLocalStorage.mo10559invokegIAlus(params, this);
                if (obj2 != coroutine_suspended) {
                    return coroutine_suspended;
                }
                coroutineScope2 = coroutineScope;
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj2);
                if (m11183exceptionOrNullimpl != null) {
                    DeviceLog.debug("Unity Ads Init: Could not load config file from local storage: " + m11183exceptionOrNullimpl.getMessage());
                }
                Configuration configuration3 = new Configuration();
                if (Result.m11186isFailureimpl(obj2)) {
                    obj2 = configuration3;
                }
                configuration = (Configuration) obj2;
                initializeStateReset = initializeSDK.initializeStateReset;
                InitializeStateReset.Params params2 = new InitializeStateReset.Params(configuration);
                this.L$0 = coroutineScope2;
                this.L$1 = initializeSDK;
                this.L$2 = configuration;
                this.label = 3;
                obj3 = initializeStateReset.mo10559invokegIAlus(params2, this);
                if (obj3 == coroutine_suspended) {
                    return coroutine_suspended;
                }
                Configuration configuration4 = configuration;
                obj4 = obj3;
                if (!Result.m11186isFailureimpl(obj4)) {
                    initializeStateConfig = initializeSDK.initializeStateConfig;
                    InitializeStateConfig.Params params3 = new InitializeStateConfig.Params(configuration4);
                    this.L$0 = coroutineScope2;
                    this.L$1 = initializeSDK;
                    this.L$2 = configuration4;
                    this.label = 5;
                    Object obj13 = initializeStateConfig.mo10559invokegIAlus(params3, this);
                    if (obj13 != coroutine_suspended) {
                        coroutineScope3 = coroutineScope2;
                        initializeSDK2 = initializeSDK;
                        obj5 = obj13;
                        configuration2 = configuration4;
                        if (Result.m11186isFailureimpl(obj5)) {
                            InitializationException initializationExceptionOrThrow = ResultExtensionsKt.getInitializationExceptionOrThrow(obj5);
                            this.L$0 = coroutineScope3;
                            this.L$1 = initializeSDK2;
                            this.L$2 = obj5;
                            this.L$3 = configuration2;
                            this.label = 6;
                            handleInitializationException2 = initializeSDK2.handleInitializationException(initializationExceptionOrThrow, this);
                            if (handleInitializationException2 == coroutine_suspended) {
                            }
                        }
                        initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                        ResultKt.throwOnFailure(obj5);
                        InitializeStateLoadCache.Params params4 = new InitializeStateLoadCache.Params((Configuration) obj5);
                        this.L$0 = coroutineScope3;
                        this.L$1 = initializeSDK2;
                        this.L$2 = obj5;
                        this.L$3 = configuration2;
                        this.label = 7;
                        obj6 = initializeStateLoadCache.mo10559invokegIAlus(params4, this);
                        if (obj6 == coroutine_suspended) {
                        }
                        Configuration configuration5 = configuration2;
                        obj7 = obj6;
                        if (!Result.m11186isFailureimpl(obj7)) {
                            ErrorState errorState = ErrorState.LoadCache;
                            Throwable m11183exceptionOrNullimpl4 = Result.m11183exceptionOrNullimpl(obj7);
                            this.L$0 = obj7;
                            this.L$1 = null;
                            this.L$2 = null;
                            this.L$3 = null;
                            this.label = 8;
                            m10563executeErrorStateBWLJW6A2 = initializeSDK2.m10563executeErrorStateBWLJW6A(errorState, m11183exceptionOrNullimpl4, configuration5, this);
                            if (m10563executeErrorStateBWLJW6A2 == coroutine_suspended) {
                            }
                            m11183exceptionOrNullimpl3 = Result.m11183exceptionOrNullimpl(obj7);
                            if (m11183exceptionOrNullimpl3 != null) {
                                throw new Exception(ErrorState.LoadCache.toString());
                            }
                            throw m11183exceptionOrNullimpl3;
                        }
                        ResultKt.throwOnFailure(obj7);
                        InitializeStateLoadCache.LoadCacheResult loadCacheResult = (InitializeStateLoadCache.LoadCacheResult) obj7;
                        if (loadCacheResult.getHasHashMismatch()) {
                            if (configuration5.getExperiments().isWebViewAsyncDownloadEnabled() && loadCacheResult.getWebViewData() != null) {
                                BuildersKt__Builders_commonKt.launch$default(coroutineScope3, new CoroutineName("LaunchLoadWeb"), null, new InitializeSDK$doWork$2$1$webViewData$1(initializeSDK2, obj5, null), 2, null);
                                webViewData = loadCacheResult.getWebViewData();
                            } else {
                                initializeStateLoadWeb = initializeSDK2.initializeStateLoadWeb;
                                ResultKt.throwOnFailure(obj5);
                                InitializeStateLoadWeb.Params params5 = new InitializeStateLoadWeb.Params((Configuration) obj5);
                                this.L$0 = initializeSDK2;
                                this.L$1 = obj5;
                                this.L$2 = null;
                                this.L$3 = null;
                                this.label = 9;
                                obj8 = initializeStateLoadWeb.mo10559invokegIAlus(params5, this);
                                if (obj8 == coroutine_suspended) {
                                }
                                obj9 = obj8;
                                if (Result.m11186isFailureimpl(obj9)) {
                                    InitializationException initializationExceptionOrThrow2 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj9);
                                    this.L$0 = initializeSDK2;
                                    this.L$1 = obj5;
                                    this.L$2 = obj9;
                                    this.label = 10;
                                    handleInitializationException3 = initializeSDK2.handleInitializationException(initializationExceptionOrThrow2, this);
                                    if (handleInitializationException3 == coroutine_suspended) {
                                    }
                                }
                                ResultKt.throwOnFailure(obj9);
                                webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj9).getWebViewDataString();
                            }
                        } else {
                            webViewData = loadCacheResult.getWebViewData();
                            if (webViewData == null) {
                                throw new IllegalStateException("WebView is missing.".toString());
                            }
                        }
                        initializeStateCreate = initializeSDK2.initializeStateCreate;
                        ResultKt.throwOnFailure(obj5);
                        InitializeStateCreate.Params params6 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                        this.L$0 = initializeSDK2;
                        this.L$1 = obj5;
                        this.L$2 = null;
                        this.L$3 = null;
                        this.label = 11;
                        obj10 = initializeStateCreate.mo10559invokegIAlus(params6, this);
                        if (obj10 != coroutine_suspended) {
                            obj11 = obj5;
                            initializeSDK3 = initializeSDK2;
                            if (Result.m11186isFailureimpl(obj10)) {
                                InitializationException initializationExceptionOrThrow3 = ResultExtensionsKt.getInitializationExceptionOrThrow(obj10);
                                this.L$0 = initializeSDK3;
                                this.L$1 = obj11;
                                this.label = 12;
                                handleInitializationException4 = initializeSDK3.handleInitializationException(initializationExceptionOrThrow3, this);
                                if (handleInitializationException4 == coroutine_suspended) {
                                }
                            }
                            initializeStateComplete = initializeSDK3.initializeStateComplete;
                            ResultKt.throwOnFailure(obj11);
                            InitializeStateComplete.Params params7 = new InitializeStateComplete.Params((Configuration) obj11);
                            this.L$0 = null;
                            this.L$1 = null;
                            this.label = 13;
                            obj12 = initializeStateComplete.mo10559invokegIAlus(params7, this);
                            break;
                        }
                    }
                } else {
                    ErrorState errorState2 = ErrorState.ResetWebApp;
                    Throwable m11183exceptionOrNullimpl5 = Result.m11183exceptionOrNullimpl(obj4);
                    this.L$0 = obj4;
                    this.L$1 = null;
                    this.L$2 = null;
                    this.label = 4;
                    m10563executeErrorStateBWLJW6A = initializeSDK.m10563executeErrorStateBWLJW6A(errorState2, m11183exceptionOrNullimpl5, configuration4, this);
                    if (m10563executeErrorStateBWLJW6A == coroutine_suspended) {
                    }
                    m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj4);
                    if (m11183exceptionOrNullimpl2 != null) {
                        throw new Exception(ErrorState.ResetWebApp.toString());
                    }
                    throw m11183exceptionOrNullimpl2;
                }
                return coroutine_suspended;
            case 1:
                initializeSDK = (InitializeSDK) this.L$1;
                coroutineScope = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                DeviceLog.debug("Unity Ads Init: Loading Config File From Local Storage");
                configFileFromLocalStorage = initializeSDK.configFileFromLocalStorage;
                ConfigFileFromLocalStorage.Params params8 = new ConfigFileFromLocalStorage.Params(null, 1, null);
                this.L$0 = coroutineScope;
                this.L$1 = initializeSDK;
                this.label = 2;
                obj2 = configFileFromLocalStorage.mo10559invokegIAlus(params8, this);
                if (obj2 != coroutine_suspended) {
                }
                break;
            case 2:
                initializeSDK = (InitializeSDK) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj2 = ((Result) obj).getValue();
                m11183exceptionOrNullimpl = Result.m11183exceptionOrNullimpl(obj2);
                if (m11183exceptionOrNullimpl != null) {
                }
                Configuration configuration32 = new Configuration();
                if (Result.m11186isFailureimpl(obj2)) {
                }
                configuration = (Configuration) obj2;
                initializeStateReset = initializeSDK.initializeStateReset;
                InitializeStateReset.Params params22 = new InitializeStateReset.Params(configuration);
                this.L$0 = coroutineScope2;
                this.L$1 = initializeSDK;
                this.L$2 = configuration;
                this.label = 3;
                obj3 = initializeStateReset.mo10559invokegIAlus(params22, this);
                if (obj3 == coroutine_suspended) {
                }
                Configuration configuration42 = configuration;
                obj4 = obj3;
                if (!Result.m11186isFailureimpl(obj4)) {
                }
                return coroutine_suspended;
            case 3:
                configuration = (Configuration) this.L$2;
                initializeSDK = (InitializeSDK) this.L$1;
                coroutineScope2 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj3 = ((Result) obj).getValue();
                Configuration configuration422 = configuration;
                obj4 = obj3;
                if (!Result.m11186isFailureimpl(obj4)) {
                }
                return coroutine_suspended;
            case 4:
                obj4 = this.L$0;
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
                m11183exceptionOrNullimpl2 = Result.m11183exceptionOrNullimpl(obj4);
                if (m11183exceptionOrNullimpl2 != null) {
                }
                break;
            case 5:
                configuration2 = (Configuration) this.L$2;
                InitializeSDK initializeSDK4 = (InitializeSDK) this.L$1;
                CoroutineScope coroutineScope4 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                coroutineScope3 = coroutineScope4;
                initializeSDK2 = initializeSDK4;
                obj5 = ((Result) obj).getValue();
                if (Result.m11186isFailureimpl(obj5)) {
                }
                initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                ResultKt.throwOnFailure(obj5);
                InitializeStateLoadCache.Params params42 = new InitializeStateLoadCache.Params((Configuration) obj5);
                this.L$0 = coroutineScope3;
                this.L$1 = initializeSDK2;
                this.L$2 = obj5;
                this.L$3 = configuration2;
                this.label = 7;
                obj6 = initializeStateLoadCache.mo10559invokegIAlus(params42, this);
                if (obj6 == coroutine_suspended) {
                }
                Configuration configuration52 = configuration2;
                obj7 = obj6;
                if (!Result.m11186isFailureimpl(obj7)) {
                }
                return coroutine_suspended;
            case 6:
                configuration2 = (Configuration) this.L$3;
                obj5 = this.L$2;
                initializeSDK2 = (InitializeSDK) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                initializeStateLoadCache = initializeSDK2.initializeStateLoadCache;
                ResultKt.throwOnFailure(obj5);
                InitializeStateLoadCache.Params params422 = new InitializeStateLoadCache.Params((Configuration) obj5);
                this.L$0 = coroutineScope3;
                this.L$1 = initializeSDK2;
                this.L$2 = obj5;
                this.L$3 = configuration2;
                this.label = 7;
                obj6 = initializeStateLoadCache.mo10559invokegIAlus(params422, this);
                if (obj6 == coroutine_suspended) {
                }
                Configuration configuration522 = configuration2;
                obj7 = obj6;
                if (!Result.m11186isFailureimpl(obj7)) {
                }
                return coroutine_suspended;
            case 7:
                configuration2 = (Configuration) this.L$3;
                obj5 = this.L$2;
                initializeSDK2 = (InitializeSDK) this.L$1;
                coroutineScope3 = (CoroutineScope) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj6 = ((Result) obj).getValue();
                Configuration configuration5222 = configuration2;
                obj7 = obj6;
                if (!Result.m11186isFailureimpl(obj7)) {
                }
                return coroutine_suspended;
            case 8:
                obj7 = this.L$0;
                ResultKt.throwOnFailure(obj);
                ((Result) obj).getValue();
                m11183exceptionOrNullimpl3 = Result.m11183exceptionOrNullimpl(obj7);
                if (m11183exceptionOrNullimpl3 != null) {
                }
                break;
            case 9:
                Object obj14 = this.L$1;
                InitializeSDK initializeSDK5 = (InitializeSDK) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj8 = ((Result) obj).getValue();
                initializeSDK2 = initializeSDK5;
                obj5 = obj14;
                obj9 = obj8;
                if (Result.m11186isFailureimpl(obj9)) {
                }
                ResultKt.throwOnFailure(obj9);
                webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj9).getWebViewDataString();
                initializeStateCreate = initializeSDK2.initializeStateCreate;
                ResultKt.throwOnFailure(obj5);
                InitializeStateCreate.Params params62 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                this.L$0 = initializeSDK2;
                this.L$1 = obj5;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 11;
                obj10 = initializeStateCreate.mo10559invokegIAlus(params62, this);
                if (obj10 != coroutine_suspended) {
                }
                break;
            case 10:
                obj9 = this.L$2;
                obj5 = this.L$1;
                initializeSDK2 = (InitializeSDK) this.L$0;
                ResultKt.throwOnFailure(obj);
                ResultKt.throwOnFailure(obj9);
                webViewData = ((InitializeStateLoadWeb.LoadWebResult) obj9).getWebViewDataString();
                initializeStateCreate = initializeSDK2.initializeStateCreate;
                ResultKt.throwOnFailure(obj5);
                InitializeStateCreate.Params params622 = new InitializeStateCreate.Params((Configuration) obj5, webViewData);
                this.L$0 = initializeSDK2;
                this.L$1 = obj5;
                this.L$2 = null;
                this.L$3 = null;
                this.label = 11;
                obj10 = initializeStateCreate.mo10559invokegIAlus(params622, this);
                if (obj10 != coroutine_suspended) {
                }
                break;
            case 11:
                obj11 = this.L$1;
                initializeSDK3 = (InitializeSDK) this.L$0;
                ResultKt.throwOnFailure(obj);
                obj10 = ((Result) obj).getValue();
                if (Result.m11186isFailureimpl(obj10)) {
                }
                initializeStateComplete = initializeSDK3.initializeStateComplete;
                ResultKt.throwOnFailure(obj11);
                InitializeStateComplete.Params params72 = new InitializeStateComplete.Params((Configuration) obj11);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 13;
                obj12 = initializeStateComplete.mo10559invokegIAlus(params72, this);
                break;
            case 12:
                obj11 = this.L$1;
                initializeSDK3 = (InitializeSDK) this.L$0;
                ResultKt.throwOnFailure(obj);
                initializeStateComplete = initializeSDK3.initializeStateComplete;
                ResultKt.throwOnFailure(obj11);
                InitializeStateComplete.Params params722 = new InitializeStateComplete.Params((Configuration) obj11);
                this.L$0 = null;
                this.L$1 = null;
                this.label = 13;
                obj12 = initializeStateComplete.mo10559invokegIAlus(params722, this);
                break;
            case 13:
                ResultKt.throwOnFailure(obj);
                obj12 = ((Result) obj).getValue();
                ResultKt.throwOnFailure(obj12);
                m11180constructorimpl = Result.m11180constructorimpl(Unit.INSTANCE);
                if (Result.m11187isSuccessimpl(m11180constructorimpl)) {
                    Result.Companion companion3 = Result.INSTANCE;
                    m11180constructorimpl = Result.m11180constructorimpl(m11180constructorimpl);
                } else {
                    Throwable m11183exceptionOrNullimpl6 = Result.m11183exceptionOrNullimpl(m11180constructorimpl);
                    if (m11183exceptionOrNullimpl6 != null) {
                        Result.Companion companion4 = Result.INSTANCE;
                        m11180constructorimpl = Result.m11180constructorimpl(ResultKt.createFailure(m11183exceptionOrNullimpl6));
                    }
                }
                return Result.m11179boximpl(m11180constructorimpl);
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
