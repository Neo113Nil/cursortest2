package ru.ozon.app.android.account.orders.recipientWidget.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetRecipientBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/account/orders/recipientWidget/presentation/RecipientViewHolder;", "view", "Landroid/view/View;", "composerRefs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class RecipientViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, RecipientViewHolder> {
    final /* synthetic */ RecipientViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    RecipientViewMapper$holderProducer$1(RecipientViewMapper recipientViewMapper) {
        super(2);
        this.this$0 = recipientViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final RecipientViewHolder invoke(View view, ComposerReferences composerRefs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerRefs, "composerRefs");
        WidgetRecipientBinding bind = WidgetRecipientBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 a11 = composerRefs.getViewModelOwnerProvider().a();
        final RecipientViewMapper recipientViewMapper = this.this$0;
        return new RecipientViewHolder(bind, (RecipientViewModel) new z0(a11, new z0.c() { // from class: ru.ozon.app.android.account.orders.recipientWidget.presentation.RecipientViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                RecipientViewModelImpl viewModel = RecipientViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(RecipientViewModelImpl.class), composerRefs.getContainer().a(), composerRefs);
    }
}
