package ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetVerificationEdoCheckingOperatorBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/verificationEdoCheckingOperator/presentation/VerificationEdoCheckingOperatorViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class VerificationEdoCheckingOperatorViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, VerificationEdoCheckingOperatorViewHolder> {
    final /* synthetic */ VerificationEdoCheckingOperatorViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    VerificationEdoCheckingOperatorViewMapper$holderProducer$1(VerificationEdoCheckingOperatorViewMapper verificationEdoCheckingOperatorViewMapper) {
        super(2);
        this.this$0 = verificationEdoCheckingOperatorViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final VerificationEdoCheckingOperatorViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        WidgetVerificationEdoCheckingOperatorBinding bind = WidgetVerificationEdoCheckingOperatorBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        h viewModelOwnerProvider = composerReferences.getViewModelOwnerProvider();
        final VerificationEdoCheckingOperatorViewMapper verificationEdoCheckingOperatorViewMapper = this.this$0;
        return new VerificationEdoCheckingOperatorViewHolder(bind, (VerificationEdoCheckingOperatorViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.verificationEdoCheckingOperator.presentation.VerificationEdoCheckingOperatorViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                VerificationEdoCheckingOperatorViewModel viewModel = VerificationEdoCheckingOperatorViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(VerificationEdoCheckingOperatorViewModel.class), composerReferences, this.this$0.component().getCustomActionHandlersStoreFactory());
    }
}
