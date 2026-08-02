package ru.ozon.app.android.uikit.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.uikit.R$id;
import ru.ozon.app.android.uikit.R$layout;
import ru.ozon.app.android.uikit.view.atoms.color.ColorCircleView;

/* loaded from: classes2.dex */
public final class ColorViewBinding implements a {

    @NonNull
    public final ColorCircleView colorCircleView;

    @NonNull
    public final AppCompatTextView countTv;

    @NonNull
    private final View rootView;

    private ColorViewBinding(@NonNull View view, @NonNull ColorCircleView colorCircleView, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = view;
        this.colorCircleView = colorCircleView;
        this.countTv = appCompatTextView;
    }

    @NonNull
    public static ColorViewBinding bind(@NonNull View view) {
        int i11 = R$id.colorCircleView;
        ColorCircleView colorCircleView = (ColorCircleView) C2548q.d(i11, view);
        if (colorCircleView != null) {
            i11 = R$id.countTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                return new ColorViewBinding(view, colorCircleView, appCompatTextView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ColorViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.color_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    public View getRoot() {
        return this.rootView;
    }
}
