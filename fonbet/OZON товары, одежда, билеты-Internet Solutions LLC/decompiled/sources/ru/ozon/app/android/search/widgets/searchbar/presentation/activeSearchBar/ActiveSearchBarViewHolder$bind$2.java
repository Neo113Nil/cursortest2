package ru.ozon.app.android.search.widgets.searchbar.presentation.activeSearchBar;

import androidx.appcompat.widget.AppCompatEditText;
import com.google.android.gms.actions.SearchIntents;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.search.databinding.ActiveSearchbarBinding;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", SearchIntents.EXTRA_QUERY, "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class ActiveSearchBarViewHolder$bind$2 extends AbstractC7737t implements Function1<String, Unit> {
    final /* synthetic */ ActiveSearchBarViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ActiveSearchBarViewHolder$bind$2(ActiveSearchBarViewHolder activeSearchBarViewHolder) {
        super(1);
        this.this$0 = activeSearchBarViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(String str) {
        invoke2(str);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String str) {
        ActiveSearchbarBinding binding;
        ActiveSearchBarViewHolder$editTextTextWatcher$1 activeSearchBarViewHolder$editTextTextWatcher$1;
        ActiveSearchbarBinding binding2;
        ActiveSearchbarBinding binding3;
        ActiveSearchBarViewHolder$editTextTextWatcher$1 activeSearchBarViewHolder$editTextTextWatcher$12;
        binding = this.this$0.getBinding();
        AppCompatEditText appCompatEditText = binding.etSearch;
        activeSearchBarViewHolder$editTextTextWatcher$1 = this.this$0.editTextTextWatcher;
        appCompatEditText.removeTextChangedListener(activeSearchBarViewHolder$editTextTextWatcher$1);
        ActiveSearchBarViewHolder activeSearchBarViewHolder = this.this$0;
        binding2 = activeSearchBarViewHolder.getBinding();
        AppCompatEditText etSearch = binding2.etSearch;
        Intrinsics.checkNotNullExpressionValue(etSearch, "etSearch");
        activeSearchBarViewHolder.setTextWithSelection(etSearch, str);
        this.this$0.onTextChanged(str, true);
        binding3 = this.this$0.getBinding();
        AppCompatEditText appCompatEditText2 = binding3.etSearch;
        activeSearchBarViewHolder$editTextTextWatcher$12 = this.this$0.editTextTextWatcher;
        appCompatEditText2.addTextChangedListener(activeSearchBarViewHolder$editTextTextWatcher$12);
    }
}
