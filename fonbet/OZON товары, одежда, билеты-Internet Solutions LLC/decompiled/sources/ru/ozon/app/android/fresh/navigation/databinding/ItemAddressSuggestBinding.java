package ru.ozon.app.android.fresh.navigation.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.fresh.navigation.R$id;

/* loaded from: classes12.dex */
public final class ItemAddressSuggestBinding implements a {

    @NonNull
    public final ImageView disclosureIv;

    @NonNull
    public final ConstraintLayout layoutSuggestionAddress;

    @NonNull
    public final TextView numberPVZ;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final TextView titleTv;

    private ItemAddressSuggestBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull ConstraintLayout constraintLayout2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = constraintLayout;
        this.disclosureIv = imageView;
        this.layoutSuggestionAddress = constraintLayout2;
        this.numberPVZ = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static ItemAddressSuggestBinding bind(@NonNull View view) {
        int i11 = R$id.disclosureIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            ConstraintLayout constraintLayout = (ConstraintLayout) view;
            i11 = R$id.numberPVZ;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.titleTv;
                TextView textView2 = (TextView) C2548q.d(i11, view);
                if (textView2 != null) {
                    return new ItemAddressSuggestBinding(constraintLayout, imageView, constraintLayout, textView, textView2);
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
