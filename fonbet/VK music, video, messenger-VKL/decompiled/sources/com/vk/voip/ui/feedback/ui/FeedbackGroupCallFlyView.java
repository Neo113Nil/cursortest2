package com.vk.voip.ui.feedback.ui;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.dto.common.im.Image;
import com.vk.imageloader.view.VKImageView;
import com.vk.voip.ui.feedback.ui.FeedbackGroupCallFlyView;
import com.vkontakte.android.R;
import java.util.Iterator;
import java.util.Random;
import java.util.concurrent.CopyOnWriteArrayList;
import xsna.cn70;
import xsna.m33;

/* compiled from: FeedbackGroupCallFlyView.kt */
/* loaded from: classes7.dex */
public final class FeedbackGroupCallFlyView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public int b;
    public int c;
    public int d;
    public final Random e;
    public final CopyOnWriteArrayList<VKImageView> f;
    public final int g;
    public final Drawable h;
    public final DecelerateInterpolator i;

    public FeedbackGroupCallFlyView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.b = cn70.b(40);
        this.c = 30;
        this.d = 1;
        this.e = new Random();
        this.f = new CopyOnWriteArrayList<>();
        this.g = cn70.b(7);
        this.h = m33.a(R.drawable.bg_voip_reactions_group_fly_card, getContext());
        this.i = new DecelerateInterpolator(0.8f);
    }

    private final int getOneSectionWidth() {
        return getWidth() / this.d;
    }

    public final void a(Image image) {
        if (this.d <= 0 && BuildInfo.h()) {
            StringBuilder sb = new StringBuilder("You need section in range: [0, ");
            sb.append(this.d - 1);
            sb.append("], you section: 0");
            throw new RuntimeException(sb.toString());
        }
        int oneSectionWidth = getOneSectionWidth();
        b(image, (0 * getOneSectionWidth()) + ((oneSectionWidth - r2) / 2), this.b / 2);
    }

    public final void b(Image image, float f, float f2) {
        VKImageView vKImageView;
        CopyOnWriteArrayList<VKImageView> copyOnWriteArrayList = this.f;
        if (copyOnWriteArrayList.size() == 0) {
            c();
        }
        Iterator<VKImageView> it = copyOnWriteArrayList.iterator();
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
        final VKImageView vKImageView2 = vKImageView;
        if (vKImageView2 == null) {
            if (copyOnWriteArrayList.size() < this.c) {
                c();
                b(image, f, f2);
                return;
            }
            return;
        }
        vKImageView2.load(image.d);
        vKImageView2.setTranslationY(f2);
        vKImageView2.setTranslationX(f);
        vKImageView2.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        vKImageView2.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        Random random = this.e;
        int i = random.nextBoolean() ? -1 : 1;
        float nextFloat = random.nextFloat();
        int oneSectionWidth = ((((int) (getOneSectionWidth() * nextFloat)) - this.b) / 2) * i;
        int i2 = -((int) ((((nextFloat * 0.2d) + 0.4f) * ((getHeight() - getPaddingTop()) - getPaddingBottom())) - this.b));
        int nextInt = random.nextInt(1000) + 2500;
        final int i3 = (int) (nextInt * 0.1f);
        vKImageView2.animate().setDuration(nextInt).translationXBy(oneSectionWidth).translationYBy(i2).setInterpolator(this.i).withStartAction(new Runnable() { // from class: xsna.c6r
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = FeedbackGroupCallFlyView.j;
                VKImageView.this.animate().scaleX(1.0f).scaleY(1.0f).setDuration(i3).setInterpolator(this.i).start();
            }
        }).withEndAction(new Runnable() { // from class: xsna.d6r
            @Override // java.lang.Runnable
            public final void run() {
                int i4 = FeedbackGroupCallFlyView.j;
                VKImageView.this.animate().scaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).scaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT).setDuration(i3).setInterpolator(this.i).start();
            }
        }).start();
    }

    public final void c() {
        for (int i = 0; i < 5; i++) {
            int i2 = this.b;
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(i2, i2);
            layoutParams.gravity = 80;
            VKImageView vKImageView = new VKImageView(getContext(), null, 6, 0);
            vKImageView.setLayoutParams(layoutParams);
            vKImageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
            vKImageView.setBackground(this.h);
            int i3 = this.g;
            vKImageView.setPadding(i3, i3, i3, i3);
            vKImageView.setAlpha(0.9f);
            addView(vKImageView);
            vKImageView.setScaleX(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            vKImageView.setScaleY(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
            this.f.add(vKImageView);
        }
    }

    public final int getCountSection() {
        return this.d;
    }

    public final int getImageSizePx() {
        return this.b;
    }

    public final int getMaxSizeViewPool() {
        return this.c;
    }

    public final void setCountSection(int i) {
        this.d = i;
    }

    public final void setImageSizePx(int i) {
        this.b = i;
        Iterator<T> it = this.f.iterator();
        while (it.hasNext()) {
            ViewGroup.LayoutParams layoutParams = ((VKImageView) it.next()).getLayoutParams();
            int i2 = this.b;
            layoutParams.width = i2;
            layoutParams.height = i2;
        }
        requestLayout();
    }

    public final void setMaxSizeViewPool(int i) {
        this.c = i;
    }
}
