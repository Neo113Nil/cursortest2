package ru.ozon.app.android.favorites.createshoppinglist.presentation.vh;

import com.google.android.material.textfield.TextInputEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.favorites.createshoppinglist.presentation.viewmodel.CreateShoppingListViewModel;
import ru.ozon.app.android.favorites.feature.databinding.WidgetCreateShoppingListTitleBinding;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0000\u001a\u00020\u00012\u000e\u0010\u0002\u001a\n \u0004*\u0004\u0018\u00010\u00030\u0003H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"<anonymous>", "", "action", "Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;", "kotlin.jvm.PlatformType", "invoke", "(Lru/ozon/app/android/favorites/createshoppinglist/presentation/viewmodel/CreateShoppingListViewModel$Action;)V"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class CreateShoppingListTitleViewHolder$onAttachViewModel$1 extends AbstractC7737t implements Function1<CreateShoppingListViewModel.Action, Unit> {
    final /* synthetic */ CreateShoppingListTitleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    CreateShoppingListTitleViewHolder$onAttachViewModel$1(CreateShoppingListTitleViewHolder createShoppingListTitleViewHolder) {
        super(1);
        this.this$0 = createShoppingListTitleViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(CreateShoppingListViewModel.Action action) {
        invoke2(action);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(CreateShoppingListViewModel.Action action) {
        WidgetCreateShoppingListTitleBinding widgetCreateShoppingListTitleBinding;
        if ((action instanceof CreateShoppingListViewModel.Action.ValidationError) || (action instanceof CreateShoppingListViewModel.Action.Error)) {
            widgetCreateShoppingListTitleBinding = this.this$0.binding;
            TextInputEditText titleEt = widgetCreateShoppingListTitleBinding.titleEt;
            Intrinsics.checkNotNullExpressionValue(titleEt, "titleEt");
            KeyboardUtilsKt.showKeyboard(titleEt);
        }
    }
}
