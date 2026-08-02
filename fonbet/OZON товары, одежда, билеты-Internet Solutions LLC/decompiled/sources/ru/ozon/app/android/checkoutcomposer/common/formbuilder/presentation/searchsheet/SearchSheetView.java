package ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet;

import android.content.Context;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import com.google.android.material.textfield.TextInputEditText;
import io.C7092a;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetViewModel;
import ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.adapter.SuggestionsAdapter;
import ru.ozon.app.android.map.databinding.FragmentSearchSheetBinding;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;

@Metadata(d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R0\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010 \u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b \u0010\u001b\u001a\u0004\b!\u0010\u001d\"\u0004\b\"\u0010\u001fR*\u0010$\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u0014\u0010+\u001a\u00020*8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,¨\u0006-"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetView;", "", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "binding", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;", "suggestionsAdapter", "", "maxLength", "<init>", "(Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;I)V", "", SearchIntents.EXTRA_QUERY, "", "changeQuery", "(Ljava/lang/String;)V", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$ScreenUI;", "screenUI", "updateUi", "(Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SearchSheetViewModel$ScreenUI;)V", "showLoader", "()V", "hideLoader", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/adapter/SuggestionsAdapter;", "Lkotlin/Function1;", "Lru/ozon/app/android/checkoutcomposer/common/formbuilder/presentation/searchsheet/SuggestVO;", "onSuggestClicked", "Lkotlin/jvm/functions/Function1;", "getOnSuggestClicked", "()Lkotlin/jvm/functions/Function1;", "setOnSuggestClicked", "(Lkotlin/jvm/functions/Function1;)V", "onTypedQuery", "getOnTypedQuery", "setOnTypedQuery", "Lkotlin/Function0;", "onCloseClicked", "Lkotlin/jvm/functions/Function0;", "getOnCloseClicked", "()Lkotlin/jvm/functions/Function0;", "setOnCloseClicked", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/text/TextWatcher;", "textWatcher", "Landroid/text/TextWatcher;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class SearchSheetView {

    @NotNull
    private final FragmentSearchSheetBinding binding;
    private Function0<Unit> onCloseClicked;
    private Function1<? super SuggestVO, Unit> onSuggestClicked;
    private Function1<? super String, Unit> onTypedQuery;

    @NotNull
    private final SuggestionsAdapter suggestionsAdapter;

    @NotNull
    private final TextWatcher textWatcher;

    public SearchSheetView(@NotNull FragmentSearchSheetBinding binding, @NotNull SuggestionsAdapter suggestionsAdapter, int i11) {
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(suggestionsAdapter, "suggestionsAdapter");
        this.binding = binding;
        this.suggestionsAdapter = suggestionsAdapter;
        SimpleTextWatcher simpleTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.checkoutcomposer.common.formbuilder.presentation.searchsheet.SearchSheetView$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                Function1<String, Unit> onTypedQuery = SearchSheetView.this.getOnTypedQuery();
                if (onTypedQuery != null) {
                    onTypedQuery.invoke(s11.toString());
                }
            }
        };
        this.textWatcher = simpleTextWatcher;
        LoaderView loaderView = binding.progressBar;
        Context context = binding.root.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        loaderView.setColor(ThemeExtKt.themeColor(context, R$attr.bgActionPrimary));
        RecyclerView recyclerView = binding.suggestionsRv;
        suggestionsAdapter.setOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease(new SearchSheetView$1$1$1(this));
        recyclerView.setAdapter(suggestionsAdapter);
        binding.fieldEt.addTextChangedListener(simpleTextWatcher);
        binding.fieldEt.setOnEditorActionListener(new C7092a(this, 0));
        TextInputEditText textInputEditText = binding.fieldEt;
        InputFilter[] filters = textInputEditText.getFilters();
        Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
        textInputEditText.setFilters((InputFilter[]) C7705l.V(filters, new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i11)}));
        binding.closeIv.setOnClickListener(new GW.a(this, 5));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$4$lambda$2(SearchSheetView searchSheetView, TextView textView, int i11, KeyEvent keyEvent) {
        boolean z11 = i11 == 3;
        Function1<? super String, Unit> function1 = searchSheetView.onTypedQuery;
        if (function1 != null) {
            function1.invoke(textView.getText().toString());
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3(SearchSheetView searchSheetView, View view) {
        Function0<Unit> function0 = searchSheetView.onCloseClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    public final void changeQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        fragmentSearchSheetBinding.fieldEt.removeTextChangedListener(this.textWatcher);
        fragmentSearchSheetBinding.fieldEt.setText(query);
        fragmentSearchSheetBinding.fieldEt.setSelection(query.length());
        fragmentSearchSheetBinding.fieldEt.addTextChangedListener(this.textWatcher);
    }

    public final Function1<SuggestVO, Unit> getOnSuggestClicked() {
        return this.onSuggestClicked;
    }

    public final Function1<String, Unit> getOnTypedQuery() {
        return this.onTypedQuery;
    }

    public final void hideLoader() {
        FrameLayout progressFl = this.binding.progressFl;
        Intrinsics.checkNotNullExpressionValue(progressFl, "progressFl");
        ViewExtKt.gone(progressFl);
    }

    public final void setOnCloseClicked(Function0<Unit> function0) {
        this.onCloseClicked = function0;
    }

    public final void setOnSuggestClicked(Function1<? super SuggestVO, Unit> function1) {
        this.onSuggestClicked = function1;
    }

    public final void setOnTypedQuery(Function1<? super String, Unit> function1) {
        this.onTypedQuery = function1;
    }

    public final void showLoader() {
        FrameLayout progressFl = this.binding.progressFl;
        Intrinsics.checkNotNullExpressionValue(progressFl, "progressFl");
        ViewExtKt.show(progressFl);
    }

    public final void updateUi(@NotNull SearchSheetViewModel.ScreenUI screenUI) {
        Intrinsics.checkNotNullParameter(screenUI, "screenUI");
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        TextView titleTv = fragmentSearchSheetBinding.titleTv;
        Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
        TextViewExtKt.setTextOrGone(titleTv, screenUI.getScreenTitle());
        fragmentSearchSheetBinding.fieldTil.d0(screenUI.getHint());
        this.suggestionsAdapter.submitList(screenUI.getSuggests());
        fragmentSearchSheetBinding.suggestionsRv.scrollToPosition(0);
    }
}
