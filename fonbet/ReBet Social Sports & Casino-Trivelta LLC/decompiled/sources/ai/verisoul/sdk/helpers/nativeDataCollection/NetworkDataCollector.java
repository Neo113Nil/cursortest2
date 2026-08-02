package ai.verisoul.sdk.helpers.nativeDataCollection;

import ai.verisoul.sdk.di.InjectDelegate;
import ai.verisoul.sdk.helpers.network.NetworkData;
import ai.verisoul.sdk.helpers.network.NetworkHelper;
import ai.verisoul.sdk.logger.Logger;
import kotlin.Metadata;
import kotlin.jvm.internal.PropertyReference1Impl;
import kotlin.jvm.internal.Reflection;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.reflect.KProperty;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u000b\u001a\u00020\fR\u001b\u0010\u0003\u001a\u00020\u00048BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0007\u0010\b\u001a\u0004\b\u0005\u0010\u0006R\u000e\u0010\t\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\r"}, d2 = {"Lai/verisoul/sdk/helpers/nativeDataCollection/NetworkDataCollector;", "", "()V", "connectivityHelper", "Lai/verisoul/sdk/helpers/network/NetworkHelper;", "getConnectivityHelper", "()Lai/verisoul/sdk/helpers/network/NetworkHelper;", "connectivityHelper$delegate", "Lai/verisoul/sdk/di/InjectDelegate;", "logTag", "", "collectNetworkData", "Lai/verisoul/sdk/helpers/network/NetworkData;", "sdk_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nNetworkDataCollector.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NetworkDataCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/NetworkDataCollector\n+ 2 Dependency.kt\nai/verisoul/sdk/di/DependencyKt\n*L\n1#1,22:1\n67#2:23\n*S KotlinDebug\n*F\n+ 1 NetworkDataCollector.kt\nai/verisoul/sdk/helpers/nativeDataCollection/NetworkDataCollector\n*L\n12#1:23\n*E\n"})
/* loaded from: classes.dex */
public final class NetworkDataCollector {
    static final /* synthetic */ KProperty<Object>[] $$delegatedProperties = {Reflection.property1(new PropertyReference1Impl(NetworkDataCollector.class, "connectivityHelper", "getConnectivityHelper()Lai/verisoul/sdk/helpers/network/NetworkHelper;", 0))};

    @NotNull
    private final String logTag = "Verisoul-[" + NetworkDataCollector.class.getSimpleName() + "]";

    /* renamed from: connectivityHelper$delegate, reason: from kotlin metadata */
    @NotNull
    private final InjectDelegate connectivityHelper = new InjectDelegate(NetworkHelper.class);

    private final NetworkHelper getConnectivityHelper() {
        return (NetworkHelper) this.connectivityHelper.getValue(this, $$delegatedProperties[0]);
    }

    @NotNull
    public final NetworkData collectNetworkData() {
        long currentTimeMillis = System.currentTimeMillis();
        NetworkData collect = getConnectivityHelper().collect();
        Logger.INSTANCE.metricLog(this.logTag, "network_duration", System.currentTimeMillis() - currentTimeMillis);
        return collect;
    }
}
