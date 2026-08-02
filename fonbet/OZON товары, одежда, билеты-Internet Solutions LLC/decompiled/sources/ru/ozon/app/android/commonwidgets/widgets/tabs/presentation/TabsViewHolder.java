package ru.ozon.app.android.commonwidgets.widgets.tabs.presentation;

import Sc.o;
import WZ.l;
import WZ.t;
import android.view.View;
import com.google.android.material.tabs.TabLayout;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.common.commonwidgets.databinding.WidgetCommonTabsBinding;
import ru.ozon.app.android.commonwidgets.widgets.tabs.core.TabsViewMapper;
import ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsVO;
import ru.ozon.app.android.composer.widgets.base.WidgetViewHolderKt;
import ru.ozon.app.android.utils.UriExtKt;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u0003B'\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\u0010\b\u001a\u00060\u0006j\u0002`\u0007\u0012\n\u0010\u000b\u001a\u00060\tj\u0002`\n¢\u0006\u0004\b\f\u0010\rJ#\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u0010H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J+\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000e\u001a\u00020\u00022\n\u0010\u0011\u001a\u00060\u000fj\u0002`\u00102\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0013\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0018\u0010\b\u001a\u00060\u0006j\u0002`\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "Landroid/view/View;", "containerView", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "controller", "LWZ/l;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedAnalytics;", "tokenizedAnalytics", "<init>", "(Landroid/view/View;Ll10/b;LWZ/l;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "", "bind", "(Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;Ll20/d;)V", "", "payload", "(Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsVO;Ll20/d;Ljava/lang/Object;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Ll10/b;", "Lru/ozon/app/android/common/commonwidgets/databinding/WidgetCommonTabsBinding;", "binding", "Lru/ozon/app/android/common/commonwidgets/databinding/WidgetCommonTabsBinding;", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsView;", "tabView", "Lru/ozon/app/android/commonwidgets/widgets/tabs/presentation/TabsView;", "widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class TabsViewHolder extends k<TabsVO> {

    @NotNull
    private final WidgetCommonTabsBinding binding;

    @NotNull
    private final View containerView;

    @NotNull
    private final InterfaceC7851b controller;

    @NotNull
    private final TabsView tabView;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TabsViewHolder(@NotNull View containerView, @NotNull InterfaceC7851b controller, @NotNull final l tokenizedAnalytics) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(controller, "controller");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        this.containerView = containerView;
        this.controller = controller;
        final WidgetCommonTabsBinding bind = WidgetCommonTabsBinding.bind(containerView);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        this.binding = bind;
        TabLayout tabsTl = bind.tabsTl;
        Intrinsics.checkNotNullExpressionValue(tabsTl, "tabsTl");
        this.tabView = new TabsView(tabsTl);
        TabLayout tabsTl2 = bind.tabsTl;
        Intrinsics.checkNotNullExpressionValue(tabsTl2, "tabsTl");
        tabsTl2.c(new TabLayout.b() { // from class: ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsViewHolder$_init_$lambda$1$$inlined$addTabSelectedListeners$default$1
            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabReselected(TabLayout.e tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabSelected(final TabLayout.e tab) {
                InterfaceC7851b interfaceC7851b;
                Intrinsics.checkNotNullParameter(tab, "tab");
                TabsVO boundedData = TabsViewHolder.this.getBoundedData();
                Object e11 = tab.e();
                Intrinsics.g(e11, "null cannot be cast to non-null type ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsVO.TabsItemVO");
                TabsVO.TabsItemVO tabsItemVO = (TabsVO.TabsItemVO) e11;
                if (boundedData == null || Intrinsics.d(tabsItemVO.getDeeplink(), boundedData.getSelectedDeeplink())) {
                    final WidgetCommonTabsBinding widgetCommonTabsBinding = bind;
                    widgetCommonTabsBinding.tabsTl.post(new Runnable() { // from class: ru.ozon.app.android.commonwidgets.widgets.tabs.presentation.TabsViewHolder$1$1$1
                        @Override // java.lang.Runnable
                        public final void run() {
                            WidgetCommonTabsBinding.this.tabsTl.smoothScrollTo((int) tab.f58580g.getX(), WidgetCommonTabsBinding.this.tabsTl.getScrollY());
                        }
                    });
                    return;
                }
                interfaceC7851b = TabsViewHolder.this.controller;
                InterfaceC7851b.a.e(interfaceC7851b, UriExtKt.removeSchema(tabsItemVO.getDeeplink()), null, null, 6);
                t tokenizedEvent = tabsItemVO.getTokenizedEvent();
                if (tokenizedEvent != null) {
                    TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(tokenizedAnalytics, tokenizedEvent, null, 2, null);
                }
            }

            @Override // com.google.android.material.tabs.TabLayout.b
            public void onTabUnselected(TabLayout.e tab) {
                Intrinsics.checkNotNullParameter(tab, "tab");
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TabsVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        bind(item, info, (Object) Unit.f71690a);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull TabsVO item, @NotNull d info, @NotNull Object payload) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        Intrinsics.checkNotNullParameter(payload, "payload");
        WidgetViewHolderKt.getEMPTY_PAYLOAD();
        if (Intrinsics.d(payload, Unit.f71690a)) {
            this.tabView.setupTabs(item.getTabs(), item.getIsScrollable(), item.getScrollableMinWidth());
            return;
        }
        for (TabsViewMapper.TabsPayload tabsPayload : (List) payload) {
            TabsVO.TabsItemVO tabsItemVO = item.getTabs().get(tabsPayload.getTabIndex());
            if (tabsPayload instanceof TabsViewMapper.TabsPayload.Title) {
                this.tabView.updateTitle(((TabsViewMapper.TabsPayload.Title) tabsPayload).getTabIndex(), tabsItemVO.getTitle());
            } else if (tabsPayload instanceof TabsViewMapper.TabsPayload.Badge) {
                this.tabView.updateBadge(((TabsViewMapper.TabsPayload.Badge) tabsPayload).getTabIndex(), tabsItemVO.getBadge(), tabsItemVO.getBadgeColor());
            } else if (tabsPayload instanceof TabsViewMapper.TabsPayload.BadgeColor) {
                this.tabView.updateBadge(((TabsViewMapper.TabsPayload.BadgeColor) tabsPayload).getTabIndex(), tabsItemVO.getBadge(), tabsItemVO.getBadgeColor());
            } else if (tabsPayload instanceof TabsViewMapper.TabsPayload.Selection) {
                this.tabView.updateSelection(((TabsViewMapper.TabsPayload.Selection) tabsPayload).getTabIndex(), tabsItemVO.getIsSelected());
            } else if (tabsPayload instanceof TabsViewMapper.TabsPayload.Deeplink) {
                this.tabView.updateDeeplink(((TabsViewMapper.TabsPayload.Deeplink) tabsPayload).getTabIndex(), tabsItemVO.getDeeplink());
            } else if (tabsPayload instanceof TabsViewMapper.TabsPayload.ScrollingMode) {
                this.tabView.updateScrollingMode(item.getIsScrollable());
            } else {
                if (!(tabsPayload instanceof TabsViewMapper.TabsPayload.MinWidth)) {
                    throw new o();
                }
                this.tabView.updateMinWidth(item.getScrollableMinWidth(), item.getIsScrollable());
            }
        }
    }
}
