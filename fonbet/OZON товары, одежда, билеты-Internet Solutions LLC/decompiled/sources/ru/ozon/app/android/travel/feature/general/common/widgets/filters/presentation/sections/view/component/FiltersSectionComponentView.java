package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component;

import Sc.InterfaceC4008j;
import Sc.k;
import WZ.t;
import android.content.Context;
import android.view.View;
import android.widget.FrameLayout;
import androidx.core.content.a;
import com.google.android.flexbox.FlexboxLayout;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.R$drawable;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.data.FiltersDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleFilterView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleSectionInTabVO;
import ru.ozon.uni.android.controls.tag.TagButtonView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.controls.tag.TagButtonDTO;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.v3.holders.controls.tag.TagButtonHolderKt;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jy\u0010\u0017\u001a\u00020\r2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\b2\u0012\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r0\u000b2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\r0\u000b2(\u0010\u0016\u001a$\u0012\b\u0012\u00060\u0012j\u0002`\u0013\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u00150\u0014\u0012\u0004\u0012\u00020\r0\u0011¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u001c\u001a\u00020\r2\f\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0019¢\u0006\u0004\b\u001c\u0010\u001dJ\u0017\u0010 \u001a\u00020\r2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e¢\u0006\u0004\b \u0010!J\u001b\u0010$\u001a\u00020\r2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\u0019¢\u0006\u0004\b$\u0010\u001dR\u0014\u0010%\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010&R\u0014\u0010(\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010&R\u001b\u0010.\u001a\u00020)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u0002000/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00107\u001a\u0002068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u001b\u0010=\u001a\u0002098BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b:\u0010+\u001a\u0004\b;\u0010<R\u0014\u0010?\u001a\u00020>8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010B\u001a\u00020A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bB\u0010CR\u0018\u0010E\u001a\u0004\u0018\u00010D8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u0010F¨\u0006G"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/FiltersSectionComponentView;", "Landroid/widget/FrameLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "component", "", "hasTitle", "isSingleSection", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "onTabSelect", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "", "trackClickEvent", "bindOrGone", "(Ljava/lang/Object;ZZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "tags", "setTagsWithTitleFilter", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "setTabsWithTitleFilter", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "sliders", "setSliderWithLabels", "dp8", "I", "dp16", "dp20", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView;", "openRangeFilterORF$delegate", "LSc/j;", "getOpenRangeFilterORF", "()Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView;", "openRangeFilterORF", "", "Lru/ozon/uni/android/controls/tag/TagButtonView;", "cachedTagButtonViews", "Ljava/util/List;", "Lcom/google/android/flexbox/FlexboxLayout;", "tagsFilterFL", "Lcom/google/android/flexbox/FlexboxLayout;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cellsAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "cellsVAL$delegate", "getCellsVAL", "()Lru/ozon/uni/atoms/af/layout/VerticalAtomsLayout;", "cellsVAL", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterView;", "tagsWithTitleFilterViewTWTFV", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionView;", "sliderWithLabelsSection", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionView;", "Landroid/view/View;", "currentVisibleView", "Landroid/view/View;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersSectionComponentView extends FrameLayout {

    @NotNull
    private final List<TagButtonView> cachedTagButtonViews;

    @NotNull
    private final AtomsAdapter cellsAdapter;

    /* renamed from: cellsVAL$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j cellsVAL;
    private View currentVisibleView;
    private final int dp16;
    private final int dp20;
    private final int dp8;

    /* renamed from: openRangeFilterORF$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j openRangeFilterORF;

    @NotNull
    private final SliderWithLabelsSectionView sliderWithLabelsSection;

    @NotNull
    private final FlexboxLayout tagsFilterFL;

    @NotNull
    private final TagsWithTitleFilterView tagsWithTitleFilterViewTWTFV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersSectionComponentView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp20 = ResourceExtKt.toPx(20, context);
        this.openRangeFilterORF = k.b(new FiltersSectionComponentView$openRangeFilterORF$2(context, this));
        this.cachedTagButtonViews = new ArrayList();
        FlexboxLayout flexboxLayout = new FlexboxLayout(context);
        flexboxLayout.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        flexboxLayout.setFlexWrap(1);
        flexboxLayout.setFlexDirection(0);
        flexboxLayout.setShowDivider(2);
        flexboxLayout.setDividerDrawable(a.getDrawable(context, R$drawable.divider_tag_item));
        ViewExtKt.gone(flexboxLayout);
        addView(flexboxLayout);
        this.tagsFilterFL = flexboxLayout;
        this.cellsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        this.cellsVAL = k.b(new FiltersSectionComponentView$cellsVAL$2(context, this));
        TagsWithTitleFilterView tagsWithTitleFilterView = new TagsWithTitleFilterView(context);
        tagsWithTitleFilterView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewExtKt.gone(tagsWithTitleFilterView);
        addView(tagsWithTitleFilterView);
        this.tagsWithTitleFilterViewTWTFV = tagsWithTitleFilterView;
        SliderWithLabelsSectionView sliderWithLabelsSectionView = new SliderWithLabelsSectionView(context);
        sliderWithLabelsSectionView.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        ViewExtKt.gone(sliderWithLabelsSectionView);
        addView(sliderWithLabelsSectionView);
        this.sliderWithLabelsSection = sliderWithLabelsSectionView;
    }

    private final VerticalAtomsLayout getCellsVAL() {
        return (VerticalAtomsLayout) this.cellsVAL.getValue();
    }

    private final OpenRangeFilterView getOpenRangeFilterORF() {
        return (OpenRangeFilterView) this.openRangeFilterORF.getValue();
    }

    public final void bindOrGone(Object component, boolean hasTitle, boolean isSingleSection, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Integer, Unit> onTabSelect, @NotNull Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent) {
        int i11;
        int i12;
        View view;
        int i13;
        int i14;
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTabSelect, "onTabSelect");
        Intrinsics.checkNotNullParameter(trackClickEvent, "trackClickEvent");
        if (component == null) {
            View view2 = this.currentVisibleView;
            if (view2 != null) {
                if (view2 != null) {
                    ViewExtKt.gone(view2);
                }
                this.currentVisibleView = null;
            }
            ViewExtKt.gone(this);
            return;
        }
        if (component instanceof OpenRangeFilterVO) {
            View openRangeFilterORF = getOpenRangeFilterORF();
            getOpenRangeFilterORF().bind((OpenRangeFilterVO) component, actionHandler);
            i13 = this.dp16;
            i11 = i13;
            view = openRangeFilterORF;
            i14 = isSingleSection ? this.dp20 : i13;
            i12 = i11;
        } else {
            i11 = 0;
            if (component instanceof FiltersDTO.SectionDTO.TagsFilterDTO) {
                View view3 = this.tagsFilterFL;
                FiltersDTO.SectionDTO.TagsFilterDTO tagsFilterDTO = (FiltersDTO.SectionDTO.TagsFilterDTO) component;
                int size = tagsFilterDTO.getTags().size();
                int childCount = this.tagsFilterFL.getChildCount();
                if (this.cachedTagButtonViews.size() < size) {
                    int size2 = size - this.cachedTagButtonViews.size();
                    for (int i15 = 0; i15 < size2; i15++) {
                        Context context = getContext();
                        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                        TagButtonView tagButtonView = new TagButtonView(context, null, 0, 0, 14, null);
                        tagButtonView.setLayoutParams(new FrameLayout.LayoutParams(-2, -2));
                        this.cachedTagButtonViews.add(tagButtonView);
                    }
                }
                if (size > childCount) {
                    while (childCount < size) {
                        this.tagsFilterFL.addView(this.cachedTagButtonViews.get(childCount));
                        childCount++;
                    }
                } else if (size < childCount) {
                    this.tagsFilterFL.removeViews(size, childCount - size);
                }
                for (Object obj : tagsFilterDTO.getTags()) {
                    int i16 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    TagButtonDTO tagButtonDTO = (TagButtonDTO) obj;
                    View childAt = this.tagsFilterFL.getChildAt(i11);
                    TagButtonView tagButtonView2 = childAt instanceof TagButtonView ? (TagButtonView) childAt : null;
                    if (tagButtonView2 != null) {
                        TagButtonHolderKt.bind(tagButtonView2, tagButtonDTO, actionHandler);
                    }
                    i11 = i16;
                }
                i13 = this.dp16;
                i12 = i13;
                i11 = i12;
                view = view3;
                i14 = i11;
            } else if (component instanceof FiltersDTO.SectionDTO.CellListFilterDTO) {
                View cellsVAL = getCellsVAL();
                AtomsAdapter atomsAdapter = this.cellsAdapter;
                Context context2 = getContext();
                Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
                atomsAdapter.bind(context2, ((FiltersDTO.SectionDTO.CellListFilterDTO) component).getCells());
                atomsAdapter.setOnAction(actionHandler);
                view = cellsVAL;
                i12 = 0;
                i14 = 0;
                i11 = hasTitle ? this.dp8 : 0;
                i13 = 0;
            } else if (component instanceof TagsWithTitleFilterVO) {
                TagsWithTitleFilterView tagsWithTitleFilterView = this.tagsWithTitleFilterViewTWTFV;
                tagsWithTitleFilterView.bind(actionHandler, onTabSelect);
                view = tagsWithTitleFilterView;
                i13 = 0;
                i12 = 0;
                i14 = 0;
            } else {
                if (!(component instanceof SliderWithLabelsSectionVO)) {
                    ViewExtKt.gone(this);
                    return;
                }
                SliderWithLabelsSectionView sliderWithLabelsSectionView = this.sliderWithLabelsSection;
                sliderWithLabelsSectionView.bind(actionHandler, onTabSelect, trackClickEvent);
                i12 = this.dp16;
                view = sliderWithLabelsSectionView;
                i13 = i12;
                i14 = i13;
            }
        }
        if (!Intrinsics.d(this.currentVisibleView, view)) {
            View view4 = this.currentVisibleView;
            if (view4 != null) {
                ViewExtKt.gone(view4);
            }
            ViewExtKt.show(view);
            this.currentVisibleView = view;
        }
        if (getPaddingLeft() != i13 || getPaddingTop() != i11 || getPaddingRight() != i12 || getPaddingBottom() != i14) {
            setPadding(i13, i11, i12, i14);
        }
        ViewExtKt.show(this);
    }

    public final void setSliderWithLabels(@NotNull List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO> sliders) {
        Intrinsics.checkNotNullParameter(sliders, "sliders");
        this.sliderWithLabelsSection.setSelectedSliders(sliders);
    }

    public final void setTabsWithTitleFilter(TabsDTO tabs) {
        if (this.tagsWithTitleFilterViewTWTFV.getVisibility() == 0) {
            this.tagsWithTitleFilterViewTWTFV.setSelectedTabs(tabs);
        } else if (this.sliderWithLabelsSection.getVisibility() == 0) {
            this.sliderWithLabelsSection.setSelectedTabs(tabs);
        }
    }

    public final void setTagsWithTitleFilter(@NotNull List<TagsWithTitleSectionInTabVO> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.tagsWithTitleFilterViewTWTFV.setSelectedTags(tags);
    }
}
