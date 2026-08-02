package ru.ozon.app.android.geo.map.presentation.viewmodel;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapMapperKt;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModel;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;", "kotlin.jvm.PlatformType", "it", "Landroid/location/Location;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Landroid/location/Location;)Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapViewModel$Action$MoveToLocation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewModelImpl$checkLocationSettings$1 extends AbstractC7737t implements Function1<Location, AddressEditMapViewModel.Action.MoveToLocation> {
    public static final AddressEditMapViewModelImpl$checkLocationSettings$1 INSTANCE = new AddressEditMapViewModelImpl$checkLocationSettings$1();

    AddressEditMapViewModelImpl$checkLocationSettings$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final AddressEditMapViewModel.Action.MoveToLocation invoke(Location it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new AddressEditMapViewModel.Action.MoveToLocation(AddressEditMapMapperKt.toCoordinateModel(it), null, null, 6, null);
    }
}
