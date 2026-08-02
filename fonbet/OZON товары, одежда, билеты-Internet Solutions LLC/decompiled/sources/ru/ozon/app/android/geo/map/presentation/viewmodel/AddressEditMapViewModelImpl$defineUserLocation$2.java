package ru.ozon.app.android.geo.map.presentation.viewmodel;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.mapcommon.map.model.CoordinateModel;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "location", "Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/mapcommon/map/model/CoordinateModel;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewModelImpl$defineUserLocation$2 extends AbstractC7737t implements Function1<CoordinateModel, Unit> {
    final /* synthetic */ AddressEditMapVO $page;
    final /* synthetic */ AddressEditMapViewModelImpl this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewModelImpl$defineUserLocation$2(AddressEditMapViewModelImpl addressEditMapViewModelImpl, AddressEditMapVO addressEditMapVO) {
        super(1);
        this.this$0 = addressEditMapViewModelImpl;
        this.$page = addressEditMapVO;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CoordinateModel coordinateModel) {
        invoke2(coordinateModel);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CoordinateModel coordinateModel) {
        AddressEditMapViewModelImpl addressEditMapViewModelImpl = this.this$0;
        Intrinsics.f(coordinateModel);
        addressEditMapViewModelImpl.defineUserLocation(coordinateModel);
        this.this$0.showUserCurrentLocationPin(this.$page);
    }
}
