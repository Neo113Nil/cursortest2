package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import ru.ozon.app.android.pdp.R$id;

/* loaded from: classes13.dex */
public final class ItemDescriptionWidgetCharacteristicBinding implements a {

    @NonNull
    public final Guideline guideline;

    @NonNull
    public final TextView nameTv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final Space space;

    @NonNull
    public final ImageView strokeIv;

    @NonNull
    public final TextView valueTv;

    private ItemDescriptionWidgetCharacteristicBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Guideline guideline, @NonNull TextView textView, @NonNull Space space, @NonNull ImageView imageView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.guideline = guideline;
        this.nameTv = textView;
        this.space = space;
        this.strokeIv = imageView;
        this.valueTv = textView2;
    }

    @NonNull
    public static ItemDescriptionWidgetCharacteristicBinding bind(@NonNull View view) {
        int i11 = R$id.guideline;
        Guideline guideline = (Guideline) C2548q.d(i11, view);
        if (guideline != null) {
            i11 = R$id.nameTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.space;
                Space space = (Space) C2548q.d(i11, view);
                if (space != null) {
                    i11 = R$id.strokeIv;
                    ImageView imageView = (ImageView) C2548q.d(i11, view);
                    if (imageView != null) {
                        i11 = R$id.valueTv;
                        TextView textView2 = (TextView) C2548q.d(i11, view);
                        if (textView2 != null) {
                            return new ItemDescriptionWidgetCharacteristicBinding((ConstraintLayout) view, guideline, textView, space, imageView, textView2);
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
