package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;

/* loaded from: classes4.dex */
public final class ViewCalendarDaysRoundControlBinding implements a {

    @NonNull
    public final View daysRoundControlCheckboxView;

    @NonNull
    public final AppCompatTextView daysRoundControlTv;

    @NonNull
    private final View rootView;

    private ViewCalendarDaysRoundControlBinding(@NonNull View view, @NonNull View view2, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.daysRoundControlCheckboxView = view2;
        this.daysRoundControlTv = appCompatTextView;
    }

    @NonNull
    public static ViewCalendarDaysRoundControlBinding bind(@NonNull View view) {
        int i11 = R$id.daysRoundControlCheckboxView;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.daysRoundControlTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new ViewCalendarDaysRoundControlBinding(view, d11, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCalendarDaysRoundControlBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_calendar_days_round_control, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
