package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.AbstractC1459k;
import Ph.P;
import Ph.X;
import ai.verisoul.androidsdk.BuildConfig;
import ai.verisoul.sdk.Core;
import ai.verisoul.sdk.InternalVerisoulCore;
import ai.verisoul.sdk.VerisoulException;
import ai.verisoul.sdk.data.remote.AllData;
import ai.verisoul.sdk.data.remote.SDKInfo;
import ai.verisoul.sdk.helpers.app_clone.AppCloningData;
import ai.verisoul.sdk.helpers.app_set_id.AppSetIdData;
import ai.verisoul.sdk.helpers.device.DeviceData;
import ai.verisoul.sdk.helpers.emulator.EmulatorDetectionData;
import ai.verisoul.sdk.helpers.integrity.AppIntegrityHelper;
import ai.verisoul.sdk.helpers.location.LocationData;
import ai.verisoul.sdk.helpers.network.NetworkData;
import ai.verisoul.sdk.helpers.sensor.GatherUserEventsHelper;
import ai.verisoul.sdk.helpers.settings.SettingsData;
import ai.verisoul.sdk.helpers.webview.WebViewData;
import ai.verisoul.sdk.logger.Logger;
import com.plaid.internal.EnumC3631g;
import com.twilio.voice.Constants;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Ref;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "", "<anonymous>", "(LPh/P;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1", f = "DeviceDataCollectorHandler.kt", i = {0, 0, 0, 0, 0, 0, 0, 0, 0, 1, 1, 1, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 3, 3, 3, 3, 3, 3, 3, 3, 4, 4, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 5, 5, 5, 6, 6, 6, 6, 6, 6, 7, 7, 7, 8}, l = {112, 117, 118, 119, 126, 127, 128, 131, EnumC3631g.SDK_ASSET_ILLUSTRATION_DEV_FAULTY_DATA_VALUE, EnumC3631g.SDK_ASSET_ICON_CHECKMARK_BLUE_VALUE}, m = "invokeSuspend", n = {"deviceDataDeferred", "settingsDataDeferred", "emulatorDataDeferred", "locationDataDeferred", "networkDataDeferred", "appCloningDataDeferred", "webViewException", "webViewDataDeferred", "appSetIdDataDeferred", "settingsDataDeferred", "emulatorDataDeferred", "locationDataDeferred", "networkDataDeferred", "appCloningDataDeferred", "webViewException", "webViewDataDeferred", "appSetIdDataDeferred", "emulatorDataDeferred", "locationDataDeferred", "networkDataDeferred", "appCloningDataDeferred", "webViewException", "webViewDataDeferred", "appSetIdDataDeferred", "deviceData", "locationDataDeferred", "networkDataDeferred", "appCloningDataDeferred", "webViewException", "webViewDataDeferred", "appSetIdDataDeferred", "deviceData", "settingsData", "locationDataDeferred", "networkDataDeferred", "appCloningDataDeferred", "webViewException", "appSetIdDataDeferred", "deviceData", "settingsData", "emulatorData", "locationDataDeferred", "appCloningDataDeferred", "webViewException", "appSetIdDataDeferred", "deviceData", "settingsData", "emulatorData", "appCloningDataDeferred", "webViewException", "appSetIdDataDeferred", "deviceData", "settingsData", "emulatorData", "webViewException", "appSetIdDataDeferred", "emulatorData", "webViewException"}, s = {"L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$8", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$7", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$6", "L$0", "L$1", "L$2", "L$3", "L$4", "L$5", "L$0", "L$1", "L$2", "L$0"})
/* loaded from: classes.dex */
public final class DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1 extends SuspendLambda implements Function2<P, Continuation<? super Unit>, Object> {
    final /* synthetic */ Function1<Exception, Unit> $onFailure;
    final /* synthetic */ Function0<Unit> $onSuccess;
    final /* synthetic */ String $projectId;
    final /* synthetic */ String $sessionId;
    private /* synthetic */ Object L$0;
    Object L$1;
    Object L$2;
    Object L$3;
    Object L$4;
    Object L$5;
    Object L$6;
    Object L$7;
    Object L$8;
    int label;
    final /* synthetic */ DeviceDataCollectorHandlerImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1(DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp, String str, String str2, Function1<? super Exception, Unit> function1, Function0<Unit> function0, Continuation<? super DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceDataCollectorHandlerImp;
        this.$sessionId = str;
        this.$projectId = str2;
        this.$onFailure = function1;
        this.$onSuccess = function0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1 deviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1 = new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1(this.this$0, this.$sessionId, this.$projectId, this.$onFailure, this.$onSuccess, continuation);
        deviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1.L$0 = obj;
        return deviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super Unit> continuation) {
        return ((DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x04c4, code lost:
    
        if (r0 == r6) goto L105;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0476 A[Catch: Exception -> 0x0019, CancellationException -> 0x001c, TryCatch #5 {CancellationException -> 0x001c, Exception -> 0x0019, blocks: (B:7:0x0014, B:11:0x0043, B:14:0x0447, B:16:0x0476, B:18:0x047c, B:19:0x0497, B:23:0x0488, B:24:0x0492, B:25:0x049f, B:29:0x0078, B:31:0x0421, B:36:0x00ad, B:38:0x03ef, B:43:0x00d9, B:45:0x03c9, B:50:0x010b, B:52:0x03a0, B:57:0x0133, B:59:0x0372, B:63:0x037a, B:67:0x04c7, B:68:0x04ce, B:70:0x0164, B:72:0x034b, B:77:0x018f, B:79:0x0326, B:87:0x0308, B:92:0x02e7, B:94:0x01d7), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x049f A[Catch: Exception -> 0x0019, CancellationException -> 0x001c, TryCatch #5 {CancellationException -> 0x001c, Exception -> 0x0019, blocks: (B:7:0x0014, B:11:0x0043, B:14:0x0447, B:16:0x0476, B:18:0x047c, B:19:0x0497, B:23:0x0488, B:24:0x0492, B:25:0x049f, B:29:0x0078, B:31:0x0421, B:36:0x00ad, B:38:0x03ef, B:43:0x00d9, B:45:0x03c9, B:50:0x010b, B:52:0x03a0, B:57:0x0133, B:59:0x0372, B:63:0x037a, B:67:0x04c7, B:68:0x04ce, B:70:0x0164, B:72:0x034b, B:77:0x018f, B:79:0x0326, B:87:0x0308, B:92:0x02e7, B:94:0x01d7), top: B:2:0x0009 }] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x043f  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0441  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x040d  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x040f  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x03e6  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x03bd  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x03bf  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0366  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x0368  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x0341  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0324  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        String str;
        String str2;
        String str3;
        GatherUserEventsHelper userEventsHelper;
        WebServiceCollector webViewDataCollector;
        X b10;
        X b11;
        X b12;
        X b13;
        X b14;
        X b15;
        X b16;
        X b17;
        Ref.ObjectRef objectRef;
        X x10;
        X x11;
        X x12;
        X x13;
        Ref.ObjectRef objectRef2;
        X x14;
        X x15;
        X x16;
        X x17;
        AppIntegrityHelper appIntegrityHelper;
        String str4;
        X x18;
        X x19;
        X x20;
        X x21;
        X x22;
        X x23;
        Object await;
        Object await2;
        X x24;
        DeviceData deviceData;
        X x25;
        X x26;
        X x27;
        Object await3;
        DeviceData deviceData2;
        X x28;
        SettingsData settingsData;
        X x29;
        X x30;
        X x31;
        Ref.ObjectRef objectRef3;
        EmulatorDetectionData emulatorDetectionData;
        Object await4;
        X x32;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp;
        X x33;
        X x34;
        WebViewData webViewData;
        Object await5;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp2;
        DeviceData deviceData3;
        EmulatorDetectionData emulatorDetectionData2;
        X x35;
        Ref.ObjectRef objectRef4;
        X x36;
        SettingsData settingsData2;
        Object await6;
        DeviceData deviceData4;
        NetworkData networkData;
        Ref.ObjectRef objectRef5;
        X x37;
        Object await7;
        NetworkData networkData2;
        EmulatorDetectionData emulatorDetectionData3;
        DeviceData deviceData5;
        WebViewData webViewData2;
        X x38;
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp3;
        SettingsData settingsData3;
        LocationData locationData;
        Ref.ObjectRef objectRef6;
        Object await8;
        NetworkData networkData3;
        WebViewData webViewData3;
        AppCloningData appCloningData;
        AllData allData;
        Object sendData;
        Exception exc;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        try {
        } catch (CancellationException e10) {
            Logger logger = Logger.INSTANCE;
            str2 = this.this$0.logTag;
            logger.info(str2, "Collection cancelled");
            throw e10;
        } catch (Exception e11) {
            Logger logger2 = Logger.INSTANCE;
            str = this.this$0.logTag;
            logger2.error(str, "Error collecting device data: " + e11.getMessage());
            this.$onFailure.invoke(e11);
        }
        switch (this.label) {
            case 0:
                ResultKt.throwOnFailure(obj);
                P p10 = (P) this.L$0;
                Logger logger3 = Logger.INSTANCE;
                str3 = this.this$0.logTag;
                logger3.debug(str3, "Collecting device data for sessionId: " + this.$sessionId + ", projectId: " + this.$projectId);
                Core.INSTANCE.updateCurrentSessionId$sdk_release(this.$sessionId);
                userEventsHelper = this.this$0.getUserEventsHelper();
                userEventsHelper.beginSession(this.$sessionId, this.$projectId);
                webViewDataCollector = this.this$0.getWebViewDataCollector();
                webViewDataCollector.cancel();
                b10 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$deviceDataDeferred$1(this.this$0, null), 3, null);
                b11 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1(this.this$0, null), 3, null);
                b12 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$emulatorDataDeferred$1(this.this$0, null), 3, null);
                b13 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$locationDataDeferred$1(this.this$0, null), 3, null);
                b14 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$networkDataDeferred$1(this.this$0, null), 3, null);
                b15 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$appCloningDataDeferred$1(this.this$0, null), 3, null);
                Ref.ObjectRef objectRef7 = new Ref.ObjectRef();
                b16 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$webViewDataDeferred$1(this.this$0, objectRef7, null), 3, null);
                b17 = AbstractC1459k.b(p10, null, null, new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$appSetIdDataDeferred$1(this.this$0, null), 3, null);
                try {
                    appIntegrityHelper = this.this$0.getAppIntegrityHelper();
                    this.L$0 = b10;
                    this.L$1 = b11;
                    this.L$2 = b12;
                    this.L$3 = b13;
                    this.L$4 = b14;
                    this.L$5 = b15;
                    objectRef = objectRef7;
                    try {
                        this.L$6 = objectRef;
                        this.L$7 = b16;
                        this.L$8 = b17;
                        this.label = 1;
                    } catch (Exception e12) {
                        e = e12;
                        x10 = b10;
                        x11 = b11;
                        x12 = b12;
                        x13 = b17;
                        objectRef2 = objectRef;
                        x14 = b13;
                        x15 = b14;
                        x16 = b15;
                        x17 = b16;
                        Logger logger4 = Logger.INSTANCE;
                        str4 = this.this$0.logTag;
                        logger4.error(str4, "Error collecting App integrity data: " + e.getMessage());
                        x18 = x13;
                        x19 = x17;
                        x20 = x15;
                        x21 = x14;
                        x22 = x12;
                        x23 = x11;
                        this.L$0 = x23;
                        this.L$1 = x22;
                        this.L$2 = x21;
                        this.L$3 = x20;
                        this.L$4 = x16;
                        this.L$5 = objectRef2;
                        this.L$6 = x19;
                        this.L$7 = x18;
                        this.L$8 = null;
                        this.label = 2;
                        await = x10.await(this);
                        if (await == coroutine_suspended) {
                        }
                        DeviceData deviceData6 = (DeviceData) await;
                        this.L$0 = x22;
                        this.L$1 = x21;
                        this.L$2 = x20;
                        this.L$3 = x16;
                        this.L$4 = objectRef2;
                        this.L$5 = x19;
                        this.L$6 = x18;
                        this.L$7 = deviceData6;
                        this.label = 3;
                        await2 = x23.await(this);
                        if (await2 != coroutine_suspended) {
                        }
                    }
                } catch (Exception e13) {
                    e = e13;
                    objectRef = objectRef7;
                }
                if (appIntegrityHelper.syncAppIntegrityData(this) != coroutine_suspended) {
                    x10 = b10;
                    x11 = b11;
                    x12 = b12;
                    x13 = b17;
                    objectRef2 = objectRef;
                    x14 = b13;
                    x15 = b14;
                    x16 = b15;
                    x17 = b16;
                    x18 = x13;
                    x19 = x17;
                    x20 = x15;
                    x21 = x14;
                    x22 = x12;
                    x23 = x11;
                    this.L$0 = x23;
                    this.L$1 = x22;
                    this.L$2 = x21;
                    this.L$3 = x20;
                    this.L$4 = x16;
                    this.L$5 = objectRef2;
                    this.L$6 = x19;
                    this.L$7 = x18;
                    this.L$8 = null;
                    this.label = 2;
                    await = x10.await(this);
                    if (await == coroutine_suspended) {
                    }
                    DeviceData deviceData62 = (DeviceData) await;
                    this.L$0 = x22;
                    this.L$1 = x21;
                    this.L$2 = x20;
                    this.L$3 = x16;
                    this.L$4 = objectRef2;
                    this.L$5 = x19;
                    this.L$6 = x18;
                    this.L$7 = deviceData62;
                    this.label = 3;
                    await2 = x23.await(this);
                    if (await2 != coroutine_suspended) {
                        X x39 = x22;
                        x24 = x18;
                        deviceData = deviceData62;
                        x25 = x21;
                        x26 = x20;
                        x27 = x39;
                        SettingsData settingsData4 = (SettingsData) await2;
                        this.L$0 = x25;
                        this.L$1 = x26;
                        this.L$2 = x16;
                        this.L$3 = objectRef2;
                        this.L$4 = x19;
                        this.L$5 = x24;
                        this.L$6 = deviceData;
                        this.L$7 = settingsData4;
                        this.label = 4;
                        await3 = x27.await(this);
                        if (await3 == coroutine_suspended) {
                            Ref.ObjectRef objectRef8 = objectRef2;
                            deviceData2 = deviceData;
                            x28 = x24;
                            settingsData = settingsData4;
                            x29 = x25;
                            x30 = x16;
                            x31 = x26;
                            objectRef3 = objectRef8;
                            emulatorDetectionData = (EmulatorDetectionData) await3;
                            if (deviceData2 == null && settingsData != null && emulatorDetectionData != null) {
                                DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp4 = this.this$0;
                                this.L$0 = x29;
                                this.L$1 = x31;
                                this.L$2 = x30;
                                this.L$3 = objectRef3;
                                this.L$4 = x28;
                                this.L$5 = deviceData2;
                                this.L$6 = settingsData;
                                this.L$7 = emulatorDetectionData;
                                this.L$8 = deviceDataCollectorHandlerImp4;
                                this.label = 5;
                                await4 = x19.await(this);
                                if (await4 != coroutine_suspended) {
                                    X x40 = x31;
                                    x32 = x28;
                                    deviceDataCollectorHandlerImp = deviceDataCollectorHandlerImp4;
                                    x33 = x29;
                                    x34 = x40;
                                    webViewData = (WebViewData) await4;
                                    this.L$0 = x33;
                                    this.L$1 = x30;
                                    this.L$2 = objectRef3;
                                    this.L$3 = x32;
                                    this.L$4 = deviceData2;
                                    this.L$5 = settingsData;
                                    this.L$6 = emulatorDetectionData;
                                    this.L$7 = deviceDataCollectorHandlerImp;
                                    this.L$8 = webViewData;
                                    this.label = 6;
                                    await5 = x34.await(this);
                                    if (await5 == coroutine_suspended) {
                                        SettingsData settingsData5 = settingsData;
                                        deviceDataCollectorHandlerImp2 = deviceDataCollectorHandlerImp;
                                        deviceData3 = deviceData2;
                                        emulatorDetectionData2 = emulatorDetectionData;
                                        x35 = x30;
                                        objectRef4 = objectRef3;
                                        x36 = x32;
                                        settingsData2 = settingsData5;
                                        NetworkData networkData4 = (NetworkData) await5;
                                        this.L$0 = x35;
                                        this.L$1 = objectRef4;
                                        this.L$2 = x36;
                                        this.L$3 = deviceData3;
                                        this.L$4 = settingsData2;
                                        this.L$5 = emulatorDetectionData2;
                                        this.L$6 = deviceDataCollectorHandlerImp2;
                                        this.L$7 = webViewData;
                                        this.L$8 = networkData4;
                                        this.label = 7;
                                        await6 = x33.await(this);
                                        if (await6 == coroutine_suspended) {
                                            X x41 = x36;
                                            deviceData4 = deviceData3;
                                            networkData = networkData4;
                                            objectRef5 = objectRef4;
                                            x37 = x41;
                                            LocationData locationData2 = (LocationData) await6;
                                            this.L$0 = objectRef5;
                                            this.L$1 = x37;
                                            this.L$2 = emulatorDetectionData2;
                                            this.L$3 = deviceDataCollectorHandlerImp2;
                                            this.L$4 = webViewData;
                                            this.L$5 = networkData;
                                            this.L$6 = locationData2;
                                            this.L$7 = deviceData4;
                                            this.L$8 = settingsData2;
                                            this.label = 8;
                                            await7 = x35.await(this);
                                            if (await7 == coroutine_suspended) {
                                                DeviceData deviceData7 = deviceData4;
                                                networkData2 = networkData;
                                                emulatorDetectionData3 = emulatorDetectionData2;
                                                deviceData5 = deviceData7;
                                                X x42 = x37;
                                                webViewData2 = webViewData;
                                                x38 = x42;
                                                Ref.ObjectRef objectRef9 = objectRef5;
                                                deviceDataCollectorHandlerImp3 = deviceDataCollectorHandlerImp2;
                                                settingsData3 = settingsData2;
                                                locationData = locationData2;
                                                objectRef6 = objectRef9;
                                                AppCloningData appCloningData2 = (AppCloningData) await7;
                                                this.L$0 = objectRef6;
                                                this.L$1 = deviceDataCollectorHandlerImp3;
                                                this.L$2 = webViewData2;
                                                this.L$3 = networkData2;
                                                this.L$4 = locationData;
                                                this.L$5 = deviceData5;
                                                this.L$6 = settingsData3;
                                                this.L$7 = appCloningData2;
                                                this.L$8 = emulatorDetectionData3;
                                                this.label = 9;
                                                await8 = x38.await(this);
                                                if (await8 == coroutine_suspended) {
                                                    WebViewData webViewData4 = webViewData2;
                                                    networkData3 = networkData2;
                                                    webViewData3 = webViewData4;
                                                    appCloningData = appCloningData2;
                                                    Ref.ObjectRef objectRef10 = objectRef6;
                                                    deviceDataCollectorHandlerImp3.collectedData = new AllData(webViewData3, networkData3, locationData, deviceData5, settingsData3, appCloningData, emulatorDetectionData3, (AppSetIdData) await8, new SDKInfo(BuildConfig.PUBLISH_VERSION, Constants.PLATFORM_ANDROID, InternalVerisoulCore.INSTANCE.getSdkType().getValue()));
                                                    allData = this.this$0.collectedData;
                                                    Intrinsics.checkNotNull(allData);
                                                    if (allData.getWebViewData() == null) {
                                                        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp5 = this.this$0;
                                                        String str5 = this.$sessionId;
                                                        String str6 = this.$projectId;
                                                        Function1<Exception, Unit> function1 = this.$onFailure;
                                                        Function0<Unit> function0 = this.$onSuccess;
                                                        this.L$0 = null;
                                                        this.L$1 = null;
                                                        this.L$2 = null;
                                                        this.L$3 = null;
                                                        this.L$4 = null;
                                                        this.L$5 = null;
                                                        this.L$6 = null;
                                                        this.L$7 = null;
                                                        this.L$8 = null;
                                                        this.label = 10;
                                                        sendData = deviceDataCollectorHandlerImp5.sendData(str5, str6, function1, function0, this);
                                                        break;
                                                    } else {
                                                        T t10 = objectRef10.element;
                                                        if (t10 instanceof VerisoulException) {
                                                            Intrinsics.checkNotNull(t10, "null cannot be cast to non-null type ai.verisoul.sdk.VerisoulException");
                                                            exc = (VerisoulException) t10;
                                                        } else {
                                                            exc = t10 != 0 ? new Exception("Failed to init Session id", (Throwable) objectRef10.element) : new Exception("Failed to init Session id");
                                                        }
                                                        this.$onFailure.invoke(exc);
                                                        return Unit.INSTANCE;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                throw new IllegalArgumentException("Failed to collect all data");
                            }
                        }
                    }
                }
                return coroutine_suspended;
            case 1:
                x13 = (X) this.L$8;
                x17 = (X) this.L$7;
                objectRef2 = (Ref.ObjectRef) this.L$6;
                x16 = (X) this.L$5;
                x15 = (X) this.L$4;
                x14 = (X) this.L$3;
                x12 = (X) this.L$2;
                x11 = (X) this.L$1;
                x10 = (X) this.L$0;
                try {
                    ResultKt.throwOnFailure(obj);
                } catch (Exception e14) {
                    e = e14;
                    Logger logger42 = Logger.INSTANCE;
                    str4 = this.this$0.logTag;
                    logger42.error(str4, "Error collecting App integrity data: " + e.getMessage());
                    x18 = x13;
                    x19 = x17;
                    x20 = x15;
                    x21 = x14;
                    x22 = x12;
                    x23 = x11;
                    this.L$0 = x23;
                    this.L$1 = x22;
                    this.L$2 = x21;
                    this.L$3 = x20;
                    this.L$4 = x16;
                    this.L$5 = objectRef2;
                    this.L$6 = x19;
                    this.L$7 = x18;
                    this.L$8 = null;
                    this.label = 2;
                    await = x10.await(this);
                    if (await == coroutine_suspended) {
                    }
                    DeviceData deviceData622 = (DeviceData) await;
                    this.L$0 = x22;
                    this.L$1 = x21;
                    this.L$2 = x20;
                    this.L$3 = x16;
                    this.L$4 = objectRef2;
                    this.L$5 = x19;
                    this.L$6 = x18;
                    this.L$7 = deviceData622;
                    this.label = 3;
                    await2 = x23.await(this);
                    if (await2 != coroutine_suspended) {
                    }
                }
                x18 = x13;
                x19 = x17;
                x20 = x15;
                x21 = x14;
                x22 = x12;
                x23 = x11;
                this.L$0 = x23;
                this.L$1 = x22;
                this.L$2 = x21;
                this.L$3 = x20;
                this.L$4 = x16;
                this.L$5 = objectRef2;
                this.L$6 = x19;
                this.L$7 = x18;
                this.L$8 = null;
                this.label = 2;
                await = x10.await(this);
                if (await == coroutine_suspended) {
                }
                DeviceData deviceData6222 = (DeviceData) await;
                this.L$0 = x22;
                this.L$1 = x21;
                this.L$2 = x20;
                this.L$3 = x16;
                this.L$4 = objectRef2;
                this.L$5 = x19;
                this.L$6 = x18;
                this.L$7 = deviceData6222;
                this.label = 3;
                await2 = x23.await(this);
                if (await2 != coroutine_suspended) {
                }
                break;
            case 2:
                x18 = (X) this.L$7;
                x19 = (X) this.L$6;
                Ref.ObjectRef objectRef11 = (Ref.ObjectRef) this.L$5;
                X x43 = (X) this.L$4;
                X x44 = (X) this.L$3;
                x21 = (X) this.L$2;
                X x45 = (X) this.L$1;
                x23 = (X) this.L$0;
                ResultKt.throwOnFailure(obj);
                x20 = x44;
                x16 = x43;
                objectRef2 = objectRef11;
                x22 = x45;
                await = obj;
                DeviceData deviceData62222 = (DeviceData) await;
                this.L$0 = x22;
                this.L$1 = x21;
                this.L$2 = x20;
                this.L$3 = x16;
                this.L$4 = objectRef2;
                this.L$5 = x19;
                this.L$6 = x18;
                this.L$7 = deviceData62222;
                this.label = 3;
                await2 = x23.await(this);
                if (await2 != coroutine_suspended) {
                }
                break;
            case 3:
                deviceData = (DeviceData) this.L$7;
                X x46 = (X) this.L$6;
                X x47 = (X) this.L$5;
                objectRef2 = (Ref.ObjectRef) this.L$4;
                x16 = (X) this.L$3;
                x26 = (X) this.L$2;
                x25 = (X) this.L$1;
                X x48 = (X) this.L$0;
                ResultKt.throwOnFailure(obj);
                x24 = x46;
                x19 = x47;
                x27 = x48;
                await2 = obj;
                SettingsData settingsData42 = (SettingsData) await2;
                this.L$0 = x25;
                this.L$1 = x26;
                this.L$2 = x16;
                this.L$3 = objectRef2;
                this.L$4 = x19;
                this.L$5 = x24;
                this.L$6 = deviceData;
                this.L$7 = settingsData42;
                this.label = 4;
                await3 = x27.await(this);
                if (await3 == coroutine_suspended) {
                }
                break;
            case 4:
                SettingsData settingsData6 = (SettingsData) this.L$7;
                DeviceData deviceData8 = (DeviceData) this.L$6;
                X x49 = (X) this.L$5;
                X x50 = (X) this.L$4;
                Ref.ObjectRef objectRef12 = (Ref.ObjectRef) this.L$3;
                X x51 = (X) this.L$2;
                X x52 = (X) this.L$1;
                x29 = (X) this.L$0;
                ResultKt.throwOnFailure(obj);
                settingsData = settingsData6;
                x28 = x49;
                deviceData2 = deviceData8;
                x19 = x50;
                objectRef3 = objectRef12;
                x31 = x52;
                x30 = x51;
                await3 = obj;
                emulatorDetectionData = (EmulatorDetectionData) await3;
                if (deviceData2 == null) {
                }
                throw new IllegalArgumentException("Failed to collect all data");
            case 5:
                deviceDataCollectorHandlerImp = (DeviceDataCollectorHandlerImp) this.L$8;
                EmulatorDetectionData emulatorDetectionData4 = (EmulatorDetectionData) this.L$7;
                settingsData = (SettingsData) this.L$6;
                deviceData2 = (DeviceData) this.L$5;
                x32 = (X) this.L$4;
                objectRef3 = (Ref.ObjectRef) this.L$3;
                x30 = (X) this.L$2;
                x34 = (X) this.L$1;
                x33 = (X) this.L$0;
                ResultKt.throwOnFailure(obj);
                emulatorDetectionData = emulatorDetectionData4;
                await4 = obj;
                webViewData = (WebViewData) await4;
                this.L$0 = x33;
                this.L$1 = x30;
                this.L$2 = objectRef3;
                this.L$3 = x32;
                this.L$4 = deviceData2;
                this.L$5 = settingsData;
                this.L$6 = emulatorDetectionData;
                this.L$7 = deviceDataCollectorHandlerImp;
                this.L$8 = webViewData;
                this.label = 6;
                await5 = x34.await(this);
                if (await5 == coroutine_suspended) {
                }
                break;
            case 6:
                WebViewData webViewData5 = (WebViewData) this.L$8;
                DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp6 = (DeviceDataCollectorHandlerImp) this.L$7;
                EmulatorDetectionData emulatorDetectionData5 = (EmulatorDetectionData) this.L$6;
                SettingsData settingsData7 = (SettingsData) this.L$5;
                DeviceData deviceData9 = (DeviceData) this.L$4;
                x36 = (X) this.L$3;
                objectRef4 = (Ref.ObjectRef) this.L$2;
                X x53 = (X) this.L$1;
                x33 = (X) this.L$0;
                ResultKt.throwOnFailure(obj);
                webViewData = webViewData5;
                deviceData3 = deviceData9;
                settingsData2 = settingsData7;
                emulatorDetectionData2 = emulatorDetectionData5;
                deviceDataCollectorHandlerImp2 = deviceDataCollectorHandlerImp6;
                x35 = x53;
                await5 = obj;
                NetworkData networkData42 = (NetworkData) await5;
                this.L$0 = x35;
                this.L$1 = objectRef4;
                this.L$2 = x36;
                this.L$3 = deviceData3;
                this.L$4 = settingsData2;
                this.L$5 = emulatorDetectionData2;
                this.L$6 = deviceDataCollectorHandlerImp2;
                this.L$7 = webViewData;
                this.L$8 = networkData42;
                this.label = 7;
                await6 = x33.await(this);
                if (await6 == coroutine_suspended) {
                }
                break;
            case 7:
                networkData = (NetworkData) this.L$8;
                webViewData = (WebViewData) this.L$7;
                deviceDataCollectorHandlerImp2 = (DeviceDataCollectorHandlerImp) this.L$6;
                emulatorDetectionData2 = (EmulatorDetectionData) this.L$5;
                settingsData2 = (SettingsData) this.L$4;
                deviceData4 = (DeviceData) this.L$3;
                x37 = (X) this.L$2;
                objectRef5 = (Ref.ObjectRef) this.L$1;
                X x54 = (X) this.L$0;
                ResultKt.throwOnFailure(obj);
                x35 = x54;
                await6 = obj;
                LocationData locationData22 = (LocationData) await6;
                this.L$0 = objectRef5;
                this.L$1 = x37;
                this.L$2 = emulatorDetectionData2;
                this.L$3 = deviceDataCollectorHandlerImp2;
                this.L$4 = webViewData;
                this.L$5 = networkData;
                this.L$6 = locationData22;
                this.L$7 = deviceData4;
                this.L$8 = settingsData2;
                this.label = 8;
                await7 = x35.await(this);
                if (await7 == coroutine_suspended) {
                }
                break;
            case 8:
                SettingsData settingsData8 = (SettingsData) this.L$8;
                DeviceData deviceData10 = (DeviceData) this.L$7;
                LocationData locationData3 = (LocationData) this.L$6;
                NetworkData networkData5 = (NetworkData) this.L$5;
                WebViewData webViewData6 = (WebViewData) this.L$4;
                DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp7 = (DeviceDataCollectorHandlerImp) this.L$3;
                EmulatorDetectionData emulatorDetectionData6 = (EmulatorDetectionData) this.L$2;
                X x55 = (X) this.L$1;
                objectRef6 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                settingsData3 = settingsData8;
                emulatorDetectionData3 = emulatorDetectionData6;
                webViewData2 = webViewData6;
                locationData = locationData3;
                deviceData5 = deviceData10;
                x38 = x55;
                deviceDataCollectorHandlerImp3 = deviceDataCollectorHandlerImp7;
                networkData2 = networkData5;
                await7 = obj;
                AppCloningData appCloningData22 = (AppCloningData) await7;
                this.L$0 = objectRef6;
                this.L$1 = deviceDataCollectorHandlerImp3;
                this.L$2 = webViewData2;
                this.L$3 = networkData2;
                this.L$4 = locationData;
                this.L$5 = deviceData5;
                this.L$6 = settingsData3;
                this.L$7 = appCloningData22;
                this.L$8 = emulatorDetectionData3;
                this.label = 9;
                await8 = x38.await(this);
                if (await8 == coroutine_suspended) {
                }
                break;
            case 9:
                emulatorDetectionData3 = (EmulatorDetectionData) this.L$8;
                AppCloningData appCloningData3 = (AppCloningData) this.L$7;
                settingsData3 = (SettingsData) this.L$6;
                deviceData5 = (DeviceData) this.L$5;
                locationData = (LocationData) this.L$4;
                NetworkData networkData6 = (NetworkData) this.L$3;
                WebViewData webViewData7 = (WebViewData) this.L$2;
                deviceDataCollectorHandlerImp3 = (DeviceDataCollectorHandlerImp) this.L$1;
                objectRef6 = (Ref.ObjectRef) this.L$0;
                ResultKt.throwOnFailure(obj);
                networkData3 = networkData6;
                webViewData3 = webViewData7;
                appCloningData = appCloningData3;
                await8 = obj;
                Ref.ObjectRef objectRef102 = objectRef6;
                deviceDataCollectorHandlerImp3.collectedData = new AllData(webViewData3, networkData3, locationData, deviceData5, settingsData3, appCloningData, emulatorDetectionData3, (AppSetIdData) await8, new SDKInfo(BuildConfig.PUBLISH_VERSION, Constants.PLATFORM_ANDROID, InternalVerisoulCore.INSTANCE.getSdkType().getValue()));
                allData = this.this$0.collectedData;
                Intrinsics.checkNotNull(allData);
                if (allData.getWebViewData() == null) {
                }
                break;
            case 10:
                ResultKt.throwOnFailure(obj);
                return Unit.INSTANCE;
            default:
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }
}
