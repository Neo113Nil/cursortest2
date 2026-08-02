package ru.ozon.app.android.checkoutcomposer.totalV3.presentation;

import Vg.d;
import a00.h;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.checkoutcomposer.totalV3.di.TotalV3WidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/totalV3/presentation/TotalV3ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalV3ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TotalV3ViewHolder> {
    final /* synthetic */ TotalV3ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalV3ViewMapper$holderProducer$1(TotalV3ViewMapper totalV3ViewMapper) {
        super(2);
        this.this$0 = totalV3ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TotalV3ViewHolder invoke(View view, ComposerReferences refs) {
        TotalV3WidgetComponent totalV3WidgetComponent;
        TotalV3WidgetComponent totalV3WidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TotalV3View totalV3View = (TotalV3View) view;
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final TotalV3ViewMapper totalV3ViewMapper = this.this$0;
        CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3ViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalV3WidgetComponent totalV3WidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalV3WidgetComponent3 = TotalV3ViewMapper.this.component;
                CreateAndPayViewModel createAndPayViewModel2 = totalV3WidgetComponent3.getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel2;
            }
        }).a(CreateAndPayViewModel.class);
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final TotalV3ViewMapper totalV3ViewMapper2 = this.this$0;
        TotalVisibilityViewModel totalVisibilityViewModel = (TotalVisibilityViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.totalV3.presentation.TotalV3ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalV3WidgetComponent totalV3WidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalV3WidgetComponent3 = TotalV3ViewMapper.this.component;
                TotalVisibilityViewModel totalVisibilityViewModel2 = totalV3WidgetComponent3.getTotalVisibilityViewModel();
                Intrinsics.g(totalVisibilityViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return totalVisibilityViewModel2;
            }
        }).a(TotalVisibilityViewModel.class);
        totalV3WidgetComponent = this.this$0.component;
        d customActionHandlersStoreFactory = totalV3WidgetComponent.getCustomActionHandlersStoreFactory();
        totalV3WidgetComponent2 = this.this$0.component;
        return new TotalV3ViewHolder(totalV3View, totalVisibilityViewModel, createAndPayViewModel, refs, totalV3WidgetComponent2.getTokenizedAnalytics(), customActionHandlersStoreFactory);
    }
}
