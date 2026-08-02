package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapInfo.v4.presentation;

import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVO;
import ru.ozon.app.android.travel.feature.hotels.map.shared.presentation.DistrictsVOKt;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "isPolygonsEnable", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
final class HotelsMapInfoV4ViewModel$onClickPolygonPanel$1 extends AbstractC7737t implements Function1<Boolean, Unit> {
    final /* synthetic */ HotelsMapInfoV4ViewModel this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    HotelsMapInfoV4ViewModel$onClickPolygonPanel$1(HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel) {
        super(1);
        this.this$0 = hotelsMapInfoV4ViewModel;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool) {
        invoke(bool.booleanValue());
        return Unit.f71690a;
    }

    public final void invoke(boolean z11) {
        DistrictsVO districts;
        HotelsMapInfoV4ViewModel hotelsMapInfoV4ViewModel = this.this$0;
        HotelsMapInfoV4VO hotelsMapInfoV4VO = hotelsMapInfoV4ViewModel.vo;
        HotelsMapInfoV4VO hotelsMapInfoV4VO2 = null;
        r3 = null;
        DistrictsVO districtsVO = null;
        if (hotelsMapInfoV4VO != null) {
            HotelsMapInfoV4VO hotelsMapInfoV4VO3 = this.this$0.vo;
            if (hotelsMapInfoV4VO3 != null && (districts = hotelsMapInfoV4VO3.getDistricts()) != null) {
                districtsVO = DistrictsVOKt.setToggle(districts, z11);
            }
            hotelsMapInfoV4VO2 = HotelsMapInfoV4VO.copy$default(hotelsMapInfoV4VO, 0L, null, null, null, null, null, null, null, null, null, null, null, districtsVO, null, null, null, null, null, null, null, false, 2093055, null);
        }
        hotelsMapInfoV4ViewModel.vo = hotelsMapInfoV4VO2;
    }
}
