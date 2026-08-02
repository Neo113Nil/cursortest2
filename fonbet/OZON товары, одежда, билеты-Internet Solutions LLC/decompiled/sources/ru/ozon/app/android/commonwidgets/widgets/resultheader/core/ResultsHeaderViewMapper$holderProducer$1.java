package ru.ozon.app.android.commonwidgets.widgets.resultheader.core;

import Pc.a;
import android.view.View;
import androidx.lifecycle.B0;
import androidx.lifecycle.w0;
import androidx.lifecycle.z0;
import kotlin.Metadata;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.adult.presenter.AdultHandler;
import ru.ozon.app.android.action.sheet.ActionSheetEventHandler;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.domain.ResultsHeaderRepository;
import ru.ozon.app.android.commonwidgets.widgets.resultheader.presentation.ResultsHeaderViewHolder;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.favorites.ui.shoppinglists.ShoppingListsViewModel;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "Lru/ozon/app/android/commonwidgets/widgets/resultheader/presentation/ResultsHeaderViewHolder;", "view", "Landroid/view/View;", "composerReferences", "Lru/ozon/app/android/composer/ComposerReferences;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
final class ResultsHeaderViewMapper$holderProducer$1 extends AbstractC7737t implements Function2<View, ComposerReferences, ResultsHeaderViewHolder> {
    final /* synthetic */ ActionSheetEventHandler $actionSheetEventHandler;
    final /* synthetic */ AdultHandler $adultHandler;
    final /* synthetic */ ResultsHeaderRepository $repository;
    final /* synthetic */ a<ShoppingListsViewModel> $shoppingListsViewModel;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ResultsHeaderViewMapper$holderProducer$1(ActionSheetEventHandler actionSheetEventHandler, ResultsHeaderRepository resultsHeaderRepository, AdultHandler adultHandler, a<ShoppingListsViewModel> aVar) {
        super(2);
        this.$actionSheetEventHandler = actionSheetEventHandler;
        this.$repository = resultsHeaderRepository;
        this.$adultHandler = adultHandler;
        this.$shoppingListsViewModel = aVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final ResultsHeaderViewHolder invoke(View view, ComposerReferences composerReferences) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(composerReferences, "composerReferences");
        ActionSheetEventHandler actionSheetEventHandler = this.$actionSheetEventHandler;
        ResultsHeaderRepository resultsHeaderRepository = this.$repository;
        B0 a11 = composerReferences.getViewModelOwnerProvider().a();
        final a<ShoppingListsViewModel> aVar = this.$shoppingListsViewModel;
        w0 a12 = new z0(a11, new z0.c() { // from class: ru.ozon.app.android.commonwidgets.widgets.resultheader.core.ResultsHeaderViewMapper$holderProducer$1$invoke$$inlined$createViewModel$1
            @Override // androidx.lifecycle.z0.c, androidx.lifecycle.z0.b
            public <T extends w0> T create(Class<T> modelClass) {
                Intrinsics.checkNotNullParameter(modelClass, "modelClass");
                ShoppingListsViewModel shoppingListsViewModel = (ShoppingListsViewModel) a.this.get();
                Intrinsics.g(shoppingListsViewModel, "null cannot be cast to non-null type T of ru.ozon.app.android.utils.lifecycle.ViewModelExtKt.vmFactory.<no name provided>.create");
                return shoppingListsViewModel;
            }
        }).a(ShoppingListsViewModel.class);
        Intrinsics.checkNotNullExpressionValue(a12, "createViewModel(...)");
        return new ResultsHeaderViewHolder(view, composerReferences, actionSheetEventHandler, resultsHeaderRepository, (ShoppingListsViewModel) a12, this.$adultHandler);
    }
}
