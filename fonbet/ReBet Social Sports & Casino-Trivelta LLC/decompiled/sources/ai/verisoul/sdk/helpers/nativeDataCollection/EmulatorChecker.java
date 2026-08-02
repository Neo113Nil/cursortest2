package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.emulator.EmulatorDetectionData;
import ai.verisoul.sdk.helpers.emulator.EmulatorHelper;
import ai.verisoul.sdk.helpers.sensor.get_all.SensorsHelper;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0010\u001a\u00020\u0011R\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u001b\u0010\u000b\u001a\u00020\f8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u000f\u0010\b\u001a\u0004\b\r\u0010\u000e¨\u0006\u0012"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/EmulatorChecker;", "", "()V", "emulatorHelper", "Lai/verisoul/sdk/helpers/emulator/EmulatorHelper;", "getEmulatorHelper", "()Lai/verisoul/sdk/helpers/emulator/EmulatorHelper;", "emulatorHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "sensorsHelper", "Lai/verisoul/sdk/helpers/sensor/get_all/SensorsHelper;", "getSensorsHelper", "()Lai/verisoul/sdk/helpers/sensor/get_all/SensorsHelper;", "sensorsHelper$delegate", "collectEmulatorData", "Lai/verisoul/sdk/helpers/emulator/EmulatorDetectionData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nEmulatorChecker.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EmulatorChecker.kt\nai/verisoul/sdk/helpers/nativeDataCollection/EmulatorChecker\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,25:1\n67#2:26\n67#2:27\n*S KotlinDebug\n*F\n+ 1 EmulatorChecker.kt\nai/verisoul/sdk/helpers/nativeDataCollection/EmulatorChecker\n*L\n13#1:26\n15#1:27\n*E\n"})
/* loaded from: classes.dex */
public final class EmulatorChecker {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(EmulatorChecker.class, "emulatorHelper", "getEmulatorHelper()Lai/verisoul/sdk/helpers/emulator/EmulatorHelper;", 0)), Reflection.property1(new PropertyReference1Impl(EmulatorChecker.class, "sensorsHelper", "getSensorsHelper()Lai/verisoul/sdk/helpers/sensor/get_all/SensorsHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + EmulatorChecker.class.getSimpleName() + "]";

    /* renamed from: emulatorHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate emulatorHelper = new InjectDelegate(EmulatorHelper.class);

    /* renamed from: sensorsHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate sensorsHelper = new InjectDelegate(SensorsHelper.class);

    private final EmulatorHelper getEmulatorHelper() {
        return (EmulatorHelper) this.emulatorHelper.getValue(this, $$delegatedProperties[0]);
    }

    private final SensorsHelper getSensorsHelper() {
        return (SensorsHelper) this.sensorsHelper.getValue(this, $$delegatedProperties[1]);
    }

    @NotNull
    public final EmulatorDetectionData collectEmulatorData() {
        long currentTimeMillis = System.currentTimeMillis();
        EmulatorDetectionData emulatorDetectionData = new EmulatorDetectionData(getEmulatorHelper().isEmulator(), getSensorsHelper().getAllSensors());
        Logger.INSTANCE.metricLog(this.logTag, "emulator_duration", System.currentTimeMillis() - currentTimeMillis);
        return emulatorDetectionData;
    }
}
