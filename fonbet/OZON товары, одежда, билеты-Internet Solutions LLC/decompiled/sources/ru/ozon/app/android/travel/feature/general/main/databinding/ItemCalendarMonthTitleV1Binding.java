package ru.ozon.app.android.travel.feature.general.main.databinding;

import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;

/* loaded from: classes4.dex */
public final class ItemCalendarMonthTitleV1Binding implements a {

    @NonNull
    public final AppCompatTextView monthTitleTv;

    @NonNull
    private final AppCompatTextView rootView;

    private ItemCalendarMonthTitleV1Binding(@NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = appCompatTextView;
        this.monthTitleTv = appCompatTextView2;
    }

    @NonNull
    public static ItemCalendarMonthTitleV1Binding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        AppCompatTextView appCompatTextView = (AppCompatTextView) view;
        return new ItemCalendarMonthTitleV1Binding(appCompatTextView, appCompatTextView);
    }

    @Override // X4.a
    @NonNull
    public AppCompatTextView getRoot() {
        return this.rootView;
    }
}
