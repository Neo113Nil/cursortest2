package ru.ozon.app.android.geo.map.presentation.utils;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.views.LocationMarkerView;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isWithTooltip", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class LocationMarkerProvider$createUserLocationMarker$3 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ Function0<Unit> $onUserLocationAction;
    final /* synthetic */ AddressEditMapVO.LocationMarker $userLocationMarker;
    final /* synthetic */ LocationMarkerProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocationMarkerProvider$createUserLocationMarker$3(LocationMarkerProvider locationMarkerProvider, AddressEditMapVO.LocationMarker locationMarker, Function0<Unit> function0) {
        super(1);
        this.this$0 = locationMarkerProvider;
        this.$userLocationMarker = locationMarker;
        this.$onUserLocationAction = function0;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        LocationMarkerView userLocationMarkerView;
        Runnable runnable;
        Boolean bool;
        userLocationMarkerView = this.this$0.getUserLocationMarkerView();
        runnable = this.this$0.swapUserLocationMarkerRunnable;
        bool = this.this$0.showTooltip;
        if (bool != null) {
            z11 = bool.booleanValue();
        }
        this.this$0.addLocationMarker(this.$userLocationMarker, this.$onUserLocationAction, runnable, userLocationMarkerView, z11, this.$userLocationMarker.getZPriority());
    }
}
