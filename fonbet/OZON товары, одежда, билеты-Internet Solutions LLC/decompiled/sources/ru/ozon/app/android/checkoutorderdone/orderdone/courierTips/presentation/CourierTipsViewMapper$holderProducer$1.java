package ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation;

import Vg.d;
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
import ru.ozon.app.android.orderdone.databinding.WidgetCourierTipsBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/checkoutorderdone/orderdone/courierTips/presentation/CourierTipsViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CourierTipsViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CourierTipsViewHolder> {
    final /* synthetic */ CourierTipsViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CourierTipsViewMapper$holderProducer$1(CourierTipsViewMapper courierTipsViewMapper) {
        super(2);
        this.this$0 = courierTipsViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CourierTipsViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        WidgetCourierTipsBinding bind = WidgetCourierTipsBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        CourierTipsMapper mapper = this.this$0.getMapper();
        d customActionHandlersStoreFactory = this.this$0.component().getCustomActionHandlersStoreFactory();
        l tokenizedAnalytics = this.this$0.component().getTokenizedAnalytics();
        B0 a11 = references.getViewModelOwnerProvider().a();
        final CourierTipsViewMapper courierTipsViewMapper = this.this$0;
        return new CourierTipsViewHolder(bind, references, mapper, tokenizedAnalytics, customActionHandlersStoreFactory, (CourierTipsViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.checkoutorderdone.orderdone.courierTips.presentation.CourierTipsViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CourierTipsViewModel viewModel = CourierTipsViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(CourierTipsViewModel.class));
    }
}
