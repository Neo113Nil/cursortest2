package ru.ozon.app.android.travel.feature.general.common.widgets.filters.data;

import Lh.b;
import V.e;
import WZ.t;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.SliderWithLabelsDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleSectionInTabVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar;
import ru.ozon.app.android.travel.molecules.extensions.DsCellExtensionsKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0001\u0018\u00002*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006B\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0015\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\tH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001d\u0010\u0012\u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0013\u0010\u000e\u001a\u00020\u0014*\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0013\u0010\u000e\u001a\u00020\u0014*\u00020\u0017H\u0002¢\u0006\u0004\b\u0018\u0010\u0016J\u0013\u0010\u000e\u001a\u00020\u001a*\u00020\u0019H\u0002¢\u0006\u0004\b\u000e\u0010\u001bJ\u0013\u0010\u000e\u001a\u00020\u001d*\u00020\u001cH\u0002¢\u0006\u0004\b\u000e\u0010\u001eJ\u001b\u0010\u000e\u001a\u00020 *\u00020\u001f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010!J#\u0010\u000e\u001a\u00020%*\u00020\"2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b\u000e\u0010&J\u001b\u0010\u000e\u001a\u00020(*\u00020'2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u000e\u0010)J#\u0010\u000e\u001a\u00020-*\u00020*2\u0006\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020#H\u0002¢\u0006\u0004\b\u000e\u0010.J*\u00103\u001a\b\u0012\u0004\u0012\u0002020\u00042\u0006\u0010/\u001a\u00020\u00022\n\u00101\u001a\u00060\u0003j\u0002`0H\u0096\u0002¢\u0006\u0004\b3\u00104J;\u0010\u000e\u001a\u000202*\u0002052\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u0002062\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u000206H\u0000¢\u0006\u0004\b;\u0010<¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersSectionsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO;", "Lru/ozon/android/composerCommonViewKit/islandSeparator/core/WidgetMapper;", "<init>", "()V", "", "mapControl", "(Ljava/lang/Object;)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$ToggleControlDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State$ToggleControlVO;", "toVO", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$ToggleControlDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State$ToggleControlVO;", "", "id", "mapComponent", "(Ljava/lang/Object;J)Ljava/lang/Object;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CellListFilterDTO;", "toVO-B66AOo4", "(Ljava/util/List;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$CustomizableCellListFilterDTO;", "toVO-QwPaUB8", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$OpenRangeFilterDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$OpenRangeFilterDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$TagsWithTitleFilterDTO;)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO;J)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO$SliderWithLabelsControlDTO;", "", "index", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO$SliderWithLabelsFilterDTO$SliderWithLabelsControlDTO;JI)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO;J)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO$SliderWithLabelsVO;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO$PointDTO;", "min", "max", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/SliderWithLabelsDTO$PointDTO;II)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Label;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;", "invoke", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO;Ll20/d;)Ljava/util/List;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO;", "", "isSingleSection", "isFirstSection", "isLastSection", "isFirstSectionSeparated", "toVO$common_prodGoogleAllVendorsRelease", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/data/FiltersDTO$SectionDTO;JZZZZ)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersSectionsMapper implements Function2<FiltersDTO, d, List<? extends FiltersSectionVO>> {
    private final Object mapComponent(Object obj, long j11) {
        if (obj instanceof FiltersDTO.SectionDTO.OpenRangeFilterDTO) {
            return toVO((FiltersDTO.SectionDTO.OpenRangeFilterDTO) obj);
        }
        if (obj instanceof FiltersDTO.SectionDTO.TagsFilterDTO) {
            return obj;
        }
        if (obj instanceof FiltersDTO.SectionDTO.CellListFilterDTO) {
            return FiltersDTO.SectionDTO.CellListFilterDTO.m1209boximpl(m1236toVOB66AOo4(((FiltersDTO.SectionDTO.CellListFilterDTO) obj).getCells()));
        }
        if (obj instanceof FiltersDTO.SectionDTO.CustomizableCellListFilterDTO) {
            return FiltersDTO.SectionDTO.CellListFilterDTO.m1209boximpl(m1237toVOQwPaUB8(((FiltersDTO.SectionDTO.CustomizableCellListFilterDTO) obj).getCustomizableCells()));
        }
        if (obj instanceof FiltersDTO.SectionDTO.TagsWithTitleFilterDTO) {
            return toVO((FiltersDTO.SectionDTO.TagsWithTitleFilterDTO) obj);
        }
        if (obj instanceof FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO) {
            return toVO((FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO) obj, j11);
        }
        return null;
    }

    private final Object mapControl(Object obj) {
        if (obj instanceof FiltersDTO.SectionDTO.ToggleControlDTO) {
            return toVO((FiltersDTO.SectionDTO.ToggleControlDTO) obj);
        }
        if (obj instanceof BadgeDTO) {
            return obj;
        }
        return null;
    }

    private final FiltersSectionVO.State.ToggleControlVO toVO(FiltersDTO.SectionDTO.ToggleControlDTO toggleControlDTO) {
        ToggleDTO toggle = toggleControlDTO.getToggle();
        CommonControlSettings common = toggleControlDTO.getCommon();
        return new FiltersSectionVO.State.ToggleControlVO(toggle, common != null ? common.toAtomAction() : null, toggleControlDTO.getLabel());
    }

    /* renamed from: toVO-B66AOo4, reason: not valid java name */
    private final List<? extends CellDTO> m1236toVOB66AOo4(List<? extends CellDTO> list) {
        List<? extends CellDTO> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(DsCellExtensionsKt.disableAutoToggle((CellDTO) it.next()));
        }
        return FiltersDTO.SectionDTO.CellListFilterDTO.m1210constructorimpl(arrayList);
    }

    /* renamed from: toVO-QwPaUB8, reason: not valid java name */
    private final List<? extends CellDTO> m1237toVOQwPaUB8(List<? extends FiltersDTO.SectionDTO.CustomizableCell> list) {
        CellDTO cell;
        List<? extends FiltersDTO.SectionDTO.CustomizableCell> list2 = list;
        ArrayList arrayList = new ArrayList(C7714v.z(list2, 10));
        for (FiltersDTO.SectionDTO.CustomizableCell customizableCell : list2) {
            CellDTO.RightBlock rightBlock = customizableCell.getCell().getRightBlock();
            AtomDTO control = rightBlock != null ? rightBlock.getControl() : null;
            if (control instanceof ToggleDTO) {
                ToggleDTO toggleDTO = (ToggleDTO) control;
                if (!Boolean.valueOf(customizableCell.isToggleEnabled()).equals(toggleDTO.isEnabled())) {
                    CellDTO cell2 = customizableCell.getCell();
                    CellDTO.RightBlock rightBlock2 = customizableCell.getCell().getRightBlock();
                    cell = CellDTO.copy$default(cell2, null, null, null, rightBlock2 != null ? CellDTO.RightBlock.copy$default(rightBlock2, null, null, null, null, null, null, null, null, null, null, ToggleDTO.copy$default(toggleDTO, null, Boolean.valueOf(customizableCell.isToggleEnabled()), null, null, null, null, 61, null), null, 3071, null) : null, null, 23, null);
                    arrayList.add(DsCellExtensionsKt.disableAutoToggle(cell));
                }
            }
            cell = customizableCell.getCell();
            arrayList.add(DsCellExtensionsKt.disableAutoToggle(cell));
        }
        return FiltersDTO.SectionDTO.CellListFilterDTO.m1210constructorimpl(arrayList);
    }

    @NotNull
    public final FiltersSectionVO.State toVO$common_prodGoogleAllVendorsRelease(@NotNull FiltersDTO.SectionDTO sectionDTO, long j11, boolean z11, boolean z12, boolean z13, boolean z14) {
        boolean z15;
        Intrinsics.checkNotNullParameter(sectionDTO, "<this>");
        TextDTO title = sectionDTO.getTitle();
        Object control = sectionDTO.getControl();
        Object mapControl = control != null ? mapControl(control) : null;
        Object mapComponent = mapComponent(sectionDTO.getComponent(), j11);
        Map<String, TokenizedTrackingInfo> trackingInfo = sectionDTO.getTrackingInfo();
        t tokenizedEvent$default = trackingInfo != null ? TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null) : null;
        String backgroundColor = sectionDTO.getBackgroundColor();
        if (z12) {
            z15 = z14;
        } else {
            z15 = !z11;
        }
        return new FiltersSectionVO.State(j11, title, mapControl, mapComponent, tokenizedEvent$default, backgroundColor, z11, z15, true, z12, z13);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<FiltersSectionVO.State> invoke(@NotNull FiltersDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        if (state.getAsyncServerErrorMessage() != null) {
            return K.f71697a;
        }
        List<FiltersDTO.SectionDTO> sections = state.getSections();
        ArrayList arrayList = new ArrayList(C7714v.z(sections, 10));
        int i11 = 0;
        for (Object obj : sections) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO$common_prodGoogleAllVendorsRelease((FiltersDTO.SectionDTO) obj, b.a(i11, widgetInfo.d(), "-section-"), state.getSections().size() == 1, i11 == 0, i11 == C7714v.P(state.getSections()), state.isFirstSectionSeparated()));
            i11 = i12;
        }
        return arrayList;
    }

    private final OpenRangeFilterVO toVO(FiltersDTO.SectionDTO.OpenRangeFilterDTO openRangeFilterDTO) {
        return new OpenRangeFilterVO(openRangeFilterDTO.getTitle(), openRangeFilterDTO.getCommon(), openRangeFilterDTO.getMinValue(), openRangeFilterDTO.getMaxValue(), openRangeFilterDTO.getStepPower(), openRangeFilterDTO.getStep(), e.b(new Object[]{openRangeFilterDTO.getSymbol()}, 1, " %s", "format(...)"), openRangeFilterDTO.getMaxValueSign(), openRangeFilterDTO.getFromValue(), openRangeFilterDTO.getToValue(), openRangeFilterDTO.getHideSeparator(), false, openRangeFilterDTO.getMinFieldTrackingInfo(), openRangeFilterDTO.getMaxFieldTrackingInfo(), openRangeFilterDTO.getMinSliderTrackingInfo(), openRangeFilterDTO.getMaxSliderTrackingInfo(), 2048, null);
    }

    private final TagsWithTitleFilterVO toVO(FiltersDTO.SectionDTO.TagsWithTitleFilterDTO tagsWithTitleFilterDTO) {
        List<FiltersDTO.SectionDTO.TagsWithTitleFilterDTO.TagsWithTitleSectionInTabDTO> filtersInTab = tagsWithTitleFilterDTO.getFiltersInTab();
        ArrayList arrayList = new ArrayList(C7714v.z(filtersInTab, 10));
        Iterator<T> it = filtersInTab.iterator();
        while (it.hasNext()) {
            List<FiltersDTO.SectionDTO.TagsWithTitleFilterDTO.TagsWithTitleSectionDTO> filters = ((FiltersDTO.SectionDTO.TagsWithTitleFilterDTO.TagsWithTitleSectionInTabDTO) it.next()).getFilters();
            ArrayList arrayList2 = new ArrayList(C7714v.z(filters, 10));
            for (FiltersDTO.SectionDTO.TagsWithTitleFilterDTO.TagsWithTitleSectionDTO tagsWithTitleSectionDTO : filters) {
                TextDTO title = tagsWithTitleSectionDTO.getTitle();
                arrayList2.add(new TagsWithTitleSectionInTabVO(title != null ? title.hashCode() : 0, tagsWithTitleSectionDTO.getTitle(), tagsWithTitleSectionDTO.getTags()));
            }
            arrayList.add(arrayList2);
        }
        return new TagsWithTitleFilterVO(arrayList, tagsWithTitleFilterDTO.getFilterTabs());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v3, types: [kotlin.collections.K] */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.util.List] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.util.ArrayList] */
    private final SliderWithLabelsSectionVO toVO(FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO sliderWithLabelsFilterDTO, long j11) {
        ?? r12;
        TabsDTO tabs = sliderWithLabelsFilterDTO.getTabs();
        List<FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO.SliderWithLabelsControlDTO> thereInputs = sliderWithLabelsFilterDTO.getThereInputs();
        ArrayList arrayList = new ArrayList(C7714v.z(thereInputs, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : thereInputs) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(toVO((FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO.SliderWithLabelsControlDTO) obj, j11, i12));
            i12 = i13;
        }
        List<FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO.SliderWithLabelsControlDTO> backInputs = sliderWithLabelsFilterDTO.getBackInputs();
        if (backInputs != null) {
            List<FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO.SliderWithLabelsControlDTO> list = backInputs;
            r12 = new ArrayList(C7714v.z(list, 10));
            for (Object obj2 : list) {
                int i14 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                r12.add(toVO((FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO.SliderWithLabelsControlDTO) obj2, j11, i11));
                i11 = i14;
            }
        } else {
            r12 = K.f71697a;
        }
        return new SliderWithLabelsSectionVO(tabs, arrayList, r12);
    }

    private final SliderWithLabelsSectionVO.SliderWithLabelsControlVO toVO(FiltersDTO.SectionDTO.SliderWithLabelsFilterDTO.SliderWithLabelsControlDTO sliderWithLabelsControlDTO, long j11, int i11) {
        return new SliderWithLabelsSectionVO.SliderWithLabelsControlVO(i11, sliderWithLabelsControlDTO.getTitle(), sliderWithLabelsControlDTO.getBadge(), sliderWithLabelsControlDTO.getBadgeTextTemplate(), sliderWithLabelsControlDTO.getBadgeTextMask(), toVO(sliderWithLabelsControlDTO.getSliderWithLabels(), j11), sliderWithLabelsControlDTO.getCommon());
    }

    private final SliderWithLabelsSectionVO.SliderWithLabelsControlVO.SliderWithLabelsVO toVO(SliderWithLabelsDTO sliderWithLabelsDTO, long j11) {
        Map<String, TokenizedTrackingInfo> trackingInfo;
        boolean isInRangeMode = sliderWithLabelsDTO.isInRangeMode();
        List<SliderWithLabelsDTO.PointDTO> points = sliderWithLabelsDTO.getPoints();
        ArrayList arrayList = new ArrayList(C7714v.z(points, 10));
        Iterator<T> it = points.iterator();
        while (it.hasNext()) {
            arrayList.add(toVO((SliderWithLabelsDTO.PointDTO) it.next(), sliderWithLabelsDTO.getMin(), sliderWithLabelsDTO.getMax()));
        }
        float min = sliderWithLabelsDTO.getMin();
        float max = sliderWithLabelsDTO.getMax();
        float initialMinValue = sliderWithLabelsDTO.getInitialMinValue();
        float initialMaxValue = sliderWithLabelsDTO.getInitialMaxValue();
        int step = sliderWithLabelsDTO.getStep();
        CommonControlSettings common = sliderWithLabelsDTO.getCommon();
        CommonControlSettings common2 = sliderWithLabelsDTO.getCommon();
        t mapToTokenizedEvent$default = (common2 == null || (trackingInfo = common2.getTrackingInfo()) == null) ? null : TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, Long.valueOf(j11), null, 2, null);
        CommonControlSettings common3 = sliderWithLabelsDTO.getCommon();
        AtomAction atomAction = common3 != null ? common3.toAtomAction() : null;
        return new SliderWithLabelsSectionVO.SliderWithLabelsControlVO.SliderWithLabelsVO(isInRangeMode, arrayList, min, max, initialMinValue, initialMaxValue, step, common, mapToTokenizedEvent$default, atomAction instanceof AtomAction.Refresh ? (AtomAction.Refresh) atomAction : null);
    }

    private final FilterSeekbar.Label toVO(SliderWithLabelsDTO.PointDTO pointDTO, int i11, int i12) {
        return new FilterSeekbar.Label(pointDTO.getLabel(), pointDTO.getValue(), ((pointDTO.getValue() - i11) / (i12 - i11)) * 100, null, null, 24, null);
    }
}
