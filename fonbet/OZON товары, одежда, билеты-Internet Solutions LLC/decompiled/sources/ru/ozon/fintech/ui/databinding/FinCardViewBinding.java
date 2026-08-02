package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.R;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes3.dex */
public final class FinCardViewBinding implements a {

    @NonNull
    public final ImageView finCardImageView;

    @NonNull
    public final ConstraintLayout finCardRoot;

    @NonNull
    public final TextAtomView finCardSubtitleView;

    @NonNull
    public final TextAtomView finCardTitleView;

    @NonNull
    private final ConstraintLayout rootView;

    private FinCardViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.finCardImageView = imageView;
        this.finCardRoot = constraintLayout2;
        this.finCardSubtitleView = textAtomView;
        this.finCardTitleView = textAtomView2;
    }

    @NonNull
    public static FinCardViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_card_image_view;
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_card_image_view, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R.id.fin_card_subtitle_view;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_card_subtitle_view, view);
            if (textAtomView != null) {
                i11 = R.id.fin_card_title_view;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(R.id.fin_card_title_view, view);
                if (textAtomView2 != null) {
                    return new FinCardViewBinding(constraintLayout, imageView, constraintLayout, textAtomView, textAtomView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinCardViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FinCardViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fin_card_view, viewGroup, false);
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
