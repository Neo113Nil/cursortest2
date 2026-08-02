package ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data;

import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.data.HotelsBookTotalV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.hotelsBookTotal.v3.presentation.vo.HotelsBookTotalV3VO;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000l\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u00062\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00050\u0007B\u0007¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\n\u001a\u00020\u0005*\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\r\u001a\u00020\u0010*\u00020\u000fH\u0002¢\u0006\u0004\b\r\u0010\u0011J\u0013\u0010\r\u001a\u00020\u0013*\u00020\u0012H\u0002¢\u0006\u0004\b\r\u0010\u0014J\u0013\u0010\r\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\r\u0010\u0017J\u001d\u0010\r\u001a\u0004\u0018\u00010\u001b*\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\r\u0010\u001cJ*\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u001d\u001a\u00020\u00022\n\u0010\u001f\u001a\u00060\u0003j\u0002`\u001eH\u0096\u0002¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00052\u0006\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\"\u0010\u000bR\u0018\u0010#\u001a\u0004\u0018\u00010\u00198\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$R\u0018\u0010&\u001a\u0004\u0018\u00010%8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Lru/ozon/app/android/travel/utils/asyncWidget/AsyncWidgetStateMapper;", "<init>", "()V", "toVo", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;", "map", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$FinalPriceDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Final;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BasePriceDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Price$Base;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$BonusesDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$Bonuses;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;", "", "id", "Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO$StarsBonuses;J)Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/presentation/vo/HotelsBookTotalV3VO$StarsBonuses;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/hotelsBookTotal/v3/data/HotelsBookTotalV3DTO;Ll20/d;)Ljava/util/List;", "mapAsyncState", "widgetId", "Ljava/lang/Long;", "", "asyncData", "Ljava/lang/String;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class HotelsBookTotalV3Mapper implements Function2<HotelsBookTotalV3DTO, d, List<? extends HotelsBookTotalV3VO>>, AsyncWidgetStateMapper<HotelsBookTotalV3DTO, HotelsBookTotalV3VO> {
    private String asyncData;
    private Long widgetId;

    private final HotelsBookTotalV3VO.Price map(HotelsBookTotalV3DTO hotelsBookTotalV3DTO) {
        HotelsBookTotalV3VO.Price.Final map = map(hotelsBookTotalV3DTO.getFinalPrice());
        HotelsBookTotalV3DTO.BasePriceDTO basePrice = hotelsBookTotalV3DTO.getBasePrice();
        HotelsBookTotalV3VO.Price.Base map2 = basePrice != null ? map(basePrice) : null;
        CommonControlSettings common = hotelsBookTotalV3DTO.getCommon();
        return new HotelsBookTotalV3VO.Price(map, map2, common != null ? common.toAtomAction() : null);
    }

    private final HotelsBookTotalV3VO toVo(HotelsBookTotalV3DTO hotelsBookTotalV3DTO) {
        TextDTO textDTO;
        Long l11 = this.widgetId;
        long longValue = l11 != null ? l11.longValue() : hotelsBookTotalV3DTO.hashCode();
        HotelsBookTotalV3VO.Price map = map(hotelsBookTotalV3DTO);
        HotelsBookTotalV3DTO.BonusesDTO bonuses = hotelsBookTotalV3DTO.getBonuses();
        HotelsBookTotalV3VO.Bonuses map2 = bonuses != null ? map(bonuses) : null;
        ButtonV3DTO nextButton = hotelsBookTotalV3DTO.getNextButton();
        CommonControlSettings common = hotelsBookTotalV3DTO.getNextButton().getCommon();
        ButtonV3DTO copy$default = ButtonV3DTO.copy$default(nextButton, null, null, null, null, null, null, null, null, null, null, null, null, null, common != null ? CommonControlSettings.copy$default(common, null, null, null, 6, null) : null, null, null, null, 122879, null);
        CommonControlSettings common2 = hotelsBookTotalV3DTO.getNextButton().getCommon();
        AtomAction atomAction = common2 != null ? common2.toAtomAction() : null;
        TextDTO agreement = hotelsBookTotalV3DTO.getAgreement();
        if (agreement != null) {
            agreement.setTagSupported(true);
            Unit unit = Unit.f71690a;
            textDTO = agreement;
        } else {
            textDTO = null;
        }
        NotificationDTO notification = hotelsBookTotalV3DTO.getNotification();
        CommonControlSettings common3 = hotelsBookTotalV3DTO.getCommon();
        Map<String, TokenizedTrackingInfo> trackingInfo = common3 != null ? common3.getTrackingInfo() : null;
        String str = this.asyncData;
        HotelsBookTotalV3DTO.StarsBonuses starsBonuses = hotelsBookTotalV3DTO.getStarsBonuses();
        return new HotelsBookTotalV3VO(longValue, map, map2, copy$default, atomAction, textDTO, notification, trackingInfo, str, false, starsBonuses != null ? map(starsBonuses, longValue) : null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<HotelsBookTotalV3VO> invoke(@NotNull HotelsBookTotalV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        this.widgetId = Long.valueOf(widgetInfo.d().hashCode());
        this.asyncData = widgetInfo.c().a();
        return C7714v.a0(toVo(state));
    }

    @Override // ru.ozon.app.android.travel.utils.asyncWidget.AsyncWidgetStateMapper
    @NotNull
    public HotelsBookTotalV3VO mapAsyncState(@NotNull HotelsBookTotalV3DTO state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return toVo(state);
    }

    private final HotelsBookTotalV3VO.Price.Final map(HotelsBookTotalV3DTO.FinalPriceDTO finalPriceDTO) {
        return new HotelsBookTotalV3VO.Price.Final(finalPriceDTO.getName(), finalPriceDTO.getInfoIcon(), finalPriceDTO.getPrice());
    }

    private final HotelsBookTotalV3VO.Price.Base map(HotelsBookTotalV3DTO.BasePriceDTO basePriceDTO) {
        return new HotelsBookTotalV3VO.Price.Base(basePriceDTO.getName(), basePriceDTO.getPrice());
    }

    private final HotelsBookTotalV3VO.Bonuses map(HotelsBookTotalV3DTO.BonusesDTO bonusesDTO) {
        return new HotelsBookTotalV3VO.Bonuses(bonusesDTO.getName(), bonusesDTO.getAmount(), bonusesDTO.getIcon());
    }

    private final HotelsBookTotalV3VO.StarsBonuses map(HotelsBookTotalV3DTO.StarsBonuses starsBonuses, long j11) {
        return new HotelsBookTotalV3VO.StarsBonuses(starsBonuses.getName(), MapperExtKt.toVI(starsBonuses.getStarsBadge(), j11));
    }
}
