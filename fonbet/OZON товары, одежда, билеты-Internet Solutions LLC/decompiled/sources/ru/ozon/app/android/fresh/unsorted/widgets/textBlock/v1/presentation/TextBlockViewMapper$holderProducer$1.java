package ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation;

import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.navigation.CatalogTabsSharedViewModel;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/unsorted/widgets/textBlock/v1/presentation/TextBlockViewHolder;", "v", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class TextBlockViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, TextBlockViewHolder> {
    final /* synthetic */ TextBlockViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextBlockViewMapper$holderProducer$1(TextBlockViewMapper textBlockViewMapper) {
        super(2);
        this.this$0 = textBlockViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final TextBlockViewHolder invoke(View v11, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(v11, "v");
        Intrinsics.checkNotNullParameter(refs, "refs");
        B0 a11 = refs.getViewModelOwnerProvider().a();
        final TextBlockViewMapper textBlockViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.unsorted.widgets.textBlock.v1.presentation.TextBlockViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CatalogTabsSharedViewModel catalogTabsSharedViewModel = TextBlockViewMapper.this.component().getCatalogTabsSharedViewModel().get();
                Intrinsics.g(catalogTabsSharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return catalogTabsSharedViewModel;
            }
        }).a(CatalogTabsSharedViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new TextBlockViewHolder((TextAtomView) v11, (CatalogTabsSharedViewModel) a12);
    }
}
