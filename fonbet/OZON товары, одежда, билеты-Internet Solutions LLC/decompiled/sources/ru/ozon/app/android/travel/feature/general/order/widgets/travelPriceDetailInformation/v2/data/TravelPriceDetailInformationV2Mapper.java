package ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.data.TravelPriceDetailInformationV2DTO;
import ru.ozon.app.android.travel.feature.general.order.widgets.travelPriceDetailInformation.v2.presentation.TravelPriceDetailInformationV2VO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001d\u0010\u000f\u001a\u00020\u000e*\u00020\u000b2\b\b\u0002\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u000f\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u000f\u0010\u0013J*\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0016\u001a\u00060\u0003j\u0002`\u0015H\u0096\u0002¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;", "", "index", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$PriceRowDTO;I)Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$PriceRowVO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;", "Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO$BonusPriceRowDTO;)Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/presentation/TravelPriceDetailInformationV2VO$BonusPriceRowVO;", "dto", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/order/widgets/travelPriceDetailInformation/v2/data/TravelPriceDetailInformationV2DTO;Ll20/d;)Ljava/util/List;", "Landroid/content/Context;", "order_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPriceDetailInformationV2Mapper implements Function2<TravelPriceDetailInformationV2DTO, d, List<? extends TravelPriceDetailInformationV2VO>> {

    @NotNull
    private final Context context;

    public TravelPriceDetailInformationV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
    }

    private final TravelPriceDetailInformationV2VO.PriceRowVO toVO(TravelPriceDetailInformationV2DTO.PriceRowDTO priceRowDTO, int i11) {
        AtomActionDTO action;
        TextAtom title = priceRowDTO.getTitle();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(i11);
        sb2.append(title);
        int hashCode = sb2.toString().hashCode();
        TextAtom title2 = priceRowDTO.getTitle();
        TextAtom rightText = priceRowDTO.getRightText();
        ButtonV3Atom.SmallIconButton smallIconButton = priceRowDTO.getSmallIconButton();
        ButtonV3Atom.SmallBorderlessButton button = priceRowDTO.getButton();
        int px = UiExtKt.toPx(priceRowDTO.getSmallIconGap(), this.context);
        CommonControlSettings common = priceRowDTO.getCommon();
        return new TravelPriceDetailInformationV2VO.PriceRowVO(hashCode, title2, rightText, smallIconButton, button, px, (common == null || (action = common.getAction()) == null) ? null : AtomActionMapperKt.toAtomAction(action, priceRowDTO.getCommon().getTrackingInfo()), priceRowDTO.getMilesIcon());
    }

    static /* synthetic */ TravelPriceDetailInformationV2VO.PriceRowVO toVO$default(TravelPriceDetailInformationV2Mapper travelPriceDetailInformationV2Mapper, TravelPriceDetailInformationV2DTO.PriceRowDTO priceRowDTO, int i11, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = 0;
        }
        return travelPriceDetailInformationV2Mapper.toVO(priceRowDTO, i11);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPriceDetailInformationV2VO> invoke(@NotNull TravelPriceDetailInformationV2DTO dto, @NotNull d widgetInfo) {
        ButtonV3Atom paymentButton;
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        TextAtom title = dto.getTitle();
        TextAtom subtitle = dto.getSubtitle();
        List<TravelPriceDetailInformationV2DTO.PriceRowDTO> priceRows = dto.getPriceRows();
        ArrayList arrayList = new ArrayList(C7714v.z(priceRows, 10));
        Iterator<T> it = priceRows.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                TravelPriceDetailInformationV2VO.PriceRowVO vO$default = toVO$default(this, dto.getTotal(), 0, 1, null);
                TravelPriceDetailInformationV2DTO.PriceRowDTO rowUnderTotal = dto.getRowUnderTotal();
                TravelPriceDetailInformationV2VO.PriceRowVO vO$default2 = rowUnderTotal != null ? toVO$default(this, rowUnderTotal, 0, 1, null) : null;
                if (dto.getShouldHideMainButton()) {
                    paymentButton = null;
                } else {
                    paymentButton = dto.getPaymentButton();
                    if (paymentButton == null) {
                        paymentButton = dto.getLargeButton();
                    }
                }
                TravelPriceDetailInformationV2DTO.BonusPriceRowDTO bonusTotal = dto.getBonusTotal();
                TravelPriceDetailInformationV2VO.BonusPriceRowVO vo = bonusTotal != null ? toVO(bonusTotal) : null;
                boolean z11 = dto.getBonusTotal() != null;
                TravelPriceDetailInformationV2VO.BonusPriceRowVO bonusPriceRowVO = vo;
                TextAtom agreement = dto.getAgreement();
                boolean shouldHideMainButton = dto.getShouldHideMainButton();
                Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
                return C7714v.a0(new TravelPriceDetailInformationV2VO(hashCode, title, subtitle, arrayList, vO$default, vO$default2, paymentButton, bonusPriceRowVO, z11, agreement, shouldHideMainButton, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null));
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((TravelPriceDetailInformationV2DTO.PriceRowDTO) next, i11));
            i11 = i12;
        }
    }

    private final TravelPriceDetailInformationV2VO.BonusPriceRowVO toVO(TravelPriceDetailInformationV2DTO.BonusPriceRowDTO bonusPriceRowDTO) {
        return new TravelPriceDetailInformationV2VO.BonusPriceRowVO(bonusPriceRowDTO.getTitle(), bonusPriceRowDTO.getBonusPrice(), StyleParser.INSTANCE.parseColor(this.context, bonusPriceRowDTO.getBonusPriceBackgroundColor()), bonusPriceRowDTO.getPrice(), bonusPriceRowDTO.getBonusDetailsIconButton(), bonusPriceRowDTO.getBonusDetailsTitle(), bonusPriceRowDTO.getPriceDetailsIconButton(), bonusPriceRowDTO.getPriceDetailsTitle());
    }
}
