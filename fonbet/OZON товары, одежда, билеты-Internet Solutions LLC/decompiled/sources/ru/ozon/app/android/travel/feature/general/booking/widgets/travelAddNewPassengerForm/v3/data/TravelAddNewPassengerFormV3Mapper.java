package ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data;

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
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3DTO;
import ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.app.android.travel.molecules.input.v2.CommonInputV2VO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0000\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\f\u001a\u00020\u00052\u0006\u0010\t\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0013\u001a\u0004\u0018\u00010\u00122\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0017\u001a\u00020\u0016*\u00020\u0015H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J*\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0019\u001a\u00020\u00022\n\u0010\u001b\u001a\u00060\u0003j\u0002`\u001aH\u0096\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ)\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010 R\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\n0\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "dto", "", "stateId", "mapToVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO;", "inputs", "", "widgetId", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "mapBirthCertificateInput", "(Ljava/util/List;J)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO$InputItemDTO$DisclaimerDTO;)Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/presentation/TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem$DisclaimerVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/booking/widgets/travelAddNewPassengerForm/v3/data/TravelAddNewPassengerFormV3DTO;Ll20/d;)Ljava/util/List;", "inputsItems", "mapInputsItemsToVO", "(Ljava/util/List;J)Ljava/util/List;", "birthCertInputsNames", "Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TravelAddNewPassengerFormV3Mapper implements Function2<TravelAddNewPassengerFormV3DTO, d, List<? extends TravelAddNewPassengerFormV3VO>> {

    @NotNull
    private final List<String> birthCertInputsNames = C7714v.b0("childSeriesDD", "childSeries");

    private final TravelAddNewPassengerFormV3VO.InputItemVO mapBirthCertificateInput(List<TravelAddNewPassengerFormV3DTO.InputItemDTO> inputs, long widgetId) {
        Object obj;
        Object obj2;
        List<TravelAddNewPassengerFormV3DTO.InputItemDTO> list = inputs;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((TravelAddNewPassengerFormV3DTO.InputItemDTO) obj).getInput().getName(), "childSeriesDD")) {
                break;
            }
        }
        TravelAddNewPassengerFormV3DTO.InputItemDTO inputItemDTO = (TravelAddNewPassengerFormV3DTO.InputItemDTO) obj;
        if (inputItemDTO != null) {
            int id2 = inputItemDTO.getId();
            CommonInputV2VO vO$default = CommonInputV2MapperKt.toVO$default(inputItemDTO.getInput(), null, Long.valueOf(widgetId), id2, 1, null);
            CommonInputV2VO.SelectorV2 selectorV2 = vO$default instanceof CommonInputV2VO.SelectorV2 ? (CommonInputV2VO.SelectorV2) vO$default : null;
            if (selectorV2 != null) {
                selectorV2.setRightIcon(Integer.valueOf(R$drawable.ic_s_picker));
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        obj2 = null;
                        break;
                    }
                    obj2 = it2.next();
                    if (Intrinsics.d(((TravelAddNewPassengerFormV3DTO.InputItemDTO) obj2).getInput().getName(), "childSeries")) {
                        break;
                    }
                }
                TravelAddNewPassengerFormV3DTO.InputItemDTO inputItemDTO2 = (TravelAddNewPassengerFormV3DTO.InputItemDTO) obj2;
                if (inputItemDTO2 != null) {
                    CommonInputV2VO vO$default2 = CommonInputV2MapperKt.toVO$default(inputItemDTO2.getInput(), null, Long.valueOf(widgetId), inputItemDTO2.getId(), 1, null);
                    CommonInputV2VO.TextInputV2 textInputV2 = vO$default2 instanceof CommonInputV2VO.TextInputV2 ? (CommonInputV2VO.TextInputV2) vO$default2 : null;
                    if (textInputV2 != null) {
                        return new TravelAddNewPassengerFormV3VO.InputItemVO.BirthCertificateInputItem(id2, selectorV2, textInputV2);
                    }
                }
            }
        }
        return null;
    }

    private final TravelAddNewPassengerFormV3VO mapToVO(TravelAddNewPassengerFormV3DTO dto, String stateId) {
        TextDTO textDTO;
        long hashCode = stateId.hashCode();
        TextDTO agreementText = dto.getAgreementText();
        if (agreementText != null) {
            agreementText.setTagSupported(true);
            textDTO = agreementText;
        } else {
            textDTO = null;
        }
        List<TravelAddNewPassengerFormV3VO.InputItemVO> mapInputsItemsToVO = mapInputsItemsToVO(dto.getInputs(), hashCode);
        ButtonV3DTO saveButton = dto.getSaveButton();
        CellDTO useBankDetails = dto.getUseBankDetails();
        CellDTO disableAutoToggle = useBankDetails != null ? DsCellExtensionsKt.disableAutoToggle(useBankDetails) : null;
        Map<String, TokenizedTrackingInfo> trackingInfo = dto.getTrackingInfo();
        return new TravelAddNewPassengerFormV3VO(hashCode, mapInputsItemsToVO, saveButton, textDTO, disableAutoToggle, false, trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(hashCode), null, 2, null) : null, dto.getActionNamesToSkip(), 32, null);
    }

    private final TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem.DisclaimerVO toVO(TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO disclaimerDTO) {
        return new TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem.DisclaimerVO(disclaimerDTO.getBackgroundColor(), disclaimerDTO.getIcon(), disclaimerDTO.getTitle(), disclaimerDTO.getSubtitle(), disclaimerDTO.getCloseButton(), disclaimerDTO.getYesButton(), disclaimerDTO.getNoButton(), disclaimerDTO.getTrackingInfo());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v0, types: [ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.data.TravelAddNewPassengerFormV3Mapper] */
    /* JADX WARN: Type inference failed for: r4v10, types: [ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO$InputItemVO] */
    /* JADX WARN: Type inference failed for: r4v4, types: [ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO$InputItemVO$CheckboxInputItem] */
    /* JADX WARN: Type inference failed for: r4v5, types: [ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO$InputItemVO$DateInputItem] */
    /* JADX WARN: Type inference failed for: r5v2, types: [ru.ozon.app.android.travel.feature.general.booking.widgets.travelAddNewPassengerForm.v3.presentation.TravelAddNewPassengerFormV3VO$InputItemVO$TextInputItem] */
    @NotNull
    public final List<TravelAddNewPassengerFormV3VO.InputItemVO> mapInputsItemsToVO(@NotNull List<TravelAddNewPassengerFormV3DTO.InputItemDTO> inputsItems, long widgetId) {
        Intrinsics.checkNotNullParameter(inputsItems, "inputsItems");
        List<TravelAddNewPassengerFormV3DTO.InputItemDTO> list = inputsItems;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (this.birthCertInputsNames.contains(((TravelAddNewPassengerFormV3DTO.InputItemDTO) obj).getInput().getName())) {
                arrayList.add(obj);
            }
        }
        HashSet hashSet = new HashSet();
        ArrayList arrayList2 = new ArrayList();
        for (Object obj2 : arrayList) {
            if (hashSet.add(((TravelAddNewPassengerFormV3DTO.InputItemDTO) obj2).getInput().getName())) {
                arrayList2.add(obj2);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (TravelAddNewPassengerFormV3DTO.InputItemDTO inputItemDTO : list) {
            TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem selectorInputItem = null;
            selectorInputItem = null;
            selectorInputItem = null;
            if (!this.birthCertInputsNames.contains(inputItemDTO.getInput().getName())) {
                int id2 = inputItemDTO.getId();
                CommonInputV2VO vO$default = CommonInputV2MapperKt.toVO$default(inputItemDTO.getInput(), null, Long.valueOf(widgetId), id2, 1, null);
                if (vO$default instanceof CommonInputV2VO.TextInputV2) {
                    CommonInputV2VO.TextInputV2 textInputV2 = (CommonInputV2VO.TextInputV2) vO$default;
                    TextDTO infoText = inputItemDTO.getInfoText();
                    List<BadgeDTO> hintBadges = inputItemDTO.getHintBadges();
                    TravelAddNewPassengerFormV3DTO.InputItemDTO.DisclaimerDTO disclaimer = inputItemDTO.getDisclaimer();
                    selectorInputItem = new TravelAddNewPassengerFormV3VO.InputItemVO.TextInputItem(id2, textInputV2, infoText, hintBadges, disclaimer != null ? toVO(disclaimer) : null);
                } else if (vO$default instanceof CommonInputV2VO.DateInputV2) {
                    selectorInputItem = new TravelAddNewPassengerFormV3VO.InputItemVO.DateInputItem(id2, (CommonInputV2VO.DateInputV2) vO$default);
                } else if (vO$default instanceof CommonInputV2VO.CheckboxV2) {
                    selectorInputItem = new TravelAddNewPassengerFormV3VO.InputItemVO.CheckboxInputItem(id2, (CommonInputV2VO.CheckboxV2) vO$default);
                } else if (vO$default instanceof CommonInputV2VO.SelectorV2) {
                    CommonInputV2VO.SelectorV2 selectorV2 = (CommonInputV2VO.SelectorV2) vO$default;
                    selectorV2.setRightIcon(Integer.valueOf(R$drawable.ic_s_picker));
                    Unit unit = Unit.f71690a;
                    selectorInputItem = new TravelAddNewPassengerFormV3VO.InputItemVO.SelectorInputItem(id2, selectorV2);
                }
            } else if (Intrinsics.d(inputItemDTO.getInput().getName(), "childSeriesDD") && arrayList2.size() == this.birthCertInputsNames.size()) {
                selectorInputItem = mapBirthCertificateInput(arrayList2, widgetId);
            }
            if (selectorInputItem != null) {
                arrayList3.add(selectorInputItem);
            }
        }
        return arrayList3;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelAddNewPassengerFormV3VO> invoke(@NotNull TravelAddNewPassengerFormV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(mapToVO(state, widgetInfo.d()));
    }
}
