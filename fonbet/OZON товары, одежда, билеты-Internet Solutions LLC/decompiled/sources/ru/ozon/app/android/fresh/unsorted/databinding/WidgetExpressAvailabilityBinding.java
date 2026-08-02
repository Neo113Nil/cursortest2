package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.unsorted.R$id;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.LargeButtonView;

/* loaded from: classes12.dex */
public final class WidgetExpressAvailabilityBinding implements a {

    @NonNull
    public final Barrier barrier;

    @NonNull
    public final LargeButtonView btnChangeAddress;

    @NonNull
    public final LargeButtonView btnChangeCategory;

    @NonNull
    public final ImageView ivImage;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView tvDescription;

    private WidgetExpressAvailabilityBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Barrier barrier, @NonNull LargeButtonView largeButtonView, @NonNull LargeButtonView largeButtonView2, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = constraintLayout;
        this.barrier = barrier;
        this.btnChangeAddress = largeButtonView;
        this.btnChangeCategory = largeButtonView2;
        this.ivImage = imageView;
        this.tvDescription = textView;
    }

    @NonNull
    public static WidgetExpressAvailabilityBinding bind(@NonNull View view) {
        int i11 = R$id.barrier;
        Barrier barrier = (Barrier) C2548q.d(i11, view);
        if (barrier != null) {
            i11 = R$id.btnChangeAddress;
            LargeButtonView largeButtonView = (LargeButtonView) C2548q.d(i11, view);
            if (largeButtonView != null) {
                i11 = R$id.btnChangeCategory;
                LargeButtonView largeButtonView2 = (LargeButtonView) C2548q.d(i11, view);
                if (largeButtonView2 != null) {
                    i11 = R$id.ivImage;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.tvDescription;
                        TextView textView = (TextView) C2548q.d(i11, view);
                        if (textView != null) {
                            return new WidgetExpressAvailabilityBinding((ConstraintLayout) view, barrier, largeButtonView, largeButtonView2, imageView, textView);
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
