package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;

/* loaded from: classes12.dex */
public final class MapBannerBinding implements a {

    @NonNull
    public final ImageView arrow;

    @NonNull
    public final FrameLayout banner;

    @NonNull
    public final ImageView bannerIv;

    @NonNull
    public final AppCompatTextView hintTv;

    @NonNull
    private final ConstraintLayout rootView;

    private MapBannerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView2, @NonNull AppCompatTextView appCompatTextView) {
        this.rootView = constraintLayout;
        this.arrow = imageView;
        this.banner = frameLayout;
        this.bannerIv = imageView2;
        this.hintTv = appCompatTextView;
    }

    @NonNull
    public static MapBannerBinding bind(@NonNull View view) {
        int i11 = R$id.arrow;
        ImageView imageView = (ImageView) C2548q.d(i11, view);
        if (imageView != null) {
            i11 = R$id.banner;
            FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
            if (frameLayout != null) {
                i11 = R$id.bannerIv;
                ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                if (imageView2 != null) {
                    i11 = R$id.hintTv;
                    AppCompatTextView appCompatTextView = (AppCompatTextView) C2548q.d(i11, view);
                    if (appCompatTextView != null) {
                        return new MapBannerBinding((ConstraintLayout) view, imageView, frameLayout, imageView2, appCompatTextView);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MapBannerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.map_banner, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public ConstraintLayout getConstraintLayout() {
        return this.rootView;
    }
}
