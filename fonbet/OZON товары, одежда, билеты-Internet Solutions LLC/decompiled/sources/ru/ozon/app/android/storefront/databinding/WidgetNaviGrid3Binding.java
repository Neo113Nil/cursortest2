package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.app.android.storefrontcommonwidgets.core.views.AspectRatioImageView;
import ru.ozon.uni.android.atom.badge.BadgeView;

/* loaded from: classes2.dex */
public final class WidgetNaviGrid3Binding implements a {

    @NonNull
    public final BadgeView badgeAtomV;

    @NonNull
    public final AspectRatioImageView ivImage;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvLabel;

    @NonNull
    public final TextView tvTitle;

    private WidgetNaviGrid3Binding(@NonNull ConstraintLayout constraintLayout, @NonNull BadgeView badgeView, @NonNull AspectRatioImageView aspectRatioImageView, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.badgeAtomV = badgeView;
        this.ivImage = aspectRatioImageView;
        this.tvLabel = textView;
        this.tvTitle = textView2;
    }

    @NonNull
    public static WidgetNaviGrid3Binding bind(@NonNull View view) {
        int i11 = R$id.badgeAtomV;
        BadgeView badgeView = (BadgeView) C2548q.d(i11, view);
        if (badgeView != null) {
            i11 = R$id.ivImage;
            AspectRatioImageView aspectRatioImageView = (AspectRatioImageView) C2548q.d(i11, view);
            if (aspectRatioImageView != null) {
                i11 = R$id.tvLabel;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.tvTitle;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        return new WidgetNaviGrid3Binding((ConstraintLayout) view, badgeView, aspectRatioImageView, textView, textView2);
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
