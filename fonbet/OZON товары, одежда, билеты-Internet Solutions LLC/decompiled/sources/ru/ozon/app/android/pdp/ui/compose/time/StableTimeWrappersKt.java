package ru.ozon.app.android.pdp.ui.compose.time;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import org.joda.time.Period;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002\u001a\n\u0010\u0000\u001a\u00020\u0003*\u00020\u0004¨\u0006\u0005"}, d2 = {"stable", "Lru/ozon/app/android/pdp/ui/compose/time/StableDateTime;", "Lorg/joda/time/DateTime;", "Lru/ozon/app/android/pdp/ui/compose/time/StablePeriod;", "Lorg/joda/time/Period;", "compose-time_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class StableTimeWrappersKt {
    @NotNull
    public static final StableDateTime stable(@NotNull DateTime dateTime) {
        Intrinsics.checkNotNullParameter(dateTime, "<this>");
        return new StableDateTime(dateTime);
    }

    @NotNull
    public static final StablePeriod stable(@NotNull Period period) {
        Intrinsics.checkNotNullParameter(period, "<this>");
        return new StablePeriod(period);
    }
}
