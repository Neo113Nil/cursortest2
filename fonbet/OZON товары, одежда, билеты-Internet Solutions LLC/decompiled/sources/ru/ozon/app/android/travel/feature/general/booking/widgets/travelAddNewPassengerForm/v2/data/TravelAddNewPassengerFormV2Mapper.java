package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data;

import android.content.Context;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
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
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.data.TravelAddNewPassengerFormV2DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v2.presentation.TravelAddNewPassengerFormV2VO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000\u0084\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u000f\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u001f\u0010\u000e\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ3\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u00042\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J-\u0010\u001e\u001a\u00020\u001d2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00182\b\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001aH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ/\u0010\"\u001a\u0004\u0018\u00010!2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010 \u001a\u00020\u001dH\u0002¢\u0006\u0004\b\"\u0010#J\u001b\u0010'\u001a\u0004\u0018\u00010&2\b\u0010%\u001a\u0004\u0018\u00010$H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020)H\u0002¢\u0006\u0004\b,\u0010-J*\u00101\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010.\u001a\u00020\u00022\n\u00100\u001a\u00060\u0003j\u0002`/H\u0096\u0002¢\u0006\u0004\b1\u00102R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\f0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00105\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u00107\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00106¨\u00068"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO;", "Lru/ozon/app/android/travel/molecules/dto/commonInput/v1/CommonInputDTO;", "inputs", "", "widgetId", "uniqueString", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "mapInputsToVO", "(Ljava/util/List;JLjava/lang/String;)Ljava/util/List;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "useBankDetails", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "getInputsTopMargin", "(Lru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;)I", "index", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$BirthCertificateCommonInputVO;", "mapBirthCertificateInput", "(Ljava/util/List;JI)Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO$BirthCertificateCommonInputVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;", "bonusCardsDTO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;", "mapBonusCardsToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO$BonusCard;", "bonusCardDTO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards$BonusCard;", "mapBonusCardToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO$BonusCardsDTO$BonusCard;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/presentation/TravelAddNewPassengerFormV2VO$BonusCards$BonusCard;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v2/data/TravelAddNewPassengerFormV2DTO;Ll20/d;)Ljava/util/List;", "birthCertInputsNames", "Ljava/util/List;", "dp24", "I", "dp16", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV2Mapper implements Function2<TravelAddNewPassengerFormV2DTO, d, List<? extends TravelAddNewPassengerFormV2VO>> {

    @NotNull
    private final List<String> birthCertInputsNames;
    private final int dp16;
    private final int dp24;

    public TravelAddNewPassengerFormV2Mapper(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.birthCertInputsNames = C7714v.b0("childSeriesDD", "childSeries");
        this.dp24 = ResourceExtKt.toPx(24, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
    }

    private final int getInputsTopMargin(CellDTO useBankDetails, TextAtom title, TextAtom subtitle) {
        if (useBankDetails != null) {
            return this.dp16;
        }
        if (title == null && subtitle == null) {
            return 0;
        }
        return this.dp24;
    }

    private final CommonInputVO.BirthCertificateCommonInputVO mapBirthCertificateInput(List<CommonInputDTO> inputs, long widgetId, int index) {
        Object obj;
        Object obj2;
        List<CommonInputDTO> list = inputs;
        Iterator<T> it = list.iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((CommonInputDTO) it.next()).getName().hashCode();
        }
        long j11 = i11;
        Iterator<T> it2 = list.iterator();
        while (true) {
            if (!it2.hasNext()) {
                obj = null;
                break;
            }
            obj = it2.next();
            if (Intrinsics.d(((CommonInputDTO) obj).getName(), "childSeriesDD")) {
                break;
            }
        }
        CommonInputDTO commonInputDTO = (CommonInputDTO) obj;
        if (commonInputDTO == null) {
            return null;
        }
        CommonInputVO vO$default = CommonInputMapperKt.toVO$default(commonInputDTO, null, Long.valueOf(widgetId), index, "childSeriesDD", 1, null);
        CommonInputVO.Selector selector = vO$default instanceof CommonInputVO.Selector ? (CommonInputVO.Selector) vO$default : null;
        if (selector == null) {
            return null;
        }
        selector.setRightIcon(Integer.valueOf(R$drawable.ic_s_picker));
        Unit unit = Unit.f71690a;
        Iterator<T> it3 = list.iterator();
        while (true) {
            if (!it3.hasNext()) {
                obj2 = null;
                break;
            }
            obj2 = it3.next();
            if (Intrinsics.d(((CommonInputDTO) obj2).getName(), "childSeries")) {
                break;
            }
        }
        CommonInputDTO commonInputDTO2 = (CommonInputDTO) obj2;
        if (commonInputDTO2 == null) {
            return null;
        }
        CommonInputVO vO$default2 = CommonInputMapperKt.toVO$default(commonInputDTO2, null, Long.valueOf(widgetId), index, "childSeries", 1, null);
        CommonInputVO.TextCommonInputVO textCommonInputVO = vO$default2 instanceof CommonInputVO.TextCommonInputVO ? (CommonInputVO.TextCommonInputVO) vO$default2 : null;
        if (textCommonInputVO != null) {
            return new CommonInputVO.BirthCertificateCommonInputVO(j11, null, null, false, null, false, selector, textCommonInputVO, 62, null);
        }
        return null;
    }

    private final TravelAddNewPassengerFormV2VO.BonusCards.BonusCard mapBonusCardToVO(TravelAddNewPassengerFormV2DTO.BonusCardsDTO.BonusCard bonusCardDTO) {
        return new TravelAddNewPassengerFormV2VO.BonusCards.BonusCard(bonusCardDTO.getCarrierName().getText().hashCode(), bonusCardDTO.getCarrierName(), bonusCardDTO.getIcon(), bonusCardDTO.getBackgroundColor(), AtomActionMapperKt.toAtomAction(bonusCardDTO.getAction(), null));
    }

    private final TravelAddNewPassengerFormV2VO.BonusCards mapBonusCardsToVO(TravelAddNewPassengerFormV2DTO.BonusCardsDTO bonusCardsDTO) {
        if (bonusCardsDTO == null) {
            return null;
        }
        Icon icon = bonusCardsDTO.getIcon();
        List<TravelAddNewPassengerFormV2DTO.BonusCardsDTO.BonusCard> bonusCards = bonusCardsDTO.getBonusCards();
        ArrayList arrayList = new ArrayList(C7714v.z(bonusCards, 10));
        Iterator<T> it = bonusCards.iterator();
        while (it.hasNext()) {
            arrayList.add(mapBonusCardToVO((TravelAddNewPassengerFormV2DTO.BonusCardsDTO.BonusCard) it.next()));
        }
        return new TravelAddNewPassengerFormV2VO.BonusCards(icon, arrayList);
    }

    private final List<CommonInputVO> mapInputsToVO(List<CommonInputDTO> inputs, long widgetId, String uniqueString) {
        String str;
        List<CommonInputDTO> list = inputs;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.birthCertInputsNames.contains(((CommonInputDTO) obj).getName())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((CommonInputDTO) obj2).getName())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        int i11 = 0;
        for (Object obj3 : list) {
            int i12 = i11 + 1;
            CommonInputVO commonInputVO = null;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CommonInputDTO commonInputDTO = (CommonInputDTO) obj3;
            if (this.birthCertInputsNames.contains(commonInputDTO.getName())) {
                if (Intrinsics.d(commonInputDTO.getName(), "childSeriesDD") && arrayList2.size() == this.birthCertInputsNames.size()) {
                    commonInputVO = mapBirthCertificateInput(arrayList2, widgetId, i11);
                }
                str = uniqueString;
            } else {
                str = uniqueString;
                commonInputVO = CommonInputMapperKt.toVO$default(commonInputDTO, null, Long.valueOf(widgetId), i11, str, 1, null);
                if (commonInputVO instanceof CommonInputVO.Selector) {
                    ((CommonInputVO.Selector) commonInputVO).setRightIcon(Integer.valueOf(R$drawable.ic_s_picker));
                }
            }
            if (commonInputVO != null) {
                arrayList3.add(commonInputVO);
            }
            uniqueString = str;
            i11 = i12;
        }
        return arrayList3;
    }

    private final TravelAddNewPassengerFormV2VO mapToVO(TravelAddNewPassengerFormV2DTO dto, String stateId) {
        long hashCode = stateId.hashCode();
        TextAtom title = dto.getTitle();
        TextAtom subtitle = dto.getSubtitle();
        TextAtom agreementText = dto.getAgreementText();
        List<CommonInputDTO> inputs = dto.getInputs();
        TextAtom title2 = dto.getTitle();
        List<CommonInputVO> mapInputsToVO = mapInputsToVO(inputs, hashCode, String.valueOf(title2 != null ? title2.getText() : null));
        int inputsTopMargin = getInputsTopMargin(dto.getUseBankDetails(), dto.getTitle(), dto.getSubtitle());
        boolean z11 = dto.getBonusCards() != null;
        TravelAddNewPassengerFormV2VO.BonusCards mapBonusCardsToVO = mapBonusCardsToVO(dto.getBonusCards());
        ButtonV3Atom.LargeButton addBonusCardButtonApp = dto.getAddBonusCardButtonApp();
        ButtonV3Atom.LargeButton saveButton = dto.getSaveButton();
        boolean isClearButtonVisible = dto.isClearButtonVisible();
        CellDTO useBankDetails = dto.getUseBankDetails();
        CellDTO disableAutoToggle = useBankDetails != null ? DsCellExtensionsKt.disableAutoToggle(useBankDetails) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new TravelAddNewPassengerFormV2VO(hashCode, title, subtitle, agreementText, inputsTopMargin, mapInputsToVO, z11, mapBonusCardsToVO, addBonusCardButtonApp, saveButton, isClearButtonVisible, false, disableAutoToggle, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, 2048, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelAddNewPassengerFormV2VO> invoke(@NotNull TravelAddNewPassengerFormV2DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }
}
