package ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.data;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.oldwidgets.widgets.travelPriceDetailInformation.v1.presentation.sticky.TravelPriceDetailInformationStickyVO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u0004\u0018\u00010\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ*\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0010\u001a\u00060\u0003j\u0002`\u000fH\u0096\u0002¢\u0006\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationStickyMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/presentation/sticky/TravelPriceDetailInformationStickyVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/oldwidgets/widgets/travelPriceDetailInformation/v1/data/TravelPriceDetailInformationDTO;Ll20/d;)Ljava/util/List;", "old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationStickyMapper implements Function2<TravelPriceDetailInformationDTO, d, List<? extends TravelPriceDetailInformationStickyVO>> {
    private final TravelPriceDetailInformationStickyVO mapToVO(TravelPriceDetailInformationDTO dto, String stateId) {
        ButtonV3Atom.SmallButton smallStickyButton = dto.getSmallStickyButton();
        if (smallStickyButton != null) {
            return new TravelPriceDetailInformationStickyVO(a.a("sticky_", stateId), dto.getTotalPrice().getTotalPrice(), dto.getPrices().getSubtitle(), smallStickyButton);
        }
        return null;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPriceDetailInformationStickyVO> invoke(@NotNull TravelPriceDetailInformationDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        TravelPriceDetailInformationStickyVO mapToVO = mapToVO(state, widgetInfo.d());
        List<TravelPriceDetailInformationStickyVO> a02 = mapToVO != null ? C7714v.a0(mapToVO) : null;
        return a02 == null ? K.f71697a : a02;
    }
}
