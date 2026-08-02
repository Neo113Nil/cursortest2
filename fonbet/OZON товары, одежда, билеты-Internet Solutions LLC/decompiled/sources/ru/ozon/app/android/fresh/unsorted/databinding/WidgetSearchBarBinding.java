package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.unsorted.R$id;

/* loaded from: classes12.dex */
public final class WidgetSearchBarBinding implements a {

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final LinearLayout searchBarLayout;

    @NonNull
    public final TextView textTv;

    private WidgetSearchBarBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.searchBarLayout = linearLayout2;
        this.textTv = textView;
    }

    @NonNull
    public static WidgetSearchBarBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.textTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new WidgetSearchBarBinding(linearLayout, linearLayout, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
