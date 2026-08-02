package ru.ozon.app.android.travel.map.viewModel;

import android.location.Location;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;
import we0.m;

@Metadata(d1 = {"\u0000\u0016\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u000b\u0010\u0003\u001a\u00070\u0004¢\u0006\u0002\b\u0005H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;", "kotlin.jvm.PlatformType", "it", "Landroid/location/Location;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Landroid/location/Location;)Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HotelMapInfoViewModel$checkLocationSettings$1 extends AbstractC7737t implements Function1<Location, HotelMapInfoViewModel.Action.MoveToLocation> {
    public static final HotelMapInfoViewModel$checkLocationSettings$1 INSTANCE = new HotelMapInfoViewModel$checkLocationSettings$1();

    HotelMapInfoViewModel$checkLocationSettings$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final HotelMapInfoViewModel.Action.MoveToLocation invoke(Location it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return new HotelMapInfoViewModel.Action.MoveToLocation(new m(it.getLatitude(), it.getLongitude()));
    }
}
