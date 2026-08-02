package ai.verisoul.sdk.helpers.nativeDataCollection;

import Ph.P;
import ai.verisoul.sdk.helpers.settings.SettingsData;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"LPh/P;", "Lai/verisoul/sdk/helpers/settings/SettingsData;", "<anonymous>", "(LPh/P;)Lai/verisoul/sdk/helpers/settings/SettingsData;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "ai.verisoul.sdk.helpers.nativeDataCollection.DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1", f = "DeviceDataCollectorHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nDeviceDataCollectorHandler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDataCollectorHandler.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,217:1\n1#2:218\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1 extends SuspendLambda implements Function2<P, Continuation<? super SettingsData>, Object> {
    private /* synthetic */ Object L$0;
    int label;
    final /* synthetic */ DeviceDataCollectorHandlerImp this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1(DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp, Continuation<? super DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1> continuation) {
        super(2, continuation);
        this.this$0 = deviceDataCollectorHandlerImp;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1 deviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1 = new DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1(this.this$0, continuation);
        deviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1.L$0 = obj;
        return deviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1;
    }

    @Override // kotlin.jvm.functions.Function2
    @Nullable
    public final Object invoke(@NotNull P p10, @Nullable Continuation<? super SettingsData> continuation) {
        return ((DeviceDataCollectorHandlerImp$collectNativeDeviceData$1$newJob$1$settingsDataDeferred$1) create(p10, continuation)).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        Object m147constructorimpl;
        SettingsCollector settingsCollector;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        if (this.label != 0) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.throwOnFailure(obj);
        DeviceDataCollectorHandlerImp deviceDataCollectorHandlerImp = this.this$0;
        try {
            Result.Companion companion = Result.INSTANCE;
            settingsCollector = deviceDataCollectorHandlerImp.getSettingsCollector();
            m147constructorimpl = Result.m147constructorimpl(settingsCollector.collectSettingsData());
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        if (Result.m153isFailureimpl(m147constructorimpl)) {
            return null;
        }
        return m147constructorimpl;
    }
}
