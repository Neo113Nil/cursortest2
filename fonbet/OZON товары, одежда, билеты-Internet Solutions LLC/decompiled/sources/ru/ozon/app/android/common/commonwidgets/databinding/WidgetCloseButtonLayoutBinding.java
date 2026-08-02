package ru.ozon.app.android.common.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.common.commonwidgets.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.SmallIconButtonView;

/* loaded from: classes11.dex */
public final class WidgetCloseButtonLayoutBinding implements a {

    @NonNull
    public final SmallIconButtonView closeSibv;

    @NonNull
    private final FrameLayout rootView;

    private WidgetCloseButtonLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull SmallIconButtonView smallIconButtonView) {
        this.rootView = frameLayout;
        this.closeSibv = smallIconButtonView;
    }

    @NonNull
    public static WidgetCloseButtonLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.closeSibv;
        SmallIconButtonView smallIconButtonView = (SmallIconButtonView) C2548q.d(i11, view);
        if (smallIconButtonView != null) {
            return new WidgetCloseButtonLayoutBinding((FrameLayout) view, smallIconButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
