package ru.ozon.app.android.common.twocards.core;

import WZ.t;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.K;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.common.twocards.data.TwoCardsDTO;
import ru.ozon.app.android.common.twocards.presentation.CardVO;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.badge.Badge;
import ru.ozon.uni.atoms.data.price.PriceWithPoints;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a(\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\b\b\u0001\u0010\u0007\u001a\u00020\u0006H\u0002\u001a\f\u0010\b\u001a\u00020\t*\u00020\tH\u0002¨\u0006\n"}, d2 = {"toVo", "Lru/ozon/app/android/common/twocards/presentation/CardVO;", "Lru/ozon/app/android/common/twocards/data/TwoCardsDTO$CardDTO;", "id", "", "paddingStart", "", "paddingEnd", "dropPrice", "Lru/ozon/uni/atoms/data/price/PriceWithPoints;", "two-cards_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TwoCardsMapperKt {
    private static final PriceWithPoints dropPrice(PriceWithPoints priceWithPoints) {
        return PriceWithPoints.copy$default(priceWithPoints, null, null, null, null, null, 23, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final CardVO toVo(TwoCardsDTO.CardDTO cardDTO, long j11, int i11, int i12) {
        List<String> gradientColors = cardDTO.getGradientColors();
        if (gradientColors == null) {
            gradientColors = K.f71697a;
        }
        List<String> list = gradientColors;
        String title = cardDTO.getTitle();
        String tintColor = cardDTO.getTintColor();
        PriceWithPoints priceWithPoints = cardDTO.getPriceWithPoints();
        PriceWithPoints dropPrice = priceWithPoints != null ? dropPrice(priceWithPoints) : null;
        Badge badge = cardDTO.getBadge();
        Map<String, TokenizedTrackingInfo> trackingInfo = cardDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        TestInfo testInfo = cardDTO.getTestInfo();
        AtomActionDTO action = cardDTO.getAction();
        return new CardVO(j11, list, title, tintColor, dropPrice, badge, tokenizedEvent$default, testInfo, action != null ? AtomActionMapperKt.toAtomAction(action, cardDTO.getTrackingInfo()) : null, new CardVO.CardPaddingsModel(i11, i12));
    }
}
