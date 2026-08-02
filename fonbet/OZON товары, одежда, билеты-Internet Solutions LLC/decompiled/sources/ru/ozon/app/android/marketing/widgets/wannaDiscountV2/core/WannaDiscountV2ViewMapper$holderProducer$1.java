package ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core;

import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewHolder;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModel;
import ru.ozon.app.android.marketing.widgets.wannaDiscountV2.presentation.WannaDiscountV2ViewModelImpl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/marketing/widgets/wannaDiscountV2/presentation/WannaDiscountV2ViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class WannaDiscountV2ViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, WannaDiscountV2ViewHolder> {
    final /* synthetic */ WannaDiscountV2ViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    WannaDiscountV2ViewMapper$holderProducer$1(WannaDiscountV2ViewMapper wannaDiscountV2ViewMapper) {
        super(2);
        this.this$0 = wannaDiscountV2ViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final WannaDiscountV2ViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        final WannaDiscountV2ViewMapper wannaDiscountV2ViewMapper = this.this$0;
        Object a11 = new z0(refs.getViewModelOwnerProvider().a(), new z0.c() { // from class: ru.ozon.app.android.marketing.widgets.wannaDiscountV2.core.WannaDiscountV2ViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                WannaDiscountV2ViewModelImpl wannaDiscountV2ViewModelImpl = WannaDiscountV2ViewMapper.this.component().getWannaDiscountV2ViewModelProvider().get();
                Intrinsics.g(wannaDiscountV2ViewModelImpl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return wannaDiscountV2ViewModelImpl;
            }
        }).a(WannaDiscountV2ViewModelImpl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new WannaDiscountV2ViewHolder(view, refs, (WannaDiscountV2ViewModel) a11, refs.getTokenizedAnalytics());
    }
}
