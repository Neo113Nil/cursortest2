package com.braze.location;

import V9.InterfaceC1750f;
import com.braze.models.BrazeGeofence;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u001a\u0011\u0010\u0002\u001a\u00020\u0001*\u00020\u0000¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/braze/models/BrazeGeofence;", "LV9/f;", "toGeofence", "(Lcom/braze/models/BrazeGeofence;)LV9/f;", "android-sdk-location_release"}, k = 2, mv = {2, 2, 0}, xi = 48)
/* loaded from: classes.dex */
public abstract class GooglePlayLocationUtilsKt {
    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public static final InterfaceC1750f toGeofence(@NotNull BrazeGeofence brazeGeofence) {
        Intrinsics.checkNotNullParameter(brazeGeofence, "<this>");
        InterfaceC1750f.a aVar = new InterfaceC1750f.a();
        aVar.f(brazeGeofence.getId()).b(brazeGeofence.getLatitude(), brazeGeofence.getLongitude(), brazeGeofence.getRadiusMeter()).e(brazeGeofence.getNotificationResponsivenessMs()).c(-1L);
        boolean enterEvents = brazeGeofence.getEnterEvents();
        int i10 = enterEvents;
        if (brazeGeofence.getExitEvents()) {
            i10 = (enterEvents ? 1 : 0) | 2;
        }
        aVar.g(i10);
        InterfaceC1750f a10 = aVar.a();
        Intrinsics.checkNotNullExpressionValue(a10, "build(...)");
        return a10;
    }
}
