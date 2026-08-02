package ru.ozon.app.android.orderdetails.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.orderdetails.R$id;

/* loaded from: classes13.dex */
public final class WidgetTimeLeftLayoutBinding implements a {

    @NonNull
    public final RecyclerView buttonsForTimeLeftRV;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final LinearLayout rootView;

    @NonNull
    public final Space spaceView;

    @NonNull
    public final TextView textTv;

    @NonNull
    public final ConstraintLayout timerRootCl;

    private WidgetTimeLeftLayoutBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull ImageView imageView, @NonNull Space space, @NonNull TextView textView, @NonNull ConstraintLayout constraintLayout) {
        this.rootView = linearLayout;
        this.buttonsForTimeLeftRV = recyclerView;
        this.iconIv = imageView;
        this.spaceView = space;
        this.textTv = textView;
        this.timerRootCl = constraintLayout;
    }

    @NonNull
    public static WidgetTimeLeftLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.buttonsForTimeLeftRV;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.iconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.spaceView;
                Space space = (Space) C2548q.d(i11, view);
                if (space != null) {
                    i11 = R$id.textTv;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        i11 = R$id.timerRootCl;
                        ConstraintLayout constraintLayout = (ConstraintLayout) C2548q.d(i11, view);
                        if (constraintLayout != null) {
                            return new WidgetTimeLeftLayoutBinding((LinearLayout) view, recyclerView, imageView, space, textView, constraintLayout);
                        }
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
