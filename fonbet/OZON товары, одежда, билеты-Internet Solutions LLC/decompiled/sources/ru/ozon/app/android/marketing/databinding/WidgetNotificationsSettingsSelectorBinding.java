package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;

/* loaded from: classes12.dex */
public final class WidgetNotificationsSettingsSelectorBinding implements a {

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    @NonNull
    public final LinearLayout variantsLl;

    private WidgetNotificationsSettingsSelectorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull LinearLayout linearLayout) {
        this.rootView = constraintLayout;
        this.titleTv = textView;
        this.variantsLl = linearLayout;
    }

    @NonNull
    public static WidgetNotificationsSettingsSelectorBinding bind(@NonNull View view) {
        int i11 = R$id.titleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.variantsLl;
            LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
            if (linearLayout != null) {
                return new WidgetNotificationsSettingsSelectorBinding((ConstraintLayout) view, textView, linearLayout);
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
