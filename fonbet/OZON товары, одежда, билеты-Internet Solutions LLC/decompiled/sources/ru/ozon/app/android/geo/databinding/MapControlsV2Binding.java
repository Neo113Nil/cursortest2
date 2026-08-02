package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;

/* loaded from: classes12.dex */
public final class MapControlsV2Binding implements a {

    @NonNull
    public final FrameLayout locationButton;

    @NonNull
    public final ImageView locationIconIv;

    @NonNull
    private final ConstraintLayout rootView;

    @NonNull
    public final FrameLayout searchButton;

    @NonNull
    public final ImageView searchIconIv;

    private MapControlsV2Binding(@NonNull ConstraintLayout constraintLayout, @NonNull FrameLayout frameLayout, @NonNull ImageView imageView, @NonNull FrameLayout frameLayout2, @NonNull ImageView imageView2) {
        this.rootView = constraintLayout;
        this.locationButton = frameLayout;
        this.locationIconIv = imageView;
        this.searchButton = frameLayout2;
        this.searchIconIv = imageView2;
    }

    @NonNull
    public static MapControlsV2Binding bind(@NonNull View view) {
        int i11 = R$id.locationButton;
        FrameLayout frameLayout = (FrameLayout) C2548q.d(i11, view);
        if (frameLayout != null) {
            i11 = R$id.locationIconIv;
            ImageView imageView = (ImageView) C2548q.d(i11, view);
            if (imageView != null) {
                i11 = R$id.searchButton;
                FrameLayout frameLayout2 = (FrameLayout) C2548q.d(i11, view);
                if (frameLayout2 != null) {
                    i11 = R$id.searchIconIv;
                    ImageView imageView2 = (ImageView) C2548q.d(i11, view);
                    if (imageView2 != null) {
                        return new MapControlsV2Binding((ConstraintLayout) view, frameLayout, imageView, frameLayout2, imageView2);
                    }
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MapControlsV2Binding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.map_controls_v2, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    public ConstraintLayout getRoot() {
        return this.rootView;
    }
}
