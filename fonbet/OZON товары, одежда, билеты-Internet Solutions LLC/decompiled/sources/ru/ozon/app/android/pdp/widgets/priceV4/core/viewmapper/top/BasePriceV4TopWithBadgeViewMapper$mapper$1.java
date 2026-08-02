package ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.top;

import android.graphics.Color;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DTO;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DtoWrapper$TopWithFinBadge;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceStarsBadgeVO;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$TopWithFinBadge;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$TopWithFinBadge;", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$TopWithFinBadge;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class BasePriceV4TopWithBadgeViewMapper$mapper$1 extends AbstractC7737t implements Function2<PriceV4DtoWrapper$TopWithFinBadge, d, List<? extends PriceV4VoWrapper.TopWithFinBadge>> {
    public static final BasePriceV4TopWithBadgeViewMapper$mapper$1 INSTANCE = new BasePriceV4TopWithBadgeViewMapper$mapper$1();

    BasePriceV4TopWithBadgeViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<PriceV4VoWrapper.TopWithFinBadge> invoke(PriceV4DtoWrapper$TopWithFinBadge dto, d widgetInfo) {
        PriceStarsBadgeVO priceStarsBadgeVO;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        PriceDTO price = dto.getPrice();
        AtomActionDTO priceAction = dto.getPriceAction();
        BadgeDTO topFinBadge = dto.getTopFinBadge();
        PriceV4DTO.StarsBadge topStarsBadge = dto.getTopStarsBadge();
        if (topStarsBadge != null) {
            String text = topStarsBadge.getText();
            String leftIcon = topStarsBadge.getLeftIcon();
            String rightIcon = topStarsBadge.getRightIcon();
            String backgroundColor = topStarsBadge.getBackgroundColor();
            List<String> textGradientColors = topStarsBadge.getTextGradientColors();
            ArrayList arrayList = new ArrayList(C7714v.z(textGradientColors, 10));
            Iterator<T> it = textGradientColors.iterator();
            while (it.hasNext()) {
                arrayList.add(Integer.valueOf(Color.parseColor((String) it.next())));
            }
            int[] T02 = C7714v.T0(arrayList);
            CommonControlSettings common = topStarsBadge.getCommon();
            Map<String, TokenizedTrackingInfo> starsTrackingInfo = topStarsBadge.getStarsTrackingInfo();
            priceStarsBadgeVO = new PriceStarsBadgeVO(text, leftIcon, rightIcon, backgroundColor, T02, common, starsTrackingInfo != null ? TrackingInfoMapperKt.mapToTokenizedEvent$default(starsTrackingInfo, Long.valueOf(widgetId), null, 2, null) : null);
        } else {
            priceStarsBadgeVO = null;
        }
        return C7714v.a0(new PriceV4VoWrapper.TopWithFinBadge(widgetId, price, priceAction, dto.getPriceIcon(), topFinBadge, priceStarsBadgeVO, dto.getOnboarding(), dto.getTrackingInfo()));
    }
}
