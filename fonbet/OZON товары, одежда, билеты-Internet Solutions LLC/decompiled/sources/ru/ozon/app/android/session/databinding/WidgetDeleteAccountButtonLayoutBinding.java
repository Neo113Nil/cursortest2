package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.session.R$id;

/* loaded from: classes2.dex */
public final class WidgetDeleteAccountButtonLayoutBinding implements a {

    @NonNull
    public final TextView deleteAccountTv;

    @NonNull
    private final FrameLayout rootView;

    private WidgetDeleteAccountButtonLayoutBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.deleteAccountTv = textView;
    }

    @NonNull
    public static WidgetDeleteAccountButtonLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.deleteAccountTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new WidgetDeleteAccountButtonLayoutBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
