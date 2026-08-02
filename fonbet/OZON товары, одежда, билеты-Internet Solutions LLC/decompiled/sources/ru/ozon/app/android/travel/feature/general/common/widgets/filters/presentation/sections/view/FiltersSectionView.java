package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view;

import WZ.t;
import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.widget.LinearLayout;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.FiltersSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.FiltersSectionComponentView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.TagsWithTitleSectionInTabVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.header.FiltersSectionHeaderView;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0014\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005Jg\u0010\u0014\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\n0\b2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\n0\b2(\u0010\u0013\u001a$\u0012\b\u0012\u00060\u000fj\u0002`\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0012\u0012\u0004\u0012\u00020\u00120\u0011\u0012\u0004\u0012\u00020\n0\u000e¢\u0006\u0004\b\u0014\u0010\u0015J\u001b\u0010\u0019\u001a\u00020\n2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0017\u0010\u001d\u001a\u00020\n2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u001b\u0010!\u001a\u00020\n2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u0016¢\u0006\u0004\b!\u0010\u001aR\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010%\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010*\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u0014\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010/\u001a\u00020.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103¨\u00064"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/FiltersSectionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;", "item", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "onTabSelect", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "", "trackClickEvent", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/FiltersSectionVO$State;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "tags", "setTagsWithTitleFilter", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "setTabsWithTitleFilter", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "sliders", "setSliderWithLabels", "", "dp24f", "F", "defaultBackgroundColor", "I", "", "bottomRoundedCornerRadii", "[F", "fullRoundedCornerRadii", "Landroid/graphics/drawable/GradientDrawable;", "gradientDrawable", "Landroid/graphics/drawable/GradientDrawable;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/header/FiltersSectionHeaderView;", "headerFSHV", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/header/FiltersSectionHeaderView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/FiltersSectionComponentView;", "componentFSCV", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/FiltersSectionComponentView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersSectionView extends LinearLayout {

    @NotNull
    private final float[] bottomRoundedCornerRadii;

    @NotNull
    private final FiltersSectionComponentView componentFSCV;
    private final int defaultBackgroundColor;
    private final float dp24f;

    @NotNull
    private final float[] fullRoundedCornerRadii;

    @NotNull
    private final GradientDrawable gradientDrawable;

    @NotNull
    private final FiltersSectionHeaderView headerFSHV;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FiltersSectionView(@NotNull Context context) {
        super(context);
        Intrinsics.checkNotNullParameter(context, "context");
        float pxF = ResourceExtKt.toPxF(24, context);
        this.dp24f = pxF;
        this.defaultBackgroundColor = ThemeExtKt.themeColor(context, R$attr.layerFloor1);
        this.bottomRoundedCornerRadii = new float[]{0.0f, 0.0f, 0.0f, 0.0f, pxF, pxF, pxF, pxF};
        float[] fArr = new float[8];
        for (int i11 = 0; i11 < 8; i11++) {
            fArr[i11] = this.dp24f;
        }
        this.fullRoundedCornerRadii = fArr;
        GradientDrawable gradientDrawable = new GradientDrawable();
        this.gradientDrawable = gradientDrawable;
        FiltersSectionHeaderView filtersSectionHeaderView = new FiltersSectionHeaderView(context);
        filtersSectionHeaderView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(filtersSectionHeaderView);
        this.headerFSHV = filtersSectionHeaderView;
        FiltersSectionComponentView filtersSectionComponentView = new FiltersSectionComponentView(context);
        filtersSectionComponentView.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        addView(filtersSectionComponentView);
        this.componentFSCV = filtersSectionComponentView;
        setBackground(gradientDrawable);
        setOrientation(1);
    }

    public final void bind(@NotNull FiltersSectionVO.State item, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Integer, Unit> onTabSelect, @NotNull Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTabSelect, "onTabSelect");
        Intrinsics.checkNotNullParameter(trackClickEvent, "trackClickEvent");
        this.headerFSHV.bindOrGone(item.getTitle(), item.getControl(), actionHandler);
        this.componentFSCV.bindOrGone(item.getComponent(), item.getTitle() != null, item.getIsSingleSection(), actionHandler, onTabSelect, trackClickEvent);
        GradientDrawable gradientDrawable = this.gradientDrawable;
        gradientDrawable.setCornerRadii(item.getHasTopSeparator() ? this.fullRoundedCornerRadii : this.bottomRoundedCornerRadii);
        StyleParser styleParser = StyleParser.INSTANCE;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        Integer parseColor = styleParser.parseColor(context, item.getBackgroundColor());
        gradientDrawable.setColor(parseColor != null ? parseColor.intValue() : this.defaultBackgroundColor);
    }

    public final void setSliderWithLabels(@NotNull List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO> sliders) {
        Intrinsics.checkNotNullParameter(sliders, "sliders");
        this.componentFSCV.setSliderWithLabels(sliders);
    }

    public final void setTabsWithTitleFilter(TabsDTO tabs) {
        this.componentFSCV.setTabsWithTitleFilter(tabs);
    }

    public final void setTagsWithTitleFilter(@NotNull List<TagsWithTitleSectionInTabVO> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.componentFSCV.setTagsWithTitleFilter(tags);
    }
}
