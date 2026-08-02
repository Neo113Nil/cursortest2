package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;

/* loaded from: classes4.dex */
public final class ViewCalendarDateControlBinding implements a {

    @NonNull
    public final AppCompatTextView dateControlAddReturnDateTv;

    @NonNull
    public final AppCompatTextView dateControlDateTv;

    @NonNull
    public final AppCompatImageView dateControlRemoveBtn;

    @NonNull
    private final View rootView;

    private ViewCalendarDateControlBinding(@NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = view;
        this.dateControlAddReturnDateTv = appCompatTextView;
        this.dateControlDateTv = appCompatTextView2;
        this.dateControlRemoveBtn = appCompatImageView;
    }

    @NonNull
    public static ViewCalendarDateControlBinding bind(@NonNull View view) {
        int i11 = R$id.dateControlAddReturnDateTv;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.dateControlDateTv;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                i11 = R$id.dateControlRemoveBtn;
                AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
                if (appCompatImageView != null) {
                    return new ViewCalendarDateControlBinding(view, appCompatTextView, appCompatTextView2, appCompatImageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCalendarDateControlBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_calendar_date_control, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
