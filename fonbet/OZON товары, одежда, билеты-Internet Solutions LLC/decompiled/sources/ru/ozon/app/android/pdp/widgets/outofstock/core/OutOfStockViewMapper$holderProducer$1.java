package ru.ozon.app.android.pdp.widgets.outofstock.core;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewHolder;
import ru.ozon.app.android.pdp.widgets.outofstock.presentation.OutOfStockViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/widgets/outofstock/presentation/OutOfStockViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class OutOfStockViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, OutOfStockViewHolder> {
    final /* synthetic */ OutOfStockViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    OutOfStockViewMapper$holderProducer$1(OutOfStockViewMapper outOfStockViewMapper) {
        super(2);
        this.this$0 = outOfStockViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final OutOfStockViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        B0 a11 = references.getViewModelOwnerProvider().a();
        final OutOfStockViewMapper outOfStockViewMapper = this.this$0;
        OutOfStockViewModel outOfStockViewModel = (OutOfStockViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.pdp.widgets.outofstock.core.OutOfStockViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                OutOfStockViewModel pViewModel = OutOfStockViewMapper.this.component().getPViewModel();
                Intrinsics.g(pViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return pViewModel;
            }
        }).a(OutOfStockViewModel.class);
        outOfStockViewModel.attachTokenizedAnalytics(references.getTokenizedAnalytics());
        return new OutOfStockViewHolder(view, outOfStockViewModel, this.this$0.component().getCartService(), references);
    }
}
