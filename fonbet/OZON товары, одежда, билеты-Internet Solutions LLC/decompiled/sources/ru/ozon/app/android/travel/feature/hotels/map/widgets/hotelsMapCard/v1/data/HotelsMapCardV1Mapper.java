package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.data;

import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.presentation.HotelsMapCardV1VO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ*\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\t\u001a\u00020\u00022\n\u0010\u000b\u001a\u00060\u0003j\u0002`\nH\u0096\u0002¢\u0006\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/presentation/HotelsMapCardV1VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;Ll20/d;)Ljava/util/List;", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapCardV1Mapper implements Function2<HotelsMapCardV1DTO, d, List<? extends HotelsMapCardV1VO>> {
    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsMapCardV1VO> invoke(@NotNull HotelsMapCardV1DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new HotelsMapCardV1VO(widgetInfo.d().hashCode(), state.getIcon(), state.getName(), state.getAddress(), state.getPrice(), state.getPriceDescription(), state.getActionButton()));
    }
}
