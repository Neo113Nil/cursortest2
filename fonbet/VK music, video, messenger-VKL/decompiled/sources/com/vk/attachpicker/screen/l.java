package com.vk.attachpicker.screen;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.util.Property;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.TextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.screen.a;
import com.vk.attachpicker.screen.p;
import com.vk.attachpicker.widget.ClippingView;
import com.vk.imageloader.ImageScreenSize;
import com.vk.mediastore.system.MediaStoreEntry;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import xsna.bwt0;
import xsna.e43;
import xsna.fne0;
import xsna.g5t;
import xsna.gea0;
import xsna.iah0;
import xsna.idc;
import xsna.itg0;
import xsna.mcr0;
import xsna.nne0;
import xsna.q130;
import xsna.r870;
import xsna.s3q0;
import xsna.uko;
import xsna.x8c;
import xsna.yka0;
import xsna.zb60;
import xsna.zmw;

/* compiled from: QRScreen.kt */
/* loaded from: classes15.dex */
public final class l extends a {
    public final int A;
    public final x8c B;
    public final gea0 C;
    public zmw D;
    public FrameLayout E;
    public fne0 F;
    public FrameLayout G;
    public TextView H;
    public ImageButton I;
    public final RectF J = new RectF();
    public final Uri y;
    public final nne0 z;

    public l(Uri uri, nne0 nne0Var, int i, x8c x8cVar, gea0 gea0Var) {
        this.y = uri;
        this.z = nne0Var;
        this.A = i;
        this.B = x8cVar;
        this.C = gea0Var;
        this.g = new ColorDrawable(e43.a.getColor(R.color.vk_gray_800));
        this.h = new ColorDrawable(e43.a.getColor(R.color.vk_gray_800));
    }

