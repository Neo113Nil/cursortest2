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
public final class FinMenuItemViewBinding implements a {

    @NonNull
    public final ImageView finMenuItemChevronImageView;

    @NonNull
    public final ImageView finMenuItemImageView;

    @NonNull
    public final ConstraintLayout finMenuItemRoot;

    @NonNull
    public final TextAtomView finMenuItemSubtitle;

    @NonNull
    public final TextAtomView finMenuItemTitle;

    @NonNull
    private final ConstraintLayout rootView;

    private FinMenuItemViewBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull ConstraintLayout constraintLayout2, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.finMenuItemChevronImageView = imageView;
        this.finMenuItemImageView = imageView2;
        this.finMenuItemRoot = constraintLayout2;
        this.finMenuItemSubtitle = textAtomView;
        this.finMenuItemTitle = textAtomView2;
    }

    @NonNull
    public static FinMenuItemViewBinding bind(@NonNull View view) {
        int i11 = R.id.fin_menu_item_chevron_image_view;
        ImageView imageView = (ImageView) C2548q.d(R.id.fin_menu_item_chevron_image_view, view);
        if (imageView != null) {
            i11 = R.id.fin_menu_item_image_view;
            ImageView imageView2 = (ImageView) C2548q.d(R.id.fin_menu_item_image_view, view);
            if (imageView2 != null) {
                ConstraintLayout constraintLayout = (ConstraintLayout) view;
                i11 = R.id.fin_menu_item_subtitle;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(R.id.fin_menu_item_subtitle, view);
                if (textAtomView != null) {
                    i11 = R.id.fin_menu_item_title;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(R.id.fin_menu_item_title, view);
                    if (textAtomView2 != null) {
                        return new FinMenuItemViewBinding(constraintLayout, imageView, imageView2, constraintLayout, textAtomView, textAtomView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FinMenuItemViewBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static FinMenuItemViewBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.fin_menu_item_view, viewGroup, false);
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
