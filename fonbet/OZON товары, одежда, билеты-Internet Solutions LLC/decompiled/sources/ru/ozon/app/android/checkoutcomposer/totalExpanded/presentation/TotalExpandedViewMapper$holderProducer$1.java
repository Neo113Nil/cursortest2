package ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation;

import Vg.d;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.checkoutcomposer.totalExpanded.di.TotalExpandedWidgetComponent;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.payment.ui.createorder.CreateAndPayViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutcomposer/totalExpanded/presentation/TotalExpandedViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TotalExpandedViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TotalExpandedViewHolder> {
    final /* synthetic */ TotalExpandedViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TotalExpandedViewMapper$holderProducer$1(TotalExpandedViewMapper totalExpandedViewMapper) {
        super(2);
        this.this$0 = totalExpandedViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TotalExpandedViewHolder invoke(View view, ComposerReferences refs) {
        TotalExpandedWidgetComponent totalExpandedWidgetComponent;
        TotalExpandedWidgetComponent totalExpandedWidgetComponent2;
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        TotalExpandedView totalExpandedView = (TotalExpandedView) view;
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final TotalExpandedViewMapper totalExpandedViewMapper = this.this$0;
        CreateAndPayViewModel createAndPayViewModel = (CreateAndPayViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutcomposer.totalExpanded.presentation.TotalExpandedViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                TotalExpandedWidgetComponent totalExpandedWidgetComponent3;
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                totalExpandedWidgetComponent3 = TotalExpandedViewMapper.this.component;
                CreateAndPayViewModel createAndPayViewModel2 = totalExpandedWidgetComponent3.getCreateAndPayViewModel();
                Intrinsics.g(createAndPayViewModel2, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return createAndPayViewModel2;
            }
        }).a(CreateAndPayViewModel.class);
        totalExpandedWidgetComponent = this.this$0.component;
        d customActionHandlersStoreFactory = totalExpandedWidgetComponent.getCustomActionHandlersStoreFactory();
        totalExpandedWidgetComponent2 = this.this$0.component;
        return new TotalExpandedViewHolder(totalExpandedView, createAndPayViewModel, refs, totalExpandedWidgetComponent2.getTokenizedAnalytics(), customActionHandlersStoreFactory);
    }
}
