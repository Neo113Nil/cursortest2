package ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetLegalDetailsEditorBinding;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legalDetailsEditor/presentation/LegalDetailsEditorViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class LegalDetailsEditorViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, LegalDetailsEditorViewHolder> {
    final /* synthetic */ LegalDetailsEditorViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LegalDetailsEditorViewMapper$holderProducer$1(LegalDetailsEditorViewMapper legalDetailsEditorViewMapper) {
        super(2);
        this.this$0 = legalDetailsEditorViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final LegalDetailsEditorViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        WidgetLegalDetailsEditorBinding bind = WidgetLegalDetailsEditorBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        B0 b11 = refs.getViewModelOwnerProvider().b();
        final LegalDetailsEditorViewMapper legalDetailsEditorViewMapper = this.this$0;
        w0 a11 = new z0(b11, new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legalDetailsEditor.presentation.LegalDetailsEditorViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                LegalDetailsEditorViewModel legalDetailsEditorViewModel = LegalDetailsEditorViewMapper.this.component().getViewModel().get();
                Intrinsics.g(legalDetailsEditorViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return legalDetailsEditorViewModel;
            }
        }).a(LegalDetailsEditorViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "createViewModel(...)");
        return new LegalDetailsEditorViewHolder(bind, refs, (LegalDetailsEditorViewModel) a11, this.this$0.component().handlersInhibitor());
    }
}
