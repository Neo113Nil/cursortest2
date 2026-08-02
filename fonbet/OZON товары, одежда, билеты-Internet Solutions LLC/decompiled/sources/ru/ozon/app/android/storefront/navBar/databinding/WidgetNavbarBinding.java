package ru.ozon.app.android.storefront.navBar.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.navBar.R$id;

/* loaded from: classes2.dex */
public final class WidgetNavbarBinding implements a {

    @NonNull
    public final LinearLayout actionPointsLeftLL;

    @NonNull
    public final LinearLayout actionPointsRightLL;

    @NonNull
    public final FrameLayout placeholderFl;

    @NonNull
    private final LinearLayout rootView;

    private WidgetNavbarBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull LinearLayout linearLayout3, @NonNull FrameLayout frameLayout) {
        this.rootView = linearLayout;
        this.actionPointsLeftLL = linearLayout2;
        this.actionPointsRightLL = linearLayout3;
        this.placeholderFl = frameLayout;
    }

    @NonNull
    public static WidgetNavbarBinding bind(@NonNull View view) {
        int i11 = R$id.actionPointsLeftLL;
        LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
        if (linearLayout != null) {
            i11 = R$id.actionPointsRightLL;
            LinearLayout linearLayout2 = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout2 != null) {
                i11 = R$id.placeholderFl;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    return new WidgetNavbarBinding((LinearLayout) view, linearLayout, linearLayout2, frameLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
