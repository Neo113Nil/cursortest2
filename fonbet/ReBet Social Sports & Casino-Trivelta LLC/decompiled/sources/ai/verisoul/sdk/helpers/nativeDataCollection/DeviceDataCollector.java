package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.device.DeviceData;
import ai.verisoul.sdk.helpers.device.DeviceHelper;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollector;", "", "()V", "deviceInfoHelper", "Lai/verisoul/sdk/helpers/device/DeviceHelper;", "getDeviceInfoHelper", "()Lai/verisoul/sdk/helpers/device/DeviceHelper;", "deviceInfoHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "collectDeviceData", "Lai/verisoul/sdk/helpers/device/DeviceData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nDeviceDataCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DeviceDataCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,28:1\n67#2:29\n*S KotlinDebug\n*F\n+ 1 DeviceDataCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/DeviceDataCollector\n*L\n12#1:29\n*E\n"})
/* loaded from: classes.dex */
public final class DeviceDataCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(DeviceDataCollector.class, "deviceInfoHelper", "getDeviceInfoHelper()Lai/verisoul/sdk/helpers/device/DeviceHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + DeviceDataCollector.class.getSimpleName() + "]";

    /* renamed from: deviceInfoHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate deviceInfoHelper = new InjectDelegate(DeviceHelper.class);

    private final DeviceHelper getDeviceInfoHelper() {
        return (DeviceHelper) this.deviceInfoHelper.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final DeviceData collectDeviceData() {
        long currentTimeMillis = System.currentTimeMillis();
        DeviceData collect = getDeviceInfoHelper().collect();
        Logger.INSTANCE.metricLog(this.logTag, "app_cloning_duration", System.currentTimeMillis() - currentTimeMillis);
        return collect;
    }
}
