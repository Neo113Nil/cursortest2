package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data;

import Ih.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ConfigVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000e\u001a\u0004\u0018\u00010\r2\u0006\u0010\n\u001a\u00020\t2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0004H\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ5\u0010\u0018\u001a\u00020\u00172\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00042\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00100\u00042\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001f\u0010 J*\u0010$\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010!\u001a\u00020\u00022\n\u0010#\u001a\u00060\u0003j\u0002`\"H\u0096\u0002¢\u0006\u0004\b$\u0010%¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3ConfigMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;", "brokenRule", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO;", "alerts", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;", "getTypedAlert", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$AlertDTO$BrokenRuleDTO;Ljava/util/List;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$AlertVO;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$QuantityCellDTO;", "roomCells", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;", "childForm", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "decreaseButton", "increaseButton", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;", "getDefaultRoomConfig", "(Ljava/util/List;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO$RoomConfig;", "defaultCells", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "mapGuestsToVO", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "mapChildFormToVO", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3ConfigMapper implements Function2<TouristCountSelectorV3DTO, d, List<? extends TouristCountSelectorV3ConfigVO>> {
    private final TouristCountSelectorV3ConfigVO.RoomConfig getDefaultRoomConfig(List<TouristCountSelectorV3DTO.QuantityCellDTO> roomCells, TouristCountSelectorV3DTO.ChildFormDTO childForm, IconButtonV3DTO decreaseButton, IconButtonV3DTO increaseButton) {
        return new TouristCountSelectorV3ConfigVO.RoomConfig(mapGuestsToVO(roomCells, decreaseButton, increaseButton), mapChildFormToVO(childForm));
    }

    private final TouristCountSelectorV3ConfigVO.AlertVO getTypedAlert(TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO brokenRule, List<TouristCountSelectorV3DTO.AlertDTO> alerts) {
        Object obj;
        Iterator<T> it = alerts.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((TouristCountSelectorV3DTO.AlertDTO) obj).getBrokenRule() == brokenRule) {
                break;
            }
        }
        TouristCountSelectorV3DTO.AlertDTO alertDTO = (TouristCountSelectorV3DTO.AlertDTO) obj;
        if (alertDTO == null) {
            return null;
        }
        return new TouristCountSelectorV3ConfigVO.AlertVO(alertDTO.getRestriction(), alertDTO.getShowAlertNow(), alertDTO.getValue());
    }

    private final TouristCountSelectorV3ChildFormVO mapChildFormToVO(TouristCountSelectorV3DTO.ChildFormDTO childForm) {
        TextDTO title = childForm.getTitle();
        TextDTO subtitle = childForm.getSubtitle();
        BadgeDTO ageBadge = childForm.getAgeBadge();
        List<ChipDTO> ageCategories = childForm.getAgeCategories();
        Iterator<ChipDTO> it = childForm.getAgeCategories().iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            }
            if (it.next().getState() == ChipState.SELECTED) {
                break;
            }
            i11++;
        }
        Integer valueOf = Integer.valueOf(i11);
        if (valueOf.intValue() < 0) {
            valueOf = null;
        }
        return new TouristCountSelectorV3ChildFormVO(0, title, subtitle, ageBadge, ageCategories, valueOf != null ? valueOf.intValue() : 0);
    }

    private final List<TouristCountSelectorV3QuantityCellVO> mapGuestsToVO(List<TouristCountSelectorV3DTO.QuantityCellDTO> defaultCells, IconButtonV3DTO decreaseButton, IconButtonV3DTO increaseButton) {
        List<TouristCountSelectorV3DTO.QuantityCellDTO> list = defaultCells;
        ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
        for (TouristCountSelectorV3DTO.QuantityCellDTO quantityCellDTO : list) {
            String id2 = quantityCellDTO.getId();
            TextDTO title = quantityCellDTO.getTitle();
            TextDTO subtitle = quantityCellDTO.getSubtitle();
            int value = quantityCellDTO.getValue();
            int minValue = quantityCellDTO.getMinValue();
            int maxValue = quantityCellDTO.getMaxValue();
            boolean z11 = false;
            IconButtonV3DTO copy$default = IconButtonV3DTO.copy$default(decreaseButton, null, null, null, null, Boolean.valueOf(quantityCellDTO.getValue() <= quantityCellDTO.getMinValue()), null, null, null, null, null, null, null, null, null, 16367, null);
            if (quantityCellDTO.getValue() >= quantityCellDTO.getMaxValue()) {
                z11 = true;
            }
            arrayList.add(new TouristCountSelectorV3QuantityCellVO(id2, title, subtitle, value, minValue, maxValue, copy$default, IconButtonV3DTO.copy$default(increaseButton, null, null, null, null, Boolean.valueOf(z11), null, null, null, null, null, null, null, null, null, 16367, null), quantityCellDTO.getMaxValueRestriction()));
        }
        return arrayList;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TouristCountSelectorV3ConfigVO> invoke(@NotNull TouristCountSelectorV3DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return C7714v.a0(new TouristCountSelectorV3ConfigVO(a.a("Config-", widgetInfo.d()), getDefaultRoomConfig(state.getRoomCells(), state.getChildForm(), state.getDecreaseButton(), state.getIncreaseButton()), getTypedAlert(TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_ROOM_TOURISTS_SUM, state.getAlerts()), getTypedAlert(TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_TOTAL_TOURISTS_SUM, state.getAlerts()), getTypedAlert(TouristCountSelectorV3DTO.AlertDTO.BrokenRuleDTO.BROKEN_RULE_UNSPECIFIED, state.getAlerts())));
    }
}
