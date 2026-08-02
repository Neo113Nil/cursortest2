package ru.ozon.app.android.common.tabs.core;

import N10.h;
import Pc.a;
import Vg.d;
import android.view.View;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.common.tabs.data.TabsV2DTO;
import ru.ozon.app.android.common.tabs.presentation.TabsV2VO;
import ru.ozon.app.android.common.tabs.presentation.onboarding.TabsOnBoardingViewModel;
import ru.ozon.app.android.common.ui.tabs.R$layout;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.widgets.base.WidgetViewMapper;
import ru.ozon.app.android.utils.AppType;
import ru.ozon.composer.ui.widget.k;

@Metadata(d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 22\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001:\u00012BA\b\u0007\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u0007\u0012\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0017R\u001a\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u0018R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0019R\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u0018R6\u0010\u001e\u001a\u001e\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u00060\u001bj\u0002`\u001c\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u001d0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!R\u001a\u0010#\u001a\u00020\"8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R<\u0010+\u001a$\u0012\u0004\u0012\u00020'\u0012\u0004\u0012\u00020(\u0012\u0014\u0012\u0012\u0012\u0004\u0012\u00020\u00030)j\b\u0012\u0004\u0012\u00020\u0003`*0\u001a8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b+\u0010\u001f\u001a\u0004\b,\u0010!R\u001a\u0010.\u001a\u00020-8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101¨\u00063"}, d2 = {"Lru/ozon/app/android/common/tabs/core/TabsV2StickyViewMapper;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewMapper;", "Lru/ozon/app/android/common/tabs/data/TabsV2DTO;", "Lru/ozon/app/android/common/tabs/presentation/TabsV2VO;", "LVg/d;", "Lru/ozon/app/android/action/custom/CustomActionHandlersStoreFactory;", "customActionHandlersStoreFactory", "LPc/a;", "Lru/ozon/app/android/common/tabs/presentation/onboarding/TabsOnBoardingViewModel;", "viewModelProvider", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;", "setCookieAndRefreshFactory", "Lru/ozon/app/android/common/tabs/core/TabsV2ViewModel;", "tabsViewModelProvider", "Lru/ozon/app/android/utils/AppType;", "appType", "<init>", "(LVg/d;LPc/a;Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;LPc/a;Lru/ozon/app/android/utils/AppType;)V", "", "state", "", "canMap", "(Ljava/lang/Object;)Z", "LVg/d;", "LPc/a;", "Lru/ozon/app/android/common/actionHandlers/SetCookieAndRefreshHandler$SetCookieAndRefreshAssistedFactory;", "Lkotlin/Function2;", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "", "mapper", "Lkotlin/jvm/functions/Function2;", "getMapper", "()Lkotlin/jvm/functions/Function2;", "", "layout", "I", "getLayout", "()Ljava/lang/Integer;", "Landroid/view/View;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "holderProducer", "getHolderProducer", "LN10/h;", "stickyWidgetConfig", "LN10/h;", "getStickyWidgetConfig", "()LN10/h;", "Companion", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TabsV2StickyViewMapper extends WidgetViewMapper<TabsV2DTO, TabsV2VO> {

    @NotNull
    private final d customActionHandlersStoreFactory;

    @NotNull
    private final Function2<View, ComposerReferences, k<TabsV2VO>> holderProducer;
    private final int layout;

    @NotNull
    private final Function2<TabsV2DTO, l20.d, List<TabsV2VO>> mapper;

    @NotNull
    private final SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshFactory;

    @NotNull
    private final h stickyWidgetConfig;

    @NotNull
    private final a<TabsV2ViewModel> tabsViewModelProvider;

    @NotNull
    private final a<TabsOnBoardingViewModel> viewModelProvider;

    public TabsV2StickyViewMapper(@NotNull d customActionHandlersStoreFactory, @NotNull a<TabsOnBoardingViewModel> viewModelProvider, @NotNull SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshFactory, @NotNull a<TabsV2ViewModel> tabsViewModelProvider, @NotNull AppType appType) {
        Intrinsics.checkNotNullParameter(customActionHandlersStoreFactory, "customActionHandlersStoreFactory");
        Intrinsics.checkNotNullParameter(viewModelProvider, "viewModelProvider");
        Intrinsics.checkNotNullParameter(setCookieAndRefreshFactory, "setCookieAndRefreshFactory");
        Intrinsics.checkNotNullParameter(tabsViewModelProvider, "tabsViewModelProvider");
        Intrinsics.checkNotNullParameter(appType, "appType");
        this.customActionHandlersStoreFactory = customActionHandlersStoreFactory;
        this.viewModelProvider = viewModelProvider;
        this.setCookieAndRefreshFactory = setCookieAndRefreshFactory;
        this.tabsViewModelProvider = tabsViewModelProvider;
        this.mapper = new TabsV2Mapper(appType);
        this.layout = R$layout.tabs_v2;
        this.holderProducer = new TabsV2StickyViewMapper$holderProducer$1(this);
        Intrinsics.checkNotNullParameter("STICKY_TAG", "tag");
        this.stickyWidgetConfig = new h("STICKY_TAG", 6);
    }

    @Override // ru.ozon.composer.ui.widget.g, m20.InterfaceC8046a
    public boolean canMap(Object state) {
        TabsV2DTO tabsV2DTO = state instanceof TabsV2DTO ? (TabsV2DTO) state : null;
        if (tabsV2DTO != null) {
            return Intrinsics.d(tabsV2DTO.getIsSticky(), Boolean.TRUE);
        }
        return false;
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    /* renamed from: getHolderProducer */
    public Function2<View, ComposerReferences, k<TabsV2VO>> mo614getHolderProducer() {
        return this.holderProducer;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public Integer getLayout() {
        return Integer.valueOf(this.layout);
    }

    @Override // ru.ozon.app.android.composer.widgets.base.WidgetViewMapper
    @NotNull
    public Function2<TabsV2DTO, l20.d, List<TabsV2VO>> getMapper() {
        return this.mapper;
    }

    @Override // ru.ozon.composer.ui.widget.g
    @NotNull
    public h getStickyWidgetConfig() {
        return this.stickyWidgetConfig;
    }
}
