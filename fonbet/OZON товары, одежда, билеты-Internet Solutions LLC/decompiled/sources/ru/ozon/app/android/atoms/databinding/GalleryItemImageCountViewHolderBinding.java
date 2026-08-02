package ru.ozon.app.android.atoms.databinding;

import X4.a;
import android.view.View;
import android.widget.TextView;
import androidx.annotation.NonNull;

/* loaded from: classes11.dex */
public final class GalleryItemImageCountViewHolderBinding implements a {

    @NonNull
    public final TextView galleryImageCountItem;

    @NonNull
    private final TextView rootView;

    private GalleryItemImageCountViewHolderBinding(@NonNull TextView textView, @NonNull TextView textView2) {
        this.rootView = textView;
        this.galleryImageCountItem = textView2;
    }

    @NonNull
    public static GalleryItemImageCountViewHolderBinding bind(@NonNull View view) {
        if (view == null) {
            throw new NullPointerException("rootView");
        }
        TextView textView = (TextView) view;
        return new GalleryItemImageCountViewHolderBinding(textView, textView);
    }

    @Override // X4.a
    @NonNull
    public TextView getRoot() {
        return this.rootView;
    }
}
