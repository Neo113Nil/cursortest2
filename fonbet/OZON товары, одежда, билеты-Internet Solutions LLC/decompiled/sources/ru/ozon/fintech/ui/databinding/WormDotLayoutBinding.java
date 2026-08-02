package ru.ozon.fintech.ui.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import androidx.annotation.NonNull;
import ru.ozon.app.android.R;

/* loaded from: classes3.dex */
public final class WormDotLayoutBinding implements a {

    @NonNull
    private final RelativeLayout rootView;

    @NonNull
    public final ImageView wormDot;

    private WormDotLayoutBinding(@NonNull RelativeLayout relativeLayout, @NonNull ImageView imageView) {
        this.rootView = relativeLayout;
        this.wormDot = imageView;
    }

    @NonNull
    public static WormDotLayoutBinding bind(@NonNull View view) {
        ImageView imageView = (ImageView) C2548q.d(R.id.worm_dot, view);
        if (imageView != null) {
            return new WormDotLayoutBinding((RelativeLayout) view, imageView);
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(R.id.worm_dot)));
    }

    @NonNull
    public static WormDotLayoutBinding inflate(@NonNull LayoutInflater layoutInflater) {
        return inflate(layoutInflater, null, false);
    }

    @NonNull
    public static WormDotLayoutBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R.layout.worm_dot_layout, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public RelativeLayout getRoot() {
        return this.rootView;
    }
}
