package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes12.dex */
public final class WidgetInfoDropdownItemBinding implements a {

    @NonNull
    public final ImageView ivArrow;

    @NonNull
    public final ConstraintLayout root;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View separator;

    @NonNull
    public final TextAtomView tvSubtitle;

    @NonNull
    public final TextAtomView tvTitle;

    private WidgetInfoDropdownItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull View view, @NonNull TextAtomView textAtomView, @NonNull TextAtomView textAtomView2) {
        this.rootView = constraintLayout;
        this.ivArrow = imageView;
        this.root = constraintLayout2;
        this.separator = view;
        this.tvSubtitle = textAtomView;
        this.tvTitle = textAtomView2;
    }

    @NonNull
    public static WidgetInfoDropdownItemBinding bind(@NonNull View view) {
        int i11 = R$id.ivArrow;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.separator;
            View d11 = C2548q.d(i11, view);
            if (d11 != null) {
                i11 = R$id.tvSubtitle;
                TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
                if (textAtomView != null) {
                    i11 = R$id.tvTitle;
                    TextAtomView textAtomView2 = (TextAtomView) C2548q.d(i11, view);
                    if (textAtomView2 != null) {
                        return new WidgetInfoDropdownItemBinding(constraintLayout, imageView, constraintLayout, d11, textAtomView, textAtomView2);
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
