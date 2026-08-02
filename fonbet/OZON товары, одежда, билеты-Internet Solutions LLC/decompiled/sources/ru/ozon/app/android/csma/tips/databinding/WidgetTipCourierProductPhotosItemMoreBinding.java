package ru.ozon.app.android.csma.tips.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.csma.tips.R$id;

/* loaded from: classes11.dex */
public final class WidgetTipCourierProductPhotosItemMoreBinding implements a {

    @NonNull
    public final TextView moreCountTv;

    @NonNull
    private final FrameLayout rootView;

    private WidgetTipCourierProductPhotosItemMoreBinding(@NonNull FrameLayout frameLayout, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.moreCountTv = textView;
    }

    @NonNull
    public static WidgetTipCourierProductPhotosItemMoreBinding bind(@NonNull View view) {
        int i11 = R$id.moreCountTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            return new WidgetTipCourierProductPhotosItemMoreBinding((FrameLayout) view, textView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
