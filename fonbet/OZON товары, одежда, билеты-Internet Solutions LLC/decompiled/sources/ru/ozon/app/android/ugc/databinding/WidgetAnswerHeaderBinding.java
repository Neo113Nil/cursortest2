package ru.ozon.app.android.ugc.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.ugc.R$id;

/* loaded from: classes2.dex */
public final class WidgetAnswerHeaderBinding implements a {

    @NonNull
    public final TextView headerCountTv;

    @NonNull
    public final TextView headerTitleTv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetAnswerHeaderBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.headerCountTv = textView;
        this.headerTitleTv = textView2;
    }

    @NonNull
    public static WidgetAnswerHeaderBinding bind(@NonNull View view) {
        int i11 = R$id.headerCountTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.headerTitleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new WidgetAnswerHeaderBinding((ConstraintLayout) view, textView, textView2);
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
