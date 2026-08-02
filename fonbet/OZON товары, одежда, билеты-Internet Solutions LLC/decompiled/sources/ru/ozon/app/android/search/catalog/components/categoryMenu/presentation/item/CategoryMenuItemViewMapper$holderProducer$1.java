package ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.CategoryMenuViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/search/catalog/components/categoryMenu/presentation/item/CategoryMenuItemViewHolder;", "view", "Landroid/view/View;", "refs", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class CategoryMenuItemViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, CategoryMenuItemViewHolder> {
    final /* synthetic */ CategoryMenuItemViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CategoryMenuItemViewMapper$holderProducer$1(CategoryMenuItemViewMapper categoryMenuItemViewMapper) {
        super(2);
        this.this$0 = categoryMenuItemViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final CategoryMenuItemViewHolder invoke(View view, ComposerReferences refs) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(refs, "refs");
        h viewModelOwnerProvider = refs.getViewModelOwnerProvider();
        final CategoryMenuItemViewMapper categoryMenuItemViewMapper = this.this$0;
        return new CategoryMenuItemViewHolder(view, (CategoryMenuViewModel) new z0(viewModelOwnerProvider.b(), new z0.c() { // from class: ru.ozon.app.android.search.catalog.components.categoryMenu.presentation.item.CategoryMenuItemViewMapper$holderProducer$1$invoke$$inlined$sharedViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                CategoryMenuViewModel viewModel = CategoryMenuItemViewMapper.this.component().getViewModel();
                Intrinsics.g(viewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return viewModel;
            }
        }).a(CategoryMenuViewModel.class), refs);
    }
}
