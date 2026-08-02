package ru.ozon.app.android.fresh.navigation.addressSearch.presentation;

import android.content.Context;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.r;
import androidx.lifecycle.J;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.actions.SearchIntents;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.navigation.addressSearch.domain.MapSdkSuggestionVO;
import ru.ozon.app.android.fresh.navigation.addressSearch.presentation.AddressSearchViewModel;
import ru.ozon.app.android.fresh.navigation.databinding.FragmentAddressSearchSuggestionsBinding;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.uni.android.flashbar.factory.FlashbarFactory;
import ru.ozon.uni.android.uikit.extensions.view.ContextExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0007\u0018\u00002\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0012\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\f¢\u0006\u0004\b\u0012\u0010\u0010J\u0015\u0010\u0015\u001a\u00020\u000e2\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u000e¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u000e¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010\u001dR<\u0010\"\u001a\u001c\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020 \u0012\u0004\u0012\u00020!\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u001e8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'¨\u0006("}, d2 = {"Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchView;", "", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentAddressSearchSuggestionsBinding;", "containerViewBinding", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter;", "suggestionsAdapter", "Landroidx/fragment/app/r;", "activity", "Landroidx/lifecycle/J;", "viewLifecycleOwner", "<init>", "(Lru/ozon/app/android/fresh/navigation/databinding/FragmentAddressSearchSuggestionsBinding;Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter;Landroidx/fragment/app/r;Landroidx/lifecycle/J;)V", "", SearchIntents.EXTRA_QUERY, "", "changeQuery", "(Ljava/lang/String;)V", "error", "showError", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;", "screenUI", "updateUi", "(Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/AddressSearchViewModel$ScreenUI;)V", "showLoader", "()V", "hideLoader", "Lru/ozon/app/android/fresh/navigation/databinding/FragmentAddressSearchSuggestionsBinding;", "Lru/ozon/app/android/fresh/navigation/addressSearch/presentation/SuggestionsAdapter;", "Landroidx/fragment/app/r;", "Landroidx/lifecycle/J;", "Lkotlin/Function3;", "Landroid/content/Context;", "Lru/ozon/app/android/fresh/navigation/addressSearch/domain/MapSdkSuggestionVO;", "", "onSuggestClicked", "Lfd/n;", "getOnSuggestClicked", "()Lfd/n;", "setOnSuggestClicked", "(Lfd/n;)V", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressSearchView {

    @NotNull
    private final r activity;

    @NotNull
    private final FragmentAddressSearchSuggestionsBinding containerViewBinding;
    private InterfaceC6511n<? super Context, ? super MapSdkSuggestionVO, ? super Integer, Unit> onSuggestClicked;

    @NotNull
    private final SuggestionsAdapter suggestionsAdapter;

    @NotNull
    private final J viewLifecycleOwner;

    public AddressSearchView(@NotNull FragmentAddressSearchSuggestionsBinding containerViewBinding, @NotNull SuggestionsAdapter suggestionsAdapter, @NotNull r activity, @NotNull J viewLifecycleOwner) {
        Intrinsics.checkNotNullParameter(containerViewBinding, "containerViewBinding");
        Intrinsics.checkNotNullParameter(suggestionsAdapter, "suggestionsAdapter");
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(viewLifecycleOwner, "viewLifecycleOwner");
        this.containerViewBinding = containerViewBinding;
        this.suggestionsAdapter = suggestionsAdapter;
        this.activity = activity;
        this.viewLifecycleOwner = viewLifecycleOwner;
        RecyclerView recyclerView = containerViewBinding.suggestionsRv;
        suggestionsAdapter.setOnAddressClick$navigation_prodGoogleAllVendorsRelease(new AddressSearchView$1$1$1(this));
        recyclerView.setAdapter(suggestionsAdapter);
    }

    public final void changeQuery(@NotNull String query) {
        Intrinsics.checkNotNullParameter(query, "query");
        this.containerViewBinding.searchSv.p(query, false);
    }

    public final InterfaceC6511n<Context, MapSdkSuggestionVO, Integer, Unit> getOnSuggestClicked() {
        return this.onSuggestClicked;
    }

    public final void hideLoader() {
        FrameLayout constraintLayout = this.containerViewBinding.progressBar.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.gone(constraintLayout);
    }

    public final void setOnSuggestClicked(InterfaceC6511n<? super Context, ? super MapSdkSuggestionVO, ? super Integer, Unit> interfaceC6511n) {
        this.onSuggestClicked = interfaceC6511n;
    }

    public final void showError(@NotNull String error) {
        Intrinsics.checkNotNullParameter(error, "error");
        ViewGroup rootView = ContextExtKt.getRootView(this.activity);
        if (rootView != null) {
            FlashbarFactory flashbarFactory = FlashbarFactory.INSTANCE;
            OzonSpannableString ozonSpannableString = OzonSpannableStringKt.toOzonSpannableString(error);
            int i11 = R$drawable.ic_warning;
            FlashbarFactory.create$default(flashbarFactory, rootView, null, ozonSpannableString, null, null, Integer.valueOf(i11), null, null, null, null, null, null, null, 3000L, null, null, this.viewLifecycleOwner, 57306, null).show();
        }
    }

    public final void showLoader() {
        FrameLayout constraintLayout = this.containerViewBinding.progressBar.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        ViewExtKt.show(constraintLayout);
    }

    public final void updateUi(@NotNull AddressSearchViewModel.ScreenUI screenUI) {
        Intrinsics.checkNotNullParameter(screenUI, "screenUI");
        this.suggestionsAdapter.submitList(screenUI.getSuggests());
        this.containerViewBinding.suggestionsRv.scrollToPosition(0);
    }
}
