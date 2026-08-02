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
public final class VideobannerPreviewProductViewBinding implements a {

    @NonNull
    public final RecyclerView contentList;

    @NonNull
    public final Image image;

    @NonNull
    public final LinearLayout previewProductView;

    @NonNull
    private final LinearLayout rootView;

    private VideobannerPreviewProductViewBinding(@NonNull LinearLayout linearLayout, @NonNull RecyclerView recyclerView, @NonNull Image image, @NonNull LinearLayout linearLayout2) {
        this.rootView = linearLayout;
        this.contentList = recyclerView;
        this.image = image;
        this.previewProductView = linearLayout2;
    }

    @NonNull
    public static VideobannerPreviewProductViewBinding bind(@NonNull View view) {
        int i11 = R$id.contentList;
        RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
        if (recyclerView != null) {
            i11 = R$id.image;
            Image image = (Image) C2548q.d(i11, view);
            if (image != null) {
                LinearLayout linearLayout = (LinearLayout) view;
                return new VideobannerPreviewProductViewBinding(linearLayout, recyclerView, image, linearLayout);
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
