package ru.ozon.app.android.marketing.widgets.shopButtons.presentation;

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
import ru.ozon.app.android.marketing.widgets.shopButtons.data.ShopButtonsDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lru/ozon/app/android/marketing/widgets/shopButtons/data/ShopButtonsDTO;", "dto", "Ll20/d;", "info", "", "Lru/ozon/app/android/marketing/widgets/shopButtons/presentation/ShopButtonsVO;", "invoke", "(Lru/ozon/app/android/marketing/widgets/shopButtons/data/ShopButtonsDTO;Ll20/d;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {2, 0, 0})
/* loaded from: classes6.dex */
final class ShopButtonsViewMapper$mapper$1 extends AbstractC7737t implements Function2<ShopButtonsDTO, d, List<? extends ShopButtonsVO>> {
    public static final ShopButtonsViewMapper$mapper$1 INSTANCE = new ShopButtonsViewMapper$mapper$1();

    ShopButtonsViewMapper$mapper$1() {
        super(2);
    }

    @Override // kotlin.jvm.functions.Function2
    public final List<ShopButtonsVO> invoke(ShopButtonsDTO dto, d info) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(info, "info");
        long hashCode = info.d().hashCode();
        ButtonV3DTO mainButton = dto.getMainButton();
        IconButtonV3DTO rightButtonFirst = dto.getRightButtonFirst();
        IconButtonV3DTO rightButtonSecond = dto.getRightButtonSecond();
        String backgroundColor = dto.getBackgroundColor();
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return C7714v.a0(new ShopButtonsVO(hashCode, mainButton, rightButtonFirst, rightButtonSecond, backgroundColor, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
    }
}
