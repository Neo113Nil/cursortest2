package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.search.R$id;
import ru.ozon.app.android.search.catalog.components.searchresultv2.presentation.BadgesContainerView;
import ru.ozon.app.android.search.searchscreen.presentation.components.searchresults.common.presentation.multiButton.view.VerticalMultiButtonContainerView;
import ru.ozon.app.android.search.views.galleryswipeview.GallerySwipeView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes13.dex */
public final class WidgetSearchResultsGridBinding implements a {

    @NonNull
    public final BadgesContainerView badgesContainer;

    @NonNull
    public final View contentElementView;

    @NonNull
    public final RecyclerView contentElementsVAL;

    @NonNull
    public final TextAtomView footerLabelTv;

    @NonNull
    public final GallerySwipeView gallerySwipeView;

    @NonNull
    public final VerticalMultiButtonContainerView multiButtonItemContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ConstraintLayout searchResultGridItemCl;

    @NonNull
    public final RecyclerView topRightButtonsRV;

    private WidgetSearchResultsGridBinding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgesContainerView badgesContainerView, @NonNull View view, @NonNull RecyclerView recyclerView, @NonNull TextAtomView textAtomView, @NonNull GallerySwipeView gallerySwipeView, @NonNull VerticalMultiButtonContainerView verticalMultiButtonContainerView, @NonNull ConstraintLayout constraintLayout2, @NonNull RecyclerView recyclerView2) {
        this.rootView = constraintLayout;
        this.badgesContainer = badgesContainerView;
        this.contentElementView = view;
        this.contentElementsVAL = recyclerView;
        this.footerLabelTv = textAtomView;
        this.gallerySwipeView = gallerySwipeView;
        this.multiButtonItemContainer = verticalMultiButtonContainerView;
        this.searchResultGridItemCl = constraintLayout2;
        this.topRightButtonsRV = recyclerView2;
    }

    @NonNull
    public static WidgetSearchResultsGridBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgesContainer;
        BadgesContainerView badgesContainerView = (BadgesContainerView) C2548q.d(i11, view);
        if (badgesContainerView != null && (d11 = C2548q.d((i11 = R$id.contentElementView), view)) != null) {
            i11 = R$id.contentElementsVAL;
            RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
            if (recyclerView != null) {
                i11 = R$id.footerLabelTv;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.gallerySwipeView;
                    GallerySwipeView gallerySwipeView = (GallerySwipeView) C2548q.d(i11, view);
                    if (gallerySwipeView != null) {
                        i11 = R$id.multiButtonItemContainer;
                        VerticalMultiButtonContainerView verticalMultiButtonContainerView = (VerticalMultiButtonContainerView) C2548q.d(i11, view);
                        if (verticalMultiButtonContainerView != null) {
                            ConstraintLayout constraintLayout = (ConstraintLayout) view;
                            i11 = R$id.topRightButtonsRV;
                            RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                            if (recyclerView2 != null) {
                                return new WidgetSearchResultsGridBinding(constraintLayout, badgesContainerView, d11, recyclerView, textAtomView, gallerySwipeView, verticalMultiButtonContainerView, constraintLayout, recyclerView2);
                            }
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
