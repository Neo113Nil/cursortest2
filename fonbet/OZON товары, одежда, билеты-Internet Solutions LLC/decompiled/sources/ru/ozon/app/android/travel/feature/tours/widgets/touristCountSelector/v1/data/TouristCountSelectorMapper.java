package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.data.TouristCountSelectorDTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v1.presentation.TouristCountSelectorVO;
import ru.ozon.app.android.travel.molecules.view.quantityCell.QuantityCellVO;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.texts.TextAtom;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\f\u001a\u00020\u000b2\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\f\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u0010J\u001f\u0010\f\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\n\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\f\u0010\u0015J*\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\u0016\u001a\u00020\u00022\n\u0010\u0018\u001a\u00060\u0003j\u0002`\u0017H\u0096\u0002¢\u0006\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$QuantityCellDTO;", "dto", "Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "mapToVO", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$QuantityCellDTO;)Lru/ozon/app/android/travel/molecules/view/quantityCell/QuantityCellVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AlertVO;", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AlertDTO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AlertVO;", "", "index", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AgeSelectorDTO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "(ILru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO$AgeSelectorDTO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/presentation/TouristCountSelectorVO$AgeSelectorVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v1/data/TouristCountSelectorDTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorMapper implements Function2<TouristCountSelectorDTO, d, List<? extends TouristCountSelectorVO>> {
    /* JADX WARN: Multi-variable type inference failed */
    private final QuantityCellVO mapToVO(TouristCountSelectorDTO.QuantityCellDTO dto) {
        String str = null;
        return new QuantityCellVO(dto.getId(), new TextAtom(OzonSpannableStringKt.toOzonSpannableString(dto.getTitle()), StyleParser.TextStyle.BODY_L.getStyleName(), str, null, null, null, null, 124, null), new TextAtom(OzonSpannableStringKt.toOzonSpannableString(dto.getSubtitle()), str, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 0 == true ? 1 : 0, null, 126, null), dto.getCurrentValue(), dto.getMinValue(), dto.getMaxValue(), dto.getCurrentValue() > dto.getMinValue(), dto.getCurrentValue() < dto.getMaxValue(), null, 256, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TouristCountSelectorVO> invoke(@NotNull TouristCountSelectorDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        long hashCode = widgetInfo.d().hashCode();
        List<TouristCountSelectorDTO.QuantityCellDTO> cells = state.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            arrayList.add(mapToVO((TouristCountSelectorDTO.QuantityCellDTO) it.next()));
        }
        int maxSumValue = state.getMaxSumValue();
        List<TouristCountSelectorDTO.AlertDTO> alerts = state.getAlerts();
        ArrayList arrayList2 = new ArrayList(C7714v.z(alerts, 10));
        Iterator<T> it2 = alerts.iterator();
        while (it2.hasNext()) {
            arrayList2.add(mapToVO((TouristCountSelectorDTO.AlertDTO) it2.next()));
        }
        ButtonV3Atom.LargeButton applyButton = state.getApplyButton();
        List<String> ageCategories = state.getAgeCategories();
        List<TouristCountSelectorDTO.AgeSelectorDTO> ageSelectors = state.getAgeSelectors();
        ArrayList arrayList3 = new ArrayList(C7714v.z(ageSelectors, 10));
        int i11 = 0;
        for (Object obj : ageSelectors) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList3.add(mapToVO(i11, (TouristCountSelectorDTO.AgeSelectorDTO) obj));
            i11 = i12;
        }
        return C7714v.a0(new TouristCountSelectorVO(hashCode, arrayList, maxSumValue, arrayList2, applyButton, ageCategories, arrayList3, state.getChildrenAgeAnnotation(), !state.getAgeSelectors().isEmpty(), state.getAgeSelectorPlaceholder()));
    }

    private final TouristCountSelectorVO.AlertVO mapToVO(TouristCountSelectorDTO.AlertDTO dto) {
        return new TouristCountSelectorVO.AlertVO(dto.getBrokenRule(), dto.getRestriction(), dto.getShowAlertNow());
    }

    private final TouristCountSelectorVO.AgeSelectorVO mapToVO(int index, TouristCountSelectorDTO.AgeSelectorDTO dto) {
        String value = dto.getValue();
        String error = dto.getError();
        String error2 = dto.getError();
        return new TouristCountSelectorVO.AgeSelectorVO(index, value, error, !(error2 == null || error2.length() == 0));
    }
}
