package com.vk.catalog2.feature.music.holders.view;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.cardview.widget.CardView;
import com.airbnb.lottie.LottieAnimationView;
import com.vk.dto.common.Image;
import com.vk.dto.common.ImageSize;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import com.vkontakte.android.R;
import java.util.HashSet;
import java.util.List;
import xsna.ab;
import xsna.b780;
import xsna.bwt0;
import xsna.fnj;
import xsna.iah0;

/* compiled from: CatalogTripleRotatedImagesCard.kt */
/* loaded from: classes16.dex */
public final class CatalogTripleRotatedImagesCard extends CardView {
    public static final /* synthetic */ int j = 0;
    public LottieAnimationView i;

    public CatalogTripleRotatedImagesCard(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LayoutInflater.from(context).inflate(R.layout.catalog_triple_rotated_images, (ViewGroup) this, true);
    }

    public final void d(Image image, List list, ab abVar, boolean z) {
        if (!z) {
            VKImageView vKImageView = (VKImageView) findViewById(R.id.link_image_static);
            if (image != null) {
                e(vKImageView, image);
                return;
            }
            return;
        }
        VKImageView vKImageView2 = (VKImageView) findViewById(R.id.link_image_rotated_1);
        VKImageView vKImageView3 = (VKImageView) findViewById(R.id.link_image_rotated_2);
        VKImageView vKImageView4 = (VKImageView) findViewById(R.id.link_image_rotated_3);
        abVar.invoke(vKImageView2);
        if (list != null) {
            e(vKImageView2, (Image) list.get(0));
        }
        abVar.invoke(vKImageView3);
        if (list != null) {
            e(vKImageView3, (Image) list.get(1));
        }
        abVar.invoke(vKImageView4);
        if (list != null) {
            e(vKImageView4, (Image) list.get(2));
        }
    }

    public final void e(VKImageView vKImageView, Image image) {
        vKImageView.setOnLoadCallback(new a(vKImageView));
        vKImageView.setEmptyImagePlaceholder((Drawable) null);
        Context context = vKImageView.getContext();
        HashSet hashSet = iah0.a;
        ImageSize Cb = image.Cb(fnj.b(context) ? ImageScreenSize.BIG.h() : getResources().getDimensionPixelSize(R.dimen.music_catalog_link_item_width), true, false);
        vKImageView.s0(Cb != null ? Cb.d.d : null);
    }

    public final void f(boolean z, boolean z2) {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            bwt0.p0(lottieAnimationView, !z);
        }
        CardView cardView = (CardView) findViewById(R.id.link_image_rotated_container_1);
        CardView cardView2 = (CardView) findViewById(R.id.link_image_rotated_container_2);
        CardView cardView3 = (CardView) findViewById(R.id.link_image_rotated_container_3);
        boolean z3 = false;
        bwt0.p0((VKImageView) findViewById(R.id.link_image_static), z && !z2);
        bwt0.p0(cardView, z && z2);
        bwt0.p0(cardView2, z && z2);
        if (z && z2) {
            z3 = true;
        }
        bwt0.p0(cardView3, z3);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        LottieAnimationView lottieAnimationView = this.i;
        if (lottieAnimationView != null) {
            lottieAnimationView.W();
        }
        LottieAnimationView lottieAnimationView2 = this.i;
        if (lottieAnimationView2 != null) {
            lottieAnimationView2.setFailureListener(null);
        }
        ((VKImageView) findViewById(R.id.link_image_rotated_1)).setOnLoadCallback(null);
        ((VKImageView) findViewById(R.id.link_image_rotated_2)).setOnLoadCallback(null);
        ((VKImageView) findViewById(R.id.link_image_rotated_3)).setOnLoadCallback(null);
        ((VKImageView) findViewById(R.id.link_image_static)).setOnLoadCallback(null);
        super.onDetachedFromWindow();
    }

    /* compiled from: CatalogTripleRotatedImagesCard.kt */
    public static final class a implements b780 {
        public final /* synthetic */ VKImageView b;

        public a(VKImageView vKImageView) {
            this.b = vKImageView;
        }

        @Override // xsna.b780
        public final void b(String str, Throwable th) {
            this.b.W();
        }

        @Override // xsna.b780
        public final void g(String str) {
        }

        @Override // xsna.b780
        public final void onCancel(String str) {
        }

        @Override // xsna.b780
        public final void t(int i, int i2, String str) {
        }
    }
}
