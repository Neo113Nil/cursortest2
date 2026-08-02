package ru.ozon.app.android.geo.map.presentation.viewmapper;

import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;
import ru.ozon.app.android.mapcommon.map.model.CameraUpdateReasonModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressEditMapViewWrapper$setupMapController$1$2 extends C7735q implements InterfaceC6511n<CameraPositionModel, CameraUpdateReasonModel, Boolean, Unit> {
    AddressEditMapViewWrapper$setupMapController$1$2(Object obj) {
        super(3, obj, AddressEditMapViewWrapper.class, "onCameraPositionChanged", "onCameraPositionChanged(Lru/ozon/app/android/mapcommon/map/model/CameraPositionModel;Lru/ozon/app/android/mapcommon/map/model/CameraUpdateReasonModel;Z)V", 0);
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(CameraPositionModel cameraPositionModel, CameraUpdateReasonModel cameraUpdateReasonModel, Boolean bool) {
        invoke(cameraPositionModel, cameraUpdateReasonModel, bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(CameraPositionModel p02, CameraUpdateReasonModel p12, boolean z11) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        Intrinsics.checkNotNullParameter(p12, "p1");
        ((AddressEditMapViewWrapper) this.receiver).onCameraPositionChanged(p02, p12, z11);
    }
}
