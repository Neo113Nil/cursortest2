package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.partpayment.R$id;
import ru.ozon.app.android.partpayment.R$layout;

/* loaded from: classes13.dex */
public final class WidgetNouiFormPageBinding implements a {

    @NonNull
    public final RecyclerView fieldsRv;

    @NonNull
    public final TextView formTitleTv;

    @NonNull
    public final FrameLayout layoutBackgroundProgressBar;

    @NonNull
    public final ConstraintLayout pageFormWidgetCl;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetNouiFormPageBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull FrameLayout frameLayout, @NonNull ConstraintLayout constraintLayout2) {
        this.rootView = constraintLayout;
        this.fieldsRv = recyclerView;
        this.formTitleTv = textView;
        this.layoutBackgroundProgressBar = frameLayout;
        this.pageFormWidgetCl = constraintLayout2;
    }

    @NonNull
    public static WidgetNouiFormPageBinding bind(@NonNull View view) {
        int i11 = R$id.fieldsRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.formTitleTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.layoutBackgroundProgressBar;
                FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout != null) {
                    ConstraintLayout constraintLayout = (ConstraintLayout) view;
                    return new WidgetNouiFormPageBinding(constraintLayout, recyclerView, textView, frameLayout, constraintLayout);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static WidgetNouiFormPageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.widget_noui_form_page, viewGroup, false);
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
