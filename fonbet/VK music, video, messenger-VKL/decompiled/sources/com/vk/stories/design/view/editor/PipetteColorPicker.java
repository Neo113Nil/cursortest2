package com.vk.stories.design.view.editor;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.Point;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.LayerDrawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.AnimationSet;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import com.unity3d.services.UnityAdsConstants;
import com.vk.log.L;
import com.vk.stories.design.view.editor.PipetteColorPicker;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.LazyThreadSafetyMode;
import xsna.ay20;
import xsna.bwt0;
import xsna.f4m;
import xsna.izs;
import xsna.mnh0;
import xsna.msy;
import xsna.s3q0;
import xsna.t2l0;
import xsna.tpa0;
import xsna.upa0;
import xsna.v8q;
import xsna.wzs;

/* compiled from: PipetteColorPicker.kt */
/* loaded from: classes6.dex */
public final class PipetteColorPicker extends FrameLayout {
    public static final /* synthetic */ int s = 0;
    public final View b;
    public final View c;
    public final View d;
    public final Object e;
    public final Object f;
    public Bitmap g;
    public final GradientDrawable h;
    public final GradientDrawable i;
    public int j;
    public izs<? super Integer, s3q0> k;
    public wzs<? super Integer, ? super Integer, ? extends Point> l;
    public izs<? super t2l0, s3q0> m;
    public boolean n;
    public boolean o;
    public int p;
    public float q;
    public float r;

    public PipetteColorPicker(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        v8q v8qVar = new v8q(context, 2);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.e = msy.a(lazyThreadSafetyMode, v8qVar);
        this.f = msy.a(lazyThreadSafetyMode, new ay20(context));
        LayoutInflater.from(context).inflate(R.layout.view_pipette_color_picker, this);
        this.b = findViewById(R.id.layout_pipette);
        View findViewById = findViewById(R.id.small_color_picker_pipette);
        this.c = findViewById;
        View findViewById2 = findViewById(R.id.big_color_picker);
        this.d = findViewById2;
        Drawable background = findViewById2.getBackground();
        LayerDrawable layerDrawable = background instanceof LayerDrawable ? (LayerDrawable) background : null;
        Drawable findDrawableByLayerId = layerDrawable != null ? layerDrawable.findDrawableByLayerId(R.id.color_picker_pipette) : null;
        this.h = findDrawableByLayerId instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId : null;
        Drawable background2 = findViewById.getBackground();
        LayerDrawable layerDrawable2 = background2 instanceof LayerDrawable ? (LayerDrawable) background2 : null;
        Object findDrawableByLayerId2 = layerDrawable2 != null ? layerDrawable2.findDrawableByLayerId(R.id.color_picker_pipette) : null;
        this.i = findDrawableByLayerId2 instanceof GradientDrawable ? (GradientDrawable) findDrawableByLayerId2 : null;
    }

    public static void a(PipetteColorPicker pipetteColorPicker, Bitmap bitmap, MotionEvent motionEvent) {
        View view = pipetteColorPicker.d;
        if (!mnh0.m(motionEvent) && !mnh0.o(motionEvent)) {
            if (mnh0.q(motionEvent)) {
                pipetteColorPicker.setDefaultMarginAndScale(view);
                pipetteColorPicker.n = false;
                izs<? super t2l0, s3q0> izsVar = pipetteColorPicker.m;
                if (izsVar != null) {
                    izsVar.invoke(new t2l0(pipetteColorPicker.q, pipetteColorPicker.r, pipetteColorPicker.p));
                }
                pipetteColorPicker.e();
                return;
            }
            return;
        }
        if (!pipetteColorPicker.n) {
            upa0 upa0Var = new upa0(view);
            ScaleAnimation scaleAnimation = new ScaleAnimation(1.0f, 1.15f, 1.0f, 1.15f, 1, 0.5f, 1, 0.5f);
            AnimationSet animationSet = new AnimationSet(true);
            animationSet.addAnimation(upa0Var);
            animationSet.addAnimation(scaleAnimation);
            animationSet.setFillAfter(true);
            animationSet.setDuration(300L);
            view.startAnimation(animationSet);
            pipetteColorPicker.n = true;
        }
        float x = motionEvent.getX();
        float y = motionEvent.getY();
        wzs<? super Integer, ? super Integer, ? extends Point> wzsVar = pipetteColorPicker.l;
        if (wzsVar != null) {
            Point invoke = wzsVar.invoke(Integer.valueOf((int) x), Integer.valueOf((int) y));
            x = invoke.x;
            y = invoke.y;
        }
        try {
            int c = pipetteColorPicker.c(bitmap, (int) x, (int) y, Integer.valueOf(pipetteColorPicker.j));
            pipetteColorPicker.p = c;
            pipetteColorPicker.q = x;
            pipetteColorPicker.r = y;
            pipetteColorPicker.setColorPipette(c);
        } catch (Throwable th) {
            L.E(th, new Object[0]);
        }
    }

