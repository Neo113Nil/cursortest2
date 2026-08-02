package ru.ozon.app.android.travel.feature.tours.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.travel.feature.tours.R$id;
import ru.ozon.app.android.travel.molecules.view.emptyState.v1.EmptyStateView;
import ru.ozon.app.android.travel.molecules.view.threeDotLoader.ThreeDotLoaderView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes4.dex */
public final class WidgetToursLoaderBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView toursLoaderCaptionTAV;

    @NonNull
    public final Group toursLoaderContentGroup;

    @NonNull
    public final ThreeDotLoaderView toursLoaderDotsView;

    @NonNull
    public final EmptyStateView toursLoaderErrorView;

    @NonNull
    public final AppCompatImageView toursLoaderImageAPIV;

    @NonNull
    public final TextAtomView toursLoaderTitleTAV;

    private WidgetToursLoaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextAtomView textAtomView, @NonNull Group group, @NonNull ThreeDotLoaderView threeDotLoaderView, @NonNull EmptyStateView emptyStateView, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.toursLoaderCaptionTAV = textAtomView;
        this.toursLoaderContentGroup = group;
        this.toursLoaderDotsView = threeDotLoaderView;
        this.toursLoaderErrorView = emptyStateView;
        this.toursLoaderImageAPIV = appCompatImageView;
        this.toursLoaderTitleTAV = textAtomView2;
    }

    @NonNull
    public static WidgetToursLoaderBinding bind(@NonNull View view) {
        int i11 = R$id.toursLoaderCaptionTAV;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            i11 = R$id.toursLoaderContentGroup;
            Group group = (Group) C2548q.d(i11, view);
            if (group != null) {
                i11 = R$id.toursLoaderDotsView;
                ThreeDotLoaderView threeDotLoaderView = (ThreeDotLoaderView) C2548q.d(i11, view);
                if (threeDotLoaderView != null) {
                    i11 = R$id.toursLoaderErrorView;
                    EmptyStateView emptyStateView = (EmptyStateView) C2548q.d(i11, view);
                    if (emptyStateView != null) {
                        i11 = R$id.toursLoaderImageAPIV;
                        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                        if (appCompatImageView != null) {
                            i11 = R$id.toursLoaderTitleTAV;
                            TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                            if (textAtomView2 != null) {
                                return new WidgetToursLoaderBinding((ConstraintLayout) view, textAtomView, group, threeDotLoaderView, emptyStateView, appCompatImageView, textAtomView2);
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
