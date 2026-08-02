package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.settings.SettingsData;
import ai.verisoul.sdk.helpers.settings.SettingsHelper;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/SettingsCollector;", "", "()V", "deviceSettingsHelper", "Lai/verisoul/sdk/helpers/settings/SettingsHelper;", "getDeviceSettingsHelper", "()Lai/verisoul/sdk/helpers/settings/SettingsHelper;", "deviceSettingsHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "collectSettingsData", "Lai/verisoul/sdk/helpers/settings/SettingsData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSettingsCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SettingsCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/SettingsCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,21:1\n67#2:22\n*S KotlinDebug\n*F\n+ 1 SettingsCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/SettingsCollector\n*L\n12#1:22\n*E\n"})
/* loaded from: classes.dex */
public final class SettingsCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(SettingsCollector.class, "deviceSettingsHelper", "getDeviceSettingsHelper()Lai/verisoul/sdk/helpers/settings/SettingsHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + SettingsCollector.class.getSimpleName() + "]";

    /* renamed from: deviceSettingsHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate deviceSettingsHelper = new InjectDelegate(SettingsHelper.class);

    private final SettingsHelper getDeviceSettingsHelper() {
        return (SettingsHelper) this.deviceSettingsHelper.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final SettingsData collectSettingsData() {
        long currentTimeMillis = System.currentTimeMillis();
        SettingsData collect = getDeviceSettingsHelper().collect();
        Logger.INSTANCE.metricLog(this.logTag, "settings_duration", System.currentTimeMillis() - currentTimeMillis);
        return collect;
    }
}
