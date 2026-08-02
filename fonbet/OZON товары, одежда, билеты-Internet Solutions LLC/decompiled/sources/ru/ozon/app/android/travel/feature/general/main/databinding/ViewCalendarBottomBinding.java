package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatButton;
import androidx.appcompat.widget.AppCompatImageView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;

/* loaded from: classes4.dex */
public final class ViewCalendarBottomBinding implements a {

    @NonNull
    public final AppCompatButton calendarSelectDateButton;

    @NonNull
    public final AppCompatImageView clearButtonAPIV;

    @NonNull
    private final View rootView;

    private ViewCalendarBottomBinding(@NonNull View view, @NonNull AppCompatButton appCompatButton, @NonNull AppCompatImageView appCompatImageView) {
        this.rootView = view;
        this.calendarSelectDateButton = appCompatButton;
        this.clearButtonAPIV = appCompatImageView;
    }

    @NonNull
    public static ViewCalendarBottomBinding bind(@NonNull View view) {
        int i11 = R$id.calendarSelectDateButton;
        AppCompatButton appCompatButton = (AppCompatButton) C2548q.d(i11, view);
        if (appCompatButton != null) {
            i11 = R$id.clearButtonAPIV;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                return new ViewCalendarBottomBinding(view, appCompatButton, appCompatImageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewCalendarBottomBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_calendar_bottom, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
