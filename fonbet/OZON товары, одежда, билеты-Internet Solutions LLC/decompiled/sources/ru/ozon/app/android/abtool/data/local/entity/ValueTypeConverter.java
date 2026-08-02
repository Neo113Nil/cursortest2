package ru.ozon.app.android.abtool.data.local.entity;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.data.model.ValueType;
import ru.ozon.app.android.abtool.utils.ValueTypeUtilsKt;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H\u0007J\u0010\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/abtool/data/local/entity/ValueTypeConverter;", "", "<init>", "()V", "from", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/app/android/abtool/data/model/ValueType;", "toValueType", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ValueTypeConverter {
    @NotNull
    public final String from(@NotNull ValueType value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return value.getValue();
    }

    @NotNull
    public final ValueType toValueType(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        return ValueTypeUtilsKt.getValueType(value);
    }
}
