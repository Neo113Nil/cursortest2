package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes13.dex */
public final class ItemGalleryFullView360Binding implements a {

    @NonNull
    public final SmallButtonView button360Sbv;

    @NonNull
    public final ImageView preview360Iv;

    @NonNull
    private final ConstraintLayout rootView;

    private ItemGalleryFullView360Binding(@NonNull ConstraintLayout constraintLayout, @NonNull SmallButtonView smallButtonView, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.button360Sbv = smallButtonView;
        this.preview360Iv = imageView;
    }

    @NonNull
    public static ItemGalleryFullView360Binding bind(@NonNull View view) {
        int i11 = R$id.button360Sbv;
        SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
        if (smallButtonView != null) {
            i11 = R$id.preview360Iv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                return new ItemGalleryFullView360Binding((ConstraintLayout) view, smallButtonView, imageView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static ItemGalleryFullView360Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.item_gallery_full_view_360, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
