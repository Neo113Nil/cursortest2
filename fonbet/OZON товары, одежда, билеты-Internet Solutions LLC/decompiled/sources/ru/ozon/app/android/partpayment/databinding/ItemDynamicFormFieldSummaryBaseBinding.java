package ru.ozon.app.android.partpayment.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.partpayment.R$id;

/* loaded from: classes13.dex */
public final class ItemDynamicFormFieldSummaryBaseBinding implements a {

    @NonNull
    public final RecyclerView actionRv;

    @NonNull
    public final TextView changeBtn;

    @NonNull
    public final TextView descriptionTv;

    @NonNull
    public final RecyclerView detailsRv;

    @NonNull
    public final FrameLayout layoutBackgroundProgressBar;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView statusIv;

    @NonNull
    public final TextView titleTv;

    private ItemDynamicFormFieldSummaryBaseBinding(@NonNull ConstraintLayout constraintLayout, @NonNull RecyclerView recyclerView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull RecyclerView recyclerView2, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.actionRv = recyclerView;
        this.changeBtn = textView;
        this.descriptionTv = textView2;
        this.detailsRv = recyclerView2;
        this.layoutBackgroundProgressBar = frameLayout;
        this.statusIv = imageView;
        this.titleTv = textView3;
    }

    @NonNull
    public static ItemDynamicFormFieldSummaryBaseBinding bind(@NonNull View view) {
        int i11 = R$id.actionRv;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.changeBtn;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.descriptionTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    i11 = R$id.detailsRv;
                    RecyclerView recyclerView2 = (RecyclerView) C2548q.d(i11, view);
                    if (recyclerView2 != null) {
                        i11 = R$id.layoutBackgroundProgressBar;
                        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
                        if (frameLayout != null) {
                            i11 = R$id.statusIv;
                            ImageView imageView = (ImageView) C2548q.d(i11, view);
                            if (imageView != null) {
                                i11 = R$id.titleTv;
                                TextView textView3 = (TextView) C2548q.d(i11, view);
                                if (textView3 != null) {
                                    return new ItemDynamicFormFieldSummaryBaseBinding((ConstraintLayout) view, recyclerView, textView, textView2, recyclerView2, frameLayout, imageView, textView3);
                                }
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
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
