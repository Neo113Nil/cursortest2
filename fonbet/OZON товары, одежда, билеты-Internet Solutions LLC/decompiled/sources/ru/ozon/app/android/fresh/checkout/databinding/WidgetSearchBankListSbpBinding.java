package ru.ozon.app.android.fresh.checkout.databinding;

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
import ru.ozon.app.android.fresh.checkout.R$id;
import ru.ozon.app.android.fresh.checkout.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;

/* loaded from: classes12.dex */
public final class WidgetSearchBankListSbpBinding implements a {

    @NonNull
    public final VerticalRecyclerContainer banksVerticalRecyclerContainer;

    @NonNull
    public final IconButtonV3View closeButton;

    @NonNull
    public final TextAtomV2View emptyListPlaceholderTextAtomView;

    @NonNull
    public final Barrier headerBarrier;

    @NonNull
    public final FrameLayout layoutBackgroundProgressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout searchBankListSBP;

    @NonNull
    public final Barrier searchBarBarrier;

    @NonNull
    public final SearchView searchView;

    @NonNull
    public final TextAtomV2View sectionHeaderTextAtomView;

    private WidgetSearchBankListSbpBinding(@NonNull ConstraintLayout constraintLayout, @NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull IconButtonV3View iconButtonV3View, @NonNull TextAtomV2View textAtomV2View, @NonNull Barrier barrier, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull Barrier barrier2, @NonNull SearchView searchView, @NonNull TextAtomV2View textAtomV2View2) {
        this.rootView = constraintLayout;
        this.banksVerticalRecyclerContainer = verticalRecyclerContainer;
        this.closeButton = iconButtonV3View;
        this.emptyListPlaceholderTextAtomView = textAtomV2View;
        this.headerBarrier = barrier;
        this.layoutBackgroundProgressBar = frameLayout;
        this.searchBankListSBP = constraintLayout2;
        this.searchBarBarrier = barrier2;
        this.searchView = searchView;
        this.sectionHeaderTextAtomView = textAtomV2View2;
    }

    @NonNull
    public static WidgetSearchBankListSbpBinding bind(@NonNull View view) {
        int i11 = R$id.banksVerticalRecyclerContainer;
        VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
        if (verticalRecyclerContainer != null) {
            i11 = R$id.closeButton;
            IconButtonV3View iconButtonV3View = (IconButtonV3View) C2548q.d(i11, view);
            if (iconButtonV3View != null) {
                i11 = R$id.emptyListPlaceholderTextAtomView;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    i11 = R$id.headerBarrier;
                    Barrier barrier = (Barrier) C2548q.d(i11, view);
                    if (barrier != null) {
                        i11 = R$id.layoutBackgroundProgressBar;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.searchBarBarrier;
                            Barrier barrier2 = (Barrier) C2548q.d(i11, view);
                            if (barrier2 != null) {
                                i11 = R$id.searchView;
                                SearchView searchView = (SearchView) C2548q.d(i11, view);
                                if (searchView != null) {
                                    i11 = R$id.sectionHeaderTextAtomView;
                                    TextAtomV2View textAtomV2View2 = (TextAtomV2View) C2548q.d(i11, view);
                                    if (textAtomV2View2 != null) {
                                        return new WidgetSearchBankListSbpBinding(constraintLayout, verticalRecyclerContainer, iconButtonV3View, textAtomV2View, barrier, frameLayout, constraintLayout, barrier2, searchView, textAtomV2View2);
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
    public static WidgetSearchBankListSbpBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_search_bank_list_sbp, viewGroup, false);
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
