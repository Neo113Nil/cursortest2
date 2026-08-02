package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels;

import WZ.t;
import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.SliderWithLabelsSectionVO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.sliderWithLabels.adapter.SliderWithLabelsSectionAdapter;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolderKt;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J_\u0010\u0012\u001a\u00020\b2\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u00062\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\b0\u00062(\u0010\u0011\u001a$\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\b0\f¢\u0006\u0004\b\u0012\u0010\u0013J\u001b\u0010\u0017\u001a\u00020\b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u001b\u001a\u00020\b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u001d\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u001f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001eR$\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\t\u0010 R\u0014\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R:\u0010\u0011\u001a&\u0012\b\u0012\u00060\rj\u0002`\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\b\u0018\u00010\f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010$R\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010)\u001a\u00020(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionView;", "Landroid/widget/LinearLayout;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "actionHandler", "", "onTabSelect", "Lkotlin/Function2;", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "", "", "trackClickEvent", "bind", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/SliderWithLabelsSectionVO$SliderWithLabelsControlVO;", "sliders", "setSelectedSliders", "(Ljava/util/List;)V", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", DynamicElementDTO.TABS, "setSelectedTabs", "(Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "dp8", "I", "dp12", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/android/atom/tabs/TabsView;", "filterTabs", "Lru/ozon/uni/android/atom/tabs/TabsView;", "Lkotlin/jvm/functions/Function2;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/adapter/SliderWithLabelsSectionAdapter;", "slidersAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/sliderWithLabels/adapter/SliderWithLabelsSectionAdapter;", "Landroidx/recyclerview/widget/RecyclerView;", "slidersRV", "Landroidx/recyclerview/widget/RecyclerView;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class SliderWithLabelsSectionView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp12;
    private final int dp8;

    @NotNull
    private final TabsView filterTabs;

    @NotNull
    private final SliderWithLabelsSectionAdapter slidersAdapter;

    @NotNull
    private final RecyclerView slidersRV;
    private Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SliderWithLabelsSectionView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = UiExtKt.toPx(8, context);
        this.dp8 = px;
        int px2 = UiExtKt.toPx(12, context);
        this.dp12 = px2;
        TabsView tabsView = (TabsView) q.f64554a.i(N.b(TabsView.class), context);
        if (tabsView == null) {
            context2 = context;
            tabsView = new TabsView(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.bottomMargin = px2;
        tabsView.setLayoutParams(layoutParams);
        this.filterTabs = tabsView;
        SliderWithLabelsSectionAdapter sliderWithLabelsSectionAdapter = new SliderWithLabelsSectionAdapter(new SliderWithLabelsSectionView$slidersAdapter$1(this), new SliderWithLabelsSectionView$slidersAdapter$2(this));
        this.slidersAdapter = sliderWithLabelsSectionAdapter;
        RecyclerView recyclerView = new RecyclerView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px2;
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setAdapter(sliderWithLabelsSectionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 1, false));
        recyclerView.addItemDecoration(new SliderWithLabelsSectionItemDecoration(context2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.slidersRV = recyclerView;
        addView(tabsView);
        addView(recyclerView);
        setOrientation(1);
        ViewExtKt.updatePadding$default(this, 0, px, 0, 0, 13, null);
    }

    public final void bind(@NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull Function1<? super Integer, Unit> onTabSelect, @NotNull Function2<? super t, ? super Map<String, String>, Unit> trackClickEvent) {
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(onTabSelect, "onTabSelect");
        Intrinsics.checkNotNullParameter(trackClickEvent, "trackClickEvent");
        this.actionHandler = actionHandler;
        this.trackClickEvent = trackClickEvent;
        this.filterTabs.setSelectedTabListener(onTabSelect);
    }

    public final void setSelectedSliders(@NotNull List<SliderWithLabelsSectionVO.SliderWithLabelsControlVO> sliders) {
        Intrinsics.checkNotNullParameter(sliders, "sliders");
        this.slidersAdapter.submitList(sliders);
    }

    public final void setSelectedTabs(TabsDTO tabs) {
        TabsHolderKt.bindOrGone$default(this.filterTabs, tabs, null, 2, null);
    }
}
