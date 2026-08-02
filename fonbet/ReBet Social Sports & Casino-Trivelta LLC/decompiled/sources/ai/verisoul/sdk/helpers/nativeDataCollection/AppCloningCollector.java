package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.app_clone.AppCloningData;
import ai.verisoul.sdk.helpers.app_clone.AppCloningHelper;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/AppCloningCollector;", "", "()V", "appCloningHelper", "Lai/verisoul/sdk/helpers/app_clone/AppCloningHelper;", "getAppCloningHelper", "()Lai/verisoul/sdk/helpers/app_clone/AppCloningHelper;", "appCloningHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "collectAppCloningData", "Lai/verisoul/sdk/helpers/app_clone/AppCloningData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nAppCloningCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AppCloningCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/AppCloningCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,25:1\n67#2:26\n*S KotlinDebug\n*F\n+ 1 AppCloningCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/AppCloningCollector\n*L\n12#1:26\n*E\n"})
/* loaded from: classes.dex */
public final class AppCloningCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(AppCloningCollector.class, "appCloningHelper", "getAppCloningHelper()Lai/verisoul/sdk/helpers/app_clone/AppCloningHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + AppCloningCollector.class.getSimpleName() + "]";

    /* renamed from: appCloningHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate appCloningHelper = new InjectDelegate(AppCloningHelper.class);

    private final AppCloningHelper getAppCloningHelper() {
        return (AppCloningHelper) this.appCloningHelper.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final AppCloningData collectAppCloningData() {
        long currentTimeMillis = System.currentTimeMillis();
        AppCloningData collect = getAppCloningHelper().collect();
        Logger.INSTANCE.metricLog(this.logTag, "app_cloning_duration", System.currentTimeMillis() - currentTimeMillis);
        return collect;
    }
}
