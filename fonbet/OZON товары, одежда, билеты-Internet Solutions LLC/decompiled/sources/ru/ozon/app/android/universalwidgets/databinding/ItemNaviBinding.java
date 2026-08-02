package ru.ozon.app.android.universalwidgets.databinding;

import B1.C2548q;
import X4.a;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import ru.ozon.app.android.universalwidgets.R$id;

/* loaded from: classes2.dex */
public final class ItemNaviBinding implements a {

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final View tileCard;

    @NonNull
    public final ImageView tileImageIv;

    @NonNull
    public final LinearLayout tileLl;

    @NonNull
    public final AppCompatTextView tileTitleTv;

    private ItemNaviBinding(@NonNull FrameLayout frameLayout, @NonNull View view, @NonNull ImageView imageView, @NonNull LinearLayout linearLayout, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = frameLayout;
        this.tileCard = view;
        this.tileImageIv = imageView;
        this.tileLl = linearLayout;
        this.tileTitleTv = appCompatTextView;
    }

    @NonNull
    public static ItemNaviBinding bind(@NonNull View view) {
        int i11 = R$id.tileCard;
        View d11 = C2548q.d(i11, view);
        if (d11 != null) {
            i11 = R$id.tileImageIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.tileLl;
                LinearLayout linearLayout = (LinearLayout) C2548q.d(i11, view);
                if (linearLayout != null) {
                    i11 = R$id.tileTitleTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        return new ItemNaviBinding((FrameLayout) view, d11, imageView, linearLayout, appCompatTextView);
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
