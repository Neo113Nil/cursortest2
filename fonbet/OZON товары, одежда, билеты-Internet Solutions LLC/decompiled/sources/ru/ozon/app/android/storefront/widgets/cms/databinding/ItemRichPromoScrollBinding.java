package ru.ozon.app.android.storefront.widgets.cms.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.storefront.widgets.cms.R$id;
import ru.ozon.app.android.storefront.widgets.cms.richPromoScroll.presentation.RichPromoBackgroundView;
import ru.ozon.uni.android.atom.image.Image;

/* loaded from: classes2.dex */
public final class ItemRichPromoScrollBinding implements a {

    @NonNull
    public final RichPromoBackgroundView backgroundView;

    @NonNull
    public final Image bannerImage;

    @NonNull
    public final RecyclerView catalogScrollTiles;

    @NonNull
    public final LinearLayout contentContainer;

    @NonNull
    public final FrameLayout richPromoScroll;

    @NonNull
    private final FrameLayout rootView;

    private ItemRichPromoScrollBinding(@NonNull FrameLayout frameLayout, @NonNull RichPromoBackgroundView richPromoBackgroundView, @NonNull Image image, @NonNull RecyclerView recyclerView, @NonNull LinearLayout linearLayout, @NonNull FrameLayout frameLayout2) {
        this.rootView = frameLayout;
        this.backgroundView = richPromoBackgroundView;
        this.bannerImage = image;
        this.catalogScrollTiles = recyclerView;
        this.contentContainer = linearLayout;
        this.richPromoScroll = frameLayout2;
    }

    @NonNull
    public static ItemRichPromoScrollBinding bind(@NonNull View view) {
        int i11 = R$id.backgroundView;
        RichPromoBackgroundView richPromoBackgroundView = (RichPromoBackgroundView) C2548q.d(i11, view);
        if (richPromoBackgroundView != null) {
            i11 = R$id.bannerImage;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                i11 = R$id.catalogScrollTiles;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.contentContainer;
                    LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                    if (linearLayout != null) {
                        FrameLayout frameLayout = (FrameLayout) view;
                        return new ItemRichPromoScrollBinding(frameLayout, richPromoBackgroundView, image, recyclerView, linearLayout, frameLayout);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    public FrameLayout getRoot() {
        return this.rootView;
    }
}
