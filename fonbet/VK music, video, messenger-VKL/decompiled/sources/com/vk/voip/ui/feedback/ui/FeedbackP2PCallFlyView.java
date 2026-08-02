package com.vk.voip.ui.feedback.ui;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewPropertyAnimator;
import android.view.animation.Interpolator;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.ImageScreenSize;
import com.vk.imageloader.view.VKImageView;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.random.Random;
import xsna.cn70;
import xsna.gg;
import xsna.iah0;

/* compiled from: FeedbackP2PCallFlyView.kt */
/* loaded from: classes7.dex */
public final class FeedbackP2PCallFlyView extends FrameLayout {
    public static final int l = iah0.a(64.0f);
    public static final int m = cn70.b(300);
    public final int b;
    public final long c;
    public final long d;
    public final ImageScreenSize e;
    public final int f;
    public final int g;
    public final Random.Default h;
    public final ArrayList<VKImageView> i;
    public final a j;
    public final LinearInterpolator k;

    /* compiled from: FeedbackP2PCallFlyView.kt */
    public static final class a implements Interpolator {
        @Override // android.animation.TimeInterpolator
        public final float getInterpolation(float f) {
            return (f - 1.25f) * (-2.5f) * f;
        }
    }

    public FeedbackP2PCallFlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = 30;
        this.c = 1200L;
        this.d = 1200L;
        this.e = ImageScreenSize.SIZE_56DP;
        this.f = l;
        this.g = 30;
        this.h = Random.b;
        this.i = new ArrayList<>();
        this.j = new a();
        this.k = new LinearInterpolator();
    }

    public final void a(Image image) {
        VKImageView vKImageView;
        ArrayList<VKImageView> arrayList = this.i;
        if (arrayList.size() == 0) {
            b();
        }
        int i = -this.f;
        int width = getWidth();
        this.h.getClass();
        int l2 = Random.c.l(i, width);
        Iterator<VKImageView> it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                vKImageView = null;
                break;
            } else {
                vKImageView = it.next();
                if (!vKImageView.hasTransientState()) {
                    break;
                }
            }
        }
        VKImageView vKImageView2 = vKImageView;
        if (vKImageView2 == null) {
            if (arrayList.size() < this.g) {
                b();
                a(image);
                return;
            }
            return;
        }
        vKImageView2.O0(image.d, this.e);
        vKImageView2.setTranslationY(0);
        vKImageView2.setTranslationX(l2);
        vKImageView2.setAlpha(1.0f);
        vKImageView2.setScaleX(1.0f);
        vKImageView2.setScaleY(1.0f);
        int height = getHeight() == 0 ? m : getHeight();
        int width2 = getWidth();
        gg ggVar = Random.c;
        float l3 = ggVar.l(i, width2);
        double d = height;
        float f = -((float) ggVar.h(0.7d * d, d * 0.9d));
        ViewPropertyAnimator animate = vKImageView2.animate();
        long j = this.d;
        animate.setDuration(j).translationY(f).setInterpolator(this.j).start();
        vKImageView2.animate().setDuration(j).translationX(l3).alpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleX(0.5f).scaleY(0.5f).setInterpolator(this.k).start();
    }

    public final void b() {
        for (int i = 0; i < 30; i++) {
            int i2 = this.f;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 80;
            VKImageView vKImageView = new VKImageView(getContext(), null, 6, 0);
            vKImageView.setLayoutParams(layoutParams);
            vKImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            vKImageView.setAlpha(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            addView(vKImageView);
            this.i.add(vKImageView);
        }
    }

    public final ImageScreenSize getLoadImageSize() {
        return this.e;
    }
}
