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
public final class FinIconCardViewBinding implements a {

    @NonNull
    public final ImageView finIconCardIcon;

    @NonNull
    public final ConstraintLayout finIconCardRoot;

    @NonNull
    public final ImageView finIconCardSecondaryIcon;

    @NonNull
    public final TextAtomView finIconCardText;

    @NonNull
    private final ConstraintLayout rootView;

    private FinIconCardViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull ImageView imageView2, @NonNull TextAtomView textAtomView) {
        this.rootView = constraintLayout;
        this.finIconCardIcon = imageView;
        this.finIconCardRoot = constraintLayout2;
        this.finIconCardSecondaryIcon = imageView2;
        this.finIconCardText = textAtomView;
    }

    @NonNull
    public static FinIconCardViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_icon_card_icon;
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_icon_card_icon, view);
        if (imageView != null) {
            i11 = R.id.fin_icon_card_root;
            ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(R.id.fin_icon_card_root, view);
            if (constraintLayout != null) {
                i11 = R.id.fin_icon_card_secondary_icon;
                ImageView imageView2 = (ImageView) C2548q.d(R.id.fin_icon_card_secondary_icon, view);
                if (imageView2 != null) {
                    i11 = R.id.fin_icon_card_text;
                    TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_icon_card_text, view);
                    if (textAtomView != null) {
                        return new FinIconCardViewBinding((ConstraintLayout) view, imageView, constraintLayout, imageView2, textAtomView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinIconCardViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FinIconCardViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fin_icon_card_view, viewGroup, false);
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
