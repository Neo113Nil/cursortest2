package ru.ozon.app.android.fresh.feature.b2b.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.feature.b2b.R$id;

/* loaded from: classes12.dex */
public final class WidgetEdoDatePickerBinding implements a {

    @NonNull
    public final TextView dashTV;

    @NonNull
    public final View endDateBackgroundV;

    @NonNull
    public final AppCompatImageView endDateIconIV;

    @NonNull
    public final TextView endDateTV;

    @NonNull
    public final TextView endDateTitleInitialTV;

    @NonNull
    public final TextView endDateTitleTV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final View startDateBackgroundV;

    @NonNull
    public final AppCompatImageView startDateIconIV;

    @NonNull
    public final TextView startDateTV;

    @NonNull
    public final TextView startDateTitleInitialTV;

    @NonNull
    public final TextView startDateTitleTV;

    private WidgetEdoDatePickerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull TextView textView2, @NonNull TextView textView3, @NonNull TextView textView4, @NonNull View view2, @NonNull AppCompatImageView appCompatImageView2, @NonNull TextView textView5, @NonNull TextView textView6, @NonNull TextView textView7) {
        this.rootView = constraintLayout;
        this.dashTV = textView;
        this.endDateBackgroundV = view;
        this.endDateIconIV = appCompatImageView;
        this.endDateTV = textView2;
        this.endDateTitleInitialTV = textView3;
        this.endDateTitleTV = textView4;
        this.startDateBackgroundV = view2;
        this.startDateIconIV = appCompatImageView2;
        this.startDateTV = textView5;
        this.startDateTitleInitialTV = textView6;
        this.startDateTitleTV = textView7;
    }

    @NonNull
    public static WidgetEdoDatePickerBinding bind(@NonNull View view) {
        View d11;
        View d12;
        int i11 = R$id.dashTV;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null && (d11 = C2548q.d((i11 = R$id.endDateBackgroundV), view)) != null) {
            i11 = R$id.endDateIconIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.endDateTV;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.endDateTitleInitialTV;
                    TextView textView3 = (TextView) C2548q.d(i11, view);
                    if (textView3 != null) {
                        i11 = R$id.endDateTitleTV;
                        TextView textView4 = (TextView) C2548q.d(i11, view);
                        if (textView4 != null && (d12 = C2548q.d((i11 = R$id.startDateBackgroundV), view)) != null) {
                            i11 = R$id.startDateIconIV;
                            AppCompatImageView appCompatImageView2 = (AppCompatImageView) C2548q.d(i11, view);
                            if (appCompatImageView2 != null) {
                                i11 = R$id.startDateTV;
                                TextView textView5 = (TextView) C2548q.d(i11, view);
                                if (textView5 != null) {
                                    i11 = R$id.startDateTitleInitialTV;
                                    TextView textView6 = (TextView) C2548q.d(i11, view);
                                    if (textView6 != null) {
                                        i11 = R$id.startDateTitleTV;
                                        TextView textView7 = (TextView) C2548q.d(i11, view);
                                        if (textView7 != null) {
                                            return new WidgetEdoDatePickerBinding((ConstraintLayout) view, textView, d11, appCompatImageView, textView2, textView3, textView4, d12, appCompatImageView2, textView5, textView6, textView7);
                                        }
                                    }
                                }
                            }
                        }
                    }
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
