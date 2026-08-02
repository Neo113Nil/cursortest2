package ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data;

import Sc.o;
import T00.a;
import T00.e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelPassengersCountSelectorDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.data.TravelQuantityCellDTO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.presentation.TravelPassengersCountSelectorVO;
import ru.ozon.app.android.travel.feature.general.main.widgets.travelPassengersCountSelector.v1.views.TravelQuantityCellVO;
import ru.ozon.app.android.travel.molecules.dto.tabsSelector.TabSelectorDTO;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.controls.chip.Style;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 .2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001.B\u0007¢\u0006\u0004\b\u0007\u0010\bJ%\u0010\f\u001a\u00020\u0005*\u00020\u00022\u0006\u0010\n\u001a\u00020\t2\b\u0010\u000b\u001a\u0004\u0018\u00010\tH\u0002¢\u0006\u0004\b\f\u0010\rJ)\u0010\f\u001a\u00020\u0012*\u00020\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\u00042\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\f\u0010\u0013J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\u0015*\u00020\u0014H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\f\u001a\u0004\u0018\u00010\u0019*\u00020\u0018H\u0002¢\u0006\u0004\b\f\u0010\u001aJ\u0013\u0010\f\u001a\u00020\u001c*\u00020\u001bH\u0002¢\u0006\u0004\b\f\u0010\u001dJ\u0017\u0010!\u001a\u00020 2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b!\u0010\"J\u001f\u0010'\u001a\u00020&2\u0006\u0010#\u001a\u00020\t2\u0006\u0010%\u001a\u00020$H\u0002¢\u0006\u0004\b'\u0010(J*\u0010,\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010)\u001a\u00020\u00022\n\u0010+\u001a\u00060\u0003j\u0002`*H\u0096\u0002¢\u0006\u0004\b,\u0010-¨\u0006/"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "pageUrl", "toVO", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;", "allCells", "", "maxSumValue", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO;Ljava/util/List;I)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO$RuleTag;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO$CellRule;", "toCellRule", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelQuantityCellDTO$RuleTag;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/views/TravelQuantityCellVO$CellRule;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO;", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$AlertDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$AlertVO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;", "Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO$TravelClassSelectorDTO;)Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/presentation/TravelPassengersCountSelectorVO$TravelClassSelectorVO;", "Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO$TabDTO;", "from", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "generateChip", "(Lru/ozon/app/android/travel/molecules/dto/tabsSelector/TabSelectorDTO$TabDTO;)Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "iconToken", "", "isEnabled", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "generateIconButton", "(Ljava/lang/String;Z)Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorDTO;Ll20/d;)Ljava/util/List;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TravelPassengersCountSelectorMapper implements Function2<TravelPassengersCountSelectorDTO, d, List<? extends TravelPassengersCountSelectorVO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/main/widgets/travelPassengersCountSelector/v1/data/TravelPassengersCountSelectorMapper$Companion;", "", "<init>", "()V", "ACTION_TYPE_SELECT", "", "IC_MINUS_BUTTON_TOKEN", "IC_PLUS_BUTTON_TOKEN", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[TravelQuantityCellDTO.RuleTag.values().length];
            try {
                iArr[TravelQuantityCellDTO.RuleTag.RULE_TAG_WITH_PLACES.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[TravelQuantityCellDTO.RuleTag.RULE_TAG_WITHOUT_PLACES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[TravelQuantityCellDTO.RuleTag.RULE_TAG_ADULTS.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[TravelQuantityCellDTO.RuleTag.RULE_TAG_INVALID.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[TravelPassengersCountSelectorDTO.AlertDTO.BrokenRule.values().length];
            try {
                iArr2[TravelPassengersCountSelectorDTO.AlertDTO.BrokenRule.BROKEN_RULE_DEPENDS_ON.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[TravelPassengersCountSelectorDTO.AlertDTO.BrokenRule.BROKEN_RULE_SUM_DEPENDS_ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[TravelPassengersCountSelectorDTO.AlertDTO.BrokenRule.BROKEN_RULE_INVALID.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    private final ChipDTO generateChip(TabSelectorDTO.TabDTO from) {
        return new ChipDTO(ChipDTO.Preset.SIZE_500, Style.ASPECT_PRIMARY, from.isSelected() ? ChipState.SELECTED : ChipState.ENABLED, new CommonAtomLabelDTO(OzonSpannableStringKt.toOzonSpannableString(from.getTitle()), null, null, null, null, null, null, false, null, 510, null), null, new CommonControlSettings(new AtomActionDTO(AtomActionDTO.Behavior.CUSTOM, from.getId(), "select", null, 8, null), null, null, 6, null), null, 80, null);
    }

    private final IconButtonV3DTO generateIconButton(String iconToken, boolean isEnabled) {
        return new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.ACTION_SECONDARY, IconButtonV3DTO.IconButtonShape.SHAPE_SQUARE, iconToken, Boolean.valueOf(!isEnabled), null, null, null, null, null, null, null, null, null, 16352, null);
    }

    private final TravelQuantityCellVO.CellRule toCellRule(TravelQuantityCellDTO.RuleTag ruleTag) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[ruleTag.ordinal()];
        if (i11 == 1) {
            return TravelQuantityCellVO.CellRule.WITH_PLACES;
        }
        if (i11 == 2) {
            return TravelQuantityCellVO.CellRule.WITHOUT_PLACES;
        }
        if (i11 == 3) {
            return TravelQuantityCellVO.CellRule.ADULTS;
        }
        if (i11 == 4) {
            return null;
        }
        throw new o();
    }

    private final TravelPassengersCountSelectorVO toVO(TravelPassengersCountSelectorDTO travelPassengersCountSelectorDTO, String str, String str2) {
        Collection<TextDTO> values;
        TextDTO textDTO;
        long hashCode = str.hashCode();
        List<TravelQuantityCellDTO> cells = travelPassengersCountSelectorDTO.getCells();
        ArrayList arrayList = new ArrayList(C7714v.z(cells, 10));
        Iterator<T> it = cells.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((TravelQuantityCellDTO) it.next(), travelPassengersCountSelectorDTO.getCells(), travelPassengersCountSelectorDTO.getMaxSumValue()));
        }
        int maxSumValue = travelPassengersCountSelectorDTO.getMaxSumValue();
        List<TravelPassengersCountSelectorDTO.AlertDTO> alerts = travelPassengersCountSelectorDTO.getAlerts();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = alerts.iterator();
        while (it2.hasNext()) {
            TravelPassengersCountSelectorVO.AlertVO vo = toVO((TravelPassengersCountSelectorDTO.AlertDTO) it2.next());
            if (vo != null) {
                arrayList2.add(vo);
            }
        }
        TravelPassengersCountSelectorDTO.TravelClassSelectorDTO travelClassSelector = travelPassengersCountSelectorDTO.getTravelClassSelector();
        TextDTO textDTO2 = null;
        TravelPassengersCountSelectorVO.TravelClassSelectorVO vo2 = travelClassSelector != null ? toVO(travelClassSelector) : null;
        ButtonV3Atom.LargeButton applyButton = travelPassengersCountSelectorDTO.getApplyButton();
        Map<String, TextDTO> additionalClassInfo = travelPassengersCountSelectorDTO.getAdditionalClassInfo();
        Map<String, TextDTO> additionalClassInfo2 = travelPassengersCountSelectorDTO.getAdditionalClassInfo();
        if (additionalClassInfo2 != null && (values = additionalClassInfo2.values()) != null && (textDTO = (TextDTO) C7714v.L(values)) != null) {
            textDTO2 = TextDTO.copy$default(textDTO, OzonSpannableStringKt.toOzonSpannableString(""), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
        }
        return new TravelPassengersCountSelectorVO(hashCode, arrayList, maxSumValue, arrayList2, vo2, applyButton, additionalClassInfo, textDTO2, str2);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<TravelPassengersCountSelectorVO> invoke(@NotNull TravelPassengersCountSelectorDTO state, @NotNull d widgetInfo) {
        e h11;
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        a b11 = widgetInfo.b();
        return C7714v.a0(toVO(state, d11, (b11 == null || (h11 = b11.h()) == null) ? null : h11.j()));
    }

    private final TravelQuantityCellVO toVO(TravelQuantityCellDTO travelQuantityCellDTO, List<TravelQuantityCellDTO> list, int i11) {
        boolean z11 = false;
        int i12 = 0;
        int i13 = 0;
        for (TravelQuantityCellDTO travelQuantityCellDTO2 : list) {
            Iterator<T> it = travelQuantityCellDTO.getDependsOn().iterator();
            while (it.hasNext()) {
                if (travelQuantityCellDTO2.getTags().contains((TravelQuantityCellDTO.RuleTag) it.next())) {
                    i12 = travelQuantityCellDTO2.getCurrentValue() + i12;
                }
            }
            Iterator<T> it2 = travelQuantityCellDTO.getSumDependsOn().iterator();
            while (it2.hasNext()) {
                if (travelQuantityCellDTO2.getTags().contains((TravelQuantityCellDTO.RuleTag) it2.next())) {
                    i13 = travelQuantityCellDTO2.getCurrentValue() + i13;
                }
            }
        }
        boolean z12 = travelQuantityCellDTO.getCurrentValue() > travelQuantityCellDTO.getMinValue();
        if (travelQuantityCellDTO.getCurrentValue() < travelQuantityCellDTO.getMaxValue() && ((travelQuantityCellDTO.getDependsOn().isEmpty() || travelQuantityCellDTO.getCurrentValue() < i12) && (travelQuantityCellDTO.getSumDependsOn().isEmpty() || i13 < i11))) {
            z11 = true;
        }
        String id2 = travelQuantityCellDTO.getId();
        String title = travelQuantityCellDTO.getTitle();
        String subtitle = travelQuantityCellDTO.getSubtitle();
        int currentValue = travelQuantityCellDTO.getCurrentValue();
        int minValue = travelQuantityCellDTO.getMinValue();
        int maxValue = travelQuantityCellDTO.getMaxValue();
        IconButtonV3DTO generateIconButton = generateIconButton("ic_s_minus_filled", z12);
        IconButtonV3DTO generateIconButton2 = generateIconButton("ic_s_plus_sign_filled", z11);
        List<TravelQuantityCellDTO.RuleTag> tags = travelQuantityCellDTO.getTags();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it3 = tags.iterator();
        while (it3.hasNext()) {
            TravelQuantityCellVO.CellRule cellRule = toCellRule((TravelQuantityCellDTO.RuleTag) it3.next());
            if (cellRule != null) {
                arrayList.add(cellRule);
            }
        }
        List<TravelQuantityCellDTO.RuleTag> dependsOn = travelQuantityCellDTO.getDependsOn();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it4 = dependsOn.iterator();
        while (it4.hasNext()) {
            TravelQuantityCellVO.CellRule cellRule2 = toCellRule((TravelQuantityCellDTO.RuleTag) it4.next());
            if (cellRule2 != null) {
                arrayList2.add(cellRule2);
            }
        }
        List<TravelQuantityCellDTO.RuleTag> sumDependsOn = travelQuantityCellDTO.getSumDependsOn();
        ArrayList arrayList3 = new ArrayList();
        Iterator<T> it5 = sumDependsOn.iterator();
        while (it5.hasNext()) {
            TravelQuantityCellVO.CellRule cellRule3 = toCellRule((TravelQuantityCellDTO.RuleTag) it5.next());
            if (cellRule3 != null) {
                arrayList3.add(cellRule3);
            }
        }
        return new TravelQuantityCellVO(id2, title, subtitle, currentValue, minValue, maxValue, generateIconButton, generateIconButton2, arrayList, arrayList2, arrayList3);
    }

    private final TravelPassengersCountSelectorVO.AlertVO toVO(TravelPassengersCountSelectorDTO.AlertDTO alertDTO) {
        TravelPassengersCountSelectorVO.AlertVO.RestrictionCase restrictionCase;
        int i11 = WhenMappings.$EnumSwitchMapping$1[alertDTO.getBrokenRule().ordinal()];
        if (i11 == 1) {
            restrictionCase = TravelPassengersCountSelectorVO.AlertVO.RestrictionCase.DEPENDING_RELATION_SATISFIED;
        } else {
            if (i11 != 2) {
                if (i11 == 3) {
                    return null;
                }
                throw new o();
            }
            restrictionCase = TravelPassengersCountSelectorVO.AlertVO.RestrictionCase.SUM_DEPENDING_RELATION_SATISFIED;
        }
        return new TravelPassengersCountSelectorVO.AlertVO(restrictionCase, alertDTO.getRestriction());
    }

    private final TravelPassengersCountSelectorVO.TravelClassSelectorVO toVO(TravelPassengersCountSelectorDTO.TravelClassSelectorDTO travelClassSelectorDTO) {
        List<TabSelectorDTO.TabDTO> tabs = travelClassSelectorDTO.getTabSelector().getTabs();
        ArrayList arrayList = new ArrayList(C7714v.z(tabs, 10));
        Iterator<T> it = tabs.iterator();
        while (it.hasNext()) {
            arrayList.add(generateChip((TabSelectorDTO.TabDTO) it.next()));
        }
        return new TravelPassengersCountSelectorVO.TravelClassSelectorVO(arrayList);
    }
}
