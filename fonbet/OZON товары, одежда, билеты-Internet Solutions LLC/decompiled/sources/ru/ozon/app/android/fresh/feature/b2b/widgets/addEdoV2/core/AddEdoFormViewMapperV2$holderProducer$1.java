package ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddEdoV2FormBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoFormViewHolderV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2;
import ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.presentation.AddEdoViewModelV2Impl;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/addEdoV2/presentation/AddEdoFormViewHolderV2;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddEdoFormViewMapperV2$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddEdoFormViewHolderV2> {
    final /* synthetic */ AddEdoFormViewMapperV2 this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddEdoFormViewMapperV2$holderProducer$1(AddEdoFormViewMapperV2 addEdoFormViewMapperV2) {
        super(2);
        this.this$0 = addEdoFormViewMapperV2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddEdoFormViewHolderV2 invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        WidgetAddEdoV2FormBinding bind = WidgetAddEdoV2FormBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final AddEdoFormViewMapperV2 addEdoFormViewMapperV2 = this.this$0;
        Object a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.addEdoV2.core.AddEdoFormViewMapperV2$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddEdoViewModelV2Impl addEdoViewModelV2Impl = AddEdoFormViewMapperV2.this.component().getWidgetViewModelProvider().get();
                Intrinsics.g(addEdoViewModelV2Impl, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addEdoViewModelV2Impl;
            }
        }).a(AddEdoViewModelV2Impl.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new AddEdoFormViewHolderV2(bind, (AddEdoViewModelV2) a11, references);
    }
}
