package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes2.dex */
public final class WidgetDeleteAccountDescriptionStickyBinding implements a {

    @NonNull
    public final LargeButtonView deleteAccountDescriptionStickyBtn;

    @NonNull
    private final LinearLayout rootView;

    private WidgetDeleteAccountDescriptionStickyBinding(@NonNull LinearLayout linearLayout, @NonNull LargeButtonView largeButtonView) {
        this.rootView = linearLayout;
        this.deleteAccountDescriptionStickyBtn = largeButtonView;
    }

    @NonNull
    public static WidgetDeleteAccountDescriptionStickyBinding bind(@NonNull View view) {
        int i11 = R$id.deleteAccountDescriptionStickyBtn;
        LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
        if (largeButtonView != null) {
            return new WidgetDeleteAccountDescriptionStickyBinding((LinearLayout) view, largeButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
