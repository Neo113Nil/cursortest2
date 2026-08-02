package ru.ozon.app.android.travel.map.viewModel;

import androidx.lifecycle.V;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.map.viewModel.HotelMapInfoViewModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "it", "Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/travel/map/viewModel/HotelMapInfoViewModel$Action$MoveToLocation;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class HotelMapInfoViewModel$checkLocationSettings$2 extends AbstractC7737t implements Function1<HotelMapInfoViewModel.Action.MoveToLocation, Unit> {
    final /* synthetic */ HotelMapInfoViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelMapInfoViewModel$checkLocationSettings$2(HotelMapInfoViewModel hotelMapInfoViewModel) {
        super(1);
        this.this$0 = hotelMapInfoViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(HotelMapInfoViewModel.Action.MoveToLocation moveToLocation) {
        invoke2(moveToLocation);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(HotelMapInfoViewModel.Action.MoveToLocation moveToLocation) {
        V v11;
        v11 = this.this$0.action;
        v11.postValue(moveToLocation);
    }
}
