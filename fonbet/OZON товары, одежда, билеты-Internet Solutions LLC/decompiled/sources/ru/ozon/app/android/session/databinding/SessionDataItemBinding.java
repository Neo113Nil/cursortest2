package ru.ozon.app.android.session.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import ru.ozon.app.android.session.R$id;
import ru.ozon.app.android.session.R$layout;

/* loaded from: classes2.dex */
public final class SessionDataItemBinding implements a {

    @NonNull
    public final AppCompatTextView descriptionTextView;

    @NonNull
    private final LinearLayoutCompat rootView;

    @NonNull
    public final AppCompatTextView valueTextView;

    private SessionDataItemBinding(@NonNull LinearLayoutCompat linearLayoutCompat, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = linearLayoutCompat;
        this.descriptionTextView = appCompatTextView;
        this.valueTextView = appCompatTextView2;
    }

    @NonNull
    public static SessionDataItemBinding bind(@NonNull View view) {
        int i11 = R$id.descriptionTextView;
        AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
        if (appCompatTextView != null) {
            i11 = R$id.valueTextView;
            AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView2 != null) {
                return new SessionDataItemBinding((LinearLayoutCompat) view, appCompatTextView, appCompatTextView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static SessionDataItemBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.session_data_item, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayoutCompat getRoot() {
        return this.rootView;
    }
}
