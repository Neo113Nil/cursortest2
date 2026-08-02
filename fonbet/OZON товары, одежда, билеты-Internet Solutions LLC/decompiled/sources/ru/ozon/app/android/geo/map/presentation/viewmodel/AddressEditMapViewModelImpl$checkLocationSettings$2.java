package ru.ozon.app.android.geo.map.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;

@Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
/* synthetic */ class AddressEditMapViewModelImpl$checkLocationSettings$2 extends C7735q implements Function1<AddressEditMapViewModel.Action.MoveToLocation, Unit> {
    AddressEditMapViewModelImpl$checkLocationSettings$2(Object obj) {
        super(1, obj, AddressEditMapViewModelImpl.class, "moveToUserLocation", "moveToUserLocation(Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;)V", 0);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressEditMapViewModel.Action.MoveToLocation moveToLocation) {
        invoke2(moveToLocation);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressEditMapViewModel.Action.MoveToLocation p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        ((AddressEditMapViewModelImpl) this.receiver).moveToUserLocation(p02);
    }
}
