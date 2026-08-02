package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdpoldwidgets.R$id;

/* loaded from: classes13.dex */
public final class PdpWidgetCrosslinkBinding implements a {

    @NonNull
    public final TextView brandTv;

    @NonNull
    private final FrameLayout rootView;

    private PdpWidgetCrosslinkBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.brandTv = textView;
    }

    @NonNull
    public static PdpWidgetCrosslinkBinding bind(@NonNull View view) {
        int i11 = R$id.brandTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new PdpWidgetCrosslinkBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
