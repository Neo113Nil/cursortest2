package com.vk.attachpicker.widget;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.util.AttributeSet;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.unity3d.services.UnityAdsConstants;
import com.vkontakte.android.R;
import xsna.iah0;
import xsna.mzo;

/* loaded from: classes15.dex */
public class EditButton extends FrameLayout {
    public static final int[] j = {R.drawable.picker_ic_smiles_24, R.drawable.vk_icon_deprecated_picker_ic_text_24, R.drawable.picker_ic_drawing_24, R.drawable.vk_icon_deprecated_picker_ic_crop_rotate_24, R.drawable.vk_icon_deprecated_picker_ic_magic_24};
    public final Handler b;
    public boolean c;
    public final ImageView d;
    public final ImageView e;
    public int f;
    public boolean g;
    public boolean h;
    public final a i;

    public class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            int i;
            EditButton editButton = EditButton.this;
            if (editButton.c && editButton.getVisibility() == 0) {
                boolean z = editButton.g;
                if (z && editButton.h) {
                    return;
                }
                if (z) {
                    int[] iArr = EditButton.j;
                    i = R.drawable.vk_icon_deprecated_picker_ic_video_trim_24dp;
                } else {
                    int i2 = editButton.f + 1;
                    int[] iArr2 = EditButton.j;
                    int i3 = i2 % 5;
                    editButton.f = i3;
                    i = iArr2[i3];
                }
                (editButton.d.getVisibility() == 0 ? EditButton.a(editButton.d, editButton.e, i) : EditButton.a(editButton.e, editButton.d, i)).start();
                boolean z2 = editButton.g;
                editButton.h = z2;
                if (z2) {
                    return;
                }
                editButton.b.postDelayed(editButton.i, 1800L);
            }
        }
    }

    public EditButton(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new Handler(Looper.getMainLooper());
        this.i = new a();
        setPadding(iah0.a(12), 0, iah0.a(20), 0);
        LayoutInflater.from(getContext()).inflate(R.layout.picker_layout_edit_button, this);
        this.d = (ImageView) findViewById(R.id.iv_icon_1);
        this.e = (ImageView) findViewById(R.id.iv_icon_2);
    }

    public static AnimatorSet a(ImageView imageView, ImageView imageView2, int i) {
        imageView2.setImageResource(i);
        imageView2.setAlpha(1.0f);
        imageView2.setVisibility(0);
        AnimatorSet animatorSet = new AnimatorSet();
        float[] fArr = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        Property property = View.SCALE_X;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property, fArr);
        float[] fArr2 = {UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
        Property property2 = View.SCALE_Y;
        animatorSet.playTogether(ofFloat, ObjectAnimator.ofFloat(imageView2, (Property<ImageView, Float>) property2, fArr2), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) property2, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT), ObjectAnimator.ofFloat(imageView, (Property<ImageView, Float>) View.ALPHA, 1.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
        animatorSet.addListener(new mzo(imageView, i));
        animatorSet.setDuration(300L);
        return animatorSet;
    }

    public final void b() {
        int visibility = getVisibility();
        a aVar = this.i;
        Handler handler = this.b;
        if (visibility != 0) {
            handler.removeCallbacks(aVar);
            return;
        }
        this.d.setVisibility(0);
        this.d.setAlpha(1.0f);
        this.d.setScaleX(1.0f);
        this.d.setScaleY(1.0f);
        this.d.setImageResource(this.g ? R.drawable.vk_icon_deprecated_picker_ic_video_trim_24dp : j[0]);
        this.e.setVisibility(4);
        this.f = 0;
        handler.removeCallbacks(aVar);
        handler.postDelayed(aVar, this.g ? 0L : 1500L);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.c = true;
        b();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.c = false;
        this.b.removeCallbacks(this.i);
    }

    public void setTrimMode(boolean z) {
        if (this.g != z) {
            this.g = z;
            this.h = false;
            Handler handler = this.b;
            a aVar = this.i;
            handler.removeCallbacks(aVar);
            handler.postDelayed(aVar, 0L);
        }
    }

    @Override // android.view.View
    public void setVisibility(int i) {
        int visibility = getVisibility();
        super.setVisibility(i);
        if (i != 0) {
            this.b.removeCallbacks(this.i);
        } else if (visibility != 0) {
            b();
        }
    }
}
