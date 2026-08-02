package ru.ozon.app.android.travel.feature.avia.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.travel.feature.avia.R$id;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalServiceCard.view.AdditionalServiceCardView;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.uni.android.uikit.view.atoms.price.PriceView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;

/* loaded from: classes8.dex */
public final class WidgetAdditionalServiceCardBinding implements a {

    @NonNull
    public final View backgroundView;

    @NonNull
    public final VerticalAtomsLayout detailsVerticalLayout;

    @NonNull
    public final AppCompatImageView disclosureIcon;

    @NonNull
    public final EmptyStateView emptyState;

    @NonNull
    public final AppCompatImageView imageView;

    @NonNull
    public final TextAtomView priceDescriptionTextView;

    @NonNull
    public final PriceView priceView;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final AdditionalServiceCardView skeleton;

    @NonNull
    public final TextAtomView subtitleTextView;

    @NonNull
    public final TextAtomView titleTextView;

    private WidgetAdditionalServiceCardBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull VerticalAtomsLayout verticalAtomsLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull EmptyStateView emptyStateView, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextAtomView textAtomView, @NonNull PriceView priceView, @NonNull View view2, @NonNull AdditionalServiceCardView additionalServiceCardView, @NonNull TextAtomView textAtomView2, @NonNull TextAtomView textAtomView3) {
        this.rootView = constraintLayout;
        this.backgroundView = view;
        this.detailsVerticalLayout = verticalAtomsLayout;
        this.disclosureIcon = appCompatImageView;
        this.emptyState = emptyStateView;
        this.imageView = appCompatImageView2;
        this.priceDescriptionTextView = textAtomView;
        this.priceView = priceView;
        this.separator = view2;
        this.skeleton = additionalServiceCardView;
        this.subtitleTextView = textAtomView2;
        this.titleTextView = textAtomView3;
    }

    @NonNull
    public static WidgetAdditionalServiceCardBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.backgroundView;
        View d12 = C2548q.d(i11, view);
        if (d12 != null) {
            i11 = R$id.detailsVerticalLayout;
            VerticalAtomsLayout verticalAtomsLayout = (VerticalAtomsLayout) C2548q.d(i11, view);
            if (verticalAtomsLayout != null) {
                i11 = R$id.disclosureIcon;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    i11 = R$id.emptyState;
                    EmptyStateView emptyStateView = (EmptyStateView) C2548q.d(i11, view);
                    if (emptyStateView != null) {
                        i11 = R$id.imageView;
                        AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView2 != null) {
                            i11 = R$id.priceDescriptionTextView;
                            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView != null) {
                                i11 = R$id.priceView;
                                PriceView priceView = (PriceView) C2548q.d(i11, view);
                                if (priceView != null && (d11 = C2548q.d((i11 = R$id.separator), view)) != null) {
                                    i11 = R$id.skeleton;
                                    AdditionalServiceCardView additionalServiceCardView = (AdditionalServiceCardView) C2548q.d(i11, view);
                                    if (additionalServiceCardView != null) {
                                        i11 = R$id.subtitleTextView;
                                        TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                                        if (textAtomView2 != null) {
                                            i11 = R$id.titleTextView;
                                            TextAtomView textAtomView3 = (TextAtomView) C2548q.d(i11, view);
                                            if (textAtomView3 != null) {
                                                return new WidgetAdditionalServiceCardBinding((ConstraintLayout) view, d12, verticalAtomsLayout, appCompatImageView, emptyStateView, appCompatImageView2, textAtomView, priceView, d11, additionalServiceCardView, textAtomView2, textAtomView3);
                                            }
                                        }
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

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
