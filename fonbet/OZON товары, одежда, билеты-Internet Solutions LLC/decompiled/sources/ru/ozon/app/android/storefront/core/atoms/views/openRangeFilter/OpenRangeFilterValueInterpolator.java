package ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u0005J\u0018\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002¨\u0006\f"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterValueInterpolator;", "", "<init>", "()V", "calculateSeekbarValue", "", "data", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "calculateInputValue", "getPercent", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenRangeFilterValueInterpolator {
    private final float getPercent(OpenRangeFilterViewData data, int value) {
        return (value - data.getMinValue()) / (data.getMaxValue() - data.getMinValue());
    }

    public final int calculateInputValue(@NotNull OpenRangeFilterViewData data, float value) {
        Intrinsics.checkNotNullParameter(data, "data");
        return C6915b.c(data.getMinValue() + ((data.getMaxValue() - data.getMinValue()) * ((float) Math.pow(value, data.getStepPower()))));
    }

    public final float calculateSeekbarValue(@NotNull OpenRangeFilterViewData data, int value) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (float) Math.pow(getPercent(data, value), 1.0f / data.getStepPower());
    }
}
