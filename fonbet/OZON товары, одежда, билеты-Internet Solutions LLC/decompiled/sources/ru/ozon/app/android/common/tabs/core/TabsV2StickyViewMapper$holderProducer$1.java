package ru.ozon.app.android.common.tabs.core;

import Pc.a;
import Vg.c;
import Vg.d;
import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.common.actionHandlers.SetCookieAndRefreshHandler;
import ru.ozon.app.android.common.tabs.presentation.TabsV2ViewHolder;
import ru.ozon.app.android.common.tabs.presentation.onboarding.TabsOnBoardingViewModel;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.platform.customActionHandlers.ReloadFromCurrentWidgetPageActionHandler;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/common/tabs/presentation/TabsV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TabsV2StickyViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TabsV2ViewHolder> {
    final /* synthetic */ TabsV2StickyViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TabsV2StickyViewMapper$holderProducer$1(TabsV2StickyViewMapper tabsV2StickyViewMapper) {
        super(2);
        this.this$0 = tabsV2StickyViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TabsV2ViewHolder invoke(View view, ComposerReferences refs) {
        d dVar;
        final a aVar;
        SetCookieAndRefreshHandler.SetCookieAndRefreshAssistedFactory setCookieAndRefreshAssistedFactory;
        final a aVar2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        dVar = this.this$0.customActionHandlersStoreFactory;
        c create = dVar.create(ReloadFromCurrentWidgetPageActionHandler.class);
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        aVar = this.this$0.viewModelProvider;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.common.tabs.core.TabsV2StickyViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TabsOnBoardingViewModel tabsOnBoardingViewModel = (TabsOnBoardingViewModel) a.this.get();
                Intrinsics.g(tabsOnBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tabsOnBoardingViewModel;
            }
        }).a(TabsOnBoardingViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        TabsOnBoardingViewModel tabsOnBoardingViewModel = (TabsOnBoardingViewModel) a11;
        setCookieAndRefreshAssistedFactory = this.this$0.setCookieAndRefreshFactory;
        SetCookieAndRefreshHandler create2 = setCookieAndRefreshAssistedFactory.create(refs);
        h viewModelOwnerProvider2 = refs.getViewModelOwnerProvider();
        aVar2 = this.this$0.tabsViewModelProvider;
        w0 a12 = new z0(viewModelOwnerProvider2.b(), new z0.c() { // from class: ru.ozon.app.android.common.tabs.core.TabsV2StickyViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                TabsV2ViewModel tabsV2ViewModel = (TabsV2ViewModel) a.this.get();
                Intrinsics.g(tabsV2ViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return tabsV2ViewModel;
            }
        }).a(TabsV2ViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "sharedViewModel(...)");
        return new TabsV2ViewHolder(view, create, refs, tabsOnBoardingViewModel, create2, (TabsV2ViewModel) a12);
    }
}
