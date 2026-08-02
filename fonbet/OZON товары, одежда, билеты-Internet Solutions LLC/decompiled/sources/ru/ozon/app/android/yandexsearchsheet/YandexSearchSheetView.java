package ru.ozon.app.android.yandexsearchsheet;

import B90.t0;
import Dc0.n;
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
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.map.databinding.FragmentSearchSheetBinding;
import ru.ozon.app.android.yandexsearchsheet.SuggestVO;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetView;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetViewModel;
import ru.ozon.app.android.yandexsearchsheet.adapter.YandexSuggestionsAdapter;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.common.SimpleTextWatcher;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u0000 52\u00020\u0001:\u00015B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0011\u001a\u00020\f2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\r\u0010\u0013\u001a\u00020\f¢\u0006\u0004\b\u0013\u0010\u0014J\r\u0010\u0015\u001a\u00020\f¢\u0006\u0004\b\u0015\u0010\u0014R\u0016\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0017R<\u0010\u001a\u001a\u001c\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001a\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001fR0\u0010\"\u001a\u0010\u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\f\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R0\u0010(\u001a\u0010\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\f\u0018\u00010 8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%\"\u0004\b*\u0010'R*\u0010,\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010+8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b,\u0010-\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R\u0014\u00103\u001a\u0002028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00066"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetView;", "", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "binding", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;", "suggestionsAdapter", "", "maxLength", "<init>", "(Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;I)V", "", SearchIntents.EXTRA_QUERY, "", "changeQuery", "(Ljava/lang/String;)V", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;", "screenUI", "updateUi", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetViewModel$ScreenUI;)V", "showLoader", "()V", "hideLoader", "Lru/ozon/app/android/map/databinding/FragmentSearchSheetBinding;", "Lru/ozon/app/android/yandexsearchsheet/adapter/YandexSuggestionsAdapter;", "Lkotlin/Function3;", "Lru/ozon/app/android/yandexsearchsheet/SuggestVO$Suggest$SuggestInfo;", "onSuggestItemClicked", "Lfd/n;", "getOnSuggestItemClicked", "()Lfd/n;", "setOnSuggestItemClicked", "(Lfd/n;)V", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onSuggestWarningClicked", "Lkotlin/jvm/functions/Function1;", "getOnSuggestWarningClicked", "()Lkotlin/jvm/functions/Function1;", "setOnSuggestWarningClicked", "(Lkotlin/jvm/functions/Function1;)V", "onTypedQuery", "getOnTypedQuery", "setOnTypedQuery", "Lkotlin/Function0;", "onCloseClicked", "Lkotlin/jvm/functions/Function0;", "getOnCloseClicked", "()Lkotlin/jvm/functions/Function0;", "setOnCloseClicked", "(Lkotlin/jvm/functions/Function0;)V", "Landroid/text/TextWatcher;", "textWatcher", "Landroid/text/TextWatcher;", "Companion", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSearchSheetView {
    private final FragmentSearchSheetBinding binding;
    private Function0<Unit> onCloseClicked;
    private InterfaceC6511n<? super SuggestVO.Suggest.SuggestInfo, ? super Integer, ? super String, Unit> onSuggestItemClicked;
    private Function1<? super AtomAction, Unit> onSuggestWarningClicked;
    private Function1<? super String, Unit> onTypedQuery;

    @NotNull
    private final YandexSuggestionsAdapter suggestionsAdapter;

    @NotNull
    private final TextWatcher textWatcher;

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private static final IconButtonV3DTO CLOSE_BUTTON = new IconButtonV3DTO(IconButtonV3DTO.Sizes.SIZE_400, ButtonV3DTO.StyleTypes.CUSTOM, IconButtonV3DTO.IconButtonShape.SHAPE_CIRCLE, "ic_s_cross_filled", null, "graphicSecondary", "bgOverlap", null, null, null, null, null, null, null, 16272, null);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetView$Companion;", "", "<init>", "()V", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public YandexSearchSheetView(FragmentSearchSheetBinding fragmentSearchSheetBinding, @NotNull YandexSuggestionsAdapter suggestionsAdapter, int i11) {
        Intrinsics.checkNotNullParameter(suggestionsAdapter, "suggestionsAdapter");
        this.binding = fragmentSearchSheetBinding;
        this.suggestionsAdapter = suggestionsAdapter;
        SimpleTextWatcher simpleTextWatcher = new SimpleTextWatcher() { // from class: ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetView$textWatcher$1
            @Override // ru.ozon.uni.android.uikit.common.SimpleTextWatcher, android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
                Intrinsics.checkNotNullParameter(s11, "s");
                Function1<String, Unit> onTypedQuery = YandexSearchSheetView.this.getOnTypedQuery();
                if (onTypedQuery != null) {
                    onTypedQuery.invoke(s11.toString());
                }
            }
        };
        this.textWatcher = simpleTextWatcher;
        if (fragmentSearchSheetBinding != null) {
            LoaderView loaderView = fragmentSearchSheetBinding.progressBar;
            Context context = fragmentSearchSheetBinding.root.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            loaderView.setColor(ThemeExtKt.themeColor(context, R$attr.bgActionPrimary));
            RecyclerView recyclerView = fragmentSearchSheetBinding.suggestionsRv;
            suggestionsAdapter.setOnAddressClick$suggestions_search_prodGoogleAllVendorsRelease(new YandexSearchSheetView$1$1$1(this, fragmentSearchSheetBinding));
            suggestionsAdapter.setOnWarningClick$suggestions_search_prodGoogleAllVendorsRelease(new YandexSearchSheetView$1$1$2(this));
            recyclerView.setAdapter(suggestionsAdapter);
            fragmentSearchSheetBinding.subtitleVAL.setAdapter(new AtomsAdapter(null, null, null, null, 15, null));
            fragmentSearchSheetBinding.fieldEt.addTextChangedListener(simpleTextWatcher);
            fragmentSearchSheetBinding.fieldEt.setOnEditorActionListener(new TextView.OnEditorActionListener() { // from class: TY.b
                @Override // android.widget.TextView.OnEditorActionListener
                public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
                    boolean lambda$4$lambda$2;
                    lambda$4$lambda$2 = YandexSearchSheetView.lambda$4$lambda$2(YandexSearchSheetView.this, textView, i12, keyEvent);
                    return lambda$4$lambda$2;
                }
            });
            TextInputEditText textInputEditText = fragmentSearchSheetBinding.fieldEt;
            InputFilter[] filters = textInputEditText.getFilters();
            Intrinsics.checkNotNullExpressionValue(filters, "getFilters(...)");
            textInputEditText.setFilters((InputFilter[]) C7705l.V(filters, new InputFilter.LengthFilter[]{new InputFilter.LengthFilter(i11)}));
            IconButtonV3View closeIv = fragmentSearchSheetBinding.closeIv;
            Intrinsics.checkNotNullExpressionValue(closeIv, "closeIv");
            IconButtonV3HolderKt.bindOrGone$default(closeIv, CLOSE_BUTTON, null, 2, null);
            fragmentSearchSheetBinding.closeIv.setOnClickListener(new n(this, 8));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean lambda$4$lambda$2(YandexSearchSheetView yandexSearchSheetView, TextView textView, int i11, KeyEvent keyEvent) {
        boolean z11 = i11 == 3;
        Function1<? super String, Unit> function1 = yandexSearchSheetView.onTypedQuery;
        if (function1 != null) {
            function1.invoke(textView.getText().toString());
        }
        return z11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void lambda$4$lambda$3(YandexSearchSheetView yandexSearchSheetView, View view) {
        Function0<Unit> function0 = yandexSearchSheetView.onCloseClicked;
        if (function0 != null) {
            function0.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void updateUi$lambda$7$lambda$6(FragmentSearchSheetBinding fragmentSearchSheetBinding) {
        fragmentSearchSheetBinding.suggestionsRv.scrollToPosition(0);
    }

    public final void changeQuery(@NotNull String query) {
        TextInputEditText textInputEditText;
        Intrinsics.checkNotNullParameter(query, "query");
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        if (fragmentSearchSheetBinding == null || (textInputEditText = fragmentSearchSheetBinding.fieldEt) == null) {
            return;
        }
        textInputEditText.removeTextChangedListener(this.textWatcher);
        textInputEditText.setText(query);
        textInputEditText.setSelection(query.length());
        textInputEditText.requestFocus();
        textInputEditText.addTextChangedListener(this.textWatcher);
    }

    public final InterfaceC6511n<SuggestVO.Suggest.SuggestInfo, Integer, String, Unit> getOnSuggestItemClicked() {
        return this.onSuggestItemClicked;
    }

    public final Function1<AtomAction, Unit> getOnSuggestWarningClicked() {
        return this.onSuggestWarningClicked;
    }

    public final Function1<String, Unit> getOnTypedQuery() {
        return this.onTypedQuery;
    }

    public final void hideLoader() {
        FrameLayout frameLayout;
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        if (fragmentSearchSheetBinding == null || (frameLayout = fragmentSearchSheetBinding.progressFl) == null) {
            return;
        }
        ViewExtKt.gone(frameLayout);
    }

    public final void setOnCloseClicked(Function0<Unit> function0) {
        this.onCloseClicked = function0;
    }

    public final void setOnSuggestItemClicked(InterfaceC6511n<? super SuggestVO.Suggest.SuggestInfo, ? super Integer, ? super String, Unit> interfaceC6511n) {
        this.onSuggestItemClicked = interfaceC6511n;
    }

    public final void setOnSuggestWarningClicked(Function1<? super AtomAction, Unit> function1) {
        this.onSuggestWarningClicked = function1;
    }

    public final void setOnTypedQuery(Function1<? super String, Unit> function1) {
        this.onTypedQuery = function1;
    }

    public final void showLoader() {
        FrameLayout frameLayout;
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        if (fragmentSearchSheetBinding == null || (frameLayout = fragmentSearchSheetBinding.progressFl) == null) {
            return;
        }
        ViewExtKt.show(frameLayout);
    }

    public final void updateUi(@NotNull YandexSearchSheetViewModel.ScreenUI screenUI) {
        Intrinsics.checkNotNullParameter(screenUI, "screenUI");
        FragmentSearchSheetBinding fragmentSearchSheetBinding = this.binding;
        if (fragmentSearchSheetBinding != null) {
            TextView titleTv = fragmentSearchSheetBinding.titleTv;
            Intrinsics.checkNotNullExpressionValue(titleTv, "titleTv");
            TextViewExtKt.setTextOrGone(titleTv, screenUI.getScreenTitle());
            AtomsAdapter adapter = fragmentSearchSheetBinding.subtitleVAL.getAdapter();
            if (adapter != null) {
                Context context = fragmentSearchSheetBinding.root.getContext();
                Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
                adapter.bind(context, screenUI.getSubtitle());
            }
            fragmentSearchSheetBinding.fieldTil.d0(screenUI.getHint());
            this.suggestionsAdapter.submitList(screenUI.getSuggests().getSuggests(), new t0(fragmentSearchSheetBinding, 1));
        }
    }
}
