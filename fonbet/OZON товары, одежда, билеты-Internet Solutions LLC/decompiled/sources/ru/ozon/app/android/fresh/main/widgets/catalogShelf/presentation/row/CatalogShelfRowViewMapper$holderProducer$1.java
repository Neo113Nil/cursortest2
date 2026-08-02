package ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row;

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

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/main/widgets/catalogShelf/presentation/row/CatalogShelfRowViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class CatalogShelfRowViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CatalogShelfRowViewHolder> {
    final /* synthetic */ CatalogShelfRowViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CatalogShelfRowViewMapper$holderProducer$1(CatalogShelfRowViewMapper catalogShelfRowViewMapper) {
        super(2);
        this.this$0 = catalogShelfRowViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CatalogShelfRowViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final CatalogShelfRowViewMapper catalogShelfRowViewMapper = this.this$0;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.fresh.main.widgets.catalogShelf.presentation.row.CatalogShelfRowViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CatalogTabsSharedViewModel catalogTabsSharedViewModel = CatalogShelfRowViewMapper.this.component().getCatalogTabsSharedViewModel().get();
                Intrinsics.g(catalogTabsSharedViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return catalogTabsSharedViewModel;
            }
        }).a(CatalogTabsSharedViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "viewModel(...)");
        return new CatalogShelfRowViewHolder(view, composerReferences, (CatalogTabsSharedViewModel) a12);
    }
}
