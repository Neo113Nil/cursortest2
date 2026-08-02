package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class WidgetSearchResultErrorLayoutBinding implements a {

    @NonNull
    public final TextView errorActionTv;

    @NonNull
    public final ImageView errorIv;

    @NonNull
    public final TextView errorTv;

    @NonNull
    private final ConstraintLayout rootView;

    private WidgetSearchResultErrorLayoutBinding(@NonNull ConstraintLayout constraintLayout, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.errorActionTv = textView;
        this.errorIv = imageView;
        this.errorTv = textView2;
    }

    @NonNull
    public static WidgetSearchResultErrorLayoutBinding bind(@NonNull View view) {
        int i11 = R$id.errorActionTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.errorIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.errorTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new WidgetSearchResultErrorLayoutBinding((ConstraintLayout) view, textView, imageView, textView2);
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
