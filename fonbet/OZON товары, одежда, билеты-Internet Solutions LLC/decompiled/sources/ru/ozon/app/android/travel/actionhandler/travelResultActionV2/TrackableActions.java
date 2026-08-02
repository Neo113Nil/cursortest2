package ru.ozon.app.android.travel.actionhandler.travelResultActionV2;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\"\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0011\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0086\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultActionV2/TrackableActions;", "", "<init>", "()V", "actionNames", "", "", "contains", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class TrackableActions {

    @NotNull
    private final Set<String> actionNames = e0.h("aviaCreateBooking");

    public final boolean contains(@NotNull String name) {
        Intrinsics.checkNotNullParameter(name, "name");
        return this.actionNames.contains(name);
    }
}
