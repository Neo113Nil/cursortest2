package ru.ozon.app.android.error.summary.presentation.shared;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0001\u0018\u00002\u00020\u0001B;\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0003\u0012\n\b\u0001\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0007\u001a\u00020\u0003¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/error/summary/presentation/shared/ErrorSummaryFeatureFlagSharedDTO;", "", "serviceName", "", AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.VALUE, "localValue", "updateStrategy", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getServiceName", "()Ljava/lang/String;", "getName", "getValue", "getLocalValue", "getUpdateStrategy", "error-summary_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ErrorSummaryFeatureFlagSharedDTO {
    private final String localValue;

    @NotNull
    private final String name;

    @NotNull
    private final String serviceName;

    @NotNull
    private final String updateStrategy;

    @NotNull
    private final String value;

    public ErrorSummaryFeatureFlagSharedDTO(@i(name = "service_name") @NotNull String serviceName, @i(name = "name") @NotNull String name, @i(name = "value") @NotNull String value, @i(name = "local_value") String str, @i(name = "update_strategy") @NotNull String updateStrategy) {
        Intrinsics.checkNotNullParameter(serviceName, "serviceName");
        Intrinsics.checkNotNullParameter(name, "name");
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(updateStrategy, "updateStrategy");
        this.serviceName = serviceName;
        this.name = name;
        this.value = value;
        this.localValue = str;
        this.updateStrategy = updateStrategy;
    }

    public final String getLocalValue() {
        return this.localValue;
    }

    @NotNull
    public final String getName() {
        return this.name;
    }

    @NotNull
    public final String getServiceName() {
        return this.serviceName;
    }

    @NotNull
    public final String getUpdateStrategy() {
        return this.updateStrategy;
    }

    @NotNull
    public final String getValue() {
        return this.value;
    }
}
