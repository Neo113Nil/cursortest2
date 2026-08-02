package ru.ozon.app.android.storefront.core.atoms.views.openRangeFilter;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.CharsKt;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0016\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0010\u0010\u000b\u001a\u00020\u00052\u0006\u0010\f\u001a\u00020\tH\u0002¨\u0006\r"}, d2 = {"Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterFormatter;", "", "<init>", "()V", "extractFromNumber", "", "data", "Lru/ozon/app/android/storefront/core/atoms/views/openRangeFilter/OpenRangeFilterViewData;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "extractToNumber", "toNumber", "formattedNumber", "atoms_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class OpenRangeFilterFormatter {
    private final int toNumber(String formattedNumber) {
        int G11 = h.G(formattedNumber);
        float f7 = 0.0f;
        if (G11 >= 0) {
            int i11 = 0;
            while (true) {
                if (!Character.isDigit(formattedNumber.charAt(i11))) {
                    break;
                }
                f7 = (f7 * 10) + CharsKt.b(r3);
                if (i11 == G11) {
                    break;
                }
                i11++;
            }
        }
        return (int) f7;
    }

    public final int extractFromNumber(@NotNull OpenRangeFilterViewData data, @NotNull String value) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(value, "value");
        int number = toNumber(value);
        return number < data.getMinValue() ? data.getMinValue() : number > data.getToValue() ? data.getToValue() : number;
    }

    public final int extractToNumber(@NotNull OpenRangeFilterViewData data, @NotNull String value) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(value, "value");
        int number = toNumber(value);
        return number < data.getFromValue() ? data.getFromValue() : number;
    }
}
