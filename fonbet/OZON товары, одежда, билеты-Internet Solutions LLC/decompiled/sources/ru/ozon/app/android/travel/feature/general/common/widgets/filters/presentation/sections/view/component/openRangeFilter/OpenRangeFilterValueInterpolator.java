package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import hd.C6915b;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u001e\u0010\n\u001a\u00020\t2\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\fJ\u0018\u0010\r\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0002J\u0018\u0010\u000e\u001a\u00020\t2\u0006\u0010\b\u001a\u00020\u00052\u0006\u0010\u000f\u001a\u00020\tH\u0002¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterValueInterpolator;", "", "<init>", "()V", "calculateSeekbarValue", "", "data", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "calculateInputValue", "calculateBySeekbar", "", "getPercent", "roundToNearestStep", "step", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenRangeFilterValueInterpolator {
    private final float getPercent(OpenRangeFilterVO data, int value) {
        return (value - data.getMinValue()) / (data.getMaxValue() - data.getMinValue());
    }

    private final int roundToNearestStep(float value, int step) {
        return C6915b.c(value / step) * step;
    }

    public final int calculateInputValue(@NotNull OpenRangeFilterVO data, float value, boolean calculateBySeekbar) {
        Intrinsics.checkNotNullParameter(data, "data");
        float minValue = data.getMinValue() + ((data.getMaxValue() - data.getMinValue()) * ((float) Math.pow(value, data.getStepPower())));
        return (data.getStep() <= 0 || !calculateBySeekbar) ? C6915b.c(minValue) : roundToNearestStep(minValue, data.getStep());
    }

    public final float calculateSeekbarValue(@NotNull OpenRangeFilterVO data, int value) {
        Intrinsics.checkNotNullParameter(data, "data");
        return (float) Math.pow(getPercent(data, value), 1.0f / data.getStepPower());
    }
}
