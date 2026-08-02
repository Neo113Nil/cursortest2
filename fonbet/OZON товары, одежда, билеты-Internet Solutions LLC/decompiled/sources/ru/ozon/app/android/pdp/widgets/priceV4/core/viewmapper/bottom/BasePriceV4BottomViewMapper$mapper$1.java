package ru.ozon.app.android.pdp.widgets.priceV4.core.viewmapper.bottom;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import ru.ozon.app.android.partnerBanks.data.PartnerBanksDTO;
import ru.ozon.app.android.partnerBanks.presentation.PartnerBanksVOKt;
import ru.ozon.app.android.pdp.utils.MapperExtKt;
import ru.ozon.app.android.pdp.widgets.priceV4.data.PriceV4DtoWrapper$Bottom;
import ru.ozon.app.android.pdp.widgets.priceV4.presentation.vo.PriceV4VoWrapper;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.price.PriceDTO;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u0001\u001a\u00020\u00002\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$Bottom;", "dto", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "", "Lru/ozon/app/android/pdp/widgets/priceV4/presentation/vo/PriceV4VoWrapper$Bottom;", "invoke", "(Lru/ozon/app/android/pdp/widgets/priceV4/data/PriceV4DtoWrapper$Bottom;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes7.dex */
final class BasePriceV4BottomViewMapper$mapper$1 extends AbstractC7737t implements Function2<PriceV4DtoWrapper$Bottom, d, List<? extends PriceV4VoWrapper.Bottom>> {
    final /* synthetic */ BasePriceV4BottomViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    BasePriceV4BottomViewMapper$mapper$1(BasePriceV4BottomViewMapper basePriceV4BottomViewMapper) {
        super(2);
        this.this$0 = basePriceV4BottomViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<PriceV4VoWrapper.Bottom> invoke(PriceV4DtoWrapper$Bottom dto, d widgetInfo) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long widgetId = MapperExtKt.widgetId(widgetInfo);
        PriceDTO price = dto.getPrice();
        BadgeDTO moreAboutPrice = dto.getMoreAboutPrice();
        BadgeDTO ozonCardBadge = dto.getOzonCardBadge();
        BadgeDTO bottomFinBadge = dto.getBottomFinBadge();
        PartnerBanksDTO partnerBanks = dto.getPartnerBanks();
        return C7714v.a0(new PriceV4VoWrapper.Bottom(widgetId, price, dto.getPriceAction(), moreAboutPrice, ozonCardBadge, bottomFinBadge, partnerBanks != null ? PartnerBanksVOKt.toVO$default(partnerBanks, widgetId, null, 2, null) : null, dto.getTrackingInfo(), dto.getOnboarding(), 0, this.this$0.getViewConfiguration(), UserVerificationMethods.USER_VERIFY_NONE, null));
    }
}
