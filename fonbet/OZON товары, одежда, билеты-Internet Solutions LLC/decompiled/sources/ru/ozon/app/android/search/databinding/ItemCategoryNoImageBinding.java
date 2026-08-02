package ru.ozon.app.android.search.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.search.R$id;

/* loaded from: classes13.dex */
public final class ItemCategoryNoImageBinding implements a {

    @NonNull
    public final CardView itemCv;

    @NonNull
    private final CardView rootView;

    @NonNull
    public final TextView subtitleTv;

    @NonNull
    public final TextView titleTv;

    private ItemCategoryNoImageBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = cardView;
        this.itemCv = cardView2;
        this.subtitleTv = textView;
        this.titleTv = textView2;
    }

    @NonNull
    public static ItemCategoryNoImageBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i11 = R$id.subtitleTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.titleTv;
            TextView textView2 = (TextView) C2548q.d(i11, view);
            if (textView2 != null) {
                return new ItemCategoryNoImageBinding(cardView, cardView, textView, textView2);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
