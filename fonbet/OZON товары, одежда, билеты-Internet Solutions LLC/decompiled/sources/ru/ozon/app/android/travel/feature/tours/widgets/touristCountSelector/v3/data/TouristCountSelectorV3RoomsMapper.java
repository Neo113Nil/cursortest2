package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.tours.R$string;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3DTO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ChildFormVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3QuantityCellVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJI\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u00042\u0014\u0010\f\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\t2\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00042\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J/\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u001a\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ'\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u0004*\b\u0012\u0004\u0012\u00020\u001e0\u00042\u0006\u0010\u001f\u001a\u00020\nH\u0002¢\u0006\u0004\b \u0010!J*\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\"\u001a\u00020\u00022\n\u0010$\u001a\u00060\u0003j\u0002`#H\u0096\u0002¢\u0006\u0004\b%\u0010&¨\u0006'"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3RoomsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "", "", "room", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$QuantityCellDTO;", "defaultCells", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "decreaseButton", "increaseButton", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "mapGuestsToVO", "(Ljava/util/Map;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;", "childForm", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormConfigDTO;", "childFormConfig", "childFormsSize", "childFormPosition", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "mapChildFormToVO", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormDTO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO$ChildFormConfigDTO;II)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ChildFormVO;", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "selectedValue", "changeSelection", "(Ljava/util/List;Ljava/lang/String;)Ljava/util/List;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/data/TouristCountSelectorV3DTO;Ll20/d;)Ljava/util/List;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3RoomsMapper implements Function2<TouristCountSelectorV3DTO, d, List<? extends TouristCountSelectorV3RoomVO>> {
    private final List<ChipDTO> changeSelection(List<ChipDTO> list, String str) {
        Object obj;
        List<ChipDTO> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChipDTO) obj).getState() == ChipState.SELECTED) {
                break;
            }
        }
        ChipDTO chipDTO = (ChipDTO) obj;
        if (chipDTO != null && Intrinsics.d(chipDTO.getTitle().getText().toString(), str)) {
            return list;
        }
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (ChipDTO chipDTO2 : list2) {
            ChipState state = chipDTO2.getState();
            ChipState chipState = ChipState.SELECTED;
            boolean z11 = state == chipState;
            boolean d11 = Intrinsics.d(chipDTO2.getTitle().getText().toString(), str);
            if (z11 || d11) {
                if (!d11) {
                    chipState = ChipState.ENABLED;
                }
                chipDTO2 = ChipDTO.copy$default(chipDTO2, null, null, chipState, null, null, null, null, 123, null);
            }
            arrayList.add(chipDTO2);
        }
        return arrayList;
    }

    private final TouristCountSelectorV3ChildFormVO mapChildFormToVO(TouristCountSelectorV3DTO.ChildFormDTO childForm, TouristCountSelectorV3DTO.ChildFormConfigDTO childFormConfig, int childFormsSize, int childFormPosition) {
        TextDTO title;
        String value = childFormConfig.getValue();
        if (childFormsSize > 1) {
            TextDTO title2 = childForm.getTitle();
            title = TextDTO.copy$default(title2, OzonSpannableStringKt.toOzonSpannableString(((Object) title2.getText()) + " " + (childFormPosition + 1)), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        } else {
            title = childForm.getTitle();
        }
        TextDTO textDTO = title;
        List<ChipDTO> changeSelection = changeSelection(childForm.getAgeCategories(), value);
        int hashCode = UUID.randomUUID().hashCode();
        TextDTO subtitle = childForm.getSubtitle();
        BadgeDTO copy$default = BadgeDTO.copy$default(childForm.getAgeBadge(), value, null, null, null, null, null, null, null, childForm.getAgeBadge().getStyleType(), null, null, null, 3838, null);
        Iterator<ChipDTO> it = changeSelection.iterator();
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
        return new TouristCountSelectorV3ChildFormVO(hashCode, textDTO, subtitle, copy$default, changeSelection, valueOf != null ? valueOf.intValue() : 0);
    }

    private final List<TouristCountSelectorV3QuantityCellVO> mapGuestsToVO(Map<String, Integer> room, List<TouristCountSelectorV3DTO.QuantityCellDTO> defaultCells, IconButtonV3DTO decreaseButton, IconButtonV3DTO increaseButton) {
        Object obj;
        if (room == null) {
            List<TouristCountSelectorV3DTO.QuantityCellDTO> list = defaultCells;
            ArrayList arrayList = new ArrayList(C7714v.z(list, 10));
            for (TouristCountSelectorV3DTO.QuantityCellDTO quantityCellDTO : list) {
                arrayList.add(new TouristCountSelectorV3QuantityCellVO(quantityCellDTO.getId(), quantityCellDTO.getTitle(), quantityCellDTO.getSubtitle(), quantityCellDTO.getValue(), quantityCellDTO.getMinValue(), quantityCellDTO.getMaxValue(), IconButtonV3DTO.copy$default(decreaseButton, null, null, null, null, Boolean.valueOf(quantityCellDTO.getValue() <= quantityCellDTO.getMinValue()), null, null, null, null, null, null, null, null, null, 16367, null), IconButtonV3DTO.copy$default(increaseButton, null, null, null, null, Boolean.valueOf(quantityCellDTO.getValue() >= quantityCellDTO.getMaxValue()), null, null, null, null, null, null, null, null, null, 16367, null), quantityCellDTO.getMaxValueRestriction()));
            }
            return arrayList;
        }
        ArrayList arrayList2 = new ArrayList();
        for (Map.Entry<String, Integer> entry : room.entrySet()) {
            String key = entry.getKey();
            int intValue = entry.getValue().intValue();
            Iterator<T> it = defaultCells.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(((TouristCountSelectorV3DTO.QuantityCellDTO) obj).getId(), key)) {
                    break;
                }
            }
            TouristCountSelectorV3DTO.QuantityCellDTO quantityCellDTO2 = (TouristCountSelectorV3DTO.QuantityCellDTO) obj;
            TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO = quantityCellDTO2 != null ? new TouristCountSelectorV3QuantityCellVO(quantityCellDTO2.getId(), quantityCellDTO2.getTitle(), quantityCellDTO2.getSubtitle(), intValue, quantityCellDTO2.getMinValue(), quantityCellDTO2.getMaxValue(), IconButtonV3DTO.copy$default(decreaseButton, null, null, null, null, Boolean.valueOf(intValue <= quantityCellDTO2.getMinValue()), null, null, null, null, null, null, null, null, null, 16367, null), IconButtonV3DTO.copy$default(increaseButton, null, null, null, null, Boolean.valueOf(intValue >= quantityCellDTO2.getMaxValue()), null, null, null, null, null, null, null, null, null, 16367, null), quantityCellDTO2.getMaxValueRestriction()) : null;
            if (touristCountSelectorV3QuantityCellVO != null) {
                arrayList2.add(touristCountSelectorV3QuantityCellVO);
            }
        }
        return arrayList2;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TouristCountSelectorV3RoomVO> invoke(@NotNull TouristCountSelectorV3DTO state, @NotNull d widgetInfo) {
        boolean z11;
        List list;
        List<TouristCountSelectorV3DTO.ChildFormConfigDTO> childForms;
        TouristCountSelectorV3DTO state2 = state;
        Intrinsics.checkNotNullParameter(state2, "state");
        d widgetInfo2 = widgetInfo;
        Intrinsics.checkNotNullParameter(widgetInfo2, "widgetInfo");
        ArrayList arrayList = new ArrayList();
        boolean z12 = true;
        boolean z13 = state2.getRooms().size() == 1;
        int roomsMaxCount = state2.getRoomsMaxCount();
        int i11 = 0;
        while (i11 < roomsMaxCount) {
            TouristCountSelectorV3DTO.RoomDTO roomDTO = (TouristCountSelectorV3DTO.RoomDTO) C7714v.Q(i11, state2.getRooms());
            long hashCode = ("Room-" + i11 + "-" + widgetInfo2.d()).hashCode();
            i11++;
            String string = StringProvider.getString(R$string.tourist_count_selector_room_android, Integer.valueOf(i11));
            boolean z14 = !z13;
            ButtonV3DTO deleteRoomButton = state2.getDeleteRoomButton();
            boolean z15 = (z13 || state2.getDeleteRoomButton() == null) ? false : z12;
            List<TouristCountSelectorV3QuantityCellVO> mapGuestsToVO = mapGuestsToVO(roomDTO != null ? roomDTO.getValues() : null, state2.getRoomCells(), state2.getDecreaseButton(), state2.getIncreaseButton());
            if (roomDTO == null || (childForms = roomDTO.getChildForms()) == null) {
                z11 = z13;
                list = null;
            } else {
                List<TouristCountSelectorV3DTO.ChildFormConfigDTO> list2 = childForms;
                list = new ArrayList(C7714v.z(list2, 10));
                int i12 = 0;
                for (Object obj : list2) {
                    int i13 = i12 + 1;
                    if (i12 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    list.add(mapChildFormToVO(state.getChildForm(), (TouristCountSelectorV3DTO.ChildFormConfigDTO) obj, roomDTO.getChildForms().size(), i12));
                    i12 = i13;
                    z13 = z13;
                }
                z11 = z13;
            }
            if (list == null) {
                list = K.f71697a;
            }
            arrayList.add(new TouristCountSelectorV3RoomVO(hashCode, string, z14, deleteRoomButton, z15, mapGuestsToVO, list, roomDTO != null));
            state2 = state;
            widgetInfo2 = widgetInfo;
            z13 = z11;
            z12 = true;
        }
        return arrayList;
    }
}
