package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks;

import android.content.Context;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import gk0.q;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.adapter.TagsWithTitleSectionAdapter;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.tagBlocks.adapter.TagsWithTitleSectionDecoration;
import ru.ozon.uni.android.atom.tabs.TabsView;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.tabs.TabsDTO;
import ru.ozon.uni.atoms.v3.holders.tabs.TabsHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J.\u0010\u0012\u001a\u00020\u000b2\u0012\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b0\t2\u0012\u0010\u0014\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u000b0\tJ\u0014\u0010\u0015\u001a\u00020\u000b2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u0017J\u0010\u0010\u0019\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bR\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u001c\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u000fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleFilterView;", "Landroid/widget/LinearLayout;", "context", "Landroid/content/Context;", "<init>", "(Landroid/content/Context;)V", "dp16", "", "actionHandler", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "", "filtersAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/adapter/TagsWithTitleSectionAdapter;", "filterTabs", "Lru/ozon/uni/android/atom/tabs/TabsView;", "filtersSection", "Landroidx/recyclerview/widget/RecyclerView;", "bind", "tagsActionHandler", "onTabSelect", "setSelectedTags", "tags", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/tagBlocks/TagsWithTitleSectionInTabVO;", "setSelectedTabs", DynamicElementDTO.TABS, "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TagsWithTitleFilterView extends LinearLayout {
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int dp16;

    @NotNull
    private final TabsView filterTabs;

    @NotNull
    private final TagsWithTitleSectionAdapter filtersAdapter;

    @NotNull
    private final RecyclerView filtersSection;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TagsWithTitleFilterView(@NotNull Context context) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        int px = ResourceExtKt.toPx(16, context);
        this.dp16 = px;
        TagsWithTitleSectionAdapter tagsWithTitleSectionAdapter = new TagsWithTitleSectionAdapter(new TagsWithTitleFilterView$filtersAdapter$1(this));
        this.filtersAdapter = tagsWithTitleSectionAdapter;
        TabsView tabsView = (TabsView) q.f64554a.i(N.b(TabsView.class), context);
        if (tabsView == null) {
            context2 = context;
            tabsView = new TabsView(context2, null, 0, 0, 14, null);
        } else {
            context2 = context;
        }
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.topMargin = px;
        tabsView.setLayoutParams(layoutParams);
        this.filterTabs = tabsView;
        RecyclerView recyclerView = new RecyclerView(context2);
        LinearLayout.LayoutParams layoutParams2 = new LinearLayout.LayoutParams(-1, -2);
        layoutParams2.topMargin = px;
        recyclerView.setLayoutParams(layoutParams2);
        recyclerView.setAdapter(tagsWithTitleSectionAdapter);
        recyclerView.setLayoutManager(new LinearLayoutManager(context2, 1, false));
        recyclerView.addItemDecoration(new TagsWithTitleSectionDecoration(context2));
        recyclerView.setNestedScrollingEnabled(false);
        recyclerView.setItemAnimator(null);
        this.filtersSection = recyclerView;
        setOrientation(1);
        setPadding(px, 0, px, 0);
        addView(tabsView);
        addView(recyclerView);
    }

    public final void bind(@NotNull Function1<? super AtomAction, Unit> tagsActionHandler, @NotNull Function1<? super Integer, Unit> onTabSelect) {
        Intrinsics.checkNotNullParameter(tagsActionHandler, "tagsActionHandler");
        Intrinsics.checkNotNullParameter(onTabSelect, "onTabSelect");
        this.actionHandler = tagsActionHandler;
        this.filterTabs.setSelectedTabListener(onTabSelect);
    }

    public final void setSelectedTabs(TabsDTO tabs) {
        TabsHolderKt.bindOrGone$default(this.filterTabs, tabs, null, 2, null);
    }

    public final void setSelectedTags(@NotNull List<TagsWithTitleSectionInTabVO> tags) {
        Intrinsics.checkNotNullParameter(tags, "tags");
        this.filtersAdapter.submitList(tags);
    }
}
