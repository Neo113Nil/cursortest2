package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.uni.android.atom.text.TextAtomV2View;

/* loaded from: classes13.dex */
public final class ItemGalleryFullViewUgcMiniatureBinding implements a {

    @NonNull
    public final LinearLayout previewGroup;

    @NonNull
    public final ImageView previewIv;

    @NonNull
    public final TextAtomV2View previewTav;

    @NonNull
    private final LinearLayout rootView;

    private ItemGalleryFullViewUgcMiniatureBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull ImageView imageView, @NonNull TextAtomV2View textAtomV2View) {
        this.rootView = linearLayout;
        this.previewGroup = linearLayout2;
        this.previewIv = imageView;
        this.previewTav = textAtomV2View;
    }

    @NonNull
    public static ItemGalleryFullViewUgcMiniatureBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.previewIv;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.previewTav;
            TextAtomV2View textAtomV2View = (TextAtomV2View) C2548q.d(i11, view);
            if (textAtomV2View != null) {
                return new ItemGalleryFullViewUgcMiniatureBinding(linearLayout, linearLayout, imageView, textAtomV2View);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemGalleryFullViewUgcMiniatureBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_full_view_ugc_miniature, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public LinearLayout getRoot() {
        return this.rootView;
    }
}
