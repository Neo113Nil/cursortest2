package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.app_set_id.AppSetIdData;
import ai.verisoul.sdk.helpers.app_set_id.AppSetIdHelper;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u000b\u001a\u0004\u0018\u00010\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/AppSetIdCollector;", "", "()V", "appSetIdHelper", "Lai/verisoul/sdk/helpers/app_set_id/AppSetIdHelper;", "getAppSetIdHelper", "()Lai/verisoul/sdk/helpers/app_set_id/AppSetIdHelper;", "appSetIdHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "collectAppSetIdData", "Lai/verisoul/sdk/helpers/app_set_id/AppSetIdData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppSetIdCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppSetIdCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/AppSetIdCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,25:1\n67#2:26\n*S KotlinDebug\n*F\n+ 1 AppSetIdCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/AppSetIdCollector\n*L\n12#1:26\n*E\n"})
/* loaded from: classes.dex */
public final class AppSetIdCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AppSetIdCollector.class, "appSetIdHelper", "getAppSetIdHelper()Lai/verisoul/sdk/helpers/app_set_id/AppSetIdHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + AppSetIdCollector.class.getSimpleName() + "]";

    /* renamed from: appSetIdHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate appSetIdHelper = new InjectDelegate(AppSetIdHelper.class);

    private final AppSetIdHelper getAppSetIdHelper() {
        return (AppSetIdHelper) this.appSetIdHelper.getValue(this, $$delegatedProperties[0]);
    }

    @Nullable
    public final AppSetIdData collectAppSetIdData() {
        long currentTimeMillis = System.currentTimeMillis();
        AppSetIdData collect = getAppSetIdHelper().collect();
        Logger.INSTANCE.metricLog(this.logTag, "app_SetId_duration", System.currentTimeMillis() - currentTimeMillis);
        return collect;
    }
}
