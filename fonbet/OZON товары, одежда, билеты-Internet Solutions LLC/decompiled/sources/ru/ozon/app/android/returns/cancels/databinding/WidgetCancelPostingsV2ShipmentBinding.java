package ru.ozon.app.android.returns.cancels.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.returns.cancels.R$id;

/* loaded from: classes13.dex */
public final class WidgetCancelPostingsV2ShipmentBinding implements a {

    @NonNull
    public final View checkboxV;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final AppCompatTextView subtitleTv;

    @NonNull
    public final AppCompatTextView titleTv;

    private WidgetCancelPostingsV2ShipmentBinding(@NonNull ConstraintLayout constraintLayout, @NonNull View view, @NonNull AppCompatTextView appCompatTextView, @NonNull AppCompatTextView appCompatTextView2) {
        this.rootView = constraintLayout;
        this.checkboxV = view;
        this.subtitleTv = appCompatTextView;
        this.titleTv = appCompatTextView2;
    }

    @NonNull
    public static WidgetCancelPostingsV2ShipmentBinding bind(@NonNull View view) {
        int i11 = R$id.checkboxV;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.subtitleTv;
            AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
            if (appCompatTextView != null) {
                i11 = R$id.titleTv;
                AppCompatTextView appCompatTextView2 = (AppCompatTextView) C2548q.d(i11, view);
                if (appCompatTextView2 != null) {
                    return new WidgetCancelPostingsV2ShipmentBinding((ConstraintLayout) view, d11, appCompatTextView, appCompatTextView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
