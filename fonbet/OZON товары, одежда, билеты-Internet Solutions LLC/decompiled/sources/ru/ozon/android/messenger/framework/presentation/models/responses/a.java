package ru.ozon.android.messenger.framework.presentation.models.responses;

import T7.P;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

/* loaded from: classes10.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    private final Map<String, MessengerTrackingInfo> f91459a;

    public a(Map<String, MessengerTrackingInfo> map) {
        this.f91459a = map;
    }

    public final Map<String, MessengerTrackingInfo> a() {
        return this.f91459a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && Intrinsics.d(this.f91459a, ((a) obj).f91459a);
    }

    public final int hashCode() {
        Map<String, MessengerTrackingInfo> map = this.f91459a;
        if (map == null) {
            return 0;
        }
        return map.hashCode();
    }

    @NotNull
    public final String toString() {
        return P.f(new StringBuilder("ChatEnterResponseVO(trackingInfo="), this.f91459a, ")");
    }
}
