package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation;

import a00.h;
import android.view.View;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.fresh.feature.b2b.databinding.WidgetAddLegalAddressMobileBinding;
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.common.LegalRouter;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/addLegalAddressMobile/presentation/AddLegalAddressMobileViewHolder;", "view", "Landroid/view/View;", "references", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class AddLegalAddressMobileViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, AddLegalAddressMobileViewHolder> {
    final /* synthetic */ AddLegalAddressMobileViewMapper this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AddLegalAddressMobileViewMapper$holderProducer$1(AddLegalAddressMobileViewMapper addLegalAddressMobileViewMapper) {
        super(2);
        this.this$0 = addLegalAddressMobileViewMapper;
    }

    @Override // kotlin.jvm.functions.Function2
    public final AddLegalAddressMobileViewHolder invoke(View view, ComposerReferences references) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(references, "references");
        WidgetAddLegalAddressMobileBinding bind = WidgetAddLegalAddressMobileBinding.bind(view);
        Intrinsics.checkNotNullExpressionValue(bind, "bind(...)");
        InterfaceC7851b controller = references.getController();
        LegalRouter legalRouter = new LegalRouter(references.getNavigator());
        h viewModelOwnerProvider = references.getViewModelOwnerProvider();
        final AddLegalAddressMobileViewMapper addLegalAddressMobileViewMapper = this.this$0;
        w0 a11 = new z0(viewModelOwnerProvider.a(), new z0.c() { // from class: ru.ozon.app.android.fresh.feature.b2b.widgets.legals.addLegalAddressMobile.presentation.AddLegalAddressMobileViewMapper$holderProducer$1$invoke$$inlined$viewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                AddLegalAddressMobileViewModel addLegalAddressMobileViewModel = AddLegalAddressMobileViewMapper.this.component().getWidgetViewModelProvider().get();
                Intrinsics.g(addLegalAddressMobileViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return addLegalAddressMobileViewModel;
            }
        }).a(AddLegalAddressMobileViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a11, "viewModel(...)");
        return new AddLegalAddressMobileViewHolder(bind, controller, legalRouter, (AddLegalAddressMobileViewModel) a11);
    }
}
