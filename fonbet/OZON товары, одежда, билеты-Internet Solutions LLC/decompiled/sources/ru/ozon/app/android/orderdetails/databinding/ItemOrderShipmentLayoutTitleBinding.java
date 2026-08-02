package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.atoms.v3.containers.VerticalRecyclerContainer;
import ru.ozon.app.android.orderdetails.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.borderless.LargeBorderlessButtonView;

/* loaded from: classes13.dex */
public final class ItemOrderShipmentLayoutTitleBinding implements a {

    @NonNull
    public final LargeBorderlessButtonView buttonSBA;

    @NonNull
    public final AppCompatImageView iconIv;

    @NonNull
    public final VerticalRecyclerContainer linesContainerVRC;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView textTv;

    private ItemOrderShipmentLayoutTitleBinding(@NonNull ConstraintLayout constraintLayout, @NonNull LargeBorderlessButtonView largeBorderlessButtonView, @NonNull AppCompatImageView appCompatImageView, @NonNull VerticalRecyclerContainer verticalRecyclerContainer, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.buttonSBA = largeBorderlessButtonView;
        this.iconIv = appCompatImageView;
        this.linesContainerVRC = verticalRecyclerContainer;
        this.textTv = textView;
    }

    @NonNull
    public static ItemOrderShipmentLayoutTitleBinding bind(@NonNull View view) {
        int i11 = R$id.buttonSBA;
        LargeBorderlessButtonView largeBorderlessButtonView = (LargeBorderlessButtonView) C2548q.d(i11, view);
        if (largeBorderlessButtonView != null) {
            i11 = R$id.iconIv;
            AppCompatImageView appCompatImageView = (AppCompatImageView) C2548q.d(i11, view);
            if (appCompatImageView != null) {
                i11 = R$id.linesContainerVRC;
                VerticalRecyclerContainer verticalRecyclerContainer = (VerticalRecyclerContainer) C2548q.d(i11, view);
                if (verticalRecyclerContainer != null) {
                    i11 = R$id.textTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new ItemOrderShipmentLayoutTitleBinding((ConstraintLayout) view, largeBorderlessButtonView, appCompatImageView, verticalRecyclerContainer, textView);
                    }
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
