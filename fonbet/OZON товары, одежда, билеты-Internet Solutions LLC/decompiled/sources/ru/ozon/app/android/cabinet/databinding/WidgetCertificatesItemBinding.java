package ru.ozon.app.android.cabinet.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.cabinet.R$id;

/* loaded from: classes11.dex */
public final class WidgetCertificatesItemBinding implements a {

    @NonNull
    public final TextView dateTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetCertificatesItemBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.dateTv = textView;
        this.subtitleTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static WidgetCertificatesItemBinding bind(@NonNull View view) {
        int i11 = R$id.dateTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.subtitleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.titleTv;
                TextView textView3 = (TextView) C2548q.d(i11, view);
                if (textView3 != null) {
                    return new WidgetCertificatesItemBinding((ConstraintLayout) view, textView, textView2, textView3);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
