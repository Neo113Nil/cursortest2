package ru.ozon.app.android.pdp.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.icons.LargeIconButtonView;

/* loaded from: classes13.dex */
public final class PdpWidgetGalleryButtonBinding implements a {

    @NonNull
    public final CardView iconButtonCv;

    @NonNull
    public final LargeIconButtonView iconButtonLibv;

    @NonNull
    private final CardView rootView;

    private PdpWidgetGalleryButtonBinding(@NonNull CardView cardView, @NonNull CardView cardView2, @NonNull LargeIconButtonView largeIconButtonView) {
        this.rootView = cardView;
        this.iconButtonCv = cardView2;
        this.iconButtonLibv = largeIconButtonView;
    }

    @NonNull
    public static PdpWidgetGalleryButtonBinding bind(@NonNull View view) {
        CardView cardView = (CardView) view;
        int i11 = R$id.iconButtonLibv;
        LargeIconButtonView largeIconButtonView = (LargeIconButtonView) C2548q.d(i11, view);
        if (largeIconButtonView != null) {
            return new PdpWidgetGalleryButtonBinding(cardView, cardView, largeIconButtonView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static PdpWidgetGalleryButtonBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.pdp_widget_gallery_button, viewGroup, false);
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
