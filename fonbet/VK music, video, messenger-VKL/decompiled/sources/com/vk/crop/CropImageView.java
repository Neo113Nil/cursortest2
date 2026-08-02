package com.vk.crop;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.RectF;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.util.AttributeSet;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import androidx.annotation.Nullable;
import com.unity3d.services.UnityAdsConstants;
import com.vk.crop.b;
import com.vk.crop.c;
import com.vk.crop.g;
import kotlin.NoWhenBranchMatchedException;
import xsna.fq5;
import xsna.ohk;
import xsna.phk;
import xsna.qq2;
import xsna.rp5;

/* loaded from: classes17.dex */
public class CropImageView extends FrameLayout {
    public static final /* synthetic */ int j = 0;
    public final ImageView b;
    public final d c;
    public c.a d;
    public com.vk.crop.b e;
    public Bitmap f;
    public b g;

    @Nullable
    public g.a h;
    public final a i;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class CropViewType {
        private static final /* synthetic */ CropViewType[] $VALUES;
        public static final CropViewType CIRCLE;
        public static final CropViewType RECTANGLE;

        static {
            CropViewType cropViewType = new CropViewType("RECTANGLE", 0);
            RECTANGLE = cropViewType;
            CropViewType cropViewType2 = new CropViewType("CIRCLE", 1);
            CIRCLE = cropViewType2;
            $VALUES = new CropViewType[]{cropViewType, cropViewType2};
        }

        public CropViewType() {
            throw null;
        }

        public static CropViewType valueOf(String str) {
            return (CropViewType) Enum.valueOf(CropViewType.class, str);
        }

        public static CropViewType[] values() {
            return (CropViewType[]) $VALUES.clone();
        }
    }

    public class a extends Handler {
        public a(Looper looper) {
            super(looper);
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (message.what == 0) {
                int i = CropImageView.j;
                CropImageView cropImageView = CropImageView.this;
                cropImageView.c(false, false, false);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.setDuration(300L);
                animatorSet.addListener(new ohk(cropImageView, 0));
                RectF a = cropImageView.c.a(cropImageView.c.getCropAspectRatio());
                float f = a.left;
                float f2 = a.top;
                float f3 = a.right;
                float f4 = a.bottom;
                float f5 = f3 - f;
                float f6 = f4 - f2;
                float max = Math.max(f5 / cropImageView.c.getCropWidth(), f6 / cropImageView.c.getCropHeight());
                float centerX = cropImageView.c.getCenterX();
                float centerY = cropImageView.c.getCenterY();
                float centerX2 = ((f5 / 2.0f) + f) - cropImageView.c.getCenterX();
                float centerY2 = ((f6 / 2.0f) + f2) - cropImageView.c.getCenterY();
                ValueAnimator ofFloat = ValueAnimator.ofFloat(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
                ofFloat.addUpdateListener(new phk(cropImageView, max, new float[]{1.0f}, centerX, centerY, centerX2, centerY2, new float[1], new float[1], cropImageView.e.e.e * max));
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(cropImageView.c, d.b, f);
                AccelerateDecelerateInterpolator accelerateDecelerateInterpolator = qq2.a;
                ofFloat2.setInterpolator(accelerateDecelerateInterpolator);
                ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(cropImageView.c, d.d, f2);
                ofFloat3.setInterpolator(accelerateDecelerateInterpolator);
                ObjectAnimator ofFloat4 = ObjectAnimator.ofFloat(cropImageView.c, d.c, f3);
                ofFloat4.setInterpolator(accelerateDecelerateInterpolator);
                ObjectAnimator ofFloat5 = ObjectAnimator.ofFloat(cropImageView.c, d.e, f4);
                ofFloat5.setInterpolator(accelerateDecelerateInterpolator);
                ofFloat.setInterpolator(accelerateDecelerateInterpolator);
                animatorSet.playTogether(ofFloat2, ofFloat3, ofFloat4, ofFloat5, ofFloat);
                animatorSet.start();
            }
        }
    }

    public interface b {
    }

    public CropImageView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        d hVar;
        this.i = new a(Looper.getMainLooper());
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.a, 0, 0);
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        int i = e.$EnumSwitchMapping$0[(z ? CropViewType.CIRCLE : CropViewType.RECTANGLE).ordinal()];
        if (i == 1) {
            hVar = new h(context);
        } else {
            if (i != 2) {
                throw new NoWhenBranchMatchedException();
            }
            hVar = new com.vk.crop.a(context);
        }
        removeAllViews();
        ImageView imageView = new ImageView(context);
        this.b = imageView;
        imageView.setDrawingCacheEnabled(true);
        this.c = hVar;
        addView(this.b);
        addView(this.c);
    }

    public final void a() {
        this.i.removeMessages(0);
        com.vk.crop.b bVar = this.e;
        if (bVar != null) {
            b.a aVar = bVar.h;
            if (aVar != null) {
                ValueAnimator valueAnimator = aVar.b;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                bVar.h = null;
            }
            this.e.d(false);
        }
    }

    public final void b(Bitmap bitmap, g gVar, boolean z, @Nullable fq5 fq5Var) {
        if (bitmap == null || bitmap.isRecycled()) {
            return;
        }
        this.f = bitmap;
        this.b.getViewTreeObserver().addOnPreDrawListener(new c(this, gVar, z, bitmap, fq5Var));
        this.b.setImageBitmap(bitmap);
    }

    public final void c(boolean z, boolean z2, boolean z3) {
        b bVar = this.g;
        if (bVar != null) {
            rp5.this.m = z3;
        }
        c.a aVar = this.d;
        if (aVar != null) {
            aVar.d = z;
        }
        d dVar = this.c;
        if (dVar != null) {
            dVar.setTouchEnabled(z2);
        }
    }

    public float getBitmapHeight() {
        Bitmap bitmap = this.f;
        return (bitmap == null || bitmap.isRecycled()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f.getHeight();
    }

    public float getBitmapWidth() {
        Bitmap bitmap = this.f;
        return (bitmap == null || bitmap.isRecycled()) ? UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT : this.f.getWidth();
    }

    public com.vk.crop.b getCropController() {
        return this.e;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        com.vk.crop.b bVar;
        com.vk.crop.b bVar2;
        com.vk.crop.b bVar3;
        super.onLayout(z, i, i2, i3, i4);
        float cropWidth = this.c.getCropWidth();
        float x0 = this.c.getX0();
        float y0 = this.c.getY0();
        d dVar = this.c;
        dVar.b(dVar.getCropAspectRatio());
        float cropWidth2 = this.c.getCropWidth();
        float x02 = this.c.getX0();
        float y02 = this.c.getY0();
        if (cropWidth != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (bVar3 = this.e) != null) {
            bVar3.e.a(cropWidth2 / cropWidth, x0, y0, true);
        }
        if (x0 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (bVar2 = this.e) != null) {
            bVar2.e.b(x02 - x0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, true);
        }
        if (y0 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && (bVar = this.e) != null) {
            bVar.e.b(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, y02 - y0, true);
        }
        com.vk.crop.b bVar4 = this.e;
        if (bVar4 != null) {
            bVar4.e();
        }
        a();
    }

    public void setDelegate(b bVar) {
        this.g = bVar;
    }

    public void setGeometryCallback(@Nullable g.a aVar) {
        this.h = aVar;
        com.vk.crop.b bVar = this.e;
        if (bVar != null) {
            bVar.e.l = aVar;
        }
    }

    public void setLinesVisible(boolean z) {
        this.c.setLinesAndTransparentOverlayVisible(z);
    }
}
