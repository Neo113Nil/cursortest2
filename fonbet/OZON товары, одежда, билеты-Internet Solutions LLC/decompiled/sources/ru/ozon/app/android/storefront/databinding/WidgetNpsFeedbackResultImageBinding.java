package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetNpsFeedbackResultImageBinding implements a {

    @NonNull
    public final AppCompatImageView promoImage;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextAtomView subtitle;

    @NonNull
    public final TextAtomView title;

    private WidgetNpsFeedbackResultImageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull AppCompatImageView appCompatImageView, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.promoImage = appCompatImageView;
        this.subtitle = textAtomView;
        this.title = textAtomView2;
    }

    @NonNull
    public static WidgetNpsFeedbackResultImageBinding bind(@NonNull View view) {
        int i11 = R$id.promoImage;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.subtitle;
            TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
            if (textAtomView != null) {
                i11 = R$id.title;
                TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView2 != null) {
                    return new WidgetNpsFeedbackResultImageBinding((ConstraintLayout) view, appCompatImageView, textAtomView, textAtomView2);
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
