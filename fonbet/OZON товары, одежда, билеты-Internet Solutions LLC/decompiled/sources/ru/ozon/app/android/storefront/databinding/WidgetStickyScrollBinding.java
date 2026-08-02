package ru.ozon.app.android.storefront.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.storefront.R$id;
import ru.ozon.uni.android.atom.icon.IconView;

/* loaded from: classes2.dex */
public final class WidgetStickyScrollBinding implements a {

    @NonNull
    public final IconView fireIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final TextView stickyText;

    private WidgetStickyScrollBinding(@NonNull LinearLayout linearLayout, @NonNull IconView iconView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.fireIv = iconView;
        this.stickyText = textView;
    }

    @NonNull
    public static WidgetStickyScrollBinding bind(@NonNull View view) {
        int i11 = R$id.fire_iv;
        IconView iconView = (IconView) C2548q.d(i11, view);
        if (iconView != null) {
            i11 = R$id.sticky_text;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new WidgetStickyScrollBinding((LinearLayout) view, iconView, textView);
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
