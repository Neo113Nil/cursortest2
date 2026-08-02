package ru.ozon.app.android.courieronmap.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.courieronmap.R$id;
import ru.ozon.app.android.courieronmap.R$layout;

/* loaded from: classes11.dex */
public final class ItemPinBinding implements a {

    @NonNull
    public final ImageView pinIv;

    @NonNull
    public final TextView pinTimeTv;

    @NonNull
    private final FrameLayout rootView;

    private ItemPinBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull TextView textView) {
        this.rootView = frameLayout;
        this.pinIv = imageView;
        this.pinTimeTv = textView;
    }

    @NonNull
    public static ItemPinBinding bind(@NonNull View view) {
        int i11 = R$id.pinIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.pinTimeTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                return new ItemPinBinding((FrameLayout) view, imageView, textView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemPinBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_pin, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