    @Override // com.vk.attachpicker.screen.a
    public final boolean A(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 1 || motionEvent.getAction() == 3) {
            fne0 fne0Var = this.F;
            if (fne0Var == null) {
                fne0Var = null;
            }
            fne0Var.setSelectedBarcodeIndex(-1);
            fne0 fne0Var2 = this.F;
            if (fne0Var2 == null) {
                fne0Var2 = null;
            }
            fne0Var2.invalidate();
        }
        boolean A = super.A(motionEvent);
        FrameLayout frameLayout = this.E;
        if (frameLayout == null) {
            frameLayout = null;
        }
        if (frameLayout.getTranslationY() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            fne0 fne0Var3 = this.F;
            if (fne0Var3 == null) {
                fne0Var3 = null;
            }
            fne0Var3.setVisibility(0);
            FrameLayout frameLayout2 = this.G;
            if (frameLayout2 == null) {
                frameLayout2 = null;
            }
            frameLayout2.setVisibility(0);
            TextView textView = this.H;
            (textView != null ? textView : null).setVisibility(0);
            return A;
        }
        fne0 fne0Var4 = this.F;
        if (fne0Var4 == null) {
            fne0Var4 = null;
        }
        fne0Var4.setVisibility(4);
        FrameLayout frameLayout3 = this.G;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        frameLayout3.setVisibility(4);
        TextView textView2 = this.H;
        (textView2 != null ? textView2 : null).setVisibility(4);
        return A;
    }

    @Override // com.vk.attachpicker.screen.a
    public final void E() {
        FrameLayout frameLayout = this.G;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.setVisibility(0);
        TextView textView = this.H;
        (textView != null ? textView : null).setVisibility(0);
    }

    @Override // xsna.em6
    public final View b(LayoutInflater layoutInflater) {
        this.E = new FrameLayout(d());
        zmw zmwVar = new zmw(d(), 0);
        this.D = zmwVar;
        FrameLayout frameLayout = this.E;
        if (frameLayout == null) {
            frameLayout = null;
        }
        frameLayout.addView(zmwVar);
        g5t d = r870.a().d().d(d());
        this.F = d;
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        frameLayout2.addView(d);
        Field field = mcr0.a;
        Bitmap bitmap = (Bitmap) itg0.e(mcr0.j(this.y, ImageScreenSize.VERY_BIG));
        zmw zmwVar2 = this.D;
        if (zmwVar2 == null) {
            zmwVar2 = null;
        }
        zmwVar2.setImageBitmap(bitmap);
        TextView textView = new TextView(d());
        textView.setText(d().getString(R.string.qr_core_tap_to_scan));
        textView.setGravity(17);
        int i = 4;
        com.vk.typography.b.k(textView, FontFamily.MEDIUM, Float.valueOf(16.0f), 4);
        textView.setTextColor(e43.a.getColor(R.color.vk_white));
        textView.setShadowLayer(iah0.a(8), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, e43.a.getColor(R.color.vk_black_alpha35));
        textView.setVisibility(4);
        this.H = textView;
        FrameLayout frameLayout3 = this.E;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 81);
        layoutParams.bottomMargin = iah0.a(24);
        s3q0 s3q0Var = s3q0.a;
        frameLayout3.addView(textView, layoutParams);
        a.C0386a c0386a = this.l;
        if (c0386a != null) {
            FrameLayout frameLayout4 = this.E;
            if (frameLayout4 == null) {
                frameLayout4 = null;
            }
            c0386a.addView(frameLayout4);
        }
        ClippingView clippingView = new ClippingView(d());
        this.m = clippingView;
        a.C0386a c0386a2 = this.l;
        if (c0386a2 != null) {
            c0386a2.addView(clippingView);
        }
        FrameLayout frameLayout5 = new FrameLayout(d());
        frameLayout5.setBackgroundResource(R.drawable.bg_qr_code_photo_scan_toolbar);
        frameLayout5.setFitsSystemWindows(true);
        frameLayout5.setClickable(true);
        frameLayout5.setVisibility(4);
        this.G = frameLayout5;
        ImageButton imageButton = new ImageButton(d());
        imageButton.setImageResource(R.drawable.vk_icon_cancel_outline_shadow_large_48_close);
        imageButton.setBackgroundResource(R.drawable.highlight);
        bwt0.i0(imageButton, new yka0(this, i));
        this.I = imageButton;
        FrameLayout frameLayout6 = this.G;
        if (frameLayout6 == null) {
            frameLayout6 = null;
        }
        FrameLayout.LayoutParams layoutParams2 = new FrameLayout.LayoutParams(iah0.a(48.0f), iah0.a(48.0f));
        layoutParams2.setMarginStart(iah0.a(4.0f));
        layoutParams2.topMargin = iah0.a(4.0f);
        frameLayout6.addView(imageButton, layoutParams2);
        a.C0386a c0386a3 = this.l;
        if (c0386a3 != null) {
            FrameLayout frameLayout7 = this.G;
            if (frameLayout7 == null) {
                frameLayout7 = null;
            }
            c0386a3.addView(frameLayout7, -1, iah0.a(72.0f));
        }
        FrameLayout frameLayout8 = this.E;
        if (frameLayout8 == null) {
            frameLayout8 = null;
        }
        bwt0.S(frameLayout8, new q130(this, 20));
        FrameLayout frameLayout9 = this.G;
        if (frameLayout9 == null) {
            frameLayout9 = null;
        }
        frameLayout9.setDescendantFocusability(131072);
        fne0 fne0Var = this.F;
        (fne0Var != null ? fne0Var : null).setOnQrClicked(new zb60(this, 15));
        return this.l;
    }

    @Override // com.vk.attachpicker.screen.a
    public final void m() {
        if (this.k == null || this.s.get()) {
            return;
        }
        p.c cVar = this.i;
        if (cVar != null) {
            D(cVar.k9(this.A));
        } else {
            n();
        }
    }

    @Override // com.vk.attachpicker.screen.a
    public final void p() {
        AnimatorSet animatorSet = new AnimatorSet();
        FrameLayout frameLayout = this.E;
        if (frameLayout == null) {
            frameLayout = null;
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(frameLayout, (Property<FrameLayout, Float>) View.TRANSLATION_Y, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
        FrameLayout frameLayout2 = this.E;
        if (frameLayout2 == null) {
            frameLayout2 = null;
        }
        ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(frameLayout2, (Property<FrameLayout, Float>) View.SCALE_Y, 1.0f);
        FrameLayout frameLayout3 = this.E;
        if (frameLayout3 == null) {
            frameLayout3 = null;
        }
        ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(frameLayout3, (Property<FrameLayout, Float>) View.SCALE_X, 1.0f);
        ColorDrawable colorDrawable = this.g;
        animatorSet.playTogether(ofFloat, ofFloat2, ofFloat3, ObjectAnimator.ofInt(colorDrawable != null ? colorDrawable : null, uko.a, (colorDrawable != null ? colorDrawable : null).getAlpha(), 255));
        animatorSet.addListener(new idc(this, 2));
        animatorSet.start();
    }

    @Override // com.vk.attachpicker.screen.a
    public final View s() {
        FrameLayout frameLayout = this.E;
        if (frameLayout == null) {
            return null;
        }
        return frameLayout;
    }

    @Override // com.vk.attachpicker.screen.a
    public final float t() {
        return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
    }

    @Override // com.vk.attachpicker.screen.a
    public final float v() {
        return 1.0f;
    }

    @Override // com.vk.attachpicker.screen.a
    public final zmw x() {
        zmw zmwVar = this.D;
        if (zmwVar == null) {
            return null;
        }
        return zmwVar;
    }

    @Override // com.vk.attachpicker.screen.a
    public final List<ObjectAnimator> y() {
        return new ArrayList();
    }

    @Override // com.vk.attachpicker.screen.a
    public final List<ObjectAnimator> z() {
        ImageButton imageButton = this.I;
        if (imageButton == null) {
            imageButton = null;
        }
        return e43.a(ObjectAnimator.ofFloat(imageButton, (Property<ImageButton, Float>) View.ALPHA, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT));
    }

    @Override // com.vk.attachpicker.screen.a
    public final void F() {
    }

    @Override // com.vk.attachpicker.screen.a
    public final void J(MediaStoreEntry mediaStoreEntry) {
    }
}
