package ru.ozon.app.android.pdpoldwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.pdpoldwidgets.R$id;
import ru.ozon.app.android.pdpoldwidgets.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;

/* loaded from: classes13.dex */
public final class PdpWidgetGalleryProductButtonBinding implements a {

    @NonNull
    public final LargeIconButtonView iconButton;

    @NonNull
    public final CardView iconButtonCv;

    @NonNull
    private final CardView rootView;

    private PdpWidgetGalleryProductButtonBinding(@NonNull CardView cardView, @NonNull LargeIconButtonView largeIconButtonView, @NonNull CardView cardView2) {
        this.rootView = cardView;
        this.iconButton = largeIconButtonView;
        this.iconButtonCv = cardView2;
    }

    @NonNull
    public static PdpWidgetGalleryProductButtonBinding bind(@NonNull View view) {
        int i11 = R$id.iconButton;
        LargeIconButtonView largeIconButtonView = (LargeIconButtonView) C2548q.d(i11, view);
        if (largeIconButtonView == null) {
            throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
        }
        CardView cardView = (CardView) view;
        return new PdpWidgetGalleryProductButtonBinding(cardView, largeIconButtonView, cardView);
    }

    @NonNull
    public static PdpWidgetGalleryProductButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_gallery_product_button, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public CardView getRoot() {
        return this.rootView;
    }
}
