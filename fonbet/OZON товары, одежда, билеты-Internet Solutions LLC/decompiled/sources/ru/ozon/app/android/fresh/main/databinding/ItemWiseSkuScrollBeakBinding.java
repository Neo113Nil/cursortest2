package ru.ozon.app.android.fresh.main.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.R$layout;

/* loaded from: classes12.dex */
public final class ItemWiseSkuScrollBeakBinding implements a {

    @NonNull
    public final ImageView beak;

    @NonNull
    private final FrameLayout rootView;

    private ItemWiseSkuScrollBeakBinding(@NonNull FrameLayout frameLayout, @NonNull ImageView imageView) {
        this.rootView = frameLayout;
        this.beak = imageView;
    }

    @NonNull
    public static ItemWiseSkuScrollBeakBinding bind(@NonNull View view) {
        int i11 = R$id.beak;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            return new ItemWiseSkuScrollBeakBinding((FrameLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemWiseSkuScrollBeakBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_wise_sku_scroll_beak, viewGroup, false);
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
