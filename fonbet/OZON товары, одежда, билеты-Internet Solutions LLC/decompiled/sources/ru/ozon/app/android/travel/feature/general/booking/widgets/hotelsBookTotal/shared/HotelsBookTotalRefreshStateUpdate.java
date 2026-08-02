package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.shared;

import A00.a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002¢\u0006\u0004\b\u0006\u0010\u0007R#\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/shared/HotelsBookTotalRefreshStateUpdate;", "LA00/a$J$a;", "", "", "", "params", "<init>", "(Ljava/util/Map;)V", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class HotelsBookTotalRefreshStateUpdate implements a.J.InterfaceC0007a {

    @NotNull
    private final Map<String, Object> params;

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsBookTotalRefreshStateUpdate() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @NotNull
    public final Map<String, Object> getParams() {
        return this.params;
    }

    public HotelsBookTotalRefreshStateUpdate(@NotNull Map<String, ? extends Object> params) {
        Intrinsics.checkNotNullParameter(params, "params");
        this.params = params;
    }

    public /* synthetic */ HotelsBookTotalRefreshStateUpdate(Map map, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? U.c() : map);
    }
}
