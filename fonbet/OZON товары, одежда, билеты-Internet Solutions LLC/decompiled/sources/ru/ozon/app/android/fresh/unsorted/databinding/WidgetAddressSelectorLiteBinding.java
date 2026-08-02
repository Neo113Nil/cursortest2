package ru.ozon.app.android.fresh.unsorted.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.unsorted.R$id;

/* loaded from: classes12.dex */
public final class WidgetAddressSelectorLiteBinding implements a {

    @NonNull
    public final LinearLayout addressSelectorLiteRoot;

    @NonNull
    public final TextView addressTv;

    @NonNull
    public final ImageView arrowIv;

    @NonNull
    public final ImageView locationPinIv;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAddressSelectorLiteBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull TextView textView, @NonNull ImageView imageView, @NonNull ImageView imageView2) {
        this.rootView = linearLayout;
        this.addressSelectorLiteRoot = linearLayout2;
        this.addressTv = textView;
        this.arrowIv = imageView;
        this.locationPinIv = imageView2;
    }

    @NonNull
    public static WidgetAddressSelectorLiteBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.addressTv;
        TextView textView = (TextView) C2548q.d(i11, view);
        if (textView != null) {
            i11 = R$id.arrowIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.locationPinIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    return new WidgetAddressSelectorLiteBinding(linearLayout, linearLayout, textView, imageView, imageView2);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
