package ru.ozon.app.android.gallery.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import ru.ozon.app.android.gallery.R$id;
import ru.ozon.app.android.gallery.R$layout;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;

/* loaded from: classes12.dex */
public final class FragmentGalleryPhoto360ScreenBinding implements a {

    @NonNull
    public final ImageView image;

    @NonNull
    public final SmallButtonView open360PhotoButton;

    @NonNull
    public final TextView photo360Description;

    @NonNull
    private final LinearLayout rootView;

    private FragmentGalleryPhoto360ScreenBinding(@NonNull LinearLayout linearLayout, @NonNull ImageView imageView, @NonNull SmallButtonView smallButtonView, @NonNull TextView textView) {
        this.rootView = linearLayout;
        this.image = imageView;
        this.open360PhotoButton = smallButtonView;
        this.photo360Description = textView;
    }

    @NonNull
    public static FragmentGalleryPhoto360ScreenBinding bind(@NonNull View view) {
        int i11 = R$id.image;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.open360PhotoButton;
            SmallButtonView smallButtonView = (SmallButtonView) C2548q.d(i11, view);
            if (smallButtonView != null) {
                i11 = R$id.photo360Description;
                TextView textView = (TextView) C2548q.d(i11, view);
                if (textView != null) {
                    return new FragmentGalleryPhoto360ScreenBinding((LinearLayout) view, imageView, smallButtonView, textView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static FragmentGalleryPhoto360ScreenBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.fragment_gallery_photo_360_screen, viewGroup, false);
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
