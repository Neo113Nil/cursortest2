package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.button.UncontainedButtonView;

/* loaded from: classes12.dex */
public final class MViewRecommendationErrorBinding implements a {

    @NonNull
    public final UncontainedButtonView errorButton;

    @NonNull
    public final Image errorImage;

    @NonNull
    public final TextAtomV2View errorTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private MViewRecommendationErrorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull UncontainedButtonView uncontainedButtonView, @NonNull Image image, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = constraintLayout;
        this.errorButton = uncontainedButtonView;
        this.errorImage = image;
        this.errorTitle = textAtomV2View;
    }

    @NonNull
    public static MViewRecommendationErrorBinding bind(@NonNull View view) {
        int i11 = R$id.errorButton;
        UncontainedButtonView uncontainedButtonView = (UncontainedButtonView) C2548q.d(i11, view);
        if (uncontainedButtonView != null) {
            i11 = R$id.errorImage;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                i11 = R$id.errorTitle;
                TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
                if (textAtomV2View != null) {
                    return new MViewRecommendationErrorBinding((ConstraintLayout) view, uncontainedButtonView, image, textAtomV2View);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MViewRecommendationErrorBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_view_recommendation_error, viewGroup, false);
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
