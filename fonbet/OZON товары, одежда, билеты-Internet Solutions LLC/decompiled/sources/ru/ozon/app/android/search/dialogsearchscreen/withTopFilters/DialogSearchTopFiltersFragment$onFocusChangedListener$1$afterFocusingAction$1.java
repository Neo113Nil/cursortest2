package ru.ozon.app.android.search.dialogsearchscreen.withTopFilters;

import android.text.Editable;
import androidx.appcompat.widget.AppCompatEditText;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.search.databinding.FragmentDialogSearchCoordinatorBinding;
import ru.ozon.app.android.utils.KeyboardUtilsKt;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class DialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ DialogSearchTopFiltersFragment this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DialogSearchTopFiltersFragment$onFocusChangedListener$1$afterFocusingAction$1(DialogSearchTopFiltersFragment dialogSearchTopFiltersFragment) {
        super(0);
        this.this$0 = dialogSearchTopFiltersFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        FragmentDialogSearchCoordinatorBinding binding;
        binding = this.this$0.getBinding();
        AppCompatEditText searchInput = binding.dialogSearchBarView.getSearchInput();
        KeyboardUtilsKt.showKeyboard(searchInput);
        Editable text = searchInput.getText();
        searchInput.setSelection(text != null ? text.length() : 0);
    }
}
