package ru.ozon.app.android.geo.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.Space;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import ru.ozon.app.android.geo.R$id;
import ru.ozon.app.android.geo.R$layout;

/* loaded from: classes12.dex */
public final class MapPinCenterContainerBinding implements a {

    @NonNull
    public final Space badgeSpace;

    @NonNull
    public final View badgeV;

    @NonNull
    public final TextView clusterCountTv;

    @NonNull
    public final ImageView iconIv;

    @NonNull
    private final ConstraintLayout rootView;

    private MapPinCenterContainerBinding(@NonNull ConstraintLayout constraintLayout, @NonNull Space space, @NonNull View view, @NonNull TextView textView, @NonNull ImageView imageView) {
        this.rootView = constraintLayout;
        this.badgeSpace = space;
        this.badgeV = view;
        this.clusterCountTv = textView;
        this.iconIv = imageView;
    }

    @NonNull
    public static MapPinCenterContainerBinding bind(@NonNull View view) {
        View d11;
        int i11 = R$id.badgeSpace;
        Space space = (Space) C2548q.d(i11, view);
        if (space != null && (d11 = C2548q.d((i11 = R$id.badgeV), view)) != null) {
            i11 = R$id.clusterCountTv;
            TextView textView = (TextView) C2548q.d(i11, view);
            if (textView != null) {
                i11 = R$id.iconIv;
                ImageView imageView = (ImageView) C2548q.d(i11, view);
                if (imageView != null) {
                    return new MapPinCenterContainerBinding((ConstraintLayout) view, space, d11, textView, imageView);
                }
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MapPinCenterContainerBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.map_pin_center_container, viewGroup, false);
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
