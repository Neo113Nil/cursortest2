package ru.ozon.app.android.monetization.widgets.inputSubmit.core;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewGroup;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewHolder;
import ru.ozon.app.android.monetization.widgets.inputSubmit.presentation.InputSubmitViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/monetization/widgets/inputSubmit/presentation/InputSubmitViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class InputSubmitViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, InputSubmitViewHolder> {
    final /* synthetic */ InputSubmitViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    InputSubmitViewMapper$holderProducer$1(InputSubmitViewMapper inputSubmitViewMapper) {
        super(2);
        this.this$0 = inputSubmitViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final InputSubmitViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final InputSubmitViewMapper inputSubmitViewMapper = this.this$0;
        return new InputSubmitViewHolder((InputSubmitViewGroup) view, (InputSubmitViewModel) new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.monetization.widgets.inputSubmit.core.InputSubmitViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                InputSubmitViewModel inputSubmitViewModel = InputSubmitViewMapper.this.component().getInputSubmitViewModel();
                Intrinsics.g(inputSubmitViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return inputSubmitViewModel;
            }
        }).a(InputSubmitViewModel.class), refs);
    }
}
