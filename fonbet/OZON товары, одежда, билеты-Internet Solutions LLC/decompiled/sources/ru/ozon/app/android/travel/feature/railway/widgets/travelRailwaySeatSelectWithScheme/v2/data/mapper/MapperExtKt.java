package ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.mapper;

import Kk.c;
import WZ.t;
import WZ.x;
import android.content.Context;
import android.graphics.Point;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.AdditionalServiceDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.AlternativePriceBlockDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.BonusDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.CarriageDetailsDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.PriceBlockDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.SelectedSeatDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.data.models.TariffDTO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AdditionalServiceVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.AlternativePriceBlockVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.BonusVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.CarriageDetailsVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.PriceBlockVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.SelectedSeatVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.footer.vo.TariffVO;
import ru.ozon.app.android.travel.feature.railway.widgets.travelRailwaySeatSelectWithScheme.v2.presentation.scheme.TravelRailwaySeatSelectWithSchemeVO;
import ru.ozon.app.android.travel.molecules.dto.shiftedPreviewIcons.ShiftedPreviewIconsDTO;
import ru.ozon.app.android.travel.molecules.view.shiftedPreviewIcons.ShiftedPreviewIconsVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.common.CommonAtomIconDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u001b\u0010\u0002\u001a\u00020\u0007*\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u0005H\u0000¢\u0006\u0004\b\u0002\u0010\b\u001a\u0013\u0010\u0002\u001a\u00020\n*\u00020\tH\u0000¢\u0006\u0004\b\u0002\u0010\u000b\u001a\u0013\u0010\u0002\u001a\u00020\r*\u00020\fH\u0000¢\u0006\u0004\b\u0002\u0010\u000e\u001a\u0013\u0010\u0002\u001a\u00020\u0010*\u00020\u000fH\u0000¢\u0006\u0004\b\u0002\u0010\u0011\u001a\u0013\u0010\u0002\u001a\u00020\u0013*\u00020\u0012H\u0000¢\u0006\u0004\b\u0002\u0010\u0014\u001a\u001d\u0010\u0002\u001a\u00020\u0018*\u00020\u00152\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016H\u0000¢\u0006\u0004\b\u0002\u0010\u0019\u001a\u001b\u0010\u001d\u001a\u0004\u0018\u00010\u001c*\b\u0012\u0004\u0012\u00020\u001b0\u001aH\u0000¢\u0006\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AdditionalServiceDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AdditionalServiceVO;", "toVO", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AdditionalServiceDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AdditionalServiceVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/BonusDTO;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/BonusVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/BonusDTO;Landroid/content/Context;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/BonusVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/SelectedSeatDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/SelectedSeatVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/SelectedSeatDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/SelectedSeatVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TariffDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TariffVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/TariffDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/TariffVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/PriceBlockDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/PriceBlockVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/PriceBlockDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/PriceBlockVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AlternativePriceBlockVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/AlternativePriceBlockDTO;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/AlternativePriceBlockVO;", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO;", "(Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/data/models/CarriageDetailsDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/footer/vo/CarriageDetailsVO;", "", "Lru/ozon/app/android/travel/feature/railway/widgets/travelRailwaySeatSelectWithScheme/v2/presentation/scheme/TravelRailwaySeatSelectWithSchemeVO$SeatVO;", "", "findScrollXPosition", "(Ljava/util/List;)Ljava/lang/Integer;", "railway_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MapperExtKt {
    public static final Integer findScrollXPosition(@NotNull List<TravelRailwaySeatSelectWithSchemeVO.SeatVO> list) {
        Intrinsics.checkNotNullParameter(list, "<this>");
        int i11 = Integer.MAX_VALUE;
        for (TravelRailwaySeatSelectWithSchemeVO.SeatVO seatVO : list) {
            if (seatVO.getIsSelected() && seatVO.getTooltip() != null) {
                Point position = seatVO.getPosition();
                if (position != null) {
                    return Integer.valueOf(position.x);
                }
                return null;
            }
            if (seatVO.getAction() != null && seatVO.getPosition() != null && seatVO.getPosition().x < i11) {
                i11 = seatVO.getPosition().x;
            }
        }
        return Integer.valueOf(i11);
    }

    @NotNull
    public static final AdditionalServiceVO toVO(@NotNull AdditionalServiceDTO additionalServiceDTO) {
        Intrinsics.checkNotNullParameter(additionalServiceDTO, "<this>");
        int hashCode = additionalServiceDTO.getTitle().getText().hashCode();
        TextAtom title = additionalServiceDTO.getTitle();
        TextAtom description = additionalServiceDTO.getDescription();
        TextAtom price = additionalServiceDTO.getPrice();
        Boolean isSelected = additionalServiceDTO.isSelected();
        boolean booleanValue = isSelected != null ? isSelected.booleanValue() : false;
        AtomActionDTO action = additionalServiceDTO.getAction();
        return new AdditionalServiceVO(hashCode, title, description, price, booleanValue, action != null ? AtomActionMapperKt.toAtomAction(action, null) : null);
    }

    @NotNull
    public static final BonusVO toVO(@NotNull BonusDTO bonusDTO, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(bonusDTO, "<this>");
        Intrinsics.checkNotNullParameter(context, "context");
        return new BonusVO(bonusDTO.getIcon().getImage().hashCode(), bonusDTO.getIcon(), StyleParser.INSTANCE.parseColor(context, bonusDTO.getIcon().getTintColor()), ru.ozon.app.android.travel.molecules.mapper.MapperExtKt.toVO(bonusDTO.getTitle()));
    }

    @NotNull
    public static final SelectedSeatVO toVO(@NotNull SelectedSeatDTO selectedSeatDTO) {
        Intrinsics.checkNotNullParameter(selectedSeatDTO, "<this>");
        OzonSpannableString text = selectedSeatDTO.getPassengerType().getText();
        TextAtom description = selectedSeatDTO.getDescription();
        OzonSpannableString text2 = description != null ? description.getText() : null;
        OzonSpannableString text3 = selectedSeatDTO.getPrice().getText();
        StringBuilder sb2 = new StringBuilder();
        sb2.append((Object) text);
        sb2.append((Object) text2);
        sb2.append((Object) text3);
        return new SelectedSeatVO(sb2.toString().hashCode(), selectedSeatDTO.getPassengerType(), selectedSeatDTO.getDescription(), selectedSeatDTO.getInfoButton(), selectedSeatDTO.getPrice());
    }

    @NotNull
    public static final TariffVO toVO(@NotNull TariffDTO tariffDTO) {
        Intrinsics.checkNotNullParameter(tariffDTO, "<this>");
        int hashCode = tariffDTO.getTitle().getText().hashCode();
        TextAtom title = tariffDTO.getTitle();
        TextAtom price = tariffDTO.getPrice();
        Boolean isSelected = tariffDTO.isSelected();
        return new TariffVO(hashCode, title, price, isSelected != null ? isSelected.booleanValue() : false, AtomActionMapperKt.toAtomAction(tariffDTO.getAction(), null));
    }

    @NotNull
    public static final PriceBlockVO toVO(@NotNull PriceBlockDTO priceBlockDTO) {
        Intrinsics.checkNotNullParameter(priceBlockDTO, "<this>");
        return new PriceBlockVO(priceBlockDTO.getTitle().getText().hashCode(), priceBlockDTO.getTitle(), priceBlockDTO.getDescription(), priceBlockDTO.getPrice());
    }

    @NotNull
    public static final AlternativePriceBlockVO toVO(@NotNull AlternativePriceBlockDTO alternativePriceBlockDTO) {
        Intrinsics.checkNotNullParameter(alternativePriceBlockDTO, "<this>");
        return new AlternativePriceBlockVO(alternativePriceBlockDTO.getTitle().getText().hashCode(), alternativePriceBlockDTO.getTitle(), alternativePriceBlockDTO.getMilesBadge(), alternativePriceBlockDTO.getPriceBadge(), alternativePriceBlockDTO.getPrice());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r5v1 */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.util.ArrayList] */
    @NotNull
    public static final CarriageDetailsVO toVO(@NotNull CarriageDetailsDTO carriageDetailsDTO, d dVar) {
        List list;
        Map<String, TokenizedTrackingInfo> trackingInfo;
        Intrinsics.checkNotNullParameter(carriageDetailsDTO, "<this>");
        int hashCode = String.valueOf(carriageDetailsDTO.getDetailsBadge().getText()).hashCode();
        List<IconDTO> servicesIcon = carriageDetailsDTO.getServicesIcon();
        t tVar = null;
        if (servicesIcon != null) {
            List<IconDTO> list2 = servicesIcon;
            list = new ArrayList(C7714v.z(list2, 10));
            int i11 = 0;
            for (Object obj : list2) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                IconDTO iconDTO = (IconDTO) obj;
                String backgroundImage = iconDTO.getBackgroundImage();
                CommonAtomIconDTO icon = iconDTO.getIcon();
                list.add(new CarriageDetailsVO.CarriageDetailsIconVO(c.a(backgroundImage, icon != null ? icon.getIcon() : null), iconDTO, C7714v.P(carriageDetailsDTO.getServicesIcon()) == i11 && carriageDetailsDTO.getEnableLastIconFade()));
                i11 = i12;
            }
        } else {
            list = K.f71697a;
        }
        List<IconDTO> servicesIcon2 = carriageDetailsDTO.getServicesIcon();
        boolean z11 = !(servicesIcon2 == null || servicesIcon2.isEmpty());
        ShiftedPreviewIconsDTO shiftedPreviewIcons = carriageDetailsDTO.getShiftedPreviewIcons();
        ShiftedPreviewIconsVO vo = shiftedPreviewIcons != null ? ru.ozon.app.android.travel.molecules.mapper.MapperExtKt.toVO(shiftedPreviewIcons) : null;
        BadgeDTO detailsBadge = carriageDetailsDTO.getDetailsBadge();
        AtomAction atomAction = carriageDetailsDTO.getCommon().toAtomAction();
        if (dVar != null && (trackingInfo = carriageDetailsDTO.getCommon().getTrackingInfo()) != null) {
            tVar = x.d(trackingInfo, dVar);
        }
        return new CarriageDetailsVO(hashCode, list, z11, vo, detailsBadge, atomAction, tVar);
    }
}
