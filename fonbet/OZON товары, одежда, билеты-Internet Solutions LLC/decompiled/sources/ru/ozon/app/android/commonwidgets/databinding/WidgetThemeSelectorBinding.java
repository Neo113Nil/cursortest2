package ru.ozon.app.android.commonwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import ru.ozon.app.android.commonwidgets.R$id;

/* loaded from: classes11.dex */
public final class WidgetThemeSelectorBinding implements a {

    @NonNull
    public final Group darkG;

    @NonNull
    public final View darkSeparatorV;

    @NonNull
    public final TextView darkTv;

    @NonNull
    public final View darkV;

    @NonNull
    public final Group inSystemG;

    @NonNull
    public final View inSystemSeparatorV;

    @NonNull
    public final TextView inSystemTv;

    @NonNull
    public final View inSystemV;

    @NonNull
    public final Group lightG;

    @NonNull
    public final View lightSeparatorV;

    @NonNull
    public final TextView lightTv;

    @NonNull
    public final View lightV;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetThemeSelectorBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Group group, @NonNull View view, @NonNull TextView textView, @NonNull View view2, @NonNull Group group2, @NonNull View view3, @NonNull TextView textView2, @NonNull View view4, @NonNull Group group3, @NonNull View view5, @NonNull TextView textView3, @NonNull View view6) {
        this.rootView = constraintLayout;
        this.darkG = group;
        this.darkSeparatorV = view;
        this.darkTv = textView;
        this.darkV = view2;
        this.inSystemG = group2;
        this.inSystemSeparatorV = view3;
        this.inSystemTv = textView2;
        this.inSystemV = view4;
        this.lightG = group3;
        this.lightSeparatorV = view5;
        this.lightTv = textView3;
        this.lightV = view6;
    }

    @NonNull
    public static WidgetThemeSelectorBinding bind(@NonNull View view) {
        View d11;
        View d12;
        View d13;
        View d14;
        View d15;
        View d16;
        int i11 = R$id.darkG;
        Group group = (Group) C2548q.d(i11, view);
        if (group != null && (d11 = C2548q.d((i11 = R$id.darkSeparatorV), view)) != null) {
            i11 = R$id.darkTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null && (d12 = C2548q.d((i11 = R$id.darkV), view)) != null) {
                i11 = R$id.inSystemG;
                Group group2 = (Group) C2548q.d(i11, view);
                if (group2 != null && (d13 = C2548q.d((i11 = R$id.inSystemSeparatorV), view)) != null) {
                    i11 = R$id.inSystemTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null && (d14 = C2548q.d((i11 = R$id.inSystemV), view)) != null) {
                        i11 = R$id.lightG;
                        Group group3 = (Group) C2548q.d(i11, view);
                        if (group3 != null && (d15 = C2548q.d((i11 = R$id.lightSeparatorV), view)) != null) {
                            i11 = R$id.lightTv;
                            TextView textView3 = (TextView) C2548q.d(i11, view);
                            if (textView3 != null && (d16 = C2548q.d((i11 = R$id.lightV), view)) != null) {
                                return new WidgetThemeSelectorBinding((ConstraintLayout) view, group, d11, textView, d12, group2, d13, textView2, d14, group3, d15, textView3, d16);
                            }
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
