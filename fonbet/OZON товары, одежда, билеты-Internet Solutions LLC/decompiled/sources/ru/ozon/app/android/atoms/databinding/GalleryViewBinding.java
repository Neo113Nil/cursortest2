package ru.ozon.app.android.atoms.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ru.ozon.app.android.atoms.R$id;
import ru.ozon.app.android.atoms.R$layout;

/* loaded from: classes11.dex */
public final class GalleryViewBinding implements a {

    @NonNull
    public final ImageView galleryGradientLeftV;

    @NonNull
    public final ImageView galleryGradientRightV;

    @NonNull
    public final RecyclerView galleryImages;

    @NonNull
    public final TextView galleryTitle;

    @NonNull
    private final View rootView;

    private GalleryViewBinding(@NonNull View view, @NonNull ImageView imageView, @NonNull ImageView imageView2, @NonNull RecyclerView recyclerView, @NonNull TextView textView) {
        this.rootView = view;
        this.galleryGradientLeftV = imageView;
        this.galleryGradientRightV = imageView2;
        this.galleryImages = recyclerView;
        this.galleryTitle = textView;
    }

    @NonNull
    public static GalleryViewBinding bind(@NonNull View view) {
        int i11 = R$id.galleryGradientLeftV;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.galleryGradientRightV;
            ImageView imageView2 = (ImageView) C2548q.d(i11, view);
            if (imageView2 != null) {
                i11 = R$id.galleryImages;
                RecyclerView recyclerView = (RecyclerView) C2548q.d(i11, view);
                if (recyclerView != null) {
                    i11 = R$id.galleryTitle;
                    TextView textView = (TextView) C2548q.d(i11, view);
                    if (textView != null) {
                        return new GalleryViewBinding(view, imageView, imageView2, recyclerView, textView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static GalleryViewBinding inflate(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup) {
        if (viewGroup == null) {
            throw new NullPointerException("parent");
        }
        layoutInflater.inflate(R$layout.gallery_view, viewGroup);
        return bind(viewGroup);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public View getConstraintLayout() {
        return this.rootView;
    }
}
