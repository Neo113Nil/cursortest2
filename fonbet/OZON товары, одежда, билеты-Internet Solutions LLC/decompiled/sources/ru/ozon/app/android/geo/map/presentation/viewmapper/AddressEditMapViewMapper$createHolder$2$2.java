package ru.ozon.app.android.geo.map.presentation.viewmapper;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.geo.map.data.AddressEditMapDTO;
import ru.ozon.app.android.geo.map.data.GeoConfigData;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapViewModelImpl;
import ru.ozon.mapsdk.common.geoproxy.data.model.GeoProviderConfig;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class AddressEditMapViewMapper$createHolder$2$2 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AddressEditMapViewModelImpl $addressEditMapViewModel;
    final /* synthetic */ AddressEditMapVO $state;
    final /* synthetic */ AddressEditMapViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddressEditMapViewMapper$createHolder$2$2(AddressEditMapViewMapper addressEditMapViewMapper, AddressEditMapVO addressEditMapVO, AddressEditMapViewModelImpl addressEditMapViewModelImpl) {
        super(0);
        this.this$0 = addressEditMapViewMapper;
        this.$state = addressEditMapVO;
        this.$addressEditMapViewModel = addressEditMapViewModelImpl;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        AddressEditMapDTO.Selector.Type selectorType;
        AddressEditMapViewHolder addressEditMapViewHolder;
        selectorType = this.this$0.getSelectorType(this.$state);
        GeoProviderConfig geoProviderConfig = this.$addressEditMapViewModel.getGeoProviderConfig(selectorType);
        if (geoProviderConfig == null) {
            return;
        }
        String sessionId = this.$addressEditMapViewModel.getSessionId();
        addressEditMapViewHolder = this.this$0.addressEditMapViewHolder;
        if (addressEditMapViewHolder != null) {
            addressEditMapViewHolder.setConfigData(new GeoConfigData(geoProviderConfig, sessionId));
        }
    }
}
