package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.AbstractC1457j;
import Ph.AbstractC1459k;
import Ph.C0;
import Ph.C1452g0;
import Ph.M;
import Ph.P;
import Ph.Q;
import Ph.X0;
import Wh.a;
import Wh.g;
import ai.verisoul.sdk.data.remote.AllData;
import ai.verisoul.sdk.data.remote.DeviceNativeSubmitRequest;
import ai.verisoul.sdk.data.remote.VerisoulHttpService;
import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityHelper;
import ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper;
import ai.verisoul.sdk.logger.Logger;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000®\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003JF\u0010\u000e\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\nH\u0002¢\u0006\u0004\b\u0010\u0010\u0003JE\u0010\u0011\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0016\u0010\u000b\u001a\u0012\u0012\b\u0012\u00060\bj\u0002`\t\u0012\u0004\u0012\u00020\n0\u00072\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\n0\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u001b\u0010\u0018\u001a\u00020\u00138BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0014\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001b\u0010\u001d\u001a\u00020\u00198BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001a\u0010\u0015\u001a\u0004\b\u001b\u0010\u001cR\u001b\u0010\"\u001a\u00020\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010\u0015\u001a\u0004\b \u0010!R\u001b\u0010'\u001a\u00020#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010\u0015\u001a\u0004\b%\u0010&R\u001b\u0010,\u001a\u00020(8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b)\u0010\u0015\u001a\u0004\b*\u0010+R\u001b\u00101\u001a\u00020-8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010\u0015\u001a\u0004\b/\u00100R\u001b\u00106\u001a\u0002028BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b3\u0010\u0015\u001a\u0004\b4\u00105R\u001b\u0010;\u001a\u0002078BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b8\u0010\u0015\u001a\u0004\b9\u0010:R\u001b\u0010@\u001a\u00020<8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b=\u0010\u0015\u001a\u0004\b>\u0010?R\u001b\u0010E\u001a\u00020A8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bB\u0010\u0015\u001a\u0004\bC\u0010DR\u001b\u0010J\u001a\u00020F8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bG\u0010\u0015\u001a\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010N\u001a\u00020M8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bN\u0010OR\u0018\u0010Q\u001a\u0004\u0018\u00010P8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010RR\u0014\u0010T\u001a\u00020S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u0014\u0010W\u001a\u00020V8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR\u0018\u0010Z\u001a\u0004\u0018\u00010Y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bZ\u0010[¨\u0006\\"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp;", "Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandler;", "<init>", "()V", "", "sessionId", "projectId", "Lkotlin/Function1;", "Ljava/lang/Exception;", "Lkotlin/Exception;", "", "onFailure", "Lkotlin/Function0;", "onSuccess", "sendData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "shutdown", "collectNativeDeviceData", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;)V", "Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", "userEventsHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "getUserEventsHelper", "()Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", "userEventsHelper", "Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollector;", "deviceDataCollector$delegate", "getDeviceDataCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollector;", "deviceDataCollector", "Lai/verisoul/sdk/helpers/nativeDataCollection/LocationCollector;", "locationCollector$delegate", "getLocationCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/LocationCollector;", "locationCollector", "Lai/verisoul/sdk/helpers/nativeDataCollection/NetworkDataCollector;", "networkDataCollector$delegate", "getNetworkDataCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/NetworkDataCollector;", "networkDataCollector", "Lai/verisoul/sdk/helpers/nativeDataCollection/SettingsCollector;", "settingsCollector$delegate", "getSettingsCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/SettingsCollector;", "settingsCollector", "Lai/verisoul/sdk/helpers/nativeDataCollection/AppCloningCollector;", "appCloningCollector$delegate", "getAppCloningCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/AppCloningCollector;", "appCloningCollector", "Lai/verisoul/sdk/helpers/nativeDataCollection/AppSetIdCollector;", "appSetIdCollector$delegate", "getAppSetIdCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/AppSetIdCollector;", "appSetIdCollector", "Lai/verisoul/sdk/helpers/nativeDataCollection/EmulatorChecker;", "emulatorChecker$delegate", "getEmulatorChecker", "()Lai/verisoul/sdk/helpers/nativeDataCollection/EmulatorChecker;", "emulatorChecker", "Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "httpService$delegate", "getHttpService", "()Lai/verisoul/sdk/data/remote/VerisoulHttpService;", "httpService", "Lai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector;", "webViewDataCollector$delegate", "getWebViewDataCollector", "()Lai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector;", "webViewDataCollector", "Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", "appIntegrityHelper$delegate", "getAppIntegrityHelper", "()Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", "appIntegrityHelper", "logTag", "Ljava/lang/String;", "LWh/a;", "collectionMutex", "LWh/a;", "Lai/verisoul/sdk/data/remote/AllData;", "collectedData", "Lai/verisoul/sdk/data/remote/AllData;", "LPh/M;", "exceptionHandler", "LPh/M;", "LPh/P;", "scope", "LPh/P;", "LPh/C0;", "currentJob", "LPh/C0;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceDataCollectorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n+ 3 CoroutineExceptionHandler.kt\nkotlinx/coroutines/CoroutineExceptionHandlerKt\n*L\n1#1,217:1\n67#2:218\n67#2:219\n67#2:220\n67#2:221\n67#2:222\n67#2:223\n67#2:224\n67#2:225\n67#2:226\n67#2:227\n67#2:228\n48#3,4:229\n*S KotlinDebug\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp\n*L\n39#1:218\n40#1:219\n41#1:220\n42#1:221\n43#1:222\n44#1:223\n45#1:224\n46#1:225\n47#1:226\n48#1:227\n49#1:228\n56#1:229,4\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceDataCollectorHandlerImp implements DeviceDataCollectorHandler {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "userEventsHelper", "getUserEventsHelper()Lai/verisoul/sdk/helpers/sensor/GatherUserEventsHelper;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "deviceDataCollector", "getDeviceDataCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "locationCollector", "getLocationCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/LocationCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "networkDataCollector", "getNetworkDataCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/NetworkDataCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "settingsCollector", "getSettingsCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/SettingsCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "appCloningCollector", "getAppCloningCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/AppCloningCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "appSetIdCollector", "getAppSetIdCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/AppSetIdCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "emulatorChecker", "getEmulatorChecker()Lai/verisoul/sdk/helpers/nativeDataCollection/EmulatorChecker;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "httpService", "getHttpService()Lai/verisoul/sdk/data/remote/VerisoulHttpService;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "webViewDataCollector", "getWebViewDataCollector()Lai/verisoul/sdk/helpers/nativeDataCollection/WebServiceCollector;", 0)), Reflection.property1(new PropertyReference1Impl(DeviceDataCollectorHandlerImp.class, "appIntegrityHelper", "getAppIntegrityHelper()Lai/verisoul/sdk/helpers/integrity/AppIntegrityHelper;", 0))};

    @Nullable
    private AllData collectedData;

    @Nullable
    private C0 currentJob;

    @NotNull
    private final M exceptionHandler;

    @NotNull
    private final P scope;

    /* renamed from: userEventsHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate userEventsHelper = new InjectDelegate(GatherUserEventsHelper.class);

    /* renamed from: deviceDataCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate deviceDataCollector = new InjectDelegate(DeviceDataCollector.class);

    /* renamed from: locationCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate locationCollector = new InjectDelegate(LocationCollector.class);

    /* renamed from: networkDataCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate networkDataCollector = new InjectDelegate(NetworkDataCollector.class);

    /* renamed from: settingsCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate settingsCollector = new InjectDelegate(SettingsCollector.class);

    /* renamed from: appCloningCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate appCloningCollector = new InjectDelegate(AppCloningCollector.class);

    /* renamed from: appSetIdCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate appSetIdCollector = new InjectDelegate(AppSetIdCollector.class);

    /* renamed from: emulatorChecker$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate emulatorChecker = new InjectDelegate(EmulatorChecker.class);

    /* renamed from: httpService$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate httpService = new InjectDelegate(VerisoulHttpService.class);

    /* renamed from: webViewDataCollector$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate webViewDataCollector = new InjectDelegate(WebServiceCollector.class);

    /* renamed from: appIntegrityHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate appIntegrityHelper = new InjectDelegate(AppIntegrityHelper.class);

    @NotNull
    private final String logTag = "Verisoul-[" + DeviceDataCollectorHandlerImp.class.getSimpleName() + "]";

    @NotNull
    private final a collectionMutex = g.b(false, 1, null);

    public DeviceDataCollectorHandlerImp() {
        DeviceDataCollectorHandlerImp$special$$inlined$CoroutineExceptionHandler$1 deviceDataCollectorHandlerImp$special$$inlined$CoroutineExceptionHandler$1 = new DeviceDataCollectorHandlerImp$special$$inlined$CoroutineExceptionHandler$1(M.f9041T2, this);
        this.exceptionHandler = deviceDataCollectorHandlerImp$special$$inlined$CoroutineExceptionHandler$1;
        this.scope = Q.a(X0.b(null, 1, null).plus(C1452g0.b()).plus(deviceDataCollectorHandlerImp$special$$inlined$CoroutineExceptionHandler$1));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppCloningCollector getAppCloningCollector() {
        return (AppCloningCollector) this.appCloningCollector.getValue(this, $$delegatedProperties[5]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppIntegrityHelper getAppIntegrityHelper() {
        return (AppIntegrityHelper) this.appIntegrityHelper.getValue(this, $$delegatedProperties[10]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AppSetIdCollector getAppSetIdCollector() {
        return (AppSetIdCollector) this.appSetIdCollector.getValue(this, $$delegatedProperties[6]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final DeviceDataCollector getDeviceDataCollector() {
        return (DeviceDataCollector) this.deviceDataCollector.getValue(this, $$delegatedProperties[1]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final EmulatorChecker getEmulatorChecker() {
        return (EmulatorChecker) this.emulatorChecker.getValue(this, $$delegatedProperties[7]);
    }

    private final VerisoulHttpService getHttpService() {
        return (VerisoulHttpService) this.httpService.getValue(this, $$delegatedProperties[8]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final LocationCollector getLocationCollector() {
        return (LocationCollector) this.locationCollector.getValue(this, $$delegatedProperties[2]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final NetworkDataCollector getNetworkDataCollector() {
        return (NetworkDataCollector) this.networkDataCollector.getValue(this, $$delegatedProperties[3]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final SettingsCollector getSettingsCollector() {
        return (SettingsCollector) this.settingsCollector.getValue(this, $$delegatedProperties[4]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final GatherUserEventsHelper getUserEventsHelper() {
        return (GatherUserEventsHelper) this.userEventsHelper.getValue(this, $$delegatedProperties[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final WebServiceCollector getWebViewDataCollector() {
        return (WebServiceCollector) this.webViewDataCollector.getValue(this, $$delegatedProperties[9]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object sendData(String str, String str2, Function1<? super Exception, Unit> function1, Function0<Unit> function0, Continuation<? super Unit> continuation) {
        DeviceDataCollectorHandlerImp$sendData$1 deviceDataCollectorHandlerImp$sendData$1;
        int i10;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp;
        long j10;
        if (continuation instanceof DeviceDataCollectorHandlerImp$sendData$1) {
            deviceDataCollectorHandlerImp$sendData$1 = (DeviceDataCollectorHandlerImp$sendData$1) continuation;
            int i11 = deviceDataCollectorHandlerImp$sendData$1.label;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                deviceDataCollectorHandlerImp$sendData$1.label = i11 - Integer.MIN_VALUE;
                Object obj = deviceDataCollectorHandlerImp$sendData$1.result;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = deviceDataCollectorHandlerImp$sendData$1.label;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    long currentTimeMillis = System.currentTimeMillis();
                    AllData allData = this.collectedData;
                    if (allData != null) {
                        try {
                            DeviceNativeSubmitRequest deviceNativeSubmitRequest = new DeviceNativeSubmitRequest(str, str2, allData);
                            VerisoulHttpService httpService = getHttpService();
                            deviceDataCollectorHandlerImp$sendData$1.L$0 = this;
                            deviceDataCollectorHandlerImp$sendData$1.L$1 = function1;
                            deviceDataCollectorHandlerImp$sendData$1.L$2 = function0;
                            deviceDataCollectorHandlerImp$sendData$1.J$0 = currentTimeMillis;
                            deviceDataCollectorHandlerImp$sendData$1.label = 1;
                            if (httpService.submitDeviceData(deviceNativeSubmitRequest, deviceDataCollectorHandlerImp$sendData$1) == coroutine_suspended) {
                                return coroutine_suspended;
                            }
                            deviceDataCollectorHandlerImp = this;
                            j10 = currentTimeMillis;
                        } catch (CancellationException e10) {
                            e = e10;
                            deviceDataCollectorHandlerImp = this;
                            Logger.INSTANCE.info(deviceDataCollectorHandlerImp.logTag, "Data submission cancelled");
                            throw e;
                        } catch (Exception e11) {
                            e = e11;
                            deviceDataCollectorHandlerImp = this;
                            j10 = currentTimeMillis;
                            Logger logger = Logger.INSTANCE;
                            logger.metricLog(deviceDataCollectorHandlerImp.logTag, "native_device_data_collection_time", System.currentTimeMillis() - j10);
                            logger.error(deviceDataCollectorHandlerImp.logTag, "Failed to post data: " + e.getMessage());
                            function1.invoke(e);
                            return Unit.INSTANCE;
                        }
                    }
                    return Unit.INSTANCE;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = deviceDataCollectorHandlerImp$sendData$1.J$0;
                function0 = (Function0) deviceDataCollectorHandlerImp$sendData$1.L$2;
                function1 = (Function1) deviceDataCollectorHandlerImp$sendData$1.L$1;
                deviceDataCollectorHandlerImp = (DeviceDataCollectorHandlerImp) deviceDataCollectorHandlerImp$sendData$1.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (CancellationException e12) {
                    e = e12;
                    Logger.INSTANCE.info(deviceDataCollectorHandlerImp.logTag, "Data submission cancelled");
                    throw e;
                } catch (Exception e13) {
                    e = e13;
                    Logger logger2 = Logger.INSTANCE;
                    logger2.metricLog(deviceDataCollectorHandlerImp.logTag, "native_device_data_collection_time", System.currentTimeMillis() - j10);
                    logger2.error(deviceDataCollectorHandlerImp.logTag, "Failed to post data: " + e.getMessage());
                    function1.invoke(e);
                    return Unit.INSTANCE;
                }
                Logger.INSTANCE.metricLog(deviceDataCollectorHandlerImp.logTag, "native_device_data_collection_time", System.currentTimeMillis() - j10);
                function0.invoke();
                return Unit.INSTANCE;
            }
        }
        deviceDataCollectorHandlerImp$sendData$1 = new DeviceDataCollectorHandlerImp$sendData$1(this, continuation);
        Object obj2 = deviceDataCollectorHandlerImp$sendData$1.result;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = deviceDataCollectorHandlerImp$sendData$1.label;
        if (i10 != 0) {
        }
        Logger.INSTANCE.metricLog(deviceDataCollectorHandlerImp.logTag, "native_device_data_collection_time", System.currentTimeMillis() - j10);
        function0.invoke();
        return Unit.INSTANCE;
    }

    private final void shutdown() {
        Logger.INSTANCE.debug(this.logTag, "Shutting down device data collector");
        AbstractC1457j.b(null, new DeviceDataCollectorHandlerImp$shutdown$1(this, null), 1, null);
        Q.f(this.scope, null, 1, null);
        this.collectedData = null;
    }

    @Override // ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandler
    public void collectNativeDeviceData(@NotNull String sessionId, @NotNull String projectId, @NotNull Function1<? super Exception, Unit> onFailure, @NotNull Function0<Unit> onSuccess) {
        Intrinsics.checkNotNullParameter(sessionId, "sessionId");
        Intrinsics.checkNotNullParameter(projectId, "projectId");
        Intrinsics.checkNotNullParameter(onFailure, "onFailure");
        Intrinsics.checkNotNullParameter(onSuccess, "onSuccess");
        AbstractC1459k.d(this.scope, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1(this, sessionId, projectId, onFailure, onSuccess, null), 3, null);
    }
}
