package ru.ozon.app.android.messenger.databinding;

import B1.C2548q;
import X4.a;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import com.google.android.material.imageview.ShapeableImageView;
import ru.ozon.android.messenger.framework.presentation.common.view.timestatus.TimeStatusView;
import ru.ozon.app.android.messenger.R$id;
import ru.ozon.app.android.messenger.R$layout;

/* loaded from: classes12.dex */
public final class MBlockImageBinding implements a {

    @NonNull
    public final FrameLayout blockImageRootFl;

    @NonNull
    public final ShapeableImageView mainImageIv;

    @NonNull
    private final FrameLayout rootView;

    @NonNull
    public final TimeStatusView timeStatusView;

    private MBlockImageBinding(@NonNull FrameLayout frameLayout, @NonNull FrameLayout frameLayout2, @NonNull ShapeableImageView shapeableImageView, @NonNull TimeStatusView timeStatusView) {
        this.rootView = frameLayout;
        this.blockImageRootFl = frameLayout2;
        this.mainImageIv = shapeableImageView;
        this.timeStatusView = timeStatusView;
    }

    @NonNull
    public static MBlockImageBinding bind(@NonNull View view) {
        FrameLayout frameLayout = (FrameLayout) view;
        int i11 = R$id.mainImageIv;
        ShapeableImageView shapeableImageView = (ShapeableImageView) C2548q.d(i11, view);
        if (shapeableImageView != null) {
            i11 = R$id.timeStatusView;
            TimeStatusView timeStatusView = (TimeStatusView) C2548q.d(i11, view);
            if (timeStatusView != null) {
                return new MBlockImageBinding(frameLayout, frameLayout, shapeableImageView, timeStatusView);
            }
        }
        throw new NullPointerException("Missing required view with ID: ".concat(view.getResources().getResourceName(i11)));
    }

    @NonNull
    public static MBlockImageBinding inflate(@NonNull LayoutInflater layoutInflater, ViewGroup viewGroup, boolean z11) {
        View inflate = layoutInflater.inflate(R$layout.m_block_image, viewGroup, false);
        if (z11) {
            viewGroup.addView(inflate);
        }
        return bind(inflate);
    }

    @Override // X4.a
    @NonNull
    /* renamed from: getRoot */
    public FrameLayout getConstraintLayout() {
        return this.rootView;
    }
}
