package ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data;

import WZ.x;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.data.B2bFormDTO;
import ru.ozon.app.android.travel.feature.b2b.widgets.b2bForm.presentation.B2bFormVI;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v2.CommonInputV2DTO;
import ru.ozon.app.android.travel.molecules.dto.travelWidgetSettings.TravelWidgetSettingsDTO;
import ru.ozon.app.android.travel.molecules.input.v2.mapper.CommonInputV2MapperKt;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001b\u0010\u0004\u001a\u00020\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0000¢\u0006\u0004\b\u0004\u0010\u0005\u001a\u0013\u0010\u0004\u001a\u00020\u0007*\u00020\u0006H\u0002¢\u0006\u0004\b\u0004\u0010\b\u001a\u0013\u0010\u0004\u001a\u00020\n*\u00020\tH\u0002¢\u0006\u0004\b\u0004\u0010\u000b\u001a\u001b\u0010\u0004\u001a\u00020\u000f*\u00020\f2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0004\u0010\u0010\u001a\u0013\u0010\u0004\u001a\u00020\u0012*\u00020\u0011H\u0002¢\u0006\u0004\b\u0004\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;", "Ll20/d;", "widgetInfo", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "toVI", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO;Ll20/d;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$HeaderSectionDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$HeaderSectionVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$ButtonSectionDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$ButtonSectionVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;", "", "isLastBlock", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO;Z)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;", "Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;", "(Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/data/B2bFormDTO$FormBlockDTO$CellListBlockDTO;)Lru/ozon/app/android/travel/feature/b2b/widgets/b2bForm/presentation/B2bFormVI$FormBlockVI$CellListBlockVI;", "b2b_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class B2bFormMapperKt {
    @NotNull
    public static final B2bFormVI toVI(@NotNull B2bFormDTO b2bFormDTO, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(b2bFormDTO, "<this>");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        B2bFormDTO.HeaderSectionDTO headerSection = b2bFormDTO.getHeaderSection();
        B2bFormVI.HeaderSectionVI vi2 = headerSection != null ? toVI(headerSection) : null;
        List<B2bFormDTO.FormBlockDTO> formBlockList = b2bFormDTO.getFormBlockList();
        ArrayList arrayList = new ArrayList(C7714v.z(formBlockList, 10));
        int i11 = 0;
        for (Object obj : formBlockList) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVI((B2bFormDTO.FormBlockDTO) obj, i11 == C7714v.P(b2bFormDTO.getFormBlockList())));
            i11 = i12;
        }
        B2bFormDTO.ButtonSectionDTO buttonSection = b2bFormDTO.getButtonSection();
        B2bFormVI.ButtonSectionVI vi3 = buttonSection != null ? toVI(buttonSection) : null;
        int gap = b2bFormDTO.getGap();
        Map<String, TokenizedTrackingInfo> trackingInfo = b2bFormDTO.getTrackingInfo();
        return new B2bFormVI(hashCode, vi2, arrayList, vi3, gap, trackingInfo != null ? x.d(trackingInfo, widgetInfo) : null);
    }

    private static final B2bFormVI.HeaderSectionVI toVI(B2bFormDTO.HeaderSectionDTO headerSectionDTO) {
        TextDTO title = headerSectionDTO.getTitle();
        return new B2bFormVI.HeaderSectionVI(headerSectionDTO.getSettings(), headerSectionDTO.getImage(), title, headerSectionDTO.getSubtitle());
    }

    private static final B2bFormVI.ButtonSectionVI toVI(B2bFormDTO.ButtonSectionDTO buttonSectionDTO) {
        TravelWidgetSettingsDTO settings = buttonSectionDTO.getSettings();
        ButtonV3DTO submitButton = buttonSectionDTO.getSubmitButton();
        ButtonV3DTO additionalButton = buttonSectionDTO.getAdditionalButton();
        IconButtonV3DTO additionalIconButton = buttonSectionDTO.getAdditionalIconButton();
        TextDTO agreement = buttonSectionDTO.getAgreement();
        if (agreement != null) {
            agreement.setTagSupported(true);
        }
        Unit unit = Unit.f71690a;
        return new B2bFormVI.ButtonSectionVI(settings, submitButton, additionalButton, additionalIconButton, agreement, buttonSectionDTO.isSticky());
    }

    private static final B2bFormVI.FormBlockVI toVI(B2bFormDTO.FormBlockDTO formBlockDTO, boolean z11) {
        int id2 = formBlockDTO.getId();
        TravelWidgetSettingsDTO settings = formBlockDTO.getSettings();
        TextDTO title = formBlockDTO.getTitle();
        TextDTO subtitle = formBlockDTO.getSubtitle();
        List<CommonInputV2DTO> inputList = formBlockDTO.getInputList();
        ArrayList arrayList = new ArrayList(C7714v.z(inputList, 10));
        Iterator<T> it = inputList.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                B2bFormDTO.FormBlockDTO.CellListBlockDTO cellListBlock = formBlockDTO.getCellListBlock();
                return new B2bFormVI.FormBlockVI(id2, title, subtitle, settings, arrayList, cellListBlock != null ? toVI(cellListBlock) : null, formBlockDTO.getDisclaimer(), formBlockDTO.getGap());
            }
            Object next = it.next();
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CommonInputV2DTO commonInputV2DTO = (CommonInputV2DTO) next;
            arrayList.add(CommonInputV2MapperKt.toVO(commonInputV2DTO, Boolean.valueOf(z11 && i11 == C7714v.P(formBlockDTO.getInputList())), Long.valueOf(formBlockDTO.getId()), commonInputV2DTO.getName().hashCode()));
            i11 = i12;
        }
    }

    private static final B2bFormVI.FormBlockVI.CellListBlockVI toVI(B2bFormDTO.FormBlockDTO.CellListBlockDTO cellListBlockDTO) {
        return new B2bFormVI.FormBlockVI.CellListBlockVI(cellListBlockDTO.getSettings(), cellListBlockDTO.getCellList(), cellListBlockDTO.getGap());
    }
}
