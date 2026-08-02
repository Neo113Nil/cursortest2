package ru.ozon.app.android.travel.utils.utils;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\u001a\u0016\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"getPreCreateWidgetKey", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "version", "", "utils_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TravelPreCreateUtilsKt {
    @NotNull
    public static final String getPreCreateWidgetKey(@NotNull String name, long j11) {
        Intrinsics.checkNotNullParameter(name, "name");
        return name + "V" + j11;
    }
}
