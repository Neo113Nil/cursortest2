package ru.ozon.app.android.geo.map.presentation.viewmapper;

import WZ.t;
import com.google.android.gms.common.internal.ImagesContract;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.mapicons.MapIconProvider;
import ru.ozon.app.android.mapcommon.map.OzonMapController;
import ru.ozon.app.android.mapcommon.map.model.CameraPositionModel;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"", ImagesContract.URL, "LWZ/t;", "event", "Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;", "type", "", "invoke", "(Ljava/lang/String;LWZ/t;Lru/ozon/app/android/geo/map/data/AddressEditMapDTO$Selector$Type;)V", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes12.dex */
final class AddressEditMapViewWrapper$updateNavbar$1$1$1 extends AbstractC7737t implements InterfaceC6511n<String, t, AddressEditMapDTO.Selector.Type, Unit> {
    final /* synthetic */ AddressEditMapViewWrapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewWrapper$updateNavbar$1$1$1(AddressEditMapViewWrapper addressEditMapViewWrapper) {
        super(3);
        this.this$0 = addressEditMapViewWrapper;
    }

    @Override // fd.InterfaceC6511n
    public /* bridge */ /* synthetic */ Unit invoke(String str, t tVar, AddressEditMapDTO.Selector.Type type) {
        invoke2(str, tVar, type);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String url, t tVar, AddressEditMapDTO.Selector.Type type) {
        MapIconProvider mapIconProvider;
        AddressEditMapVO.ViewPort viewport;
        Intrinsics.checkNotNullParameter(url, "url");
        Intrinsics.checkNotNullParameter(type, "type");
        CameraPositionModel cameraPosition$default = OzonMapController.DefaultImpls.getCameraPosition$default(this.this$0.getMapController(), null, 1, null);
        if (cameraPosition$default != null) {
            float zoom = cameraPosition$default.getZoom();
            AddressEditMapViewWrapper addressEditMapViewWrapper = this.this$0;
            AddressEditMapViewListener mapListener = addressEditMapViewWrapper.getMapListener();
            if (mapListener != null) {
                viewport = addressEditMapViewWrapper.getViewport();
                mapListener.onSelectorPressed(url, zoom, viewport, tVar, type);
            }
        }
        this.this$0.removeOldMapObject();
        mapIconProvider = this.this$0.iconProvider;
        mapIconProvider.cancelUserLocationSwapRunnable();
    }
}
