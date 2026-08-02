package ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.core;

import Vg.c;
import WZ.l;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.composer.widgets.v2.onboarding.presentation.BaseOnBoardingViewModel;
import ru.ozon.app.android.pdp.view.animationsaleblock.SaleBlockViewModel;
import ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.presentation.PriceActionsViewHolder;
import ru.ozon.app.android.platform.customActionHandlers.composerActionWithRefresh.ComposerActionWithRefreshCustomActionHandler;
import ru.ozon.app.android.utils.AppType;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/priceBlock/priceActions/presentation/PriceActionsViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class PriceActionsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, PriceActionsViewHolder> {
    final /* synthetic */ PriceActionsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    PriceActionsViewMapper$holderProducer$1(PriceActionsViewMapper priceActionsViewMapper) {
        super(2);
        this.this$0 = priceActionsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final PriceActionsViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        c create = this.this$0.component().getCustomActionHandlerStoreFactory().create(ComposerActionWithRefreshCustomActionHandler.class);
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        HandlersInhibitor handlersInhibitor = this.this$0.component().getHandlersInhibitor();
        SaleBlockViewModel viewModelSaleBlock = this.this$0.component().getViewModelSaleBlock();
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final PriceActionsViewMapper priceActionsViewMapper = this.this$0;
        return new PriceActionsViewHolder(view, refs, tokenizedAnalytics, create, handlersInhibitor, viewModelSaleBlock, (BaseOnBoardingViewModel.Default) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.priceBlock.priceActions.core.PriceActionsViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                BaseOnBoardingViewModel.Default pOnBoardingViewModel = PriceActionsViewMapper.this.component().getPOnBoardingViewModel();
                Intrinsics.g(pOnBoardingViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pOnBoardingViewModel;
            }
        }).a(BaseOnBoardingViewModel.Default.class), this.this$0.component().getAppType() == AppType.SELECT);
    }
}
