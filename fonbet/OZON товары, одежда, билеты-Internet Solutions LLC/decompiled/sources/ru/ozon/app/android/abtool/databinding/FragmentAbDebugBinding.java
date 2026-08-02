package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.R$layout;

/* loaded from: classes11.dex */
public final class FragmentAbDebugBinding implements a {

    @NonNull
    public final Button btnRestartApp;

    @NonNull
    public final ConstraintLayout rootContainer;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvAbVariants;

    private FragmentAbDebugBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.btnRestartApp = button;
        this.rootContainer = constraintLayout2;
        this.tvAbVariants = textView;
    }

    @NonNull
    public static FragmentAbDebugBinding bind(@NonNull View view) {
        int i11 = R$id.btnRestartApp;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            int i12 = R$id.tvAbVariants;
            TextView textView = (TextView) C2548q.d(i12, view);
            if (textView != null) {
                return new FragmentAbDebugBinding(constraintLayout, button, constraintLayout, textView);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentAbDebugBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_ab_debug, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
