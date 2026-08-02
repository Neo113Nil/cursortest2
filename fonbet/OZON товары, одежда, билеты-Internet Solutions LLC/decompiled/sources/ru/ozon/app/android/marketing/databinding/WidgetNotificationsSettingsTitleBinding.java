package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;

/* loaded from: classes12.dex */
public final class WidgetNotificationsSettingsTitleBinding implements a {

    @NonNull
    public final ConstraintLayout notificationSettingsCl;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private WidgetNotificationsSettingsTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.notificationSettingsCl = constraintLayout2;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static WidgetNotificationsSettingsTitleBinding bind(@NonNull View view) {
        ConstraintLayout constraintLayout = (ConstraintLayout) view;
        int i11 = R$id.subtitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.titleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new WidgetNotificationsSettingsTitleBinding(constraintLayout, constraintLayout, textView, textView2);
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
