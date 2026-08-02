package ru.ozon.app.android.fresh.navigation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.fresh.navigation.R$id;
import ru.ozon.app.android.uikit.databinding.ViewProgressbarBgBinding;
import ru.ozon.app.android.uikit.screenstate.ScreenStateViewWidget;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes12.dex */
public final class FragmentAddressSearchSuggestionsBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView cancelButton;

    @NonNull
    public final FrameLayout composerContainer;

    @NonNull
    public final ViewProgressbarBgBinding progressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ScreenStateViewWidget screenStateView;

    @NonNull
    public final SearchView searchSv;

    @NonNull
    public final RecyclerView suggestionsRv;

    private FragmentAddressSearchSuggestionsBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull FrameLayout frameLayout, @NonNull ViewProgressbarBgBinding viewProgressbarBgBinding, @NonNull ScreenStateViewWidget screenStateViewWidget, @NonNull SearchView searchView, @NonNull RecyclerView recyclerView) {
        this.rootView = constraintLayout;
        this.cancelButton = largeBorderlessButtonView;
        this.composerContainer = frameLayout;
        this.progressBar = viewProgressbarBgBinding;
        this.screenStateView = screenStateViewWidget;
        this.searchSv = searchView;
        this.suggestionsRv = recyclerView;
    }

    @NonNull
    public static FragmentAddressSearchSuggestionsBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.cancelButton;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            i11 = R$id.composerContainer;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null && (d11 = C2548q.d((i11 = R$id.progressBar), view)) != null) {
                ViewProgressbarBgBinding bind = ViewProgressbarBgBinding.bind(d11);
                i11 = R$id.screenStateView;
                ScreenStateViewWidget screenStateViewWidget = (ScreenStateViewWidget) C2548q.d(i11, view);
                if (screenStateViewWidget != null) {
                    i11 = R$id.searchSv;
                    SearchView searchView = (SearchView) C2548q.d(i11, view);
                    if (searchView != null) {
                        i11 = R$id.suggestionsRv;
                        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                        if (recyclerView != null) {
                            return new FragmentAddressSearchSuggestionsBinding((ConstraintLayout) view, largeBorderlessButtonView, frameLayout, bind, screenStateViewWidget, searchView, recyclerView);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
