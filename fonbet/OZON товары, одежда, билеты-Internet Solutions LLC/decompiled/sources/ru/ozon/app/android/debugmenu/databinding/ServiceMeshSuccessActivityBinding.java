package ru.ozon.app.android.debugmenu.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.debugmenu.R$id;
import ru.ozon.app.android.debugmenu.R$layout;

/* loaded from: classes11.dex */
public final class ServiceMeshSuccessActivityBinding implements a {

    @NonNull
    public final TextView headerHint;

    @NonNull
    public final TextView headerValue;

    @NonNull
    public final Button restartAppButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    private ServiceMeshSuccessActivityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull TextView textView2, @NonNull Button button, @NonNull Toolbar toolbar) {
        this.rootView = constraintLayout;
        this.headerHint = textView;
        this.headerValue = textView2;
        this.restartAppButton = button;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ServiceMeshSuccessActivityBinding bind(@NonNull View view) {
        int i11 = R$id.headerHint;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.headerValue;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                i11 = R$id.restartAppButton;
                Button button = (Button) C2548q.d(i11, view);
                if (button != null) {
                    i11 = R$id.toolbar;
                    Toolbar toolbar = (Toolbar) C2548q.d(i11, view);
                    if (toolbar != null) {
                        return new ServiceMeshSuccessActivityBinding((ConstraintLayout) view, textView, textView2, button, toolbar);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ServiceMeshSuccessActivityBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ServiceMeshSuccessActivityBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.service_mesh_success_activity, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
