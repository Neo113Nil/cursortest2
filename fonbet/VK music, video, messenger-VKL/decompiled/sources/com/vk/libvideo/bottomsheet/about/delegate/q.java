package com.vk.libvideo.bottomsheet.about.delegate;

import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.view.View;
import android.view.ViewGroup;
import com.vk.core.view.PhotoStackView;
import com.vk.libvideo.bottomsheet.about.delegate.AboutVideoItem;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.List;
import xsna.bwt0;
import xsna.e3m;
import xsna.hfz;
import xsna.p1u0;
import xsna.qf6;
import xsna.rl3;
import xsna.s3q0;
import xsna.v4;
import xsna.v6z;
import xsna.vfz;

/* compiled from: AboutVideoLikesSkeletonDelegate.kt */
/* loaded from: classes2.dex */
public final class q extends p1u0<AboutVideoItem.p> {

    /* compiled from: AboutVideoLikesSkeletonDelegate.kt */
    public static final class a extends qf6 {
        @Override // xsna.vfz
        /* renamed from: W5 */
        public final /* bridge */ /* synthetic */ void i6(hfz hfzVar) {
        }
    }

    @Override // xsna.p1u0
    public final vfz<? extends AboutVideoItem.p> b(ViewGroup viewGroup) {
        a aVar = new a(viewGroup, R.layout.video_about_likes_skeleton, null);
        View view = aVar.itemView;
        ShimmerFrameLayout shimmerFrameLayout = view instanceof ShimmerFrameLayout ? (ShimmerFrameLayout) view : null;
        if (shimmerFrameLayout != null) {
            shimmerFrameLayout.b(v4.a(view.getContext()));
            shimmerFrameLayout.c();
        }
        bwt0.c0(v6z.a.h(), aVar.itemView.findViewById(R.id.likes_avatars));
        PhotoStackView photoStackView = (PhotoStackView) aVar.itemView.findViewById(R.id.likes_avatars);
        photoStackView.setOverlapOffset(0.8f);
        photoStackView.setMarginBetweenImages(2.0f);
        photoStackView.setDrawBorder(false);
        ShapeDrawable[] shapeDrawableArr = new ShapeDrawable[3];
        for (int i = 0; i < 3; i++) {
            ShapeDrawable shapeDrawable = new ShapeDrawable();
            shapeDrawable.setShape(new OvalShape());
            shapeDrawable.setColorFilter(new PorterDuffColorFilter(e3m.f(R.attr.vk_ui_background_secondary, aVar.itemView.getContext()), PorterDuff.Mode.SRC_IN));
            s3q0 s3q0Var = s3q0.a;
            shapeDrawableArr[i] = shapeDrawable;
        }
        List u0 = rl3.u0(shapeDrawableArr);
        int size = u0.size();
        int size2 = u0.size();
        if (size >= 0) {
            if (size2 <= size) {
                size = size2;
            }
            size2 = size;
        }
        photoStackView.setCount(size2);
        for (int i2 = 0; i2 < size2; i2++) {
            photoStackView.j((Drawable) u0.get(i2), i2);
        }
        return aVar;
    }

    @Override // xsna.p1u0
    public final boolean c(hfz hfzVar) {
        return hfzVar instanceof AboutVideoItem.p;
    }
}
