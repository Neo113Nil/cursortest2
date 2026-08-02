package ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.core;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.atoms.data.badge.TimerBadge;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.PriceBlock;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.SellerMessage;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.data.WannaDiscountDecisionDTO;
import ru.ozon.app.android.marketing.widgets.wannaDiscountDecision.presentation.WannaDiscountDecisionVO;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00122*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0012B\t\b\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001b\u0010\u000b\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ*\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\n\u0010\u000f\u001a\u00060\u0003j\u0002`\u000eH\u0096\u0002¢\u0006\u0004\b\u0010\u0010\u0011¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/core/WannaDiscountDecisionMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/WannaDiscountDecisionDTO;", "Ll20/d;", "", "Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "id", "toVO", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/WannaDiscountDecisionDTO;J)Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/presentation/WannaDiscountDecisionVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/marketing/widgets/wannaDiscountDecision/data/WannaDiscountDecisionDTO;Ll20/d;)Ljava/util/List;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class WannaDiscountDecisionMapper implements Function2<WannaDiscountDecisionDTO, d, List<? extends WannaDiscountDecisionVO>> {
    private final WannaDiscountDecisionVO toVO(WannaDiscountDecisionDTO wannaDiscountDecisionDTO, long j11) {
        TextAtom title = wannaDiscountDecisionDTO.getTitle();
        TextAtom subtitle = wannaDiscountDecisionDTO.getSubtitle();
        ButtonV3Atom.SmallIconButton infoButton = wannaDiscountDecisionDTO.getInfoButton();
        SellerMessage sellerMessage = wannaDiscountDecisionDTO.getSellerMessage();
        PriceBlock price = wannaDiscountDecisionDTO.getPrice();
        WannaDiscountDecisionVO.TimerBlockVO timerBlockVO = wannaDiscountDecisionDTO.getTimer() != null ? new WannaDiscountDecisionVO.TimerBlockVO(TimerBadge.copy$default(wannaDiscountDecisionDTO.getTimer().getTimer(), null, null, null, null, new AtomActionDTO(AtomActionDTO.Behavior.COMPOSER_ACTION, null, "refresh_on_timer", null, 10, null), 15, null), wannaDiscountDecisionDTO.getTimer().getText()) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = wannaDiscountDecisionDTO.getTrackingInfo();
        return new WannaDiscountDecisionVO(j11, title, subtitle, infoButton, price, sellerMessage, timerBlockVO, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<WannaDiscountDecisionVO> invoke(@NotNull WannaDiscountDecisionDTO dto, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(toVO(dto, widgetInfo.d().hashCode()));
    }
}
