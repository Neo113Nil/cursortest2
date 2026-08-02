package ru.ozon.app.android.travel.feature.general.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.travel.feature.general.main.R$id;
import ru.ozon.app.android.travel.feature.general.main.R$layout;

/* loaded from: classes4.dex */
public final class ViewPointsInputBinding implements a {

    @NonNull
    public final AppCompatImageView pointsInputClearSearchIcon;

    @NonNull
    public final AppCompatEditText pointsInputEditText;

    @NonNull
    public final AppCompatTextView pointsInputTitleTextView;

    @NonNull
    private final View rootView;

    private ViewPointsInputBinding(@NonNull View view, @NonNull AppCompatImageView appCompatImageView, @NonNull AppCompatEditText appCompatEditText, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.pointsInputClearSearchIcon = appCompatImageView;
        this.pointsInputEditText = appCompatEditText;
        this.pointsInputTitleTextView = appCompatTextView;
    }

    @NonNull
    public static ViewPointsInputBinding bind(@NonNull View view) {
        int i11 = R$id.pointsInputClearSearchIcon;
        AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
        if (appCompatImageView != null) {
            i11 = R$id.pointsInputEditText;
            AppCompatEditText appCompatEditText = (AppCompatEditText) C2548q.d(i11, view);
            if (appCompatEditText != null) {
                i11 = R$id.pointsInputTitleTextView;
                AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView != null) {
                    return new ViewPointsInputBinding(view, appCompatImageView, appCompatEditText, appCompatTextView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ViewPointsInputBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.view_points_input, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
