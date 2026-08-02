package ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.data;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.data.B2bFinanceInfoDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bFinanceInfo.presentation.B2bFinanceInfoVI;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\b\u001a\u0013\u0010\u0004\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u0004\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI;", "toVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardItemDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardItemVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardItemDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardItemVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardListSettingsDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/data/B2bFinanceInfoDTO$CardListSettingsDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bFinanceInfo/presentation/B2bFinanceInfoVI$CardListSettingsVI;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFinanceInfoMapperKt {
    @NotNull
    public static final B2bFinanceInfoVI toVI(@NotNull B2bFinanceInfoDTO b2bFinanceInfoDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(b2bFinanceInfoDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextDTO title = b2bFinanceInfoDTO.getTitle();
        List<B2bFinanceInfoDTO.CardItemDTO> cardList = b2bFinanceInfoDTO.getCardList();
        ArrayList arrayList = new ArrayList(C7714v.z(cardList, 10));
        Iterator<T> it = cardList.iterator();
        while (it.hasNext()) {
            arrayList.add(toVI((B2bFinanceInfoDTO.CardItemDTO) it.next()));
        }
        B2bFinanceInfoDTO.CardListSettingsDTO cardListSettings = b2bFinanceInfoDTO.getCardListSettings();
        B2bFinanceInfoVI.CardListSettingsVI vi2 = cardListSettings != null ? toVI(cardListSettings) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = b2bFinanceInfoDTO.getTrackingInfo();
        return new B2bFinanceInfoVI(hashCode, title, arrayList, vi2, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }

    private static final B2bFinanceInfoVI.CardItemVI toVI(B2bFinanceInfoDTO.CardItemDTO cardItemDTO) {
        TextDTO topText = cardItemDTO.getTopText();
        IconDTO topTextIcon = cardItemDTO.getTopTextIcon();
        TextDTO bottomText = cardItemDTO.getBottomText();
        CommonControlSettings common = cardItemDTO.getCommon();
        return new B2bFinanceInfoVI.CardItemVI(topText, topTextIcon, bottomText, common != null ? common.toAtomAction() : null);
    }

    private static final B2bFinanceInfoVI.CardListSettingsVI toVI(B2bFinanceInfoDTO.CardListSettingsDTO cardListSettingsDTO) {
        return new B2bFinanceInfoVI.CardListSettingsVI(cardListSettingsDTO.getGap(), cardListSettingsDTO.getVerticalPaddings(), cardListSettingsDTO.getHorizontalPaddings());
    }
}
