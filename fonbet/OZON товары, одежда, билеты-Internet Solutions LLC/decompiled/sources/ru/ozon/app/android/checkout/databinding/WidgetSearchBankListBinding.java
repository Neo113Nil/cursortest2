package ru.ozon.app.android.checkout.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.SearchView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.checkout.R$id;
import ru.ozon.app.android.checkout.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes11.dex */
public final class WidgetSearchBankListBinding implements a {

    @NonNull
    public final VerticalRecyclerContainer banksVerticalRecyclerContainer;

    @NonNull
    public final SmallIconButtonView closeButton;

    @NonNull
    public final TextAtomView emptyListPlaceholderTextAtomView;

    @NonNull
    public final Barrier headerBarrier;

    @NonNull
    public final FrameLayout layoutBackgroundProgressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Barrier searchBarBarrier;

    @NonNull
    public final SearchView searchView;

    @NonNull
    public final TextAtomView sectionHeaderTextAtomView;

    private WidgetSearchBankListBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull SmallIconButtonView smallIconButtonView, @NonNull TextAtomView textAtomView, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull Barrier barrier2, @NonNull SearchView searchView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.banksVerticalRecyclerContainer = verticalRecyclerContainer;
        this.closeButton = smallIconButtonView;
        this.emptyListPlaceholderTextAtomView = textAtomView;
        this.headerBarrier = barrier;
        this.layoutBackgroundProgressBar = frameLayout;
        this.searchBarBarrier = barrier2;
        this.searchView = searchView;
        this.sectionHeaderTextAtomView = textAtomView2;
    }

    @NonNull
    public static WidgetSearchBankListBinding bind(@NonNull View view) {
        int i11 = R$id.banksVerticalRecyclerContainer;
        VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
        if (verticalRecyclerContainer != null) {
            i11 = R$id.closeButton;
            SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
            if (smallIconButtonView != null) {
                i11 = R$id.emptyListPlaceholderTextAtomView;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.headerBarrier;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        i11 = R$id.layoutBackgroundProgressBar;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            i11 = R$id.searchBarBarrier;
                            Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                            if (barrier2 != null) {
                                i11 = R$id.searchView;
                                SearchView searchView = (SearchView) C2548q.d(i11, view);
                                if (searchView != null) {
                                    i11 = R$id.sectionHeaderTextAtomView;
                                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                    if (textAtomView2 != null) {
                                        return new WidgetSearchBankListBinding((ConstraintLayout) view, verticalRecyclerContainer, smallIconButtonView, textAtomView, barrier, frameLayout, barrier2, searchView, textAtomView2);
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetSearchBankListBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_search_bank_list, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
