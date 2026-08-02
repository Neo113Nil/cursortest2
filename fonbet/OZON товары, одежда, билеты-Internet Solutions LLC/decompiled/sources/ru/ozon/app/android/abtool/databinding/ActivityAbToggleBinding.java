package ru.ozon.app.android.abtool.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.Toolbar;
import ru.ozon.app.android.abtool.R$id;
import ru.ozon.app.android.abtool.R$layout;

/* loaded from: classes11.dex */
public final class ActivityAbToggleBinding implements a {

    @NonNull
    public final FrameLayout container;

    @NonNull
    public final LinearLayout rootContainer;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final Toolbar toolbar;

    private ActivityAbToggleBinding(@NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout, @NonNull LinearLayout linearLayout2, @NonNull Toolbar toolbar) {
        this.rootView = linearLayout;
        this.container = frameLayout;
        this.rootContainer = linearLayout2;
        this.toolbar = toolbar;
    }

    @NonNull
    public static ActivityAbToggleBinding bind(@NonNull View view) {
        int i11 = R$id.container;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            LinearLayout linearLayout = (LinearLayout) view;
            int i12 = R$id.toolbar;
            Toolbar toolbar = (Toolbar) C2548q.d(i12, view);
            if (toolbar != null) {
                return new ActivityAbToggleBinding(linearLayout, frameLayout, linearLayout, toolbar);
            }
            i11 = i12;
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ActivityAbToggleBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static ActivityAbToggleBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.activity_ab_toggle, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