    public static void b(PipetteColorPicker pipetteColorPicker, int i) {
        pipetteColorPicker.setColorPipette(i);
        bwt0.a(pipetteColorPicker.b, true, true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getIndentByX() {
        return ((Number) this.e.getValue()).floatValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final float getIndentByY() {
        return ((Number) this.f.getValue()).floatValue();
    }

    private final void setColorPipette(int i) {
        float indentByX = this.q - getIndentByX();
        View view = this.b;
        view.setX(indentByX);
        view.setY(this.r - getIndentByY());
        this.j = i;
        GradientDrawable gradientDrawable = this.h;
        if (gradientDrawable != null) {
            gradientDrawable.setColor(i);
        }
        GradientDrawable gradientDrawable2 = this.i;
        if (gradientDrawable2 != null) {
            gradientDrawable2.setColor(i);
        }
        izs<? super Integer, s3q0> izsVar = this.k;
        if (izsVar != null) {
            izsVar.invoke(Integer.valueOf(i));
        }
    }

    private final void setDefaultMarginAndScale(View view) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(1.15f, 1.0f, 1.15f, 1.0f, 1, 0.5f, 1, 0.5f);
        scaleAnimation.setFillAfter(true);
        view.startAnimation(scaleAnimation);
        f4m.q(0, view);
    }

    public final int c(Bitmap bitmap, int i, int i2, Integer num) {
        int pixel = bitmap.getPixel(i, i2);
        if (!this.o || num == null) {
            return pixel;
        }
        if (pixel == 0) {
            return num.intValue();
        }
        if (Color.alpha(pixel) >= 255) {
            return pixel;
        }
        int intValue = num.intValue();
        return Color.rgb((int) ((Color.red(intValue) * 1.0f) + (Color.red(pixel) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), (int) ((Color.green(intValue) * 1.0f) + (Color.green(pixel) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), (int) ((Color.blue(intValue) * 1.0f) + (Color.blue(pixel) * UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void d(final Bitmap bitmap, t2l0 t2l0Var, Point point) {
        this.g = bitmap;
        if (t2l0Var != null) {
            this.q = t2l0Var.c;
            this.r = t2l0Var.d;
        } else if (point != null) {
            this.q = point.x;
            this.r = point.y;
        } else {
            this.q = bitmap.getWidth() / 2;
            this.r = (bitmap.getHeight() / 2) + getIndentByY();
        }
        try {
            int c = c(bitmap, (int) this.q, (int) this.r, t2l0Var != null ? Integer.valueOf(t2l0Var.b) : null);
            this.p = c;
            post(new tpa0(this, c, 0));
        } catch (Exception e) {
            float indentByX = this.q - getIndentByX();
            View view = this.b;
            view.setX(indentByX);
            view.setY(this.r - getIndentByY());
            L.E(e, new Object[0]);
        }
        setOnTouchListener(new View.OnTouchListener() { // from class: xsna.spa0
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                PipetteColorPicker.a(PipetteColorPicker.this, bitmap, motionEvent);
                return true;
            }
        });
    }

    @SuppressLint({"ClickableViewAccessibility"})
    public final void e() {
        Bitmap bitmap = this.g;
        if (bitmap != null) {
            bitmap.recycle();
        }
        this.g = null;
        setOnTouchListener(null);
        bwt0.a(this.b, false, true, 0L, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
    }

    public final izs<Integer, s3q0> getColorSelectedListener() {
        return this.k;
    }

    public final int getCurrentColor() {
        return this.p;
    }

    public final izs<t2l0, s3q0> getDoneClickListener() {
        return this.m;
    }

    public final boolean getHasDynamicBackgroundColor() {
        return this.o;
    }

    public final wzs<Integer, Integer, Point> getOnTouchCorrectListener() {
        return this.l;
    }

    public final void setColorSelectedListener(izs<? super Integer, s3q0> izsVar) {
        this.k = izsVar;
    }

    public final void setCurrentColor(int i) {
        this.p = i;
    }

    public final void setDoneClickListener(izs<? super t2l0, s3q0> izsVar) {
        this.m = izsVar;
    }

    public final void setHasDynamicBackgroundColor(boolean z) {
        this.o = z;
    }

    public final void setOnTouchCorrectListener(wzs<? super Integer, ? super Integer, ? extends Point> wzsVar) {
        this.l = wzsVar;
    }

    public final void setScaledPipette(boolean z) {
        this.n = z;
    }
}
