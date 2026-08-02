package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.data;

import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0002\b\u0003\"\u001a\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"", "", "ACTION_PARAMS_VALUES_TOGGLE", "Ljava/util/Set;", "booking_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class AdditionalServicesMapperKt {

    @NotNull
    private static final Set<String> ACTION_PARAMS_VALUES_TOGGLE;

    static {
        String[] elements = {"early_check_in", "late_check_out"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        ACTION_PARAMS_VALUES_TOGGLE = C7705l.j0(elements);
    }
}
