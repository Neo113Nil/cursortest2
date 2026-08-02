package ru.ozon.app.android.geo.map.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "bannerInfo", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$MapIcon$BannerIcon;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$bannerContainer$1 extends AbstractC7737t implements Function1<AddressEditMapVO.MapIcon.BannerIcon, Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$bannerContainer$1(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(1);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(AddressEditMapVO.MapIcon.BannerIcon bannerIcon) {
        invoke2(bannerIcon);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(AddressEditMapVO.MapIcon.BannerIcon bannerInfo) {
        AddressEditMapVO.ViewPort viewport;
        Intrinsics.checkNotNullParameter(bannerInfo, "bannerInfo");
        CameraPositionModel cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(this.this$0.getMapController(), null, 1, null);
        Float valueOf = cameraPosition$default != null ? Float.valueOf(cameraPosition$default.getZoom()) : null;
        AddressEditMapViewListener mapListener = this.this$0.getMapListener();
        if (mapListener != null) {
            String pinLink = bannerInfo.getPinLink();
            viewport = this.this$0.getViewport();
            mapListener.selectPinFromBannerAction(pinLink, valueOf, viewport, bannerInfo.getEvent());
        }
    }
}
