package ru.ozon.app.android.ads.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.ads.R$id;
import ru.ozon.uni.android.atom.image.Image;

/* loaded from: classes11.dex */
public final class WidgetAdvVideoBannerV2PackshotBinding implements a {

    @NonNull
    public final LinearLayout packshotContainer;

    @NonNull
    public final RecyclerView packshotContent;

    @NonNull
    public final Image packshotImage;

    @NonNull
    private final LinearLayout rootView;

    private WidgetAdvVideoBannerV2PackshotBinding(@NonNull LinearLayout linearLayout, @NonNull LinearLayout linearLayout2, @NonNull RecyclerView recyclerView, @NonNull Image image) {
        this.rootView = linearLayout;
        this.packshotContainer = linearLayout2;
        this.packshotContent = recyclerView;
        this.packshotImage = image;
    }

    @NonNull
    public static WidgetAdvVideoBannerV2PackshotBinding bind(@NonNull View view) {
        LinearLayout linearLayout = (LinearLayout) view;
        int i11 = R$id.packshotContent;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.packshotImage;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                return new WidgetAdvVideoBannerV2PackshotBinding(linearLayout, linearLayout, recyclerView, image);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public LinearLayout getConstraintLayout() {
        return this.rootView;
    }
}
