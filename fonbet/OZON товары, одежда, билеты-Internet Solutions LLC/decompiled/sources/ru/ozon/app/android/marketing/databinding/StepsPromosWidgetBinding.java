package ru.ozon.app.android.marketing.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.marketing.R$id;

/* loaded from: classes12.dex */
public final class StepsPromosWidgetBinding implements a {

    @NonNull
    public final Button activationActionButton;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final ImageView shareIv;

    @NonNull
    public final TextView showStepsActionTv;

    @NonNull
    public final TextView subTitleTv;

    @NonNull
    public final TextView titleTv;

    private StepsPromosWidgetBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Button button, @NonNull ImageView imageView, @NonNull TextView textView, @NonNull TextView textView2, @NonNull TextView textView3) {
        this.rootView = constraintLayout;
        this.activationActionButton = button;
        this.shareIv = imageView;
        this.showStepsActionTv = textView;
        this.subTitleTv = textView2;
        this.titleTv = textView3;
    }

    @NonNull
    public static StepsPromosWidgetBinding bind(@NonNull View view) {
        int i11 = R$id.activationActionButton;
        Button button = (Button) C2548q.d(i11, view);
        if (button != null) {
            i11 = R$id.shareIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.showStepsActionTv;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    i11 = R$id.subTitleTv;
                    TextView textView2 = (TextView) C2548q.d(i11, view);
                    if (textView2 != null) {
                        i11 = R$id.titleTv;
                        TextView textView3 = (TextView) C2548q.d(i11, view);
                        if (textView3 != null) {
                            return new StepsPromosWidgetBinding((ConstraintLayout) view, button, imageView, textView, textView2, textView3);
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
