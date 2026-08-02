package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;

/* loaded from: classes2.dex */
public final class WidgetUserSocialsMobileHeaderBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TextAtomView titleTav;

    private WidgetUserSocialsMobileHeaderBinding(@NonNull FrameLayout frameLayout, @NonNull TextAtomView textAtomView) {
        this.rootView = frameLayout;
        this.titleTav = textAtomView;
    }

    @NonNull
    public static WidgetUserSocialsMobileHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.titleTav;
        TextAtomView textAtomView = (TextAtomView) C2548q.d(i11, view);
        if (textAtomView != null) {
            return new WidgetUserSocialsMobileHeaderBinding((FrameLayout) view, textAtomView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
