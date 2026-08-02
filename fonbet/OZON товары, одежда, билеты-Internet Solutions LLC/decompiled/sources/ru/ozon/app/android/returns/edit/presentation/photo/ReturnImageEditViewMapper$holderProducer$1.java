package ru.ozon.app.android.returns.edit.presentation.photo;

import android.view.View;
import androidx.fragment.app.ComponentCallbacksC5392m;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.delivery.customActionsHandlers.OneTimePostRefreshHandler;
import ru.ozon.app.android.returns.ui.domain.PostRefreshHandlerFactory;
import ru.ozon.app.android.returns.ui.molecules.reason.viewModel.InputViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/returns/edit/presentation/photo/ReturnImageEditViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ReturnImageEditViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ReturnImageEditViewHolder> {
    final /* synthetic */ ReturnImageEditViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ReturnImageEditViewMapper$holderProducer$1(ReturnImageEditViewMapper returnImageEditViewMapper) {
        super(2);
        this.this$0 = returnImageEditViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ReturnImageEditViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        ReturnImageEditView returnImageEditView = (ReturnImageEditView) view;
        OneTimePostRefreshHandler create$default = PostRefreshHandlerFactory.create$default(this.this$0.component().getPostRefreshHandlerFactory(), refs, null, 2, null);
        ComponentCallbacksC5392m j11 = refs.getContainer().j();
        final ReturnImageEditViewMapper returnImageEditViewMapper = this.this$0;
        w0 a11 = new z0(j11, new z0.c() { // from class: ru.ozon.app.android.returns.edit.presentation.photo.ReturnImageEditViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                InputViewModel inputViewModel = ReturnImageEditViewMapper.this.component().getInputViewModelProvider().get();
                Intrinsics.g(inputViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return inputViewModel;
            }
        }).a(InputViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new ReturnImageEditViewHolder(returnImageEditView, refs, create$default, this.this$0.component().getCustomActionHandlersStoreFactory(), (InputViewModel) a11);
    }
}
